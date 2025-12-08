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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetKnowledgeBaseFileListRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 默认 1 表示第一页，可以不填
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 默认 10 一页展示 10 条，可以不填
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 知识库id
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 默认 1 表示第一页，可以不填 
     * @return Page 默认 1 表示第一页，可以不填
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 默认 1 表示第一页，可以不填
     * @param Page 默认 1 表示第一页，可以不填
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 默认 10 一页展示 10 条，可以不填 
     * @return PageSize 默认 10 一页展示 10 条，可以不填
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 默认 10 一页展示 10 条，可以不填
     * @param PageSize 默认 10 一页展示 10 条，可以不填
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 知识库id 
     * @return KnowledgeBaseId 知识库id
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库id
     * @param KnowledgeBaseId 知识库id
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    public GetKnowledgeBaseFileListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetKnowledgeBaseFileListRequest(GetKnowledgeBaseFileListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);

    }
}

