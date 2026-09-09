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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBCustomClusterAttributesRequest extends AbstractModel {

    /**
    * <p>集群ID</p><p>参数格式：dbcc-hj7gab15</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群 ID 列表</p><p>入参限制：最多支持 100 个</p><p>ClusterId 和 ClusterIds 必须传一个且不能同时传</p>
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * <p>是否启用集群删除保护</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 不启用</li></ul>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>集群名称</p><p>入参限制：最长128个字符</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群描述</p><p>入参限制：最长200个字符</p>
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
     * Get <p>集群ID</p><p>参数格式：dbcc-hj7gab15</p> 
     * @return ClusterId <p>集群ID</p><p>参数格式：dbcc-hj7gab15</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p><p>参数格式：dbcc-hj7gab15</p>
     * @param ClusterId <p>集群ID</p><p>参数格式：dbcc-hj7gab15</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群 ID 列表</p><p>入参限制：最多支持 100 个</p><p>ClusterId 和 ClusterIds 必须传一个且不能同时传</p> 
     * @return ClusterIds <p>集群 ID 列表</p><p>入参限制：最多支持 100 个</p><p>ClusterId 和 ClusterIds 必须传一个且不能同时传</p>
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set <p>集群 ID 列表</p><p>入参限制：最多支持 100 个</p><p>ClusterId 和 ClusterIds 必须传一个且不能同时传</p>
     * @param ClusterIds <p>集群 ID 列表</p><p>入参限制：最多支持 100 个</p><p>ClusterId 和 ClusterIds 必须传一个且不能同时传</p>
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get <p>是否启用集群删除保护</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 不启用</li></ul> 
     * @return DeletionProtection <p>是否启用集群删除保护</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 不启用</li></ul>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>是否启用集群删除保护</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 不启用</li></ul>
     * @param DeletionProtection <p>是否启用集群删除保护</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 不启用</li></ul>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>集群名称</p><p>入参限制：最长128个字符</p> 
     * @return ClusterName <p>集群名称</p><p>入参限制：最长128个字符</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p><p>入参限制：最长128个字符</p>
     * @param ClusterName <p>集群名称</p><p>入参限制：最长128个字符</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群描述</p><p>入参限制：最长200个字符</p> 
     * @return ClusterDescription <p>集群描述</p><p>入参限制：最长200个字符</p>
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set <p>集群描述</p><p>入参限制：最长200个字符</p>
     * @param ClusterDescription <p>集群描述</p><p>入参限制：最长200个字符</p>
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    public ModifyDBCustomClusterAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomClusterAttributesRequest(ModifyDBCustomClusterAttributesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDescription != null) {
            this.ClusterDescription = new String(source.ClusterDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);

    }
}

