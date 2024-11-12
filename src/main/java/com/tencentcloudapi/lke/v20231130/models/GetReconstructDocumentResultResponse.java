/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetReconstructDocumentResultResponse extends AbstractModel {

    /**
    * 任务状态: Success->执行完成；Processing->执行中；Failed->执行失败；WaitExecute->等待执行。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 本次文档解析的结果文件，存储在腾讯云COS的下载URL，下载URL的有效期为10分钟。
    */
    @SerializedName("DocumentRecognizeResultUrl")
    @Expose
    private String DocumentRecognizeResultUrl;

    /**
    * 本次文档解析失败的页码信息。
    */
    @SerializedName("FailedPages")
    @Expose
    private ReconstructDocumentFailedPage [] FailedPages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态: Success->执行完成；Processing->执行中；Failed->执行失败；WaitExecute->等待执行。 
     * @return Status 任务状态: Success->执行完成；Processing->执行中；Failed->执行失败；WaitExecute->等待执行。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态: Success->执行完成；Processing->执行中；Failed->执行失败；WaitExecute->等待执行。
     * @param Status 任务状态: Success->执行完成；Processing->执行中；Failed->执行失败；WaitExecute->等待执行。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 本次文档解析的结果文件，存储在腾讯云COS的下载URL，下载URL的有效期为10分钟。 
     * @return DocumentRecognizeResultUrl 本次文档解析的结果文件，存储在腾讯云COS的下载URL，下载URL的有效期为10分钟。
     */
    public String getDocumentRecognizeResultUrl() {
        return this.DocumentRecognizeResultUrl;
    }

    /**
     * Set 本次文档解析的结果文件，存储在腾讯云COS的下载URL，下载URL的有效期为10分钟。
     * @param DocumentRecognizeResultUrl 本次文档解析的结果文件，存储在腾讯云COS的下载URL，下载URL的有效期为10分钟。
     */
    public void setDocumentRecognizeResultUrl(String DocumentRecognizeResultUrl) {
        this.DocumentRecognizeResultUrl = DocumentRecognizeResultUrl;
    }

    /**
     * Get 本次文档解析失败的页码信息。 
     * @return FailedPages 本次文档解析失败的页码信息。
     */
    public ReconstructDocumentFailedPage [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set 本次文档解析失败的页码信息。
     * @param FailedPages 本次文档解析失败的页码信息。
     */
    public void setFailedPages(ReconstructDocumentFailedPage [] FailedPages) {
        this.FailedPages = FailedPages;
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

    public GetReconstructDocumentResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetReconstructDocumentResultResponse(GetReconstructDocumentResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DocumentRecognizeResultUrl != null) {
            this.DocumentRecognizeResultUrl = new String(source.DocumentRecognizeResultUrl);
        }
        if (source.FailedPages != null) {
            this.FailedPages = new ReconstructDocumentFailedPage[source.FailedPages.length];
            for (int i = 0; i < source.FailedPages.length; i++) {
                this.FailedPages[i] = new ReconstructDocumentFailedPage(source.FailedPages[i]);
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
        this.setParamSimple(map, prefix + "DocumentRecognizeResultUrl", this.DocumentRecognizeResultUrl);
        this.setParamArrayObj(map, prefix + "FailedPages.", this.FailedPages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

