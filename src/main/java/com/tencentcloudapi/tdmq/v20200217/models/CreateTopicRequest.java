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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过32个字符。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 0：非分区topic，无分区；非0：具体分区topic的分区数，最大不允许超过128。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列；
5 ：事务消息。
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * 备注，128字符以内。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过32个字符。 
     * @return TopicName 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过32个字符。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过32个字符。
     * @param TopicName 主题名，不支持中字以及除了短线和下划线外的特殊字符且不超过32个字符。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 0：非分区topic，无分区；非0：具体分区topic的分区数，最大不允许超过128。 
     * @return Partitions 0：非分区topic，无分区；非0：具体分区topic的分区数，最大不允许超过128。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 0：非分区topic，无分区；非0：具体分区topic的分区数，最大不允许超过128。
     * @param Partitions 0：非分区topic，无分区；非0：具体分区topic的分区数，最大不允许超过128。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列；
5 ：事务消息。 
     * @return TopicType 0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列；
5 ：事务消息。
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列；
5 ：事务消息。
     * @param TopicType 0： 普通消息；
1 ：全局顺序消息；
2 ：局部顺序消息；
3 ：重试队列；
4 ：死信队列；
5 ：事务消息。
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 备注，128字符以内。 
     * @return Remark 备注，128字符以内。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，128字符以内。
     * @param Remark 备注，128字符以内。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

