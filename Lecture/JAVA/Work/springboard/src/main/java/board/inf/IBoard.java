package board.inf;

import java.util.List;

import board.model.ModelArticle;
import board.model.ModelAttachfile;
import board.model.ModelBoard;
import board.model.ModelComments;

public interface IBoard {
	
	String getBoardName(String boardcd) throws Exception;
	ModelBoard getBoardOne(String boardcd) throws Exception;
	List<ModelBoard> getBoardList() throws Exception;
	int insertBoard(ModelBoard board) throws Exception;
	int updateBoard(ModelBoard updateValue, ModelBoard searchValue) throws Exception;
	int deleteBoard(ModelBoard board) throws Exception;
	List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception;
	int getBoardTotalRecord(String board, String searchWord) throws Exception;
	List<ModelBoard> getBoardPaging(String boardcd, String boardnm, int start, int end) throws Exception;
	int insertBoardList(List<ModelBoard> list) throws Exception;
	int getArticleTotalRecord(String board, String searchWord) throws Exception;
	List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) throws Exception;
	ModelArticle getArticle(int articleno) throws Exception;
	int insertArticle(ModelArticle article) throws Exception;
	int updateArticle(ModelArticle updateValue, ModelArticle searchValue) throws Exception;
	int deleteArticle(ModelArticle article) throws Exception;
	int increaseHit(int articleno) throws Exception;
	List<ModelArticle> getNextArticle(String boardcd, Integer articleno, String searchWord) throws Exception;
	List<ModelArticle> getPrevArticle(String boardcd, Integer articleno, String searchWord) throws Exception;
	ModelAttachfile getAttachFile(int attachFileNo) throws Exception;
	List<ModelAttachfile> getAttachFileList(int attachFileNo) throws Exception;
	int insertAttachFile(ModelAttachfile Attachfile) throws Exception;
	int deleteAttachFile(ModelAttachfile Attachfile ) throws Exception;
	ModelComments getComment(int commentNo) throws Exception;
	List<ModelComments> getCommentList(int articleno) throws Exception;
	int insertComment(ModelComments comments) throws Exception;
	int updateComment(ModelComments updateValue, ModelComments searchValue) throws Exception;
	int deleteComment(ModelComments comments) throws Exception;
	
	
}
 