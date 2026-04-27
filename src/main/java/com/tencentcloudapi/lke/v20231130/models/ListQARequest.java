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
    * <p>应用ID<br>若要操作共享知识库，传KnowledgeBizId</p>
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * <p>页码（取值范围&gt;0）</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小(取值范围1-200)</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>查询问题</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的问答</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>校验状态(1未校验2采纳3不采纳)<br>如果不填默认值为空数组，表示不筛选，返回所有状态</p>
    */
    @SerializedName("AcceptStatus")
    @Expose
    private Long [] AcceptStatus;

    /**
    * <p>发布状态(2,4导入成功 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)<br>如果不填默认值为空数组，表示不筛选返回所有状态</p>
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long [] ReleaseStatus;

    /**
    * <p>文档ID</p>
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * <p>来源(1 文档生成 2 批量导入 3 手动添加)<br>不填默认值为0，表示不过滤，返回所有状态</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>查询答案</p>
    */
    @SerializedName("QueryAnswer")
    @Expose
    private String QueryAnswer;

    /**
    * <p>分类ID</p>
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * <p>QA业务ID列表</p>
    */
    @SerializedName("QaBizIds")
    @Expose
    private String [] QaBizIds;

    /**
    * <p>查询类型 filename 名称、 attribute 标签<br>如果不填默认值为&quot;filename&quot;</p>
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * <p>是否只展示当前分类的数据 0不是，1是</p>
    */
    @SerializedName("ShowCurrCate")
    @Expose
    private Long ShowCurrCate;

    /**
    * <p>问答生效域检索，不检索不传。枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效。</p>
    */
    @SerializedName("EnableScope")
    @Expose
    private Long EnableScope;

    /**
    * <p>问答创建时间范围</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * <p>问答更新时间范围</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private TimeRange UpdateTime;

    /**
     * Get <p>应用ID<br>若要操作共享知识库，传KnowledgeBizId</p> 
     * @return BotBizId <p>应用ID<br>若要操作共享知识库，传KnowledgeBizId</p>
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set <p>应用ID<br>若要操作共享知识库，传KnowledgeBizId</p>
     * @param BotBizId <p>应用ID<br>若要操作共享知识库，传KnowledgeBizId</p>
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get <p>页码（取值范围&gt;0）</p> 
     * @return PageNumber <p>页码（取值范围&gt;0）</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码（取值范围&gt;0）</p>
     * @param PageNumber <p>页码（取值范围&gt;0）</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小(取值范围1-200)</p> 
     * @return PageSize <p>每页大小(取值范围1-200)</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小(取值范围1-200)</p>
     * @param PageSize <p>每页大小(取值范围1-200)</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>查询问题</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的问答</p> 
     * @return Query <p>查询问题</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的问答</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询问题</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的问答</p>
     * @param Query <p>查询问题</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的问答</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>校验状态(1未校验2采纳3不采纳)<br>如果不填默认值为空数组，表示不筛选，返回所有状态</p> 
     * @return AcceptStatus <p>校验状态(1未校验2采纳3不采纳)<br>如果不填默认值为空数组，表示不筛选，返回所有状态</p>
     */
    public Long [] getAcceptStatus() {
        return this.AcceptStatus;
    }

    /**
     * Set <p>校验状态(1未校验2采纳3不采纳)<br>如果不填默认值为空数组，表示不筛选，返回所有状态</p>
     * @param AcceptStatus <p>校验状态(1未校验2采纳3不采纳)<br>如果不填默认值为空数组，表示不筛选，返回所有状态</p>
     */
    public void setAcceptStatus(Long [] AcceptStatus) {
        this.AcceptStatus = AcceptStatus;
    }

    /**
     * Get <p>发布状态(2,4导入成功 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)<br>如果不填默认值为空数组，表示不筛选返回所有状态</p> 
     * @return ReleaseStatus <p>发布状态(2,4导入成功 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)<br>如果不填默认值为空数组，表示不筛选返回所有状态</p>
     */
    public Long [] getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set <p>发布状态(2,4导入成功 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)<br>如果不填默认值为空数组，表示不筛选返回所有状态</p>
     * @param ReleaseStatus <p>发布状态(2,4导入成功 7审核中 8审核失败 9人工申述中 11人工申述失败 12已过期 13超量失效 14超量失效恢复)<br>如果不填默认值为空数组，表示不筛选返回所有状态</p>
     */
    public void setReleaseStatus(Long [] ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get <p>文档ID</p> 
     * @return DocBizId <p>文档ID</p>
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set <p>文档ID</p>
     * @param DocBizId <p>文档ID</p>
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get <p>来源(1 文档生成 2 批量导入 3 手动添加)<br>不填默认值为0，表示不过滤，返回所有状态</p> 
     * @return Source <p>来源(1 文档生成 2 批量导入 3 手动添加)<br>不填默认值为0，表示不过滤，返回所有状态</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源(1 文档生成 2 批量导入 3 手动添加)<br>不填默认值为0，表示不过滤，返回所有状态</p>
     * @param Source <p>来源(1 文档生成 2 批量导入 3 手动添加)<br>不填默认值为0，表示不过滤，返回所有状态</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>查询答案</p> 
     * @return QueryAnswer <p>查询答案</p>
     */
    public String getQueryAnswer() {
        return this.QueryAnswer;
    }

    /**
     * Set <p>查询答案</p>
     * @param QueryAnswer <p>查询答案</p>
     */
    public void setQueryAnswer(String QueryAnswer) {
        this.QueryAnswer = QueryAnswer;
    }

    /**
     * Get <p>分类ID</p> 
     * @return CateBizId <p>分类ID</p>
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set <p>分类ID</p>
     * @param CateBizId <p>分类ID</p>
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get <p>QA业务ID列表</p> 
     * @return QaBizIds <p>QA业务ID列表</p>
     */
    public String [] getQaBizIds() {
        return this.QaBizIds;
    }

    /**
     * Set <p>QA业务ID列表</p>
     * @param QaBizIds <p>QA业务ID列表</p>
     */
    public void setQaBizIds(String [] QaBizIds) {
        this.QaBizIds = QaBizIds;
    }

    /**
     * Get <p>查询类型 filename 名称、 attribute 标签<br>如果不填默认值为&quot;filename&quot;</p> 
     * @return QueryType <p>查询类型 filename 名称、 attribute 标签<br>如果不填默认值为&quot;filename&quot;</p>
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set <p>查询类型 filename 名称、 attribute 标签<br>如果不填默认值为&quot;filename&quot;</p>
     * @param QueryType <p>查询类型 filename 名称、 attribute 标签<br>如果不填默认值为&quot;filename&quot;</p>
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get <p>是否只展示当前分类的数据 0不是，1是</p> 
     * @return ShowCurrCate <p>是否只展示当前分类的数据 0不是，1是</p>
     */
    public Long getShowCurrCate() {
        return this.ShowCurrCate;
    }

    /**
     * Set <p>是否只展示当前分类的数据 0不是，1是</p>
     * @param ShowCurrCate <p>是否只展示当前分类的数据 0不是，1是</p>
     */
    public void setShowCurrCate(Long ShowCurrCate) {
        this.ShowCurrCate = ShowCurrCate;
    }

    /**
     * Get <p>问答生效域检索，不检索不传。枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效。</p> 
     * @return EnableScope <p>问答生效域检索，不检索不传。枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效。</p>
     */
    public Long getEnableScope() {
        return this.EnableScope;
    }

    /**
     * Set <p>问答生效域检索，不检索不传。枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效。</p>
     * @param EnableScope <p>问答生效域检索，不检索不传。枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效。</p>
     */
    public void setEnableScope(Long EnableScope) {
        this.EnableScope = EnableScope;
    }

    /**
     * Get <p>问答创建时间范围</p> 
     * @return CreateTime <p>问答创建时间范围</p>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>问答创建时间范围</p>
     * @param CreateTime <p>问答创建时间范围</p>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>问答更新时间范围</p> 
     * @return UpdateTime <p>问答更新时间范围</p>
     */
    public TimeRange getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>问答更新时间范围</p>
     * @param UpdateTime <p>问答更新时间范围</p>
     */
    public void setUpdateTime(TimeRange UpdateTime) {
        this.UpdateTime = UpdateTime;
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
        if (source.EnableScope != null) {
            this.EnableScope = new Long(source.EnableScope);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new TimeRange(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "EnableScope", this.EnableScope);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "UpdateTime.", this.UpdateTime);

    }
}

