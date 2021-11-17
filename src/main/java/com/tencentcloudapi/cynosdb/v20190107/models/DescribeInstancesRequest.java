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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 返回数量，默认为 20，最大值为 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 记录偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，取值范围：
<li> CREATETIME：创建时间</li>
<li> PERIODENDTIME：过期时间</li>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型，取值范围：
<li> ASC：升序排序 </li>
<li> DESC：降序排序 </li>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 搜索条件，若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
    * 引擎类型：目前支持“MYSQL”， “POSTGRESQL”
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 实例状态, 可选值:
creating 创建中
running 运行中
isolating 隔离中
isolated 已隔离
activating 恢复中
offlining 下线中
offlined 已下线
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例id列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 返回数量，默认为 20，最大值为 100 
     * @return Limit 返回数量，默认为 20，最大值为 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100
     * @param Limit 返回数量，默认为 20，最大值为 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 记录偏移量，默认值为0 
     * @return Offset 记录偏移量，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录偏移量，默认值为0
     * @param Offset 记录偏移量，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，取值范围：
<li> CREATETIME：创建时间</li>
<li> PERIODENDTIME：过期时间</li> 
     * @return OrderBy 排序字段，取值范围：
<li> CREATETIME：创建时间</li>
<li> PERIODENDTIME：过期时间</li>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，取值范围：
<li> CREATETIME：创建时间</li>
<li> PERIODENDTIME：过期时间</li>
     * @param OrderBy 排序字段，取值范围：
<li> CREATETIME：创建时间</li>
<li> PERIODENDTIME：过期时间</li>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型，取值范围：
<li> ASC：升序排序 </li>
<li> DESC：降序排序 </li> 
     * @return OrderByType 排序类型，取值范围：
<li> ASC：升序排序 </li>
<li> DESC：降序排序 </li>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型，取值范围：
<li> ASC：升序排序 </li>
<li> DESC：降序排序 </li>
     * @param OrderByType 排序类型，取值范围：
<li> ASC：升序排序 </li>
<li> DESC：降序排序 </li>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 搜索条件，若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。 
     * @return Filters 搜索条件，若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索条件，若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     * @param Filters 搜索条件，若存在多个Filter时，Filter间的关系为逻辑与（AND）关系。
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 引擎类型：目前支持“MYSQL”， “POSTGRESQL” 
     * @return DbType 引擎类型：目前支持“MYSQL”， “POSTGRESQL”
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 引擎类型：目前支持“MYSQL”， “POSTGRESQL”
     * @param DbType 引擎类型：目前支持“MYSQL”， “POSTGRESQL”
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 实例状态, 可选值:
creating 创建中
running 运行中
isolating 隔离中
isolated 已隔离
activating 恢复中
offlining 下线中
offlined 已下线 
     * @return Status 实例状态, 可选值:
creating 创建中
running 运行中
isolating 隔离中
isolated 已隔离
activating 恢复中
offlining 下线中
offlined 已下线
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态, 可选值:
creating 创建中
running 运行中
isolating 隔离中
isolated 已隔离
activating 恢复中
offlining 下线中
offlined 已下线
     * @param Status 实例状态, 可选值:
creating 创建中
running 运行中
isolating 隔离中
isolated 已隔离
activating 恢复中
offlining 下线中
offlined 已下线
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例id列表 
     * @return InstanceIds 实例id列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例id列表
     * @param InstanceIds 实例id列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new QueryFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryFilter(source.Filters[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

