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

public class GetSplitDocumentResultResponse extends AbstractModel {

    /**
    * 任务状态。

- `Success`：执行完成
- `Processing`：执行中
- `Pause`: 暂停
- `Failed`：执行失败
- `WaitExecute`：等待执行
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 拆分结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含\*.md、\*.jsonl、\*mllm.json以及images文件夹。

> **jsonl** 结构说明：
- `page_content`:
 用于生成嵌入（embedding）库，以便于检索使用。该字段中的图片将使用占位符替换。
- `org_data`:
 表示与 page_content 对应的最小语义完整性块，用于问答模型的处理。
- `big_data`:
 表示与 page_content 对应的最大语义完整性块，也用于问答模型的处理。
    */
    @SerializedName("DocumentRecognizeResultUrl")
    @Expose
    private String DocumentRecognizeResultUrl;

    /**
    * 文档拆分失败的页码
    */
    @SerializedName("FailedPages")
    @Expose
    private SplitDocumentFailedPage [] FailedPages;

    /**
    * 文档拆分任务的用量
    */
    @SerializedName("Usage")
    @Expose
    private DocumentUsage Usage;

    /**
    * 文档拆分失败的错误信息，当拆分任务失败时返回该错误信息
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态。

- `Success`：执行完成
- `Processing`：执行中
- `Pause`: 暂停
- `Failed`：执行失败
- `WaitExecute`：等待执行 
     * @return Status 任务状态。

- `Success`：执行完成
- `Processing`：执行中
- `Pause`: 暂停
- `Failed`：执行失败
- `WaitExecute`：等待执行
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。

- `Success`：执行完成
- `Processing`：执行中
- `Pause`: 暂停
- `Failed`：执行失败
- `WaitExecute`：等待执行
     * @param Status 任务状态。

- `Success`：执行完成
- `Processing`：执行中
- `Pause`: 暂停
- `Failed`：执行失败
- `WaitExecute`：等待执行
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 拆分结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含\*.md、\*.jsonl、\*mllm.json以及images文件夹。

> **jsonl** 结构说明：
- `page_content`:
 用于生成嵌入（embedding）库，以便于检索使用。该字段中的图片将使用占位符替换。
- `org_data`:
 表示与 page_content 对应的最小语义完整性块，用于问答模型的处理。
- `big_data`:
 表示与 page_content 对应的最大语义完整性块，也用于问答模型的处理。 
     * @return DocumentRecognizeResultUrl 拆分结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含\*.md、\*.jsonl、\*mllm.json以及images文件夹。

> **jsonl** 结构说明：
- `page_content`:
 用于生成嵌入（embedding）库，以便于检索使用。该字段中的图片将使用占位符替换。
- `org_data`:
 表示与 page_content 对应的最小语义完整性块，用于问答模型的处理。
- `big_data`:
 表示与 page_content 对应的最大语义完整性块，也用于问答模型的处理。
     */
    public String getDocumentRecognizeResultUrl() {
        return this.DocumentRecognizeResultUrl;
    }

    /**
     * Set 拆分结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含\*.md、\*.jsonl、\*mllm.json以及images文件夹。

> **jsonl** 结构说明：
- `page_content`:
 用于生成嵌入（embedding）库，以便于检索使用。该字段中的图片将使用占位符替换。
- `org_data`:
 表示与 page_content 对应的最小语义完整性块，用于问答模型的处理。
- `big_data`:
 表示与 page_content 对应的最大语义完整性块，也用于问答模型的处理。
     * @param DocumentRecognizeResultUrl 拆分结果的临时下载地址。
文件类型为zip压缩包，下载链接有效期30分钟。
压缩包内包含\*.md、\*.jsonl、\*mllm.json以及images文件夹。

> **jsonl** 结构说明：
- `page_content`:
 用于生成嵌入（embedding）库，以便于检索使用。该字段中的图片将使用占位符替换。
- `org_data`:
 表示与 page_content 对应的最小语义完整性块，用于问答模型的处理。
- `big_data`:
 表示与 page_content 对应的最大语义完整性块，也用于问答模型的处理。
     */
    public void setDocumentRecognizeResultUrl(String DocumentRecognizeResultUrl) {
        this.DocumentRecognizeResultUrl = DocumentRecognizeResultUrl;
    }

    /**
     * Get 文档拆分失败的页码 
     * @return FailedPages 文档拆分失败的页码
     * @deprecated
     */
    @Deprecated
    public SplitDocumentFailedPage [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set 文档拆分失败的页码
     * @param FailedPages 文档拆分失败的页码
     * @deprecated
     */
    @Deprecated
    public void setFailedPages(SplitDocumentFailedPage [] FailedPages) {
        this.FailedPages = FailedPages;
    }

    /**
     * Get 文档拆分任务的用量 
     * @return Usage 文档拆分任务的用量
     */
    public DocumentUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set 文档拆分任务的用量
     * @param Usage 文档拆分任务的用量
     */
    public void setUsage(DocumentUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 文档拆分失败的错误信息，当拆分任务失败时返回该错误信息 
     * @return Error 文档拆分失败的错误信息，当拆分任务失败时返回该错误信息
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 文档拆分失败的错误信息，当拆分任务失败时返回该错误信息
     * @param Error 文档拆分失败的错误信息，当拆分任务失败时返回该错误信息
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
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

    public GetSplitDocumentResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSplitDocumentResultResponse(GetSplitDocumentResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DocumentRecognizeResultUrl != null) {
            this.DocumentRecognizeResultUrl = new String(source.DocumentRecognizeResultUrl);
        }
        if (source.FailedPages != null) {
            this.FailedPages = new SplitDocumentFailedPage[source.FailedPages.length];
            for (int i = 0; i < source.FailedPages.length; i++) {
                this.FailedPages[i] = new SplitDocumentFailedPage(source.FailedPages[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new DocumentUsage(source.Usage);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

