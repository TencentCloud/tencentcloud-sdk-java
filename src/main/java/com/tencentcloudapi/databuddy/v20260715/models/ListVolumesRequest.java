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

public class ListVolumesRequest extends AbstractModel {

    /**
    * <p>数据目录名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>schema名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>获取数量</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>调用时所在workspace唯一id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>分页信息</p>
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
     * Get <p>数据目录名称</p> 
     * @return CatalogName <p>数据目录名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名称</p>
     * @param CatalogName <p>数据目录名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>schema名称</p> 
     * @return SchemaName <p>schema名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名称</p>
     * @param SchemaName <p>schema名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>获取数量</p> 
     * @return MaxResults <p>获取数量</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>获取数量</p>
     * @param MaxResults <p>获取数量</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
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
     * Get <p>分页信息</p> 
     * @return PageToken <p>分页信息</p>
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set <p>分页信息</p>
     * @param PageToken <p>分页信息</p>
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

    public ListVolumesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVolumesRequest(ListVolumesRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.FetchOption != null) {
            this.FetchOption = new FetchOption(source.FetchOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamObj(map, prefix + "FetchOption.", this.FetchOption);

    }
}

