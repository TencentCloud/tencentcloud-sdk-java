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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWorkloadGroupRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>需要删除的资源组名称</p>
    */
    @SerializedName("WorkloadGroupName")
    @Expose
    private String WorkloadGroupName;

    /**
    * <p>资源组归属的计算组ID</p>
    */
    @SerializedName("ComputeGroup")
    @Expose
    private String ComputeGroup;

    /**
     * Get <p>集群id</p> 
     * @return InstanceId <p>集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群id</p>
     * @param InstanceId <p>集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>需要删除的资源组名称</p> 
     * @return WorkloadGroupName <p>需要删除的资源组名称</p>
     */
    public String getWorkloadGroupName() {
        return this.WorkloadGroupName;
    }

    /**
     * Set <p>需要删除的资源组名称</p>
     * @param WorkloadGroupName <p>需要删除的资源组名称</p>
     */
    public void setWorkloadGroupName(String WorkloadGroupName) {
        this.WorkloadGroupName = WorkloadGroupName;
    }

    /**
     * Get <p>资源组归属的计算组ID</p> 
     * @return ComputeGroup <p>资源组归属的计算组ID</p>
     */
    public String getComputeGroup() {
        return this.ComputeGroup;
    }

    /**
     * Set <p>资源组归属的计算组ID</p>
     * @param ComputeGroup <p>资源组归属的计算组ID</p>
     */
    public void setComputeGroup(String ComputeGroup) {
        this.ComputeGroup = ComputeGroup;
    }

    public DeleteWorkloadGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkloadGroupRequest(DeleteWorkloadGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WorkloadGroupName != null) {
            this.WorkloadGroupName = new String(source.WorkloadGroupName);
        }
        if (source.ComputeGroup != null) {
            this.ComputeGroup = new String(source.ComputeGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "WorkloadGroupName", this.WorkloadGroupName);
        this.setParamSimple(map, prefix + "ComputeGroup", this.ComputeGroup);

    }
}

