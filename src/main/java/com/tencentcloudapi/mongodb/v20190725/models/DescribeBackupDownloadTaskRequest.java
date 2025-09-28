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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDownloadTaskRequest extends AbstractModel {

    /**
    * 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定备份文件名，用于过滤指定文件的下载任务。请通过接口 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 获取备份文件名。
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 指定查询时间范围内的任务，StartTime 指定开始时间。若不指定开始时间，则默认不限制开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 指定查询时间范围内的任务，EndTime 指定截止时间。若不指定截止时间，则默认不限制截止时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 此次查询返回的条数，取值范围为1-100，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定此次查询返回的页数，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段。
- createTime：按照备份下载任务的创建时间排序。默认为 createTime。
- finishTime：按照备份下载任务的完成时间排序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式。
- asc：升序排列。
- desc：降序排列。默认为 desc。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 指定任务状态，用于过滤下载任务。若不配置该参数，则返回所有状态类型的任务。
- 0：等待执行。
- 1：正在下载。
- 2：下载完成。
- 3：下载失败。
- 4：等待重试。
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定备份文件名，用于过滤指定文件的下载任务。请通过接口 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 获取备份文件名。 
     * @return BackupName 指定备份文件名，用于过滤指定文件的下载任务。请通过接口 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 获取备份文件名。
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 指定备份文件名，用于过滤指定文件的下载任务。请通过接口 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 获取备份文件名。
     * @param BackupName 指定备份文件名，用于过滤指定文件的下载任务。请通过接口 [DescribeDBBackups](https://cloud.tencent.com/document/product/240/38574) 获取备份文件名。
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 指定查询时间范围内的任务，StartTime 指定开始时间。若不指定开始时间，则默认不限制开始时间。 
     * @return StartTime 指定查询时间范围内的任务，StartTime 指定开始时间。若不指定开始时间，则默认不限制开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 指定查询时间范围内的任务，StartTime 指定开始时间。若不指定开始时间，则默认不限制开始时间。
     * @param StartTime 指定查询时间范围内的任务，StartTime 指定开始时间。若不指定开始时间，则默认不限制开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 指定查询时间范围内的任务，EndTime 指定截止时间。若不指定截止时间，则默认不限制截止时间。 
     * @return EndTime 指定查询时间范围内的任务，EndTime 指定截止时间。若不指定截止时间，则默认不限制截止时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 指定查询时间范围内的任务，EndTime 指定截止时间。若不指定截止时间，则默认不限制截止时间。
     * @param EndTime 指定查询时间范围内的任务，EndTime 指定截止时间。若不指定截止时间，则默认不限制截止时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 此次查询返回的条数，取值范围为1-100，默认为20。 
     * @return Limit 此次查询返回的条数，取值范围为1-100，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 此次查询返回的条数，取值范围为1-100，默认为20。
     * @param Limit 此次查询返回的条数，取值范围为1-100，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定此次查询返回的页数，默认为0。 
     * @return Offset 指定此次查询返回的页数，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定此次查询返回的页数，默认为0。
     * @param Offset 指定此次查询返回的页数，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段。
- createTime：按照备份下载任务的创建时间排序。默认为 createTime。
- finishTime：按照备份下载任务的完成时间排序。 
     * @return OrderBy 排序字段。
- createTime：按照备份下载任务的创建时间排序。默认为 createTime。
- finishTime：按照备份下载任务的完成时间排序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段。
- createTime：按照备份下载任务的创建时间排序。默认为 createTime。
- finishTime：按照备份下载任务的完成时间排序。
     * @param OrderBy 排序字段。
- createTime：按照备份下载任务的创建时间排序。默认为 createTime。
- finishTime：按照备份下载任务的完成时间排序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式。
- asc：升序排列。
- desc：降序排列。默认为 desc。 
     * @return OrderByType 排序方式。
- asc：升序排列。
- desc：降序排列。默认为 desc。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式。
- asc：升序排列。
- desc：降序排列。默认为 desc。
     * @param OrderByType 排序方式。
- asc：升序排列。
- desc：降序排列。默认为 desc。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 指定任务状态，用于过滤下载任务。若不配置该参数，则返回所有状态类型的任务。
- 0：等待执行。
- 1：正在下载。
- 2：下载完成。
- 3：下载失败。
- 4：等待重试。 
     * @return Status 指定任务状态，用于过滤下载任务。若不配置该参数，则返回所有状态类型的任务。
- 0：等待执行。
- 1：正在下载。
- 2：下载完成。
- 3：下载失败。
- 4：等待重试。
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 指定任务状态，用于过滤下载任务。若不配置该参数，则返回所有状态类型的任务。
- 0：等待执行。
- 1：正在下载。
- 2：下载完成。
- 3：下载失败。
- 4：等待重试。
     * @param Status 指定任务状态，用于过滤下载任务。若不配置该参数，则返回所有状态类型的任务。
- 0：等待执行。
- 1：正在下载。
- 2：下载完成。
- 3：下载失败。
- 4：等待重试。
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public DescribeBackupDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadTaskRequest(DescribeBackupDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
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
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

