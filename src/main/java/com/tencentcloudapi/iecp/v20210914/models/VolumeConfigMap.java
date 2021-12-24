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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeConfigMap extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Key列表配置
    */
    @SerializedName("Items")
    @Expose
    private VolumeConfigMapKeyToPath [] Items;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Key列表配置 
     * @return Items Key列表配置
     */
    public VolumeConfigMapKeyToPath [] getItems() {
        return this.Items;
    }

    /**
     * Set Key列表配置
     * @param Items Key列表配置
     */
    public void setItems(VolumeConfigMapKeyToPath [] Items) {
        this.Items = Items;
    }

    public VolumeConfigMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeConfigMap(VolumeConfigMap source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Items != null) {
            this.Items = new VolumeConfigMapKeyToPath[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new VolumeConfigMapKeyToPath(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

