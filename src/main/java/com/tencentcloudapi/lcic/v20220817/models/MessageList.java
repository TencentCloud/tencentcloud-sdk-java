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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageList extends AbstractModel{

    /**
    * 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 消息发送者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromAccount")
    @Expose
    private String FromAccount;

    /**
    * 消息序列号，当前课堂内唯一且单调递增
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 历史消息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageBody")
    @Expose
    private MessageItem [] MessageBody;

    /**
     * Get 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 消息发送者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromAccount 消息发送者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromAccount() {
        return this.FromAccount;
    }

    /**
     * Set 消息发送者
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromAccount 消息发送者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromAccount(String FromAccount) {
        this.FromAccount = FromAccount;
    }

    /**
     * Get 消息序列号，当前课堂内唯一且单调递增
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seq 消息序列号，当前课堂内唯一且单调递增
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 消息序列号，当前课堂内唯一且单调递增
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seq 消息序列号，当前课堂内唯一且单调递增
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 历史消息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageBody 历史消息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageItem [] getMessageBody() {
        return this.MessageBody;
    }

    /**
     * Set 历史消息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageBody 历史消息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageBody(MessageItem [] MessageBody) {
        this.MessageBody = MessageBody;
    }

    public MessageList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageList(MessageList source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.FromAccount != null) {
            this.FromAccount = new String(source.FromAccount);
        }
        if (source.Seq != null) {
            this.Seq = new Long(source.Seq);
        }
        if (source.MessageBody != null) {
            this.MessageBody = new MessageItem[source.MessageBody.length];
            for (int i = 0; i < source.MessageBody.length; i++) {
                this.MessageBody[i] = new MessageItem(source.MessageBody[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "FromAccount", this.FromAccount);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamArrayObj(map, prefix + "MessageBody.", this.MessageBody);

    }
}

