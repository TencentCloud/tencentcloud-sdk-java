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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerGroupRequest extends AbstractModel{

    /**
    * ckafka实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 可选，用户需要查询的group名称。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 可选，用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 本次返回个数限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get ckafka实例id。 
     * @return InstanceId ckafka实例id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka实例id。
     * @param InstanceId ckafka实例id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 可选，用户需要查询的group名称。 
     * @return GroupName 可选，用户需要查询的group名称。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 可选，用户需要查询的group名称。
     * @param GroupName 可选，用户需要查询的group名称。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 可选，用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。 
     * @return TopicName 可选，用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 可选，用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
     * @param TopicName 可选，用户需要查询的group中的对应的topic名称，如果指定了该参数，而group又未指定则忽略该参数。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 本次返回个数限制 
     * @return Limit 本次返回个数限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本次返回个数限制
     * @param Limit 本次返回个数限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移位置 
     * @return Offset 偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移位置
     * @param Offset 偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

