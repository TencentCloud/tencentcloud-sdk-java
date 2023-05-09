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

public class DescribeDbAssetsResponse extends AbstractModel{

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资产总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private DBAssetVO [] Data;

    /**
    * 地域枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionList")
    @Expose
    private FilterDataObject [] RegionList;

    /**
    * 资产类型枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetTypeList")
    @Expose
    private FilterDataObject [] AssetTypeList;

    /**
    * Vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcList")
    @Expose
    private FilterDataObject [] VpcList;

    /**
    * Appid枚举
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppIdList")
    @Expose
    private FilterDataObject [] AppIdList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 资产总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBAssetVO [] getData() {
        return this.Data;
    }

    /**
     * Set 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(DBAssetVO [] Data) {
        this.Data = Data;
    }

    /**
     * Get 地域枚举
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionList 地域枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域枚举
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionList 地域枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionList(FilterDataObject [] RegionList) {
        this.RegionList = RegionList;
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
     * Get Vpc枚举
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcList Vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set Vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcList Vpc枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcList(FilterDataObject [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get Appid枚举
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppIdList Appid枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set Appid枚举
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppIdList Appid枚举
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppIdList(FilterDataObject [] AppIdList) {
        this.AppIdList = AppIdList;
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

    public DescribeDbAssetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDbAssetsResponse(DescribeDbAssetsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DBAssetVO[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DBAssetVO(source.Data[i]);
            }
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

