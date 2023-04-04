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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupFilesRequest extends AbstractModel{

    /**
    * 按实例ID查询
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 按分片ID查询
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 备份类型，Data:数据备份，Binlog:Binlog备份，Errlog:错误日志，Slowlog:慢日志
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 按开始时间查询
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 按结束时间查询
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序参数，可选值：Time,Size
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序参数，可选值：DESC,ASC
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get 按实例ID查询 
     * @return InstanceId 按实例ID查询
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 按实例ID查询
     * @param InstanceId 按实例ID查询
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 按分片ID查询 
     * @return ShardId 按分片ID查询
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 按分片ID查询
     * @param ShardId 按分片ID查询
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 备份类型，Data:数据备份，Binlog:Binlog备份，Errlog:错误日志，Slowlog:慢日志 
     * @return BackupType 备份类型，Data:数据备份，Binlog:Binlog备份，Errlog:错误日志，Slowlog:慢日志
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型，Data:数据备份，Binlog:Binlog备份，Errlog:错误日志，Slowlog:慢日志
     * @param BackupType 备份类型，Data:数据备份，Binlog:Binlog备份，Errlog:错误日志，Slowlog:慢日志
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 按开始时间查询 
     * @return StartTime 按开始时间查询
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 按开始时间查询
     * @param StartTime 按开始时间查询
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 按结束时间查询 
     * @return EndTime 按结束时间查询
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 按结束时间查询
     * @param EndTime 按结束时间查询
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数 
     * @return Limit 分页参数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数
     * @param Limit 分页参数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序参数，可选值：Time,Size 
     * @return OrderBy 排序参数，可选值：Time,Size
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序参数，可选值：Time,Size
     * @param OrderBy 排序参数，可选值：Time,Size
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序参数，可选值：DESC,ASC 
     * @return OrderType 排序参数，可选值：DESC,ASC
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序参数，可选值：DESC,ASC
     * @param OrderType 排序参数，可选值：DESC,ASC
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeBackupFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupFilesRequest(DescribeBackupFilesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

