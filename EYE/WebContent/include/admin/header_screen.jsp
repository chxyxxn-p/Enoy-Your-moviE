<%@page import="com.eye.domain.Admin"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%Admin admin = (Admin) session.getAttribute("loginAdmin"); %>
<!-- header -->
<div class="header">
    <a href="#default" class="logo">
    <img src="http://img.cgv.co.kr/R2014/images/title/h1_cgv.png">
    <b>관리자 모드</b><%if(admin != null) %><%=admin.getName()%>
    </a>
    
        <div class="header_nav">
        
              <div class="nav">
                <button class="main_nav">영화 관리<i class="fa fa-caret-down"></i></button>
                <div class="sub_nav">
                    <a href="/admin/movie">영화</a>
                    <a href="/admin/movie/list">영화 장르</a>
                </div>
            </div>
        
            <div class="nav">
                <button class="main_nav">상영관 관리<i class="fa fa-caret-down"></i></button>
                <div class="sub_nav">
                    <a href="/admin/movie">지점</a>
                    <a href="/admin/theater">지점 별 상영관</a>
                </div>
            </div>
        </div>
        
</div>
