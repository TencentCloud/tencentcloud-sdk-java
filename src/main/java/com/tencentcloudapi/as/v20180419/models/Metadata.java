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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Metadata extends AbstractModel {

    /**
    * 自定义 Metadata 键值对列表
    */
    @SerializedName("Items")
    @Expose
    private MetadataItem [] Items;

    /**
     * Get 自定义 Metadata 键值对列表 
     * @return Items 自定义 Metadata 键值对列表
     */
    public MetadataItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 自定义 Metadata 键值对列表
     * @param Items 自定义 Metadata 键值对列表
     */
    public void setItems(MetadataItem [] Items) {
        this.Items = Items;
    }

    public Metadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Metadata(Metadata source) {
        if (source.Items != null) {
            this.Items = new MetadataItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new MetadataItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

