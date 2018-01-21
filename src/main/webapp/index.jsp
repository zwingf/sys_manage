<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <title>测试</title>
    <script type="text/javascript" src="./jsp/jquery-2.1.0.js"></script>
</head>
<body>

<script type="text/javascript">
    var global_url = "http://192.168.102.189:8080";
        $(document).ready(function () {
        $("#upload_btn").click(function () {

//            var a = {"zoneId":"2"};
//            var data = JSON.stringify(a);
//            var url = 'http://192.168.102.53:8080/config_param/config.do';
            var url = global_url+'/service/index.do';
            $.ajax({
                type: 'POST',
                url: url,
//                data: data,
                contentType: 'application/json',
                success: function (data) {
                    console.log(data);
                    alert(data);
                }
            });
        });

        /*===================下载文件
         * options:{
         * url:'',  //下载地址
         * data:{name:value}, //要发送的数据
         * method:'post'
         * }
         */
        var DownLoadFile = function (options) {
            var config = $.extend(true, {method: 'post'}, options);
            var $iframe = $('<iframe id="down-file-iframe" />');
            var $form = $('<form target="down-file-iframe" method="' + config.method + '" />');
            $form.attr('action', config.url);
            for (var key in config.data) {
                $form.append('<input type="hidden" name="' + key + '" value="' + config.data[key] + '" />');
            }
            $iframe.append($form);
            $(document.body).append($iframe);
            $form[0].submit();
            $iframe.remove();
        }

        $("#excel_export").click(function () {

            var entity = {};
            ids = "106,107,108,109";
            entity.ids = ids;
            console.log(entity);
            var url = 'http://localhost:8080/annu_audit_records/excel_export.do';
            var url1 = 'http://localhost:8080/card_transact/excel_export.do';
            DownLoadFile({
                url: url, //请求的url
                data: {cardType: 1, zoneId: 2}//要发送的数据
//                data:entity
            });
        });

    })
</script>
<input type="button" id="upload_btn" value="请求数据">
<!--<input type="button" id="excel_export" value="导出报表">-->

</body>
</html>
