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

public class DescribeCVMAssetsResponse extends AbstractModel{

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private CVMAssetVO [] Data;

    /**
    * 地域列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * 防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefenseStatusList")
    @Expose
    private FilterDataObject [] DefenseStatusList;

    /**
    * vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * 资产类型枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * 操作系统枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemTypeList")
    @Expose
    private FilterDataObject [] SystemTypeList;

    /**
    * ip列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpTypeList")
    @Expose
    private FilterDataObject [] IpTypeList;

    /**
    * appid列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneList")
    @Expose
    private FilterDataObject [] ZoneList;

    /**
    * os列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsList")
    @Expose
    private FilterDataObject [] OsList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CVMAssetVO [] getData() {
        return this.Data;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(CVMAssetVO [] Data) {
        this.Data = Data;
    }

    /**
     * Get 地域列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionList 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionList 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get 防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefenseStatusList 防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getDefenseStatusList() {
        return this.DefenseStatusList;
    }

    /**
     * Set 防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefenseStatusList 防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefenseStatusList(FilterDataObject [] DefenseStatusList) {
        this.DefenseStatusList = DefenseStatusList;
    }

    /**
     * Get vpc枚举
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcList vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcList vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 资产类型枚举
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetTypeList 资产类型枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set 资产类型枚举
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetTypeList 资产类型枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetTypeList(FilterDataObject [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get 操作系统枚举
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemTypeList 操作系统枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getSystemTypeList() {
        return this.SystemTypeList;
    }

    /**
     * Set 操作系统枚举
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemTypeList 操作系统枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemTypeList(FilterDataObject [] SystemTypeList) {
        this.SystemTypeList = SystemTypeList;
    }

    /**
     * Get ip列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpTypeList ip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getIpTypeList() {
        return this.IpTypeList;
    }

    /**
     * Set ip列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpTypeList ip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpTypeList(FilterDataObject [] IpTypeList) {
        this.IpTypeList = IpTypeList;
    }

    /**
     * Get appid列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppIdList appid列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set appid列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppIdList appid列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
    }

    /**
     * Get 可用区列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneList 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneList 可用区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneList(FilterDataObject [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get os列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsList os列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getOsList() {
        return this.OsList;
    }

    /**
     * Set os列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsList os列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsList(FilterDataObject [] OsList) {
        this.OsList = OsList;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

