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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQProducersRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 主题名
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 分页offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤查询条件列表，支持以下过滤参数：

- ClientId：生产者客户端ID
- ClientIp：生产者客户端IP
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间 
     * @return NamespaceId 命名空间
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间
     * @param NamespaceId 命名空间
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 主题名 
     * @return Topic 主题名
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名
     * @param Topic 主题名
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 分页offset 
     * @return Offset 分页offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页offset
     * @param Offset 分页offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页limit 
     * @return Limit 分页limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit
     * @param Limit 分页limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤查询条件列表，支持以下过滤参数：

- ClientId：生产者客户端ID
- ClientIp：生产者客户端IP 
     * @return Filters 过滤查询条件列表，支持以下过滤参数：

- ClientId：生产者客户端ID
- ClientIp：生产者客户端IP
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤查询条件列表，支持以下过滤参数：

- ClientId：生产者客户端ID
- ClientIp：生产者客户端IP
     * @param Filters 过滤查询条件列表，支持以下过滤参数：

- ClientId：生产者客户端ID
- ClientIp：生产者客户端IP
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRocketMQProducersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQProducersRequest(DescribeRocketMQProducersRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

