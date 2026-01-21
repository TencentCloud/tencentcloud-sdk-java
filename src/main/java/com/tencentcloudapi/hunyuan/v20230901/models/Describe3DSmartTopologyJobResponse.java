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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Describe3DSmartTopologyJobResponse extends AbstractModel {

    /**
    * 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。	
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码。	
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 错误信息。	
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 生成文件的URL地址，有效期1天。	
    */
    @SerializedName("ResultFile3Ds")
    @Expose
    private File3D [] ResultFile3Ds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。	 
     * @return Status 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。	
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。	
     * @param Status 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。	
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码。	 
     * @return ErrorCode 错误码。	
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码。	
     * @param ErrorCode 错误码。	
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误信息。	 
     * @return ErrorMessage 错误信息。	
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息。	
     * @param ErrorMessage 错误信息。	
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 生成文件的URL地址，有效期1天。	 
     * @return ResultFile3Ds 生成文件的URL地址，有效期1天。	
     */
    public File3D [] getResultFile3Ds() {
        return this.ResultFile3Ds;
    }

    /**
     * Set 生成文件的URL地址，有效期1天。	
     * @param ResultFile3Ds 生成文件的URL地址，有效期1天。	
     */
    public void setResultFile3Ds(File3D [] ResultFile3Ds) {
        this.ResultFile3Ds = ResultFile3Ds;
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

    public Describe3DSmartTopologyJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Describe3DSmartTopologyJobResponse(Describe3DSmartTopologyJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultFile3Ds != null) {
            this.ResultFile3Ds = new File3D[source.ResultFile3Ds.length];
            for (int i = 0; i < source.ResultFile3Ds.length; i++) {
                this.ResultFile3Ds[i] = new File3D(source.ResultFile3Ds[i]);
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
        this.setParamArrayObj(map, prefix + "ResultFile3Ds.", this.ResultFile3Ds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

