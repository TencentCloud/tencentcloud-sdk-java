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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataSourceListRequest extends AbstractModel{

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
    * 查询数据源黑名单机制，比如不想要系统数据源["system"]
    */
    @SerializedName("NotQuerySubTypeList")
    @Expose
    private String [] NotQuerySubTypeList;

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
     * Get 查询数据源黑名单机制，比如不想要系统数据源["system"] 
     * @return NotQuerySubTypeList 查询数据源黑名单机制，比如不想要系统数据源["system"]
     */
    public String [] getNotQuerySubTypeList() {
        return this.NotQuerySubTypeList;
    }

    /**
     * Set 查询数据源黑名单机制，比如不想要系统数据源["system"]
     * @param NotQuerySubTypeList 查询数据源黑名单机制，比如不想要系统数据源["system"]
     */
    public void setNotQuerySubTypeList(String [] NotQuerySubTypeList) {
        this.NotQuerySubTypeList = NotQuerySubTypeList;
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

    }
}

