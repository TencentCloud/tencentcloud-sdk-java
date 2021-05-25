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

public class NormPart extends AbstractModel{

    /**
    * 部位值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private String Part;

    /**
    * 部位方向
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartDirection")
    @Expose
    private String PartDirection;

    /**
    * 组织值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tissue")
    @Expose
    private String Tissue;

    /**
    * 组织方向
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TissueDirection")
    @Expose
    private String TissueDirection;

    /**
    * 上级部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Upper")
    @Expose
    private String Upper;

    /**
     * Get 部位值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPart() {
        return this.Part;
    }

    /**
     * Set 部位值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(String Part) {
        this.Part = Part;
    }

    /**
     * Get 部位方向
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartDirection 部位方向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartDirection() {
        return this.PartDirection;
    }

    /**
     * Set 部位方向
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartDirection 部位方向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartDirection(String PartDirection) {
        this.PartDirection = PartDirection;
    }

    /**
     * Get 组织值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tissue 组织值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTissue() {
        return this.Tissue;
    }

    /**
     * Set 组织值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tissue 组织值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTissue(String Tissue) {
        this.Tissue = Tissue;
    }

    /**
     * Get 组织方向
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TissueDirection 组织方向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTissueDirection() {
        return this.TissueDirection;
    }

    /**
     * Set 组织方向
注意：此字段可能返回 null，表示取不到有效值。
     * @param TissueDirection 组织方向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTissueDirection(String TissueDirection) {
        this.TissueDirection = TissueDirection;
    }

    /**
     * Get 上级部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Upper 上级部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpper() {
        return this.Upper;
    }

    /**
     * Set 上级部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Upper 上级部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpper(String Upper) {
        this.Upper = Upper;
    }

    public NormPart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormPart(NormPart source) {
        if (source.Part != null) {
            this.Part = new String(source.Part);
        }
        if (source.PartDirection != null) {
            this.PartDirection = new String(source.PartDirection);
        }
        if (source.Tissue != null) {
            this.Tissue = new String(source.Tissue);
        }
        if (source.TissueDirection != null) {
            this.TissueDirection = new String(source.TissueDirection);
        }
        if (source.Upper != null) {
            this.Upper = new String(source.Upper);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Part", this.Part);
        this.setParamSimple(map, prefix + "PartDirection", this.PartDirection);
        this.setParamSimple(map, prefix + "Tissue", this.Tissue);
        this.setParamSimple(map, prefix + "TissueDirection", this.TissueDirection);
        this.setParamSimple(map, prefix + "Upper", this.Upper);

    }
}

