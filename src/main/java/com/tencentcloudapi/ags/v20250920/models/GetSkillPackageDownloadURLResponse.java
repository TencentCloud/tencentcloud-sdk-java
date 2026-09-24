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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSkillPackageDownloadURLResponse extends AbstractModel {

    /**
    * <p>COS GET 预签名 URL；带 response-content-disposition；默认 TTL 5 分钟；bearer 凭证禁止持久化。</p>
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
    * <p>URL 过期时间。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>服务端记录的 SHA-256；下载后应本地自检。</p>
    */
    @SerializedName("SHA256")
    @Expose
    private String SHA256;

    /**
    * <p>解析出的 Version ID（Stable Version）。</p>
    */
    @SerializedName("ResolvedVersionId")
    @Expose
    private String ResolvedVersionId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>COS GET 预签名 URL；带 response-content-disposition；默认 TTL 5 分钟；bearer 凭证禁止持久化。</p> 
     * @return DownloadURL <p>COS GET 预签名 URL；带 response-content-disposition；默认 TTL 5 分钟；bearer 凭证禁止持久化。</p>
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set <p>COS GET 预签名 URL；带 response-content-disposition；默认 TTL 5 分钟；bearer 凭证禁止持久化。</p>
     * @param DownloadURL <p>COS GET 预签名 URL；带 response-content-disposition；默认 TTL 5 分钟；bearer 凭证禁止持久化。</p>
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    /**
     * Get <p>URL 过期时间。</p> 
     * @return ExpireTime <p>URL 过期时间。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>URL 过期时间。</p>
     * @param ExpireTime <p>URL 过期时间。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>服务端记录的 SHA-256；下载后应本地自检。</p> 
     * @return SHA256 <p>服务端记录的 SHA-256；下载后应本地自检。</p>
     */
    public String getSHA256() {
        return this.SHA256;
    }

    /**
     * Set <p>服务端记录的 SHA-256；下载后应本地自检。</p>
     * @param SHA256 <p>服务端记录的 SHA-256；下载后应本地自检。</p>
     */
    public void setSHA256(String SHA256) {
        this.SHA256 = SHA256;
    }

    /**
     * Get <p>解析出的 Version ID（Stable Version）。</p> 
     * @return ResolvedVersionId <p>解析出的 Version ID（Stable Version）。</p>
     */
    public String getResolvedVersionId() {
        return this.ResolvedVersionId;
    }

    /**
     * Set <p>解析出的 Version ID（Stable Version）。</p>
     * @param ResolvedVersionId <p>解析出的 Version ID（Stable Version）。</p>
     */
    public void setResolvedVersionId(String ResolvedVersionId) {
        this.ResolvedVersionId = ResolvedVersionId;
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

    public GetSkillPackageDownloadURLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSkillPackageDownloadURLResponse(GetSkillPackageDownloadURLResponse source) {
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SHA256 != null) {
            this.SHA256 = new String(source.SHA256);
        }
        if (source.ResolvedVersionId != null) {
            this.ResolvedVersionId = new String(source.ResolvedVersionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadURL", this.DownloadURL);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SHA256", this.SHA256);
        this.setParamSimple(map, prefix + "ResolvedVersionId", this.ResolvedVersionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

