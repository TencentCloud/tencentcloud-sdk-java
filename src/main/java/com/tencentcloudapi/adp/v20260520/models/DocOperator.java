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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocOperator extends AbstractModel {

    /**
    * <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modifier")
    @Expose
    private Operator Modifier;

    /**
    * <p>操作权限</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private DocPermission Permission;

    /**
     * Get <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modifier <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Operator getModifier() {
        return this.Modifier;
    }

    /**
     * Set <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modifier <p>修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifier(Operator Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get <p>操作权限</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission <p>操作权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocPermission getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>操作权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission <p>操作权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(DocPermission Permission) {
        this.Permission = Permission;
    }

    public DocOperator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocOperator(DocOperator source) {
        if (source.Modifier != null) {
            this.Modifier = new Operator(source.Modifier);
        }
        if (source.Permission != null) {
            this.Permission = new DocPermission(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Modifier.", this.Modifier);
        this.setParamObj(map, prefix + "Permission.", this.Permission);

    }
}

