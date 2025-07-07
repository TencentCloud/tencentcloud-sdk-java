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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentSSEResponse extends SSEResponseModel {

    /**
    * 任务ID。本次请求的唯一标识
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 响应类型。1：返回进度信息，2：返回解析结果
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * 进度。0~100
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 进度信息。
    */
    @SerializedName("ProgressMessage")
    @Expose
    private String ProgressMessage;

    /**
    * 文档解析结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含*.md、*.json以及images文件夹。

    */
    @SerializedName("DocumentRecognizeResultUrl")
    @Expose
    private String DocumentRecognizeResultUrl;

    /**
    * 文档解析失败的页码。
    */
    @SerializedName("FailedPages")
    @Expose
    private ReconstructDocumentFailedPage [] FailedPages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务ID。本次请求的唯一标识 
     * @return TaskId 任务ID。本次请求的唯一标识
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。本次请求的唯一标识
     * @param TaskId 任务ID。本次请求的唯一标识
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 响应类型。1：返回进度信息，2：返回解析结果 
     * @return ResponseType 响应类型。1：返回进度信息，2：返回解析结果
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set 响应类型。1：返回进度信息，2：返回解析结果
     * @param ResponseType 响应类型。1：返回进度信息，2：返回解析结果
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get 进度。0~100 
     * @return Progress 进度。0~100
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度。0~100
     * @param Progress 进度。0~100
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 进度信息。 
     * @return ProgressMessage 进度信息。
     */
    public String getProgressMessage() {
        return this.ProgressMessage;
    }

    /**
     * Set 进度信息。
     * @param ProgressMessage 进度信息。
     */
    public void setProgressMessage(String ProgressMessage) {
        this.ProgressMessage = ProgressMessage;
    }

    /**
     * Get 文档解析结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含*.md、*.json以及images文件夹。
 
     * @return DocumentRecognizeResultUrl 文档解析结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含*.md、*.json以及images文件夹。

     */
    public String getDocumentRecognizeResultUrl() {
        return this.DocumentRecognizeResultUrl;
    }

    /**
     * Set 文档解析结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含*.md、*.json以及images文件夹。

     * @param DocumentRecognizeResultUrl 文档解析结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含*.md、*.json以及images文件夹。

     */
    public void setDocumentRecognizeResultUrl(String DocumentRecognizeResultUrl) {
        this.DocumentRecognizeResultUrl = DocumentRecognizeResultUrl;
    }

    /**
     * Get 文档解析失败的页码。 
     * @return FailedPages 文档解析失败的页码。
     */
    public ReconstructDocumentFailedPage [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set 文档解析失败的页码。
     * @param FailedPages 文档解析失败的页码。
     */
    public void setFailedPages(ReconstructDocumentFailedPage [] FailedPages) {
        this.FailedPages = FailedPages;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ReconstructDocumentSSEResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentSSEResponse(ReconstructDocumentSSEResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.ProgressMessage != null) {
            this.ProgressMessage = new String(source.ProgressMessage);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ProgressMessage", this.ProgressMessage);
        this.setParamSimple(map, prefix + "DocumentRecognizeResultUrl", this.DocumentRecognizeResultUrl);
        this.setParamArrayObj(map, prefix + "FailedPages.", this.FailedPages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

