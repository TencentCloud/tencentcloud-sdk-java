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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterAsGroupAttribute extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 是否开启
    */
    @SerializedName("AutoScalingGroupEnabled")
    @Expose
    private Boolean AutoScalingGroupEnabled;

    /**
    * 伸缩组最大最小实例数
    */
    @SerializedName("AutoScalingGroupRange")
    @Expose
    private AutoScalingGroupRange AutoScalingGroupRange;

    /**
     * Get 伸缩组ID 
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 是否开启 
     * @return AutoScalingGroupEnabled 是否开启
     */
    public Boolean getAutoScalingGroupEnabled() {
        return this.AutoScalingGroupEnabled;
    }

    /**
     * Set 是否开启
     * @param AutoScalingGroupEnabled 是否开启
     */
    public void setAutoScalingGroupEnabled(Boolean AutoScalingGroupEnabled) {
        this.AutoScalingGroupEnabled = AutoScalingGroupEnabled;
    }

    /**
     * Get 伸缩组最大最小实例数 
     * @return AutoScalingGroupRange 伸缩组最大最小实例数
     */
    public AutoScalingGroupRange getAutoScalingGroupRange() {
        return this.AutoScalingGroupRange;
    }

    /**
     * Set 伸缩组最大最小实例数
     * @param AutoScalingGroupRange 伸缩组最大最小实例数
     */
    public void setAutoScalingGroupRange(AutoScalingGroupRange AutoScalingGroupRange) {
        this.AutoScalingGroupRange = AutoScalingGroupRange;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupEnabled", this.AutoScalingGroupEnabled);
        this.setParamObj(map, prefix + "AutoScalingGroupRange.", this.AutoScalingGroupRange);

    }
}

