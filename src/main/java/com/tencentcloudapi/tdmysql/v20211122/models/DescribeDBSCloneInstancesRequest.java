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

public class DescribeDBSCloneInstancesRequest extends AbstractModel {

    /**
    * <p>源实例ID</p>
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * <p>引擎类型</p>
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * <p>结束创建时间</p>
    */
    @SerializedName("EndCreateTime")
    @Expose
    private String EndCreateTime;

    /**
    * <p>克隆类型: PITR 时间点 BackupSet 备份集</p>
    */
    @SerializedName("FilterCloneType")
    @Expose
    private String FilterCloneType;

    /**
    * <p>查询数量[0,200]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询偏移量[0,INF]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段: CloneTime,CreateTime</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序类型:ASC,DESC</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>开始创建时间</p>
    */
    @SerializedName("StartCreateTime")
    @Expose
    private String StartCreateTime;

    /**
     * Get <p>源实例ID</p> 
     * @return SourceInstanceId <p>源实例ID</p>
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set <p>源实例ID</p>
     * @param SourceInstanceId <p>源实例ID</p>
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get <p>引擎类型</p> 
     * @return DBType <p>引擎类型</p>
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set <p>引擎类型</p>
     * @param DBType <p>引擎类型</p>
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get <p>结束创建时间</p> 
     * @return EndCreateTime <p>结束创建时间</p>
     */
    public String getEndCreateTime() {
        return this.EndCreateTime;
    }

    /**
     * Set <p>结束创建时间</p>
     * @param EndCreateTime <p>结束创建时间</p>
     */
    public void setEndCreateTime(String EndCreateTime) {
        this.EndCreateTime = EndCreateTime;
    }

    /**
     * Get <p>克隆类型: PITR 时间点 BackupSet 备份集</p> 
     * @return FilterCloneType <p>克隆类型: PITR 时间点 BackupSet 备份集</p>
     */
    public String getFilterCloneType() {
        return this.FilterCloneType;
    }

    /**
     * Set <p>克隆类型: PITR 时间点 BackupSet 备份集</p>
     * @param FilterCloneType <p>克隆类型: PITR 时间点 BackupSet 备份集</p>
     */
    public void setFilterCloneType(String FilterCloneType) {
        this.FilterCloneType = FilterCloneType;
    }

    /**
     * Get <p>查询数量[0,200]</p> 
     * @return Limit <p>查询数量[0,200]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询数量[0,200]</p>
     * @param Limit <p>查询数量[0,200]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询偏移量[0,INF]</p> 
     * @return Offset <p>查询偏移量[0,INF]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询偏移量[0,INF]</p>
     * @param Offset <p>查询偏移量[0,INF]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段: CloneTime,CreateTime</p> 
     * @return OrderBy <p>排序字段: CloneTime,CreateTime</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段: CloneTime,CreateTime</p>
     * @param OrderBy <p>排序字段: CloneTime,CreateTime</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序类型:ASC,DESC</p> 
     * @return OrderType <p>排序类型:ASC,DESC</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序类型:ASC,DESC</p>
     * @param OrderType <p>排序类型:ASC,DESC</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>开始创建时间</p> 
     * @return StartCreateTime <p>开始创建时间</p>
     */
    public String getStartCreateTime() {
        return this.StartCreateTime;
    }

    /**
     * Set <p>开始创建时间</p>
     * @param StartCreateTime <p>开始创建时间</p>
     */
    public void setStartCreateTime(String StartCreateTime) {
        this.StartCreateTime = StartCreateTime;
    }

    public DescribeDBSCloneInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSCloneInstancesRequest(DescribeDBSCloneInstancesRequest source) {
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.EndCreateTime != null) {
            this.EndCreateTime = new String(source.EndCreateTime);
        }
        if (source.FilterCloneType != null) {
            this.FilterCloneType = new String(source.FilterCloneType);
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
        if (source.StartCreateTime != null) {
            this.StartCreateTime = new String(source.StartCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "EndCreateTime", this.EndCreateTime);
        this.setParamSimple(map, prefix + "FilterCloneType", this.FilterCloneType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartCreateTime", this.StartCreateTime);

    }
}

