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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlashbackCollection extends AbstractModel {

    /**
    * 指定按 Key 闪回源数据库集合名。
    */
    @SerializedName("CollectionName")
    @Expose
    private String CollectionName;

    /**
    * 指定按 Key 闪回目标数据库集合名。
    */
    @SerializedName("TargetResultCollectionName")
    @Expose
    private String TargetResultCollectionName;

    /**
    * 指定用于过滤按 Key 闪回的 Key（键）。
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * 指定用于按 Key 闪回的键值对。数组元素最大限制为 50000。
    */
    @SerializedName("KeyValues")
    @Expose
    private FBKeyValue [] KeyValues;

    /**
     * Get 指定按 Key 闪回源数据库集合名。 
     * @return CollectionName 指定按 Key 闪回源数据库集合名。
     */
    public String getCollectionName() {
        return this.CollectionName;
    }

    /**
     * Set 指定按 Key 闪回源数据库集合名。
     * @param CollectionName 指定按 Key 闪回源数据库集合名。
     */
    public void setCollectionName(String CollectionName) {
        this.CollectionName = CollectionName;
    }

    /**
     * Get 指定按 Key 闪回目标数据库集合名。 
     * @return TargetResultCollectionName 指定按 Key 闪回目标数据库集合名。
     */
    public String getTargetResultCollectionName() {
        return this.TargetResultCollectionName;
    }

    /**
     * Set 指定按 Key 闪回目标数据库集合名。
     * @param TargetResultCollectionName 指定按 Key 闪回目标数据库集合名。
     */
    public void setTargetResultCollectionName(String TargetResultCollectionName) {
        this.TargetResultCollectionName = TargetResultCollectionName;
    }

    /**
     * Get 指定用于过滤按 Key 闪回的 Key（键）。 
     * @return FilterKey 指定用于过滤按 Key 闪回的 Key（键）。
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set 指定用于过滤按 Key 闪回的 Key（键）。
     * @param FilterKey 指定用于过滤按 Key 闪回的 Key（键）。
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get 指定用于按 Key 闪回的键值对。数组元素最大限制为 50000。 
     * @return KeyValues 指定用于按 Key 闪回的键值对。数组元素最大限制为 50000。
     */
    public FBKeyValue [] getKeyValues() {
        return this.KeyValues;
    }

    /**
     * Set 指定用于按 Key 闪回的键值对。数组元素最大限制为 50000。
     * @param KeyValues 指定用于按 Key 闪回的键值对。数组元素最大限制为 50000。
     */
    public void setKeyValues(FBKeyValue [] KeyValues) {
        this.KeyValues = KeyValues;
    }

    public FlashbackCollection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlashbackCollection(FlashbackCollection source) {
        if (source.CollectionName != null) {
            this.CollectionName = new String(source.CollectionName);
        }
        if (source.TargetResultCollectionName != null) {
            this.TargetResultCollectionName = new String(source.TargetResultCollectionName);
        }
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.KeyValues != null) {
            this.KeyValues = new FBKeyValue[source.KeyValues.length];
            for (int i = 0; i < source.KeyValues.length; i++) {
                this.KeyValues[i] = new FBKeyValue(source.KeyValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollectionName", this.CollectionName);
        this.setParamSimple(map, prefix + "TargetResultCollectionName", this.TargetResultCollectionName);
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamArrayObj(map, prefix + "KeyValues.", this.KeyValues);

    }
}

