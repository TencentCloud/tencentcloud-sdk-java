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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseAuditDownloadRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 排序参数
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 数据库
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * sql类型
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * sql语句
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 用户 多选
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 数据库 多选
    */
    @SerializedName("DbNames")
    @Expose
    private String [] DbNames;

    /**
    * sql类型 多选
    */
    @SerializedName("SqlTypes")
    @Expose
    private String [] SqlTypes;

    /**
    * catalog名称 （多选）
    */
    @SerializedName("Catalogs")
    @Expose
    private String [] Catalogs;

    /**
    * 是否是查询	
    */
    @SerializedName("IsQuery")
    @Expose
    private Boolean [] IsQuery;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页 
     * @return PageSize 分页
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页
     * @param PageSize 分页
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页 
     * @return PageNum 分页
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 分页
     * @param PageNum 分页
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 排序参数 
     * @return OrderType 排序参数
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序参数
     * @param OrderType 排序参数
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 用户 
     * @return User 用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 数据库 
     * @return DbName 数据库
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库
     * @param DbName 数据库
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get sql类型 
     * @return SqlType sql类型
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set sql类型
     * @param SqlType sql类型
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get sql语句 
     * @return Sql sql语句
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set sql语句
     * @param Sql sql语句
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 用户 多选 
     * @return Users 用户 多选
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户 多选
     * @param Users 用户 多选
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 数据库 多选 
     * @return DbNames 数据库 多选
     */
    public String [] getDbNames() {
        return this.DbNames;
    }

    /**
     * Set 数据库 多选
     * @param DbNames 数据库 多选
     */
    public void setDbNames(String [] DbNames) {
        this.DbNames = DbNames;
    }

    /**
     * Get sql类型 多选 
     * @return SqlTypes sql类型 多选
     */
    public String [] getSqlTypes() {
        return this.SqlTypes;
    }

    /**
     * Set sql类型 多选
     * @param SqlTypes sql类型 多选
     */
    public void setSqlTypes(String [] SqlTypes) {
        this.SqlTypes = SqlTypes;
    }

    /**
     * Get catalog名称 （多选） 
     * @return Catalogs catalog名称 （多选）
     */
    public String [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set catalog名称 （多选）
     * @param Catalogs catalog名称 （多选）
     */
    public void setCatalogs(String [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    /**
     * Get 是否是查询	 
     * @return IsQuery 是否是查询	
     */
    public Boolean [] getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set 是否是查询	
     * @param IsQuery 是否是查询	
     */
    public void setIsQuery(Boolean [] IsQuery) {
        this.IsQuery = IsQuery;
    }

    public DescribeDatabaseAuditDownloadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseAuditDownloadRequest(DescribeDatabaseAuditDownloadRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.DbNames != null) {
            this.DbNames = new String[source.DbNames.length];
            for (int i = 0; i < source.DbNames.length; i++) {
                this.DbNames[i] = new String(source.DbNames[i]);
            }
        }
        if (source.SqlTypes != null) {
            this.SqlTypes = new String[source.SqlTypes.length];
            for (int i = 0; i < source.SqlTypes.length; i++) {
                this.SqlTypes[i] = new String(source.SqlTypes[i]);
            }
        }
        if (source.Catalogs != null) {
            this.Catalogs = new String[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new String(source.Catalogs[i]);
            }
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Boolean[source.IsQuery.length];
            for (int i = 0; i < source.IsQuery.length; i++) {
                this.IsQuery[i] = new Boolean(source.IsQuery[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "DbNames.", this.DbNames);
        this.setParamArraySimple(map, prefix + "SqlTypes.", this.SqlTypes);
        this.setParamArraySimple(map, prefix + "Catalogs.", this.Catalogs);
        this.setParamArraySimple(map, prefix + "IsQuery.", this.IsQuery);

    }
}

