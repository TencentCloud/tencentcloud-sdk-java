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

public class DescribeReplicationInstanceSyncStatusRequest extends AbstractModel{

    /**
    * 主实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 复制实例Id
    */
    @SerializedName("ReplicationRegistryId")
    @Expose
    private String ReplicationRegistryId;

    /**
    * 复制实例的地域Id
    */
    @SerializedName("ReplicationRegionId")
    @Expose
    private Long ReplicationRegionId;

    /**
    * 是否显示同步日志
    */
    @SerializedName("ShowReplicationLog")
    @Expose
    private Boolean ShowReplicationLog;

    /**
    * 日志页号, 默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条数，默认5，最大为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 主实例Id 
     * @return RegistryId 主实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 主实例Id
     * @param RegistryId 主实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 复制实例Id 
     * @return ReplicationRegistryId 复制实例Id
     */
    public String getReplicationRegistryId() {
        return this.ReplicationRegistryId;
    }

    /**
     * Set 复制实例Id
     * @param ReplicationRegistryId 复制实例Id
     */
    public void setReplicationRegistryId(String ReplicationRegistryId) {
        this.ReplicationRegistryId = ReplicationRegistryId;
    }

    /**
     * Get 复制实例的地域Id 
     * @return ReplicationRegionId 复制实例的地域Id
     */
    public Long getReplicationRegionId() {
        return this.ReplicationRegionId;
    }

    /**
     * Set 复制实例的地域Id
     * @param ReplicationRegionId 复制实例的地域Id
     */
    public void setReplicationRegionId(Long ReplicationRegionId) {
        this.ReplicationRegionId = ReplicationRegionId;
    }

    /**
     * Get 是否显示同步日志 
     * @return ShowReplicationLog 是否显示同步日志
     */
    public Boolean getShowReplicationLog() {
        return this.ShowReplicationLog;
    }

    /**
     * Set 是否显示同步日志
     * @param ShowReplicationLog 是否显示同步日志
     */
    public void setShowReplicationLog(Boolean ShowReplicationLog) {
        this.ShowReplicationLog = ShowReplicationLog;
    }

    /**
     * Get 日志页号, 默认0 
     * @return Offset 日志页号, 默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 日志页号, 默认0
     * @param Offset 日志页号, 默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大输出条数，默认5，最大为20 
     * @return Limit 最大输出条数，默认5，最大为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条数，默认5，最大为20
     * @param Limit 最大输出条数，默认5，最大为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeReplicationInstanceSyncStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationInstanceSyncStatusRequest(DescribeReplicationInstanceSyncStatusRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.ReplicationRegistryId != null) {
            this.ReplicationRegistryId = new String(source.ReplicationRegistryId);
        }
        if (source.ReplicationRegionId != null) {
            this.ReplicationRegionId = new Long(source.ReplicationRegionId);
        }
        if (source.ShowReplicationLog != null) {
            this.ShowReplicationLog = new Boolean(source.ShowReplicationLog);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegistryId", this.ReplicationRegistryId);
        this.setParamSimple(map, prefix + "ReplicationRegionId", this.ReplicationRegionId);
        this.setParamSimple(map, prefix + "ShowReplicationLog", this.ShowReplicationLog);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

