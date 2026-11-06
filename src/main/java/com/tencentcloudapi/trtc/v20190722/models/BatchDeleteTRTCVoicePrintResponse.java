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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeleteTRTCVoicePrintResponse extends AbstractModel {

    /**
    * 成功删除的声纹数量（按数据库实际删除行数统计）
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败的声纹数量（通常是因为声纹不存在）
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 每个 VoicePrintId 的处理结果列表，元素为 VoicePrintBatchDeleteResult结构：{ VoiceprintId:string, ErrorCode:string, ErrorMessage:string }，成功项仅返回 VoiceprintId，失败项带 ErrorCode/ErrorMessage。
    */
    @SerializedName("Results")
    @Expose
    private VoicePrintBatchDeleteResult [] Results;

    /**
    * 结果描述，成功时为 batch delete completed: X succeeded, Y failed
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功删除的声纹数量（按数据库实际删除行数统计） 
     * @return SuccessCount 成功删除的声纹数量（按数据库实际删除行数统计）
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功删除的声纹数量（按数据库实际删除行数统计）
     * @param SuccessCount 成功删除的声纹数量（按数据库实际删除行数统计）
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败的声纹数量（通常是因为声纹不存在） 
     * @return FailCount 失败的声纹数量（通常是因为声纹不存在）
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 失败的声纹数量（通常是因为声纹不存在）
     * @param FailCount 失败的声纹数量（通常是因为声纹不存在）
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 每个 VoicePrintId 的处理结果列表，元素为 VoicePrintBatchDeleteResult结构：{ VoiceprintId:string, ErrorCode:string, ErrorMessage:string }，成功项仅返回 VoiceprintId，失败项带 ErrorCode/ErrorMessage。 
     * @return Results 每个 VoicePrintId 的处理结果列表，元素为 VoicePrintBatchDeleteResult结构：{ VoiceprintId:string, ErrorCode:string, ErrorMessage:string }，成功项仅返回 VoiceprintId，失败项带 ErrorCode/ErrorMessage。
     */
    public VoicePrintBatchDeleteResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 每个 VoicePrintId 的处理结果列表，元素为 VoicePrintBatchDeleteResult结构：{ VoiceprintId:string, ErrorCode:string, ErrorMessage:string }，成功项仅返回 VoiceprintId，失败项带 ErrorCode/ErrorMessage。
     * @param Results 每个 VoicePrintId 的处理结果列表，元素为 VoicePrintBatchDeleteResult结构：{ VoiceprintId:string, ErrorCode:string, ErrorMessage:string }，成功项仅返回 VoiceprintId，失败项带 ErrorCode/ErrorMessage。
     */
    public void setResults(VoicePrintBatchDeleteResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 结果描述，成功时为 batch delete completed: X succeeded, Y failed 
     * @return Message 结果描述，成功时为 batch delete completed: X succeeded, Y failed
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 结果描述，成功时为 batch delete completed: X succeeded, Y failed
     * @param Message 结果描述，成功时为 batch delete completed: X succeeded, Y failed
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public BatchDeleteTRTCVoicePrintResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteTRTCVoicePrintResponse(BatchDeleteTRTCVoicePrintResponse source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.Results != null) {
            this.Results = new VoicePrintBatchDeleteResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new VoicePrintBatchDeleteResult(source.Results[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

