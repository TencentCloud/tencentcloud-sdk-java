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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseWhiteConfigResponse extends AbstractModel {

    /**
    * 旗舰版 配置信息
    */
    @SerializedName("FlagShip")
    @Expose
    private VersionWhiteConfig FlagShip;

    /**
    * 专业版 配置信息
    */
    @SerializedName("Professional")
    @Expose
    private VersionWhiteConfig Professional;

    /**
    * 轻量版 配置信息
    */
    @SerializedName("PrattWhitney")
    @Expose
    private VersionWhiteConfig PrattWhitney;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 旗舰版 配置信息 
     * @return FlagShip 旗舰版 配置信息
     */
    public VersionWhiteConfig getFlagShip() {
        return this.FlagShip;
    }

    /**
     * Set 旗舰版 配置信息
     * @param FlagShip 旗舰版 配置信息
     */
    public void setFlagShip(VersionWhiteConfig FlagShip) {
        this.FlagShip = FlagShip;
    }

    /**
     * Get 专业版 配置信息 
     * @return Professional 专业版 配置信息
     */
    public VersionWhiteConfig getProfessional() {
        return this.Professional;
    }

    /**
     * Set 专业版 配置信息
     * @param Professional 专业版 配置信息
     */
    public void setProfessional(VersionWhiteConfig Professional) {
        this.Professional = Professional;
    }

    /**
     * Get 轻量版 配置信息 
     * @return PrattWhitney 轻量版 配置信息
     */
    public VersionWhiteConfig getPrattWhitney() {
        return this.PrattWhitney;
    }

    /**
     * Set 轻量版 配置信息
     * @param PrattWhitney 轻量版 配置信息
     */
    public void setPrattWhitney(VersionWhiteConfig PrattWhitney) {
        this.PrattWhitney = PrattWhitney;
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

    public DescribeLicenseWhiteConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseWhiteConfigResponse(DescribeLicenseWhiteConfigResponse source) {
        if (source.FlagShip != null) {
            this.FlagShip = new VersionWhiteConfig(source.FlagShip);
        }
        if (source.Professional != null) {
            this.Professional = new VersionWhiteConfig(source.Professional);
        }
        if (source.PrattWhitney != null) {
            this.PrattWhitney = new VersionWhiteConfig(source.PrattWhitney);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FlagShip.", this.FlagShip);
        this.setParamObj(map, prefix + "Professional.", this.Professional);
        this.setParamObj(map, prefix + "PrattWhitney.", this.PrattWhitney);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

