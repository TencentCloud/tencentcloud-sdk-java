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

public class DescribeBackupListByVaultRequest extends AbstractModel {

    /**
    * 保险箱ID，长度必须大于0
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 备份文件ID列表，用于筛选特定备份
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
    * 集群ID，用于筛选特定集群的备份
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备份名称列表，用于精确匹配筛选
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * 文件名称列表，用于精确匹配筛选
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * 分页数量，取值范围：(0, 100]，默认100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，取值范围：[0, INF)，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime，默认createTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，可选值：desc, asc, DESC, ASC，默认desc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 保险箱ID，长度必须大于0 
     * @return VaultId 保险箱ID，长度必须大于0
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 保险箱ID，长度必须大于0
     * @param VaultId 保险箱ID，长度必须大于0
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 备份文件ID列表，用于筛选特定备份 
     * @return BackupIds 备份文件ID列表，用于筛选特定备份
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set 备份文件ID列表，用于筛选特定备份
     * @param BackupIds 备份文件ID列表，用于筛选特定备份
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    /**
     * Get 集群ID，用于筛选特定集群的备份 
     * @return ClusterId 集群ID，用于筛选特定集群的备份
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，用于筛选特定集群的备份
     * @param ClusterId 集群ID，用于筛选特定集群的备份
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 备份名称列表，用于精确匹配筛选 
     * @return BackupNames 备份名称列表，用于精确匹配筛选
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set 备份名称列表，用于精确匹配筛选
     * @param BackupNames 备份名称列表，用于精确匹配筛选
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get 文件名称列表，用于精确匹配筛选 
     * @return FileNames 文件名称列表，用于精确匹配筛选
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set 文件名称列表，用于精确匹配筛选
     * @param FileNames 文件名称列表，用于精确匹配筛选
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get 分页数量，取值范围：(0, 100]，默认100 
     * @return Limit 分页数量，取值范围：(0, 100]，默认100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页数量，取值范围：(0, 100]，默认100
     * @param Limit 分页数量，取值范围：(0, 100]，默认100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，取值范围：[0, INF)，默认0 
     * @return Offset 分页偏移量，取值范围：[0, INF)，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取值范围：[0, INF)，默认0
     * @param Offset 分页偏移量，取值范围：[0, INF)，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime，默认createTime 
     * @return OrderBy 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime，默认createTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime，默认createTime
     * @param OrderBy 排序字段，可选值：VaultId, VaultName, BackupSaveSeconds, LockedTime, CreateTime, UpdateTime，默认createTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，可选值：desc, asc, DESC, ASC，默认desc 
     * @return OrderByType 排序方式，可选值：desc, asc, DESC, ASC，默认desc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，可选值：desc, asc, DESC, ASC，默认desc
     * @param OrderByType 排序方式，可选值：desc, asc, DESC, ASC，默认desc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribeBackupListByVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupListByVaultRequest(DescribeBackupListByVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupNames != null) {
            this.BackupNames = new String[source.BackupNames.length];
            for (int i = 0; i < source.BackupNames.length; i++) {
                this.BackupNames[i] = new String(source.BackupNames[i]);
            }
        }
        if (source.FileNames != null) {
            this.FileNames = new String[source.FileNames.length];
            for (int i = 0; i < source.FileNames.length; i++) {
                this.FileNames[i] = new String(source.FileNames[i]);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

