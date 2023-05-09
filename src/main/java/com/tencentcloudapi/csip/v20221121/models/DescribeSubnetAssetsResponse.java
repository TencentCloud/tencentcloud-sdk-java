/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetAssetsResponse extends AbstractModel{

    /**
    * 列表
    */
    @SerializedName("Data")
    @Expose
    private SubnetAsset [] Data;

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
    * 可用区列表
    */
    @SerializedName("ZoneList")
    @Expose
    private FilterDataObject [] ZoneList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表 
     * @return Data 列表
     */
    public SubnetAsset [] getData() {
        return this.Data;
    }

    /**
     * Set 列表
     * @param Data 列表
     */
    public void setData(SubnetAsset [] Data) {
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
     * Get 可用区列表 
     * @return ZoneList 可用区列表
     */
    public FilterDataObject [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set 可用区列表
     * @param ZoneList 可用区列表
     */
    public void setZoneList(FilterDataObject [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSubnetAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubnetAssetsResponse(DescribeSubnetAssetsResponse source) {
        if (source.Data != null) {
            this.Data = new SubnetAsset[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SubnetAsset(source.Data[i]);
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
        if (source.ZoneList != null) {
            this.ZoneList = new FilterDataObject[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new FilterDataObject(source.ZoneList[i]);
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
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

