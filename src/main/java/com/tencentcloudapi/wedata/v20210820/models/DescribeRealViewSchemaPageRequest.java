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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealViewSchemaPageRequest extends AbstractModel {

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页记录数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据type
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 环境信息
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * 项目model
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * dev的数据源Id
    */
    @SerializedName("DevDatasourceId")
    @Expose
    private String DevDatasourceId;

    /**
    * 过滤字段
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页记录数 
     * @return PageSize 每页记录数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页记录数
     * @param PageSize 每页记录数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据type 
     * @return DataSourceType 数据type
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据type
     * @param DataSourceType 数据type
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 环境信息 
     * @return Env 环境信息
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境信息
     * @param Env 环境信息
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get 项目model 
     * @return Model 项目model
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 项目model
     * @param Model 项目model
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get dev的数据源Id 
     * @return DevDatasourceId dev的数据源Id
     */
    public String getDevDatasourceId() {
        return this.DevDatasourceId;
    }

    /**
     * Set dev的数据源Id
     * @param DevDatasourceId dev的数据源Id
     */
    public void setDevDatasourceId(String DevDatasourceId) {
        this.DevDatasourceId = DevDatasourceId;
    }

    /**
     * Get 过滤字段 
     * @return Keyword 过滤字段
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 过滤字段
     * @param Keyword 过滤字段
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeRealViewSchemaPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealViewSchemaPageRequest(DescribeRealViewSchemaPageRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.DevDatasourceId != null) {
            this.DevDatasourceId = new String(source.DevDatasourceId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "DevDatasourceId", this.DevDatasourceId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

