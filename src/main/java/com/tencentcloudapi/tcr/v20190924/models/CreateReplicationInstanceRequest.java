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

public class CreateReplicationInstanceRequest extends AbstractModel{

    /**
    * 主实例iD
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 复制实例地域ID
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
    * 复制实例地域名称
    */
    @SerializedName("ReplicationRegionName")
    @Expose
    private String ReplicationRegionName;

    /**
     * Get 主实例iD 
     * @return RegistryId 主实例iD
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 主实例iD
     * @param RegistryId 主实例iD
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 复制实例地域ID 
     * @return ReplicationRegionId 复制实例地域ID
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set 复制实例地域ID
     * @param ReplicationRegionId 复制实例地域ID
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Get 复制实例地域名称 
     * @return ReplicationRegionName 复制实例地域名称
     */
    public String getReplicationRegionName() {
        return this.ReplicationRegionName;
    }

    /**
     * Set 复制实例地域名称
     * @param ReplicationRegionName 复制实例地域名称
     */
    public void setReplicationRegionName(String ReplicationRegionName) {
        this.ReplicationRegionName = ReplicationRegionName;
    }

    public CreateReplicationInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReplicationInstanceRequest(CreateReplicationInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.ReplicationRegionId != null) {
            this.ReplicationRegionId = new Long(source.ReplicationRegionId);
        }
        if (source.ReplicationRegionName != null) {
            this.ReplicationRegionName = new String(source.ReplicationRegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);
        this.setParamSimple(map, prefix + "ReplicationRegionName", this.ReplicationRegionName);

    }
}

