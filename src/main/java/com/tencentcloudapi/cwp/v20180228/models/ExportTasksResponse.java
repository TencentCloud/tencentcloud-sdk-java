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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportTasksResponse extends AbstractModel {

    /**
    * <p>PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>下载链接</p>
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况</p> 
     * @return Status <p>PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况</p>
     * @param Status <p>PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>下载链接</p> 
     * @return DownloadUrl <p>下载链接</p>
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set <p>下载链接</p>
     * @param DownloadUrl <p>下载链接</p>
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
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

    public ExportTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportTasksResponse(ExportTasksResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
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
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

