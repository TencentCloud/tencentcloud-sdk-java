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

public class GetCatalogRequest extends AbstractModel {

    /**
    * <p>数据目录名</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>调用时所在workspace唯一id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>数据目录id</p>
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
    * <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p>
    */
    @SerializedName("FetchOption")
    @Expose
    private FetchOption FetchOption;

    /**
    * <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径</p>
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
     * Get <p>数据目录id</p> 
     * @return CatalogId <p>数据目录id</p>
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set <p>数据目录id</p>
     * @param CatalogId <p>数据目录id</p>
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
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
     * Get <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径</p> 
     * @return ConnectionId <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径</p>
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径</p>
     * @param ConnectionId <p>数据源连接ID，可选（融合版新增字段）。非空→走分析版路径，空/缺省→走专业版TcLake路径</p>
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

    public GetCatalogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCatalogRequest(GetCatalogRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
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
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamObj(map, prefix + "FetchOption.", this.FetchOption);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);

    }
}

