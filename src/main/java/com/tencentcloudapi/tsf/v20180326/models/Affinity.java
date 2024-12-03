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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Affinity extends AbstractModel {

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private String Weight;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paths")
    @Expose
    private CommonOption [] Paths;

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeight() {
        return this.Weight;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paths -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonOption [] getPaths() {
        return this.Paths;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paths -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaths(CommonOption [] Paths) {
        this.Paths = Paths;
    }

    public Affinity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Affinity(Affinity source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Weight != null) {
            this.Weight = new String(source.Weight);
        }
        if (source.Paths != null) {
            this.Paths = new CommonOption[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new CommonOption(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

