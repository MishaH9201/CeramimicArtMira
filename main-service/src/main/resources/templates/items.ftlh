<!DOCTYPE html>
<html>
<head>
    <title>Items</title>
</head>
<body>
<h1>Искусство</h1><hr>
<h4>Маринкино Искуство</h4>
<#list items as item>
    <div>
        <p><b>${item.name}</b> ${item.description} </p>
    </div>
</#list>
</body>
</html>