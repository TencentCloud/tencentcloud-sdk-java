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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintGroupVerifyResponse extends AbstractModel {

    /**
    * TopN 返回结果;系统建议打分70分以上为同一个人音色，评分也取决于音频质量、长度等其他原因影响，您可以按照业务需求适当提高或降低分数要求
    */
    @SerializedName("Data")
    @Expose
    private VerifyTopResult Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TopN 返回结果;系统建议打分70分以上为同一个人音色，评分也取决于音频质量、长度等其他原因影响，您可以按照业务需求适当提高或降低分数要求 
     * @return Data TopN 返回结果;系统建议打分70分以上为同一个人音色，评分也取决于音频质量、长度等其他原因影响，您可以按照业务需求适当提高或降低分数要求
     */
    public VerifyTopResult getData() {
        return this.Data;
    }

    /**
     * Set TopN 返回结果;系统建议打分70分以上为同一个人音色，评分也取决于音频质量、长度等其他原因影响，您可以按照业务需求适当提高或降低分数要求
     * @param Data TopN 返回结果;系统建议打分70分以上为同一个人音色，评分也取决于音频质量、长度等其他原因影响，您可以按照业务需求适当提高或降低分数要求
     */
    public void setData(VerifyTopResult Data) {
        this.Data = Data;
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

    public VoicePrintGroupVerifyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintGroupVerifyResponse(VoicePrintGroupVerifyResponse source) {
        if (source.Data != null) {
            this.Data = new VerifyTopResult(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

