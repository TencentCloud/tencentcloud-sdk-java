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

public class DescribeBackupFilesRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 聚合ID, 可通过接口DescribeBackups获取
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分页返回，每页返回的数目，取值为1-100，默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页返回，页编号，默认值为第0页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按照备份的库名称筛选，不填则不筛选此项
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 列表项排序，目前只按照备份大小排序（desc-降序，asc-升序），默认desc
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 实例ID，形如mssql-njj2mtpl 
     * @return InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-njj2mtpl
     * @param InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 聚合ID, 可通过接口DescribeBackups获取 
     * @return GroupId 聚合ID, 可通过接口DescribeBackups获取
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 聚合ID, 可通过接口DescribeBackups获取
     * @param GroupId 聚合ID, 可通过接口DescribeBackups获取
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分页返回，每页返回的数目，取值为1-100，默认值为20 
     * @return Limit 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1-100，默认值为20
     * @param Limit 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页返回，页编号，默认值为第0页 
     * @return Offset 分页返回，页编号，默认值为第0页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，页编号，默认值为第0页
     * @param Offset 分页返回，页编号，默认值为第0页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按照备份的库名称筛选，不填则不筛选此项 
     * @return DatabaseName 按照备份的库名称筛选，不填则不筛选此项
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 按照备份的库名称筛选，不填则不筛选此项
     * @param DatabaseName 按照备份的库名称筛选，不填则不筛选此项
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 列表项排序，目前只按照备份大小排序（desc-降序，asc-升序），默认desc 
     * @return OrderBy 列表项排序，目前只按照备份大小排序（desc-降序，asc-升序），默认desc
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 列表项排序，目前只按照备份大小排序（desc-降序，asc-升序），默认desc
     * @param OrderBy 列表项排序，目前只按照备份大小排序（desc-降序，asc-升序），默认desc
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
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
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

