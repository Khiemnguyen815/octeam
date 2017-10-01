package sendreceivemail;

import java.util.Scanner;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SimpleText {

	public static void main(String[] args) {
	       try {     
	    	   String gui=" ",nhan=" ",tieude=" ",noidung=" ",tk=" ", mk=" ";
	    	   Scanner sc = new Scanner(System.in);
	           Email email = new SimpleEmail();
	 
	           // Cấu hình thông tin Email Server
	           email.setHostName("smtp.googlemail.com");
	           email.setSmtpPort(465);
	           email.setAuthenticator(new DefaultAuthenticator("nthduyx@gmail.com",
	                   "Matkhaula1234"));
	            
	           // Với gmail cái này là bắt buộc.
	           email.setSSLOnConnect(true);
	            
	           // Người gửi
	           System.out.println("Nhap email nguoi gui");
	           gui=sc.nextLine();
	           email.setFrom(gui);
	            
	           // Tiêu đề
	           System.out.println("Nhap tieu de");
	           tieude=sc.nextLine();
	           email.setSubject(tieude);
	            
	           // Nội dung email
	           System.out.println("Nhap noi dung");
	           noidung=sc.nextLine();
	           email.setMsg(noidung);
	            
	           // Người nhận
	           System.out.println("Nhap email nguoi nhận");
	           nhan=sc.nextLine();
	           email.addTo(nhan);            
	           email.send();
	           System.out.println("Sent!!");
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	   }
	}

