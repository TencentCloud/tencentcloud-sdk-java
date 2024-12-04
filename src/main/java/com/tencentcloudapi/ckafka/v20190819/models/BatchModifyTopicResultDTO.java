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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyTopicResultDTO extends AbstractModel {

    /**
    * ckafka集群实例Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 操作返回码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * 操作返回信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get ckafka集群实例Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId ckafka集群实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId ckafka集群实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 主题名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 主题名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 操作返回码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnCode 操作返回码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 操作返回码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnCode 操作返回码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 操作返回信息 
     * @return Message 操作返回信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 操作返回信息
     * @param Message 操作返回信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public BatchModifyTopicResultDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyTopicResultDTO(BatchModifyTopicResultDTO source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

