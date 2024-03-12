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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportRocketMQMessageDetailResponse extends AbstractModel {

    /**
    * 消息id
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息生成时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BornTimestamp")
    @Expose
    private Long BornTimestamp;

    /**
    * 消息存储时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoreTimestamp")
    @Expose
    private Long StoreTimestamp;

    /**
    * 消息生产客户端地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BornHost")
    @Expose
    private String BornHost;

    /**
    * 消息Tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

    /**
    * 消息Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * 消息属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 消息重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReConsumeTimes")
    @Expose
    private Long ReConsumeTimes;

    /**
    * Base64编码格式字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgBody")
    @Expose
    private String MsgBody;

    /**
    * 消息内容的CRC32 Code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgBodyCRC")
    @Expose
    private Long MsgBodyCRC;

    /**
    * 消息体大小（单位K）
当大于2048时不返回消息
    */
    @SerializedName("MsgBodySize")
    @Expose
    private Long MsgBodySize;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 消息生成时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BornTimestamp 消息生成时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBornTimestamp() {
        return this.BornTimestamp;
    }

    /**
     * Set 消息生成时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param BornTimestamp 消息生成时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBornTimestamp(Long BornTimestamp) {
        this.BornTimestamp = BornTimestamp;
    }

    /**
     * Get 消息存储时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoreTimestamp 消息存储时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoreTimestamp() {
        return this.StoreTimestamp;
    }

    /**
     * Set 消息存储时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoreTimestamp 消息存储时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoreTimestamp(Long StoreTimestamp) {
        this.StoreTimestamp = StoreTimestamp;
    }

    /**
     * Get 消息生产客户端地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BornHost 消息生产客户端地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBornHost() {
        return this.BornHost;
    }

    /**
     * Set 消息生产客户端地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param BornHost 消息生产客户端地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBornHost(String BornHost) {
        this.BornHost = BornHost;
    }

    /**
     * Get 消息Tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgTag 消息Tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set 消息Tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgTag 消息Tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    /**
     * Get 消息Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgKey 消息Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set 消息Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgKey 消息Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get 消息属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 消息属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 消息属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 消息属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 消息重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReConsumeTimes 消息重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReConsumeTimes() {
        return this.ReConsumeTimes;
    }

    /**
     * Set 消息重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReConsumeTimes 消息重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReConsumeTimes(Long ReConsumeTimes) {
        this.ReConsumeTimes = ReConsumeTimes;
    }

    /**
     * Get Base64编码格式字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgBody Base64编码格式字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgBody() {
        return this.MsgBody;
    }

    /**
     * Set Base64编码格式字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgBody Base64编码格式字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgBody(String MsgBody) {
        this.MsgBody = MsgBody;
    }

    /**
     * Get 消息内容的CRC32 Code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgBodyCRC 消息内容的CRC32 Code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgBodyCRC() {
        return this.MsgBodyCRC;
    }

    /**
     * Set 消息内容的CRC32 Code
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgBodyCRC 消息内容的CRC32 Code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgBodyCRC(Long MsgBodyCRC) {
        this.MsgBodyCRC = MsgBodyCRC;
    }

    /**
     * Get 消息体大小（单位K）
当大于2048时不返回消息 
     * @return MsgBodySize 消息体大小（单位K）
当大于2048时不返回消息
     */
    public Long getMsgBodySize() {
        return this.MsgBodySize;
    }

    /**
     * Set 消息体大小（单位K）
当大于2048时不返回消息
     * @param MsgBodySize 消息体大小（单位K）
当大于2048时不返回消息
     */
    public void setMsgBodySize(Long MsgBodySize) {
        this.MsgBodySize = MsgBodySize;
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

    public ExportRocketMQMessageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRocketMQMessageDetailResponse(ExportRocketMQMessageDetailResponse source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.BornTimestamp != null) {
            this.BornTimestamp = new Long(source.BornTimestamp);
        }
        if (source.StoreTimestamp != null) {
            this.StoreTimestamp = new Long(source.StoreTimestamp);
        }
        if (source.BornHost != null) {
            this.BornHost = new String(source.BornHost);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String(source.MsgTag);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.ReConsumeTimes != null) {
            this.ReConsumeTimes = new Long(source.ReConsumeTimes);
        }
        if (source.MsgBody != null) {
            this.MsgBody = new String(source.MsgBody);
        }
        if (source.MsgBodyCRC != null) {
            this.MsgBodyCRC = new Long(source.MsgBodyCRC);
        }
        if (source.MsgBodySize != null) {
            this.MsgBodySize = new Long(source.MsgBodySize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "BornTimestamp", this.BornTimestamp);
        this.setParamSimple(map, prefix + "StoreTimestamp", this.StoreTimestamp);
        this.setParamSimple(map, prefix + "BornHost", this.BornHost);
        this.setParamSimple(map, prefix + "MsgTag", this.MsgTag);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "ReConsumeTimes", this.ReConsumeTimes);
        this.setParamSimple(map, prefix + "MsgBody", this.MsgBody);
        this.setParamSimple(map, prefix + "MsgBodyCRC", this.MsgBodyCRC);
        this.setParamSimple(map, prefix + "MsgBodySize", this.MsgBodySize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

