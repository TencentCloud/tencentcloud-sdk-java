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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryHunyuanTo3DProJobResponse extends AbstractModel {

    /**
    * <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>生成的3D文件数组。</p>
    */
    @SerializedName("ResultFile3Ds")
    @Expose
    private File3D [] ResultFile3Ds;

    /**
    * <p>接口任务功能参数及积分详情，返回形式为字符串。Generate参数返回对应模式及消耗积分，如：Generate-Normal：20<br>附加参数返回参数名称及消耗积分，如：MultiViewImages：10</p>
    */
    @SerializedName("ResultCreditDetails")
    @Expose
    private String ResultCreditDetails;

    /**
    * <p>任务总消耗积分。</p>
    */
    @SerializedName("ResultCreditConsumed")
    @Expose
    private Float ResultCreditConsumed;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p> 
     * @return Status <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     * @param Status <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码</p> 
     * @return ErrorCode <p>错误码</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>错误码</p>
     * @param ErrorCode <p>错误码</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorMessage <p>错误信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorMessage <p>错误信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>生成的3D文件数组。</p> 
     * @return ResultFile3Ds <p>生成的3D文件数组。</p>
     */
    public File3D [] getResultFile3Ds() {
        return this.ResultFile3Ds;
    }

    /**
     * Set <p>生成的3D文件数组。</p>
     * @param ResultFile3Ds <p>生成的3D文件数组。</p>
     */
    public void setResultFile3Ds(File3D [] ResultFile3Ds) {
        this.ResultFile3Ds = ResultFile3Ds;
    }

    /**
     * Get <p>接口任务功能参数及积分详情，返回形式为字符串。Generate参数返回对应模式及消耗积分，如：Generate-Normal：20<br>附加参数返回参数名称及消耗积分，如：MultiViewImages：10</p> 
     * @return ResultCreditDetails <p>接口任务功能参数及积分详情，返回形式为字符串。Generate参数返回对应模式及消耗积分，如：Generate-Normal：20<br>附加参数返回参数名称及消耗积分，如：MultiViewImages：10</p>
     */
    public String getResultCreditDetails() {
        return this.ResultCreditDetails;
    }

    /**
     * Set <p>接口任务功能参数及积分详情，返回形式为字符串。Generate参数返回对应模式及消耗积分，如：Generate-Normal：20<br>附加参数返回参数名称及消耗积分，如：MultiViewImages：10</p>
     * @param ResultCreditDetails <p>接口任务功能参数及积分详情，返回形式为字符串。Generate参数返回对应模式及消耗积分，如：Generate-Normal：20<br>附加参数返回参数名称及消耗积分，如：MultiViewImages：10</p>
     */
    public void setResultCreditDetails(String ResultCreditDetails) {
        this.ResultCreditDetails = ResultCreditDetails;
    }

    /**
     * Get <p>任务总消耗积分。</p> 
     * @return ResultCreditConsumed <p>任务总消耗积分。</p>
     */
    public Float getResultCreditConsumed() {
        return this.ResultCreditConsumed;
    }

    /**
     * Set <p>任务总消耗积分。</p>
     * @param ResultCreditConsumed <p>任务总消耗积分。</p>
     */
    public void setResultCreditConsumed(Float ResultCreditConsumed) {
        this.ResultCreditConsumed = ResultCreditConsumed;
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

    public QueryHunyuanTo3DProJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryHunyuanTo3DProJobResponse(QueryHunyuanTo3DProJobResponse source) {
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
        if (source.ResultCreditDetails != null) {
            this.ResultCreditDetails = new String(source.ResultCreditDetails);
        }
        if (source.ResultCreditConsumed != null) {
            this.ResultCreditConsumed = new Float(source.ResultCreditConsumed);
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
        this.setParamSimple(map, prefix + "ResultCreditDetails", this.ResultCreditDetails);
        this.setParamSimple(map, prefix + "ResultCreditConsumed", this.ResultCreditConsumed);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

