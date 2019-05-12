#!/usr/bin/perl
sub large
{
if($a>$b)
{
if($a>$c)
{
print"$a is largest";
}
else
{
print"$c is largest";
}
}
else
{
if($b>$c)
{
print"$b is largest";
}
else
{
print"$c is largest";
}
}
}

print"Enter the first parameter: ";
$a=<stdin>;
print"Enter the second parameter: ";
$b=<stdin>;
print"Enter the third parameter: ";
$c=<stdin>;
large($a,$b,$c);