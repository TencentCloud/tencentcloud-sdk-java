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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSpec extends AbstractModel {

    /**
    * 规格简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecAlias")
    @Expose
    private String SpecAlias;

    /**
    * 规格Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
     * Get 规格简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecAlias 规格简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecAlias() {
        return this.SpecAlias;
    }

    /**
     * Set 规格简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecAlias 规格简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecAlias(String SpecAlias) {
        this.SpecAlias = SpecAlias;
    }

    /**
     * Get 规格Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecId 规格Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 规格Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecId 规格Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    public ResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpec(ResourceSpec source) {
        if (source.SpecAlias != null) {
            this.SpecAlias = new String(source.SpecAlias);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecAlias", this.SpecAlias);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);

    }
}

