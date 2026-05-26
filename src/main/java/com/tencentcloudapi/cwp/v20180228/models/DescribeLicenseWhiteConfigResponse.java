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
    * <p>旗舰版 配置信息</p>
    */
    @SerializedName("FlagShip")
    @Expose
    private VersionWhiteConfig FlagShip;

    /**
    * <p>专业版 配置信息</p>
    */
    @SerializedName("Professional")
    @Expose
    private VersionWhiteConfig Professional;

    /**
    * <p>轻量版 配置信息</p>
    */
    @SerializedName("PrattWhitney")
    @Expose
    private VersionWhiteConfig PrattWhitney;

    /**
    * <p>重保授权包 配置信息</p>
    */
    @SerializedName("RASP")
    @Expose
    private VersionWhiteConfig RASP;

    /**
    * <p>日志分析配置信息</p>
    */
    @SerializedName("LOG")
    @Expose
    private VersionWhiteConfig LOG;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>旗舰版 配置信息</p> 
     * @return FlagShip <p>旗舰版 配置信息</p>
     */
    public VersionWhiteConfig getFlagShip() {
        return this.FlagShip;
    }

    /**
     * Set <p>旗舰版 配置信息</p>
     * @param FlagShip <p>旗舰版 配置信息</p>
     */
    public void setFlagShip(VersionWhiteConfig FlagShip) {
        this.FlagShip = FlagShip;
    }

    /**
     * Get <p>专业版 配置信息</p> 
     * @return Professional <p>专业版 配置信息</p>
     */
    public VersionWhiteConfig getProfessional() {
        return this.Professional;
    }

    /**
     * Set <p>专业版 配置信息</p>
     * @param Professional <p>专业版 配置信息</p>
     */
    public void setProfessional(VersionWhiteConfig Professional) {
        this.Professional = Professional;
    }

    /**
     * Get <p>轻量版 配置信息</p> 
     * @return PrattWhitney <p>轻量版 配置信息</p>
     */
    public VersionWhiteConfig getPrattWhitney() {
        return this.PrattWhitney;
    }

    /**
     * Set <p>轻量版 配置信息</p>
     * @param PrattWhitney <p>轻量版 配置信息</p>
     */
    public void setPrattWhitney(VersionWhiteConfig PrattWhitney) {
        this.PrattWhitney = PrattWhitney;
    }

    /**
     * Get <p>重保授权包 配置信息</p> 
     * @return RASP <p>重保授权包 配置信息</p>
     */
    public VersionWhiteConfig getRASP() {
        return this.RASP;
    }

    /**
     * Set <p>重保授权包 配置信息</p>
     * @param RASP <p>重保授权包 配置信息</p>
     */
    public void setRASP(VersionWhiteConfig RASP) {
        this.RASP = RASP;
    }

    /**
     * Get <p>日志分析配置信息</p> 
     * @return LOG <p>日志分析配置信息</p>
     */
    public VersionWhiteConfig getLOG() {
        return this.LOG;
    }

    /**
     * Set <p>日志分析配置信息</p>
     * @param LOG <p>日志分析配置信息</p>
     */
    public void setLOG(VersionWhiteConfig LOG) {
        this.LOG = LOG;
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
        if (source.RASP != null) {
            this.RASP = new VersionWhiteConfig(source.RASP);
        }
        if (source.LOG != null) {
            this.LOG = new VersionWhiteConfig(source.LOG);
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
        this.setParamObj(map, prefix + "RASP.", this.RASP);
        this.setParamObj(map, prefix + "LOG.", this.LOG);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

