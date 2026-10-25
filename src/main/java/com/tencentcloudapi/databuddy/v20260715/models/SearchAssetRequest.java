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

public class SearchAssetRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>最大结果条数，默认30，可选30～50</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>资产类型列表，类型参见ListEntityTypeMetas的返回</p>
    */
    @SerializedName("AssetTypes")
    @Expose
    private String [] AssetTypes;

    /**
    * <p>分页token信息，取上一页返回NextPageToken</p>
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * <p>按资产负责人检索</p><ul><li>my 我负责的(包含my时其他uin不生效)</li><li>uin 指定用户uin</li></ul>
    */
    @SerializedName("Owner")
    @Expose
    private String [] Owner;

    /**
    * <p>标签IDs，可通过 ListTags 获取</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>标签值IDs，可通过 ListTags 获取</p>
    */
    @SerializedName("TagValueIds")
    @Expose
    private Long [] TagValueIds;

    /**
    * <p>更新时间，13位时间戳</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>数据目录列表</p>
    */
    @SerializedName("CatalogNames")
    @Expose
    private String [] CatalogNames;

    /**
    * <p>工作空间路径筛选(非catalog类资产)</p>
    */
    @SerializedName("WorkspacePaths")
    @Expose
    private String [] WorkspacePaths;

    /**
    * <p>是否开启混合搜索</p>
    */
    @SerializedName("EnableHybridSearch")
    @Expose
    private Boolean EnableHybridSearch;

    /**
    * <p>字段标签ID列表（可选）。使用场景：根据字段上打的标签检索资产（表），返回包含该字段标签的资产。与 TagIds 的区别：TagIds 是表级标签过滤，FieldTagIds 是字段级标签过滤。规格要求：int64 数组，最多支持 20 个标签 ID 同时过滤。可通过 ListTags 获取</p>
    */
    @SerializedName("FieldTagIds")
    @Expose
    private Long [] FieldTagIds;

    /**
    * <p>排序，为空时默认按相关度倒排序</p><p>Name:<br>PopularityQuantity 热度</p><p>Direction:<br>Desc 降序<br>Asc 升序</p>
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
     * Get <p>最大结果条数，默认30，可选30～50</p> 
     * @return MaxResults <p>最大结果条数，默认30，可选30～50</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>最大结果条数，默认30，可选30～50</p>
     * @param MaxResults <p>最大结果条数，默认30，可选30～50</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
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
     * Get <p>资产类型列表，类型参见ListEntityTypeMetas的返回</p> 
     * @return AssetTypes <p>资产类型列表，类型参见ListEntityTypeMetas的返回</p>
     */
    public String [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set <p>资产类型列表，类型参见ListEntityTypeMetas的返回</p>
     * @param AssetTypes <p>资产类型列表，类型参见ListEntityTypeMetas的返回</p>
     */
    public void setAssetTypes(String [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    /**
     * Get <p>分页token信息，取上一页返回NextPageToken</p> 
     * @return PageToken <p>分页token信息，取上一页返回NextPageToken</p>
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set <p>分页token信息，取上一页返回NextPageToken</p>
     * @param PageToken <p>分页token信息，取上一页返回NextPageToken</p>
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get <p>按资产负责人检索</p><ul><li>my 我负责的(包含my时其他uin不生效)</li><li>uin 指定用户uin</li></ul> 
     * @return Owner <p>按资产负责人检索</p><ul><li>my 我负责的(包含my时其他uin不生效)</li><li>uin 指定用户uin</li></ul>
     */
    public String [] getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>按资产负责人检索</p><ul><li>my 我负责的(包含my时其他uin不生效)</li><li>uin 指定用户uin</li></ul>
     * @param Owner <p>按资产负责人检索</p><ul><li>my 我负责的(包含my时其他uin不生效)</li><li>uin 指定用户uin</li></ul>
     */
    public void setOwner(String [] Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>标签IDs，可通过 ListTags 获取</p> 
     * @return TagIds <p>标签IDs，可通过 ListTags 获取</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>标签IDs，可通过 ListTags 获取</p>
     * @param TagIds <p>标签IDs，可通过 ListTags 获取</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>标签值IDs，可通过 ListTags 获取</p> 
     * @return TagValueIds <p>标签值IDs，可通过 ListTags 获取</p>
     */
    public Long [] getTagValueIds() {
        return this.TagValueIds;
    }

    /**
     * Set <p>标签值IDs，可通过 ListTags 获取</p>
     * @param TagValueIds <p>标签值IDs，可通过 ListTags 获取</p>
     */
    public void setTagValueIds(Long [] TagValueIds) {
        this.TagValueIds = TagValueIds;
    }

    /**
     * Get <p>更新时间，13位时间戳</p> 
     * @return ModifiedTime <p>更新时间，13位时间戳</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>更新时间，13位时间戳</p>
     * @param ModifiedTime <p>更新时间，13位时间戳</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>数据目录列表</p> 
     * @return CatalogNames <p>数据目录列表</p>
     */
    public String [] getCatalogNames() {
        return this.CatalogNames;
    }

    /**
     * Set <p>数据目录列表</p>
     * @param CatalogNames <p>数据目录列表</p>
     */
    public void setCatalogNames(String [] CatalogNames) {
        this.CatalogNames = CatalogNames;
    }

    /**
     * Get <p>工作空间路径筛选(非catalog类资产)</p> 
     * @return WorkspacePaths <p>工作空间路径筛选(非catalog类资产)</p>
     */
    public String [] getWorkspacePaths() {
        return this.WorkspacePaths;
    }

    /**
     * Set <p>工作空间路径筛选(非catalog类资产)</p>
     * @param WorkspacePaths <p>工作空间路径筛选(非catalog类资产)</p>
     */
    public void setWorkspacePaths(String [] WorkspacePaths) {
        this.WorkspacePaths = WorkspacePaths;
    }

    /**
     * Get <p>是否开启混合搜索</p> 
     * @return EnableHybridSearch <p>是否开启混合搜索</p>
     */
    public Boolean getEnableHybridSearch() {
        return this.EnableHybridSearch;
    }

    /**
     * Set <p>是否开启混合搜索</p>
     * @param EnableHybridSearch <p>是否开启混合搜索</p>
     */
    public void setEnableHybridSearch(Boolean EnableHybridSearch) {
        this.EnableHybridSearch = EnableHybridSearch;
    }

    /**
     * Get <p>字段标签ID列表（可选）。使用场景：根据字段上打的标签检索资产（表），返回包含该字段标签的资产。与 TagIds 的区别：TagIds 是表级标签过滤，FieldTagIds 是字段级标签过滤。规格要求：int64 数组，最多支持 20 个标签 ID 同时过滤。可通过 ListTags 获取</p> 
     * @return FieldTagIds <p>字段标签ID列表（可选）。使用场景：根据字段上打的标签检索资产（表），返回包含该字段标签的资产。与 TagIds 的区别：TagIds 是表级标签过滤，FieldTagIds 是字段级标签过滤。规格要求：int64 数组，最多支持 20 个标签 ID 同时过滤。可通过 ListTags 获取</p>
     */
    public Long [] getFieldTagIds() {
        return this.FieldTagIds;
    }

    /**
     * Set <p>字段标签ID列表（可选）。使用场景：根据字段上打的标签检索资产（表），返回包含该字段标签的资产。与 TagIds 的区别：TagIds 是表级标签过滤，FieldTagIds 是字段级标签过滤。规格要求：int64 数组，最多支持 20 个标签 ID 同时过滤。可通过 ListTags 获取</p>
     * @param FieldTagIds <p>字段标签ID列表（可选）。使用场景：根据字段上打的标签检索资产（表），返回包含该字段标签的资产。与 TagIds 的区别：TagIds 是表级标签过滤，FieldTagIds 是字段级标签过滤。规格要求：int64 数组，最多支持 20 个标签 ID 同时过滤。可通过 ListTags 获取</p>
     */
    public void setFieldTagIds(Long [] FieldTagIds) {
        this.FieldTagIds = FieldTagIds;
    }

    /**
     * Get <p>排序，为空时默认按相关度倒排序</p><p>Name:<br>PopularityQuantity 热度</p><p>Direction:<br>Desc 降序<br>Asc 升序</p> 
     * @return OrderBys <p>排序，为空时默认按相关度倒排序</p><p>Name:<br>PopularityQuantity 热度</p><p>Direction:<br>Desc 降序<br>Asc 升序</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>排序，为空时默认按相关度倒排序</p><p>Name:<br>PopularityQuantity 热度</p><p>Direction:<br>Desc 降序<br>Asc 升序</p>
     * @param OrderBys <p>排序，为空时默认按相关度倒排序</p><p>Name:<br>PopularityQuantity 热度</p><p>Direction:<br>Desc 降序<br>Asc 升序</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public SearchAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAssetRequest(SearchAssetRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new String[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new String(source.AssetTypes[i]);
            }
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.Owner != null) {
            this.Owner = new String[source.Owner.length];
            for (int i = 0; i < source.Owner.length; i++) {
                this.Owner[i] = new String(source.Owner[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.TagValueIds != null) {
            this.TagValueIds = new Long[source.TagValueIds.length];
            for (int i = 0; i < source.TagValueIds.length; i++) {
                this.TagValueIds[i] = new Long(source.TagValueIds[i]);
            }
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.CatalogNames != null) {
            this.CatalogNames = new String[source.CatalogNames.length];
            for (int i = 0; i < source.CatalogNames.length; i++) {
                this.CatalogNames[i] = new String(source.CatalogNames[i]);
            }
        }
        if (source.WorkspacePaths != null) {
            this.WorkspacePaths = new String[source.WorkspacePaths.length];
            for (int i = 0; i < source.WorkspacePaths.length; i++) {
                this.WorkspacePaths[i] = new String(source.WorkspacePaths[i]);
            }
        }
        if (source.EnableHybridSearch != null) {
            this.EnableHybridSearch = new Boolean(source.EnableHybridSearch);
        }
        if (source.FieldTagIds != null) {
            this.FieldTagIds = new Long[source.FieldTagIds.length];
            for (int i = 0; i < source.FieldTagIds.length; i++) {
                this.FieldTagIds[i] = new Long(source.FieldTagIds[i]);
            }
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
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamArraySimple(map, prefix + "Owner.", this.Owner);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "TagValueIds.", this.TagValueIds);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamArraySimple(map, prefix + "CatalogNames.", this.CatalogNames);
        this.setParamArraySimple(map, prefix + "WorkspacePaths.", this.WorkspacePaths);
        this.setParamSimple(map, prefix + "EnableHybridSearch", this.EnableHybridSearch);
        this.setParamArraySimple(map, prefix + "FieldTagIds.", this.FieldTagIds);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}

