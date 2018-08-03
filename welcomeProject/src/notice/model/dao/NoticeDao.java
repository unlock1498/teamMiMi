package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static common.JDBCTemplate.*;
import notice.exception.NoticeException;
import notice.model.vo.Notice;

public class NoticeDao {
	public NoticeDao(){}
	
	public ArrayList<Notice> selectList(Connection con) throws NoticeException {
		ArrayList<Notice> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from notice order by noticeno desc";
		
		try{
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next()){
				Notice notice = new Notice();
			
				notice.setNoticeNo(rset.getInt("noticeno"));
				notice.setNoticeTitle(rset.getString("noticetitle"));
				notice.setNoticeDate(rset.getDate("noticedate"));
				notice.setNoticeWriter(rset.getString("noticewriter"));
				notice.setNoticeContent(rset.getString("noticecontent"));
				notice.setOriginalFilepath(rset.getString("original_filepath"));
				notice.setRenameFilepath(rset.getString("rename_filepath"));
				
				list.add(notice);
			}
			if(list.size() <= 0){
				throw new NoticeException("공지 게시물을 찾을 수 없습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new NoticeException(e.getMessage());
		}finally{
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public Notice selectNotice(Connection con, int noticeNo) throws NoticeException {
		Notice notice = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from notice where noticeno = ?";
		try{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,noticeNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				notice = new Notice();
				
				notice.setNoticeNo(rset.getInt("noticeno"));
				notice.setNoticeTitle(rset.getString("noticetitle"));
				notice.setNoticeDate(rset.getDate("noticedate"));
				notice.setNoticeWriter(rset.getString("noticewriter"));
				notice.setNoticeContent(rset.getString("noticecontent"));
				notice.setOriginalFilepath(rset.getString("original_filepath"));
				notice.setRenameFilepath(rset.getString("rename_filepath"));
			}
			else{
				throw new NoticeException("공지글 상세 조회 실패!");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new NoticeException(e.getMessage());
		}finally{
			close(rset);
			close(pstmt);
		}
		
		return notice;
	}

	public int deleteNotice(Connection con, int noticeNo) throws NoticeException {
		int result =0;
		PreparedStatement pstmt = null;
		String query = "delete from notice where noticeno=?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			result = pstmt.executeUpdate();
			
			if(result<=0){
				throw new NoticeException(noticeNo + "번 글 삭제 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new NoticeException(e.getMessage());
		} finally{
			close(pstmt);
		}
		
		return result;
	}

	public int updateNotice(Connection con, Notice notice) throws NoticeException{
		
		
		return 0;
	}

	public int insertNotice(Connection con, Notice notice) throws NoticeException{
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "insert into notice values ((select max(noticeno)+1 from notice), ?, sysdate, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeWriter());
			pstmt.setString(3, notice.getNoticeContent());
			pstmt.setString(4, notice.getOriginalFilepath());
			pstmt.setString(5, notice.getRenameFilepath());
			
			result = pstmt.executeUpdate();
			if(result <= 0){
				throw new NoticeException("새 공지글 등록 실패!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new NoticeException(e.getMessage());
		} finally{
			close(pstmt);
		}
		return result;
	}
}
