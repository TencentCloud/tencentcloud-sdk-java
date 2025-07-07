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

public class UnBindingAllPolicyObjectRequest extends AbstractModel {

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 告警策略ID，使用此字段时 GroupId 会被忽略
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 事件配置的告警
    */
    @SerializedName("EbSubject")
    @Expose
    private String EbSubject;

    /**
    * 是否配置了事件告警
    */
    @SerializedName("EbEventFlag")
    @Expose
    private Long EbEventFlag;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0 
     * @return GroupId 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
     * @param GroupId 策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 告警策略ID，使用此字段时 GroupId 会被忽略 
     * @return PolicyId 告警策略ID，使用此字段时 GroupId 会被忽略
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略ID，使用此字段时 GroupId 会被忽略
     * @param PolicyId 告警策略ID，使用此字段时 GroupId 会被忽略
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 事件配置的告警 
     * @return EbSubject 事件配置的告警
     */
    public String getEbSubject() {
        return this.EbSubject;
    }

    /**
     * Set 事件配置的告警
     * @param EbSubject 事件配置的告警
     */
    public void setEbSubject(String EbSubject) {
        this.EbSubject = EbSubject;
    }

    /**
     * Get 是否配置了事件告警 
     * @return EbEventFlag 是否配置了事件告警
     */
    public Long getEbEventFlag() {
        return this.EbEventFlag;
    }

    /**
     * Set 是否配置了事件告警
     * @param EbEventFlag 是否配置了事件告警
     */
    public void setEbEventFlag(Long EbEventFlag) {
        this.EbEventFlag = EbEventFlag;
    }

    public UnBindingAllPolicyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindingAllPolicyObjectRequest(UnBindingAllPolicyObjectRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.EbSubject != null) {
            this.EbSubject = new String(source.EbSubject);
        }
        if (source.EbEventFlag != null) {
            this.EbEventFlag = new Long(source.EbEventFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "EbSubject", this.EbSubject);
        this.setParamSimple(map, prefix + "EbEventFlag", this.EbEventFlag);

    }
}

