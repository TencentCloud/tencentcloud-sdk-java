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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetInstancesProtectionRequest  extends AbstractModel{

    /**
    * 伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例是否需要移出保护。
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
     * 获取伸缩组ID。
     * @return AutoScalingGroupId 伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * 设置伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * 获取实例ID。
     * @return InstanceIds 实例ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例ID。
     * @param InstanceIds 实例ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取实例是否需要移出保护。
     * @return ProtectedFromScaleIn 实例是否需要移出保护。
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * 设置实例是否需要移出保护。
     * @param ProtectedFromScaleIn 实例是否需要移出保护。
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);

    }
}

