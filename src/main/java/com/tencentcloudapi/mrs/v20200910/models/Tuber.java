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

public class Tuber extends AbstractModel{

    /**
    * 部位信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private Attribute Part;

    /**
    * 类型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Attribute Type;

    /**
    * 大小信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeList")
    @Expose
    private Attribute [] SizeList;

    /**
    * 形态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shape")
    @Expose
    private Attribute Shape;

    /**
    * 边缘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Edge")
    @Expose
    private Attribute Edge;

    /**
    * CDFI信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CDFI")
    @Expose
    private Attribute CDFI;

    /**
    * 代谢信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metabolism")
    @Expose
    private Attribute Metabolism;

    /**
    * 淋巴结信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphGland")
    @Expose
    private Attribute LymphGland;

    /**
    * 淋巴门信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphDoor")
    @Expose
    private Attribute LymphDoor;

    /**
    * 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkinMedulla")
    @Expose
    private Attribute SkinMedulla;

    /**
    * 内部回声信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerEcho")
    @Expose
    private Attribute InnerEcho;

    /**
    * 外部回声信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RearEcho")
    @Expose
    private Attribute RearEcho;

    /**
    * 包膜信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envelope")
    @Expose
    private Attribute Envelope;

    /**
    * 钙化信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Calcification")
    @Expose
    private Attribute Calcification;

    /**
    * 强化信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enhancement")
    @Expose
    private Attribute Enhancement;

    /**
    * 纵横比信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AspectRatio")
    @Expose
    private Attribute AspectRatio;

    /**
     * Get 部位信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getPart() {
        return this.Part;
    }

    /**
     * Set 部位信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(Attribute Part) {
        this.Part = Part;
    }

    /**
     * Get 类型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getType() {
        return this.Type;
    }

    /**
     * Set 类型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Attribute Type) {
        this.Type = Type;
    }

    /**
     * Get 大小信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeList 大小信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute [] getSizeList() {
        return this.SizeList;
    }

    /**
     * Set 大小信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeList 大小信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeList(Attribute [] SizeList) {
        this.SizeList = SizeList;
    }

    /**
     * Get 形态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shape 形态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getShape() {
        return this.Shape;
    }

    /**
     * Set 形态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shape 形态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShape(Attribute Shape) {
        this.Shape = Shape;
    }

    /**
     * Get 边缘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Edge 边缘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getEdge() {
        return this.Edge;
    }

    /**
     * Set 边缘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Edge 边缘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdge(Attribute Edge) {
        this.Edge = Edge;
    }

    /**
     * Get CDFI信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CDFI CDFI信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getCDFI() {
        return this.CDFI;
    }

    /**
     * Set CDFI信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CDFI CDFI信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCDFI(Attribute CDFI) {
        this.CDFI = CDFI;
    }

    /**
     * Get 代谢信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metabolism 代谢信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getMetabolism() {
        return this.Metabolism;
    }

    /**
     * Set 代谢信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metabolism 代谢信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetabolism(Attribute Metabolism) {
        this.Metabolism = Metabolism;
    }

    /**
     * Get 淋巴结信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphGland 淋巴结信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getLymphGland() {
        return this.LymphGland;
    }

    /**
     * Set 淋巴结信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphGland 淋巴结信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphGland(Attribute LymphGland) {
        this.LymphGland = LymphGland;
    }

    /**
     * Get 淋巴门信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphDoor 淋巴门信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getLymphDoor() {
        return this.LymphDoor;
    }

    /**
     * Set 淋巴门信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphDoor 淋巴门信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphDoor(Attribute LymphDoor) {
        this.LymphDoor = LymphDoor;
    }

    /**
     * Get 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkinMedulla 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getSkinMedulla() {
        return this.SkinMedulla;
    }

    /**
     * Set 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkinMedulla 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkinMedulla(Attribute SkinMedulla) {
        this.SkinMedulla = SkinMedulla;
    }

    /**
     * Get 内部回声信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerEcho 内部回声信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getInnerEcho() {
        return this.InnerEcho;
    }

    /**
     * Set 内部回声信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerEcho 内部回声信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerEcho(Attribute InnerEcho) {
        this.InnerEcho = InnerEcho;
    }

    /**
     * Get 外部回声信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RearEcho 外部回声信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getRearEcho() {
        return this.RearEcho;
    }

    /**
     * Set 外部回声信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RearEcho 外部回声信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRearEcho(Attribute RearEcho) {
        this.RearEcho = RearEcho;
    }

    /**
     * Get 包膜信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envelope 包膜信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getEnvelope() {
        return this.Envelope;
    }

    /**
     * Set 包膜信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envelope 包膜信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvelope(Attribute Envelope) {
        this.Envelope = Envelope;
    }

    /**
     * Get 钙化信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Calcification 钙化信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getCalcification() {
        return this.Calcification;
    }

    /**
     * Set 钙化信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Calcification 钙化信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcification(Attribute Calcification) {
        this.Calcification = Calcification;
    }

    /**
     * Get 强化信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enhancement 强化信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getEnhancement() {
        return this.Enhancement;
    }

    /**
     * Set 强化信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enhancement 强化信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhancement(Attribute Enhancement) {
        this.Enhancement = Enhancement;
    }

    /**
     * Get 纵横比信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AspectRatio 纵横比信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 纵横比信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AspectRatio 纵横比信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAspectRatio(Attribute AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    public Tuber() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tuber(Tuber source) {
        if (source.Part != null) {
            this.Part = new Attribute(source.Part);
        }
        if (source.Type != null) {
            this.Type = new Attribute(source.Type);
        }
        if (source.SizeList != null) {
            this.SizeList = new Attribute[source.SizeList.length];
            for (int i = 0; i < source.SizeList.length; i++) {
                this.SizeList[i] = new Attribute(source.SizeList[i]);
            }
        }
        if (source.Shape != null) {
            this.Shape = new Attribute(source.Shape);
        }
        if (source.Edge != null) {
            this.Edge = new Attribute(source.Edge);
        }
        if (source.CDFI != null) {
            this.CDFI = new Attribute(source.CDFI);
        }
        if (source.Metabolism != null) {
            this.Metabolism = new Attribute(source.Metabolism);
        }
        if (source.LymphGland != null) {
            this.LymphGland = new Attribute(source.LymphGland);
        }
        if (source.LymphDoor != null) {
            this.LymphDoor = new Attribute(source.LymphDoor);
        }
        if (source.SkinMedulla != null) {
            this.SkinMedulla = new Attribute(source.SkinMedulla);
        }
        if (source.InnerEcho != null) {
            this.InnerEcho = new Attribute(source.InnerEcho);
        }
        if (source.RearEcho != null) {
            this.RearEcho = new Attribute(source.RearEcho);
        }
        if (source.Envelope != null) {
            this.Envelope = new Attribute(source.Envelope);
        }
        if (source.Calcification != null) {
            this.Calcification = new Attribute(source.Calcification);
        }
        if (source.Enhancement != null) {
            this.Enhancement = new Attribute(source.Enhancement);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new Attribute(source.AspectRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamObj(map, prefix + "Type.", this.Type);
        this.setParamArrayObj(map, prefix + "SizeList.", this.SizeList);
        this.setParamObj(map, prefix + "Shape.", this.Shape);
        this.setParamObj(map, prefix + "Edge.", this.Edge);
        this.setParamObj(map, prefix + "CDFI.", this.CDFI);
        this.setParamObj(map, prefix + "Metabolism.", this.Metabolism);
        this.setParamObj(map, prefix + "LymphGland.", this.LymphGland);
        this.setParamObj(map, prefix + "LymphDoor.", this.LymphDoor);
        this.setParamObj(map, prefix + "SkinMedulla.", this.SkinMedulla);
        this.setParamObj(map, prefix + "InnerEcho.", this.InnerEcho);
        this.setParamObj(map, prefix + "RearEcho.", this.RearEcho);
        this.setParamObj(map, prefix + "Envelope.", this.Envelope);
        this.setParamObj(map, prefix + "Calcification.", this.Calcification);
        this.setParamObj(map, prefix + "Enhancement.", this.Enhancement);
        this.setParamObj(map, prefix + "AspectRatio.", this.AspectRatio);

    }
}

