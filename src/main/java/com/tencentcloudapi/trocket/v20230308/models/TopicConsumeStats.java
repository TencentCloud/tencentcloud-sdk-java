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

public class TopicConsumeStats extends AbstractModel {

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 主题类型
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * 单节点主题队列数量
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * 消费堆积
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * 订阅规则
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * 最后消费进度更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 主题类型 
     * @return TopicType 主题类型
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 主题类型
     * @param TopicType 主题类型
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 单节点主题队列数量 
     * @return QueueNum 单节点主题队列数量
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set 单节点主题队列数量
     * @param QueueNum 单节点主题队列数量
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
    }

    /**
     * Get 消费堆积 
     * @return ConsumerLag 消费堆积
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set 消费堆积
     * @param ConsumerLag 消费堆积
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get 订阅规则 
     * @return SubString 订阅规则
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set 订阅规则
     * @param SubString 订阅规则
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get 最后消费进度更新时间 
     * @return LastUpdateTime 最后消费进度更新时间
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后消费进度更新时间
     * @param LastUpdateTime 最后消费进度更新时间
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public TopicConsumeStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicConsumeStats(TopicConsumeStats source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.QueueNum != null) {
            this.QueueNum = new Long(source.QueueNum);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

