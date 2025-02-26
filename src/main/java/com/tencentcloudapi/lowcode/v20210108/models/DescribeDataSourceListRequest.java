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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataSourceListRequest extends AbstractModel {

    /**
    * 每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 环境 id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 应用id数组
    */
    @SerializedName("Appids")
    @Expose
    private String [] Appids;

    /**
    * 数据源id数组
    */
    @SerializedName("DataSourceIds")
    @Expose
    private String [] DataSourceIds;

    /**
    * 数据源名称数组
    */
    @SerializedName("DataSourceNames")
    @Expose
    private String [] DataSourceNames;

    /**
    * 数据源类型 database-自建数据源；cloud-integration-自定义数据源
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 数据源模糊查询参数
    */
    @SerializedName("QueryOption")
    @Expose
    private DataSourceQueryOption QueryOption;

    /**
    * 数据源视图Id数组
    */
    @SerializedName("ViewIds")
    @Expose
    private String [] ViewIds;

    /**
    * 查询未关联应用的数据源，0:未关联，该参数配合 AppIds 参数一块使用
    */
    @SerializedName("AppLinkStatus")
    @Expose
    private Long AppLinkStatus;

    /**
    * 查询应用绑定数据源: 0: 否,1: 是
    */
    @SerializedName("QueryBindToApp")
    @Expose
    private Long QueryBindToApp;

    /**
    * 查询连接器 0 数据模型 1 连接器 2 自定义连接器
    */
    @SerializedName("QueryConnector")
    @Expose
    private Long QueryConnector;

    /**
    * 废弃中
    */
    @SerializedName("NotQuerySubTypeList")
    @Expose
    private String [] NotQuerySubTypeList;

    /**
    * 查询channelList
    */
    @SerializedName("ChannelList")
    @Expose
    private String [] ChannelList;

    /**
    * 是否查询数据源关联关系
    */
    @SerializedName("QueryDataSourceRelationList")
    @Expose
    private Boolean QueryDataSourceRelationList;

    /**
    * db实例类型
    */
    @SerializedName("DbInstanceType")
    @Expose
    private String DbInstanceType;

    /**
    * 数据库表名列表
    */
    @SerializedName("DatabaseTableNames")
    @Expose
    private String [] DatabaseTableNames;

    /**
    * 是否查询系统模型，默认为true，需要显示设置为False才能过滤系统模型
    */
    @SerializedName("QuerySystemModel")
    @Expose
    private Boolean QuerySystemModel;

    /**
     * Get 每页条数 
     * @return PageSize 每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
     * @param PageSize 每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码 
     * @return PageIndex 页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页码
     * @param PageIndex 页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 环境 id 
     * @return EnvId 环境 id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 id
     * @param EnvId 环境 id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 应用id数组 
     * @return Appids 应用id数组
     */
    public String [] getAppids() {
        return this.Appids;
    }

    /**
     * Set 应用id数组
     * @param Appids 应用id数组
     */
    public void setAppids(String [] Appids) {
        this.Appids = Appids;
    }

    /**
     * Get 数据源id数组 
     * @return DataSourceIds 数据源id数组
     */
    public String [] getDataSourceIds() {
        return this.DataSourceIds;
    }

    /**
     * Set 数据源id数组
     * @param DataSourceIds 数据源id数组
     */
    public void setDataSourceIds(String [] DataSourceIds) {
        this.DataSourceIds = DataSourceIds;
    }

    /**
     * Get 数据源名称数组 
     * @return DataSourceNames 数据源名称数组
     */
    public String [] getDataSourceNames() {
        return this.DataSourceNames;
    }

    /**
     * Set 数据源名称数组
     * @param DataSourceNames 数据源名称数组
     */
    public void setDataSourceNames(String [] DataSourceNames) {
        this.DataSourceNames = DataSourceNames;
    }

    /**
     * Get 数据源类型 database-自建数据源；cloud-integration-自定义数据源 
     * @return DataSourceType 数据源类型 database-自建数据源；cloud-integration-自定义数据源
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型 database-自建数据源；cloud-integration-自定义数据源
     * @param DataSourceType 数据源类型 database-自建数据源；cloud-integration-自定义数据源
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 数据源模糊查询参数 
     * @return QueryOption 数据源模糊查询参数
     */
    public DataSourceQueryOption getQueryOption() {
        return this.QueryOption;
    }

    /**
     * Set 数据源模糊查询参数
     * @param QueryOption 数据源模糊查询参数
     */
    public void setQueryOption(DataSourceQueryOption QueryOption) {
        this.QueryOption = QueryOption;
    }

    /**
     * Get 数据源视图Id数组 
     * @return ViewIds 数据源视图Id数组
     */
    public String [] getViewIds() {
        return this.ViewIds;
    }

    /**
     * Set 数据源视图Id数组
     * @param ViewIds 数据源视图Id数组
     */
    public void setViewIds(String [] ViewIds) {
        this.ViewIds = ViewIds;
    }

    /**
     * Get 查询未关联应用的数据源，0:未关联，该参数配合 AppIds 参数一块使用 
     * @return AppLinkStatus 查询未关联应用的数据源，0:未关联，该参数配合 AppIds 参数一块使用
     */
    public Long getAppLinkStatus() {
        return this.AppLinkStatus;
    }

    /**
     * Set 查询未关联应用的数据源，0:未关联，该参数配合 AppIds 参数一块使用
     * @param AppLinkStatus 查询未关联应用的数据源，0:未关联，该参数配合 AppIds 参数一块使用
     */
    public void setAppLinkStatus(Long AppLinkStatus) {
        this.AppLinkStatus = AppLinkStatus;
    }

    /**
     * Get 查询应用绑定数据源: 0: 否,1: 是 
     * @return QueryBindToApp 查询应用绑定数据源: 0: 否,1: 是
     */
    public Long getQueryBindToApp() {
        return this.QueryBindToApp;
    }

    /**
     * Set 查询应用绑定数据源: 0: 否,1: 是
     * @param QueryBindToApp 查询应用绑定数据源: 0: 否,1: 是
     */
    public void setQueryBindToApp(Long QueryBindToApp) {
        this.QueryBindToApp = QueryBindToApp;
    }

    /**
     * Get 查询连接器 0 数据模型 1 连接器 2 自定义连接器 
     * @return QueryConnector 查询连接器 0 数据模型 1 连接器 2 自定义连接器
     */
    public Long getQueryConnector() {
        return this.QueryConnector;
    }

    /**
     * Set 查询连接器 0 数据模型 1 连接器 2 自定义连接器
     * @param QueryConnector 查询连接器 0 数据模型 1 连接器 2 自定义连接器
     */
    public void setQueryConnector(Long QueryConnector) {
        this.QueryConnector = QueryConnector;
    }

    /**
     * Get 废弃中 
     * @return NotQuerySubTypeList 废弃中
     */
    public String [] getNotQuerySubTypeList() {
        return this.NotQuerySubTypeList;
    }

    /**
     * Set 废弃中
     * @param NotQuerySubTypeList 废弃中
     */
    public void setNotQuerySubTypeList(String [] NotQuerySubTypeList) {
        this.NotQuerySubTypeList = NotQuerySubTypeList;
    }

    /**
     * Get 查询channelList 
     * @return ChannelList 查询channelList
     */
    public String [] getChannelList() {
        return this.ChannelList;
    }

    /**
     * Set 查询channelList
     * @param ChannelList 查询channelList
     */
    public void setChannelList(String [] ChannelList) {
        this.ChannelList = ChannelList;
    }

    /**
     * Get 是否查询数据源关联关系 
     * @return QueryDataSourceRelationList 是否查询数据源关联关系
     */
    public Boolean getQueryDataSourceRelationList() {
        return this.QueryDataSourceRelationList;
    }

    /**
     * Set 是否查询数据源关联关系
     * @param QueryDataSourceRelationList 是否查询数据源关联关系
     */
    public void setQueryDataSourceRelationList(Boolean QueryDataSourceRelationList) {
        this.QueryDataSourceRelationList = QueryDataSourceRelationList;
    }

    /**
     * Get db实例类型 
     * @return DbInstanceType db实例类型
     */
    public String getDbInstanceType() {
        return this.DbInstanceType;
    }

    /**
     * Set db实例类型
     * @param DbInstanceType db实例类型
     */
    public void setDbInstanceType(String DbInstanceType) {
        this.DbInstanceType = DbInstanceType;
    }

    /**
     * Get 数据库表名列表 
     * @return DatabaseTableNames 数据库表名列表
     */
    public String [] getDatabaseTableNames() {
        return this.DatabaseTableNames;
    }

    /**
     * Set 数据库表名列表
     * @param DatabaseTableNames 数据库表名列表
     */
    public void setDatabaseTableNames(String [] DatabaseTableNames) {
        this.DatabaseTableNames = DatabaseTableNames;
    }

    /**
     * Get 是否查询系统模型，默认为true，需要显示设置为False才能过滤系统模型 
     * @return QuerySystemModel 是否查询系统模型，默认为true，需要显示设置为False才能过滤系统模型
     */
    public Boolean getQuerySystemModel() {
        return this.QuerySystemModel;
    }

    /**
     * Set 是否查询系统模型，默认为true，需要显示设置为False才能过滤系统模型
     * @param QuerySystemModel 是否查询系统模型，默认为true，需要显示设置为False才能过滤系统模型
     */
    public void setQuerySystemModel(Boolean QuerySystemModel) {
        this.QuerySystemModel = QuerySystemModel;
    }

    public DescribeDataSourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataSourceListRequest(DescribeDataSourceListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Appids != null) {
            this.Appids = new String[source.Appids.length];
            for (int i = 0; i < source.Appids.length; i++) {
                this.Appids[i] = new String(source.Appids[i]);
            }
        }
        if (source.DataSourceIds != null) {
            this.DataSourceIds = new String[source.DataSourceIds.length];
            for (int i = 0; i < source.DataSourceIds.length; i++) {
                this.DataSourceIds[i] = new String(source.DataSourceIds[i]);
            }
        }
        if (source.DataSourceNames != null) {
            this.DataSourceNames = new String[source.DataSourceNames.length];
            for (int i = 0; i < source.DataSourceNames.length; i++) {
                this.DataSourceNames[i] = new String(source.DataSourceNames[i]);
            }
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.QueryOption != null) {
            this.QueryOption = new DataSourceQueryOption(source.QueryOption);
        }
        if (source.ViewIds != null) {
            this.ViewIds = new String[source.ViewIds.length];
            for (int i = 0; i < source.ViewIds.length; i++) {
                this.ViewIds[i] = new String(source.ViewIds[i]);
            }
        }
        if (source.AppLinkStatus != null) {
            this.AppLinkStatus = new Long(source.AppLinkStatus);
        }
        if (source.QueryBindToApp != null) {
            this.QueryBindToApp = new Long(source.QueryBindToApp);
        }
        if (source.QueryConnector != null) {
            this.QueryConnector = new Long(source.QueryConnector);
        }
        if (source.NotQuerySubTypeList != null) {
            this.NotQuerySubTypeList = new String[source.NotQuerySubTypeList.length];
            for (int i = 0; i < source.NotQuerySubTypeList.length; i++) {
                this.NotQuerySubTypeList[i] = new String(source.NotQuerySubTypeList[i]);
            }
        }
        if (source.ChannelList != null) {
            this.ChannelList = new String[source.ChannelList.length];
            for (int i = 0; i < source.ChannelList.length; i++) {
                this.ChannelList[i] = new String(source.ChannelList[i]);
            }
        }
        if (source.QueryDataSourceRelationList != null) {
            this.QueryDataSourceRelationList = new Boolean(source.QueryDataSourceRelationList);
        }
        if (source.DbInstanceType != null) {
            this.DbInstanceType = new String(source.DbInstanceType);
        }
        if (source.DatabaseTableNames != null) {
            this.DatabaseTableNames = new String[source.DatabaseTableNames.length];
            for (int i = 0; i < source.DatabaseTableNames.length; i++) {
                this.DatabaseTableNames[i] = new String(source.DatabaseTableNames[i]);
            }
        }
        if (source.QuerySystemModel != null) {
            this.QuerySystemModel = new Boolean(source.QuerySystemModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "Appids.", this.Appids);
        this.setParamArraySimple(map, prefix + "DataSourceIds.", this.DataSourceIds);
        this.setParamArraySimple(map, prefix + "DataSourceNames.", this.DataSourceNames);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamObj(map, prefix + "QueryOption.", this.QueryOption);
        this.setParamArraySimple(map, prefix + "ViewIds.", this.ViewIds);
        this.setParamSimple(map, prefix + "AppLinkStatus", this.AppLinkStatus);
        this.setParamSimple(map, prefix + "QueryBindToApp", this.QueryBindToApp);
        this.setParamSimple(map, prefix + "QueryConnector", this.QueryConnector);
        this.setParamArraySimple(map, prefix + "NotQuerySubTypeList.", this.NotQuerySubTypeList);
        this.setParamArraySimple(map, prefix + "ChannelList.", this.ChannelList);
        this.setParamSimple(map, prefix + "QueryDataSourceRelationList", this.QueryDataSourceRelationList);
        this.setParamSimple(map, prefix + "DbInstanceType", this.DbInstanceType);
        this.setParamArraySimple(map, prefix + "DatabaseTableNames.", this.DatabaseTableNames);
        this.setParamSimple(map, prefix + "QuerySystemModel", this.QuerySystemModel);

    }
}

