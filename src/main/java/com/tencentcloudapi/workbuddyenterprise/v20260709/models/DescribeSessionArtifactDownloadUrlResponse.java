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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionArtifactDownloadUrlResponse extends AbstractModel {

    /**
    * <p>产物下载地址</p>
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * <p>产物过期时间</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>产物对应文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>产物文件大小</p>
    */
    @SerializedName("FileSizeBytes")
    @Expose
    private Long FileSizeBytes;

    /**
    * <p>文件摘要</p>
    */
    @SerializedName("FileSha256")
    @Expose
    private String FileSha256;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>产物下载地址</p> 
     * @return DownloadUrl <p>产物下载地址</p>
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set <p>产物下载地址</p>
     * @param DownloadUrl <p>产物下载地址</p>
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get <p>产物过期时间</p> 
     * @return ExpiredTime <p>产物过期时间</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>产物过期时间</p>
     * @param ExpiredTime <p>产物过期时间</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>产物对应文件名</p> 
     * @return FileName <p>产物对应文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>产物对应文件名</p>
     * @param FileName <p>产物对应文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>产物文件大小</p> 
     * @return FileSizeBytes <p>产物文件大小</p>
     */
    public Long getFileSizeBytes() {
        return this.FileSizeBytes;
    }

    /**
     * Set <p>产物文件大小</p>
     * @param FileSizeBytes <p>产物文件大小</p>
     */
    public void setFileSizeBytes(Long FileSizeBytes) {
        this.FileSizeBytes = FileSizeBytes;
    }

    /**
     * Get <p>文件摘要</p> 
     * @return FileSha256 <p>文件摘要</p>
     */
    public String getFileSha256() {
        return this.FileSha256;
    }

    /**
     * Set <p>文件摘要</p>
     * @param FileSha256 <p>文件摘要</p>
     */
    public void setFileSha256(String FileSha256) {
        this.FileSha256 = FileSha256;
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

    public DescribeSessionArtifactDownloadUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionArtifactDownloadUrlResponse(DescribeSessionArtifactDownloadUrlResponse source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSizeBytes != null) {
            this.FileSizeBytes = new Long(source.FileSizeBytes);
        }
        if (source.FileSha256 != null) {
            this.FileSha256 = new String(source.FileSha256);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSizeBytes", this.FileSizeBytes);
        this.setParamSimple(map, prefix + "FileSha256", this.FileSha256);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

