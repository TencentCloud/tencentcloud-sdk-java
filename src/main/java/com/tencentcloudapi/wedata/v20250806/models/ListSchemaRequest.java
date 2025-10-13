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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSchemaRequest extends AbstractModel {

    /**
    * 页码，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小，最大500
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 目录名称
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据源ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库模式搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 页码，从1开始 
     * @return PageNumber 页码，从1开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，从1开始
     * @param PageNumber 页码，从1开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小，最大500 
     * @return PageSize 分页大小，最大500
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，最大500
     * @param PageSize 分页大小，最大500
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 目录名称 
     * @return CatalogName 目录名称
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 目录名称
     * @param CatalogName 目录名称
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据源ID 
     * @return DatasourceId 数据源ID
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
     * @param DatasourceId 数据源ID
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
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
     * Get 数据库模式搜索关键字 
     * @return Keyword 数据库模式搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 数据库模式搜索关键字
     * @param Keyword 数据库模式搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListSchemaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSchemaRequest(ListSchemaRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
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
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

