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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateToImageJobResponse extends AbstractModel {

    /**
    * 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务处理失败错误码。

    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 任务处理失败错误信息。

    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 生成图 URL 列表，有效期1小时，请及时保存。

    */
    @SerializedName("ResultImage")
    @Expose
    private String [] ResultImage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。 
     * @return Status 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
     * @param Status 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务处理失败错误码。
 
     * @return ErrorCode 任务处理失败错误码。

     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务处理失败错误码。

     * @param ErrorCode 任务处理失败错误码。

     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 任务处理失败错误信息。
 
     * @return ErrorMessage 任务处理失败错误信息。

     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务处理失败错误信息。

     * @param ErrorMessage 任务处理失败错误信息。

     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 生成图 URL 列表，有效期1小时，请及时保存。
 
     * @return ResultImage 生成图 URL 列表，有效期1小时，请及时保存。

     */
    public String [] getResultImage() {
        return this.ResultImage;
    }

    /**
     * Set 生成图 URL 列表，有效期1小时，请及时保存。

     * @param ResultImage 生成图 URL 列表，有效期1小时，请及时保存。

     */
    public void setResultImage(String [] ResultImage) {
        this.ResultImage = ResultImage;
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

    public DescribeTemplateToImageJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplateToImageJobResponse(DescribeTemplateToImageJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultImage != null) {
            this.ResultImage = new String[source.ResultImage.length];
            for (int i = 0; i < source.ResultImage.length; i++) {
                this.ResultImage[i] = new String(source.ResultImage[i]);
            }
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
        this.setParamArraySimple(map, prefix + "ResultImage.", this.ResultImage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

