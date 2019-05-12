#!/usr/bin/perl
# implementing a
use CGI':standard';
print "refresh:60 \n";

($s,$m,$h)=localtime(time);
print header();
$h-=5;
$webmaster="viis102";

if ($h<6) {print  h1("Mornin'$webmaster Have a great day :) Now the time is $h hr $m mins!!");}
elsif ($h=>6 & $h<12) {print h1("Good morning $webmaster ! Now the time is $h hr $m mins!!");}
elsif ($h=>12 & $h<17) {print h1("Good afternoon $webmaster ! Now the time is $h hr $m mins!!");}
elsif ($h=>17 & $h<22) {print h1("Good evening $webmaster ! Now the time is $h hr $m mins!!");}
else {print h1("Go to bed $webmaster ! Now the time is $h hr $m mins!!");}

open(check,"w -h $webmaster|");
if(<check>=~/$webmaster/)
{
print " Currently WM logged in";
}
else
{
print " Currently WM not logged in";
}