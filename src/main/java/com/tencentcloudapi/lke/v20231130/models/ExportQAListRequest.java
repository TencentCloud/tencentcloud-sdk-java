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

public class ExportQAListRequest extends AbstractModel {

    /**
    * 应用ID
若要操作共享知识库，传KnowledgeBizId
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * QA业务ID
    */
    @SerializedName("QaBizIds")
    @Expose
    private String [] QaBizIds;

    /**
    * 查询参数
Filters.pageNumber范围是>0,0<Filters.pageSize<=200
Filters.query用于内容检索，模糊匹配
Filters.AcceptStatus默认值是0，表示不筛选，返回所有状态
Filters.ReleaseStatus默认值是0，表示不筛选，返回所有状态
Filters.Source默认值是0，表示不筛选，返回所有来源。表示来源(1 文档生成 2 批量导入 3 手动添加)。
Filter.QueryType默认值是"filename"，表示查询类型。
ShowCurrCate表示，是否只展示当前分类的数据 0不是，1是
    */
    @SerializedName("Filters")
    @Expose
    private QAQuery Filters;

    /**
     * Get 应用ID
若要操作共享知识库，传KnowledgeBizId 
     * @return BotBizId 应用ID
若要操作共享知识库，传KnowledgeBizId
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
若要操作共享知识库，传KnowledgeBizId
     * @param BotBizId 应用ID
若要操作共享知识库，传KnowledgeBizId
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get QA业务ID 
     * @return QaBizIds QA业务ID
     */
    public String [] getQaBizIds() {
        return this.QaBizIds;
    }

    /**
     * Set QA业务ID
     * @param QaBizIds QA业务ID
     */
    public void setQaBizIds(String [] QaBizIds) {
        this.QaBizIds = QaBizIds;
    }

    /**
     * Get 查询参数
Filters.pageNumber范围是>0,0<Filters.pageSize<=200
Filters.query用于内容检索，模糊匹配
Filters.AcceptStatus默认值是0，表示不筛选，返回所有状态
Filters.ReleaseStatus默认值是0，表示不筛选，返回所有状态
Filters.Source默认值是0，表示不筛选，返回所有来源。表示来源(1 文档生成 2 批量导入 3 手动添加)。
Filter.QueryType默认值是"filename"，表示查询类型。
ShowCurrCate表示，是否只展示当前分类的数据 0不是，1是 
     * @return Filters 查询参数
Filters.pageNumber范围是>0,0<Filters.pageSize<=200
Filters.query用于内容检索，模糊匹配
Filters.AcceptStatus默认值是0，表示不筛选，返回所有状态
Filters.ReleaseStatus默认值是0，表示不筛选，返回所有状态
Filters.Source默认值是0，表示不筛选，返回所有来源。表示来源(1 文档生成 2 批量导入 3 手动添加)。
Filter.QueryType默认值是"filename"，表示查询类型。
ShowCurrCate表示，是否只展示当前分类的数据 0不是，1是
     */
    public QAQuery getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询参数
Filters.pageNumber范围是>0,0<Filters.pageSize<=200
Filters.query用于内容检索，模糊匹配
Filters.AcceptStatus默认值是0，表示不筛选，返回所有状态
Filters.ReleaseStatus默认值是0，表示不筛选，返回所有状态
Filters.Source默认值是0，表示不筛选，返回所有来源。表示来源(1 文档生成 2 批量导入 3 手动添加)。
Filter.QueryType默认值是"filename"，表示查询类型。
ShowCurrCate表示，是否只展示当前分类的数据 0不是，1是
     * @param Filters 查询参数
Filters.pageNumber范围是>0,0<Filters.pageSize<=200
Filters.query用于内容检索，模糊匹配
Filters.AcceptStatus默认值是0，表示不筛选，返回所有状态
Filters.ReleaseStatus默认值是0，表示不筛选，返回所有状态
Filters.Source默认值是0，表示不筛选，返回所有来源。表示来源(1 文档生成 2 批量导入 3 手动添加)。
Filter.QueryType默认值是"filename"，表示查询类型。
ShowCurrCate表示，是否只展示当前分类的数据 0不是，1是
     */
    public void setFilters(QAQuery Filters) {
        this.Filters = Filters;
    }

    public ExportQAListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportQAListRequest(ExportQAListRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.QaBizIds != null) {
            this.QaBizIds = new String[source.QaBizIds.length];
            for (int i = 0; i < source.QaBizIds.length; i++) {
                this.QaBizIds[i] = new String(source.QaBizIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new QAQuery(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "QaBizIds.", this.QaBizIds);
        this.setParamObj(map, prefix + "Filters.", this.Filters);

    }
}

