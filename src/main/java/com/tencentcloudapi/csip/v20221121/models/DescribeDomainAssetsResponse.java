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

public class DescribeDomainAssetsResponse extends AbstractModel{

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
    private DomainAssetVO [] Data;

    /**
    * 防护状态列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefenseStatusList")
    @Expose
    private FilterDataObject [] DefenseStatusList;

    /**
    * 资产归属地列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetLocationList")
    @Expose
    private FilterDataObject [] AssetLocationList;

    /**
    * 资产类型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceTypeList")
    @Expose
    private FilterDataObject [] SourceTypeList;

    /**
    * 地域列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

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
    public DomainAssetVO [] getData() {
        return this.Data;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(DomainAssetVO [] Data) {
        this.Data = Data;
    }

    /**
     * Get 防护状态列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefenseStatusList 防护状态列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getDefenseStatusList() {
        return this.DefenseStatusList;
    }

    /**
     * Set 防护状态列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefenseStatusList 防护状态列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefenseStatusList(FilterDataObject [] DefenseStatusList) {
        this.DefenseStatusList = DefenseStatusList;
    }

    /**
     * Get 资产归属地列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetLocationList 资产归属地列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getAssetLocationList() {
        return this.AssetLocationList;
    }

    /**
     * Set 资产归属地列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetLocationList 资产归属地列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetLocationList(FilterDataObject [] AssetLocationList) {
        this.AssetLocationList = AssetLocationList;
    }

    /**
     * Get 资产类型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceTypeList 资产类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getSourceTypeList() {
        return this.SourceTypeList;
    }

    /**
     * Set 资产类型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceTypeList 资产类型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceTypeList(FilterDataObject [] SourceTypeList) {
        this.SourceTypeList = SourceTypeList;
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

    public DescribeDomainAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainAssetsResponse(DescribeDomainAssetsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DomainAssetVO[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DomainAssetVO(source.Data[i]);
            }
        }
        if (source.DefenseStatusList != null) {
            this.DefenseStatusList = new FilterDataObject[source.DefenseStatusList.length];
            for (int i = 0; i < source.DefenseStatusList.length; i++) {
                this.DefenseStatusList[i] = new FilterDataObject(source.DefenseStatusList[i]);
            }
        }
        if (source.AssetLocationList != null) {
            this.AssetLocationList = new FilterDataObject[source.AssetLocationList.length];
            for (int i = 0; i < source.AssetLocationList.length; i++) {
                this.AssetLocationList[i] = new FilterDataObject(source.AssetLocationList[i]);
            }
        }
        if (source.SourceTypeList != null) {
            this.SourceTypeList = new FilterDataObject[source.SourceTypeList.length];
            for (int i = 0; i < source.SourceTypeList.length; i++) {
                this.SourceTypeList[i] = new FilterDataObject(source.SourceTypeList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new FilterDataObject[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new FilterDataObject(source.RegionList[i]);
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
        this.setParamArrayObj(map, prefix + "DefenseStatusList.", this.DefenseStatusList);
        this.setParamArrayObj(map, prefix + "AssetLocationList.", this.AssetLocationList);
        this.setParamArrayObj(map, prefix + "SourceTypeList.", this.SourceTypeList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

