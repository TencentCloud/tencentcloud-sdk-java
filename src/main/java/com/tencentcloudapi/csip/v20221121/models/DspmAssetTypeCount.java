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

public class DspmAssetTypeCount extends AbstractModel {

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产安全分析开启数
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * 资产安全分析开启中数
    */
    @SerializedName("OpeningCount")
    @Expose
    private Long OpeningCount;

    /**
    * 资产安全分析关闭中数
    */
    @SerializedName("ClosingCount")
    @Expose
    private Long ClosingCount;

    /**
    * 资产安全分析未开启数
    */
    @SerializedName("CloseCount")
    @Expose
    private Long CloseCount;

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 资产安全分析开启数 
     * @return OpenCount 资产安全分析开启数
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set 资产安全分析开启数
     * @param OpenCount 资产安全分析开启数
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get 资产安全分析开启中数 
     * @return OpeningCount 资产安全分析开启中数
     */
    public Long getOpeningCount() {
        return this.OpeningCount;
    }

    /**
     * Set 资产安全分析开启中数
     * @param OpeningCount 资产安全分析开启中数
     */
    public void setOpeningCount(Long OpeningCount) {
        this.OpeningCount = OpeningCount;
    }

    /**
     * Get 资产安全分析关闭中数 
     * @return ClosingCount 资产安全分析关闭中数
     */
    public Long getClosingCount() {
        return this.ClosingCount;
    }

    /**
     * Set 资产安全分析关闭中数
     * @param ClosingCount 资产安全分析关闭中数
     */
    public void setClosingCount(Long ClosingCount) {
        this.ClosingCount = ClosingCount;
    }

    /**
     * Get 资产安全分析未开启数 
     * @return CloseCount 资产安全分析未开启数
     */
    public Long getCloseCount() {
        return this.CloseCount;
    }

    /**
     * Set 资产安全分析未开启数
     * @param CloseCount 资产安全分析未开启数
     */
    public void setCloseCount(Long CloseCount) {
        this.CloseCount = CloseCount;
    }

    public DspmAssetTypeCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetTypeCount(DspmAssetTypeCount source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.OpenCount != null) {
            this.OpenCount = new Long(source.OpenCount);
        }
        if (source.OpeningCount != null) {
            this.OpeningCount = new Long(source.OpeningCount);
        }
        if (source.ClosingCount != null) {
            this.ClosingCount = new Long(source.ClosingCount);
        }
        if (source.CloseCount != null) {
            this.CloseCount = new Long(source.CloseCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "OpeningCount", this.OpeningCount);
        this.setParamSimple(map, prefix + "ClosingCount", this.ClosingCount);
        this.setParamSimple(map, prefix + "CloseCount", this.CloseCount);

    }
}

