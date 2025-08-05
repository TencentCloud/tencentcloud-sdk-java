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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VmInstanceResourceConfig extends AbstractModel {

    /**
    * 实例导入方式，可多个，公有云为 ["R", "M"]，独立版的取值仅有 "M" 脚本模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportMode")
    @Expose
    private String [] ImportMode;

    /**
     * Get 实例导入方式，可多个，公有云为 ["R", "M"]，独立版的取值仅有 "M" 脚本模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportMode 实例导入方式，可多个，公有云为 ["R", "M"]，独立版的取值仅有 "M" 脚本模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImportMode() {
        return this.ImportMode;
    }

    /**
     * Set 实例导入方式，可多个，公有云为 ["R", "M"]，独立版的取值仅有 "M" 脚本模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportMode 实例导入方式，可多个，公有云为 ["R", "M"]，独立版的取值仅有 "M" 脚本模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportMode(String [] ImportMode) {
        this.ImportMode = ImportMode;
    }

    public VmInstanceResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VmInstanceResourceConfig(VmInstanceResourceConfig source) {
        if (source.ImportMode != null) {
            this.ImportMode = new String[source.ImportMode.length];
            for (int i = 0; i < source.ImportMode.length; i++) {
                this.ImportMode[i] = new String(source.ImportMode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImportMode.", this.ImportMode);

    }
}

