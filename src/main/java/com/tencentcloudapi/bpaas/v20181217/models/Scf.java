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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scf extends AbstractModel{

    /**
    * Scf函数地域id
    */
    @SerializedName("ScfRegion")
    @Expose
    private String ScfRegion;

    /**
    * Scf函数地域
    */
    @SerializedName("ScfRegionName")
    @Expose
    private String ScfRegionName;

    /**
    * Scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfName")
    @Expose
    private String ScfName;

    /**
    * Scf函数入参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ScfParam [] Params;

    /**
     * Get Scf函数地域id 
     * @return ScfRegion Scf函数地域id
     */
    public String getScfRegion() {
        return this.ScfRegion;
    }

    /**
     * Set Scf函数地域id
     * @param ScfRegion Scf函数地域id
     */
    public void setScfRegion(String ScfRegion) {
        this.ScfRegion = ScfRegion;
    }

    /**
     * Get Scf函数地域 
     * @return ScfRegionName Scf函数地域
     */
    public String getScfRegionName() {
        return this.ScfRegionName;
    }

    /**
     * Set Scf函数地域
     * @param ScfRegionName Scf函数地域
     */
    public void setScfRegionName(String ScfRegionName) {
        this.ScfRegionName = ScfRegionName;
    }

    /**
     * Get Scf函数名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfName Scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScfName() {
        return this.ScfName;
    }

    /**
     * Set Scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfName Scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfName(String ScfName) {
        this.ScfName = ScfName;
    }

    /**
     * Get Scf函数入参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params Scf函数入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScfParam [] getParams() {
        return this.Params;
    }

    /**
     * Set Scf函数入参
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params Scf函数入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ScfParam [] Params) {
        this.Params = Params;
    }

    public Scf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Scf(Scf source) {
        if (source.ScfRegion != null) {
            this.ScfRegion = new String(source.ScfRegion);
        }
        if (source.ScfRegionName != null) {
            this.ScfRegionName = new String(source.ScfRegionName);
        }
        if (source.ScfName != null) {
            this.ScfName = new String(source.ScfName);
        }
        if (source.Params != null) {
            this.Params = new ScfParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ScfParam(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScfRegion", this.ScfRegion);
        this.setParamSimple(map, prefix + "ScfRegionName", this.ScfRegionName);
        this.setParamSimple(map, prefix + "ScfName", this.ScfName);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

