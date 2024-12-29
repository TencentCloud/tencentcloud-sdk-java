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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNodeResourceConfigRequest extends AbstractModel {

    /**
    * 集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点配置Id
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private Long ResourceConfigId;

    /**
    * 节点类型 CORE TASK ROUTER
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 类型为ComputeResource和EMR以及默认，默认为EMR
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * 计算资源id
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get 集群实例Id 
     * @return InstanceId 集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id
     * @param InstanceId 集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点配置Id 
     * @return ResourceConfigId 节点配置Id
     */
    public Long getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set 节点配置Id
     * @param ResourceConfigId 节点配置Id
     */
    public void setResourceConfigId(Long ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get 节点类型 CORE TASK ROUTER 
     * @return ResourceType 节点类型 CORE TASK ROUTER
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 节点类型 CORE TASK ROUTER
     * @param ResourceType 节点类型 CORE TASK ROUTER
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 类型为ComputeResource和EMR以及默认，默认为EMR 
     * @return ResourceBaseType 类型为ComputeResource和EMR以及默认，默认为EMR
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set 类型为ComputeResource和EMR以及默认，默认为EMR
     * @param ResourceBaseType 类型为ComputeResource和EMR以及默认，默认为EMR
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get 计算资源id 
     * @return ComputeResourceId 计算资源id
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set 计算资源id
     * @param ComputeResourceId 计算资源id
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    public DeleteNodeResourceConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNodeResourceConfigRequest(DeleteNodeResourceConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new Long(source.ResourceConfigId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);

    }
}

