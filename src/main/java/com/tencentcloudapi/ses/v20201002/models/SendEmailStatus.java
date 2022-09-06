/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailStatus extends AbstractModel{

    /**
    * SendEmail返回的MessageId
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 收件人邮箱
    */
    @SerializedName("ToEmailAddress")
    @Expose
    private String ToEmailAddress;

    /**
    * 发件人邮箱
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * 腾讯云处理状态
0: 处理成功
1001: 内部系统异常
1002: 内部系统异常
1003: 内部系统异常
1003: 内部系统异常
1004: 发信超时
1005: 内部系统异常
1006: 触发频率控制，短时间内对同一地址发送过多邮件
1007: 邮件地址在黑名单中
1008: 域名被收件人拒收
1009: 内部系统异常
1010: 超出了每日发送限制
1011: 无发送自定义内容权限，必须使用模板
1013: 域名被收件人取消订阅
2001: 找不到相关记录
3007: 模板ID无效或者不可用
3008: 被收信域名临时封禁
3009: 无权限使用该模板
3010: TemplateData字段格式不正确 
3014: 发件域名没有经过认证，无法发送
3020: 收件方邮箱类型在黑名单
3024: 邮箱地址格式预检查失败
3030: 退信率过高，临时限制发送
3033: 余额不足，账号欠费等
    */
    @SerializedName("SendStatus")
    @Expose
    private Long SendStatus;

    /**
    * 收件方处理状态
0: 请求成功被腾讯云接受，进入发送队列
1: 邮件递送成功，DeliverTime表示递送成功的时间
2: 邮件因某种原因被丢弃，DeliverMessage表示丢弃原因
3: 收件方ESP拒信，一般原因为邮箱地址不存在，或其它原因
8: 邮件被ESP因某些原因延迟递送，DeliverMessage表示延迟原因
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * 收件方处理状态描述
    */
    @SerializedName("DeliverMessage")
    @Expose
    private String DeliverMessage;

    /**
    * 请求到达腾讯云时间戳
    */
    @SerializedName("RequestTime")
    @Expose
    private Long RequestTime;

    /**
    * 腾讯云执行递送时间戳
    */
    @SerializedName("DeliverTime")
    @Expose
    private Long DeliverTime;

    /**
    * 用户是否打开该邮件
    */
    @SerializedName("UserOpened")
    @Expose
    private Boolean UserOpened;

    /**
    * 用户是否点击该邮件中的链接
    */
    @SerializedName("UserClicked")
    @Expose
    private Boolean UserClicked;

    /**
    * 用户是否取消该发送者的订阅
    */
    @SerializedName("UserUnsubscribed")
    @Expose
    private Boolean UserUnsubscribed;

    /**
    * 用户是否举报该发送者
    */
    @SerializedName("UserComplainted")
    @Expose
    private Boolean UserComplainted;

    /**
     * Get SendEmail返回的MessageId 
     * @return MessageId SendEmail返回的MessageId
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set SendEmail返回的MessageId
     * @param MessageId SendEmail返回的MessageId
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 收件人邮箱 
     * @return ToEmailAddress 收件人邮箱
     */
    public String getToEmailAddress() {
        return this.ToEmailAddress;
    }

    /**
     * Set 收件人邮箱
     * @param ToEmailAddress 收件人邮箱
     */
    public void setToEmailAddress(String ToEmailAddress) {
        this.ToEmailAddress = ToEmailAddress;
    }

    /**
     * Get 发件人邮箱 
     * @return FromEmailAddress 发件人邮箱
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set 发件人邮箱
     * @param FromEmailAddress 发件人邮箱
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get 腾讯云处理状态
0: 处理成功
1001: 内部系统异常
1002: 内部系统异常
1003: 内部系统异常
1003: 内部系统异常
1004: 发信超时
1005: 内部系统异常
1006: 触发频率控制，短时间内对同一地址发送过多邮件
1007: 邮件地址在黑名单中
1008: 域名被收件人拒收
1009: 内部系统异常
1010: 超出了每日发送限制
1011: 无发送自定义内容权限，必须使用模板
1013: 域名被收件人取消订阅
2001: 找不到相关记录
3007: 模板ID无效或者不可用
3008: 被收信域名临时封禁
3009: 无权限使用该模板
3010: TemplateData字段格式不正确 
3014: 发件域名没有经过认证，无法发送
3020: 收件方邮箱类型在黑名单
3024: 邮箱地址格式预检查失败
3030: 退信率过高，临时限制发送
3033: 余额不足，账号欠费等 
     * @return SendStatus 腾讯云处理状态
0: 处理成功
1001: 内部系统异常
1002: 内部系统异常
1003: 内部系统异常
1003: 内部系统异常
1004: 发信超时
1005: 内部系统异常
1006: 触发频率控制，短时间内对同一地址发送过多邮件
1007: 邮件地址在黑名单中
1008: 域名被收件人拒收
1009: 内部系统异常
1010: 超出了每日发送限制
1011: 无发送自定义内容权限，必须使用模板
1013: 域名被收件人取消订阅
2001: 找不到相关记录
3007: 模板ID无效或者不可用
3008: 被收信域名临时封禁
3009: 无权限使用该模板
3010: TemplateData字段格式不正确 
3014: 发件域名没有经过认证，无法发送
3020: 收件方邮箱类型在黑名单
3024: 邮箱地址格式预检查失败
3030: 退信率过高，临时限制发送
3033: 余额不足，账号欠费等
     */
    public Long getSendStatus() {
        return this.SendStatus;
    }

    /**
     * Set 腾讯云处理状态
0: 处理成功
1001: 内部系统异常
1002: 内部系统异常
1003: 内部系统异常
1003: 内部系统异常
1004: 发信超时
1005: 内部系统异常
1006: 触发频率控制，短时间内对同一地址发送过多邮件
1007: 邮件地址在黑名单中
1008: 域名被收件人拒收
1009: 内部系统异常
1010: 超出了每日发送限制
1011: 无发送自定义内容权限，必须使用模板
1013: 域名被收件人取消订阅
2001: 找不到相关记录
3007: 模板ID无效或者不可用
3008: 被收信域名临时封禁
3009: 无权限使用该模板
3010: TemplateData字段格式不正确 
3014: 发件域名没有经过认证，无法发送
3020: 收件方邮箱类型在黑名单
3024: 邮箱地址格式预检查失败
3030: 退信率过高，临时限制发送
3033: 余额不足，账号欠费等
     * @param SendStatus 腾讯云处理状态
0: 处理成功
1001: 内部系统异常
1002: 内部系统异常
1003: 内部系统异常
1003: 内部系统异常
1004: 发信超时
1005: 内部系统异常
1006: 触发频率控制，短时间内对同一地址发送过多邮件
1007: 邮件地址在黑名单中
1008: 域名被收件人拒收
1009: 内部系统异常
1010: 超出了每日发送限制
1011: 无发送自定义内容权限，必须使用模板
1013: 域名被收件人取消订阅
2001: 找不到相关记录
3007: 模板ID无效或者不可用
3008: 被收信域名临时封禁
3009: 无权限使用该模板
3010: TemplateData字段格式不正确 
3014: 发件域名没有经过认证，无法发送
3020: 收件方邮箱类型在黑名单
3024: 邮箱地址格式预检查失败
3030: 退信率过高，临时限制发送
3033: 余额不足，账号欠费等
     */
    public void setSendStatus(Long SendStatus) {
        this.SendStatus = SendStatus;
    }

    /**
     * Get 收件方处理状态
0: 请求成功被腾讯云接受，进入发送队列
1: 邮件递送成功，DeliverTime表示递送成功的时间
2: 邮件因某种原因被丢弃，DeliverMessage表示丢弃原因
3: 收件方ESP拒信，一般原因为邮箱地址不存在，或其它原因
8: 邮件被ESP因某些原因延迟递送，DeliverMessage表示延迟原因 
     * @return DeliverStatus 收件方处理状态
0: 请求成功被腾讯云接受，进入发送队列
1: 邮件递送成功，DeliverTime表示递送成功的时间
2: 邮件因某种原因被丢弃，DeliverMessage表示丢弃原因
3: 收件方ESP拒信，一般原因为邮箱地址不存在，或其它原因
8: 邮件被ESP因某些原因延迟递送，DeliverMessage表示延迟原因
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set 收件方处理状态
0: 请求成功被腾讯云接受，进入发送队列
1: 邮件递送成功，DeliverTime表示递送成功的时间
2: 邮件因某种原因被丢弃，DeliverMessage表示丢弃原因
3: 收件方ESP拒信，一般原因为邮箱地址不存在，或其它原因
8: 邮件被ESP因某些原因延迟递送，DeliverMessage表示延迟原因
     * @param DeliverStatus 收件方处理状态
0: 请求成功被腾讯云接受，进入发送队列
1: 邮件递送成功，DeliverTime表示递送成功的时间
2: 邮件因某种原因被丢弃，DeliverMessage表示丢弃原因
3: 收件方ESP拒信，一般原因为邮箱地址不存在，或其它原因
8: 邮件被ESP因某些原因延迟递送，DeliverMessage表示延迟原因
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get 收件方处理状态描述 
     * @return DeliverMessage 收件方处理状态描述
     */
    public String getDeliverMessage() {
        return this.DeliverMessage;
    }

    /**
     * Set 收件方处理状态描述
     * @param DeliverMessage 收件方处理状态描述
     */
    public void setDeliverMessage(String DeliverMessage) {
        this.DeliverMessage = DeliverMessage;
    }

    /**
     * Get 请求到达腾讯云时间戳 
     * @return RequestTime 请求到达腾讯云时间戳
     */
    public Long getRequestTime() {
        return this.RequestTime;
    }

    /**
     * Set 请求到达腾讯云时间戳
     * @param RequestTime 请求到达腾讯云时间戳
     */
    public void setRequestTime(Long RequestTime) {
        this.RequestTime = RequestTime;
    }

    /**
     * Get 腾讯云执行递送时间戳 
     * @return DeliverTime 腾讯云执行递送时间戳
     */
    public Long getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set 腾讯云执行递送时间戳
     * @param DeliverTime 腾讯云执行递送时间戳
     */
    public void setDeliverTime(Long DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get 用户是否打开该邮件 
     * @return UserOpened 用户是否打开该邮件
     */
    public Boolean getUserOpened() {
        return this.UserOpened;
    }

    /**
     * Set 用户是否打开该邮件
     * @param UserOpened 用户是否打开该邮件
     */
    public void setUserOpened(Boolean UserOpened) {
        this.UserOpened = UserOpened;
    }

    /**
     * Get 用户是否点击该邮件中的链接 
     * @return UserClicked 用户是否点击该邮件中的链接
     */
    public Boolean getUserClicked() {
        return this.UserClicked;
    }

    /**
     * Set 用户是否点击该邮件中的链接
     * @param UserClicked 用户是否点击该邮件中的链接
     */
    public void setUserClicked(Boolean UserClicked) {
        this.UserClicked = UserClicked;
    }

    /**
     * Get 用户是否取消该发送者的订阅 
     * @return UserUnsubscribed 用户是否取消该发送者的订阅
     */
    public Boolean getUserUnsubscribed() {
        return this.UserUnsubscribed;
    }

    /**
     * Set 用户是否取消该发送者的订阅
     * @param UserUnsubscribed 用户是否取消该发送者的订阅
     */
    public void setUserUnsubscribed(Boolean UserUnsubscribed) {
        this.UserUnsubscribed = UserUnsubscribed;
    }

    /**
     * Get 用户是否举报该发送者 
     * @return UserComplainted 用户是否举报该发送者
     */
    public Boolean getUserComplainted() {
        return this.UserComplainted;
    }

    /**
     * Set 用户是否举报该发送者
     * @param UserComplainted 用户是否举报该发送者
     */
    public void setUserComplainted(Boolean UserComplainted) {
        this.UserComplainted = UserComplainted;
    }

    public SendEmailStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendEmailStatus(SendEmailStatus source) {
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ToEmailAddress != null) {
            this.ToEmailAddress = new String(source.ToEmailAddress);
        }
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.SendStatus != null) {
            this.SendStatus = new Long(source.SendStatus);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.DeliverMessage != null) {
            this.DeliverMessage = new String(source.DeliverMessage);
        }
        if (source.RequestTime != null) {
            this.RequestTime = new Long(source.RequestTime);
        }
        if (source.DeliverTime != null) {
            this.DeliverTime = new Long(source.DeliverTime);
        }
        if (source.UserOpened != null) {
            this.UserOpened = new Boolean(source.UserOpened);
        }
        if (source.UserClicked != null) {
            this.UserClicked = new Boolean(source.UserClicked);
        }
        if (source.UserUnsubscribed != null) {
            this.UserUnsubscribed = new Boolean(source.UserUnsubscribed);
        }
        if (source.UserComplainted != null) {
            this.UserComplainted = new Boolean(source.UserComplainted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ToEmailAddress", this.ToEmailAddress);
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "SendStatus", this.SendStatus);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "DeliverMessage", this.DeliverMessage);
        this.setParamSimple(map, prefix + "RequestTime", this.RequestTime);
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "UserOpened", this.UserOpened);
        this.setParamSimple(map, prefix + "UserClicked", this.UserClicked);
        this.setParamSimple(map, prefix + "UserUnsubscribed", this.UserUnsubscribed);
        this.setParamSimple(map, prefix + "UserComplainted", this.UserComplainted);

    }
}

