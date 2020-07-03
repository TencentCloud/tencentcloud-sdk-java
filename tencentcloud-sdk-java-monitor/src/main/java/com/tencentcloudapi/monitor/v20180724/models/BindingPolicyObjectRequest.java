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

public class BindingPolicyObjectRequest extends AbstractModel{

    /**
    * 策略分组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 必填。固定值"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 实例分组ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 需要绑定的对象维度信息
    */
    @SerializedName("Dimensions")
    @Expose
    private BindingPolicyObjectDimension [] Dimensions;

    /**
     * Get 策略分组Id 
     * @return GroupId 策略分组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略分组Id
     * @param GroupId 策略分组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 必填。固定值"monitor" 
     * @return Module 必填。固定值"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 必填。固定值"monitor"
     * @param Module 必填。固定值"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
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

    /**
     * Get 需要绑定的对象维度信息 
     * @return Dimensions 需要绑定的对象维度信息
     */
    public BindingPolicyObjectDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 需要绑定的对象维度信息
     * @param Dimensions 需要绑定的对象维度信息
     */
    public void setDimensions(BindingPolicyObjectDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

