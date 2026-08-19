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

public class DescribeAssetDetailResponse extends AbstractModel {

    /**
    * <p>动态tab配置</p>
    */
    @SerializedName("DynamicTabs")
    @Expose
    private DynamicTab [] DynamicTabs;

    /**
    * <p>基础tab项</p>
    */
    @SerializedName("DetailTabs")
    @Expose
    private String [] DetailTabs;

    /**
    * <p>资产详情信息</p>
    */
    @SerializedName("AssetDetail")
    @Expose
    private AssetDetailItem AssetDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>动态tab配置</p> 
     * @return DynamicTabs <p>动态tab配置</p>
     */
    public DynamicTab [] getDynamicTabs() {
        return this.DynamicTabs;
    }

    /**
     * Set <p>动态tab配置</p>
     * @param DynamicTabs <p>动态tab配置</p>
     */
    public void setDynamicTabs(DynamicTab [] DynamicTabs) {
        this.DynamicTabs = DynamicTabs;
    }

    /**
     * Get <p>基础tab项</p> 
     * @return DetailTabs <p>基础tab项</p>
     */
    public String [] getDetailTabs() {
        return this.DetailTabs;
    }

    /**
     * Set <p>基础tab项</p>
     * @param DetailTabs <p>基础tab项</p>
     */
    public void setDetailTabs(String [] DetailTabs) {
        this.DetailTabs = DetailTabs;
    }

    /**
     * Get <p>资产详情信息</p> 
     * @return AssetDetail <p>资产详情信息</p>
     */
    public AssetDetailItem getAssetDetail() {
        return this.AssetDetail;
    }

    /**
     * Set <p>资产详情信息</p>
     * @param AssetDetail <p>资产详情信息</p>
     */
    public void setAssetDetail(AssetDetailItem AssetDetail) {
        this.AssetDetail = AssetDetail;
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

    public DescribeAssetDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetDetailResponse(DescribeAssetDetailResponse source) {
        if (source.DynamicTabs != null) {
            this.DynamicTabs = new DynamicTab[source.DynamicTabs.length];
            for (int i = 0; i < source.DynamicTabs.length; i++) {
                this.DynamicTabs[i] = new DynamicTab(source.DynamicTabs[i]);
            }
        }
        if (source.DetailTabs != null) {
            this.DetailTabs = new String[source.DetailTabs.length];
            for (int i = 0; i < source.DetailTabs.length; i++) {
                this.DetailTabs[i] = new String(source.DetailTabs[i]);
            }
        }
        if (source.AssetDetail != null) {
            this.AssetDetail = new AssetDetailItem(source.AssetDetail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DynamicTabs.", this.DynamicTabs);
        this.setParamArraySimple(map, prefix + "DetailTabs.", this.DetailTabs);
        this.setParamObj(map, prefix + "AssetDetail.", this.AssetDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

