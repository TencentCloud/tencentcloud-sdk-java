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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MapConfigItem extends AbstractModel{

    /**
    * key
    */
    @SerializedName("ConfKey")
    @Expose
    private String ConfKey;

    /**
    * 列表
    */
    @SerializedName("Items")
    @Expose
    private InstanceConfigInfo [] Items;

    /**
     * Get key 
     * @return ConfKey key
     */
    public String getConfKey() {
        return this.ConfKey;
    }

    /**
     * Set key
     * @param ConfKey key
     */
    public void setConfKey(String ConfKey) {
        this.ConfKey = ConfKey;
    }

    /**
     * Get 列表 
     * @return Items 列表
     */
    public InstanceConfigInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 列表
     * @param Items 列表
     */
    public void setItems(InstanceConfigInfo [] Items) {
        this.Items = Items;
    }

    public MapConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MapConfigItem(MapConfigItem source) {
        if (source.ConfKey != null) {
            this.ConfKey = new String(source.ConfKey);
        }
        if (source.Items != null) {
            this.Items = new InstanceConfigInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceConfigInfo(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfKey", this.ConfKey);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

