#!/usr/bin/perl
use CGI ':standard';
print"content-type:text/html\n\n";

open (FILE,"<count.txt");
$count=<FILE>;
close(FILE);
$count++;

open(FILE,">count.txt");
print FILE "$count";
print("This page has been viewed $count times");
close(FILE);

