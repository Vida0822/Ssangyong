<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>    
    

<div id="content">
	<h2>공지사항</h2>
	<h3 class="hidden">방문페이지위치</h3>
	<ul id="breadscrumb" class="block_hlist">
		<li>HOME</li>
		<li>
			고객센터
		</li>
		<li>
			공지사항등록
		</li>
	</ul>
	<form action="/customer/noticeReg.htm?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
		<div id="notice-article-detail" class="article-detail margin-large" >						
			<dl class="article-detail-row">
				<dt class="article-detail-title">
					제목
				</dt>
				<dd class="article-detail-data">
					&nbsp;<input name="title"/>
				</dd>
			</dl>				
									
			<dl class="article-detail-row">
				<dt class="article-detail-title">
					첨부파일
				</dt>
				<dd class="article-detail-data">
					&nbsp;<input type="file" id="txtFile" name="file" />
					<!-- &nbsp;<input type="file" id="txtFile" name="file" multiple="multiple" /> -->
				</dd>
			</dl>

			<div class="article-content" >
				<textarea id="txtContent" class="txtContent" name="content"></textarea>
			</div>
			
		</div>
		<p class="article-comment margin-small">						
			<input class="btn-save button" type="submit" value="저장" />
			<a class="btn-cancel button" href="notice.htm">취소</a>						
		</p>
		<!-- post 방식 요청에는 항상 필요 : 요청 위조 방지 -->
		<%-- <input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }"> --%>
	</form>		
	
	<div>
     <ol>
       <li>principal : <sec:authentication property="principal"/></li>
       <!-- CustomUser의 member 필드 -->
       <li>MemberVO : <sec:authentication property="principal.member"/></li>
       <li>사용자 ID : <sec:authentication property="principal.member.id"/></li>
       <li>사용자 이름 : <sec:authentication property="principal.member.name"/></li>
       <li>사용자 권한 목록 : <sec:authentication property="principal.member.authList"/></li>
     </ol>
   </div>	
	
						
</div>				
