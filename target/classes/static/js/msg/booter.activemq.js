/**
 * Created by sn on 2017-4-16.
 * proc activemq related
 */

var booter={};
 booter.activemq ={};
var _this=$(booter.activemq);
$.extend($(booter.activemq),
    {
        sendMsg:function()
        {
            alert("sendMsg")
        },
        revMsg:function()
        {
            alert("revMsg")
        }
    }
    )
$(function($) {
    $("#btnSend").on("click", $(booter.activemq).sendMsg)
});