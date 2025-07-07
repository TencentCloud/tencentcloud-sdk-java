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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesInRecycleRequest extends AbstractModel {

    /**
    * 待查询表格所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 待查询表格所属表格组ID列表
    */
    @SerializedName("TableGroupIds")
    @Expose
    private String [] TableGroupIds;

    /**
    * 过滤条件，本接口支持：TableName，TableInstanceId
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询结果偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果返回记录数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 待查询表格所属集群ID 
     * @return ClusterId 待查询表格所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 待查询表格所属集群ID
     * @param ClusterId 待查询表格所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 待查询表格所属表格组ID列表 
     * @return TableGroupIds 待查询表格所属表格组ID列表
     */
    public String [] getTableGroupIds() {
        return this.TableGroupIds;
    }

    /**
     * Set 待查询表格所属表格组ID列表
     * @param TableGroupIds 待查询表格所属表格组ID列表
     */
    public void setTableGroupIds(String [] TableGroupIds) {
        this.TableGroupIds = TableGroupIds;
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
     * Get 查询结果偏移量 
     * @return Offset 查询结果偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果偏移量
     * @param Offset 查询结果偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果返回记录数量 
     * @return Limit 查询结果返回记录数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果返回记录数量
     * @param Limit 查询结果返回记录数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTablesInRecycleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesInRecycleRequest(DescribeTablesInRecycleRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupIds != null) {
            this.TableGroupIds = new String[source.TableGroupIds.length];
            for (int i = 0; i < source.TableGroupIds.length; i++) {
                this.TableGroupIds[i] = new String(source.TableGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "TableGroupIds.", this.TableGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

