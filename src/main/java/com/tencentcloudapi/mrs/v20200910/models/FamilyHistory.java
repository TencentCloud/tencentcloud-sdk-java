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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FamilyHistory extends AbstractModel{

    /**
    * 家族成员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeMember")
    @Expose
    private String RelativeMember;

    /**
    * 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeCancer")
    @Expose
    private String RelativeCancer;

    /**
    * 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Genetic")
    @Expose
    private String Genetic;

    /**
     * Get 家族成员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeMember 家族成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelativeMember() {
        return this.RelativeMember;
    }

    /**
     * Set 家族成员
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeMember 家族成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeMember(String RelativeMember) {
        this.RelativeMember = RelativeMember;
    }

    /**
     * Get 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeCancer 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelativeCancer() {
        return this.RelativeCancer;
    }

    /**
     * Set 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeCancer 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeCancer(String RelativeCancer) {
        this.RelativeCancer = RelativeCancer;
    }

    /**
     * Get 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Genetic 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGenetic() {
        return this.Genetic;
    }

    /**
     * Set 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Genetic 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenetic(String Genetic) {
        this.Genetic = Genetic;
    }

    public FamilyHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FamilyHistory(FamilyHistory source) {
        if (source.RelativeMember != null) {
            this.RelativeMember = new String(source.RelativeMember);
        }
        if (source.RelativeCancer != null) {
            this.RelativeCancer = new String(source.RelativeCancer);
        }
        if (source.Genetic != null) {
            this.Genetic = new String(source.Genetic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelativeMember", this.RelativeMember);
        this.setParamSimple(map, prefix + "RelativeCancer", this.RelativeCancer);
        this.setParamSimple(map, prefix + "Genetic", this.Genetic);

    }
}

