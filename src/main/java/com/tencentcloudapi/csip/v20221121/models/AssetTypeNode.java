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

public class AssetTypeNode extends AbstractModel {

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产类型名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>资产类型数量</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>资产类型ID</p>
    */
    @SerializedName("AssetTypeID")
    @Expose
    private Long AssetTypeID;

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产类型名称</p> 
     * @return AssetTypeName <p>资产类型名称</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>资产类型名称</p>
     * @param AssetTypeName <p>资产类型名称</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>资产类型数量</p> 
     * @return AssetCount <p>资产类型数量</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>资产类型数量</p>
     * @param AssetCount <p>资产类型数量</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>资产类型ID</p> 
     * @return AssetTypeID <p>资产类型ID</p>
     */
    public Long getAssetTypeID() {
        return this.AssetTypeID;
    }

    /**
     * Set <p>资产类型ID</p>
     * @param AssetTypeID <p>资产类型ID</p>
     */
    public void setAssetTypeID(Long AssetTypeID) {
        this.AssetTypeID = AssetTypeID;
    }

    public AssetTypeNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTypeNode(AssetTypeNode source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.AssetTypeID != null) {
            this.AssetTypeID = new Long(source.AssetTypeID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "AssetTypeID", this.AssetTypeID);

    }
}

