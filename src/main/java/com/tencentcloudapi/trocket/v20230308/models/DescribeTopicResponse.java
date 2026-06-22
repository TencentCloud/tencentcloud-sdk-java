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

public class DescribeTopicResponse extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题名称</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>主题类型<br>UNSPECIFIED:未指定,<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * <p>最后写入时间，<strong>Unix时间戳（毫秒）</strong></p>
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * <p>订阅数量</p>
    */
    @SerializedName("SubscriptionCount")
    @Expose
    private Long SubscriptionCount;

    /**
    * <p>订阅关系列表</p>
    */
    @SerializedName("SubscriptionData")
    @Expose
    private SubscriptionData [] SubscriptionData;

    /**
    * <p>消息保留时长，单位：小时</p>
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * <p>是否自动删除</p><p>仅适用于轻量主题</p>
    */
    @SerializedName("AutoExpireDelete")
    @Expose
    private Boolean AutoExpireDelete;

    /**
    * <p>自动过期时间</p><p>单位：分钟</p><p>仅适用于轻量主题</p>
    */
    @SerializedName("AutoExpireTime")
    @Expose
    private Long AutoExpireTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题名称</p> 
     * @return Topic <p>主题名称</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名称</p>
     * @param Topic <p>主题名称</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>主题类型<br>UNSPECIFIED:未指定,<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p> 
     * @return TopicType <p>主题类型<br>UNSPECIFIED:未指定,<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set <p>主题类型<br>UNSPECIFIED:未指定,<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
     * @param TopicType <p>主题类型<br>UNSPECIFIED:未指定,<br>NORMAL:普通消息,<br>FIFO:顺序消息,<br>DELAY:延时消息,<br>TRANSACTION:事务消息</p>
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p> 
     * @return CreatedTime <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
     * @param CreatedTime <p>创建时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>最后写入时间，<strong>Unix时间戳（毫秒）</strong></p> 
     * @return LastUpdateTime <p>最后写入时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后写入时间，<strong>Unix时间戳（毫秒）</strong></p>
     * @param LastUpdateTime <p>最后写入时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>订阅数量</p> 
     * @return SubscriptionCount <p>订阅数量</p>
     */
    public Long getSubscriptionCount() {
        return this.SubscriptionCount;
    }

    /**
     * Set <p>订阅数量</p>
     * @param SubscriptionCount <p>订阅数量</p>
     */
    public void setSubscriptionCount(Long SubscriptionCount) {
        this.SubscriptionCount = SubscriptionCount;
    }

    /**
     * Get <p>订阅关系列表</p> 
     * @return SubscriptionData <p>订阅关系列表</p>
     */
    public SubscriptionData [] getSubscriptionData() {
        return this.SubscriptionData;
    }

    /**
     * Set <p>订阅关系列表</p>
     * @param SubscriptionData <p>订阅关系列表</p>
     */
    public void setSubscriptionData(SubscriptionData [] SubscriptionData) {
        this.SubscriptionData = SubscriptionData;
    }

    /**
     * Get <p>消息保留时长，单位：小时</p> 
     * @return MsgTTL <p>消息保留时长，单位：小时</p>
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set <p>消息保留时长，单位：小时</p>
     * @param MsgTTL <p>消息保留时长，单位：小时</p>
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get <p>是否自动删除</p><p>仅适用于轻量主题</p> 
     * @return AutoExpireDelete <p>是否自动删除</p><p>仅适用于轻量主题</p>
     */
    public Boolean getAutoExpireDelete() {
        return this.AutoExpireDelete;
    }

    /**
     * Set <p>是否自动删除</p><p>仅适用于轻量主题</p>
     * @param AutoExpireDelete <p>是否自动删除</p><p>仅适用于轻量主题</p>
     */
    public void setAutoExpireDelete(Boolean AutoExpireDelete) {
        this.AutoExpireDelete = AutoExpireDelete;
    }

    /**
     * Get <p>自动过期时间</p><p>单位：分钟</p><p>仅适用于轻量主题</p> 
     * @return AutoExpireTime <p>自动过期时间</p><p>单位：分钟</p><p>仅适用于轻量主题</p>
     */
    public Long getAutoExpireTime() {
        return this.AutoExpireTime;
    }

    /**
     * Set <p>自动过期时间</p><p>单位：分钟</p><p>仅适用于轻量主题</p>
     * @param AutoExpireTime <p>自动过期时间</p><p>单位：分钟</p><p>仅适用于轻量主题</p>
     */
    public void setAutoExpireTime(Long AutoExpireTime) {
        this.AutoExpireTime = AutoExpireTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTopicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicResponse(DescribeTopicResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.SubscriptionCount != null) {
            this.SubscriptionCount = new Long(source.SubscriptionCount);
        }
        if (source.SubscriptionData != null) {
            this.SubscriptionData = new SubscriptionData[source.SubscriptionData.length];
            for (int i = 0; i < source.SubscriptionData.length; i++) {
                this.SubscriptionData[i] = new SubscriptionData(source.SubscriptionData[i]);
            }
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.AutoExpireDelete != null) {
            this.AutoExpireDelete = new Boolean(source.AutoExpireDelete);
        }
        if (source.AutoExpireTime != null) {
            this.AutoExpireTime = new Long(source.AutoExpireTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "SubscriptionCount", this.SubscriptionCount);
        this.setParamArrayObj(map, prefix + "SubscriptionData.", this.SubscriptionData);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "AutoExpireDelete", this.AutoExpireDelete);
        this.setParamSimple(map, prefix + "AutoExpireTime", this.AutoExpireTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

