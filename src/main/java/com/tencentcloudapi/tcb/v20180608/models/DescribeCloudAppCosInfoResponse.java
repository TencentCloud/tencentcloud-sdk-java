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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudAppCosInfoResponse extends AbstractModel {

    /**
    * 上传url
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * 上传header
    */
    @SerializedName("UploadHeaders")
    @Expose
    private KVPair [] UploadHeaders;

    /**
    * 下载链接
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 下载Httpheader
    */
    @SerializedName("DownloadHeaders")
    @Expose
    private KVPair [] DownloadHeaders;

    /**
    * 时间戳
    */
    @SerializedName("UnixTimestamp")
    @Expose
    private String UnixTimestamp;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上传url 
     * @return UploadUrl 上传url
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 上传url
     * @param UploadUrl 上传url
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get 上传header 
     * @return UploadHeaders 上传header
     */
    public KVPair [] getUploadHeaders() {
        return this.UploadHeaders;
    }

    /**
     * Set 上传header
     * @param UploadHeaders 上传header
     */
    public void setUploadHeaders(KVPair [] UploadHeaders) {
        this.UploadHeaders = UploadHeaders;
    }

    /**
     * Get 下载链接 
     * @return DownloadUrl 下载链接
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载链接
     * @param DownloadUrl 下载链接
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 下载Httpheader 
     * @return DownloadHeaders 下载Httpheader
     */
    public KVPair [] getDownloadHeaders() {
        return this.DownloadHeaders;
    }

    /**
     * Set 下载Httpheader
     * @param DownloadHeaders 下载Httpheader
     */
    public void setDownloadHeaders(KVPair [] DownloadHeaders) {
        this.DownloadHeaders = DownloadHeaders;
    }

    /**
     * Get 时间戳 
     * @return UnixTimestamp 时间戳
     */
    public String getUnixTimestamp() {
        return this.UnixTimestamp;
    }

    /**
     * Set 时间戳
     * @param UnixTimestamp 时间戳
     */
    public void setUnixTimestamp(String UnixTimestamp) {
        this.UnixTimestamp = UnixTimestamp;
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

    public DescribeCloudAppCosInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudAppCosInfoResponse(DescribeCloudAppCosInfoResponse source) {
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.UploadHeaders != null) {
            this.UploadHeaders = new KVPair[source.UploadHeaders.length];
            for (int i = 0; i < source.UploadHeaders.length; i++) {
                this.UploadHeaders[i] = new KVPair(source.UploadHeaders[i]);
            }
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.DownloadHeaders != null) {
            this.DownloadHeaders = new KVPair[source.DownloadHeaders.length];
            for (int i = 0; i < source.DownloadHeaders.length; i++) {
                this.DownloadHeaders[i] = new KVPair(source.DownloadHeaders[i]);
            }
        }
        if (source.UnixTimestamp != null) {
            this.UnixTimestamp = new String(source.UnixTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamArrayObj(map, prefix + "UploadHeaders.", this.UploadHeaders);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamArrayObj(map, prefix + "DownloadHeaders.", this.DownloadHeaders);
        this.setParamSimple(map, prefix + "UnixTimestamp", this.UnixTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

