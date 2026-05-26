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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSBackupSetsRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例备份集ID</p>
    */
    @SerializedName("BackupSetId")
    @Expose
    private Long BackupSetId;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("FilterBy")
    @Expose
    private BackupSetsReqFilter FilterBy;

    /**
    * <p>单次查询数量[0,200]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>本次查询偏移[0,INF]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>StartTime,EndTime,ExpiredTime,BackupSetId,BackupDuration</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>ASC,DESC</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例备份集ID</p> 
     * @return BackupSetId <p>实例备份集ID</p>
     */
    public Long getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set <p>实例备份集ID</p>
     * @param BackupSetId <p>实例备份集ID</p>
     */
    public void setBackupSetId(Long BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return FilterBy <p>过滤条件</p>
     */
    public BackupSetsReqFilter getFilterBy() {
        return this.FilterBy;
    }

    /**
     * Set <p>过滤条件</p>
     * @param FilterBy <p>过滤条件</p>
     */
    public void setFilterBy(BackupSetsReqFilter FilterBy) {
        this.FilterBy = FilterBy;
    }

    /**
     * Get <p>单次查询数量[0,200]</p> 
     * @return Limit <p>单次查询数量[0,200]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询数量[0,200]</p>
     * @param Limit <p>单次查询数量[0,200]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>本次查询偏移[0,INF]</p> 
     * @return Offset <p>本次查询偏移[0,INF]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>本次查询偏移[0,INF]</p>
     * @param Offset <p>本次查询偏移[0,INF]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>StartTime,EndTime,ExpiredTime,BackupSetId,BackupDuration</p> 
     * @return OrderBy <p>StartTime,EndTime,ExpiredTime,BackupSetId,BackupDuration</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>StartTime,EndTime,ExpiredTime,BackupSetId,BackupDuration</p>
     * @param OrderBy <p>StartTime,EndTime,ExpiredTime,BackupSetId,BackupDuration</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>ASC,DESC</p> 
     * @return OrderType <p>ASC,DESC</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>ASC,DESC</p>
     * @param OrderType <p>ASC,DESC</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public DescribeDBSBackupSetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSBackupSetsRequest(DescribeDBSBackupSetsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new Long(source.BackupSetId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FilterBy != null) {
            this.FilterBy = new BackupSetsReqFilter(source.FilterBy);
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "FilterBy.", this.FilterBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

