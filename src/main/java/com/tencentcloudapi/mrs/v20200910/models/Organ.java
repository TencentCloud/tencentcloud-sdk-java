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

public class Organ extends AbstractModel{

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private Part Part;

    /**
    * 大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Size [] Size;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envelope")
    @Expose
    private BlockInfo Envelope;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Edge")
    @Expose
    private BlockInfo Edge;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerEcho")
    @Expose
    private BlockInfo InnerEcho;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gland")
    @Expose
    private BlockInfo Gland;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shape")
    @Expose
    private BlockInfo Shape;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Thickness")
    @Expose
    private BlockInfo Thickness;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShapeAttr")
    @Expose
    private BlockInfo ShapeAttr;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CDFI")
    @Expose
    private BlockInfo CDFI;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SymDesc")
    @Expose
    private BlockInfo SymDesc;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeStatus")
    @Expose
    private BlockInfo SizeStatus;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Outline")
    @Expose
    private BlockInfo Outline;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Structure")
    @Expose
    private BlockInfo Structure;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Density")
    @Expose
    private BlockInfo Density;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vas")
    @Expose
    private BlockInfo Vas;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cysticwall")
    @Expose
    private BlockInfo Cysticwall;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Capsule")
    @Expose
    private BlockInfo Capsule;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsthmusThicknese")
    @Expose
    private Size IsthmusThicknese;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerEchoDistribution")
    @Expose
    private BlockInfo InnerEchoDistribution;

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 原文位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Part getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(Part Part) {
        this.Part = Part;
    }

    /**
     * Get 大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size [] getSize() {
        return this.Size;
    }

    /**
     * Set 大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Size [] Size) {
        this.Size = Size;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envelope ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getEnvelope() {
        return this.Envelope;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envelope ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvelope(BlockInfo Envelope) {
        this.Envelope = Envelope;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Edge ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getEdge() {
        return this.Edge;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Edge ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdge(BlockInfo Edge) {
        this.Edge = Edge;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerEcho ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getInnerEcho() {
        return this.InnerEcho;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerEcho ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerEcho(BlockInfo InnerEcho) {
        this.InnerEcho = InnerEcho;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gland ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getGland() {
        return this.Gland;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gland ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGland(BlockInfo Gland) {
        this.Gland = Gland;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shape ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getShape() {
        return this.Shape;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shape ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShape(BlockInfo Shape) {
        this.Shape = Shape;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Thickness ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getThickness() {
        return this.Thickness;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Thickness ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThickness(BlockInfo Thickness) {
        this.Thickness = Thickness;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShapeAttr ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getShapeAttr() {
        return this.ShapeAttr;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShapeAttr ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShapeAttr(BlockInfo ShapeAttr) {
        this.ShapeAttr = ShapeAttr;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CDFI ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCDFI() {
        return this.CDFI;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param CDFI ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCDFI(BlockInfo CDFI) {
        this.CDFI = CDFI;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SymDesc ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getSymDesc() {
        return this.SymDesc;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param SymDesc ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymDesc(BlockInfo SymDesc) {
        this.SymDesc = SymDesc;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeStatus ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getSizeStatus() {
        return this.SizeStatus;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeStatus ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeStatus(BlockInfo SizeStatus) {
        this.SizeStatus = SizeStatus;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Outline ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getOutline() {
        return this.Outline;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Outline ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutline(BlockInfo Outline) {
        this.Outline = Outline;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Structure ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getStructure() {
        return this.Structure;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Structure ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStructure(BlockInfo Structure) {
        this.Structure = Structure;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Density ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getDensity() {
        return this.Density;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Density ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDensity(BlockInfo Density) {
        this.Density = Density;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vas ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getVas() {
        return this.Vas;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vas ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVas(BlockInfo Vas) {
        this.Vas = Vas;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cysticwall ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCysticwall() {
        return this.Cysticwall;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cysticwall ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCysticwall(BlockInfo Cysticwall) {
        this.Cysticwall = Cysticwall;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Capsule ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCapsule() {
        return this.Capsule;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Capsule ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapsule(BlockInfo Capsule) {
        this.Capsule = Capsule;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsthmusThicknese ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size getIsthmusThicknese() {
        return this.IsthmusThicknese;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsthmusThicknese ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsthmusThicknese(Size IsthmusThicknese) {
        this.IsthmusThicknese = IsthmusThicknese;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerEchoDistribution ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getInnerEchoDistribution() {
        return this.InnerEchoDistribution;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerEchoDistribution ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerEchoDistribution(BlockInfo InnerEchoDistribution) {
        this.InnerEchoDistribution = InnerEchoDistribution;
    }

    /**
     * Get 原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 原文位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 原文位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 原文位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 原文位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    public Organ() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Organ(Organ source) {
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Size != null) {
            this.Size = new Size[source.Size.length];
            for (int i = 0; i < source.Size.length; i++) {
                this.Size[i] = new Size(source.Size[i]);
            }
        }
        if (source.Envelope != null) {
            this.Envelope = new BlockInfo(source.Envelope);
        }
        if (source.Edge != null) {
            this.Edge = new BlockInfo(source.Edge);
        }
        if (source.InnerEcho != null) {
            this.InnerEcho = new BlockInfo(source.InnerEcho);
        }
        if (source.Gland != null) {
            this.Gland = new BlockInfo(source.Gland);
        }
        if (source.Shape != null) {
            this.Shape = new BlockInfo(source.Shape);
        }
        if (source.Thickness != null) {
            this.Thickness = new BlockInfo(source.Thickness);
        }
        if (source.ShapeAttr != null) {
            this.ShapeAttr = new BlockInfo(source.ShapeAttr);
        }
        if (source.CDFI != null) {
            this.CDFI = new BlockInfo(source.CDFI);
        }
        if (source.SymDesc != null) {
            this.SymDesc = new BlockInfo(source.SymDesc);
        }
        if (source.SizeStatus != null) {
            this.SizeStatus = new BlockInfo(source.SizeStatus);
        }
        if (source.Outline != null) {
            this.Outline = new BlockInfo(source.Outline);
        }
        if (source.Structure != null) {
            this.Structure = new BlockInfo(source.Structure);
        }
        if (source.Density != null) {
            this.Density = new BlockInfo(source.Density);
        }
        if (source.Vas != null) {
            this.Vas = new BlockInfo(source.Vas);
        }
        if (source.Cysticwall != null) {
            this.Cysticwall = new BlockInfo(source.Cysticwall);
        }
        if (source.Capsule != null) {
            this.Capsule = new BlockInfo(source.Capsule);
        }
        if (source.IsthmusThicknese != null) {
            this.IsthmusThicknese = new Size(source.IsthmusThicknese);
        }
        if (source.InnerEchoDistribution != null) {
            this.InnerEchoDistribution = new BlockInfo(source.InnerEchoDistribution);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamArrayObj(map, prefix + "Size.", this.Size);
        this.setParamObj(map, prefix + "Envelope.", this.Envelope);
        this.setParamObj(map, prefix + "Edge.", this.Edge);
        this.setParamObj(map, prefix + "InnerEcho.", this.InnerEcho);
        this.setParamObj(map, prefix + "Gland.", this.Gland);
        this.setParamObj(map, prefix + "Shape.", this.Shape);
        this.setParamObj(map, prefix + "Thickness.", this.Thickness);
        this.setParamObj(map, prefix + "ShapeAttr.", this.ShapeAttr);
        this.setParamObj(map, prefix + "CDFI.", this.CDFI);
        this.setParamObj(map, prefix + "SymDesc.", this.SymDesc);
        this.setParamObj(map, prefix + "SizeStatus.", this.SizeStatus);
        this.setParamObj(map, prefix + "Outline.", this.Outline);
        this.setParamObj(map, prefix + "Structure.", this.Structure);
        this.setParamObj(map, prefix + "Density.", this.Density);
        this.setParamObj(map, prefix + "Vas.", this.Vas);
        this.setParamObj(map, prefix + "Cysticwall.", this.Cysticwall);
        this.setParamObj(map, prefix + "Capsule.", this.Capsule);
        this.setParamObj(map, prefix + "IsthmusThicknese.", this.IsthmusThicknese);
        this.setParamObj(map, prefix + "InnerEchoDistribution.", this.InnerEchoDistribution);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);

    }
}

