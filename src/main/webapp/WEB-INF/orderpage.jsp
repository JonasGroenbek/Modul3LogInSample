<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>

        <form name="createorder" action="FrontController" method="POST">
            <input type="hidden" name="command" value="createorder">
            Choose Material:
            <br>
            <select name="material">
                <option value="1">material1</option>
                <option value="2">material2</option>
            </select>
            <br>
            Choose type of roof:
            <br>
            <select name="roof">
                <option value="1">roof1</option>
                <option value="2">roof2</option>
            </select>
            <br>
            Length of shed:<br>
            <input type="text" name="lengthShed" value="Meters">
            <br>
            Width of shed:<br>
            <input type="text" name="widthShed" value="Meters">
            <br>
            Length:<br>
            <input type="text" name="length" value="Meters">
            <br>
            Height:<br>
            <input type="text" name="height" value="Meters">
            <br>
            Width:<br>
            <input type="text" name="width" value="Meters">
            <br>
            Would you like to build it yourself ?:<br>
            <input type="text" name="assemble" value="0 for no 1 for yes">
            <br>
            <input type="submit" value="Submit">
        </form>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
