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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCFWAssetStatisticsResponse extends AbstractModel {

    /**
    * 网络资产总数
    */
    @SerializedName("NetworkTotal")
    @Expose
    private Long NetworkTotal;

    /**
    * 资产clb数量
    */
    @SerializedName("ClbTotal")
    @Expose
    private Long ClbTotal;

    /**
    * nat数量
    */
    @SerializedName("NatTotal")
    @Expose
    private Long NatTotal;

    /**
    * 公网ip数量
    */
    @SerializedName("PublicAssetTotal")
    @Expose
    private Long PublicAssetTotal;

    /**
    * 主机数量
    */
    @SerializedName("CVMAssetTotal")
    @Expose
    private Long CVMAssetTotal;

    /**
    * 配置风险
    */
    @SerializedName("CFGTotal")
    @Expose
    private Long CFGTotal;

    /**
    * 端口风险
    */
    @SerializedName("PortTotal")
    @Expose
    private Long PortTotal;

    /**
    * 内容风险
    */
    @SerializedName("WebsiteTotal")
    @Expose
    private Long WebsiteTotal;

    /**
    * 风险服务暴露
    */
    @SerializedName("ServerTotal")
    @Expose
    private Long ServerTotal;

    /**
    * 弱口令风险
    */
    @SerializedName("WeakPasswordTotal")
    @Expose
    private Long WeakPasswordTotal;

    /**
    * 漏洞风险
    */
    @SerializedName("VULTotal")
    @Expose
    private Long VULTotal;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网络资产总数 
     * @return NetworkTotal 网络资产总数
     */
    public Long getNetworkTotal() {
        return this.NetworkTotal;
    }

    /**
     * Set 网络资产总数
     * @param NetworkTotal 网络资产总数
     */
    public void setNetworkTotal(Long NetworkTotal) {
        this.NetworkTotal = NetworkTotal;
    }

    /**
     * Get 资产clb数量 
     * @return ClbTotal 资产clb数量
     */
    public Long getClbTotal() {
        return this.ClbTotal;
    }

    /**
     * Set 资产clb数量
     * @param ClbTotal 资产clb数量
     */
    public void setClbTotal(Long ClbTotal) {
        this.ClbTotal = ClbTotal;
    }

    /**
     * Get nat数量 
     * @return NatTotal nat数量
     */
    public Long getNatTotal() {
        return this.NatTotal;
    }

    /**
     * Set nat数量
     * @param NatTotal nat数量
     */
    public void setNatTotal(Long NatTotal) {
        this.NatTotal = NatTotal;
    }

    /**
     * Get 公网ip数量 
     * @return PublicAssetTotal 公网ip数量
     */
    public Long getPublicAssetTotal() {
        return this.PublicAssetTotal;
    }

    /**
     * Set 公网ip数量
     * @param PublicAssetTotal 公网ip数量
     */
    public void setPublicAssetTotal(Long PublicAssetTotal) {
        this.PublicAssetTotal = PublicAssetTotal;
    }

    /**
     * Get 主机数量 
     * @return CVMAssetTotal 主机数量
     */
    public Long getCVMAssetTotal() {
        return this.CVMAssetTotal;
    }

    /**
     * Set 主机数量
     * @param CVMAssetTotal 主机数量
     */
    public void setCVMAssetTotal(Long CVMAssetTotal) {
        this.CVMAssetTotal = CVMAssetTotal;
    }

    /**
     * Get 配置风险 
     * @return CFGTotal 配置风险
     */
    public Long getCFGTotal() {
        return this.CFGTotal;
    }

    /**
     * Set 配置风险
     * @param CFGTotal 配置风险
     */
    public void setCFGTotal(Long CFGTotal) {
        this.CFGTotal = CFGTotal;
    }

    /**
     * Get 端口风险 
     * @return PortTotal 端口风险
     */
    public Long getPortTotal() {
        return this.PortTotal;
    }

    /**
     * Set 端口风险
     * @param PortTotal 端口风险
     */
    public void setPortTotal(Long PortTotal) {
        this.PortTotal = PortTotal;
    }

    /**
     * Get 内容风险 
     * @return WebsiteTotal 内容风险
     */
    public Long getWebsiteTotal() {
        return this.WebsiteTotal;
    }

    /**
     * Set 内容风险
     * @param WebsiteTotal 内容风险
     */
    public void setWebsiteTotal(Long WebsiteTotal) {
        this.WebsiteTotal = WebsiteTotal;
    }

    /**
     * Get 风险服务暴露 
     * @return ServerTotal 风险服务暴露
     */
    public Long getServerTotal() {
        return this.ServerTotal;
    }

    /**
     * Set 风险服务暴露
     * @param ServerTotal 风险服务暴露
     */
    public void setServerTotal(Long ServerTotal) {
        this.ServerTotal = ServerTotal;
    }

    /**
     * Get 弱口令风险 
     * @return WeakPasswordTotal 弱口令风险
     */
    public Long getWeakPasswordTotal() {
        return this.WeakPasswordTotal;
    }

    /**
     * Set 弱口令风险
     * @param WeakPasswordTotal 弱口令风险
     */
    public void setWeakPasswordTotal(Long WeakPasswordTotal) {
        this.WeakPasswordTotal = WeakPasswordTotal;
    }

    /**
     * Get 漏洞风险 
     * @return VULTotal 漏洞风险
     */
    public Long getVULTotal() {
        return this.VULTotal;
    }

    /**
     * Set 漏洞风险
     * @param VULTotal 漏洞风险
     */
    public void setVULTotal(Long VULTotal) {
        this.VULTotal = VULTotal;
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

    public DescribeCFWAssetStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCFWAssetStatisticsResponse(DescribeCFWAssetStatisticsResponse source) {
        if (source.NetworkTotal != null) {
            this.NetworkTotal = new Long(source.NetworkTotal);
        }
        if (source.ClbTotal != null) {
            this.ClbTotal = new Long(source.ClbTotal);
        }
        if (source.NatTotal != null) {
            this.NatTotal = new Long(source.NatTotal);
        }
        if (source.PublicAssetTotal != null) {
            this.PublicAssetTotal = new Long(source.PublicAssetTotal);
        }
        if (source.CVMAssetTotal != null) {
            this.CVMAssetTotal = new Long(source.CVMAssetTotal);
        }
        if (source.CFGTotal != null) {
            this.CFGTotal = new Long(source.CFGTotal);
        }
        if (source.PortTotal != null) {
            this.PortTotal = new Long(source.PortTotal);
        }
        if (source.WebsiteTotal != null) {
            this.WebsiteTotal = new Long(source.WebsiteTotal);
        }
        if (source.ServerTotal != null) {
            this.ServerTotal = new Long(source.ServerTotal);
        }
        if (source.WeakPasswordTotal != null) {
            this.WeakPasswordTotal = new Long(source.WeakPasswordTotal);
        }
        if (source.VULTotal != null) {
            this.VULTotal = new Long(source.VULTotal);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkTotal", this.NetworkTotal);
        this.setParamSimple(map, prefix + "ClbTotal", this.ClbTotal);
        this.setParamSimple(map, prefix + "NatTotal", this.NatTotal);
        this.setParamSimple(map, prefix + "PublicAssetTotal", this.PublicAssetTotal);
        this.setParamSimple(map, prefix + "CVMAssetTotal", this.CVMAssetTotal);
        this.setParamSimple(map, prefix + "CFGTotal", this.CFGTotal);
        this.setParamSimple(map, prefix + "PortTotal", this.PortTotal);
        this.setParamSimple(map, prefix + "WebsiteTotal", this.WebsiteTotal);
        this.setParamSimple(map, prefix + "ServerTotal", this.ServerTotal);
        this.setParamSimple(map, prefix + "WeakPasswordTotal", this.WeakPasswordTotal);
        this.setParamSimple(map, prefix + "VULTotal", this.VULTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

