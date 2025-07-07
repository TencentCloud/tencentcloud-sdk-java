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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadCertificateResponse extends AbstractModel {

    /**
    * ZIP base64 编码内容，base64 解码后可保存为 ZIP 文件。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * MIME 类型：application/zip = ZIP 压缩文件。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ZIP base64 编码内容，base64 解码后可保存为 ZIP 文件。 
     * @return Content ZIP base64 编码内容，base64 解码后可保存为 ZIP 文件。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set ZIP base64 编码内容，base64 解码后可保存为 ZIP 文件。
     * @param Content ZIP base64 编码内容，base64 解码后可保存为 ZIP 文件。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get MIME 类型：application/zip = ZIP 压缩文件。 
     * @return ContentType MIME 类型：application/zip = ZIP 压缩文件。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set MIME 类型：application/zip = ZIP 压缩文件。
     * @param ContentType MIME 类型：application/zip = ZIP 压缩文件。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
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

    public DownloadCertificateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadCertificateResponse(DownloadCertificateResponse source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

