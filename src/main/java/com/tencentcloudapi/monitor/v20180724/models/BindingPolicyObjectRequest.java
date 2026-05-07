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

public class BindingPolicyObjectRequest extends AbstractModel {

    /**
    * <p>必填。固定值&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>策略组id，例如 4739573。逐渐弃用，建议使用 PolicyId 参数</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>告警策略ID，例如“policy-gh892hg0”。PolicyId 参数与 GroupId 参数至少要填一个，否则会报参数错误，建议使用该参数。若两者同时存在则以该参数为准</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>实例分组ID</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * <p>需要绑定的对象维度信息。当告警对象选择为实例绑定方式时，该参数为必填参数；当告警对象选择为标签绑定、实例分组方式时，该参数为选填参数。</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private BindingPolicyObjectDimension [] Dimensions;

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
     * Get <p>必填。固定值&quot;monitor&quot;</p> 
     * @return Module <p>必填。固定值&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>必填。固定值&quot;monitor&quot;</p>
     * @param Module <p>必填。固定值&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>策略组id，例如 4739573。逐渐弃用，建议使用 PolicyId 参数</p> 
     * @return GroupId <p>策略组id，例如 4739573。逐渐弃用，建议使用 PolicyId 参数</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>策略组id，例如 4739573。逐渐弃用，建议使用 PolicyId 参数</p>
     * @param GroupId <p>策略组id，例如 4739573。逐渐弃用，建议使用 PolicyId 参数</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>告警策略ID，例如“policy-gh892hg0”。PolicyId 参数与 GroupId 参数至少要填一个，否则会报参数错误，建议使用该参数。若两者同时存在则以该参数为准</p> 
     * @return PolicyId <p>告警策略ID，例如“policy-gh892hg0”。PolicyId 参数与 GroupId 参数至少要填一个，否则会报参数错误，建议使用该参数。若两者同时存在则以该参数为准</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略ID，例如“policy-gh892hg0”。PolicyId 参数与 GroupId 参数至少要填一个，否则会报参数错误，建议使用该参数。若两者同时存在则以该参数为准</p>
     * @param PolicyId <p>告警策略ID，例如“policy-gh892hg0”。PolicyId 参数与 GroupId 参数至少要填一个，否则会报参数错误，建议使用该参数。若两者同时存在则以该参数为准</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>实例分组ID</p> 
     * @return InstanceGroupId <p>实例分组ID</p>
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例分组ID</p>
     * @param InstanceGroupId <p>实例分组ID</p>
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>需要绑定的对象维度信息。当告警对象选择为实例绑定方式时，该参数为必填参数；当告警对象选择为标签绑定、实例分组方式时，该参数为选填参数。</p> 
     * @return Dimensions <p>需要绑定的对象维度信息。当告警对象选择为实例绑定方式时，该参数为必填参数；当告警对象选择为标签绑定、实例分组方式时，该参数为选填参数。</p>
     */
    public BindingPolicyObjectDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>需要绑定的对象维度信息。当告警对象选择为实例绑定方式时，该参数为必填参数；当告警对象选择为标签绑定、实例分组方式时，该参数为选填参数。</p>
     * @param Dimensions <p>需要绑定的对象维度信息。当告警对象选择为实例绑定方式时，该参数为必填参数；当告警对象选择为标签绑定、实例分组方式时，该参数为选填参数。</p>
     */
    public void setDimensions(BindingPolicyObjectDimension [] Dimensions) {
        this.Dimensions = Dimensions;
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

    public BindingPolicyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingPolicyObjectRequest(BindingPolicyObjectRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new BindingPolicyObjectDimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new BindingPolicyObjectDimension(source.Dimensions[i]);
            }
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
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "EbSubject", this.EbSubject);
        this.setParamSimple(map, prefix + "EbEventFlag", this.EbEventFlag);

    }
}

