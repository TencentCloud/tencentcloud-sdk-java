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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportRocketMQMessageDetailRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 应用命名空间
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic名称
如果是死信消息 isDlqMsg=true
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 是否包含消息体
    */
    @SerializedName("IncludeMsgBody")
    @Expose
    private Boolean IncludeMsgBody;

    /**
    * 是否死信消息
    */
    @SerializedName("DeadLetterMsg")
    @Expose
    private Boolean DeadLetterMsg;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 应用命名空间 
     * @return EnvironmentId 应用命名空间
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 应用命名空间
     * @param EnvironmentId 应用命名空间
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic名称
如果是死信消息 isDlqMsg=true 
     * @return TopicName Topic名称
如果是死信消息 isDlqMsg=true
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic名称
如果是死信消息 isDlqMsg=true
     * @param TopicName Topic名称
如果是死信消息 isDlqMsg=true
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消息id 
     * @return MsgId 消息id
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息id
     * @param MsgId 消息id
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 是否包含消息体 
     * @return IncludeMsgBody 是否包含消息体
     */
    public Boolean getIncludeMsgBody() {
        return this.IncludeMsgBody;
    }

    /**
     * Set 是否包含消息体
     * @param IncludeMsgBody 是否包含消息体
     */
    public void setIncludeMsgBody(Boolean IncludeMsgBody) {
        this.IncludeMsgBody = IncludeMsgBody;
    }

    /**
     * Get 是否死信消息 
     * @return DeadLetterMsg 是否死信消息
     */
    public Boolean getDeadLetterMsg() {
        return this.DeadLetterMsg;
    }

    /**
     * Set 是否死信消息
     * @param DeadLetterMsg 是否死信消息
     */
    public void setDeadLetterMsg(Boolean DeadLetterMsg) {
        this.DeadLetterMsg = DeadLetterMsg;
    }

    public ExportRocketMQMessageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRocketMQMessageDetailRequest(ExportRocketMQMessageDetailRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.IncludeMsgBody != null) {
            this.IncludeMsgBody = new Boolean(source.IncludeMsgBody);
        }
        if (source.DeadLetterMsg != null) {
            this.DeadLetterMsg = new Boolean(source.DeadLetterMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "IncludeMsgBody", this.IncludeMsgBody);
        this.setParamSimple(map, prefix + "DeadLetterMsg", this.DeadLetterMsg);

    }
}

