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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationInstanceCreateTasksRequest extends AbstractModel{

    /**
    * 同步实例Id
    */
    @SerializedName("ReplicationRegistryId")
    @Expose
    private String ReplicationRegistryId;

    /**
    * 同步实例的地域ID
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
     * Get 同步实例Id 
     * @return ReplicationRegistryId 同步实例Id
     */
    public String getReplicationRegistryId() {
        return this.ReplicationRegistryId;
    }

    /**
     * Set 同步实例Id
     * @param ReplicationRegistryId 同步实例Id
     */
    public void setReplicationRegistryId(String ReplicationRegistryId) {
        this.ReplicationRegistryId = ReplicationRegistryId;
    }

    /**
     * Get 同步实例的地域ID 
     * @return ReplicationRegionId 同步实例的地域ID
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set 同步实例的地域ID
     * @param ReplicationRegionId 同步实例的地域ID
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationRegistryId", this.ReplicationRegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);

    }
}

