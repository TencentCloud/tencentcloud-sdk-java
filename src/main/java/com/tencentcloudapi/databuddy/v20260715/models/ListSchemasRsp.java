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

public class ListSchemasRsp extends AbstractModel {

    /**
    * schema列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private Schema [] Items;

    /**
    * 下页分页token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextPageToken")
    @Expose
    private String NextPageToken;

    /**
     * Get schema列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items schema列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Schema [] getItems() {
        return this.Items;
    }

    /**
     * Set schema列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items schema列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(Schema [] Items) {
        this.Items = Items;
    }

    /**
     * Get 下页分页token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextPageToken 下页分页token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextPageToken() {
        return this.NextPageToken;
    }

    /**
     * Set 下页分页token
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextPageToken 下页分页token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextPageToken(String NextPageToken) {
        this.NextPageToken = NextPageToken;
    }

    public ListSchemasRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSchemasRsp(ListSchemasRsp source) {
        if (source.Items != null) {
            this.Items = new Schema[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Schema(source.Items[i]);
            }
        }
        if (source.NextPageToken != null) {
            this.NextPageToken = new String(source.NextPageToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "NextPageToken", this.NextPageToken);

    }
}

