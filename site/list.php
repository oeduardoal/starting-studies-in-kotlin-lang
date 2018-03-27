<?php 

$files = glob("{*.apk}", GLOB_BRACE);

$dir = __DIR__;

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Team Kotlin">

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
                <li>
                    <a href="index.php">Dashboard</a>
                </li>
                <li class="active">
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
                <p>This is a little list of apks development by team <b>Kotlin Lang</b></p>
                <p>College Unichristus.</p>
                <p>Information Systems - 2ª Semester</p>
                <div class="row">
                    <div class="col">
                        <h3>Apps Developed:</h3>
                        <?php 
                        foreach ($files as $value): 
                            ?>

                            <a class='btn btn-link' href="<?php echo $value; ?>" title="<?php echo $value; ?>">
                                <?php echo $value; ?>
                            </a>

                        <?php endforeach; ?>
                    </div>
                </div>
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
