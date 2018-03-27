<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Kotlin</title>

    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link href="css/simple-sidebar.css" rel="stylesheet">
    <link href="css/css.css" rel="stylesheet">

</head>

<body>

    <div id="wrapper">


        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="index.php">
                        Kotlin Lang
                    </a>
                </li>
                <li class="active">
                    <a href="index.php">Dashboard</a>
                </li>
                <li>
                    <a href="list.php">Apks</a>
                </li>
                <!-- <li>
                    <a href="#">Overview</a>
                </li>
                <li>
                    <a href="#">Events</a>
                </li>
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li> -->
            </ul>
        </div>

        <div id="page-content-wrapper">
            <div class="container-fluid">
                <h1>APKs</h1>
                <p>This is a little list of apks development by team <b>Kotlin</b></p>
                <p>College Unichristus.</p>
                <p>Information Systems - 2ª Semester</p>
                <!-- <a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Toggle Menu</a> -->
            </div>
        </div>
    </div>
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <script>
        $(document).ready(function() {
            setTimeout(toog, 50);
        });

        function toog() {
            $("#wrapper").toggleClass("toggled");
        }
    </script>

</body>

</html>
