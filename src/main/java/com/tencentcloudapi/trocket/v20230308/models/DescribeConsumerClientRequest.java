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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerClientRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1493/96028) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 客户端ID，从 [DescribeConsumerClientList](https://cloud.tencent.com/document/api/1493/120140) 接口中的 [ConsumerClient](https://cloud.tencent.com/document/api/1493/96031#ConsumerClient) 出参中获得。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 过滤查询条件列表，请在引用此参数的API说明中了解使用方法。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询起始位置，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制数量，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口或控制台获得。
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1493/96028) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1493/96028) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1493/96028) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1493/96028) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 客户端ID，从 [DescribeConsumerClientList](https://cloud.tencent.com/document/api/1493/120140) 接口中的 [ConsumerClient](https://cloud.tencent.com/document/api/1493/96031#ConsumerClient) 出参中获得。 
     * @return ClientId 客户端ID，从 [DescribeConsumerClientList](https://cloud.tencent.com/document/api/1493/120140) 接口中的 [ConsumerClient](https://cloud.tencent.com/document/api/1493/96031#ConsumerClient) 出参中获得。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID，从 [DescribeConsumerClientList](https://cloud.tencent.com/document/api/1493/120140) 接口中的 [ConsumerClient](https://cloud.tencent.com/document/api/1493/96031#ConsumerClient) 出参中获得。
     * @param ClientId 客户端ID，从 [DescribeConsumerClientList](https://cloud.tencent.com/document/api/1493/120140) 接口中的 [ConsumerClient](https://cloud.tencent.com/document/api/1493/96031#ConsumerClient) 出参中获得。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
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
     * Get 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口或控制台获得。 
     * @return ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口或控制台获得。
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口或控制台获得。
     * @param ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口或控制台获得。
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    public DescribeConsumerClientRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerClientRequest(DescribeConsumerClientRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);

    }
}

