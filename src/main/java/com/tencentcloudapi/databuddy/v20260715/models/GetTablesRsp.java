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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTablesRsp extends AbstractModel {

    /**
    * 表信息列表。注意：仅返回当前workspace有权限的catalog下的表，无权限的表会被静默跳过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private TableInfo [] Items;

    /**
     * Get 表信息列表。注意：仅返回当前workspace有权限的catalog下的表，无权限的表会被静默跳过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 表信息列表。注意：仅返回当前workspace有权限的catalog下的表，无权限的表会被静默跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 表信息列表。注意：仅返回当前workspace有权限的catalog下的表，无权限的表会被静默跳过
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 表信息列表。注意：仅返回当前workspace有权限的catalog下的表，无权限的表会被静默跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(TableInfo [] Items) {
        this.Items = Items;
    }

    public GetTablesRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTablesRsp(GetTablesRsp source) {
        if (source.Items != null) {
            this.Items = new TableInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TableInfo(source.Items[i]);
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

