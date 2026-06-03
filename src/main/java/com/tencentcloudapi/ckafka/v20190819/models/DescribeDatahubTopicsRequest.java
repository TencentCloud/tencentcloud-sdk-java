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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTopicsRequest extends AbstractModel {

    /**
    * <p>搜索词</p><p>对Name或TopicName或TopicId字段进行模糊匹配</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>本次查询的偏移位置，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>本次返回结果的最大个数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否从连接查询topic列表</p><p>默认值：false</p>
    */
    @SerializedName("QueryFromConnectResource")
    @Expose
    private Boolean QueryFromConnectResource;

    /**
    * <p>连接的ID</p>
    */
    @SerializedName("ConnectResourceId")
    @Expose
    private String ConnectResourceId;

    /**
    * <p>topic资源表达式</p>
    */
    @SerializedName("TopicRegularExpression")
    @Expose
    private String TopicRegularExpression;

    /**
     * Get <p>搜索词</p><p>对Name或TopicName或TopicId字段进行模糊匹配</p> 
     * @return SearchWord <p>搜索词</p><p>对Name或TopicName或TopicId字段进行模糊匹配</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>搜索词</p><p>对Name或TopicName或TopicId字段进行模糊匹配</p>
     * @param SearchWord <p>搜索词</p><p>对Name或TopicName或TopicId字段进行模糊匹配</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>本次查询的偏移位置，默认为0</p> 
     * @return Offset <p>本次查询的偏移位置，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>本次查询的偏移位置，默认为0</p>
     * @param Offset <p>本次查询的偏移位置，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>本次返回结果的最大个数</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return Limit <p>本次返回结果的最大个数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>本次返回结果的最大个数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param Limit <p>本次返回结果的最大个数</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否从连接查询topic列表</p><p>默认值：false</p> 
     * @return QueryFromConnectResource <p>是否从连接查询topic列表</p><p>默认值：false</p>
     */
    public Boolean getQueryFromConnectResource() {
        return this.QueryFromConnectResource;
    }

    /**
     * Set <p>是否从连接查询topic列表</p><p>默认值：false</p>
     * @param QueryFromConnectResource <p>是否从连接查询topic列表</p><p>默认值：false</p>
     */
    public void setQueryFromConnectResource(Boolean QueryFromConnectResource) {
        this.QueryFromConnectResource = QueryFromConnectResource;
    }

    /**
     * Get <p>连接的ID</p> 
     * @return ConnectResourceId <p>连接的ID</p>
     */
    public String getConnectResourceId() {
        return this.ConnectResourceId;
    }

    /**
     * Set <p>连接的ID</p>
     * @param ConnectResourceId <p>连接的ID</p>
     */
    public void setConnectResourceId(String ConnectResourceId) {
        this.ConnectResourceId = ConnectResourceId;
    }

    /**
     * Get <p>topic资源表达式</p> 
     * @return TopicRegularExpression <p>topic资源表达式</p>
     */
    public String getTopicRegularExpression() {
        return this.TopicRegularExpression;
    }

    /**
     * Set <p>topic资源表达式</p>
     * @param TopicRegularExpression <p>topic资源表达式</p>
     */
    public void setTopicRegularExpression(String TopicRegularExpression) {
        this.TopicRegularExpression = TopicRegularExpression;
    }

    public DescribeDatahubTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTopicsRequest(DescribeDatahubTopicsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryFromConnectResource != null) {
            this.QueryFromConnectResource = new Boolean(source.QueryFromConnectResource);
        }
        if (source.ConnectResourceId != null) {
            this.ConnectResourceId = new String(source.ConnectResourceId);
        }
        if (source.TopicRegularExpression != null) {
            this.TopicRegularExpression = new String(source.TopicRegularExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueryFromConnectResource", this.QueryFromConnectResource);
        this.setParamSimple(map, prefix + "ConnectResourceId", this.ConnectResourceId);
        this.setParamSimple(map, prefix + "TopicRegularExpression", this.TopicRegularExpression);

    }
}

