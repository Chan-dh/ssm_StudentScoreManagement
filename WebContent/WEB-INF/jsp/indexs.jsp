<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>学生页面</title>
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
       .carousel-inner img {
         width: 100%;
         height: 100%;
        }
    </style>
  </head>
  <body>

    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <a class="navbar-brand" href="#">Home</a>
        <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#collapsibleNavId" aria-controls="collapsibleNavId"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavId">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="#">你好！ 同学<span class="sr-only">(current)</span></a>
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
	                        <a class="nav-link " href="${pageContext.request.contextPath }/stupwd" id="navbardrop" >
	                        	修改密码
	                        </a>
	                    </li>
	
	                    <li class="nav-item dropdown">
	                        <a class="nav-link " href="${pageContext.request.contextPath }/stuinfo" id="navbardrop" >
	                        	查询成绩
	                        </a>
	                        
                        </li>
                                     
                    </ul>
                </nav>
                
            </div>

        </div>

        <!--右边-->
        <div id="right" class="container mr-0 bg-light" >
            <div class="container mt-3" >
                    <div>
                        <h3 class="text-dark">欢迎 进入学生成绩管理系统</h3>
                        <h5 class="text-muted ml-5">你好！ ${Stu_SESSION.sname }同学</h5>
                    </div>
                    <!--轮播-->
                    <div class="container">
                        <div id="demo" class="carousel slide" data-ride="carousel">
 
                            <!-- 指示符 -->
                            <ul class="carousel-indicators">
                              <li data-target="#demo" data-slide-to="0" class="active"></li>
                              <li data-target="#demo" data-slide-to="1"></li>
                              <li data-target="#demo" data-slide-to="2"></li>
                            </ul>
                           
                            <!-- 轮播图片 -->
                            <div class="carousel-inner">
                              <div class="carousel-item active">
                                <img src="https://static.runoob.com/images/mix/img_fjords_wide.jpg">
                              </div>
                              <div class="carousel-item">
                                <img src="https://static.runoob.com/images/mix/img_nature_wide.jpg">
                              </div>
                              <div class="carousel-item">
                                <img src="https://static.runoob.com/images/mix/img_mountains_wide.jpg">
                              </div>
                            </div>
                           
                            <!-- 左右切换按钮 -->
                            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                              <span class="carousel-control-prev-icon"></span>
                            </a>
                            <a class="carousel-control-next" href="#demo" data-slide="next">
                              <span class="carousel-control-next-icon"></span>
                            </a>
                           
                          </div>
                    </div>
                    
                    <!--实现每日一言-->                 
                    <div class="container my-5 text-center">
                                        
                        <strong>每日一言：
                        <div id="hitokoto" class="text-success" style="font-size:16px;">:D 获取中...</div>
                        </strong> 
                        <script src="https://cdn.jsdelivr.net/npm/bluebird@3/js/browser/bluebird.min.js"></script>
                        <script src="https://cdn.jsdelivr.net/npm/whatwg-fetch@2.0.3/fetch.min.js"></script>
                        <!--End-->
                        
                        <script>
                        fetch('https://v1.hitokoto.cn')
                            .then(function (res){
                            return res.json();
                            })
                            .then(function (data) {
                            var hitokoto = document.getElementById('hitokoto');
                            hitokoto.innerText = data.hitokoto; 
                            })
                            .catch(function (err) {
                            console.error(err);
                            })
                        </script>                           
                    </div>
            </div>

        </div>

        <div style="clear:both"></div>
    </div>
    
    <footer>
        <div id="footer" class="container">
            <nav class="navbar navbar-default navbar-fixed-bottom">
                
                    <p class="text-muted credit" style="padding: 10px; text-align: center;">
                        Copyright © 1833140201
                    </p>
                
            </nav>

            
        </div>

    </footer>
    
   
  </body>
</html>