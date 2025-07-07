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

public class DescribeGatewayAssetsResponse extends AbstractModel {

    /**
    * 列表
    */
    @SerializedName("Data")
    @Expose
    private GateWayAsset [] Data;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 地域列表
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * 资产类型列表
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * vpc列表
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * appid列表
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表 
     * @return Data 列表
     */
    public GateWayAsset [] getData() {
        return this.Data;
    }

    /**
     * Set 列表
     * @param Data 列表
     */
    public void setData(GateWayAsset [] Data) {
        this.Data = Data;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 地域列表 
     * @return RegionList 地域列表
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域列表
     * @param RegionList 地域列表
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get 资产类型列表 
     * @return AssetTypeList 资产类型列表
     */
    public FilterDataObject [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set 资产类型列表
     * @param AssetTypeList 资产类型列表
     */
    public void setAssetTypeList(FilterDataObject [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get vpc列表 
     * @return VpcList vpc列表
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set vpc列表
     * @param VpcList vpc列表
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get appid列表 
     * @return AppIdList appid列表
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set appid列表
     * @param AppIdList appid列表
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
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

    public DescribeGatewayAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayAssetsResponse(DescribeGatewayAssetsResponse source) {
        if (source.Data != null) {
            this.Data = new GateWayAsset[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new GateWayAsset(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new FilterDataObject[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new FilterDataObject(source.AssetTypeList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new FilterDataObject[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new FilterDataObject(source.VpcList[i]);
            }
        }
        if (source.AppIdList != null) {
            this.AppIdList = new FilterDataObject[source.AppIdList.length];
            for (int i = 0; i < source.AppIdList.length; i++) {
                this.AppIdList[i] = new FilterDataObject(source.AppIdList[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

