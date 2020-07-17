<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!doctype html>
<html lang="en">
  <head>
    <title>Teacher</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/Sakura.js"></script>
    <style>
       #left{
          float: left;
          margin-right: 5px;
          width: 240px;  
          height: 600px;
          background-color: darkgrey;
          box-shadow: 0px 0px 200px #888888;
       }
       #right{
           margin-left: 5px;
           float: left;
           height: 600px; 
           box-shadow: 0px 0px 200px #888888; 
       }
    </style>
  </head>
  <body>

    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <a class="navbar-brand" href="${pageContext.request.contextPath }/indext">Home</a>
        <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#collapsibleNavId" aria-controls="collapsibleNavId"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavId">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="#">你好！ 老师<span class="sr-only">(current)</span></a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
                 <a href="${pageContext.request.contextPath }/loginout">Exit</a>
                </button>
            </form>
        </div>
    </nav>
    
    <div class="d-flex flex-row" style="width: 100%;">
        
        <!--左边-->
        <div id="left" class="container ml-0 west" region="west">
            <div class="container" style="padding-top: 20px;">

                <nav class="navbar navbar-expand-sm bg-dark navbar-dark ">
    
                  <!-- Links -->
                  <ul class="navbar-nav  flex-column">
                    <li class="nav-item ">
                        <a class="nav-link " href="${pageContext.request.contextPath }/teapwd" id="navbardrop" >
                        修改密码
                        </a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link" href="${pageContext.request.contextPath }/teaTostu" id="navbardrop" >
                        学生成绩
                        </a>
                        
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link" href="${pageContext.request.contextPath }/teaUpstu" id="navbardrop" >
                        学生信息
                        </a>
                       
                    </li>                  
                    </ul>
                </nav>
                
            </div>

        </div>

        <!--右边-->
        <div id="right" class="container mr-0 bg-light" >
            <div class="mx-3">
                <h3 class="text-dark">欢迎 进入学生成绩管理系统</h3>
                <h5 class="text-muted ml-5">你好！${Tea_SESSION.tname }老师</h5>
            </div>
            
            <!-- 修改-->
            
            <div class="container">
                
                <div class="container" >
                    <div class="container">
                        <h3 class="mt-3">修改学生信息</h3>
                        <c:if test="${not empty msg }">
                        	<script type="text/javascript">
                        		alert("${msg}");
                        	</script>
                        </c:if>
                        <form action="${pageContext.request.contextPath }/teaUpdatecg" method="POST">
                          <div class="form-group">
                            <label>学号:</label>
                            <input type="text" class="form-control" name="sno" value="${updstu.sno }" readonly="readonly" >
                          </div>                   
                          <div class="form-group">
                            <label>姓名:</label>
                            <input type="text" class="form-control" name="sname" value="${updstu.sname }" readonly="readonly" >
                          </div>
                          <div class="form-group">
                            <label>成绩:</label>
                            <input type="text" class="form-control"   name="score1" value="${updstu.score }" >
                          </div>
                          
                          <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div> 


        </div>

        <div style="clear:both"></div>
    </div>
    
    <footer>
        <div id="footer" class="container">
            <nav class="navbar navbar-default navbar-fixed-bottom">
                
                    <p class="text-muted credit" style="padding: 10px; text-align: center;">
                        Copyright © 1833140210
                    </p>                
            </nav>           
        </div>
    </footer>

  </body>
</html>