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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMultimodalDocParseJobResponse extends AbstractModel {

    /**
    * <p>任务状态。取值：</p><ul><li>Created：已创建，等待处理</li><li>Processing：处理中</li><li>Success：成功</li><li>Failed：失败</li><li>Unknown：未知</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务执行错误码。当任务状态不为 Failed 时，该值为“”。</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>任务执行错误信息。当任务状态不为 Failed 时，该值为“”。</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>结果的临时下载地址。文件类型为 zip 压缩包，下载链接有效期 30 分钟。压缩包内包含 <em>.md、</em>.json 以及 images 文件夹。仅当任务状态为 Success 时返回该字段。</p>
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * <p>解析失败的页码列表。仅当任务状态为 Success 时返回该字段。</p>
    */
    @SerializedName("FailedPages")
    @Expose
    private ReconstructDocumentFailedPage [] FailedPages;

    /**
    * <p>解析成功页数。</p>
    */
    @SerializedName("SuccessPageNum")
    @Expose
    private Long SuccessPageNum;

    /**
    * <p>解析失败页数。</p>
    */
    @SerializedName("FailPageNum")
    @Expose
    private Long FailPageNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务状态。取值：</p><ul><li>Created：已创建，等待处理</li><li>Processing：处理中</li><li>Success：成功</li><li>Failed：失败</li><li>Unknown：未知</li></ul> 
     * @return Status <p>任务状态。取值：</p><ul><li>Created：已创建，等待处理</li><li>Processing：处理中</li><li>Success：成功</li><li>Failed：失败</li><li>Unknown：未知</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。取值：</p><ul><li>Created：已创建，等待处理</li><li>Processing：处理中</li><li>Success：成功</li><li>Failed：失败</li><li>Unknown：未知</li></ul>
     * @param Status <p>任务状态。取值：</p><ul><li>Created：已创建，等待处理</li><li>Processing：处理中</li><li>Success：成功</li><li>Failed：失败</li><li>Unknown：未知</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务执行错误码。当任务状态不为 Failed 时，该值为“”。</p> 
     * @return ErrorCode <p>任务执行错误码。当任务状态不为 Failed 时，该值为“”。</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>任务执行错误码。当任务状态不为 Failed 时，该值为“”。</p>
     * @param ErrorCode <p>任务执行错误码。当任务状态不为 Failed 时，该值为“”。</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>任务执行错误信息。当任务状态不为 Failed 时，该值为“”。</p> 
     * @return ErrorMessage <p>任务执行错误信息。当任务状态不为 Failed 时，该值为“”。</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>任务执行错误信息。当任务状态不为 Failed 时，该值为“”。</p>
     * @param ErrorMessage <p>任务执行错误信息。当任务状态不为 Failed 时，该值为“”。</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>结果的临时下载地址。文件类型为 zip 压缩包，下载链接有效期 30 分钟。压缩包内包含 <em>.md、</em>.json 以及 images 文件夹。仅当任务状态为 Success 时返回该字段。</p> 
     * @return ResultUrl <p>结果的临时下载地址。文件类型为 zip 压缩包，下载链接有效期 30 分钟。压缩包内包含 <em>.md、</em>.json 以及 images 文件夹。仅当任务状态为 Success 时返回该字段。</p>
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set <p>结果的临时下载地址。文件类型为 zip 压缩包，下载链接有效期 30 分钟。压缩包内包含 <em>.md、</em>.json 以及 images 文件夹。仅当任务状态为 Success 时返回该字段。</p>
     * @param ResultUrl <p>结果的临时下载地址。文件类型为 zip 压缩包，下载链接有效期 30 分钟。压缩包内包含 <em>.md、</em>.json 以及 images 文件夹。仅当任务状态为 Success 时返回该字段。</p>
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
    }

    /**
     * Get <p>解析失败的页码列表。仅当任务状态为 Success 时返回该字段。</p> 
     * @return FailedPages <p>解析失败的页码列表。仅当任务状态为 Success 时返回该字段。</p>
     */
    public ReconstructDocumentFailedPage [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set <p>解析失败的页码列表。仅当任务状态为 Success 时返回该字段。</p>
     * @param FailedPages <p>解析失败的页码列表。仅当任务状态为 Success 时返回该字段。</p>
     */
    public void setFailedPages(ReconstructDocumentFailedPage [] FailedPages) {
        this.FailedPages = FailedPages;
    }

    /**
     * Get <p>解析成功页数。</p> 
     * @return SuccessPageNum <p>解析成功页数。</p>
     */
    public Long getSuccessPageNum() {
        return this.SuccessPageNum;
    }

    /**
     * Set <p>解析成功页数。</p>
     * @param SuccessPageNum <p>解析成功页数。</p>
     */
    public void setSuccessPageNum(Long SuccessPageNum) {
        this.SuccessPageNum = SuccessPageNum;
    }

    /**
     * Get <p>解析失败页数。</p> 
     * @return FailPageNum <p>解析失败页数。</p>
     */
    public Long getFailPageNum() {
        return this.FailPageNum;
    }

    /**
     * Set <p>解析失败页数。</p>
     * @param FailPageNum <p>解析失败页数。</p>
     */
    public void setFailPageNum(Long FailPageNum) {
        this.FailPageNum = FailPageNum;
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

    public DescribeMultimodalDocParseJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMultimodalDocParseJobResponse(DescribeMultimodalDocParseJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.FailedPages != null) {
            this.FailedPages = new ReconstructDocumentFailedPage[source.FailedPages.length];
            for (int i = 0; i < source.FailedPages.length; i++) {
                this.FailedPages[i] = new ReconstructDocumentFailedPage(source.FailedPages[i]);
            }
        }
        if (source.SuccessPageNum != null) {
            this.SuccessPageNum = new Long(source.SuccessPageNum);
        }
        if (source.FailPageNum != null) {
            this.FailPageNum = new Long(source.FailPageNum);
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
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamArrayObj(map, prefix + "FailedPages.", this.FailedPages);
        this.setParamSimple(map, prefix + "SuccessPageNum", this.SuccessPageNum);
        this.setParamSimple(map, prefix + "FailPageNum", this.FailPageNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

