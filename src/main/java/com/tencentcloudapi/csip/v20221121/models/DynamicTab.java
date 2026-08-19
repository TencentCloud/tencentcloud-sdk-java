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

public class DynamicTab extends AbstractModel {

    /**
    * <p>key</p>
    */
    @SerializedName("TabKey")
    @Expose
    private String TabKey;

    /**
    * <p>数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>关联资产配置</p>
    */
    @SerializedName("AssetType")
    @Expose
    private AssetTypeCount [] AssetType;

    /**
     * Get <p>key</p> 
     * @return TabKey <p>key</p>
     */
    public String getTabKey() {
        return this.TabKey;
    }

    /**
     * Set <p>key</p>
     * @param TabKey <p>key</p>
     */
    public void setTabKey(String TabKey) {
        this.TabKey = TabKey;
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
     * Get <p>关联资产配置</p> 
     * @return AssetType <p>关联资产配置</p>
     */
    public AssetTypeCount [] getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>关联资产配置</p>
     * @param AssetType <p>关联资产配置</p>
     */
    public void setAssetType(AssetTypeCount [] AssetType) {
        this.AssetType = AssetType;
    }

    public DynamicTab() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicTab(DynamicTab source) {
        if (source.TabKey != null) {
            this.TabKey = new String(source.TabKey);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AssetType != null) {
            this.AssetType = new AssetTypeCount[source.AssetType.length];
            for (int i = 0; i < source.AssetType.length; i++) {
                this.AssetType[i] = new AssetTypeCount(source.AssetType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TabKey", this.TabKey);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "AssetType.", this.AssetType);

    }
}

