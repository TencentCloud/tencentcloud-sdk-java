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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryHunyuan3DTaskResponse extends AbstractModel {

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>仅 Status=FAIL 时有值，详细文案</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>仅 Status=DONE 时有值，产物文件列表</p>
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
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>WAIT： 已排队，等待执行</li><li>RUN： 正在执行</li><li>DONE： 已成功完成，ResultFile3Ds 有值</li><li>FAIL： 已失败，ErrorCode / ErrorMessage 有值</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p> 
     * @return Progress <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
     * @param Progress <p>进度百分比，0~100。未知时为 0；DONE 时应为 100；FAIL 时保留最后一次已知值</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p> 
     * @return ErrorCode <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
     * @param ErrorCode <p>仅 Status=FAIL 时有值，字符串错误码（如 InternalError.ModelInference）</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>仅 Status=FAIL 时有值，详细文案</p> 
     * @return ErrorMessage <p>仅 Status=FAIL 时有值，详细文案</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>仅 Status=FAIL 时有值，详细文案</p>
     * @param ErrorMessage <p>仅 Status=FAIL 时有值，详细文案</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>仅 Status=DONE 时有值，产物文件列表</p> 
     * @return ResultFile3Ds <p>仅 Status=DONE 时有值，产物文件列表</p>
     */
    public File3D [] getResultFile3Ds() {
        return this.ResultFile3Ds;
    }

    /**
     * Set <p>仅 Status=DONE 时有值，产物文件列表</p>
     * @param ResultFile3Ds <p>仅 Status=DONE 时有值，产物文件列表</p>
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

    public QueryHunyuan3DTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryHunyuan3DTaskResponse(QueryHunyuan3DTaskResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "ResultFile3Ds.", this.ResultFile3Ds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

