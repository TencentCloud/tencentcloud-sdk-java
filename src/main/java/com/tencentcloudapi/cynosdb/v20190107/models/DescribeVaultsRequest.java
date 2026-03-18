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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVaultsRequest extends AbstractModel {

    /**
    * 保险箱ID列表，用于精确筛选
    */
    @SerializedName("VaultIds")
    @Expose
    private String [] VaultIds;

    /**
    * 保险箱名称，用于模糊筛选
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 保险箱状态列表，用于筛选
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 每页数量，范围(0,100]，默认100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，范围[0,+∞)，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，可选值：desc, asc, DESC, ASC
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 保险箱ID列表，用于精确筛选 
     * @return VaultIds 保险箱ID列表，用于精确筛选
     */
    public String [] getVaultIds() {
        return this.VaultIds;
    }

    /**
     * Set 保险箱ID列表，用于精确筛选
     * @param VaultIds 保险箱ID列表，用于精确筛选
     */
    public void setVaultIds(String [] VaultIds) {
        this.VaultIds = VaultIds;
    }

    /**
     * Get 保险箱名称，用于模糊筛选 
     * @return VaultName 保险箱名称，用于模糊筛选
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 保险箱名称，用于模糊筛选
     * @param VaultName 保险箱名称，用于模糊筛选
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 保险箱状态列表，用于筛选 
     * @return Status 保险箱状态列表，用于筛选
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 保险箱状态列表，用于筛选
     * @param Status 保险箱状态列表，用于筛选
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 每页数量，范围(0,100]，默认100 
     * @return Limit 每页数量，范围(0,100]，默认100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，范围(0,100]，默认100
     * @param Limit 每页数量，范围(0,100]，默认100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，范围[0,+∞)，默认0 
     * @return Offset 偏移量，范围[0,+∞)，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，范围[0,+∞)，默认0
     * @param Offset 偏移量，范围[0,+∞)，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime 
     * @return OrderBy 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
     * @param OrderBy 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，可选值：desc, asc, DESC, ASC 
     * @return OrderByType 排序方式，可选值：desc, asc, DESC, ASC
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，可选值：desc, asc, DESC, ASC
     * @param OrderByType 排序方式，可选值：desc, asc, DESC, ASC
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeVaultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVaultsRequest(DescribeVaultsRequest source) {
        if (source.VaultIds != null) {
            this.VaultIds = new String[source.VaultIds.length];
            for (int i = 0; i < source.VaultIds.length; i++) {
                this.VaultIds[i] = new String(source.VaultIds[i]);
            }
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VaultIds.", this.VaultIds);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

