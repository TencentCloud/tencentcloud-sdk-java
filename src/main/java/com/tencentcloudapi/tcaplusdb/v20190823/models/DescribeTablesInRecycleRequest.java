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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesInRecycleRequest extends AbstractModel{

    /**
    * 待查询表所属应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 待查询表所属大区列表
    */
    @SerializedName("LogicZoneIds")
    @Expose
    private String [] LogicZoneIds;

    /**
    * 过滤条件，本接口支持：TableName，TableInstanceId
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 结果列表数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 待查询表所属应用实例ID 
     * @return ApplicationId 待查询表所属应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 待查询表所属应用实例ID
     * @param ApplicationId 待查询表所属应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 待查询表所属大区列表 
     * @return LogicZoneIds 待查询表所属大区列表
     */
    public String [] getLogicZoneIds() {
        return this.LogicZoneIds;
    }

    /**
     * Set 待查询表所属大区列表
     * @param LogicZoneIds 待查询表所属大区列表
     */
    public void setLogicZoneIds(String [] LogicZoneIds) {
        this.LogicZoneIds = LogicZoneIds;
    }

    /**
     * Get 过滤条件，本接口支持：TableName，TableInstanceId 
     * @return Filters 过滤条件，本接口支持：TableName，TableInstanceId
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，本接口支持：TableName，TableInstanceId
     * @param Filters 过滤条件，本接口支持：TableName，TableInstanceId
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 结果列表数量 
     * @return Limit 结果列表数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 结果列表数量
     * @param Limit 结果列表数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArraySimple(map, prefix + "LogicZoneIds.", this.LogicZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

