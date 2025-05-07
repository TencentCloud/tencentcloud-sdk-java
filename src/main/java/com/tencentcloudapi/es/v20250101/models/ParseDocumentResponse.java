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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParseDocumentResponse extends SSEResponseModel {

    /**
    * 进度：0-100。
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    *  解析文件结果。
    */
    @SerializedName("DocumentParseResultUrl")
    @Expose
    private String DocumentParseResultUrl;

    /**
    * 失败页码。
    */
    @SerializedName("FailedPages")
    @Expose
    private Long [] FailedPages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 进度：0-100。 
     * @return Progress 进度：0-100。
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度：0-100。
     * @param Progress 进度：0-100。
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get  解析文件结果。 
     * @return DocumentParseResultUrl  解析文件结果。
     */
    public String getDocumentParseResultUrl() {
        return this.DocumentParseResultUrl;
    }

    /**
     * Set  解析文件结果。
     * @param DocumentParseResultUrl  解析文件结果。
     */
    public void setDocumentParseResultUrl(String DocumentParseResultUrl) {
        this.DocumentParseResultUrl = DocumentParseResultUrl;
    }

    /**
     * Get 失败页码。 
     * @return FailedPages 失败页码。
     */
    public Long [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set 失败页码。
     * @param FailedPages 失败页码。
     */
    public void setFailedPages(Long [] FailedPages) {
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

    public ParseDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseDocumentResponse(ParseDocumentResponse source) {
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.DocumentParseResultUrl != null) {
            this.DocumentParseResultUrl = new String(source.DocumentParseResultUrl);
        }
        if (source.FailedPages != null) {
            this.FailedPages = new Long[source.FailedPages.length];
            for (int i = 0; i < source.FailedPages.length; i++) {
                this.FailedPages[i] = new Long(source.FailedPages[i]);
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "DocumentParseResultUrl", this.DocumentParseResultUrl);
        this.setParamArraySimple(map, prefix + "FailedPages.", this.FailedPages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

