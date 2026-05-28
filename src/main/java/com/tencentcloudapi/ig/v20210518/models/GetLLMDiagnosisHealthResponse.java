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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLLMDiagnosisHealthResponse extends SSEResponseModel {

    /**
    * <p>错误码，0成功，非0失败</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>返回数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private LLMDiagnosisHealthData Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>错误码，0成功，非0失败</p> 
     * @return Code <p>错误码，0成功，非0失败</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>错误码，0成功，非0失败</p>
     * @param Code <p>错误码，0成功，非0失败</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>错误信息</p> 
     * @return Message <p>错误信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息</p>
     * @param Message <p>错误信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>返回数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data <p>返回数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LLMDiagnosisHealthData getData() {
        return this.Data;
    }

    /**
     * Set <p>返回数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data <p>返回数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(LLMDiagnosisHealthData Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetLLMDiagnosisHealthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLLMDiagnosisHealthResponse(GetLLMDiagnosisHealthResponse source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Data != null) {
            this.Data = new LLMDiagnosisHealthData(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

