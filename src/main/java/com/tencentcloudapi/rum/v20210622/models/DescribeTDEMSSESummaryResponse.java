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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMSSESummaryResponse extends AbstractModel {

    /**
    * <p>对话次数。一条大模型对话对应一条 sse_call。</p>
    */
    @SerializedName("ConversationCount")
    @Expose
    private Long ConversationCount;

    /**
    * <p>token 总数。对话次数为 0 时为 0。</p>
    */
    @SerializedName("TotalTokenCount")
    @Expose
    private Long TotalTokenCount;

    /**
    * <p>token 吞吐率，单位 token/秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenThroughput")
    @Expose
    private Float TokenThroughput;

    /**
    * <p>首次消息时延，单位毫秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstMessageDelay")
    @Expose
    private Float FirstMessageDelay;

    /**
    * <p>错误率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
    * <p>卡死率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StallRate")
    @Expose
    private Float StallRate;

    /**
    * <p>流畅度，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fluency")
    @Expose
    private Float Fluency;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>对话次数。一条大模型对话对应一条 sse_call。</p> 
     * @return ConversationCount <p>对话次数。一条大模型对话对应一条 sse_call。</p>
     */
    public Long getConversationCount() {
        return this.ConversationCount;
    }

    /**
     * Set <p>对话次数。一条大模型对话对应一条 sse_call。</p>
     * @param ConversationCount <p>对话次数。一条大模型对话对应一条 sse_call。</p>
     */
    public void setConversationCount(Long ConversationCount) {
        this.ConversationCount = ConversationCount;
    }

    /**
     * Get <p>token 总数。对话次数为 0 时为 0。</p> 
     * @return TotalTokenCount <p>token 总数。对话次数为 0 时为 0。</p>
     */
    public Long getTotalTokenCount() {
        return this.TotalTokenCount;
    }

    /**
     * Set <p>token 总数。对话次数为 0 时为 0。</p>
     * @param TotalTokenCount <p>token 总数。对话次数为 0 时为 0。</p>
     */
    public void setTotalTokenCount(Long TotalTokenCount) {
        this.TotalTokenCount = TotalTokenCount;
    }

    /**
     * Get <p>token 吞吐率，单位 token/秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenThroughput <p>token 吞吐率，单位 token/秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTokenThroughput() {
        return this.TokenThroughput;
    }

    /**
     * Set <p>token 吞吐率，单位 token/秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenThroughput <p>token 吞吐率，单位 token/秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenThroughput(Float TokenThroughput) {
        this.TokenThroughput = TokenThroughput;
    }

    /**
     * Get <p>首次消息时延，单位毫秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstMessageDelay <p>首次消息时延，单位毫秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFirstMessageDelay() {
        return this.FirstMessageDelay;
    }

    /**
     * Set <p>首次消息时延，单位毫秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstMessageDelay <p>首次消息时延，单位毫秒。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstMessageDelay(Float FirstMessageDelay) {
        this.FirstMessageDelay = FirstMessageDelay;
    }

    /**
     * Get <p>错误率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorRate <p>错误率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set <p>错误率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorRate <p>错误率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    /**
     * Get <p>卡死率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StallRate <p>卡死率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStallRate() {
        return this.StallRate;
    }

    /**
     * Set <p>卡死率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StallRate <p>卡死率，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStallRate(Float StallRate) {
        this.StallRate = StallRate;
    }

    /**
     * Get <p>流畅度，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fluency <p>流畅度，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFluency() {
        return this.Fluency;
    }

    /**
     * Set <p>流畅度，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fluency <p>流畅度，已乘 100。对话次数为 0 时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFluency(Float Fluency) {
        this.Fluency = Fluency;
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

    public DescribeTDEMSSESummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSSESummaryResponse(DescribeTDEMSSESummaryResponse source) {
        if (source.ConversationCount != null) {
            this.ConversationCount = new Long(source.ConversationCount);
        }
        if (source.TotalTokenCount != null) {
            this.TotalTokenCount = new Long(source.TotalTokenCount);
        }
        if (source.TokenThroughput != null) {
            this.TokenThroughput = new Float(source.TokenThroughput);
        }
        if (source.FirstMessageDelay != null) {
            this.FirstMessageDelay = new Float(source.FirstMessageDelay);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
        if (source.StallRate != null) {
            this.StallRate = new Float(source.StallRate);
        }
        if (source.Fluency != null) {
            this.Fluency = new Float(source.Fluency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConversationCount", this.ConversationCount);
        this.setParamSimple(map, prefix + "TotalTokenCount", this.TotalTokenCount);
        this.setParamSimple(map, prefix + "TokenThroughput", this.TokenThroughput);
        this.setParamSimple(map, prefix + "FirstMessageDelay", this.FirstMessageDelay);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);
        this.setParamSimple(map, prefix + "StallRate", this.StallRate);
        this.setParamSimple(map, prefix + "Fluency", this.Fluency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

