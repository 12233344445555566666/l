#!/usr/bin/perl
use CGI':standard';
        print"content-type:text/html\n\n";
        $prime=param('com');
        $prime=$prime+0;

        $count=0;

        for( $i=1; $i<=$prime; $i=$i+1)
        {
                if($prime%$i==0)
                {
                        $count++;
                }
        }
        if($count==2)
        {
                print"$prime is prime";
        }
        else
        {
                print"Not prime";
        }
