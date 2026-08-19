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

public class AssetTypeCount extends AbstractModel {

    /**
    * <p>关联资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>资产类型展示名称</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>过滤字段</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
     * Get <p>关联资产类型</p> 
     * @return AssetType <p>关联资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>关联资产类型</p>
     * @param AssetType <p>关联资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>数量</p> 
     * @return Count <p>数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>数量</p>
     * @param Count <p>数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>资产类型展示名称</p> 
     * @return AssetTypeName <p>资产类型展示名称</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>资产类型展示名称</p>
     * @param AssetTypeName <p>资产类型展示名称</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>过滤字段</p> 
     * @return Filter <p>过滤字段</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤字段</p>
     * @param Filter <p>过滤字段</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public AssetTypeCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTypeCount(AssetTypeCount source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

