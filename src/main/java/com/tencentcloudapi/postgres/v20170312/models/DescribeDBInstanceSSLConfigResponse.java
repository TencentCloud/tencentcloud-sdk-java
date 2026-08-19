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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceSSLConfigResponse extends AbstractModel {

    /**
    * <p>true 代表开通 ，false 代表未开通</p>
    */
    @SerializedName("SSLEnabled")
    @Expose
    private Boolean SSLEnabled;

    /**
    * <p>云端根证书下载链接</p>
    */
    @SerializedName("CAUrl")
    @Expose
    private String CAUrl;

    /**
    * <p>服务器证书中配置的内网或外网连接地址</p>
    */
    @SerializedName("ConnectAddress")
    @Expose
    private String ConnectAddress;

    /**
    * <p>CA证书公钥，仅云盘版</p>
    */
    @SerializedName("CACert")
    @Expose
    private String CACert;

    /**
    * <p>JKS公钥，仅云盘版</p>
    */
    @SerializedName("CAJKS")
    @Expose
    private String CAJKS;

    /**
    * <p>CAP7B公钥，仅云盘版</p>
    */
    @SerializedName("CAP7B")
    @Expose
    private String CAP7B;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>true 代表开通 ，false 代表未开通</p> 
     * @return SSLEnabled <p>true 代表开通 ，false 代表未开通</p>
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * Set <p>true 代表开通 ，false 代表未开通</p>
     * @param SSLEnabled <p>true 代表开通 ，false 代表未开通</p>
     */
    public void setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
    }

    /**
     * Get <p>云端根证书下载链接</p> 
     * @return CAUrl <p>云端根证书下载链接</p>
     */
    public String getCAUrl() {
        return this.CAUrl;
    }

    /**
     * Set <p>云端根证书下载链接</p>
     * @param CAUrl <p>云端根证书下载链接</p>
     */
    public void setCAUrl(String CAUrl) {
        this.CAUrl = CAUrl;
    }

    /**
     * Get <p>服务器证书中配置的内网或外网连接地址</p> 
     * @return ConnectAddress <p>服务器证书中配置的内网或外网连接地址</p>
     */
    public String getConnectAddress() {
        return this.ConnectAddress;
    }

    /**
     * Set <p>服务器证书中配置的内网或外网连接地址</p>
     * @param ConnectAddress <p>服务器证书中配置的内网或外网连接地址</p>
     */
    public void setConnectAddress(String ConnectAddress) {
        this.ConnectAddress = ConnectAddress;
    }

    /**
     * Get <p>CA证书公钥，仅云盘版</p> 
     * @return CACert <p>CA证书公钥，仅云盘版</p>
     */
    public String getCACert() {
        return this.CACert;
    }

    /**
     * Set <p>CA证书公钥，仅云盘版</p>
     * @param CACert <p>CA证书公钥，仅云盘版</p>
     */
    public void setCACert(String CACert) {
        this.CACert = CACert;
    }

    /**
     * Get <p>JKS公钥，仅云盘版</p> 
     * @return CAJKS <p>JKS公钥，仅云盘版</p>
     */
    public String getCAJKS() {
        return this.CAJKS;
    }

    /**
     * Set <p>JKS公钥，仅云盘版</p>
     * @param CAJKS <p>JKS公钥，仅云盘版</p>
     */
    public void setCAJKS(String CAJKS) {
        this.CAJKS = CAJKS;
    }

    /**
     * Get <p>CAP7B公钥，仅云盘版</p> 
     * @return CAP7B <p>CAP7B公钥，仅云盘版</p>
     */
    public String getCAP7B() {
        return this.CAP7B;
    }

    /**
     * Set <p>CAP7B公钥，仅云盘版</p>
     * @param CAP7B <p>CAP7B公钥，仅云盘版</p>
     */
    public void setCAP7B(String CAP7B) {
        this.CAP7B = CAP7B;
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

    public DescribeDBInstanceSSLConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceSSLConfigResponse(DescribeDBInstanceSSLConfigResponse source) {
        if (source.SSLEnabled != null) {
            this.SSLEnabled = new Boolean(source.SSLEnabled);
        }
        if (source.CAUrl != null) {
            this.CAUrl = new String(source.CAUrl);
        }
        if (source.ConnectAddress != null) {
            this.ConnectAddress = new String(source.ConnectAddress);
        }
        if (source.CACert != null) {
            this.CACert = new String(source.CACert);
        }
        if (source.CAJKS != null) {
            this.CAJKS = new String(source.CAJKS);
        }
        if (source.CAP7B != null) {
            this.CAP7B = new String(source.CAP7B);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLEnabled", this.SSLEnabled);
        this.setParamSimple(map, prefix + "CAUrl", this.CAUrl);
        this.setParamSimple(map, prefix + "ConnectAddress", this.ConnectAddress);
        this.setParamSimple(map, prefix + "CACert", this.CACert);
        this.setParamSimple(map, prefix + "CAJKS", this.CAJKS);
        this.setParamSimple(map, prefix + "CAP7B", this.CAP7B);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

