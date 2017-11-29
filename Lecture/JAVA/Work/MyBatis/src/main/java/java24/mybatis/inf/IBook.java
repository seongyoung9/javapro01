package java24.mybatis.inf;

import java.util.Date;
import java.util.List;

import java24.mybatis.model.ModelBook;

public interface IBook {
	
	int getCount() throws Exception;
	int getMaxBookid() throws Exception;
	List<ModelBook> selectAll(ModelBook book) throws Exception;
	List<ModelBook> selectLike(ModelBook book) throws Exception;
	List<ModelBook> selectEqual(ModelBook book) throws Exception;
	int insert(ModelBook book) throws Exception;
	int insertMap(String bookname, Date dtm, int authid) throws Exception;
	int updateBook(ModelBook wherebook, ModelBook setbook ) throws Exception;
	int deleteBook(ModelBook book) throws Exception;
	List<ModelBook> selectDynamic(ModelBook book) throws Exception;

}
