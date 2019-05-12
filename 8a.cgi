#!/usr/bin/perl
use CGI ':standard';
print"content-type:text/html\n\n";

$input=param("username");
@msg=("Hello!","What's up?","How are you?");
$i=int rand scalar @msg;
print"hi,$input, </br>message:",$msg[$i];

