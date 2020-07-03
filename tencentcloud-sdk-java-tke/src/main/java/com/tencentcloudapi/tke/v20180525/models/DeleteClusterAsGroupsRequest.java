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

public class DeleteClusterAsGroupsRequest extends AbstractModel{

    /**
    * 集群ID，通过[DescribeClusters](https://cloud.tencent.com/document/api/457/31862)接口获取。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群伸缩组ID的列表
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
    * 是否保留伸缩组中的节点(默认值： false(不保留))
    */
    @SerializedName("KeepInstance")
    @Expose
    private Boolean KeepInstance;

    /**
     * Get 集群ID，通过[DescribeClusters](https://cloud.tencent.com/document/api/457/31862)接口获取。 
     * @return ClusterId 集群ID，通过[DescribeClusters](https://cloud.tencent.com/document/api/457/31862)接口获取。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，通过[DescribeClusters](https://cloud.tencent.com/document/api/457/31862)接口获取。
     * @param ClusterId 集群ID，通过[DescribeClusters](https://cloud.tencent.com/document/api/457/31862)接口获取。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群伸缩组ID的列表 
     * @return AutoScalingGroupIds 集群伸缩组ID的列表
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set 集群伸缩组ID的列表
     * @param AutoScalingGroupIds 集群伸缩组ID的列表
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Get 是否保留伸缩组中的节点(默认值： false(不保留)) 
     * @return KeepInstance 是否保留伸缩组中的节点(默认值： false(不保留))
     */
    public Boolean getKeepInstance() {
        return this.KeepInstance;
    }

    /**
     * Set 是否保留伸缩组中的节点(默认值： false(不保留))
     * @param KeepInstance 是否保留伸缩组中的节点(默认值： false(不保留))
     */
    public void setKeepInstance(Boolean KeepInstance) {
        this.KeepInstance = KeepInstance;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);
        this.setParamSimple(map, prefix + "KeepInstance", this.KeepInstance);

    }
}

