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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverInfo extends AbstractModel{

    /**
    * 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 告警时间段结束时间。含义同StartTime
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 告警通知方式。可选 "SMS","SITE","EMAIL","CALL","WECHAT"
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * 接收人类型。“group” 或 “user”
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * ReceiverId
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * 电话告警接收者uid
    */
    @SerializedName("UidList")
    @Expose
    private Long [] UidList;

    /**
    * 电话告警轮数
    */
    @SerializedName("RoundNumber")
    @Expose
    private Long RoundNumber;

    /**
    * 电话告警对个人间隔（秒）
    */
    @SerializedName("PersonInterval")
    @Expose
    private Long PersonInterval;

    /**
    * 电话告警每轮间隔（秒）
    */
    @SerializedName("RoundInterval")
    @Expose
    private Long RoundInterval;

    /**
    * 恢复通知方式。可选"SMS"
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
    * 是否需要电话告警触达提示。0不需要，1需要
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Long NeedSendNotice;

    /**
    * 接收组列表。通过平台接口查询到的接收组id列表
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Long [] ReceiverGroupList;

    /**
    * 接收人列表。通过平台接口查询到的接收人id列表
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Long [] ReceiverUserList;

    /**
    * 告警接收语言，枚举值（zh-CN，en-US）
    */
    @SerializedName("ReceiveLanguage")
    @Expose
    private String ReceiveLanguage;

    /**
     * Get 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0" 
     * @return StartTime 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
     * @param StartTime 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 告警时间段结束时间。含义同StartTime 
     * @return EndTime 告警时间段结束时间。含义同StartTime
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 告警时间段结束时间。含义同StartTime
     * @param EndTime 告警时间段结束时间。含义同StartTime
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 告警通知方式。可选 "SMS","SITE","EMAIL","CALL","WECHAT" 
     * @return NotifyWay 告警通知方式。可选 "SMS","SITE","EMAIL","CALL","WECHAT"
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set 告警通知方式。可选 "SMS","SITE","EMAIL","CALL","WECHAT"
     * @param NotifyWay 告警通知方式。可选 "SMS","SITE","EMAIL","CALL","WECHAT"
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get 接收人类型。“group” 或 “user” 
     * @return ReceiverType 接收人类型。“group” 或 “user”
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 接收人类型。“group” 或 “user”
     * @param ReceiverType 接收人类型。“group” 或 “user”
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get ReceiverId 
     * @return Id ReceiverId
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ReceiverId
     * @param Id ReceiverId
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知) 
     * @return SendFor 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
     */
    public String [] getSendFor() {
        return this.SendFor;
    }

    /**
     * Set 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
     * @param SendFor 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
     */
    public void setSendFor(String [] SendFor) {
        this.SendFor = SendFor;
    }

    /**
     * Get 电话告警接收者uid 
     * @return UidList 电话告警接收者uid
     */
    public Long [] getUidList() {
        return this.UidList;
    }

    /**
     * Set 电话告警接收者uid
     * @param UidList 电话告警接收者uid
     */
    public void setUidList(Long [] UidList) {
        this.UidList = UidList;
    }

    /**
     * Get 电话告警轮数 
     * @return RoundNumber 电话告警轮数
     */
    public Long getRoundNumber() {
        return this.RoundNumber;
    }

    /**
     * Set 电话告警轮数
     * @param RoundNumber 电话告警轮数
     */
    public void setRoundNumber(Long RoundNumber) {
        this.RoundNumber = RoundNumber;
    }

    /**
     * Get 电话告警对个人间隔（秒） 
     * @return PersonInterval 电话告警对个人间隔（秒）
     */
    public Long getPersonInterval() {
        return this.PersonInterval;
    }

    /**
     * Set 电话告警对个人间隔（秒）
     * @param PersonInterval 电话告警对个人间隔（秒）
     */
    public void setPersonInterval(Long PersonInterval) {
        this.PersonInterval = PersonInterval;
    }

    /**
     * Get 电话告警每轮间隔（秒） 
     * @return RoundInterval 电话告警每轮间隔（秒）
     */
    public Long getRoundInterval() {
        return this.RoundInterval;
    }

    /**
     * Set 电话告警每轮间隔（秒）
     * @param RoundInterval 电话告警每轮间隔（秒）
     */
    public void setRoundInterval(Long RoundInterval) {
        this.RoundInterval = RoundInterval;
    }

    /**
     * Get 恢复通知方式。可选"SMS" 
     * @return RecoverNotify 恢复通知方式。可选"SMS"
     */
    public String [] getRecoverNotify() {
        return this.RecoverNotify;
    }

    /**
     * Set 恢复通知方式。可选"SMS"
     * @param RecoverNotify 恢复通知方式。可选"SMS"
     */
    public void setRecoverNotify(String [] RecoverNotify) {
        this.RecoverNotify = RecoverNotify;
    }

    /**
     * Get 是否需要电话告警触达提示。0不需要，1需要 
     * @return NeedSendNotice 是否需要电话告警触达提示。0不需要，1需要
     */
    public Long getNeedSendNotice() {
        return this.NeedSendNotice;
    }

    /**
     * Set 是否需要电话告警触达提示。0不需要，1需要
     * @param NeedSendNotice 是否需要电话告警触达提示。0不需要，1需要
     */
    public void setNeedSendNotice(Long NeedSendNotice) {
        this.NeedSendNotice = NeedSendNotice;
    }

    /**
     * Get 接收组列表。通过平台接口查询到的接收组id列表 
     * @return ReceiverGroupList 接收组列表。通过平台接口查询到的接收组id列表
     */
    public Long [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set 接收组列表。通过平台接口查询到的接收组id列表
     * @param ReceiverGroupList 接收组列表。通过平台接口查询到的接收组id列表
     */
    public void setReceiverGroupList(Long [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get 接收人列表。通过平台接口查询到的接收人id列表 
     * @return ReceiverUserList 接收人列表。通过平台接口查询到的接收人id列表
     */
    public Long [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set 接收人列表。通过平台接口查询到的接收人id列表
     * @param ReceiverUserList 接收人列表。通过平台接口查询到的接收人id列表
     */
    public void setReceiverUserList(Long [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get 告警接收语言，枚举值（zh-CN，en-US） 
     * @return ReceiveLanguage 告警接收语言，枚举值（zh-CN，en-US）
     */
    public String getReceiveLanguage() {
        return this.ReceiveLanguage;
    }

    /**
     * Set 告警接收语言，枚举值（zh-CN，en-US）
     * @param ReceiveLanguage 告警接收语言，枚举值（zh-CN，en-US）
     */
    public void setReceiveLanguage(String ReceiveLanguage) {
        this.ReceiveLanguage = ReceiveLanguage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "SendFor.", this.SendFor);
        this.setParamArraySimple(map, prefix + "UidList.", this.UidList);
        this.setParamSimple(map, prefix + "RoundNumber", this.RoundNumber);
        this.setParamSimple(map, prefix + "PersonInterval", this.PersonInterval);
        this.setParamSimple(map, prefix + "RoundInterval", this.RoundInterval);
        this.setParamArraySimple(map, prefix + "RecoverNotify.", this.RecoverNotify);
        this.setParamSimple(map, prefix + "NeedSendNotice", this.NeedSendNotice);
        this.setParamArraySimple(map, prefix + "ReceiverGroupList.", this.ReceiverGroupList);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamSimple(map, prefix + "ReceiveLanguage", this.ReceiveLanguage);

    }
}

