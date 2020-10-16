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

public class ReplicationRegistry extends AbstractModel{

    /**
    * 主实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 复制实例ID
    */
    @SerializedName("ReplicationRegistryId")
    @Expose
    private String ReplicationRegistryId;

    /**
    * 复制实例的地域ID
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
    * 复制实例的地域名称
    */
    @SerializedName("ReplicationRegionName")
    @Expose
    private String ReplicationRegionName;

    /**
    * 复制实例的状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get 主实例ID 
     * @return RegistryId 主实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 主实例ID
     * @param RegistryId 主实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 复制实例ID 
     * @return ReplicationRegistryId 复制实例ID
     */
    public String getReplicationRegistryId() {
        return this.ReplicationRegistryId;
    }

    /**
     * Set 复制实例ID
     * @param ReplicationRegistryId 复制实例ID
     */
    public void setReplicationRegistryId(String ReplicationRegistryId) {
        this.ReplicationRegistryId = ReplicationRegistryId;
    }

    /**
     * Get 复制实例的地域ID 
     * @return ReplicationRegionId 复制实例的地域ID
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set 复制实例的地域ID
     * @param ReplicationRegionId 复制实例的地域ID
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Get 复制实例的地域名称 
     * @return ReplicationRegionName 复制实例的地域名称
     */
    public String getReplicationRegionName() {
        return this.ReplicationRegionName;
    }

    /**
     * Set 复制实例的地域名称
     * @param ReplicationRegionName 复制实例的地域名称
     */
    public void setReplicationRegionName(String ReplicationRegionName) {
        this.ReplicationRegionName = ReplicationRegionName;
    }

    /**
     * Get 复制实例的状态 
     * @return Status 复制实例的状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 复制实例的状态
     * @param Status 复制实例的状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegistryId", this.ReplicationRegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);
        this.setParamSimple(map, prefix + "ReplicationRegionName", this.ReplicationRegionName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

