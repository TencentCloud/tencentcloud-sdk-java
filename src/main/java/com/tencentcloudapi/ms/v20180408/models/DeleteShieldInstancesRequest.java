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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteShieldInstancesRequest extends AbstractModel {

    /**
    * 任务唯一标识ItemId的列表
    */
    @SerializedName("ItemIds")
    @Expose
    private String [] ItemIds;

    /**
     * Get 任务唯一标识ItemId的列表 
     * @return ItemIds 任务唯一标识ItemId的列表
     */
    public String [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set 任务唯一标识ItemId的列表
     * @param ItemIds 任务唯一标识ItemId的列表
     */
    public void setItemIds(String [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    public DeleteShieldInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteShieldInstancesRequest(DeleteShieldInstancesRequest source) {
        if (source.ItemIds != null) {
            this.ItemIds = new String[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new String(source.ItemIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);

    }
}

