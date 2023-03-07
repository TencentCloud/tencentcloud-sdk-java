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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Item extends AbstractModel{

    /**
    * Id
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * 名称
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
     * Get Id 
     * @return ItemId Id
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Id
     * @param ItemId Id
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 名称 
     * @return ItemName 名称
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 名称
     * @param ItemName 名称
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public Item() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Item(Item source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);

    }
}

