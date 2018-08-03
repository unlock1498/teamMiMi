package notice.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import notice.exception.NoticeException;
import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;

public class NoticeService {
	public NoticeService(){}
	
	public ArrayList<Notice> selectList() throws NoticeException {
		ArrayList<Notice> list = null;
		Connection con = getConnection();
		list = new NoticeDao().selectList(con);
		close(con);
		
		return list;
	}

	public Notice selectNotice(int noticeNo) throws NoticeException{
		Connection con = getConnection();
		Notice notice = new NoticeDao().selectNotice(con, noticeNo);
		close(con);
		return notice;
	}

	public int delecteNotice(int noticeNo) throws NoticeException {
		Connection con = getConnection();
		int result = new NoticeDao().deleteNotice(con, noticeNo);
		if(result>0){
			commit(con);
		}
		else{
			rollback(con);
		}
		close(con);
		return result;
	}
	
	public int updateNotice(Notice notice) throws NoticeException {
		Connection con = getConnection();
		int result = new NoticeDao().updateNotice(con, notice);
		if(result>0){
			commit(con);
		}
		else{
			rollback(con);
		}
		close(con);
		return result;
	}
	
	public int insertNotice(Notice notice) throws NoticeException {
		Connection con = getConnection();
		int result = new NoticeDao().insertNotice(con, notice);
		if(result>0){
			commit(con);
		}
		else{
			rollback(con);
		}
		close(con);
		return result;
	}

}
