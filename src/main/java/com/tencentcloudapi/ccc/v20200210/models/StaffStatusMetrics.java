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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffStatusMetrics extends AbstractModel {

    /**
    * 座席邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 座席状态补充信息
    */
    @SerializedName("StatusExtra")
    @Expose
    private StaffStatusExtra StatusExtra;

    /**
    * 当天在线总时长
    */
    @SerializedName("OnlineDuration")
    @Expose
    private Long OnlineDuration;

    /**
    * 当天示闲总时长
    */
    @SerializedName("FreeDuration")
    @Expose
    private Long FreeDuration;

    /**
    * 当天忙碌总时长
    */
    @SerializedName("BusyDuration")
    @Expose
    private Long BusyDuration;

    /**
    * 当天示忙总时长
    */
    @SerializedName("NotReadyDuration")
    @Expose
    private Long NotReadyDuration;

    /**
    * 当天小休总时长
    */
    @SerializedName("RestDuration")
    @Expose
    private Long RestDuration;

    /**
    * 当天话后调整总时长
    */
    @SerializedName("AfterCallWorkDuration")
    @Expose
    private Long AfterCallWorkDuration;

    /**
    * 小休原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 是否预约小休
    */
    @SerializedName("ReserveRest")
    @Expose
    private Boolean ReserveRest;

    /**
    * 是否预约示忙
    */
    @SerializedName("ReserveNotReady")
    @Expose
    private Boolean ReserveNotReady;

    /**
    * 手机接听模式： 0 - 关闭 | 1 - 仅离线 | 2- 始终
    */
    @SerializedName("UseMobileAccept")
    @Expose
    private Long UseMobileAccept;

    /**
    * 手机外呼开关
    */
    @SerializedName("UseMobileCallOut")
    @Expose
    private Boolean UseMobileCallOut;

    /**
    * 最近一次上线时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOnlineTimestamp")
    @Expose
    private Long LastOnlineTimestamp;

    /**
    * 最近一次状态时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastStatusTimestamp")
    @Expose
    private Long LastStatusTimestamp;

    /**
    * 客服登录的端信息
    */
    @SerializedName("ClientInfo")
    @Expose
    private ClientInfo [] ClientInfo;

    /**
     * Get 座席邮箱 
     * @return Email 座席邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 座席邮箱
     * @param Email 座席邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线 
     * @return Status 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
     * @param Status 座席状态 free 示闲 | busy 忙碌 | rest 小休 | notReady 示忙 | afterCallWork 话后调整 | offline 离线
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 座席状态补充信息 
     * @return StatusExtra 座席状态补充信息
     */
    public StaffStatusExtra getStatusExtra() {
        return this.StatusExtra;
    }

    /**
     * Set 座席状态补充信息
     * @param StatusExtra 座席状态补充信息
     */
    public void setStatusExtra(StaffStatusExtra StatusExtra) {
        this.StatusExtra = StatusExtra;
    }

    /**
     * Get 当天在线总时长 
     * @return OnlineDuration 当天在线总时长
     */
    public Long getOnlineDuration() {
        return this.OnlineDuration;
    }

    /**
     * Set 当天在线总时长
     * @param OnlineDuration 当天在线总时长
     */
    public void setOnlineDuration(Long OnlineDuration) {
        this.OnlineDuration = OnlineDuration;
    }

    /**
     * Get 当天示闲总时长 
     * @return FreeDuration 当天示闲总时长
     */
    public Long getFreeDuration() {
        return this.FreeDuration;
    }

    /**
     * Set 当天示闲总时长
     * @param FreeDuration 当天示闲总时长
     */
    public void setFreeDuration(Long FreeDuration) {
        this.FreeDuration = FreeDuration;
    }

    /**
     * Get 当天忙碌总时长 
     * @return BusyDuration 当天忙碌总时长
     */
    public Long getBusyDuration() {
        return this.BusyDuration;
    }

    /**
     * Set 当天忙碌总时长
     * @param BusyDuration 当天忙碌总时长
     */
    public void setBusyDuration(Long BusyDuration) {
        this.BusyDuration = BusyDuration;
    }

    /**
     * Get 当天示忙总时长 
     * @return NotReadyDuration 当天示忙总时长
     */
    public Long getNotReadyDuration() {
        return this.NotReadyDuration;
    }

    /**
     * Set 当天示忙总时长
     * @param NotReadyDuration 当天示忙总时长
     */
    public void setNotReadyDuration(Long NotReadyDuration) {
        this.NotReadyDuration = NotReadyDuration;
    }

    /**
     * Get 当天小休总时长 
     * @return RestDuration 当天小休总时长
     */
    public Long getRestDuration() {
        return this.RestDuration;
    }

    /**
     * Set 当天小休总时长
     * @param RestDuration 当天小休总时长
     */
    public void setRestDuration(Long RestDuration) {
        this.RestDuration = RestDuration;
    }

    /**
     * Get 当天话后调整总时长 
     * @return AfterCallWorkDuration 当天话后调整总时长
     */
    public Long getAfterCallWorkDuration() {
        return this.AfterCallWorkDuration;
    }

    /**
     * Set 当天话后调整总时长
     * @param AfterCallWorkDuration 当天话后调整总时长
     */
    public void setAfterCallWorkDuration(Long AfterCallWorkDuration) {
        this.AfterCallWorkDuration = AfterCallWorkDuration;
    }

    /**
     * Get 小休原因 
     * @return Reason 小休原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 小休原因
     * @param Reason 小休原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 是否预约小休 
     * @return ReserveRest 是否预约小休
     */
    public Boolean getReserveRest() {
        return this.ReserveRest;
    }

    /**
     * Set 是否预约小休
     * @param ReserveRest 是否预约小休
     */
    public void setReserveRest(Boolean ReserveRest) {
        this.ReserveRest = ReserveRest;
    }

    /**
     * Get 是否预约示忙 
     * @return ReserveNotReady 是否预约示忙
     */
    public Boolean getReserveNotReady() {
        return this.ReserveNotReady;
    }

    /**
     * Set 是否预约示忙
     * @param ReserveNotReady 是否预约示忙
     */
    public void setReserveNotReady(Boolean ReserveNotReady) {
        this.ReserveNotReady = ReserveNotReady;
    }

    /**
     * Get 手机接听模式： 0 - 关闭 | 1 - 仅离线 | 2- 始终 
     * @return UseMobileAccept 手机接听模式： 0 - 关闭 | 1 - 仅离线 | 2- 始终
     */
    public Long getUseMobileAccept() {
        return this.UseMobileAccept;
    }

    /**
     * Set 手机接听模式： 0 - 关闭 | 1 - 仅离线 | 2- 始终
     * @param UseMobileAccept 手机接听模式： 0 - 关闭 | 1 - 仅离线 | 2- 始终
     */
    public void setUseMobileAccept(Long UseMobileAccept) {
        this.UseMobileAccept = UseMobileAccept;
    }

    /**
     * Get 手机外呼开关 
     * @return UseMobileCallOut 手机外呼开关
     */
    public Boolean getUseMobileCallOut() {
        return this.UseMobileCallOut;
    }

    /**
     * Set 手机外呼开关
     * @param UseMobileCallOut 手机外呼开关
     */
    public void setUseMobileCallOut(Boolean UseMobileCallOut) {
        this.UseMobileCallOut = UseMobileCallOut;
    }

    /**
     * Get 最近一次上线时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOnlineTimestamp 最近一次上线时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastOnlineTimestamp() {
        return this.LastOnlineTimestamp;
    }

    /**
     * Set 最近一次上线时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOnlineTimestamp 最近一次上线时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOnlineTimestamp(Long LastOnlineTimestamp) {
        this.LastOnlineTimestamp = LastOnlineTimestamp;
    }

    /**
     * Get 最近一次状态时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastStatusTimestamp 最近一次状态时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastStatusTimestamp() {
        return this.LastStatusTimestamp;
    }

    /**
     * Set 最近一次状态时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastStatusTimestamp 最近一次状态时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastStatusTimestamp(Long LastStatusTimestamp) {
        this.LastStatusTimestamp = LastStatusTimestamp;
    }

    /**
     * Get 客服登录的端信息 
     * @return ClientInfo 客服登录的端信息
     */
    public ClientInfo [] getClientInfo() {
        return this.ClientInfo;
    }

    /**
     * Set 客服登录的端信息
     * @param ClientInfo 客服登录的端信息
     */
    public void setClientInfo(ClientInfo [] ClientInfo) {
        this.ClientInfo = ClientInfo;
    }

    public StaffStatusMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffStatusMetrics(StaffStatusMetrics source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusExtra != null) {
            this.StatusExtra = new StaffStatusExtra(source.StatusExtra);
        }
        if (source.OnlineDuration != null) {
            this.OnlineDuration = new Long(source.OnlineDuration);
        }
        if (source.FreeDuration != null) {
            this.FreeDuration = new Long(source.FreeDuration);
        }
        if (source.BusyDuration != null) {
            this.BusyDuration = new Long(source.BusyDuration);
        }
        if (source.NotReadyDuration != null) {
            this.NotReadyDuration = new Long(source.NotReadyDuration);
        }
        if (source.RestDuration != null) {
            this.RestDuration = new Long(source.RestDuration);
        }
        if (source.AfterCallWorkDuration != null) {
            this.AfterCallWorkDuration = new Long(source.AfterCallWorkDuration);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ReserveRest != null) {
            this.ReserveRest = new Boolean(source.ReserveRest);
        }
        if (source.ReserveNotReady != null) {
            this.ReserveNotReady = new Boolean(source.ReserveNotReady);
        }
        if (source.UseMobileAccept != null) {
            this.UseMobileAccept = new Long(source.UseMobileAccept);
        }
        if (source.UseMobileCallOut != null) {
            this.UseMobileCallOut = new Boolean(source.UseMobileCallOut);
        }
        if (source.LastOnlineTimestamp != null) {
            this.LastOnlineTimestamp = new Long(source.LastOnlineTimestamp);
        }
        if (source.LastStatusTimestamp != null) {
            this.LastStatusTimestamp = new Long(source.LastStatusTimestamp);
        }
        if (source.ClientInfo != null) {
            this.ClientInfo = new ClientInfo[source.ClientInfo.length];
            for (int i = 0; i < source.ClientInfo.length; i++) {
                this.ClientInfo[i] = new ClientInfo(source.ClientInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "StatusExtra.", this.StatusExtra);
        this.setParamSimple(map, prefix + "OnlineDuration", this.OnlineDuration);
        this.setParamSimple(map, prefix + "FreeDuration", this.FreeDuration);
        this.setParamSimple(map, prefix + "BusyDuration", this.BusyDuration);
        this.setParamSimple(map, prefix + "NotReadyDuration", this.NotReadyDuration);
        this.setParamSimple(map, prefix + "RestDuration", this.RestDuration);
        this.setParamSimple(map, prefix + "AfterCallWorkDuration", this.AfterCallWorkDuration);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ReserveRest", this.ReserveRest);
        this.setParamSimple(map, prefix + "ReserveNotReady", this.ReserveNotReady);
        this.setParamSimple(map, prefix + "UseMobileAccept", this.UseMobileAccept);
        this.setParamSimple(map, prefix + "UseMobileCallOut", this.UseMobileCallOut);
        this.setParamSimple(map, prefix + "LastOnlineTimestamp", this.LastOnlineTimestamp);
        this.setParamSimple(map, prefix + "LastStatusTimestamp", this.LastStatusTimestamp);
        this.setParamArrayObj(map, prefix + "ClientInfo.", this.ClientInfo);

    }
}

