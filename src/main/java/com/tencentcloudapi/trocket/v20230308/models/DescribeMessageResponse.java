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

public class DescribeMessageResponse extends AbstractModel {

    /**
    * <p>消息体</p>
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * <p>详情参数</p>
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * <p>生产时间</p>
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * <p>消息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * <p>生产者地址</p>
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * <p>消息消费情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageTracks")
    @Expose
    private MessageTrackItem [] MessageTracks;

    /**
    * <p>主题名称</p>
    */
    @SerializedName("ShowTopicName")
    @Expose
    private String ShowTopicName;

    /**
    * <p>轻量主题名称</p>
    */
    @SerializedName("LiteTopic")
    @Expose
    private String LiteTopic;

    /**
    * <p>消息消费情况列表总条数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageTracksCount")
    @Expose
    private Long MessageTracksCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>消息体</p> 
     * @return Body <p>消息体</p>
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set <p>消息体</p>
     * @param Body <p>消息体</p>
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get <p>详情参数</p> 
     * @return Properties <p>详情参数</p>
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>详情参数</p>
     * @param Properties <p>详情参数</p>
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>生产时间</p> 
     * @return ProduceTime <p>生产时间</p>
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set <p>生产时间</p>
     * @param ProduceTime <p>生产时间</p>
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get <p>消息ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageId <p>消息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>消息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageId <p>消息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>生产者地址</p> 
     * @return ProducerAddr <p>生产者地址</p>
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set <p>生产者地址</p>
     * @param ProducerAddr <p>生产者地址</p>
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get <p>消息消费情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTracks <p>消息消费情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageTrackItem [] getMessageTracks() {
        return this.MessageTracks;
    }

    /**
     * Set <p>消息消费情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTracks <p>消息消费情况列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageTracks(MessageTrackItem [] MessageTracks) {
        this.MessageTracks = MessageTracks;
    }

    /**
     * Get <p>主题名称</p> 
     * @return ShowTopicName <p>主题名称</p>
     */
    public String getShowTopicName() {
        return this.ShowTopicName;
    }

    /**
     * Set <p>主题名称</p>
     * @param ShowTopicName <p>主题名称</p>
     */
    public void setShowTopicName(String ShowTopicName) {
        this.ShowTopicName = ShowTopicName;
    }

    /**
     * Get <p>轻量主题名称</p> 
     * @return LiteTopic <p>轻量主题名称</p>
     */
    public String getLiteTopic() {
        return this.LiteTopic;
    }

    /**
     * Set <p>轻量主题名称</p>
     * @param LiteTopic <p>轻量主题名称</p>
     */
    public void setLiteTopic(String LiteTopic) {
        this.LiteTopic = LiteTopic;
    }

    /**
     * Get <p>消息消费情况列表总条数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTracksCount <p>消息消费情况列表总条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageTracksCount() {
        return this.MessageTracksCount;
    }

    /**
     * Set <p>消息消费情况列表总条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTracksCount <p>消息消费情况列表总条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageTracksCount(Long MessageTracksCount) {
        this.MessageTracksCount = MessageTracksCount;
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

    public DescribeMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageResponse(DescribeMessageResponse source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.MessageTracks != null) {
            this.MessageTracks = new MessageTrackItem[source.MessageTracks.length];
            for (int i = 0; i < source.MessageTracks.length; i++) {
                this.MessageTracks[i] = new MessageTrackItem(source.MessageTracks[i]);
            }
        }
        if (source.ShowTopicName != null) {
            this.ShowTopicName = new String(source.ShowTopicName);
        }
        if (source.LiteTopic != null) {
            this.LiteTopic = new String(source.LiteTopic);
        }
        if (source.MessageTracksCount != null) {
            this.MessageTracksCount = new Long(source.MessageTracksCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamArrayObj(map, prefix + "MessageTracks.", this.MessageTracks);
        this.setParamSimple(map, prefix + "ShowTopicName", this.ShowTopicName);
        this.setParamSimple(map, prefix + "LiteTopic", this.LiteTopic);
        this.setParamSimple(map, prefix + "MessageTracksCount", this.MessageTracksCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

