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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptUserRuleScope extends AbstractModel{

    /**
    * 生效的模块

1. waf Waf防护
2. bot Bot防护
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modules")
    @Expose
    private String [] Modules;

    /**
     * Get 生效的模块

1. waf Waf防护
2. bot Bot防护
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modules 生效的模块

1. waf Waf防护
2. bot Bot防护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModules() {
        return this.Modules;
    }

    /**
     * Set 生效的模块

1. waf Waf防护
2. bot Bot防护
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modules 生效的模块

1. waf Waf防护
2. bot Bot防护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModules(String [] Modules) {
        this.Modules = Modules;
    }

    public ExceptUserRuleScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptUserRuleScope(ExceptUserRuleScope source) {
        if (source.Modules != null) {
            this.Modules = new String[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new String(source.Modules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Modules.", this.Modules);

    }
}

