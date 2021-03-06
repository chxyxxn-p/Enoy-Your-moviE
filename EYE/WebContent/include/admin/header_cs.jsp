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
                <button class="main_nav">수동 관리<i class="fa fa-caret-down"></i></button>
                <div class="sub_nav">
                    <a href="/admin/user">회원 관리</a>
                    <a href="/admin/ticket">티켓 관리</a>
                </div>
            </div>
            
            <div class="nav">
                <button class="main_nav">서비스 관리<i class="fa fa-caret-down"></i></button>
                <div class="sub_nav">
                    <a href="/admin/notice">공지/이벤트 관리</a>
                    <a href="/admin/qna">서비스 Q&A 관리</a>
                    <a href="/admin/goods">매점/MD 관리(오픈준비중)</a>
                </div>
            </div>
            
            <div class="nav">
                <button class="main_nav">리뷰 관리<i class="fa fa-caret-down"></i></button>
            </div>
        </div>
        
</div>
