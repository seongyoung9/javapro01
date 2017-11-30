package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IBoard;
import board.inf.IServiceBoard;
import board.inf.IUser;
import board.model.ModelArticle;
import board.model.ModelAttachfile;
import board.model.ModelBoard;
import board.model.ModelComments;

@Service("serviceboard")
public class ServiceBoard implements IServiceBoard {

	@Autowired
	@Qualifier("daoboard")
	private IBoard dao; 
	
	@Override
	public String getBoardName(String boardcd) throws Exception {

		String result = null;
		
		try {
			result = dao.getBoardName(boardcd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public ModelBoard getBoardOne(String boardcd) throws Exception {
		ModelBoard result = null;
		
		try {
			result = dao.getBoardOne(boardcd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ModelBoard> getBoardList() throws Exception {
		List<ModelBoard> result = null;
		try {
			result = dao.getBoardList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int insertBoard(ModelBoard board) throws Exception {
		int result = -1;
		try {
			result = dao.insertBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateBoard(ModelBoard updateValue, ModelBoard searchValue) throws Exception {
		int result = -1;
		try {
			result = dao.updateBoard(updateValue, searchValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteBoard(ModelBoard board) throws Exception {
		int result = -1;
		try {
			result = dao.deleteBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
		List<ModelBoard> result = null;
		try {
			result = dao.getBoardSearch(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int getBoardTotalRecord(String board, String searchWord) throws Exception {
		int result = -1;
		try {
			result = dao.getBoardTotalRecord(board, searchWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ModelBoard> getBoardPaging(String boardcd, String boardnm, int start, int end) throws Exception {
		List<ModelBoard> result = null;
		try {
			result = dao.getBoardPaging(boardcd, boardnm, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int insertBoardList(List<ModelBoard> list) throws Exception {
		int result = -1;
		try {
			result = dao.insertBoardList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int getArticleTotalRecord(String board, String searchWord) throws Exception {
		int result = -1;
		try {
			result = dao.getArticleTotalRecord(board, searchWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelArticle getArticle(int articleno) throws Exception {
		ModelArticle result = null;
				 try {
					         dao.increaseHit(articleno);
					result = dao.getArticle (articleno);
				} catch (Exception e) {
					e.printStackTrace();
				}
		return result;
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
