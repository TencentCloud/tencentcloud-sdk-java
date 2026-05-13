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

public class DescribeDspmStatisticsResponse extends AbstractModel {

    /**
    * 资产统计信息
    */
    @SerializedName("AssetCount")
    @Expose
    private DspmAssetCount AssetCount;

    /**
    * 访问Ip统计信息
    */
    @SerializedName("IpCount")
    @Expose
    private DspmIpCount IpCount;

    /**
    * 用户账号统计信息
    */
    @SerializedName("UserCount")
    @Expose
    private DspmAccountCount UserCount;

    /**
    * 风险统计信息
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * 资产安全分析统计信息
    */
    @SerializedName("AnalyseAssetStatusCount")
    @Expose
    private DspmSecurityAnalyseStatusCount AnalyseAssetStatusCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产统计信息 
     * @return AssetCount 资产统计信息
     */
    public DspmAssetCount getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 资产统计信息
     * @param AssetCount 资产统计信息
     */
    public void setAssetCount(DspmAssetCount AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 访问Ip统计信息 
     * @return IpCount 访问Ip统计信息
     */
    public DspmIpCount getIpCount() {
        return this.IpCount;
    }

    /**
     * Set 访问Ip统计信息
     * @param IpCount 访问Ip统计信息
     */
    public void setIpCount(DspmIpCount IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get 用户账号统计信息 
     * @return UserCount 用户账号统计信息
     */
    public DspmAccountCount getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 用户账号统计信息
     * @param UserCount 用户账号统计信息
     */
    public void setUserCount(DspmAccountCount UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get 风险统计信息 
     * @return RiskCount 风险统计信息
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险统计信息
     * @param RiskCount 风险统计信息
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 资产安全分析统计信息 
     * @return AnalyseAssetStatusCount 资产安全分析统计信息
     */
    public DspmSecurityAnalyseStatusCount getAnalyseAssetStatusCount() {
        return this.AnalyseAssetStatusCount;
    }

    /**
     * Set 资产安全分析统计信息
     * @param AnalyseAssetStatusCount 资产安全分析统计信息
     */
    public void setAnalyseAssetStatusCount(DspmSecurityAnalyseStatusCount AnalyseAssetStatusCount) {
        this.AnalyseAssetStatusCount = AnalyseAssetStatusCount;
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

    public DescribeDspmStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmStatisticsResponse(DescribeDspmStatisticsResponse source) {
        if (source.AssetCount != null) {
            this.AssetCount = new DspmAssetCount(source.AssetCount);
        }
        if (source.IpCount != null) {
            this.IpCount = new DspmIpCount(source.IpCount);
        }
        if (source.UserCount != null) {
            this.UserCount = new DspmAccountCount(source.UserCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.AnalyseAssetStatusCount != null) {
            this.AnalyseAssetStatusCount = new DspmSecurityAnalyseStatusCount(source.AnalyseAssetStatusCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AssetCount.", this.AssetCount);
        this.setParamObj(map, prefix + "IpCount.", this.IpCount);
        this.setParamObj(map, prefix + "UserCount.", this.UserCount);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamObj(map, prefix + "AnalyseAssetStatusCount.", this.AnalyseAssetStatusCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

