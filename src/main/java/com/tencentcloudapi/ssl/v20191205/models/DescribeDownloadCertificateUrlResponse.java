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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDownloadCertificateUrlResponse extends AbstractModel {

    /**
    * 下载链接
    */
    @SerializedName("DownloadCertificateUrl")
    @Expose
    private String DownloadCertificateUrl;

    /**
    * 下载文件的名称
    */
    @SerializedName("DownloadFilename")
    @Expose
    private String DownloadFilename;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下载链接 
     * @return DownloadCertificateUrl 下载链接
     */
    public String getDownloadCertificateUrl() {
        return this.DownloadCertificateUrl;
    }

    /**
     * Set 下载链接
     * @param DownloadCertificateUrl 下载链接
     */
    public void setDownloadCertificateUrl(String DownloadCertificateUrl) {
        this.DownloadCertificateUrl = DownloadCertificateUrl;
    }

    /**
     * Get 下载文件的名称 
     * @return DownloadFilename 下载文件的名称
     */
    public String getDownloadFilename() {
        return this.DownloadFilename;
    }

    /**
     * Set 下载文件的名称
     * @param DownloadFilename 下载文件的名称
     */
    public void setDownloadFilename(String DownloadFilename) {
        this.DownloadFilename = DownloadFilename;
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

    public DescribeDownloadCertificateUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDownloadCertificateUrlResponse(DescribeDownloadCertificateUrlResponse source) {
        if (source.DownloadCertificateUrl != null) {
            this.DownloadCertificateUrl = new String(source.DownloadCertificateUrl);
        }
        if (source.DownloadFilename != null) {
            this.DownloadFilename = new String(source.DownloadFilename);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadCertificateUrl", this.DownloadCertificateUrl);
        this.setParamSimple(map, prefix + "DownloadFilename", this.DownloadFilename);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

