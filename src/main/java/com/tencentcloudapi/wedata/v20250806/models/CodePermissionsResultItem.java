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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePermissionsResultItem extends AbstractModel {

    /**
    * 资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 该资源权限操作是否成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 若是创建失败, 提供失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Item 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Item 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 该资源权限操作是否成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 该资源权限操作是否成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 该资源权限操作是否成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 该资源权限操作是否成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 若是创建失败, 提供失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 若是创建失败, 提供失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 若是创建失败, 提供失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 若是创建失败, 提供失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public CodePermissionsResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodePermissionsResultItem(CodePermissionsResultItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

