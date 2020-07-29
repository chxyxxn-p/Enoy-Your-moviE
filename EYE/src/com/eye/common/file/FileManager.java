package com.eye.common.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.eye.exception.FileException;

@Component	//모든 어노테이션의 상위 개념이자, 특별한 역할이 없는 것을 메모리에 올리고 싶을 때 사용
public class FileManager {
	
	public static String createFileName(String name) {
		long time = System.currentTimeMillis();
		String ext = getExt(name);
		String fileName = time+"."+ext;
		return fileName;
	}

	public static String getExt(String path) {
		int index = path.lastIndexOf(".");
		String ext = path.substring(index+1, path.length());
		return ext;
	}
	
//	지정한 경로에 파일 저장하기	
	public static String saveFile(MultipartFile myFile, String destFilePath) throws FileException {
		boolean flag = false;
		
		String oriFileName = myFile.getOriginalFilename();
		String destFileName = FileManager.createFileName(oriFileName);
		File destFile = new File(destFilePath+destFileName);
		
		try {
			myFile.transferTo(destFile);	//하드디스크에 저장
			flag = true;
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
			flag = false;
			
		} catch (IOException e) {
			e.printStackTrace();
			flag = false;
		}

		if(flag == false) {
			throw new FileException("파일 저장에 실패하였습니다");
		}
		
		return destFileName;
	}
	
	public static void deleteFile(String destFilePath, String filename)  throws FileException {
		File file = new File(destFilePath + "/" + filename);
		
		if(!file.delete()) {
			throw new FileException("파일 삭제에 실패하였습니다");
		}
	}
}
