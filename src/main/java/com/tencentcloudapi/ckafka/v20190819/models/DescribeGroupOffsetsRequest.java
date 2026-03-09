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

public class DescribeGroupOffsetsRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Kafka 消费分组</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40840">DescribeGroup</a></p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40847">DescribeTopic</a></p>
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * <p>模糊匹配 topicName</p>
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
    * <p>本次返回结果的最大个数，默认为50，最大值为50</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Kafka 消费分组</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40840">DescribeGroup</a></p> 
     * @return Group <p>Kafka 消费分组</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40840">DescribeGroup</a></p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>Kafka 消费分组</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40840">DescribeGroup</a></p>
     * @param Group <p>Kafka 消费分组</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40840">DescribeGroup</a></p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40847">DescribeTopic</a></p> 
     * @return Topics <p>group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40847">DescribeTopic</a></p>
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40847">DescribeTopic</a></p>
     * @param Topics <p>group 订阅的主题名称数组，如果没有该数组，则表示指定的 group 下所有 topic 信息</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40847">DescribeTopic</a></p>
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>模糊匹配 topicName</p> 
     * @return SearchWord <p>模糊匹配 topicName</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>模糊匹配 topicName</p>
     * @param SearchWord <p>模糊匹配 topicName</p>
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
     * Get <p>本次返回结果的最大个数，默认为50，最大值为50</p> 
     * @return Limit <p>本次返回结果的最大个数，默认为50，最大值为50</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>本次返回结果的最大个数，默认为50，最大值为50</p>
     * @param Limit <p>本次返回结果的最大个数，默认为50，最大值为50</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGroupOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupOffsetsRequest(DescribeGroupOffsetsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Topics != null) {
            this.Topics = new String[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new String(source.Topics[i]);
            }
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
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

