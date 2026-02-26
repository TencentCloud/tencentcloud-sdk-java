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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcVideoJobResponse extends AbstractModel {

    /**
    * 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
示例值：RUN
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
示例值：FailedOperation.DriverFailed
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
示例值：驱动失败
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 结果视频 URL。有效期 24 小时。

示例值：https://console.cloud.tencent.com/result.mp4
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
示例值：RUN 
     * @return Status 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
示例值：RUN
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
示例值：RUN
     * @param Status 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
示例值：RUN
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
示例值：FailedOperation.DriverFailed 
     * @return ErrorCode 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
示例值：FailedOperation.DriverFailed
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
示例值：FailedOperation.DriverFailed
     * @param ErrorCode 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
示例值：FailedOperation.DriverFailed
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
示例值：驱动失败 
     * @return ErrorMessage 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
示例值：驱动失败
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
示例值：驱动失败
     * @param ErrorMessage 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
示例值：驱动失败
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 结果视频 URL。有效期 24 小时。

示例值：https://console.cloud.tencent.com/result.mp4 
     * @return ResultUrl 结果视频 URL。有效期 24 小时。

示例值：https://console.cloud.tencent.com/result.mp4
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set 结果视频 URL。有效期 24 小时。

示例值：https://console.cloud.tencent.com/result.mp4
     * @param ResultUrl 结果视频 URL。有效期 24 小时。

示例值：https://console.cloud.tencent.com/result.mp4
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
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

    public DescribeAigcVideoJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcVideoJobResponse(DescribeAigcVideoJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

