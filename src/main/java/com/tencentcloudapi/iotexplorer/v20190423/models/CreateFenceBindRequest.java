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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFenceBindRequest extends AbstractModel{

    /**
    * 围栏Id
    */
    @SerializedName("FenceId")
    @Expose
    private Long FenceId;

    /**
    * 围栏绑定的产品列表
    */
    @SerializedName("Items")
    @Expose
    private FenceBindProductItem [] Items;

    /**
     * Get 围栏Id 
     * @return FenceId 围栏Id
     */
    public Long getFenceId() {
        return this.FenceId;
    }

    /**
     * Set 围栏Id
     * @param FenceId 围栏Id
     */
    public void setFenceId(Long FenceId) {
        this.FenceId = FenceId;
    }

    /**
     * Get 围栏绑定的产品列表 
     * @return Items 围栏绑定的产品列表
     */
    public FenceBindProductItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 围栏绑定的产品列表
     * @param Items 围栏绑定的产品列表
     */
    public void setItems(FenceBindProductItem [] Items) {
        this.Items = Items;
    }

    public CreateFenceBindRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFenceBindRequest(CreateFenceBindRequest source) {
        if (source.FenceId != null) {
            this.FenceId = new Long(source.FenceId);
        }
        if (source.Items != null) {
            this.Items = new FenceBindProductItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new FenceBindProductItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FenceId", this.FenceId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

