
<?php
 $itm=60*60*24*60+time();
 setcookie('last_visit',date("G:i -m/d/y"),$itm);
 if(isset($_COOKIE['last_visit'])) {
        $visit=$_COOKIE['last_visit'];
        echo "Your last visit was- " .$visit;
    }
    else {
 echo "You have some stale cookies!" ;
    }
 ?>