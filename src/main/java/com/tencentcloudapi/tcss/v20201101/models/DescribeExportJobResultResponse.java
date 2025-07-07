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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExportJobResultResponse extends AbstractModel {

    /**
    * 导出的状态。取值为, SUCCESS:成功、FAILURE:失败，RUNNING: 进行中。
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * 返回下载URL
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
    * 当ExportStatus为RUNNING时，返回导出进度。0~100范围的浮点数。
    */
    @SerializedName("ExportProgress")
    @Expose
    private Float ExportProgress;

    /**
    * 失败原因
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 导出的状态。取值为, SUCCESS:成功、FAILURE:失败，RUNNING: 进行中。 
     * @return ExportStatus 导出的状态。取值为, SUCCESS:成功、FAILURE:失败，RUNNING: 进行中。
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set 导出的状态。取值为, SUCCESS:成功、FAILURE:失败，RUNNING: 进行中。
     * @param ExportStatus 导出的状态。取值为, SUCCESS:成功、FAILURE:失败，RUNNING: 进行中。
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
    }

    /**
     * Get 返回下载URL 
     * @return DownloadURL 返回下载URL
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set 返回下载URL
     * @param DownloadURL 返回下载URL
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    /**
     * Get 当ExportStatus为RUNNING时，返回导出进度。0~100范围的浮点数。 
     * @return ExportProgress 当ExportStatus为RUNNING时，返回导出进度。0~100范围的浮点数。
     */
    public Float getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set 当ExportStatus为RUNNING时，返回导出进度。0~100范围的浮点数。
     * @param ExportProgress 当ExportStatus为RUNNING时，返回导出进度。0~100范围的浮点数。
     */
    public void setExportProgress(Float ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get 失败原因 
     * @return FailureMsg 失败原因
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set 失败原因
     * @param FailureMsg 失败原因
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
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

    public DescribeExportJobResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportJobResultResponse(DescribeExportJobResultResponse source) {
        if (source.ExportStatus != null) {
            this.ExportStatus = new String(source.ExportStatus);
        }
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
        if (source.ExportProgress != null) {
            this.ExportProgress = new Float(source.ExportProgress);
        }
        if (source.FailureMsg != null) {
            this.FailureMsg = new String(source.FailureMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "DownloadURL", this.DownloadURL);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

