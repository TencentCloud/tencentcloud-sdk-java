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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleScopeInfo extends AbstractModel {

    /**
    * NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScopeDesc")
    @Expose
    private String ScopeDesc;

    /**
     * Get NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 生效范围描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScopeDesc 生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScopeDesc() {
        return this.ScopeDesc;
    }

    /**
     * Set 生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScopeDesc 生效范围描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScopeDesc(String ScopeDesc) {
        this.ScopeDesc = ScopeDesc;
    }

    public RuleScopeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleScopeInfo(RuleScopeInfo source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ScopeDesc != null) {
            this.ScopeDesc = new String(source.ScopeDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ScopeDesc", this.ScopeDesc);

    }
}

