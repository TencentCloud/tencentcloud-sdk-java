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

public class DescribePolicyGroupInfoReceiverInfo extends AbstractModel{

    /**
    * 告警接收组id列表
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Integer [] ReceiverGroupList;

    /**
    * 告警接收人id列表
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Integer [] ReceiverUserList;

    /**
    * 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
    */
    @SerializedName("StartTime")
    @Expose
    private Integer StartTime;

    /**
    * 告警时间段结束时间。含义同StartTime
    */
    @SerializedName("EndTime")
    @Expose
    private Integer EndTime;

    /**
    * 接收类型。“group”(接收组)或“user”(接收人)
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 告警通知方式。可选 "SMS","SITE","EMAIL","CALL","WECHAT"
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UidList")
    @Expose
    private Integer [] UidList;

    /**
    * 电话告警轮数
    */
    @SerializedName("RoundNumber")
    @Expose
    private Integer RoundNumber;

    /**
    * 电话告警每轮间隔（秒）
    */
    @SerializedName("RoundInterval")
    @Expose
    private Integer RoundInterval;

    /**
    * 电话告警对个人间隔（秒）
    */
    @SerializedName("PersonInterval")
    @Expose
    private Integer PersonInterval;

    /**
    * 是否需要电话告警触达提示。0不需要，1需要
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Integer NeedSendNotice;

    /**
    * 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * 恢复通知方式。可选"SMS"
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
     * Get 告警接收组id列表 
     * @return ReceiverGroupList 告警接收组id列表
     */
    public Integer [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set 告警接收组id列表
     * @param ReceiverGroupList 告警接收组id列表
     */
    public void setReceiverGroupList(Integer [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get 告警接收人id列表 
     * @return ReceiverUserList 告警接收人id列表
     */
    public Integer [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set 告警接收人id列表
     * @param ReceiverUserList 告警接收人id列表
     */
    public void setReceiverUserList(Integer [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0" 
     * @return StartTime 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
     */
    public Integer getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
     * @param StartTime 告警时间段开始时间。范围[0,86400)，作为unix时间戳转成北京时间后去掉日期，例如7200表示"10:0:0"
     */
    public void setStartTime(Integer StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 告警时间段结束时间。含义同StartTime 
     * @return EndTime 告警时间段结束时间。含义同StartTime
     */
    public Integer getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 告警时间段结束时间。含义同StartTime
     * @param EndTime 告警时间段结束时间。含义同StartTime
     */
    public void setEndTime(Integer EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 接收类型。“group”(接收组)或“user”(接收人) 
     * @return ReceiverType 接收类型。“group”(接收组)或“user”(接收人)
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 接收类型。“group”(接收组)或“user”(接收人)
     * @param ReceiverType 接收类型。“group”(接收组)或“user”(接收人)
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
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
     * Get 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UidList 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer [] getUidList() {
        return this.UidList;
    }

    /**
     * Set 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
     * @param UidList 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUidList(Integer [] UidList) {
        this.UidList = UidList;
    }

    /**
     * Get 电话告警轮数 
     * @return RoundNumber 电话告警轮数
     */
    public Integer getRoundNumber() {
        return this.RoundNumber;
    }

    /**
     * Set 电话告警轮数
     * @param RoundNumber 电话告警轮数
     */
    public void setRoundNumber(Integer RoundNumber) {
        this.RoundNumber = RoundNumber;
    }

    /**
     * Get 电话告警每轮间隔（秒） 
     * @return RoundInterval 电话告警每轮间隔（秒）
     */
    public Integer getRoundInterval() {
        return this.RoundInterval;
    }

    /**
     * Set 电话告警每轮间隔（秒）
     * @param RoundInterval 电话告警每轮间隔（秒）
     */
    public void setRoundInterval(Integer RoundInterval) {
        this.RoundInterval = RoundInterval;
    }

    /**
     * Get 电话告警对个人间隔（秒） 
     * @return PersonInterval 电话告警对个人间隔（秒）
     */
    public Integer getPersonInterval() {
        return this.PersonInterval;
    }

    /**
     * Set 电话告警对个人间隔（秒）
     * @param PersonInterval 电话告警对个人间隔（秒）
     */
    public void setPersonInterval(Integer PersonInterval) {
        this.PersonInterval = PersonInterval;
    }

    /**
     * Get 是否需要电话告警触达提示。0不需要，1需要 
     * @return NeedSendNotice 是否需要电话告警触达提示。0不需要，1需要
     */
    public Integer getNeedSendNotice() {
        return this.NeedSendNotice;
    }

    /**
     * Set 是否需要电话告警触达提示。0不需要，1需要
     * @param NeedSendNotice 是否需要电话告警触达提示。0不需要，1需要
     */
    public void setNeedSendNotice(Integer NeedSendNotice) {
        this.NeedSendNotice = NeedSendNotice;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ReceiverGroupList.", this.ReceiverGroupList);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamArraySimple(map, prefix + "UidList.", this.UidList);
        this.setParamSimple(map, prefix + "RoundNumber", this.RoundNumber);
        this.setParamSimple(map, prefix + "RoundInterval", this.RoundInterval);
        this.setParamSimple(map, prefix + "PersonInterval", this.PersonInterval);
        this.setParamSimple(map, prefix + "NeedSendNotice", this.NeedSendNotice);
        this.setParamArraySimple(map, prefix + "SendFor.", this.SendFor);
        this.setParamArraySimple(map, prefix + "RecoverNotify.", this.RecoverNotify);

    }
}

