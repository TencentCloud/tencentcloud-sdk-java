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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDocRequest extends AbstractModel {

    /**
    * 应用ID, 获取方式参看 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码(必须大于0)
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量(取值范围1-200)
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询内容

输入特定标识 lke:system:untagged  将查询所有未关联标签的文档
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10-待发布  11-发布中  12-已发布  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 查询类型 filename 文档、 attribute 标签
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 分类ID, 调用接口[ListDocCate](https://capi.woa.com/api/detail?product=lke&version=2023-11-30&action=ListDocCate)获取
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 文件类型分类筛选
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * 文档列表筛选标识位
    */
    @SerializedName("FilterFlag")
    @Expose
    private DocFilterFlag [] FilterFlag;

    /**
    * 是否只展示当前分类的数据 0不是，1是
    */
    @SerializedName("ShowCurrCate")
    @Expose
    private Long ShowCurrCate;

    /**
    * 文档生效域；不检索默认为0
    */
    @SerializedName("EnableScope")
    @Expose
    private Long EnableScope;

    /**
     * Get 应用ID, 获取方式参看 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa) 
     * @return BotBizId 应用ID, 获取方式参看 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID, 获取方式参看 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     * @param BotBizId 应用ID, 获取方式参看 [BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 页码(必须大于0) 
     * @return PageNumber 页码(必须大于0)
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码(必须大于0)
     * @param PageNumber 页码(必须大于0)
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量(取值范围1-200) 
     * @return PageSize 每页数量(取值范围1-200)
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量(取值范围1-200)
     * @param PageSize 每页数量(取值范围1-200)
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询内容

输入特定标识 lke:system:untagged  将查询所有未关联标签的文档 
     * @return Query 查询内容

输入特定标识 lke:system:untagged  将查询所有未关联标签的文档
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容

输入特定标识 lke:system:untagged  将查询所有未关联标签的文档
     * @param Query 查询内容

输入特定标识 lke:system:untagged  将查询所有未关联标签的文档
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10-待发布  11-发布中  12-已发布  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复 
     * @return Status 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10-待发布  11-发布中  12-已发布  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10-待发布  11-发布中  12-已发布  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复
     * @param Status 文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10-待发布  11-发布中  12-已发布  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 查询类型 filename 文档、 attribute 标签 
     * @return QueryType 查询类型 filename 文档、 attribute 标签
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型 filename 文档、 attribute 标签
     * @param QueryType 查询类型 filename 文档、 attribute 标签
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 分类ID, 调用接口[ListDocCate](https://capi.woa.com/api/detail?product=lke&version=2023-11-30&action=ListDocCate)获取 
     * @return CateBizId 分类ID, 调用接口[ListDocCate](https://capi.woa.com/api/detail?product=lke&version=2023-11-30&action=ListDocCate)获取
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID, 调用接口[ListDocCate](https://capi.woa.com/api/detail?product=lke&version=2023-11-30&action=ListDocCate)获取
     * @param CateBizId 分类ID, 调用接口[ListDocCate](https://capi.woa.com/api/detail?product=lke&version=2023-11-30&action=ListDocCate)获取
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get 文件类型分类筛选 
     * @return FileTypes 文件类型分类筛选
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set 文件类型分类筛选
     * @param FileTypes 文件类型分类筛选
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get 文档列表筛选标识位 
     * @return FilterFlag 文档列表筛选标识位
     */
    public DocFilterFlag [] getFilterFlag() {
        return this.FilterFlag;
    }

    /**
     * Set 文档列表筛选标识位
     * @param FilterFlag 文档列表筛选标识位
     */
    public void setFilterFlag(DocFilterFlag [] FilterFlag) {
        this.FilterFlag = FilterFlag;
    }

    /**
     * Get 是否只展示当前分类的数据 0不是，1是 
     * @return ShowCurrCate 是否只展示当前分类的数据 0不是，1是
     */
    public Long getShowCurrCate() {
        return this.ShowCurrCate;
    }

    /**
     * Set 是否只展示当前分类的数据 0不是，1是
     * @param ShowCurrCate 是否只展示当前分类的数据 0不是，1是
     */
    public void setShowCurrCate(Long ShowCurrCate) {
        this.ShowCurrCate = ShowCurrCate;
    }

    /**
     * Get 文档生效域；不检索默认为0 
     * @return EnableScope 文档生效域；不检索默认为0
     */
    public Long getEnableScope() {
        return this.EnableScope;
    }

    /**
     * Set 文档生效域；不检索默认为0
     * @param EnableScope 文档生效域；不检索默认为0
     */
    public void setEnableScope(Long EnableScope) {
        this.EnableScope = EnableScope;
    }

    public ListDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDocRequest(ListDocRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.FilterFlag != null) {
            this.FilterFlag = new DocFilterFlag[source.FilterFlag.length];
            for (int i = 0; i < source.FilterFlag.length; i++) {
                this.FilterFlag[i] = new DocFilterFlag(source.FilterFlag[i]);
            }
        }
        if (source.ShowCurrCate != null) {
            this.ShowCurrCate = new Long(source.ShowCurrCate);
        }
        if (source.EnableScope != null) {
            this.EnableScope = new Long(source.EnableScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamArrayObj(map, prefix + "FilterFlag.", this.FilterFlag);
        this.setParamSimple(map, prefix + "ShowCurrCate", this.ShowCurrCate);
        this.setParamSimple(map, prefix + "EnableScope", this.EnableScope);

    }
}

