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

public class QueryHunyuan3DPartJobResponse extends AbstractModel {

    /**
    * <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码。</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>生成文件的URL地址，有效期1天。</p>
    */
    @SerializedName("ResultFile3Ds")
    @Expose
    private File3D [] ResultFile3Ds;

    /**
    * <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
    */
    @SerializedName("PartSegmentationInfo")
    @Expose
    private String PartSegmentationInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。</p> 
     * @return Status <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。</p>
     * @param Status <p>任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 示例值：RUN。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码。</p> 
     * @return ErrorCode <p>错误码。</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>错误码。</p>
     * @param ErrorCode <p>错误码。</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return ErrorMessage <p>错误信息。</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息。</p>
     * @param ErrorMessage <p>错误信息。</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>生成文件的URL地址，有效期1天。</p> 
     * @return ResultFile3Ds <p>生成文件的URL地址，有效期1天。</p>
     */
    public File3D [] getResultFile3Ds() {
        return this.ResultFile3Ds;
    }

    /**
     * Set <p>生成文件的URL地址，有效期1天。</p>
     * @param ResultFile3Ds <p>生成文件的URL地址，有效期1天。</p>
     */
    public void setResultFile3Ds(File3D [] ResultFile3Ds) {
        this.ResultFile3Ds = ResultFile3Ds;
    }

    /**
     * Get <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p> 
     * @return PartSegmentationInfo <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
     */
    public String getPartSegmentationInfo() {
        return this.PartSegmentationInfo;
    }

    /**
     * Set <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
     * @param PartSegmentationInfo <p>是否分步骤进行组件生成；<br>开启后，输入原始模型后，可生成带分割信息的模型以及分割数据，可对此信息编辑后再传入带有分割信息的模型和分割数据进行编辑后的组件生成；<br>此参数默认关闭。</p>
     */
    public void setPartSegmentationInfo(String PartSegmentationInfo) {
        this.PartSegmentationInfo = PartSegmentationInfo;
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

    public QueryHunyuan3DPartJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryHunyuan3DPartJobResponse(QueryHunyuan3DPartJobResponse source) {
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
        if (source.PartSegmentationInfo != null) {
            this.PartSegmentationInfo = new String(source.PartSegmentationInfo);
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
        this.setParamSimple(map, prefix + "PartSegmentationInfo", this.PartSegmentationInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

