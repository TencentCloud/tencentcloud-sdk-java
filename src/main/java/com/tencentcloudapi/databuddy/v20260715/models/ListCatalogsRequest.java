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

public class ListCatalogsRequest extends AbstractModel {

    /**
    * <p>工作空间唯一id</p>
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
    * <p>catalog类型，可填：TABLE、MODEL、VOLUME</p>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>是否只返回当前工作空间有权限的，false时会额外返回当前用户有权限管理的catalog</p>
    */
    @SerializedName("CurrentWorkspaceOnly")
    @Expose
    private Boolean CurrentWorkspaceOnly;

    /**
    * <p>数据获取选项，可选，控制是否返回权限信息及按权限过滤</p>
    */
    @SerializedName("FetchOption")
    @Expose
    private FetchOption FetchOption;

    /**
    * 数据目录来源筛选（融合版新增字段），取值参考 CatalogSourceEnum。空数组或不传→只查tclake；["METALAKE"]→只查tclake；["CONNECTION"]→只查分析版ana_catalog；["METALAKE","CONNECTION"]→合并返回
    */
    @SerializedName("CatalogSources")
    @Expose
    private String [] CatalogSources;

    /**
     * Get <p>工作空间唯一id</p> 
     * @return WorkspaceId <p>工作空间唯一id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间唯一id</p>
     * @param WorkspaceId <p>工作空间唯一id</p>
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
     * Get <p>catalog类型，可填：TABLE、MODEL、VOLUME</p> 
     * @return Types <p>catalog类型，可填：TABLE、MODEL、VOLUME</p>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>catalog类型，可填：TABLE、MODEL、VOLUME</p>
     * @param Types <p>catalog类型，可填：TABLE、MODEL、VOLUME</p>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>是否只返回当前工作空间有权限的，false时会额外返回当前用户有权限管理的catalog</p> 
     * @return CurrentWorkspaceOnly <p>是否只返回当前工作空间有权限的，false时会额外返回当前用户有权限管理的catalog</p>
     */
    public Boolean getCurrentWorkspaceOnly() {
        return this.CurrentWorkspaceOnly;
    }

    /**
     * Set <p>是否只返回当前工作空间有权限的，false时会额外返回当前用户有权限管理的catalog</p>
     * @param CurrentWorkspaceOnly <p>是否只返回当前工作空间有权限的，false时会额外返回当前用户有权限管理的catalog</p>
     */
    public void setCurrentWorkspaceOnly(Boolean CurrentWorkspaceOnly) {
        this.CurrentWorkspaceOnly = CurrentWorkspaceOnly;
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
     * Get 数据目录来源筛选（融合版新增字段），取值参考 CatalogSourceEnum。空数组或不传→只查tclake；["METALAKE"]→只查tclake；["CONNECTION"]→只查分析版ana_catalog；["METALAKE","CONNECTION"]→合并返回 
     * @return CatalogSources 数据目录来源筛选（融合版新增字段），取值参考 CatalogSourceEnum。空数组或不传→只查tclake；["METALAKE"]→只查tclake；["CONNECTION"]→只查分析版ana_catalog；["METALAKE","CONNECTION"]→合并返回
     */
    public String [] getCatalogSources() {
        return this.CatalogSources;
    }

    /**
     * Set 数据目录来源筛选（融合版新增字段），取值参考 CatalogSourceEnum。空数组或不传→只查tclake；["METALAKE"]→只查tclake；["CONNECTION"]→只查分析版ana_catalog；["METALAKE","CONNECTION"]→合并返回
     * @param CatalogSources 数据目录来源筛选（融合版新增字段），取值参考 CatalogSourceEnum。空数组或不传→只查tclake；["METALAKE"]→只查tclake；["CONNECTION"]→只查分析版ana_catalog；["METALAKE","CONNECTION"]→合并返回
     */
    public void setCatalogSources(String [] CatalogSources) {
        this.CatalogSources = CatalogSources;
    }

    public ListCatalogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCatalogsRequest(ListCatalogsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.CurrentWorkspaceOnly != null) {
            this.CurrentWorkspaceOnly = new Boolean(source.CurrentWorkspaceOnly);
        }
        if (source.FetchOption != null) {
            this.FetchOption = new FetchOption(source.FetchOption);
        }
        if (source.CatalogSources != null) {
            this.CatalogSources = new String[source.CatalogSources.length];
            for (int i = 0; i < source.CatalogSources.length; i++) {
                this.CatalogSources[i] = new String(source.CatalogSources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "CurrentWorkspaceOnly", this.CurrentWorkspaceOnly);
        this.setParamObj(map, prefix + "FetchOption.", this.FetchOption);
        this.setParamArraySimple(map, prefix + "CatalogSources.", this.CatalogSources);

    }
}

