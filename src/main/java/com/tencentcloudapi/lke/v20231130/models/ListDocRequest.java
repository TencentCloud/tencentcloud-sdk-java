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
    * <p>应用ID, 获取方式参看 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。<br>查询知识库下文档时，该参数填入知识库ID。</p>
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * <p>页码(必须大于0)</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量(取值范围1-200)</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>查询内容</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的文档</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10,12-导入成功  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复</p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>查询类型 filename 文档、 attribute 标签</p>
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * <p>分类ID, 可以通过调用ListDocCate接口,查看其返回结果获取</p>
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * <p>文件类型分类筛选</p>
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * <p>文档列表筛选标识位</p>
    */
    @SerializedName("FilterFlag")
    @Expose
    private DocFilterFlag [] FilterFlag;

    /**
    * <p>是否只展示当前分类的数据 0不是，1是</p>
    */
    @SerializedName("ShowCurrCate")
    @Expose
    private Long ShowCurrCate;

    /**
    * <p>文档生效域；不检索默认为0。检索枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效</p>
    */
    @SerializedName("EnableScope")
    @Expose
    private Long EnableScope;

    /**
    * <p>文档更新时间范围</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private TimeRange UpdateTime;

    /**
     * Get <p>应用ID, 获取方式参看 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。<br>查询知识库下文档时，该参数填入知识库ID。</p> 
     * @return BotBizId <p>应用ID, 获取方式参看 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。<br>查询知识库下文档时，该参数填入知识库ID。</p>
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set <p>应用ID, 获取方式参看 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。<br>查询知识库下文档时，该参数填入知识库ID。</p>
     * @param BotBizId <p>应用ID, 获取方式参看 <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。<br>查询知识库下文档时，该参数填入知识库ID。</p>
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get <p>页码(必须大于0)</p> 
     * @return PageNumber <p>页码(必须大于0)</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码(必须大于0)</p>
     * @param PageNumber <p>页码(必须大于0)</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量(取值范围1-200)</p> 
     * @return PageSize <p>每页数量(取值范围1-200)</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量(取值范围1-200)</p>
     * @param PageSize <p>每页数量(取值范围1-200)</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>查询内容</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的文档</p> 
     * @return Query <p>查询内容</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的文档</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询内容</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的文档</p>
     * @param Query <p>查询内容</p><p>输入特定标识 lke:system:untagged  将查询所有未关联标签的文档</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10,12-导入成功  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复</p> 
     * @return Status <p>文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10,12-导入成功  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复</p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10,12-导入成功  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复</p>
     * @param Status <p>文档状态： 1-未生成 2-生成中 3-生成成功 4-生成失败 5-删除中 6-删除成功  7-审核中  8-审核失败 9-审核成功  10,12-导入成功  13-学习中  14-学习失败  15-更新中  16-更新失败  17-解析中  18-解析失败  19-导入失败   20-已过期 21-超量失效 22-超量失效恢复</p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>查询类型 filename 文档、 attribute 标签</p> 
     * @return QueryType <p>查询类型 filename 文档、 attribute 标签</p>
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set <p>查询类型 filename 文档、 attribute 标签</p>
     * @param QueryType <p>查询类型 filename 文档、 attribute 标签</p>
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get <p>分类ID, 可以通过调用ListDocCate接口,查看其返回结果获取</p> 
     * @return CateBizId <p>分类ID, 可以通过调用ListDocCate接口,查看其返回结果获取</p>
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set <p>分类ID, 可以通过调用ListDocCate接口,查看其返回结果获取</p>
     * @param CateBizId <p>分类ID, 可以通过调用ListDocCate接口,查看其返回结果获取</p>
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get <p>文件类型分类筛选</p> 
     * @return FileTypes <p>文件类型分类筛选</p>
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set <p>文件类型分类筛选</p>
     * @param FileTypes <p>文件类型分类筛选</p>
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get <p>文档列表筛选标识位</p> 
     * @return FilterFlag <p>文档列表筛选标识位</p>
     */
    public DocFilterFlag [] getFilterFlag() {
        return this.FilterFlag;
    }

    /**
     * Set <p>文档列表筛选标识位</p>
     * @param FilterFlag <p>文档列表筛选标识位</p>
     */
    public void setFilterFlag(DocFilterFlag [] FilterFlag) {
        this.FilterFlag = FilterFlag;
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
     * Get <p>文档生效域；不检索默认为0。检索枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效</p> 
     * @return EnableScope <p>文档生效域；不检索默认为0。检索枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效</p>
     */
    public Long getEnableScope() {
        return this.EnableScope;
    }

    /**
     * Set <p>文档生效域；不检索默认为0。检索枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效</p>
     * @param EnableScope <p>文档生效域；不检索默认为0。检索枚举值如下：<br>1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效</p>
     */
    public void setEnableScope(Long EnableScope) {
        this.EnableScope = EnableScope;
    }

    /**
     * Get <p>文档更新时间范围</p> 
     * @return UpdateTime <p>文档更新时间范围</p>
     */
    public TimeRange getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>文档更新时间范围</p>
     * @param UpdateTime <p>文档更新时间范围</p>
     */
    public void setUpdateTime(TimeRange UpdateTime) {
        this.UpdateTime = UpdateTime;
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
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamArrayObj(map, prefix + "FilterFlag.", this.FilterFlag);
        this.setParamSimple(map, prefix + "ShowCurrCate", this.ShowCurrCate);
        this.setParamSimple(map, prefix + "EnableScope", this.EnableScope);
        this.setParamObj(map, prefix + "UpdateTime.", this.UpdateTime);

    }
}

