/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKnowledgeSetListRequest extends AbstractModel {

    /**
    * 知识库标识，精准查询
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 知识库名称，精准查询
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 查询条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * NoPage标识不分页
    */
    @SerializedName("QueryMode")
    @Expose
    private String QueryMode;

    /**
     * Get 知识库标识，精准查询 
     * @return Name 知识库标识，精准查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 知识库标识，精准查询
     * @param Name 知识库标识，精准查询
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 知识库名称，精准查询 
     * @return Title 知识库名称，精准查询
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 知识库名称，精准查询
     * @param Title 知识库名称，精准查询
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 查询条数 
     * @return Limit 查询条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询条数
     * @param Limit 查询条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get NoPage标识不分页 
     * @return QueryMode NoPage标识不分页
     */
    public String getQueryMode() {
        return this.QueryMode;
    }

    /**
     * Set NoPage标识不分页
     * @param QueryMode NoPage标识不分页
     */
    public void setQueryMode(String QueryMode) {
        this.QueryMode = QueryMode;
    }

    public DescribeKnowledgeSetListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeSetListRequest(DescribeKnowledgeSetListRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryMode != null) {
            this.QueryMode = new String(source.QueryMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueryMode", this.QueryMode);

    }
}

