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

public class ModifyTopicRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1493/96028) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口或控制台获得。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 队列数量，取值范围3～16
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * 备注信息，最多 128 个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 消息保留时长（单位：小时）
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

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
     * Get 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口或控制台获得。 
     * @return Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口或控制台获得。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口或控制台获得。
     * @param Topic 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口或控制台获得。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 队列数量，取值范围3～16 
     * @return QueueNum 队列数量，取值范围3～16
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set 队列数量，取值范围3～16
     * @param QueueNum 队列数量，取值范围3～16
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
    }

    /**
     * Get 备注信息，最多 128 个字符 
     * @return Remark 备注信息，最多 128 个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，最多 128 个字符
     * @param Remark 备注信息，最多 128 个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 消息保留时长（单位：小时） 
     * @return MsgTTL 消息保留时长（单位：小时）
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 消息保留时长（单位：小时）
     * @param MsgTTL 消息保留时长（单位：小时）
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    public ModifyTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicRequest(ModifyTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.QueueNum != null) {
            this.QueueNum = new Long(source.QueueNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);

    }
}

