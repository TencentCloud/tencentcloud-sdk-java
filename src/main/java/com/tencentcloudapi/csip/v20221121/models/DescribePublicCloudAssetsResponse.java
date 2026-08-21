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

public class DescribePublicCloudAssetsResponse extends AbstractModel {

    /**
    * 资产数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资产集合
    */
    @SerializedName("Assets")
    @Expose
    private PublicAssetInfo [] Assets;

    /**
    * 资产类型集合
    */
    @SerializedName("AssetTypeList")
    @Expose
    private AttributeOptionSet [] AssetTypeList;

    /**
    * 地域集合
    */
    @SerializedName("RegionList")
    @Expose
    private AttributeOptionSet [] RegionList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产数量 
     * @return TotalCount 资产数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资产数量
     * @param TotalCount 资产数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资产集合 
     * @return Assets 资产集合
     */
    public PublicAssetInfo [] getAssets() {
        return this.Assets;
    }

    /**
     * Set 资产集合
     * @param Assets 资产集合
     */
    public void setAssets(PublicAssetInfo [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get 资产类型集合 
     * @return AssetTypeList 资产类型集合
     */
    public AttributeOptionSet [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set 资产类型集合
     * @param AssetTypeList 资产类型集合
     */
    public void setAssetTypeList(AttributeOptionSet [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get 地域集合 
     * @return RegionList 地域集合
     */
    public AttributeOptionSet [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域集合
     * @param RegionList 地域集合
     */
    public void setRegionList(AttributeOptionSet [] RegionList) {
        this.RegionList = RegionList;
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

    public DescribePublicCloudAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicCloudAssetsResponse(DescribePublicCloudAssetsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Assets != null) {
            this.Assets = new PublicAssetInfo[source.Assets.length];
            for (int i = 0; i < source.Assets.length; i++) {
                this.Assets[i] = new PublicAssetInfo(source.Assets[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new AttributeOptionSet[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new AttributeOptionSet(source.AssetTypeList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new AttributeOptionSet[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new AttributeOptionSet(source.RegionList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

