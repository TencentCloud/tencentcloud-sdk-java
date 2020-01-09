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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupOffsetPartition extends AbstractModel{

    /**
    * topic 的 partitionId
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * consumer 提交的 offset 位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 支持消费者提交消息时，传入 metadata 作为它用，当前一般为空字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 当前 partition 最新的 offset
    */
    @SerializedName("LogEndOffset")
    @Expose
    private Long LogEndOffset;

    /**
    * 未消费的消息个数
    */
    @SerializedName("Lag")
    @Expose
    private Long Lag;

    /**
     * Get topic 的 partitionId 
     * @return Partition topic 的 partitionId
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set topic 的 partitionId
     * @param Partition topic 的 partitionId
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get consumer 提交的 offset 位置 
     * @return Offset consumer 提交的 offset 位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set consumer 提交的 offset 位置
     * @param Offset consumer 提交的 offset 位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 支持消费者提交消息时，传入 metadata 作为它用，当前一般为空字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 支持消费者提交消息时，传入 metadata 作为它用，当前一般为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 支持消费者提交消息时，传入 metadata 作为它用，当前一般为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 支持消费者提交消息时，传入 metadata 作为它用，当前一般为空字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 错误码 
     * @return ErrorCode 错误码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码
     * @param ErrorCode 错误码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 当前 partition 最新的 offset 
     * @return LogEndOffset 当前 partition 最新的 offset
     */
    public Long getLogEndOffset() {
        return this.LogEndOffset;
    }

    /**
     * Set 当前 partition 最新的 offset
     * @param LogEndOffset 当前 partition 最新的 offset
     */
    public void setLogEndOffset(Long LogEndOffset) {
        this.LogEndOffset = LogEndOffset;
    }

    /**
     * Get 未消费的消息个数 
     * @return Lag 未消费的消息个数
     */
    public Long getLag() {
        return this.Lag;
    }

    /**
     * Set 未消费的消息个数
     * @param Lag 未消费的消息个数
     */
    public void setLag(Long Lag) {
        this.Lag = Lag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "LogEndOffset", this.LogEndOffset);
        this.setParamSimple(map, prefix + "Lag", this.Lag);

    }
}

