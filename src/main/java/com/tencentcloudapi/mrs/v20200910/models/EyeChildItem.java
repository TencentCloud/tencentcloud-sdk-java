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

public class EyeChildItem extends AbstractModel{

    /**
    * 球镜
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sph")
    @Expose
    private BaseItem3 [] Sph;

    /**
    * 柱镜
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cyl")
    @Expose
    private BaseItem3 [] Cyl;

    /**
    * 轴位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ax")
    @Expose
    private BaseItem3 [] Ax;

    /**
    * 等效球镜
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Se")
    @Expose
    private BaseItem2 Se;

    /**
     * Get 球镜
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sph 球镜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem3 [] getSph() {
        return this.Sph;
    }

    /**
     * Set 球镜
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sph 球镜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSph(BaseItem3 [] Sph) {
        this.Sph = Sph;
    }

    /**
     * Get 柱镜
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cyl 柱镜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem3 [] getCyl() {
        return this.Cyl;
    }

    /**
     * Set 柱镜
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cyl 柱镜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCyl(BaseItem3 [] Cyl) {
        this.Cyl = Cyl;
    }

    /**
     * Get 轴位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ax 轴位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem3 [] getAx() {
        return this.Ax;
    }

    /**
     * Set 轴位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ax 轴位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAx(BaseItem3 [] Ax) {
        this.Ax = Ax;
    }

    /**
     * Get 等效球镜
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Se 等效球镜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem2 getSe() {
        return this.Se;
    }

    /**
     * Set 等效球镜
注意：此字段可能返回 null，表示取不到有效值。
     * @param Se 等效球镜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSe(BaseItem2 Se) {
        this.Se = Se;
    }

    public EyeChildItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EyeChildItem(EyeChildItem source) {
        if (source.Sph != null) {
            this.Sph = new BaseItem3[source.Sph.length];
            for (int i = 0; i < source.Sph.length; i++) {
                this.Sph[i] = new BaseItem3(source.Sph[i]);
            }
        }
        if (source.Cyl != null) {
            this.Cyl = new BaseItem3[source.Cyl.length];
            for (int i = 0; i < source.Cyl.length; i++) {
                this.Cyl[i] = new BaseItem3(source.Cyl[i]);
            }
        }
        if (source.Ax != null) {
            this.Ax = new BaseItem3[source.Ax.length];
            for (int i = 0; i < source.Ax.length; i++) {
                this.Ax[i] = new BaseItem3(source.Ax[i]);
            }
        }
        if (source.Se != null) {
            this.Se = new BaseItem2(source.Se);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Sph.", this.Sph);
        this.setParamArrayObj(map, prefix + "Cyl.", this.Cyl);
        this.setParamArrayObj(map, prefix + "Ax.", this.Ax);
        this.setParamObj(map, prefix + "Se.", this.Se);

    }
}

