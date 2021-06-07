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

public class SendMsgRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称，如果是分区topic需要指定具体分区，如果没有指定则默认发到0分区，例如：my_topic-partition-0。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消息内容，不能为空且大小不得大于5242880个byte。
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
     * Get 主题名称，如果是分区topic需要指定具体分区，如果没有指定则默认发到0分区，例如：my_topic-partition-0。 
     * @return TopicName 主题名称，如果是分区topic需要指定具体分区，如果没有指定则默认发到0分区，例如：my_topic-partition-0。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称，如果是分区topic需要指定具体分区，如果没有指定则默认发到0分区，例如：my_topic-partition-0。
     * @param TopicName 主题名称，如果是分区topic需要指定具体分区，如果没有指定则默认发到0分区，例如：my_topic-partition-0。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消息内容，不能为空且大小不得大于5242880个byte。 
     * @return MsgContent 消息内容，不能为空且大小不得大于5242880个byte。
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set 消息内容，不能为空且大小不得大于5242880个byte。
     * @param MsgContent 消息内容，不能为空且大小不得大于5242880个byte。
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get Pulsar 集群的ID 
     * @return ClusterId Pulsar 集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID
     * @param ClusterId Pulsar 集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public SendMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMsgRequest(SendMsgRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

