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
        rcvMsg:function()
        {
            alert("revMsg")
        }
    }
    )
