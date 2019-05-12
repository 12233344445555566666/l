#!/usr/bin/env perl
use CGI':standard';
print"Content-type:text/html\n\n";
print"server name:$ENV{'SERVER_NAME'}<br>";
print"Running on port:$ENV{'SERVER_PORT'}<br>";
print"Server Software:$ENV{'SERVER_SOFTWARE'}<br>";
print"CGI Revision:$ENV{'GATEWAY_INTERFACE'}<br>";