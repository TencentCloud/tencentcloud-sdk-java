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

public class DescribeAssetOverviewResponse extends AbstractModel {

    /**
    * 资产概览统计
    */
    @SerializedName("AssetOverview")
    @Expose
    private AssetStatisticsInfo AssetOverview;

    /**
    * 云厂商资产数量
    */
    @SerializedName("AssetProviderDistribute")
    @Expose
    private AssetProviderDistributeInfo AssetProviderDistribute;

    /**
    * 资产类型以及存在风险的资产类型数量
    */
    @SerializedName("AssetTypeOverview")
    @Expose
    private AssetTypeStatisticsInfo AssetTypeOverview;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产概览统计 
     * @return AssetOverview 资产概览统计
     */
    public AssetStatisticsInfo getAssetOverview() {
        return this.AssetOverview;
    }

    /**
     * Set 资产概览统计
     * @param AssetOverview 资产概览统计
     */
    public void setAssetOverview(AssetStatisticsInfo AssetOverview) {
        this.AssetOverview = AssetOverview;
    }

    /**
     * Get 云厂商资产数量 
     * @return AssetProviderDistribute 云厂商资产数量
     */
    public AssetProviderDistributeInfo getAssetProviderDistribute() {
        return this.AssetProviderDistribute;
    }

    /**
     * Set 云厂商资产数量
     * @param AssetProviderDistribute 云厂商资产数量
     */
    public void setAssetProviderDistribute(AssetProviderDistributeInfo AssetProviderDistribute) {
        this.AssetProviderDistribute = AssetProviderDistribute;
    }

    /**
     * Get 资产类型以及存在风险的资产类型数量 
     * @return AssetTypeOverview 资产类型以及存在风险的资产类型数量
     */
    public AssetTypeStatisticsInfo getAssetTypeOverview() {
        return this.AssetTypeOverview;
    }

    /**
     * Set 资产类型以及存在风险的资产类型数量
     * @param AssetTypeOverview 资产类型以及存在风险的资产类型数量
     */
    public void setAssetTypeOverview(AssetTypeStatisticsInfo AssetTypeOverview) {
        this.AssetTypeOverview = AssetTypeOverview;
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

    public DescribeAssetOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetOverviewResponse(DescribeAssetOverviewResponse source) {
        if (source.AssetOverview != null) {
            this.AssetOverview = new AssetStatisticsInfo(source.AssetOverview);
        }
        if (source.AssetProviderDistribute != null) {
            this.AssetProviderDistribute = new AssetProviderDistributeInfo(source.AssetProviderDistribute);
        }
        if (source.AssetTypeOverview != null) {
            this.AssetTypeOverview = new AssetTypeStatisticsInfo(source.AssetTypeOverview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AssetOverview.", this.AssetOverview);
        this.setParamObj(map, prefix + "AssetProviderDistribute.", this.AssetProviderDistribute);
        this.setParamObj(map, prefix + "AssetTypeOverview.", this.AssetTypeOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

