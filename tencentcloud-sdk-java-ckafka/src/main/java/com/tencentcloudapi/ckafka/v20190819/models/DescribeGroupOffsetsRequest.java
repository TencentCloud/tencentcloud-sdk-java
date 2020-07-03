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

public class DescribeGroupOffsetsRequest extends AbstractModel{

    /**
    * （过滤条件）按照实例 ID 过滤
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kafka 消费分组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * 模糊匹配 topicName
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
     * Get （过滤条件）按照实例 ID 过滤 
     * @return InstanceId （过滤条件）按照实例 ID 过滤
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set （过滤条件）按照实例 ID 过滤
     * @param InstanceId （过滤条件）按照实例 ID 过滤
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Kafka 消费分组 
     * @return Group Kafka 消费分组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Kafka 消费分组
     * @param Group Kafka 消费分组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息 
     * @return Topics group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息
     * @param Topics group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get 模糊匹配 topicName 
     * @return SearchWord 模糊匹配 topicName
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 模糊匹配 topicName
     * @param SearchWord 模糊匹配 topicName
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

