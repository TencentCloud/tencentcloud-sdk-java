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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SelectedRange extends AbstractModel{

    /**
    * 选中的项目详细内容
    */
    @SerializedName("Items")
    @Expose
    private SelectedItems [] Items;

    /**
    * 是否全选
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
     * Get 选中的项目详细内容 
     * @return Items 选中的项目详细内容
     */
    public SelectedItems [] getItems() {
        return this.Items;
    }

    /**
     * Set 选中的项目详细内容
     * @param Items 选中的项目详细内容
     */
    public void setItems(SelectedItems [] Items) {
        this.Items = Items;
    }

    /**
     * Get 是否全选 
     * @return All 是否全选
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否全选
     * @param All 是否全选
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    public SelectedRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SelectedRange(SelectedRange source) {
        if (source.Items != null) {
            this.Items = new SelectedItems[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SelectedItems(source.Items[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "All", this.All);

    }
}

