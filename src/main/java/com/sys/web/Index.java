package com.sys.web;

import com.sys.commons.ReqResult;
import com.sys.utils.ReqResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wing on 2018/1/21 22:50.
 */
@RequestMapping("service")
public class Index {
    private static final Logger log = LoggerFactory.getLogger(Index.class);

    @RequestMapping(value = "index.do", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> addActivy() {
        log.info("测试开始");
        ReqResult rst = new ReqResult();
        try {
            rst.setResultCode(ReqResult.resultCode_Success);
            rst.setReturnObject(new String("你好"));
        } catch (Exception e) {
            log.error("系统异常异常={}", e.getMessage());
            rst.setResultCode(ReqResult.resultCode_error);
            rst.setReturnObject("系统错误");
        }
        return ReqResultUtil.genResultResponse(rst);
    }
}
