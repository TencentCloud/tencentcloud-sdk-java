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

public class SubmitQuestionSplitJobResponse extends AbstractModel {

    /**
    * <p>任务唯一ID。由服务端生成。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>PDF 转完之后的图片压缩包列表地址。</p>
    */
    @SerializedName("ImageZipUrl")
    @Expose
    private String ImageZipUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务唯一ID。由服务端生成。</p> 
     * @return JobId <p>任务唯一ID。由服务端生成。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务唯一ID。由服务端生成。</p>
     * @param JobId <p>任务唯一ID。由服务端生成。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>PDF 转完之后的图片压缩包列表地址。</p> 
     * @return ImageZipUrl <p>PDF 转完之后的图片压缩包列表地址。</p>
     */
    public String getImageZipUrl() {
        return this.ImageZipUrl;
    }

    /**
     * Set <p>PDF 转完之后的图片压缩包列表地址。</p>
     * @param ImageZipUrl <p>PDF 转完之后的图片压缩包列表地址。</p>
     */
    public void setImageZipUrl(String ImageZipUrl) {
        this.ImageZipUrl = ImageZipUrl;
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

    public SubmitQuestionSplitJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitQuestionSplitJobResponse(SubmitQuestionSplitJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ImageZipUrl != null) {
            this.ImageZipUrl = new String(source.ImageZipUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ImageZipUrl", this.ImageZipUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

