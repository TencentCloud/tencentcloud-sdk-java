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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditKeywordsRequest extends AbstractModel {

    /**
    * 获取偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页条数，最大为100条，超过则按100条返回。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 关键词库 Id。
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 关键词搜索字段。
为空字符串时忽略。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 标签类别搜索。
    */
    @SerializedName("Labels")
    @Expose
    private Long [] Labels;

    /**
     * Get 获取偏移量。 
     * @return Offset 获取偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 获取偏移量。
     * @param Offset 获取偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页条数，最大为100条，超过则按100条返回。 
     * @return Limit 单页条数，最大为100条，超过则按100条返回。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数，最大为100条，超过则按100条返回。
     * @param Limit 单页条数，最大为100条，超过则按100条返回。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 关键词库 Id。 
     * @return LibId 关键词库 Id。
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 关键词库 Id。
     * @param LibId 关键词库 Id。
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 关键词搜索字段。
为空字符串时忽略。 
     * @return Content 关键词搜索字段。
为空字符串时忽略。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词搜索字段。
为空字符串时忽略。
     * @param Content 关键词搜索字段。
为空字符串时忽略。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 标签类别搜索。 
     * @return Labels 标签类别搜索。
     */
    public Long [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签类别搜索。
     * @param Labels 标签类别搜索。
     */
    public void setLabels(Long [] Labels) {
        this.Labels = Labels;
    }

    public DescribeAuditKeywordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditKeywordsRequest(DescribeAuditKeywordsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Labels != null) {
            this.Labels = new Long[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Long(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);

    }
}

