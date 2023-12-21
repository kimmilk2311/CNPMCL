<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Web Kê Đơn Thuốc</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh; /* 100% of the viewport height */
            margin: 0;
            background-color: #FAEED1;
        }

        .container {
            text-align: center;
        }

        h1 {
            margin-bottom: 30px;
        }

        .btn-group {
            display: flex;
            justify-content: center;
        }

        .btn-group .btn {
            margin: 0 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="mt-3">Web kê đơn thuốc</h1>

        <div class="btn-group">
            <form action="/PatientServlet" method="post">
            <input type="submit" class="btn btn-success btn-lg" name="signin" id="signin" class="form-submit" value="Thong tin ca nhan"/>
            </form>
            <a href="PrescriptionDetail.jsp" class="btn btn-success btn-lg">Chi tiết đơn thuốc</a>
        </div>

        <!-- Your content goes here -->
    </div>

    <!-- Bootstrap JS and other scripts can be added here -->
</body>
</html>
