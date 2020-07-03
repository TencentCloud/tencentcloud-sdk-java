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

public class DescribeAutoScalingGroupLastActivitiesRequest extends AbstractModel{

    /**
    * 伸缩组ID列表
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
     * Get 伸缩组ID列表 
     * @return AutoScalingGroupIds 伸缩组ID列表
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set 伸缩组ID列表
     * @param AutoScalingGroupIds 伸缩组ID列表
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);

    }
}

