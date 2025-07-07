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

public class ListQARequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询问题

输入特定标识 lke:system:untagged  将查询所有未关联标签的问答
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 校验状态(1未校验2采纳3不采纳)
    */
    @SerializedName("AcceptStatus")
    @Expose
    private Long [] AcceptStatus;

    /**
    * 发布状态(2待发布 3发布中 4已发布 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long [] ReleaseStatus;

    /**
    * 文档ID
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 来源(1 文档生成 2 批量导入 3 手动添加)
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 查询答案
    */
    @SerializedName("QueryAnswer")
    @Expose
    private String QueryAnswer;

    /**
    * 分类ID
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * QA业务ID列表
    */
    @SerializedName("QaBizIds")
    @Expose
    private String [] QaBizIds;

    /**
    * 查询类型 filename 名称、 attribute 标签
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 是否只展示当前分类的数据 0不是，1是
    */
    @SerializedName("ShowCurrCate")
    @Expose
    private Long ShowCurrCate;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

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
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询问题

输入特定标识 lke:system:untagged  将查询所有未关联标签的问答 
     * @return Query 查询问题

输入特定标识 lke:system:untagged  将查询所有未关联标签的问答
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询问题

输入特定标识 lke:system:untagged  将查询所有未关联标签的问答
     * @param Query 查询问题

输入特定标识 lke:system:untagged  将查询所有未关联标签的问答
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 校验状态(1未校验2采纳3不采纳) 
     * @return AcceptStatus 校验状态(1未校验2采纳3不采纳)
     */
    public Long [] getAcceptStatus() {
        return this.AcceptStatus;
    }

    /**
     * Set 校验状态(1未校验2采纳3不采纳)
     * @param AcceptStatus 校验状态(1未校验2采纳3不采纳)
     */
    public void setAcceptStatus(Long [] AcceptStatus) {
        this.AcceptStatus = AcceptStatus;
    }

    /**
     * Get 发布状态(2待发布 3发布中 4已发布 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复) 
     * @return ReleaseStatus 发布状态(2待发布 3发布中 4已发布 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)
     */
    public Long [] getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态(2待发布 3发布中 4已发布 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)
     * @param ReleaseStatus 发布状态(2待发布 3发布中 4已发布 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)
     */
    public void setReleaseStatus(Long [] ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get 文档ID 
     * @return DocBizId 文档ID
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档ID
     * @param DocBizId 文档ID
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 来源(1 文档生成 2 批量导入 3 手动添加) 
     * @return Source 来源(1 文档生成 2 批量导入 3 手动添加)
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源(1 文档生成 2 批量导入 3 手动添加)
     * @param Source 来源(1 文档生成 2 批量导入 3 手动添加)
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 查询答案 
     * @return QueryAnswer 查询答案
     */
    public String getQueryAnswer() {
        return this.QueryAnswer;
    }

    /**
     * Set 查询答案
     * @param QueryAnswer 查询答案
     */
    public void setQueryAnswer(String QueryAnswer) {
        this.QueryAnswer = QueryAnswer;
    }

    /**
     * Get 分类ID 
     * @return CateBizId 分类ID
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID
     * @param CateBizId 分类ID
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get QA业务ID列表 
     * @return QaBizIds QA业务ID列表
     */
    public String [] getQaBizIds() {
        return this.QaBizIds;
    }

    /**
     * Set QA业务ID列表
     * @param QaBizIds QA业务ID列表
     */
    public void setQaBizIds(String [] QaBizIds) {
        this.QaBizIds = QaBizIds;
    }

    /**
     * Get 查询类型 filename 名称、 attribute 标签 
     * @return QueryType 查询类型 filename 名称、 attribute 标签
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型 filename 名称、 attribute 标签
     * @param QueryType 查询类型 filename 名称、 attribute 标签
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
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

    public ListQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQARequest(ListQARequest source) {
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
        if (source.AcceptStatus != null) {
            this.AcceptStatus = new Long[source.AcceptStatus.length];
            for (int i = 0; i < source.AcceptStatus.length; i++) {
                this.AcceptStatus[i] = new Long(source.AcceptStatus[i]);
            }
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long[source.ReleaseStatus.length];
            for (int i = 0; i < source.ReleaseStatus.length; i++) {
                this.ReleaseStatus[i] = new Long(source.ReleaseStatus[i]);
            }
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.QueryAnswer != null) {
            this.QueryAnswer = new String(source.QueryAnswer);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.QaBizIds != null) {
            this.QaBizIds = new String[source.QaBizIds.length];
            for (int i = 0; i < source.QaBizIds.length; i++) {
                this.QaBizIds[i] = new String(source.QaBizIds[i]);
            }
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.ShowCurrCate != null) {
            this.ShowCurrCate = new Long(source.ShowCurrCate);
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
        this.setParamArraySimple(map, prefix + "AcceptStatus.", this.AcceptStatus);
        this.setParamArraySimple(map, prefix + "ReleaseStatus.", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "QueryAnswer", this.QueryAnswer);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamArraySimple(map, prefix + "QaBizIds.", this.QaBizIds);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "ShowCurrCate", this.ShowCurrCate);

    }
}

