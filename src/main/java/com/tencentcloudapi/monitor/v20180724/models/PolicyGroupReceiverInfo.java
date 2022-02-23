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

public class PolicyGroupReceiverInfo extends AbstractModel{

    /**
    * 有效时段结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 是否需要发送通知
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Long NeedSendNotice;

    /**
    * 告警接收渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * 电话告警对个人间隔（秒）
    */
    @SerializedName("PersonInterval")
    @Expose
    private Long PersonInterval;

    /**
    * 消息接收组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Long [] ReceiverGroupList;

    /**
    * 接受者类型
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 接收人列表。通过平台接口查询到的接收人id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Long [] ReceiverUserList;

    /**
    * 告警恢复通知方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
    * 电话告警每轮间隔（秒）
    */
    @SerializedName("RoundInterval")
    @Expose
    private Long RoundInterval;

    /**
    * 电话告警轮数
    */
    @SerializedName("RoundNumber")
    @Expose
    private Long RoundNumber;

    /**
    * 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * 有效时段开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UIDList")
    @Expose
    private Long [] UIDList;

    /**
     * Get 有效时段结束时间 
     * @return EndTime 有效时段结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 有效时段结束时间
     * @param EndTime 有效时段结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否需要发送通知 
     * @return NeedSendNotice 是否需要发送通知
     */
    public Long getNeedSendNotice() {
        return this.NeedSendNotice;
    }

    /**
     * Set 是否需要发送通知
     * @param NeedSendNotice 是否需要发送通知
     */
    public void setNeedSendNotice(Long NeedSendNotice) {
        this.NeedSendNotice = NeedSendNotice;
    }

    /**
     * Get 告警接收渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyWay 告警接收渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set 告警接收渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyWay 告警接收渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
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
     * Get 消息接收组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverGroupList 消息接收组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set 消息接收组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverGroupList 消息接收组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverGroupList(Long [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get 接受者类型 
     * @return ReceiverType 接受者类型
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 接受者类型
     * @param ReceiverType 接受者类型
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 接收人列表。通过平台接口查询到的接收人id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverUserList 接收人列表。通过平台接口查询到的接收人id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set 接收人列表。通过平台接口查询到的接收人id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverUserList 接收人列表。通过平台接口查询到的接收人id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverUserList(Long [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get 告警恢复通知方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoverNotify 告警恢复通知方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRecoverNotify() {
        return this.RecoverNotify;
    }

    /**
     * Set 告警恢复通知方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoverNotify 告警恢复通知方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoverNotify(String [] RecoverNotify) {
        this.RecoverNotify = RecoverNotify;
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
     * Get 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendFor 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSendFor() {
        return this.SendFor;
    }

    /**
     * Set 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendFor 电话告警通知时机。可选"OCCUR"(告警时通知),"RECOVER"(恢复时通知)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendFor(String [] SendFor) {
        this.SendFor = SendFor;
    }

    /**
     * Get 有效时段开始时间 
     * @return StartTime 有效时段开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 有效时段开始时间
     * @param StartTime 有效时段开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UIDList 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getUIDList() {
        return this.UIDList;
    }

    /**
     * Set 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
     * @param UIDList 电话告警接收者uid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUIDList(Long [] UIDList) {
        this.UIDList = UIDList;
    }

    public PolicyGroupReceiverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyGroupReceiverInfo(PolicyGroupReceiverInfo source) {
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NeedSendNotice != null) {
            this.NeedSendNotice = new Long(source.NeedSendNotice);
        }
        if (source.NotifyWay != null) {
            this.NotifyWay = new String[source.NotifyWay.length];
            for (int i = 0; i < source.NotifyWay.length; i++) {
                this.NotifyWay[i] = new String(source.NotifyWay[i]);
            }
        }
        if (source.PersonInterval != null) {
            this.PersonInterval = new Long(source.PersonInterval);
        }
        if (source.ReceiverGroupList != null) {
            this.ReceiverGroupList = new Long[source.ReceiverGroupList.length];
            for (int i = 0; i < source.ReceiverGroupList.length; i++) {
                this.ReceiverGroupList[i] = new Long(source.ReceiverGroupList[i]);
            }
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.ReceiverUserList != null) {
            this.ReceiverUserList = new Long[source.ReceiverUserList.length];
            for (int i = 0; i < source.ReceiverUserList.length; i++) {
                this.ReceiverUserList[i] = new Long(source.ReceiverUserList[i]);
            }
        }
        if (source.RecoverNotify != null) {
            this.RecoverNotify = new String[source.RecoverNotify.length];
            for (int i = 0; i < source.RecoverNotify.length; i++) {
                this.RecoverNotify[i] = new String(source.RecoverNotify[i]);
            }
        }
        if (source.RoundInterval != null) {
            this.RoundInterval = new Long(source.RoundInterval);
        }
        if (source.RoundNumber != null) {
            this.RoundNumber = new Long(source.RoundNumber);
        }
        if (source.SendFor != null) {
            this.SendFor = new String[source.SendFor.length];
            for (int i = 0; i < source.SendFor.length; i++) {
                this.SendFor[i] = new String(source.SendFor[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.UIDList != null) {
            this.UIDList = new Long[source.UIDList.length];
            for (int i = 0; i < source.UIDList.length; i++) {
                this.UIDList[i] = new Long(source.UIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NeedSendNotice", this.NeedSendNotice);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamSimple(map, prefix + "PersonInterval", this.PersonInterval);
        this.setParamArraySimple(map, prefix + "ReceiverGroupList.", this.ReceiverGroupList);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamArraySimple(map, prefix + "RecoverNotify.", this.RecoverNotify);
        this.setParamSimple(map, prefix + "RoundInterval", this.RoundInterval);
        this.setParamSimple(map, prefix + "RoundNumber", this.RoundNumber);
        this.setParamArraySimple(map, prefix + "SendFor.", this.SendFor);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArraySimple(map, prefix + "UIDList.", this.UIDList);

    }
}

