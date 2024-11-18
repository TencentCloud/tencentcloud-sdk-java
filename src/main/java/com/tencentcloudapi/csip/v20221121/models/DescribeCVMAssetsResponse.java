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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCVMAssetsResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 机器列表
    */
    @SerializedName("Data")
    @Expose
    private CVMAssetVO [] Data;

    /**
    * 地域列表
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * 防护状态
    */
    @SerializedName("DefenseStatusList")
    @Expose
    private FilterDataObject [] DefenseStatusList;

    /**
    * vpc枚举
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * 资产类型枚举
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * 操作系统枚举
    */
    @SerializedName("SystemTypeList")
    @Expose
    private FilterDataObject [] SystemTypeList;

    /**
    * ip列表
    */
    @SerializedName("IpTypeList")
    @Expose
    private FilterDataObject [] IpTypeList;

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
    * os列表
    */
    @SerializedName("OsList")
    @Expose
    private FilterDataObject [] OsList;

    /**
    * 资产类型和实例类型的对应关系
    */
    @SerializedName("AssetMapInstanceTypeList")
    @Expose
    private AssetInstanceTypeMap [] AssetMapInstanceTypeList;

    /**
    * 公网内网枚举
    */
    @SerializedName("PublicPrivateAttr")
    @Expose
    private FilterDataObject [] PublicPrivateAttr;

    /**
    * 主机防护状态
    */
    @SerializedName("ProtectStatusList")
    @Expose
    private FilterDataObject [] ProtectStatusList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 机器列表 
     * @return Data 机器列表
     */
    public CVMAssetVO [] getData() {
        return this.Data;
    }

    /**
     * Set 机器列表
     * @param Data 机器列表
     */
    public void setData(CVMAssetVO [] Data) {
        this.Data = Data;
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
     * Get 防护状态 
     * @return DefenseStatusList 防护状态
     */
    public FilterDataObject [] getDefenseStatusList() {
        return this.DefenseStatusList;
    }

    /**
     * Set 防护状态
     * @param DefenseStatusList 防护状态
     */
    public void setDefenseStatusList(FilterDataObject [] DefenseStatusList) {
        this.DefenseStatusList = DefenseStatusList;
    }

    /**
     * Get vpc枚举 
     * @return VpcList vpc枚举
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set vpc枚举
     * @param VpcList vpc枚举
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 资产类型枚举 
     * @return AssetTypeList 资产类型枚举
     */
    public FilterDataObject [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set 资产类型枚举
     * @param AssetTypeList 资产类型枚举
     */
    public void setAssetTypeList(FilterDataObject [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get 操作系统枚举 
     * @return SystemTypeList 操作系统枚举
     */
    public FilterDataObject [] getSystemTypeList() {
        return this.SystemTypeList;
    }

    /**
     * Set 操作系统枚举
     * @param SystemTypeList 操作系统枚举
     */
    public void setSystemTypeList(FilterDataObject [] SystemTypeList) {
        this.SystemTypeList = SystemTypeList;
    }

    /**
     * Get ip列表 
     * @return IpTypeList ip列表
     */
    public FilterDataObject [] getIpTypeList() {
        return this.IpTypeList;
    }

    /**
     * Set ip列表
     * @param IpTypeList ip列表
     */
    public void setIpTypeList(FilterDataObject [] IpTypeList) {
        this.IpTypeList = IpTypeList;
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
     * Get os列表 
     * @return OsList os列表
     */
    public FilterDataObject [] getOsList() {
        return this.OsList;
    }

    /**
     * Set os列表
     * @param OsList os列表
     */
    public void setOsList(FilterDataObject [] OsList) {
        this.OsList = OsList;
    }

    /**
     * Get 资产类型和实例类型的对应关系 
     * @return AssetMapInstanceTypeList 资产类型和实例类型的对应关系
     */
    public AssetInstanceTypeMap [] getAssetMapInstanceTypeList() {
        return this.AssetMapInstanceTypeList;
    }

    /**
     * Set 资产类型和实例类型的对应关系
     * @param AssetMapInstanceTypeList 资产类型和实例类型的对应关系
     */
    public void setAssetMapInstanceTypeList(AssetInstanceTypeMap [] AssetMapInstanceTypeList) {
        this.AssetMapInstanceTypeList = AssetMapInstanceTypeList;
    }

    /**
     * Get 公网内网枚举 
     * @return PublicPrivateAttr 公网内网枚举
     */
    public FilterDataObject [] getPublicPrivateAttr() {
        return this.PublicPrivateAttr;
    }

    /**
     * Set 公网内网枚举
     * @param PublicPrivateAttr 公网内网枚举
     */
    public void setPublicPrivateAttr(FilterDataObject [] PublicPrivateAttr) {
        this.PublicPrivateAttr = PublicPrivateAttr;
    }

    /**
     * Get 主机防护状态 
     * @return ProtectStatusList 主机防护状态
     */
    public FilterDataObject [] getProtectStatusList() {
        return this.ProtectStatusList;
    }

    /**
     * Set 主机防护状态
     * @param ProtectStatusList 主机防护状态
     */
    public void setProtectStatusList(FilterDataObject [] ProtectStatusList) {
        this.ProtectStatusList = ProtectStatusList;
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

    public DescribeCVMAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCVMAssetsResponse(DescribeCVMAssetsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new CVMAssetVO[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new CVMAssetVO(source.Data[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
            }
        }
        if (source.DefenseStatusList != null) {
            this.DefenseStatusList = new FilterDataObject[source.DefenseStatusList.length];
            for (int i = 0; i < source.DefenseStatusList.length; i++) {
                this.DefenseStatusList[i] = new FilterDataObject(source.DefenseStatusList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new FilterDataObject[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new FilterDataObject(source.VpcList[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new FilterDataObject[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new FilterDataObject(source.AssetTypeList[i]);
            }
        }
        if (source.SystemTypeList != null) {
            this.SystemTypeList = new FilterDataObject[source.SystemTypeList.length];
            for (int i = 0; i < source.SystemTypeList.length; i++) {
                this.SystemTypeList[i] = new FilterDataObject(source.SystemTypeList[i]);
            }
        }
        if (source.IpTypeList != null) {
            this.IpTypeList = new FilterDataObject[source.IpTypeList.length];
            for (int i = 0; i < source.IpTypeList.length; i++) {
                this.IpTypeList[i] = new FilterDataObject(source.IpTypeList[i]);
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
        if (source.OsList != null) {
            this.OsList = new FilterDataObject[source.OsList.length];
            for (int i = 0; i < source.OsList.length; i++) {
                this.OsList[i] = new FilterDataObject(source.OsList[i]);
            }
        }
        if (source.AssetMapInstanceTypeList != null) {
            this.AssetMapInstanceTypeList = new AssetInstanceTypeMap[source.AssetMapInstanceTypeList.length];
            for (int i = 0; i < source.AssetMapInstanceTypeList.length; i++) {
                this.AssetMapInstanceTypeList[i] = new AssetInstanceTypeMap(source.AssetMapInstanceTypeList[i]);
            }
        }
        if (source.PublicPrivateAttr != null) {
            this.PublicPrivateAttr = new FilterDataObject[source.PublicPrivateAttr.length];
            for (int i = 0; i < source.PublicPrivateAttr.length; i++) {
                this.PublicPrivateAttr[i] = new FilterDataObject(source.PublicPrivateAttr[i]);
            }
        }
        if (source.ProtectStatusList != null) {
            this.ProtectStatusList = new FilterDataObject[source.ProtectStatusList.length];
            for (int i = 0; i < source.ProtectStatusList.length; i++) {
                this.ProtectStatusList[i] = new FilterDataObject(source.ProtectStatusList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "DefenseStatusList.", this.DefenseStatusList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "SystemTypeList.", this.SystemTypeList);
        this.setParamArrayObj(map, prefix + "IpTypeList.", this.IpTypeList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArrayObj(map, prefix + "OsList.", this.OsList);
        this.setParamArrayObj(map, prefix + "AssetMapInstanceTypeList.", this.AssetMapInstanceTypeList);
        this.setParamArrayObj(map, prefix + "PublicPrivateAttr.", this.PublicPrivateAttr);
        this.setParamArrayObj(map, prefix + "ProtectStatusList.", this.ProtectStatusList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

