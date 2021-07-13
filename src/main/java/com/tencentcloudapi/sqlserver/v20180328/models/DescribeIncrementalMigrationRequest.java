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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIncrementalMigrationRequest extends AbstractModel{

    /**
    * 备份导入任务ID，由CreateBackupMigration接口返回
    */
    @SerializedName("BackupMigrationId")
    @Expose
    private String BackupMigrationId;

    /**
    * 导入目标实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份文件名称
    */
    @SerializedName("BackupFileName")
    @Expose
    private String BackupFileName;

    /**
    * 导入任务状态集合
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * 分页，页大小，默认值：100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页，页数，默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，name；createTime；startTime；endTime，默认按照createTime递增排序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，desc-递减排序，asc-递增排序。默认按照asc排序，且在OrderBy为有效值时，本参数有效
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 增量备份导入任务ID，由CreateIncrementalMigration接口返回
    */
    @SerializedName("IncrementalMigrationId")
    @Expose
    private String IncrementalMigrationId;

    /**
     * Get 备份导入任务ID，由CreateBackupMigration接口返回 
     * @return BackupMigrationId 备份导入任务ID，由CreateBackupMigration接口返回
     */
    public String getBackupMigrationId() {
        return this.BackupMigrationId;
    }

    /**
     * Set 备份导入任务ID，由CreateBackupMigration接口返回
     * @param BackupMigrationId 备份导入任务ID，由CreateBackupMigration接口返回
     */
    public void setBackupMigrationId(String BackupMigrationId) {
        this.BackupMigrationId = BackupMigrationId;
    }

    /**
     * Get 导入目标实例ID 
     * @return InstanceId 导入目标实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 导入目标实例ID
     * @param InstanceId 导入目标实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份文件名称 
     * @return BackupFileName 备份文件名称
     */
    public String getBackupFileName() {
        return this.BackupFileName;
    }

    /**
     * Set 备份文件名称
     * @param BackupFileName 备份文件名称
     */
    public void setBackupFileName(String BackupFileName) {
        this.BackupFileName = BackupFileName;
    }

    /**
     * Get 导入任务状态集合 
     * @return StatusSet 导入任务状态集合
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 导入任务状态集合
     * @param StatusSet 导入任务状态集合
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 分页，页大小，默认值：100 
     * @return Limit 分页，页大小，默认值：100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，页大小，默认值：100
     * @param Limit 分页，页大小，默认值：100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页，页数，默认值：0 
     * @return Offset 分页，页数，默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页，页数，默认值：0
     * @param Offset 分页，页数，默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，name；createTime；startTime；endTime，默认按照createTime递增排序。 
     * @return OrderBy 排序字段，name；createTime；startTime；endTime，默认按照createTime递增排序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，name；createTime；startTime；endTime，默认按照createTime递增排序。
     * @param OrderBy 排序字段，name；createTime；startTime；endTime，默认按照createTime递增排序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，desc-递减排序，asc-递增排序。默认按照asc排序，且在OrderBy为有效值时，本参数有效 
     * @return OrderByType 排序方式，desc-递减排序，asc-递增排序。默认按照asc排序，且在OrderBy为有效值时，本参数有效
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，desc-递减排序，asc-递增排序。默认按照asc排序，且在OrderBy为有效值时，本参数有效
     * @param OrderByType 排序方式，desc-递减排序，asc-递增排序。默认按照asc排序，且在OrderBy为有效值时，本参数有效
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 增量备份导入任务ID，由CreateIncrementalMigration接口返回 
     * @return IncrementalMigrationId 增量备份导入任务ID，由CreateIncrementalMigration接口返回
     */
    public String getIncrementalMigrationId() {
        return this.IncrementalMigrationId;
    }

    /**
     * Set 增量备份导入任务ID，由CreateIncrementalMigration接口返回
     * @param IncrementalMigrationId 增量备份导入任务ID，由CreateIncrementalMigration接口返回
     */
    public void setIncrementalMigrationId(String IncrementalMigrationId) {
        this.IncrementalMigrationId = IncrementalMigrationId;
    }

    public DescribeIncrementalMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIncrementalMigrationRequest(DescribeIncrementalMigrationRequest source) {
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupFileName != null) {
            this.BackupFileName = new String(source.BackupFileName);
        }
        if (source.StatusSet != null) {
            this.StatusSet = new Long[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new Long(source.StatusSet[i]);
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
        if (source.IncrementalMigrationId != null) {
            this.IncrementalMigrationId = new String(source.IncrementalMigrationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupFileName", this.BackupFileName);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "IncrementalMigrationId", this.IncrementalMigrationId);

    }
}

