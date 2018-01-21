package com.sys.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sys.commons.ReqResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ReqResultUtil {

	public static ResponseEntity<String> genResultResponse(ReqResult rst) {
		return new ResponseEntity<String>(JSON.toJSONString(rst, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteMapNullValue), HttpStatus.OK);
	}

}
