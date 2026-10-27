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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusResponse extends AbstractModel {

    /**
    * <p>yes-开启，no-关闭</p>
    */
    @SerializedName("IsOpenSSL")
    @Expose
    private String IsOpenSSL;

    /**
    * <p>证书下载地址</p>
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul>
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * <p>自定义证书详情，仅 CertType=custom 时有值。</p>
    */
    @SerializedName("CertDetail")
    @Expose
    private CertDetail CertDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>yes-开启，no-关闭</p> 
     * @return IsOpenSSL <p>yes-开启，no-关闭</p>
     */
    public String getIsOpenSSL() {
        return this.IsOpenSSL;
    }

    /**
     * Set <p>yes-开启，no-关闭</p>
     * @param IsOpenSSL <p>yes-开启，no-关闭</p>
     */
    public void setIsOpenSSL(String IsOpenSSL) {
        this.IsOpenSSL = IsOpenSSL;
    }

    /**
     * Get <p>证书下载地址</p> 
     * @return DownloadUrl <p>证书下载地址</p>
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set <p>证书下载地址</p>
     * @param DownloadUrl <p>证书下载地址</p>
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul> 
     * @return CertType <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul>
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul>
     * @param CertType <p>证书类型</p><p>枚举值：</p><ul><li>platform： 云端证书</li><li>custom： 自定义证书</li></ul>
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>自定义证书详情，仅 CertType=custom 时有值。</p> 
     * @return CertDetail <p>自定义证书详情，仅 CertType=custom 时有值。</p>
     */
    public CertDetail getCertDetail() {
        return this.CertDetail;
    }

    /**
     * Set <p>自定义证书详情，仅 CertType=custom 时有值。</p>
     * @param CertDetail <p>自定义证书详情，仅 CertType=custom 时有值。</p>
     */
    public void setCertDetail(CertDetail CertDetail) {
        this.CertDetail = CertDetail;
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

    public DescribeSSLStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSSLStatusResponse(DescribeSSLStatusResponse source) {
        if (source.IsOpenSSL != null) {
            this.IsOpenSSL = new String(source.IsOpenSSL);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.CertType != null) {
            this.CertType = new String(source.CertType);
        }
        if (source.CertDetail != null) {
            this.CertDetail = new CertDetail(source.CertDetail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsOpenSSL", this.IsOpenSSL);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamObj(map, prefix + "CertDetail.", this.CertDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

