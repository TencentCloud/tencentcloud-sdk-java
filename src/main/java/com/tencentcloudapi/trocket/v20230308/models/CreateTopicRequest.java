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

public class CreateTopicRequest extends AbstractModel {

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
    * <p>主题类型</p><p>枚举值：</p><ul><li>NORMAL： 普通消息</li><li>FIFO： 顺序消息</li><li>DELAY： 延迟消息</li><li>TRANSACTION： 事务消息</li><li>LITE： 轻量消息</li><li>PRIORITY： 优先级消息</li></ul>
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * <p>队列数量，取值范围3～16</p>
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * <p>备注信息，最多 128 个字符</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>消息保留时长（单位：小时）</p>
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>是否过期自动删除（仅针对轻量主题类型）</p>
    */
    @SerializedName("AutoExpireDelete")
    @Expose
    private Boolean AutoExpireDelete;

    /**
    * <p>过期时间，单位：秒（仅针对轻量主题类型）</p>
    */
    @SerializedName("AutoExpireTime")
    @Expose
    private Long AutoExpireTime;

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
     * Get <p>主题类型</p><p>枚举值：</p><ul><li>NORMAL： 普通消息</li><li>FIFO： 顺序消息</li><li>DELAY： 延迟消息</li><li>TRANSACTION： 事务消息</li><li>LITE： 轻量消息</li><li>PRIORITY： 优先级消息</li></ul> 
     * @return TopicType <p>主题类型</p><p>枚举值：</p><ul><li>NORMAL： 普通消息</li><li>FIFO： 顺序消息</li><li>DELAY： 延迟消息</li><li>TRANSACTION： 事务消息</li><li>LITE： 轻量消息</li><li>PRIORITY： 优先级消息</li></ul>
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set <p>主题类型</p><p>枚举值：</p><ul><li>NORMAL： 普通消息</li><li>FIFO： 顺序消息</li><li>DELAY： 延迟消息</li><li>TRANSACTION： 事务消息</li><li>LITE： 轻量消息</li><li>PRIORITY： 优先级消息</li></ul>
     * @param TopicType <p>主题类型</p><p>枚举值：</p><ul><li>NORMAL： 普通消息</li><li>FIFO： 顺序消息</li><li>DELAY： 延迟消息</li><li>TRANSACTION： 事务消息</li><li>LITE： 轻量消息</li><li>PRIORITY： 优先级消息</li></ul>
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get <p>队列数量，取值范围3～16</p> 
     * @return QueueNum <p>队列数量，取值范围3～16</p>
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set <p>队列数量，取值范围3～16</p>
     * @param QueueNum <p>队列数量，取值范围3～16</p>
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
    }

    /**
     * Get <p>备注信息，最多 128 个字符</p> 
     * @return Remark <p>备注信息，最多 128 个字符</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息，最多 128 个字符</p>
     * @param Remark <p>备注信息，最多 128 个字符</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>消息保留时长（单位：小时）</p> 
     * @return MsgTTL <p>消息保留时长（单位：小时）</p>
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set <p>消息保留时长（单位：小时）</p>
     * @param MsgTTL <p>消息保留时长（单位：小时）</p>
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagList <p>标签列表</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagList <p>标签列表</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>是否过期自动删除（仅针对轻量主题类型）</p> 
     * @return AutoExpireDelete <p>是否过期自动删除（仅针对轻量主题类型）</p>
     */
    public Boolean getAutoExpireDelete() {
        return this.AutoExpireDelete;
    }

    /**
     * Set <p>是否过期自动删除（仅针对轻量主题类型）</p>
     * @param AutoExpireDelete <p>是否过期自动删除（仅针对轻量主题类型）</p>
     */
    public void setAutoExpireDelete(Boolean AutoExpireDelete) {
        this.AutoExpireDelete = AutoExpireDelete;
    }

    /**
     * Get <p>过期时间，单位：秒（仅针对轻量主题类型）</p> 
     * @return AutoExpireTime <p>过期时间，单位：秒（仅针对轻量主题类型）</p>
     */
    public Long getAutoExpireTime() {
        return this.AutoExpireTime;
    }

    /**
     * Set <p>过期时间，单位：秒（仅针对轻量主题类型）</p>
     * @param AutoExpireTime <p>过期时间，单位：秒（仅针对轻量主题类型）</p>
     */
    public void setAutoExpireTime(Long AutoExpireTime) {
        this.AutoExpireTime = AutoExpireTime;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
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
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.AutoExpireDelete != null) {
            this.AutoExpireDelete = new Boolean(source.AutoExpireDelete);
        }
        if (source.AutoExpireTime != null) {
            this.AutoExpireTime = new Long(source.AutoExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "AutoExpireDelete", this.AutoExpireDelete);
        this.setParamSimple(map, prefix + "AutoExpireTime", this.AutoExpireTime);

    }
}

