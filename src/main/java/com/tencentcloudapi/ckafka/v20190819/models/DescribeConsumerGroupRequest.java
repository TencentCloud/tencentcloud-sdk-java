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

public class DescribeConsumerGroupRequest extends AbstractModel {

    /**
    * ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户需要查询的group名称。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 返回消费组的限制数量，最大支持50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 消费组列表的起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户需要查询的group名称。 
     * @return GroupName 用户需要查询的group名称。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户需要查询的group名称。
     * @param GroupName 用户需要查询的group名称。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。 
     * @return TopicName 用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
     * @param TopicName 用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 返回消费组的限制数量，最大支持50 
     * @return Limit 返回消费组的限制数量，最大支持50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回消费组的限制数量，最大支持50
     * @param Limit 返回消费组的限制数量，最大支持50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 消费组列表的起始偏移量 
     * @return Offset 消费组列表的起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 消费组列表的起始偏移量
     * @param Offset 消费组列表的起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerGroupRequest(DescribeConsumerGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
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
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

