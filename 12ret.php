<?php
$con = mysql_connect("localhost","viis102","viis102");
if (!$con)
{
die('Could not connect: ' . mysql_error());
}
mysql_select_db("6isb5", $con);
$sql="SELECT * FROM 6isb5.sata102 WHERE Title='$_POST[title]'";
$result=mysql_query($sql,$con);
echo "<table border='1'>
<tr>
<th>Access No</th>
<th>Title</th>
<th>Author</th>
<th>Edition</th>
<th>Publication</th>
</tr>";
while($row = mysql_fetch_array($result))
{
echo "<tr><td>" . $row['accno'] . "</td>";
echo "<td>" . $row['title'] . "</td>";
echo "<td>" . $row['author'] . "</td>";
echo "<td>" . $row['edition'] . "</td>";
echo "<td>" . $row['publisher'] . "</td></tr>";
}
echo "</table>";
mysql_close($con);
?>