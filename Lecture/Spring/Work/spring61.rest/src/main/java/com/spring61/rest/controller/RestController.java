package com.spring61.rest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring61.rest.inf.IServiceBoard;
import com.spring61.rest.inf.IServiceUser;
import com.spring61.rest.model.ModelArticle;
import com.spring61.rest.model.ModelAttachFile;
import com.spring61.rest.model.ModelBoard;
import com.spring61.rest.model.ModelComments;
import com.spring61.rest.model.ModelUser;

@Controller
@RequestMapping(value = "/rest")
public class RestController {

	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	// ServiceUser 인스턴스 만들기
	@Autowired
	IServiceUser usersvr;

	// url은 소문자로
	// http://localhost:8080/rest/curtime
	@RequestMapping(value = "/curtime", method = { RequestMethod.GET })
	@ResponseBody
	public long curtime(Model model) {
		logger.info("/rest/curtime");

		return new Date().getTime();
	}

	@RequestMapping(value = "/insertuser", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int insertuser(@RequestBody ModelUser user) {
		logger.info("/rest/insertuser");

		return usersvr.insertUser(user);
	}

	// http://localhost:8080/rest/login
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelUser login(String userid, String passwd) {
		// userid : 클라이언트에서 넘겨 받은 값
		// passwd : 클라이언트에서 넘겨 받은 값
		logger.info("/rest/login");

		return usersvr.login(userid, passwd);
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int logout(String userid) {
		logger.info("/rest/logout");

		return usersvr.logout(userid);
	}

	@RequestMapping(value = "/updateuserinfo", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int updateuserinfo(@RequestBody Map<String, ModelUser> maps) {
		logger.info("/rest/updateuserinfo");
		
		ModelUser setValue = maps.get("setValue");
		ModelUser whereValue = maps.get("whereValue");

		return usersvr.updateUserInfo(setValue,whereValue);
	}

	@RequestMapping(value = "/updatepasswd", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int updatepasswd(String userid, String currentPasswd, String newPasswd) {
		logger.info("/rest/updatepasswd");

		return usersvr.updatePasswd(userid, currentPasswd, newPasswd);
	}

	// http://localhost:8080/rest/selectuserlist
	@RequestMapping(value = "/updateretire", method = { RequestMethod.GET , RequestMethod.POST })
	@ResponseBody
	public int updateretire( @RequestBody ModelUser user ) {
		logger.info("/rest/updateretire");

		return usersvr.updateRetire(user);
	}

	@RequestMapping(value = "/selectuserone", method = { RequestMethod.GET , RequestMethod.POST })
	@ResponseBody
	public ModelUser selectuserone( @RequestBody ModelUser user) {
		logger.info("/rest/selectuserone");

		return usersvr.selectUserOne(user);
	}

	// http://localhost:8080/rest/selectuserlist
	@RequestMapping(value = "/selectuserlist", method = { RequestMethod.GET, RequestMethod.POST  })
	@ResponseBody
	public List<ModelUser> selectuserlist( @RequestBody ModelUser user) {
		logger.info("/rest/selectuserlist");

		return usersvr.selectUserList(user);
	}

	@RequestMapping(value = "/checkuserid", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int checkuserid(String userid) {
		logger.info("/rest/checkuserid");

		return usersvr.checkuserid(userid);
	}
	
	@Autowired
	IServiceBoard boardsvr;
	
	@RequestMapping(value = "/getboardname", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String getboardname( String boardcd ) {
		// 서버와 클라이언트의 변수명이 같을시 requstparam을 안써도됨
		logger.info("/rest/getboardname");

		return boardsvr.getBoardName(boardcd);
	}

	@RequestMapping(value = "/getboardone", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelBoard getboardone(@RequestParam("cd") String boardcd) {
		logger.info("/rest/getboardone");

		return boardsvr.getBoardOne(boardcd);
	}
	
	@RequestMapping(value = "/getboardtotalrecord", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int getboardtotalrecord( String searchWord ) {
		logger.info("/rest/getboardtotalrecord");

		return boardsvr.getBoardTotalRecord(searchWord);
	}
	
	@RequestMapping(value = "/getboardpaging", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelBoard> getboardpaging( String boardcd, 
											String searchWord, 
											@RequestParam(defaultValue = "0") int start, 
											@RequestParam(defaultValue = "10")int end ) {
		logger.info("/rest/getboardpaging");

		return boardsvr.getBoardPaging( boardcd,searchWord,start,end );
	}
	
	@RequestMapping(value = "/getboardlist", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelBoard> getboardlist( String searchWord ) {
		logger.info("/rest/getboardlist");

		return boardsvr.getBoardList(searchWord);
	}
	
	@RequestMapping(value = "/insertboard", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int insertboard( @RequestBody ModelBoard board ) {
		logger.info("/rest/insertboard");

		return boardsvr.insertBoard(board);
	}
	
	@RequestMapping(value = "/updateboard", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int updateboard( @RequestBody ModelBoard setValue, @RequestBody ModelBoard whereValue ) {
		logger.info("/rest/updateboard");

		return boardsvr.updateBoard(setValue,whereValue);
	}
	
	@RequestMapping(value = "/deleteboard", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int deleteboard( @RequestBody ModelBoard board ) {
		logger.info("/rest/deleteboard");

		return boardsvr.deleteBoard(board);
	}
	
	@RequestMapping(value = "/insertboardlist", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int insertboardlist( @RequestBody List<ModelBoard> list ) {
		logger.info("/rest/insertboardlist");

		return boardsvr.insertBoardList(list);
	}
	
	@RequestMapping(value = "/getarticletotalrecord", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int getarticletotalrecord( String boardcd, String searchWord ) {
		logger.info("/rest/getarticletotalrecord");

		return boardsvr.getArticleTotalRecord( boardcd,searchWord );
	}
	
	@RequestMapping(value = "/getarticlelist", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelArticle> getarticlelist( 	String boardcd, 
												String searchWord, 
												@RequestParam(defaultValue = "0") int start, 
												@RequestParam(defaultValue = "10")int end   ) {
		logger.info("/rest/getarticlelist");

		return boardsvr.getArticleList( boardcd,searchWord,start,end);
	}
	
	@RequestMapping(value = "/getarticle", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelArticle getarticle( @RequestParam(defaultValue = "0") int articleno ) {
		logger.info("/rest/getarticle");

		return boardsvr.getArticle( articleno );
	}
	
	@RequestMapping(value = "/insertarticle", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int insertarticle( @RequestBody ModelArticle article ) {
		logger.info("/rest/insertarticle");

		return boardsvr.insertArticle( article );
	}
	
	@RequestMapping(value = "/updatearticle", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int updatearticle( @RequestBody ModelArticle setValue, @RequestBody ModelArticle whereValue ) {
		logger.info("/rest/updatearticle");

		return boardsvr.updateArticle( setValue,whereValue );
	}
	
	@RequestMapping(value = "/deletearticle", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int deletearticle( @RequestBody ModelArticle article ) {
		logger.info("/rest/deletearticle");

		return boardsvr.deleteArticle( article );
	}
	
	@RequestMapping(value = "/increasehit", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int increasehit( @RequestParam(defaultValue = "0") int articleno ) {
		logger.info("/rest/increasehit");

		return boardsvr.increaseHit( articleno );
	}
	
	@RequestMapping(value = "/getnextarticle", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelArticle getnextarticle( @RequestParam(defaultValue = "0") int articleno, 
																 String boardcd, 
																 String searchWord ) {
		logger.info("/rest/getnextarticle");

		return boardsvr.getNextArticle( articleno,boardcd,searchWord );
	}
	
	@RequestMapping(value = "/getprevarticle", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelArticle getprevarticle( @RequestParam(defaultValue = "0") int articleno, 
																 		  String boardcd, 
																 		  String searchWord ) {
		logger.info("/rest/getprevarticle");

		return boardsvr.getPrevArticle( articleno,boardcd,searchWord );
	}
	
	@RequestMapping(value = "/getattachfile", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelAttachFile getattachfile( @RequestParam(defaultValue = "0") int attachFileNo ) {
		logger.info("/rest/getattachfile");

		return boardsvr.getAttachFile( attachFileNo );
	}
	
	@RequestMapping(value = "/getattachfilelist", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelAttachFile> getattachfilelist( @RequestParam(defaultValue = "0") int articleno ) {
		logger.info("/rest/getattachfilelist");

		return boardsvr.getAttachFileList( articleno );
	}
	
	@RequestMapping(value = "/insertattachfile", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int insertattachfile( @RequestBody ModelAttachFile attachFile ) {
		logger.info("/rest/insertattachfile");

		return boardsvr.insertAttachFile( attachFile );
	}
	
	@RequestMapping(value = "/deleteattachfile", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int deleteattachfile( @RequestBody ModelAttachFile attachFile ) {
		logger.info("/rest/deleteattachfile");

		return boardsvr.deleteAttachFile( attachFile );
	}
	
	@RequestMapping(value = "/getcomment", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public ModelComments getcomment( @RequestParam(defaultValue = "0") int commentNo ) {
		logger.info("/rest/getcomment");

		return boardsvr.getComment( commentNo );
	}
	
	@RequestMapping(value = "/getcommentlist", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelComments> getcommentlist( @RequestParam(defaultValue = "0") int articleno ) {
		logger.info("/rest/getcommentlist");

		return boardsvr.getCommentList( articleno );
	}
	
	@RequestMapping(value = "/insertcomment", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int insertcomment( @RequestBody ModelComments comment ) {
		logger.info("/rest/insertcomment");

		return boardsvr.insertComment( comment );
	}
	
	@RequestMapping(value = "/updatecomment", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int updatecomment( @RequestBody ModelComments setValue, @RequestBody ModelComments whereValue ) {
		logger.info("/rest/updatecomment");

		return boardsvr.updateComment( setValue,whereValue );
	}
	
	@RequestMapping(value = "/deletecomment", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public int deletecomment( @RequestBody ModelComments comment ) {
		logger.info("/rest/deletecomment");

		return boardsvr.deleteComment( comment );
	}
	
	
}
