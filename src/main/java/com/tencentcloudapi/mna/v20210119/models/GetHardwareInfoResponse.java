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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetHardwareInfoResponse extends AbstractModel {

    /**
    * license授权有效期 
0：月度授权 
1：永久授权 
-1：未知
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * 付费方 0：客户付费 1：厂商付费
    */
    @SerializedName("Payer")
    @Expose
    private Long Payer;

    /**
    * 硬件序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 厂商名称
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get license授权有效期 
0：月度授权 
1：永久授权 
-1：未知 
     * @return LicensePayMode license授权有效期 
0：月度授权 
1：永久授权 
-1：未知
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set license授权有效期 
0：月度授权 
1：永久授权 
-1：未知
     * @param LicensePayMode license授权有效期 
0：月度授权 
1：永久授权 
-1：未知
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get 付费方 0：客户付费 1：厂商付费 
     * @return Payer 付费方 0：客户付费 1：厂商付费
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set 付费方 0：客户付费 1：厂商付费
     * @param Payer 付费方 0：客户付费 1：厂商付费
     */
    public void setPayer(Long Payer) {
        this.Payer = Payer;
    }

    /**
     * Get 硬件序列号 
     * @return SN 硬件序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 硬件序列号
     * @param SN 硬件序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 厂商名称 
     * @return Vendor 厂商名称
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 厂商名称
     * @param Vendor 厂商名称
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
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

    public GetHardwareInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetHardwareInfoResponse(GetHardwareInfoResponse source) {
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
        }
        if (source.Payer != null) {
            this.Payer = new Long(source.Payer);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

