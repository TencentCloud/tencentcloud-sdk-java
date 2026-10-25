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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTablesRequest extends AbstractModel {

    /**
    * <p>数据目录名</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>数据库名</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>调用时所在workspace唯一id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>最大结果条数</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>分页token</p>
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p>
    */
    @SerializedName("FetchOption")
    @Expose
    private FetchOption FetchOption;

    /**
    * <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径。通过ListConnections接口获取</p>
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * <p>数据目录来源，可选（Setats融合新增字段）。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。路由优先级：显式非空CatalogSource &gt; 非空ConnectionId（视为CONNECTION）&gt; 默认METALAKE；CatalogSource非空时ConnectionId将被忽略。</p>
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
     * Get <p>数据目录名</p> 
     * @return CatalogName <p>数据目录名</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名</p>
     * @param CatalogName <p>数据目录名</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>数据库名</p> 
     * @return SchemaName <p>数据库名</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>数据库名</p>
     * @param SchemaName <p>数据库名</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>调用时所在workspace唯一id</p> 
     * @return WorkspaceId <p>调用时所在workspace唯一id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>调用时所在workspace唯一id</p>
     * @param WorkspaceId <p>调用时所在workspace唯一id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>最大结果条数</p> 
     * @return MaxResults <p>最大结果条数</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>最大结果条数</p>
     * @param MaxResults <p>最大结果条数</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>分页token</p> 
     * @return PageToken <p>分页token</p>
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set <p>分页token</p>
     * @param PageToken <p>分页token</p>
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p> 
     * @return FetchOption <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p>
     */
    public FetchOption getFetchOption() {
        return this.FetchOption;
    }

    /**
     * Set <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p>
     * @param FetchOption <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p>
     */
    public void setFetchOption(FetchOption FetchOption) {
        this.FetchOption = FetchOption;
    }

    /**
     * Get <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径。通过ListConnections接口获取</p> 
     * @return ConnectionId <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径。通过ListConnections接口获取</p>
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径。通过ListConnections接口获取</p>
     * @param ConnectionId <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径。通过ListConnections接口获取</p>
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get <p>数据目录来源，可选（Setats融合新增字段）。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。路由优先级：显式非空CatalogSource &gt; 非空ConnectionId（视为CONNECTION）&gt; 默认METALAKE；CatalogSource非空时ConnectionId将被忽略。</p> 
     * @return CatalogSource <p>数据目录来源，可选（Setats融合新增字段）。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。路由优先级：显式非空CatalogSource &gt; 非空ConnectionId（视为CONNECTION）&gt; 默认METALAKE；CatalogSource非空时ConnectionId将被忽略。</p>
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>数据目录来源，可选（Setats融合新增字段）。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。路由优先级：显式非空CatalogSource &gt; 非空ConnectionId（视为CONNECTION）&gt; 默认METALAKE；CatalogSource非空时ConnectionId将被忽略。</p>
     * @param CatalogSource <p>数据目录来源，可选（Setats融合新增字段）。取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。路由优先级：显式非空CatalogSource &gt; 非空ConnectionId（视为CONNECTION）&gt; 默认METALAKE；CatalogSource非空时ConnectionId将被忽略。</p>
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    public ListTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTablesRequest(ListTablesRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.FetchOption != null) {
            this.FetchOption = new FetchOption(source.FetchOption);
        }
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamObj(map, prefix + "FetchOption.", this.FetchOption);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);

    }
}

