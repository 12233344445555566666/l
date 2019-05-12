<?php
$con = mysql_connect("localhost","viis102","viis102");
if (!$con)
{
die('Could not connect: ' . mysql_error());
}
mysql_select_db("6isb5", $con);
$sql="INSERT INTO 6isb5.sata102 VALUES('$_POST[accno]','$_POST[title]','$_POST[author]','$_POST[edition]','$_POST[publisher]')";
if (!mysql_query($sql,$con))
{
die('Error: ' . mysql_error());
}
echo "1 Record Added";
mysql_close($con);
?>