package com.eye.common.file;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.eye.exception.FileException;

@Component	//��� ������̼��� ���� ��������, Ư���� ������ ���� ���� �޸𸮿� �ø��� ���� �� ���
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
	
//	������ ��ο� ���� �����ϱ�	
	public static String saveFile(MultipartFile myFile, String destFilePath) throws FileException {
		boolean flag = false;
		
		String oriFileName = myFile.getOriginalFilename();
		String destFileName = FileManager.createFileName(oriFileName);
		File destFile = new File(destFilePath+destFileName);
		
		try {
			myFile.transferTo(destFile);	//�ϵ��ũ�� ����
			flag = true;
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
			flag = false;
			
		} catch (IOException e) {
			e.printStackTrace();
			flag = false;
		}

		if(flag == false) {
			throw new FileException("���� ���忡 �����Ͽ����ϴ�");
		}
		
		return destFileName;
	}
	
	public static void deleteFile(String destFilePath, String filename)  throws FileException {
		File file = new File(destFilePath + "/" + filename);
		
		if(!file.delete()) {
			throw new FileException("���� ������ �����Ͽ����ϴ�");
		}
	}
}
