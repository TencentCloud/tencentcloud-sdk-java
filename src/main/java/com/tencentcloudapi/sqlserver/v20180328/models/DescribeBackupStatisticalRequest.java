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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupStatisticalRequest extends AbstractModel {

    /**
    * 分页返回，每页返回的数目，取值为1-100，默认值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页返回，页编号，默认值为第0页。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 实例名称列表，模糊查询。
    */
    @SerializedName("InstanceNameSet")
    @Expose
    private String [] InstanceNameSet;

    /**
    * 排序字段，默认default，则按照备份空间降序。
default 按照备份空间排序
data 数据备份排序
log 日志备份排序
auto 自动备份排序
manual 手动备份排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 默认降序，[desc-降序，asc-升序]。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 分页返回，每页返回的数目，取值为1-100，默认值为100 
     * @return Limit 分页返回，每页返回的数目，取值为1-100，默认值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1-100，默认值为100
     * @param Limit 分页返回，每页返回的数目，取值为1-100，默认值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页返回，页编号，默认值为第0页。 
     * @return Offset 分页返回，页编号，默认值为第0页。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，页编号，默认值为第0页。
     * @param Offset 分页返回，页编号，默认值为第0页。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl。 
     * @return InstanceIdSet 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl。
     * @param InstanceIdSet 一个或者多个实例ID。实例ID，格式如：mssql-si2823jyl。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 实例名称列表，模糊查询。 
     * @return InstanceNameSet 实例名称列表，模糊查询。
     */
    public String [] getInstanceNameSet() {
        return this.InstanceNameSet;
    }

    /**
     * Set 实例名称列表，模糊查询。
     * @param InstanceNameSet 实例名称列表，模糊查询。
     */
    public void setInstanceNameSet(String [] InstanceNameSet) {
        this.InstanceNameSet = InstanceNameSet;
    }

    /**
     * Get 排序字段，默认default，则按照备份空间降序。
default 按照备份空间排序
data 数据备份排序
log 日志备份排序
auto 自动备份排序
manual 手动备份排序 
     * @return OrderBy 排序字段，默认default，则按照备份空间降序。
default 按照备份空间排序
data 数据备份排序
log 日志备份排序
auto 自动备份排序
manual 手动备份排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，默认default，则按照备份空间降序。
default 按照备份空间排序
data 数据备份排序
log 日志备份排序
auto 自动备份排序
manual 手动备份排序
     * @param OrderBy 排序字段，默认default，则按照备份空间降序。
default 按照备份空间排序
data 数据备份排序
log 日志备份排序
auto 自动备份排序
manual 手动备份排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 默认降序，[desc-降序，asc-升序]。 
     * @return OrderByType 默认降序，[desc-降序，asc-升序]。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 默认降序，[desc-降序，asc-升序]。
     * @param OrderByType 默认降序，[desc-降序，asc-升序]。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBackupStatisticalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupStatisticalRequest(DescribeBackupStatisticalRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.InstanceNameSet != null) {
            this.InstanceNameSet = new String[source.InstanceNameSet.length];
            for (int i = 0; i < source.InstanceNameSet.length; i++) {
                this.InstanceNameSet[i] = new String(source.InstanceNameSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamArraySimple(map, prefix + "InstanceNameSet.", this.InstanceNameSet);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

