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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalUserEventInfo extends AbstractModel{

    /**
    * 事件编码, 添加外部联系人(ADD_EXTERNAL_CUSTOMER)/成员删除外部联系人(DELETE_EXTERNAL_CUSTOMER)/外部联系人删除成员(DELETE_FOLLOW_USER)
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * 外部联系人id
    */
    @SerializedName("ExternalUserId")
    @Expose
    private String ExternalUserId;

    /**
    * 企微SaaS的成员id
    */
    @SerializedName("SalesId")
    @Expose
    private String SalesId;

    /**
    * 事件上报时间戳，单位：秒
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
     * Get 事件编码, 添加外部联系人(ADD_EXTERNAL_CUSTOMER)/成员删除外部联系人(DELETE_EXTERNAL_CUSTOMER)/外部联系人删除成员(DELETE_FOLLOW_USER) 
     * @return EventCode 事件编码, 添加外部联系人(ADD_EXTERNAL_CUSTOMER)/成员删除外部联系人(DELETE_EXTERNAL_CUSTOMER)/外部联系人删除成员(DELETE_FOLLOW_USER)
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件编码, 添加外部联系人(ADD_EXTERNAL_CUSTOMER)/成员删除外部联系人(DELETE_EXTERNAL_CUSTOMER)/外部联系人删除成员(DELETE_FOLLOW_USER)
     * @param EventCode 事件编码, 添加外部联系人(ADD_EXTERNAL_CUSTOMER)/成员删除外部联系人(DELETE_EXTERNAL_CUSTOMER)/外部联系人删除成员(DELETE_FOLLOW_USER)
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get 外部联系人id 
     * @return ExternalUserId 外部联系人id
     */
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    /**
     * Set 外部联系人id
     * @param ExternalUserId 外部联系人id
     */
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    /**
     * Get 企微SaaS的成员id 
     * @return SalesId 企微SaaS的成员id
     */
    public String getSalesId() {
        return this.SalesId;
    }

    /**
     * Set 企微SaaS的成员id
     * @param SalesId 企微SaaS的成员id
     */
    public void setSalesId(String SalesId) {
        this.SalesId = SalesId;
    }

    /**
     * Get 事件上报时间戳，单位：秒 
     * @return EventTime 事件上报时间戳，单位：秒
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件上报时间戳，单位：秒
     * @param EventTime 事件上报时间戳，单位：秒
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    public ExternalUserEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalUserEventInfo(ExternalUserEventInfo source) {
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.ExternalUserId != null) {
            this.ExternalUserId = new String(source.ExternalUserId);
        }
        if (source.SalesId != null) {
            this.SalesId = new String(source.SalesId);
        }
        if (source.EventTime != null) {
            this.EventTime = new Long(source.EventTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "ExternalUserId", this.ExternalUserId);
        this.setParamSimple(map, prefix + "SalesId", this.SalesId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);

    }
}

