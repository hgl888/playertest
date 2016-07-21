package com.rednovo.libs.common;

import android.annotation.SuppressLint;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lizhen on 16/3/27.
 */
public class ErrorMsg {
    //    0 = 操作失败
//    1 = 操作成功
//
//    #100 - 199 账户相关
//    100 = 该账户不存在
//    101 = 账户余额不足
//    102 = 兑换数据不正确
//    103 = 兑换比率不存在
//    104 = 还未绑定兑点信息
//
//    #200 - 299 用户相关
//    200 = 用户名不能为空
//    201 = 密码不能为空
//    202 = 用户名错误
//    203 = 密码错误
//    204 = 该用户不存在
//    205 = 该用户已经被拉黑
//    206 = 已经是关注,不能再添加
//    207 = 两者不是好友,无法删除
//    208 = 用户已经冻结
//    209 = PID已经被注册
//    210 = 手机号已经被注册
//    211 = 该用户已经存在
//    212 = 该用户已经是激活状态
//    213 = 该用户并非黑名单用户,无法从黑名单中移除
//    214 = 验证码已经发送
//    215 = 还未绑定兑点信息
//    216 = 验证码无效
//    217 = 无效的邮件链接
//    218 = 含有非法字符
//    219 = 同一设备注册号码数超出限制
//    220 = 短信发送失败
//
//    #300 - 399 直播
//    300 = 其他失败
//    301 = 直播已经结束
//
//    #400 - 499 db
//    400 = 商品已经存在
//    401 = 商品不存在
//    402 = 商品余额不足
//
//    #500 - 599 relation
//    500 = 已经关注该用户
//
//
//    #600 - 699 TCP
//    600 = 参数异常
//    601 = 网络连接超时
//    602 = 数据头异常,请求拒绝
//
//    #700 - 799 exchange order
//    700 = 订单不存在
//    701 = 已经兑换过
//    702 = 订单已经开通
//    703 = 订单已经支付
//    704 = 订单状态不满足
//    705 = 订单咿呀号不正确
//    706 = 订单充值金额不正确
//    707 = 订单支付方式不正确
//    708 = 订单支付通道不正确
//    709 = 订单创建失败
//    710 = 订单跳转支付失败
//    711 = 订单金额与支付金额不一致
//    712 = 订单充值失败
//    713 = 苹果内购收据验证无效
//
//    #800 - 900 chat
//    800 = 上传多媒体消息内容失败
//    801 = 下载多媒体消息内容失败,不存在
//    802 = 只有VIP才能给宝贝发消息
    @SuppressLint("UseSparseArrays")
    private static Map<Integer, String> errMap = new HashMap<Integer, String>() {
        {
            put(100, "该账户不存在");
            put(101, "账户余额不足");
            put(102, "兑换数据不正确");
            put(103, "兑换比率不存在");
            put(104, "还未绑定兑点信息");

            put(200, "用户名不能为空");
            put(201, "密码不能为空");
            put(202, "用户名错误");
            put(203, "密码错误");
            put(204, "该用户不存在");
            put(205, "该用户已经被拉黑");
            put(206, "已经是关注,不能再添加");
            put(207, "两者不是好友,无法删除");
            put(208, "用户已经冻结");
            put(209, "PID已经被注册");
            put(210, "手机号已经被注册");
            put(211, "该用户已经存在");
            put(212, "该用户已经是激活状态");
            put(213, "该用户并非黑名单用户,无法从黑名单中移除");
            put(214, "验证码已经发送");
            put(215, "还未绑定兑点信息");
            put(216, "验证码无效");
            put(217, "无效的邮件链接");
            put(218, "含有非法字符");
            put(219, "同一设备注册号码数超出限制");
            put(220, "短信发送失败");

            put(300, "其他失败");
            put(301, "直播已经结束");

            put(400, "商品已经存在");
            put(401, "商品不存在");
            put(402, "商品余额不足");

            put(500, "已经关注该用户");

            put(600, "参数异常");
            put(601, "网络连接超时");
            put(602, "数据头异常,请求拒绝");

            put(700, "订单不存在");
            put(701, "已经兑换过");
            put(702, "订单已经开通");
            put(703, "订单已经支付");
            put(704, "订单状态不满足");
            put(705, "订单咿呀号不正确");
            put(706, "订单充值金额不正确");
            put(707, "订单支付方式不正确");
            put(708, "订单支付通道不正确");
            put(709, "订单创建失败");
            put(710, "订单跳转支付失败");

            put(711, "订单金额与支付金额不一致");
            put(712, "订单充值失败");
            put(713, "苹果内购收据验证无效");

            put(800, "上传多媒体消息内容失败");
            put(801, "下载多媒体消息内容失败,不存在");
            put(802, "只有VIP才能给宝贝发消息");
            
        }
    };

    public static String getErrMsg(int code) {
        return errMap.get(code);
    }

}