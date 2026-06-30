/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyGroupReceiverInfo extends AbstractModel {

    /**
    * <p>有效时段结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>是否需要发送通知</p>
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Long NeedSendNotice;

    /**
    * <p>告警接收渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * <p>电话告警对个人间隔（秒）</p>
    */
    @SerializedName("PersonInterval")
    @Expose
    private Long PersonInterval;

    /**
    * <p>消息接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Long [] ReceiverGroupList;

    /**
    * <p>接受者类型</p>
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * <p>接收人列表。通过平台接口查询到的接收人id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Long [] ReceiverUserList;

    /**
    * <p>告警恢复通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
    * <p>电话告警每轮间隔（秒）</p>
    */
    @SerializedName("RoundInterval")
    @Expose
    private Long RoundInterval;

    /**
    * <p>电话告警轮数</p>
    */
    @SerializedName("RoundNumber")
    @Expose
    private Long RoundNumber;

    /**
    * <p>电话告警通知时机。可选&quot;OCCUR&quot;(告警时通知),&quot;RECOVER&quot;(恢复时通知)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * <p>有效时段开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>电话告警接收者uid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UIDList")
    @Expose
    private Long [] UIDList;

    /**
     * Get <p>有效时段结束时间</p> 
     * @return EndTime <p>有效时段结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>有效时段结束时间</p>
     * @param EndTime <p>有效时段结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>是否需要发送通知</p> 
     * @return NeedSendNotice <p>是否需要发送通知</p>
     */
    public Long getNeedSendNotice() {
        return this.NeedSendNotice;
    }

    /**
     * Set <p>是否需要发送通知</p>
     * @param NeedSendNotice <p>是否需要发送通知</p>
     */
    public void setNeedSendNotice(Long NeedSendNotice) {
        this.NeedSendNotice = NeedSendNotice;
    }

    /**
     * Get <p>告警接收渠道</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyWay <p>告警接收渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set <p>告警接收渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyWay <p>告警接收渠道</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get <p>电话告警对个人间隔（秒）</p> 
     * @return PersonInterval <p>电话告警对个人间隔（秒）</p>
     */
    public Long getPersonInterval() {
        return this.PersonInterval;
    }

    /**
     * Set <p>电话告警对个人间隔（秒）</p>
     * @param PersonInterval <p>电话告警对个人间隔（秒）</p>
     */
    public void setPersonInterval(Long PersonInterval) {
        this.PersonInterval = PersonInterval;
    }

    /**
     * Get <p>消息接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverGroupList <p>消息接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set <p>消息接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverGroupList <p>消息接收组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverGroupList(Long [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get <p>接受者类型</p> 
     * @return ReceiverType <p>接受者类型</p>
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set <p>接受者类型</p>
     * @param ReceiverType <p>接受者类型</p>
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get <p>接收人列表。通过平台接口查询到的接收人id列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverUserList <p>接收人列表。通过平台接口查询到的接收人id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set <p>接收人列表。通过平台接口查询到的接收人id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverUserList <p>接收人列表。通过平台接口查询到的接收人id列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverUserList(Long [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get <p>告警恢复通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoverNotify <p>告警恢复通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRecoverNotify() {
        return this.RecoverNotify;
    }

    /**
     * Set <p>告警恢复通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoverNotify <p>告警恢复通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoverNotify(String [] RecoverNotify) {
        this.RecoverNotify = RecoverNotify;
    }

    /**
     * Get <p>电话告警每轮间隔（秒）</p> 
     * @return RoundInterval <p>电话告警每轮间隔（秒）</p>
     */
    public Long getRoundInterval() {
        return this.RoundInterval;
    }

    /**
     * Set <p>电话告警每轮间隔（秒）</p>
     * @param RoundInterval <p>电话告警每轮间隔（秒）</p>
     */
    public void setRoundInterval(Long RoundInterval) {
        this.RoundInterval = RoundInterval;
    }

    /**
     * Get <p>电话告警轮数</p> 
     * @return RoundNumber <p>电话告警轮数</p>
     */
    public Long getRoundNumber() {
        return this.RoundNumber;
    }

    /**
     * Set <p>电话告警轮数</p>
     * @param RoundNumber <p>电话告警轮数</p>
     */
    public void setRoundNumber(Long RoundNumber) {
        this.RoundNumber = RoundNumber;
    }

    /**
     * Get <p>电话告警通知时机。可选&quot;OCCUR&quot;(告警时通知),&quot;RECOVER&quot;(恢复时通知)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendFor <p>电话告警通知时机。可选&quot;OCCUR&quot;(告警时通知),&quot;RECOVER&quot;(恢复时通知)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSendFor() {
        return this.SendFor;
    }

    /**
     * Set <p>电话告警通知时机。可选&quot;OCCUR&quot;(告警时通知),&quot;RECOVER&quot;(恢复时通知)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendFor <p>电话告警通知时机。可选&quot;OCCUR&quot;(告警时通知),&quot;RECOVER&quot;(恢复时通知)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendFor(String [] SendFor) {
        this.SendFor = SendFor;
    }

    /**
     * Get <p>有效时段开始时间</p> 
     * @return StartTime <p>有效时段开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>有效时段开始时间</p>
     * @param StartTime <p>有效时段开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>电话告警接收者uid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UIDList <p>电话告警接收者uid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getUIDList() {
        return this.UIDList;
    }

    /**
     * Set <p>电话告警接收者uid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UIDList <p>电话告警接收者uid</p>
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

