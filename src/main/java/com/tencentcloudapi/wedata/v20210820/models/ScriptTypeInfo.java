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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScriptTypeInfo extends AbstractModel {

    /**
    * 脚本类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 脚本展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayDesc")
    @Expose
    private String DisplayDesc;

    /**
     * Get 脚本类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 脚本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 脚本类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 脚本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 脚本展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayDesc 脚本展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayDesc() {
        return this.DisplayDesc;
    }

    /**
     * Set 脚本展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayDesc 脚本展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayDesc(String DisplayDesc) {
        this.DisplayDesc = DisplayDesc;
    }

    public ScriptTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptTypeInfo(ScriptTypeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DisplayDesc != null) {
            this.DisplayDesc = new String(source.DisplayDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DisplayDesc", this.DisplayDesc);

    }
}

