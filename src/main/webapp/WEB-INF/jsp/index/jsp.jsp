<html>
<head>
<title>VRaptor + Scala (JSP View)</title>
</head>
<body>
${myModel.data}

<form action="." method="post">
	<label for="field">Type anything here:</label>
	<input type="text" id="field" name="myModel.data" value="test" />
	<input type="submit" />
</form>
</body>
</html>
