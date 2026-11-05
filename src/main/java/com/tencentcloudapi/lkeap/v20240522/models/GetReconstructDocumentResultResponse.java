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

public class GetReconstructDocumentResultResponse extends AbstractModel {

    /**
    * <p>任务状态。</p><ul><li><code>Success</code>：执行完成</li><li><code>Processing</code>：执行中</li><li><code>Pause</code>: 暂停</li><li><code>Failed</code>：执行失败</li><li><code>WaitExecute</code>：等待执行</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>解析结果的临时下载地址。文件类型为zip压缩包，下载链接有效期30分钟</p>
    */
    @SerializedName("DocumentRecognizeResultUrl")
    @Expose
    private String DocumentRecognizeResultUrl;

    /**
    * <p>文档解析失败的页码</p>
    */
    @SerializedName("FailedPages")
    @Expose
    private ReconstructDocumentFailedPage [] FailedPages;

    /**
    * <p>文档拆分任务的用量</p>
    */
    @SerializedName("Usage")
    @Expose
    private DocumentUsage Usage;

    /**
    * <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
    */
    @SerializedName("TaskErrInfo")
    @Expose
    private TaskErrInfo TaskErrInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态。</p><ul><li><code>Success</code>：执行完成</li><li><code>Processing</code>：执行中</li><li><code>Pause</code>: 暂停</li><li><code>Failed</code>：执行失败</li><li><code>WaitExecute</code>：等待执行</li></ul> 
     * @return Status <p>任务状态。</p><ul><li><code>Success</code>：执行完成</li><li><code>Processing</code>：执行中</li><li><code>Pause</code>: 暂停</li><li><code>Failed</code>：执行失败</li><li><code>WaitExecute</code>：等待执行</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p><ul><li><code>Success</code>：执行完成</li><li><code>Processing</code>：执行中</li><li><code>Pause</code>: 暂停</li><li><code>Failed</code>：执行失败</li><li><code>WaitExecute</code>：等待执行</li></ul>
     * @param Status <p>任务状态。</p><ul><li><code>Success</code>：执行完成</li><li><code>Processing</code>：执行中</li><li><code>Pause</code>: 暂停</li><li><code>Failed</code>：执行失败</li><li><code>WaitExecute</code>：等待执行</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>解析结果的临时下载地址。文件类型为zip压缩包，下载链接有效期30分钟</p> 
     * @return DocumentRecognizeResultUrl <p>解析结果的临时下载地址。文件类型为zip压缩包，下载链接有效期30分钟</p>
     */
    public String getDocumentRecognizeResultUrl() {
        return this.DocumentRecognizeResultUrl;
    }

    /**
     * Set <p>解析结果的临时下载地址。文件类型为zip压缩包，下载链接有效期30分钟</p>
     * @param DocumentRecognizeResultUrl <p>解析结果的临时下载地址。文件类型为zip压缩包，下载链接有效期30分钟</p>
     */
    public void setDocumentRecognizeResultUrl(String DocumentRecognizeResultUrl) {
        this.DocumentRecognizeResultUrl = DocumentRecognizeResultUrl;
    }

    /**
     * Get <p>文档解析失败的页码</p> 
     * @return FailedPages <p>文档解析失败的页码</p>
     */
    public ReconstructDocumentFailedPage [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set <p>文档解析失败的页码</p>
     * @param FailedPages <p>文档解析失败的页码</p>
     */
    public void setFailedPages(ReconstructDocumentFailedPage [] FailedPages) {
        this.FailedPages = FailedPages;
    }

    /**
     * Get <p>文档拆分任务的用量</p> 
     * @return Usage <p>文档拆分任务的用量</p>
     */
    public DocumentUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>文档拆分任务的用量</p>
     * @param Usage <p>文档拆分任务的用量</p>
     */
    public void setUsage(DocumentUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p> 
     * @return Error <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
     * @deprecated
     */
    @Deprecated
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
     * @param Error <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
     * @deprecated
     */
    @Deprecated
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p> 
     * @return TaskErrInfo <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
     */
    public TaskErrInfo getTaskErrInfo() {
        return this.TaskErrInfo;
    }

    /**
     * Set <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
     * @param TaskErrInfo <p>文档解析任务失败错误信息，当文档解析任务失败会返回具体的错误信息</p>
     */
    public void setTaskErrInfo(TaskErrInfo TaskErrInfo) {
        this.TaskErrInfo = TaskErrInfo;
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
        if (source.Usage != null) {
            this.Usage = new DocumentUsage(source.Usage);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.TaskErrInfo != null) {
            this.TaskErrInfo = new TaskErrInfo(source.TaskErrInfo);
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
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamObj(map, prefix + "TaskErrInfo.", this.TaskErrInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

