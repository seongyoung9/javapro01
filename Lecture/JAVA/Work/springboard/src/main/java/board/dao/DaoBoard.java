package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IBoard;
import board.model.ModelArticle;
import board.model.ModelAttachfile;
import board.model.ModelBoard;
import board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard {
	

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession session;

	@Override
	public String getBoardName(String boardcd) throws Exception {
		String result = null;
		result = session.selectOne("mapper.mapperBoard.getBoardName",boardcd);
		return result;
	}

	@Override
	public List<ModelBoard> getBoardOne(String boardcd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelBoard> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(ModelBoard board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(ModelBoard updateValue, ModelBoard searchValue) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(ModelBoard board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBoardTotalRecord(ModelBoard board, String searchWord) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ModelBoard> getBoardPaging(ModelBoard board, String searchWord, int start, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoardList(String boardcd, String boardnm, Boolean UseYN) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getArticleTotalRecord(String board, String searchWord) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelArticle> getArticle(int articleno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertArticle(ModelArticle article) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateArticle(ModelArticle updateValue, ModelArticle searchValue) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteArticle(ModelArticle article) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int increaseHit(int articleno) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ModelArticle> getNextArticle(String boardcd, Integer articleno, String searchWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelArticle> getPrevArticle(String boardcd, Integer articleno, String searchWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelAttachfile> getAttachFileList(int attachFileNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertAttachFile(ModelAttachfile Attachfile) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAttachFile(ModelAttachfile Attachfile) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ModelComments getComment(int commentNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelComments> getCommentList(int articleno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertComment(ModelComments comments) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateComment(ModelComments updateValue, ModelComments searchValue) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteComment(ModelComments comments) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
