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

public class StopAutoScalingInstancesRequest extends AbstractModel{

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 待关闭的CVM实例ID列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 关闭的实例是否收费，取值为：  
KEEP_CHARGING：关机继续收费  
STOP_CHARGING：关机停止收费
默认为 KEEP_CHARGING
    */
    @SerializedName("StoppedMode")
    @Expose
    private String StoppedMode;

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
     * Get 待关闭的CVM实例ID列表 
     * @return InstanceIds 待关闭的CVM实例ID列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待关闭的CVM实例ID列表
     * @param InstanceIds 待关闭的CVM实例ID列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 关闭的实例是否收费，取值为：  
KEEP_CHARGING：关机继续收费  
STOP_CHARGING：关机停止收费
默认为 KEEP_CHARGING 
     * @return StoppedMode 关闭的实例是否收费，取值为：  
KEEP_CHARGING：关机继续收费  
STOP_CHARGING：关机停止收费
默认为 KEEP_CHARGING
     */
    public String getStoppedMode() {
        return this.StoppedMode;
    }

    /**
     * Set 关闭的实例是否收费，取值为：  
KEEP_CHARGING：关机继续收费  
STOP_CHARGING：关机停止收费
默认为 KEEP_CHARGING
     * @param StoppedMode 关闭的实例是否收费，取值为：  
KEEP_CHARGING：关机继续收费  
STOP_CHARGING：关机停止收费
默认为 KEEP_CHARGING
     */
    public void setStoppedMode(String StoppedMode) {
        this.StoppedMode = StoppedMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "StoppedMode", this.StoppedMode);

    }
}

