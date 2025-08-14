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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProducerListRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 过滤查询条件列表，请在引用此参数的API说明中了解使用方法。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询结果限制数量，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询起始位置，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。 
     * @return Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     * @param Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 过滤查询条件列表，请在引用此参数的API说明中了解使用方法。 
     * @return Filters 过滤查询条件列表，请在引用此参数的API说明中了解使用方法。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤查询条件列表，请在引用此参数的API说明中了解使用方法。
     * @param Filters 过滤查询条件列表，请在引用此参数的API说明中了解使用方法。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询结果限制数量，默认20。 
     * @return Limit 查询结果限制数量，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制数量，默认20。
     * @param Limit 查询结果限制数量，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询起始位置，默认为0。 
     * @return Offset 查询起始位置，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置，默认为0。
     * @param Offset 查询起始位置，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeProducerListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProducerListRequest(DescribeProducerListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

