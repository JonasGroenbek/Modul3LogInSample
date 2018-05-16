package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.Shed;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userID = user.getId();
        int material = Integer.parseInt(request.getParameter("material"));
        int roof = Integer.parseInt(request.getParameter("roof"));
        int lengthShed = Integer.parseInt(request.getParameter("lengthShed"));
        int widthShed = Integer.parseInt(request.getParameter("widthShed"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = 300;

        Shed shed = new Shed(lengthShed, widthShed, 500);
        SVGBuilderTop svgTop = new SVGBuilderTop(roof, length, width, shed, material);
        SVGBuilderSide svgSide = new SVGBuilderSide(roof, length, width, shed, material);
        session.setAttribute("SVGTopView", svgTop.buildSvgTopView(svgTop));
        session.setAttribute("SVGSideView", svgSide.buildSvgSideView(svgTop));
        Order order = new Order(length, width, height);

        int shedID = LogicFacade.createShed(shed, userID);
        LogicFacade.createOrder(userID, 500, order, material, roof, shedID);

        return "placedorderpage";

    }
}
