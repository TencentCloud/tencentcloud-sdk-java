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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRiskDnsEventStatusRequest extends AbstractModel {

    /**
    * 恶意请求事件ID数组。加白时必需，否则Filters和EventIDSet二者选其一。
    */
    @SerializedName("EventIDSet")
    @Expose
    private Long [] EventIDSet;

    /**
    * 标记事件的状态：
EVENT_UNDEAL:未处理（取消忽略），
EVENT_DEALED:已处理，
EVENT_IGNORE:忽略，
EVENT_DELETE：已删除
EVENT_ADD_WHITE：加白
EVENT_ISOLATE_CONTAINER：隔离容器
EVENT_RESOTRE_CONTAINER：恢复容器
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * 白名单域名/IP
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 相同的请求域名/IP事件加白处理
    */
    @SerializedName("AllSameEventAddWhite")
    @Expose
    private Boolean AllSameEventAddWhite;

    /**
    * 加白的事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
    */
    @SerializedName("AddWhiteEventType")
    @Expose
    private String AddWhiteEventType;

    /**
     * Get 恶意请求事件ID数组。加白时必需，否则Filters和EventIDSet二者选其一。 
     * @return EventIDSet 恶意请求事件ID数组。加白时必需，否则Filters和EventIDSet二者选其一。
     */
    public Long [] getEventIDSet() {
        return this.EventIDSet;
    }

    /**
     * Set 恶意请求事件ID数组。加白时必需，否则Filters和EventIDSet二者选其一。
     * @param EventIDSet 恶意请求事件ID数组。加白时必需，否则Filters和EventIDSet二者选其一。
     */
    public void setEventIDSet(Long [] EventIDSet) {
        this.EventIDSet = EventIDSet;
    }

    /**
     * Get 标记事件的状态：
EVENT_UNDEAL:未处理（取消忽略），
EVENT_DEALED:已处理，
EVENT_IGNORE:忽略，
EVENT_DELETE：已删除
EVENT_ADD_WHITE：加白
EVENT_ISOLATE_CONTAINER：隔离容器
EVENT_RESOTRE_CONTAINER：恢复容器 
     * @return EventStatus 标记事件的状态：
EVENT_UNDEAL:未处理（取消忽略），
EVENT_DEALED:已处理，
EVENT_IGNORE:忽略，
EVENT_DELETE：已删除
EVENT_ADD_WHITE：加白
EVENT_ISOLATE_CONTAINER：隔离容器
EVENT_RESOTRE_CONTAINER：恢复容器
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 标记事件的状态：
EVENT_UNDEAL:未处理（取消忽略），
EVENT_DEALED:已处理，
EVENT_IGNORE:忽略，
EVENT_DELETE：已删除
EVENT_ADD_WHITE：加白
EVENT_ISOLATE_CONTAINER：隔离容器
EVENT_RESOTRE_CONTAINER：恢复容器
     * @param EventStatus 标记事件的状态：
EVENT_UNDEAL:未处理（取消忽略），
EVENT_DEALED:已处理，
EVENT_IGNORE:忽略，
EVENT_DELETE：已删除
EVENT_ADD_WHITE：加白
EVENT_ISOLATE_CONTAINER：隔离容器
EVENT_RESOTRE_CONTAINER：恢复容器
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 白名单域名/IP 
     * @return Address 白名单域名/IP
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 白名单域名/IP
     * @param Address 白名单域名/IP
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 相同的请求域名/IP事件加白处理 
     * @return AllSameEventAddWhite 相同的请求域名/IP事件加白处理
     */
    public Boolean getAllSameEventAddWhite() {
        return this.AllSameEventAddWhite;
    }

    /**
     * Set 相同的请求域名/IP事件加白处理
     * @param AllSameEventAddWhite 相同的请求域名/IP事件加白处理
     */
    public void setAllSameEventAddWhite(Boolean AllSameEventAddWhite) {
        this.AllSameEventAddWhite = AllSameEventAddWhite;
    }

    /**
     * Get 加白的事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP 
     * @return AddWhiteEventType 加白的事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
     */
    public String getAddWhiteEventType() {
        return this.AddWhiteEventType;
    }

    /**
     * Set 加白的事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
     * @param AddWhiteEventType 加白的事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
     */
    public void setAddWhiteEventType(String AddWhiteEventType) {
        this.AddWhiteEventType = AddWhiteEventType;
    }

    public ModifyRiskDnsEventStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskDnsEventStatusRequest(ModifyRiskDnsEventStatusRequest source) {
        if (source.EventIDSet != null) {
            this.EventIDSet = new Long[source.EventIDSet.length];
            for (int i = 0; i < source.EventIDSet.length; i++) {
                this.EventIDSet[i] = new Long(source.EventIDSet[i]);
            }
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AllSameEventAddWhite != null) {
            this.AllSameEventAddWhite = new Boolean(source.AllSameEventAddWhite);
        }
        if (source.AddWhiteEventType != null) {
            this.AddWhiteEventType = new String(source.AddWhiteEventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIDSet.", this.EventIDSet);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AllSameEventAddWhite", this.AllSameEventAddWhite);
        this.setParamSimple(map, prefix + "AddWhiteEventType", this.AddWhiteEventType);

    }
}

