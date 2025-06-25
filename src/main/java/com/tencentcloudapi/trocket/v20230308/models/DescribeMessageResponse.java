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

public class DescribeMessageResponse extends AbstractModel {

    /**
    * 消息体
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 详情参数
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 生产时间
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 消息ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 生产者地址
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * 消息消费情况列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageTracks")
    @Expose
    private MessageTrackItem [] MessageTracks;

    /**
    * 主题名称
    */
    @SerializedName("ShowTopicName")
    @Expose
    private String ShowTopicName;

    /**
    * 消息消费情况列表总条数
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
     * Get 消息体 
     * @return Body 消息体
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 消息体
     * @param Body 消息体
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 详情参数 
     * @return Properties 详情参数
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 详情参数
     * @param Properties 详情参数
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 生产时间 
     * @return ProduceTime 生产时间
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 生产时间
     * @param ProduceTime 生产时间
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 消息ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageId 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageId 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 生产者地址 
     * @return ProducerAddr 生产者地址
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set 生产者地址
     * @param ProducerAddr 生产者地址
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get 消息消费情况列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTracks 消息消费情况列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageTrackItem [] getMessageTracks() {
        return this.MessageTracks;
    }

    /**
     * Set 消息消费情况列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTracks 消息消费情况列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageTracks(MessageTrackItem [] MessageTracks) {
        this.MessageTracks = MessageTracks;
    }

    /**
     * Get 主题名称 
     * @return ShowTopicName 主题名称
     */
    public String getShowTopicName() {
        return this.ShowTopicName;
    }

    /**
     * Set 主题名称
     * @param ShowTopicName 主题名称
     */
    public void setShowTopicName(String ShowTopicName) {
        this.ShowTopicName = ShowTopicName;
    }

    /**
     * Get 消息消费情况列表总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageTracksCount 消息消费情况列表总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageTracksCount() {
        return this.MessageTracksCount;
    }

    /**
     * Set 消息消费情况列表总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageTracksCount 消息消费情况列表总条数
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
        this.setParamSimple(map, prefix + "MessageTracksCount", this.MessageTracksCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

