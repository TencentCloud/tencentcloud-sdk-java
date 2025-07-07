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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSREInstanceAccessAddressResponse extends AbstractModel {

    /**
    * 内网访问地址
    */
    @SerializedName("IntranetAddress")
    @Expose
    private String IntranetAddress;

    /**
    * 公网访问地址
    */
    @SerializedName("InternetAddress")
    @Expose
    private String InternetAddress;

    /**
    * apollo多环境公网ip
    */
    @SerializedName("EnvAddressInfos")
    @Expose
    private EnvAddressInfo [] EnvAddressInfos;

    /**
    * 控制台公网访问地址
    */
    @SerializedName("ConsoleInternetAddress")
    @Expose
    private String ConsoleInternetAddress;

    /**
    * 控制台内网访问地址
    */
    @SerializedName("ConsoleIntranetAddress")
    @Expose
    private String ConsoleIntranetAddress;

    /**
    * 客户端公网带宽
    */
    @SerializedName("InternetBandWidth")
    @Expose
    private Long InternetBandWidth;

    /**
    * 控制台公网带宽
    */
    @SerializedName("ConsoleInternetBandWidth")
    @Expose
    private Long ConsoleInternetBandWidth;

    /**
    * 北极星限流server节点接入IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimiterAddressInfos")
    @Expose
    private PolarisLimiterAddress [] LimiterAddressInfos;

    /**
    * InternetAddress 的公网 CLB 多可用区信息
    */
    @SerializedName("CLBMultiRegion")
    @Expose
    private CLBMultiRegion CLBMultiRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 内网访问地址 
     * @return IntranetAddress 内网访问地址
     */
    public String getIntranetAddress() {
        return this.IntranetAddress;
    }

    /**
     * Set 内网访问地址
     * @param IntranetAddress 内网访问地址
     */
    public void setIntranetAddress(String IntranetAddress) {
        this.IntranetAddress = IntranetAddress;
    }

    /**
     * Get 公网访问地址 
     * @return InternetAddress 公网访问地址
     */
    public String getInternetAddress() {
        return this.InternetAddress;
    }

    /**
     * Set 公网访问地址
     * @param InternetAddress 公网访问地址
     */
    public void setInternetAddress(String InternetAddress) {
        this.InternetAddress = InternetAddress;
    }

    /**
     * Get apollo多环境公网ip 
     * @return EnvAddressInfos apollo多环境公网ip
     */
    public EnvAddressInfo [] getEnvAddressInfos() {
        return this.EnvAddressInfos;
    }

    /**
     * Set apollo多环境公网ip
     * @param EnvAddressInfos apollo多环境公网ip
     */
    public void setEnvAddressInfos(EnvAddressInfo [] EnvAddressInfos) {
        this.EnvAddressInfos = EnvAddressInfos;
    }

    /**
     * Get 控制台公网访问地址 
     * @return ConsoleInternetAddress 控制台公网访问地址
     */
    public String getConsoleInternetAddress() {
        return this.ConsoleInternetAddress;
    }

    /**
     * Set 控制台公网访问地址
     * @param ConsoleInternetAddress 控制台公网访问地址
     */
    public void setConsoleInternetAddress(String ConsoleInternetAddress) {
        this.ConsoleInternetAddress = ConsoleInternetAddress;
    }

    /**
     * Get 控制台内网访问地址 
     * @return ConsoleIntranetAddress 控制台内网访问地址
     */
    public String getConsoleIntranetAddress() {
        return this.ConsoleIntranetAddress;
    }

    /**
     * Set 控制台内网访问地址
     * @param ConsoleIntranetAddress 控制台内网访问地址
     */
    public void setConsoleIntranetAddress(String ConsoleIntranetAddress) {
        this.ConsoleIntranetAddress = ConsoleIntranetAddress;
    }

    /**
     * Get 客户端公网带宽 
     * @return InternetBandWidth 客户端公网带宽
     */
    public Long getInternetBandWidth() {
        return this.InternetBandWidth;
    }

    /**
     * Set 客户端公网带宽
     * @param InternetBandWidth 客户端公网带宽
     */
    public void setInternetBandWidth(Long InternetBandWidth) {
        this.InternetBandWidth = InternetBandWidth;
    }

    /**
     * Get 控制台公网带宽 
     * @return ConsoleInternetBandWidth 控制台公网带宽
     */
    public Long getConsoleInternetBandWidth() {
        return this.ConsoleInternetBandWidth;
    }

    /**
     * Set 控制台公网带宽
     * @param ConsoleInternetBandWidth 控制台公网带宽
     */
    public void setConsoleInternetBandWidth(Long ConsoleInternetBandWidth) {
        this.ConsoleInternetBandWidth = ConsoleInternetBandWidth;
    }

    /**
     * Get 北极星限流server节点接入IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimiterAddressInfos 北极星限流server节点接入IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolarisLimiterAddress [] getLimiterAddressInfos() {
        return this.LimiterAddressInfos;
    }

    /**
     * Set 北极星限流server节点接入IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimiterAddressInfos 北极星限流server节点接入IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimiterAddressInfos(PolarisLimiterAddress [] LimiterAddressInfos) {
        this.LimiterAddressInfos = LimiterAddressInfos;
    }

    /**
     * Get InternetAddress 的公网 CLB 多可用区信息 
     * @return CLBMultiRegion InternetAddress 的公网 CLB 多可用区信息
     */
    public CLBMultiRegion getCLBMultiRegion() {
        return this.CLBMultiRegion;
    }

    /**
     * Set InternetAddress 的公网 CLB 多可用区信息
     * @param CLBMultiRegion InternetAddress 的公网 CLB 多可用区信息
     */
    public void setCLBMultiRegion(CLBMultiRegion CLBMultiRegion) {
        this.CLBMultiRegion = CLBMultiRegion;
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

    public DescribeSREInstanceAccessAddressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSREInstanceAccessAddressResponse(DescribeSREInstanceAccessAddressResponse source) {
        if (source.IntranetAddress != null) {
            this.IntranetAddress = new String(source.IntranetAddress);
        }
        if (source.InternetAddress != null) {
            this.InternetAddress = new String(source.InternetAddress);
        }
        if (source.EnvAddressInfos != null) {
            this.EnvAddressInfos = new EnvAddressInfo[source.EnvAddressInfos.length];
            for (int i = 0; i < source.EnvAddressInfos.length; i++) {
                this.EnvAddressInfos[i] = new EnvAddressInfo(source.EnvAddressInfos[i]);
            }
        }
        if (source.ConsoleInternetAddress != null) {
            this.ConsoleInternetAddress = new String(source.ConsoleInternetAddress);
        }
        if (source.ConsoleIntranetAddress != null) {
            this.ConsoleIntranetAddress = new String(source.ConsoleIntranetAddress);
        }
        if (source.InternetBandWidth != null) {
            this.InternetBandWidth = new Long(source.InternetBandWidth);
        }
        if (source.ConsoleInternetBandWidth != null) {
            this.ConsoleInternetBandWidth = new Long(source.ConsoleInternetBandWidth);
        }
        if (source.LimiterAddressInfos != null) {
            this.LimiterAddressInfos = new PolarisLimiterAddress[source.LimiterAddressInfos.length];
            for (int i = 0; i < source.LimiterAddressInfos.length; i++) {
                this.LimiterAddressInfos[i] = new PolarisLimiterAddress(source.LimiterAddressInfos[i]);
            }
        }
        if (source.CLBMultiRegion != null) {
            this.CLBMultiRegion = new CLBMultiRegion(source.CLBMultiRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntranetAddress", this.IntranetAddress);
        this.setParamSimple(map, prefix + "InternetAddress", this.InternetAddress);
        this.setParamArrayObj(map, prefix + "EnvAddressInfos.", this.EnvAddressInfos);
        this.setParamSimple(map, prefix + "ConsoleInternetAddress", this.ConsoleInternetAddress);
        this.setParamSimple(map, prefix + "ConsoleIntranetAddress", this.ConsoleIntranetAddress);
        this.setParamSimple(map, prefix + "InternetBandWidth", this.InternetBandWidth);
        this.setParamSimple(map, prefix + "ConsoleInternetBandWidth", this.ConsoleInternetBandWidth);
        this.setParamArrayObj(map, prefix + "LimiterAddressInfos.", this.LimiterAddressInfos);
        this.setParamObj(map, prefix + "CLBMultiRegion.", this.CLBMultiRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

