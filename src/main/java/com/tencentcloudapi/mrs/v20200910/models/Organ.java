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
    * 包膜
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envelope")
    @Expose
    private BlockInfo Envelope;

    /**
    * 边缘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Edge")
    @Expose
    private BlockInfo Edge;

    /**
    * 内部回声
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerEcho")
    @Expose
    private BlockInfo InnerEcho;

    /**
    * 腺体
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gland")
    @Expose
    private BlockInfo Gland;

    /**
    * 形状
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shape")
    @Expose
    private BlockInfo Shape;

    /**
    * 厚度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Thickness")
    @Expose
    private BlockInfo Thickness;

    /**
    * 形态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShapeAttr")
    @Expose
    private BlockInfo ShapeAttr;

    /**
    * 血液cdfi
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CDFI")
    @Expose
    private BlockInfo CDFI;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SymDesc")
    @Expose
    private BlockInfo SymDesc;

    /**
    * 大小状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeStatus")
    @Expose
    private BlockInfo SizeStatus;

    /**
    * 轮廓
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Outline")
    @Expose
    private BlockInfo Outline;

    /**
    * 结构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Structure")
    @Expose
    private BlockInfo Structure;

    /**
    * 密度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Density")
    @Expose
    private BlockInfo Density;

    /**
    * 血管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vas")
    @Expose
    private BlockInfo Vas;

    /**
    * 囊壁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cysticwall")
    @Expose
    private BlockInfo Cysticwall;

    /**
    * 被膜
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Capsule")
    @Expose
    private BlockInfo Capsule;

    /**
    * 峡部厚度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsthmusThicknese")
    @Expose
    private Size IsthmusThicknese;

    /**
    * 内部回声分布
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
    * 透声度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transparent")
    @Expose
    private BlockInfo Transparent;

    /**
    * MRI ADC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MriAdc")
    @Expose
    private BlockInfo MriAdc;

    /**
    * MRI DWI
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MriDwi")
    @Expose
    private BlockInfo MriDwi;

    /**
    * MRI T1信号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MriT1")
    @Expose
    private BlockInfo MriT1;

    /**
    * MRI T2信号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MriT2")
    @Expose
    private BlockInfo MriT2;

    /**
    * CT HU值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CtHu")
    @Expose
    private BlockInfo CtHu;

    /**
    * SUmax值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suvmax")
    @Expose
    private BlockInfo Suvmax;

    /**
    * 代谢情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metabolism")
    @Expose
    private BlockInfo Metabolism;

    /**
    * 放射性摄取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RadioactiveUptake")
    @Expose
    private BlockInfo RadioactiveUptake;

    /**
    * 淋巴结情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphEnlargement")
    @Expose
    private BlockInfo LymphEnlargement;

    /**
    * 影像特征
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageFeature")
    @Expose
    private BlockInfo ImageFeature;

    /**
    * 导管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duct")
    @Expose
    private BlockInfo Duct;

    /**
    * 趋势
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trend")
    @Expose
    private BlockInfo Trend;

    /**
    * 手术情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private BlockInfo Operation;

    /**
    * 器官在报告图片中的坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

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
     * Get 包膜
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envelope 包膜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getEnvelope() {
        return this.Envelope;
    }

    /**
     * Set 包膜
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envelope 包膜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvelope(BlockInfo Envelope) {
        this.Envelope = Envelope;
    }

    /**
     * Get 边缘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Edge 边缘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getEdge() {
        return this.Edge;
    }

    /**
     * Set 边缘
注意：此字段可能返回 null，表示取不到有效值。
     * @param Edge 边缘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdge(BlockInfo Edge) {
        this.Edge = Edge;
    }

    /**
     * Get 内部回声
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerEcho 内部回声
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getInnerEcho() {
        return this.InnerEcho;
    }

    /**
     * Set 内部回声
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerEcho 内部回声
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerEcho(BlockInfo InnerEcho) {
        this.InnerEcho = InnerEcho;
    }

    /**
     * Get 腺体
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gland 腺体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getGland() {
        return this.Gland;
    }

    /**
     * Set 腺体
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gland 腺体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGland(BlockInfo Gland) {
        this.Gland = Gland;
    }

    /**
     * Get 形状
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Shape 形状
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getShape() {
        return this.Shape;
    }

    /**
     * Set 形状
注意：此字段可能返回 null，表示取不到有效值。
     * @param Shape 形状
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShape(BlockInfo Shape) {
        this.Shape = Shape;
    }

    /**
     * Get 厚度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Thickness 厚度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getThickness() {
        return this.Thickness;
    }

    /**
     * Set 厚度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Thickness 厚度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThickness(BlockInfo Thickness) {
        this.Thickness = Thickness;
    }

    /**
     * Get 形态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShapeAttr 形态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getShapeAttr() {
        return this.ShapeAttr;
    }

    /**
     * Set 形态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShapeAttr 形态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShapeAttr(BlockInfo ShapeAttr) {
        this.ShapeAttr = ShapeAttr;
    }

    /**
     * Get 血液cdfi
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CDFI 血液cdfi
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCDFI() {
        return this.CDFI;
    }

    /**
     * Set 血液cdfi
注意：此字段可能返回 null，表示取不到有效值。
     * @param CDFI 血液cdfi
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCDFI(BlockInfo CDFI) {
        this.CDFI = CDFI;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SymDesc 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getSymDesc() {
        return this.SymDesc;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SymDesc 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymDesc(BlockInfo SymDesc) {
        this.SymDesc = SymDesc;
    }

    /**
     * Get 大小状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SizeStatus 大小状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getSizeStatus() {
        return this.SizeStatus;
    }

    /**
     * Set 大小状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SizeStatus 大小状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSizeStatus(BlockInfo SizeStatus) {
        this.SizeStatus = SizeStatus;
    }

    /**
     * Get 轮廓
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Outline 轮廓
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getOutline() {
        return this.Outline;
    }

    /**
     * Set 轮廓
注意：此字段可能返回 null，表示取不到有效值。
     * @param Outline 轮廓
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutline(BlockInfo Outline) {
        this.Outline = Outline;
    }

    /**
     * Get 结构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Structure 结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getStructure() {
        return this.Structure;
    }

    /**
     * Set 结构
注意：此字段可能返回 null，表示取不到有效值。
     * @param Structure 结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStructure(BlockInfo Structure) {
        this.Structure = Structure;
    }

    /**
     * Get 密度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Density 密度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getDensity() {
        return this.Density;
    }

    /**
     * Set 密度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Density 密度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDensity(BlockInfo Density) {
        this.Density = Density;
    }

    /**
     * Get 血管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vas 血管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getVas() {
        return this.Vas;
    }

    /**
     * Set 血管
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vas 血管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVas(BlockInfo Vas) {
        this.Vas = Vas;
    }

    /**
     * Get 囊壁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cysticwall 囊壁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCysticwall() {
        return this.Cysticwall;
    }

    /**
     * Set 囊壁
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cysticwall 囊壁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCysticwall(BlockInfo Cysticwall) {
        this.Cysticwall = Cysticwall;
    }

    /**
     * Get 被膜
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Capsule 被膜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCapsule() {
        return this.Capsule;
    }

    /**
     * Set 被膜
注意：此字段可能返回 null，表示取不到有效值。
     * @param Capsule 被膜
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapsule(BlockInfo Capsule) {
        this.Capsule = Capsule;
    }

    /**
     * Get 峡部厚度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsthmusThicknese 峡部厚度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size getIsthmusThicknese() {
        return this.IsthmusThicknese;
    }

    /**
     * Set 峡部厚度
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsthmusThicknese 峡部厚度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsthmusThicknese(Size IsthmusThicknese) {
        this.IsthmusThicknese = IsthmusThicknese;
    }

    /**
     * Get 内部回声分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerEchoDistribution 内部回声分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getInnerEchoDistribution() {
        return this.InnerEchoDistribution;
    }

    /**
     * Set 内部回声分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerEchoDistribution 内部回声分布
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

    /**
     * Get 透声度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transparent 透声度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getTransparent() {
        return this.Transparent;
    }

    /**
     * Set 透声度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transparent 透声度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransparent(BlockInfo Transparent) {
        this.Transparent = Transparent;
    }

    /**
     * Get MRI ADC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MriAdc MRI ADC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getMriAdc() {
        return this.MriAdc;
    }

    /**
     * Set MRI ADC
注意：此字段可能返回 null，表示取不到有效值。
     * @param MriAdc MRI ADC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMriAdc(BlockInfo MriAdc) {
        this.MriAdc = MriAdc;
    }

    /**
     * Get MRI DWI
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MriDwi MRI DWI
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getMriDwi() {
        return this.MriDwi;
    }

    /**
     * Set MRI DWI
注意：此字段可能返回 null，表示取不到有效值。
     * @param MriDwi MRI DWI
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMriDwi(BlockInfo MriDwi) {
        this.MriDwi = MriDwi;
    }

    /**
     * Get MRI T1信号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MriT1 MRI T1信号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getMriT1() {
        return this.MriT1;
    }

    /**
     * Set MRI T1信号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MriT1 MRI T1信号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMriT1(BlockInfo MriT1) {
        this.MriT1 = MriT1;
    }

    /**
     * Get MRI T2信号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MriT2 MRI T2信号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getMriT2() {
        return this.MriT2;
    }

    /**
     * Set MRI T2信号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MriT2 MRI T2信号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMriT2(BlockInfo MriT2) {
        this.MriT2 = MriT2;
    }

    /**
     * Get CT HU值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CtHu CT HU值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCtHu() {
        return this.CtHu;
    }

    /**
     * Set CT HU值
注意：此字段可能返回 null，表示取不到有效值。
     * @param CtHu CT HU值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCtHu(BlockInfo CtHu) {
        this.CtHu = CtHu;
    }

    /**
     * Get SUmax值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suvmax SUmax值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getSuvmax() {
        return this.Suvmax;
    }

    /**
     * Set SUmax值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suvmax SUmax值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuvmax(BlockInfo Suvmax) {
        this.Suvmax = Suvmax;
    }

    /**
     * Get 代谢情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metabolism 代谢情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getMetabolism() {
        return this.Metabolism;
    }

    /**
     * Set 代谢情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metabolism 代谢情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetabolism(BlockInfo Metabolism) {
        this.Metabolism = Metabolism;
    }

    /**
     * Get 放射性摄取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RadioactiveUptake 放射性摄取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getRadioactiveUptake() {
        return this.RadioactiveUptake;
    }

    /**
     * Set 放射性摄取
注意：此字段可能返回 null，表示取不到有效值。
     * @param RadioactiveUptake 放射性摄取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRadioactiveUptake(BlockInfo RadioactiveUptake) {
        this.RadioactiveUptake = RadioactiveUptake;
    }

    /**
     * Get 淋巴结情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphEnlargement 淋巴结情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getLymphEnlargement() {
        return this.LymphEnlargement;
    }

    /**
     * Set 淋巴结情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphEnlargement 淋巴结情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphEnlargement(BlockInfo LymphEnlargement) {
        this.LymphEnlargement = LymphEnlargement;
    }

    /**
     * Get 影像特征
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageFeature 影像特征
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getImageFeature() {
        return this.ImageFeature;
    }

    /**
     * Set 影像特征
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageFeature 影像特征
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageFeature(BlockInfo ImageFeature) {
        this.ImageFeature = ImageFeature;
    }

    /**
     * Get 导管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duct 导管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getDuct() {
        return this.Duct;
    }

    /**
     * Set 导管
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duct 导管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuct(BlockInfo Duct) {
        this.Duct = Duct;
    }

    /**
     * Get 趋势
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trend 趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getTrend() {
        return this.Trend;
    }

    /**
     * Set 趋势
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trend 趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrend(BlockInfo Trend) {
        this.Trend = Trend;
    }

    /**
     * Get 手术情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation 手术情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getOperation() {
        return this.Operation;
    }

    /**
     * Set 手术情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation 手术情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(BlockInfo Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 器官在报告图片中的坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coords 器官在报告图片中的坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 器官在报告图片中的坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coords 器官在报告图片中的坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
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
        if (source.Transparent != null) {
            this.Transparent = new BlockInfo(source.Transparent);
        }
        if (source.MriAdc != null) {
            this.MriAdc = new BlockInfo(source.MriAdc);
        }
        if (source.MriDwi != null) {
            this.MriDwi = new BlockInfo(source.MriDwi);
        }
        if (source.MriT1 != null) {
            this.MriT1 = new BlockInfo(source.MriT1);
        }
        if (source.MriT2 != null) {
            this.MriT2 = new BlockInfo(source.MriT2);
        }
        if (source.CtHu != null) {
            this.CtHu = new BlockInfo(source.CtHu);
        }
        if (source.Suvmax != null) {
            this.Suvmax = new BlockInfo(source.Suvmax);
        }
        if (source.Metabolism != null) {
            this.Metabolism = new BlockInfo(source.Metabolism);
        }
        if (source.RadioactiveUptake != null) {
            this.RadioactiveUptake = new BlockInfo(source.RadioactiveUptake);
        }
        if (source.LymphEnlargement != null) {
            this.LymphEnlargement = new BlockInfo(source.LymphEnlargement);
        }
        if (source.ImageFeature != null) {
            this.ImageFeature = new BlockInfo(source.ImageFeature);
        }
        if (source.Duct != null) {
            this.Duct = new BlockInfo(source.Duct);
        }
        if (source.Trend != null) {
            this.Trend = new BlockInfo(source.Trend);
        }
        if (source.Operation != null) {
            this.Operation = new BlockInfo(source.Operation);
        }
        if (source.Coords != null) {
            this.Coords = new Coord[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coord(source.Coords[i]);
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
        this.setParamObj(map, prefix + "Transparent.", this.Transparent);
        this.setParamObj(map, prefix + "MriAdc.", this.MriAdc);
        this.setParamObj(map, prefix + "MriDwi.", this.MriDwi);
        this.setParamObj(map, prefix + "MriT1.", this.MriT1);
        this.setParamObj(map, prefix + "MriT2.", this.MriT2);
        this.setParamObj(map, prefix + "CtHu.", this.CtHu);
        this.setParamObj(map, prefix + "Suvmax.", this.Suvmax);
        this.setParamObj(map, prefix + "Metabolism.", this.Metabolism);
        this.setParamObj(map, prefix + "RadioactiveUptake.", this.RadioactiveUptake);
        this.setParamObj(map, prefix + "LymphEnlargement.", this.LymphEnlargement);
        this.setParamObj(map, prefix + "ImageFeature.", this.ImageFeature);
        this.setParamObj(map, prefix + "Duct.", this.Duct);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamObj(map, prefix + "Operation.", this.Operation);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

