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

public class ListFeatureTablesRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Catalog目录列表</p>
    */
    @SerializedName("CatalogNames")
    @Expose
    private String [] CatalogNames;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>我负责的</p>
    */
    @SerializedName("OwnerMe")
    @Expose
    private Boolean OwnerMe;

    /**
    * <p>最大结果条数，可选，取值1～50</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>分页token信息(base64编码)，可选</p>
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * <p>排序，Name(CreateTime/ModifiedTime), Direction(Desc/Asc)</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>关键字</p> 
     * @return Keyword <p>关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字</p>
     * @param Keyword <p>关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>Catalog目录列表</p> 
     * @return CatalogNames <p>Catalog目录列表</p>
     */
    public String [] getCatalogNames() {
        return this.CatalogNames;
    }

    /**
     * Set <p>Catalog目录列表</p>
     * @param CatalogNames <p>Catalog目录列表</p>
     */
    public void setCatalogNames(String [] CatalogNames) {
        this.CatalogNames = CatalogNames;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>我负责的</p> 
     * @return OwnerMe <p>我负责的</p>
     */
    public Boolean getOwnerMe() {
        return this.OwnerMe;
    }

    /**
     * Set <p>我负责的</p>
     * @param OwnerMe <p>我负责的</p>
     */
    public void setOwnerMe(Boolean OwnerMe) {
        this.OwnerMe = OwnerMe;
    }

    /**
     * Get <p>最大结果条数，可选，取值1～50</p> 
     * @return MaxResults <p>最大结果条数，可选，取值1～50</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>最大结果条数，可选，取值1～50</p>
     * @param MaxResults <p>最大结果条数，可选，取值1～50</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>分页token信息(base64编码)，可选</p> 
     * @return PageToken <p>分页token信息(base64编码)，可选</p>
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set <p>分页token信息(base64编码)，可选</p>
     * @param PageToken <p>分页token信息(base64编码)，可选</p>
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get <p>排序，Name(CreateTime/ModifiedTime), Direction(Desc/Asc)</p> 
     * @return OrderBys <p>排序，Name(CreateTime/ModifiedTime), Direction(Desc/Asc)</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>排序，Name(CreateTime/ModifiedTime), Direction(Desc/Asc)</p>
     * @param OrderBys <p>排序，Name(CreateTime/ModifiedTime), Direction(Desc/Asc)</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListFeatureTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFeatureTablesRequest(ListFeatureTablesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.CatalogNames != null) {
            this.CatalogNames = new String[source.CatalogNames.length];
            for (int i = 0; i < source.CatalogNames.length; i++) {
                this.CatalogNames[i] = new String(source.CatalogNames[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.OwnerMe != null) {
            this.OwnerMe = new Boolean(source.OwnerMe);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "CatalogNames.", this.CatalogNames);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OwnerMe", this.OwnerMe);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}

