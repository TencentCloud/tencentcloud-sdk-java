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

public class BindingPolicyTagRequest extends AbstractModel{

    /**
    * 固定取值 monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 策略标签
    */
    @SerializedName("Tag")
    @Expose
    private PolicyTag Tag;

    /**
    * 产品类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 实例分组ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
     * Get 固定取值 monitor 
     * @return Module 固定取值 monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定取值 monitor
     * @param Module 固定取值 monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID 
     * @return GroupId 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
     * @param GroupId 用于实例、实例组绑定和解绑接口（BindingPolicyObject、UnBindingAllPolicyObject、UnBindingPolicyObject）的策略 ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 策略标签 
     * @return Tag 策略标签
     */
    public PolicyTag getTag() {
        return this.Tag;
    }

    /**
     * Set 策略标签
     * @param Tag 策略标签
     */
    public void setTag(PolicyTag Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 产品类型 
     * @return ServiceType 产品类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 产品类型
     * @param ServiceType 产品类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 实例分组ID 
     * @return InstanceGroupId 实例分组ID
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组ID
     * @param InstanceGroupId 实例分组ID
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    public BindingPolicyTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingPolicyTagRequest(BindingPolicyTagRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Tag != null) {
            this.Tag = new PolicyTag(source.Tag);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);

    }
}

