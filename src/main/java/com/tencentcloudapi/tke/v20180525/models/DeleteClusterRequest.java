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

public class DeleteClusterRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例） retain （仅移除，保留实例）
    */
    @SerializedName("InstanceDeleteMode")
    @Expose
    private String InstanceDeleteMode;

    /**
    * 集群删除时资源的删除策略，目前支持CBS（默认保留CBS）
    */
    @SerializedName("ResourceDeleteOptions")
    @Expose
    private ResourceDeleteOption [] ResourceDeleteOptions;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例） retain （仅移除，保留实例） 
     * @return InstanceDeleteMode 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例） retain （仅移除，保留实例）
     */
    public String getInstanceDeleteMode() {
        return this.InstanceDeleteMode;
    }

    /**
     * Set 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例） retain （仅移除，保留实例）
     * @param InstanceDeleteMode 集群实例删除时的策略：terminate（销毁实例，仅支持按量计费云主机实例） retain （仅移除，保留实例）
     */
    public void setInstanceDeleteMode(String InstanceDeleteMode) {
        this.InstanceDeleteMode = InstanceDeleteMode;
    }

    /**
     * Get 集群删除时资源的删除策略，目前支持CBS（默认保留CBS） 
     * @return ResourceDeleteOptions 集群删除时资源的删除策略，目前支持CBS（默认保留CBS）
     */
    public ResourceDeleteOption [] getResourceDeleteOptions() {
        return this.ResourceDeleteOptions;
    }

    /**
     * Set 集群删除时资源的删除策略，目前支持CBS（默认保留CBS）
     * @param ResourceDeleteOptions 集群删除时资源的删除策略，目前支持CBS（默认保留CBS）
     */
    public void setResourceDeleteOptions(ResourceDeleteOption [] ResourceDeleteOptions) {
        this.ResourceDeleteOptions = ResourceDeleteOptions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceDeleteMode", this.InstanceDeleteMode);
        this.setParamArrayObj(map, prefix + "ResourceDeleteOptions.", this.ResourceDeleteOptions);

    }
}

