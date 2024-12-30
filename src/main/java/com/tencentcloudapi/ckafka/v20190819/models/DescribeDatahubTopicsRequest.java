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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTopicsRequest extends AbstractModel {

    /**
    * 搜索词
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 本次查询的偏移位置，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本次返回结果的最大个数，默认为50，最大值为50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否从连接查询topic列表
    */
    @SerializedName("QueryFromConnectResource")
    @Expose
    private Boolean QueryFromConnectResource;

    /**
    * 连接的ID
    */
    @SerializedName("ConnectResourceId")
    @Expose
    private String ConnectResourceId;

    /**
    * topic资源表达式
    */
    @SerializedName("TopicRegularExpression")
    @Expose
    private String TopicRegularExpression;

    /**
     * Get 搜索词 
     * @return SearchWord 搜索词
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索词
     * @param SearchWord 搜索词
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 本次查询的偏移位置，默认为0 
     * @return Offset 本次查询的偏移位置，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 本次查询的偏移位置，默认为0
     * @param Offset 本次查询的偏移位置，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本次返回结果的最大个数，默认为50，最大值为50 
     * @return Limit 本次返回结果的最大个数，默认为50，最大值为50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本次返回结果的最大个数，默认为50，最大值为50
     * @param Limit 本次返回结果的最大个数，默认为50，最大值为50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否从连接查询topic列表 
     * @return QueryFromConnectResource 是否从连接查询topic列表
     */
    public Boolean getQueryFromConnectResource() {
        return this.QueryFromConnectResource;
    }

    /**
     * Set 是否从连接查询topic列表
     * @param QueryFromConnectResource 是否从连接查询topic列表
     */
    public void setQueryFromConnectResource(Boolean QueryFromConnectResource) {
        this.QueryFromConnectResource = QueryFromConnectResource;
    }

    /**
     * Get 连接的ID 
     * @return ConnectResourceId 连接的ID
     */
    public String getConnectResourceId() {
        return this.ConnectResourceId;
    }

    /**
     * Set 连接的ID
     * @param ConnectResourceId 连接的ID
     */
    public void setConnectResourceId(String ConnectResourceId) {
        this.ConnectResourceId = ConnectResourceId;
    }

    /**
     * Get topic资源表达式 
     * @return TopicRegularExpression topic资源表达式
     */
    public String getTopicRegularExpression() {
        return this.TopicRegularExpression;
    }

    /**
     * Set topic资源表达式
     * @param TopicRegularExpression topic资源表达式
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

