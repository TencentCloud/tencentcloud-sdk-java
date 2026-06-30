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
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>告警策略ID，使用此字段时 GroupId 会被忽略</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>事件配置的告警</p>
    */
    @SerializedName("EbSubject")
    @Expose
    private String EbSubject;

    /**
    * <p>是否配置了事件告警</p>
    */
    @SerializedName("EbEventFlag")
    @Expose
    private Long EbEventFlag;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0</p> 
     * @return GroupId <p>策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0</p>
     * @param GroupId <p>策略组id，如传入 PolicyId 则该字段被忽略可传入任意值如 0</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>告警策略ID，使用此字段时 GroupId 会被忽略</p> 
     * @return PolicyId <p>告警策略ID，使用此字段时 GroupId 会被忽略</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略ID，使用此字段时 GroupId 会被忽略</p>
     * @param PolicyId <p>告警策略ID，使用此字段时 GroupId 会被忽略</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>事件配置的告警</p> 
     * @return EbSubject <p>事件配置的告警</p>
     */
    public String getEbSubject() {
        return this.EbSubject;
    }

    /**
     * Set <p>事件配置的告警</p>
     * @param EbSubject <p>事件配置的告警</p>
     */
    public void setEbSubject(String EbSubject) {
        this.EbSubject = EbSubject;
    }

    /**
     * Get <p>是否配置了事件告警</p> 
     * @return EbEventFlag <p>是否配置了事件告警</p>
     */
    public Long getEbEventFlag() {
        return this.EbEventFlag;
    }

    /**
     * Set <p>是否配置了事件告警</p>
     * @param EbEventFlag <p>是否配置了事件告警</p>
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

