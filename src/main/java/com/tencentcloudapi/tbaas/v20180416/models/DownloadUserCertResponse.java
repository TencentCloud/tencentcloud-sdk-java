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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadUserCertResponse extends AbstractModel {

    /**
    * 证书名称
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 证书内容
    */
    @SerializedName("CertCtx")
    @Expose
    private String CertCtx;

    /**
    * 证书内容
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 证书名称 
     * @return CertName 证书名称
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 证书名称
     * @param CertName 证书名称
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 证书内容 
     * @return CertCtx 证书内容
     * @deprecated
     */
    @Deprecated
    public String getCertCtx() {
        return this.CertCtx;
    }

    /**
     * Set 证书内容
     * @param CertCtx 证书内容
     * @deprecated
     */
    @Deprecated
    public void setCertCtx(String CertCtx) {
        this.CertCtx = CertCtx;
    }

    /**
     * Get 证书内容 
     * @return Cert 证书内容
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书内容
     * @param Cert 证书内容
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
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

    public DownloadUserCertResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadUserCertResponse(DownloadUserCertResponse source) {
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertCtx != null) {
            this.CertCtx = new String(source.CertCtx);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertCtx", this.CertCtx);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

