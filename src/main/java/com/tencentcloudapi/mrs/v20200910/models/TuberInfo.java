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

public class TuberInfo extends AbstractModel{

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private BlockInfo Type;

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
    * 多发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Multiple")
    @Expose
    private Multiple Multiple;

    /**
    * 纵横比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AspectRatio")
    @Expose
    private AspectRatio AspectRatio;

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
    * 外部回声
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RearEcho")
    @Expose
    private BlockInfo RearEcho;

    /**
    * 弹性质地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elastic")
    @Expose
    private Elastic Elastic;

    /**
    * 形状
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Shape")
    @Expose
    private BlockInfo Shape;

    /**
    * 形态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShapeAttr")
    @Expose
    private BlockInfo ShapeAttr;

    /**
    * 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkinMedulla")
    @Expose
    private BlockInfo SkinMedulla;

    /**
    * 变化趋势
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trend")
    @Expose
    private BlockInfo Trend;

    /**
    * 钙化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Calcification")
    @Expose
    private BlockInfo Calcification;

    /**
    * 包膜
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envelope")
    @Expose
    private BlockInfo Envelope;

    /**
    * 强化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enhancement")
    @Expose
    private BlockInfo Enhancement;

    /**
    * 淋巴结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphEnlargement")
    @Expose
    private BlockInfo LymphEnlargement;

    /**
    * 淋巴门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphDoor")
    @Expose
    private BlockInfo LymphDoor;

    /**
    * 活动度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Activity")
    @Expose
    private BlockInfo Activity;

    /**
    * 手术情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private BlockInfo Operation;

    /**
    * 血液cdfi
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CDFI")
    @Expose
    private BlockInfo CDFI;

    /**
    * 原文位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 大小状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SizeStatus")
    @Expose
    private BlockInfo SizeStatus;

    /**
    * 内部回声分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerEchoDistribution")
    @Expose
    private BlockInfo InnerEchoDistribution;

    /**
    * 内部回声类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerEchoType")
    @Expose
    private BlockInfo [] InnerEchoType;

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
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(BlockInfo Type) {
        this.Type = Type;
    }

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
     * Get 多发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Multiple 多发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Multiple getMultiple() {
        return this.Multiple;
    }

    /**
     * Set 多发
注意：此字段可能返回 null，表示取不到有效值。
     * @param Multiple 多发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiple(Multiple Multiple) {
        this.Multiple = Multiple;
    }

    /**
     * Get 纵横比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AspectRatio 纵横比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AspectRatio getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 纵横比
注意：此字段可能返回 null，表示取不到有效值。
     * @param AspectRatio 纵横比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAspectRatio(AspectRatio AspectRatio) {
        this.AspectRatio = AspectRatio;
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
     * Get 外部回声
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RearEcho 外部回声
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getRearEcho() {
        return this.RearEcho;
    }

    /**
     * Set 外部回声
注意：此字段可能返回 null，表示取不到有效值。
     * @param RearEcho 外部回声
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRearEcho(BlockInfo RearEcho) {
        this.RearEcho = RearEcho;
    }

    /**
     * Get 弹性质地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elastic 弹性质地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Elastic getElastic() {
        return this.Elastic;
    }

    /**
     * Set 弹性质地
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elastic 弹性质地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElastic(Elastic Elastic) {
        this.Elastic = Elastic;
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
     * Get 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkinMedulla 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getSkinMedulla() {
        return this.SkinMedulla;
    }

    /**
     * Set 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkinMedulla 皮髓质信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkinMedulla(BlockInfo SkinMedulla) {
        this.SkinMedulla = SkinMedulla;
    }

    /**
     * Get 变化趋势
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trend 变化趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getTrend() {
        return this.Trend;
    }

    /**
     * Set 变化趋势
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trend 变化趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrend(BlockInfo Trend) {
        this.Trend = Trend;
    }

    /**
     * Get 钙化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Calcification 钙化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getCalcification() {
        return this.Calcification;
    }

    /**
     * Set 钙化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Calcification 钙化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcification(BlockInfo Calcification) {
        this.Calcification = Calcification;
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
     * Get 强化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enhancement 强化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getEnhancement() {
        return this.Enhancement;
    }

    /**
     * Set 强化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enhancement 强化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhancement(BlockInfo Enhancement) {
        this.Enhancement = Enhancement;
    }

    /**
     * Get 淋巴结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphEnlargement 淋巴结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getLymphEnlargement() {
        return this.LymphEnlargement;
    }

    /**
     * Set 淋巴结
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphEnlargement 淋巴结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphEnlargement(BlockInfo LymphEnlargement) {
        this.LymphEnlargement = LymphEnlargement;
    }

    /**
     * Get 淋巴门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphDoor 淋巴门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getLymphDoor() {
        return this.LymphDoor;
    }

    /**
     * Set 淋巴门
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphDoor 淋巴门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphDoor(BlockInfo LymphDoor) {
        this.LymphDoor = LymphDoor;
    }

    /**
     * Get 活动度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Activity 活动度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getActivity() {
        return this.Activity;
    }

    /**
     * Set 活动度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Activity 活动度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivity(BlockInfo Activity) {
        this.Activity = Activity;
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
     * Get 内部回声类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerEchoType 内部回声类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo [] getInnerEchoType() {
        return this.InnerEchoType;
    }

    /**
     * Set 内部回声类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerEchoType 内部回声类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerEchoType(BlockInfo [] InnerEchoType) {
        this.InnerEchoType = InnerEchoType;
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

    public TuberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TuberInfo(TuberInfo source) {
        if (source.Type != null) {
            this.Type = new BlockInfo(source.Type);
        }
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Size != null) {
            this.Size = new Size[source.Size.length];
            for (int i = 0; i < source.Size.length; i++) {
                this.Size[i] = new Size(source.Size[i]);
            }
        }
        if (source.Multiple != null) {
            this.Multiple = new Multiple(source.Multiple);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new AspectRatio(source.AspectRatio);
        }
        if (source.Edge != null) {
            this.Edge = new BlockInfo(source.Edge);
        }
        if (source.InnerEcho != null) {
            this.InnerEcho = new BlockInfo(source.InnerEcho);
        }
        if (source.RearEcho != null) {
            this.RearEcho = new BlockInfo(source.RearEcho);
        }
        if (source.Elastic != null) {
            this.Elastic = new Elastic(source.Elastic);
        }
        if (source.Shape != null) {
            this.Shape = new BlockInfo(source.Shape);
        }
        if (source.ShapeAttr != null) {
            this.ShapeAttr = new BlockInfo(source.ShapeAttr);
        }
        if (source.SkinMedulla != null) {
            this.SkinMedulla = new BlockInfo(source.SkinMedulla);
        }
        if (source.Trend != null) {
            this.Trend = new BlockInfo(source.Trend);
        }
        if (source.Calcification != null) {
            this.Calcification = new BlockInfo(source.Calcification);
        }
        if (source.Envelope != null) {
            this.Envelope = new BlockInfo(source.Envelope);
        }
        if (source.Enhancement != null) {
            this.Enhancement = new BlockInfo(source.Enhancement);
        }
        if (source.LymphEnlargement != null) {
            this.LymphEnlargement = new BlockInfo(source.LymphEnlargement);
        }
        if (source.LymphDoor != null) {
            this.LymphDoor = new BlockInfo(source.LymphDoor);
        }
        if (source.Activity != null) {
            this.Activity = new BlockInfo(source.Activity);
        }
        if (source.Operation != null) {
            this.Operation = new BlockInfo(source.Operation);
        }
        if (source.CDFI != null) {
            this.CDFI = new BlockInfo(source.CDFI);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.SizeStatus != null) {
            this.SizeStatus = new BlockInfo(source.SizeStatus);
        }
        if (source.InnerEchoDistribution != null) {
            this.InnerEchoDistribution = new BlockInfo(source.InnerEchoDistribution);
        }
        if (source.InnerEchoType != null) {
            this.InnerEchoType = new BlockInfo[source.InnerEchoType.length];
            for (int i = 0; i < source.InnerEchoType.length; i++) {
                this.InnerEchoType[i] = new BlockInfo(source.InnerEchoType[i]);
            }
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
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Type.", this.Type);
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamArrayObj(map, prefix + "Size.", this.Size);
        this.setParamObj(map, prefix + "Multiple.", this.Multiple);
        this.setParamObj(map, prefix + "AspectRatio.", this.AspectRatio);
        this.setParamObj(map, prefix + "Edge.", this.Edge);
        this.setParamObj(map, prefix + "InnerEcho.", this.InnerEcho);
        this.setParamObj(map, prefix + "RearEcho.", this.RearEcho);
        this.setParamObj(map, prefix + "Elastic.", this.Elastic);
        this.setParamObj(map, prefix + "Shape.", this.Shape);
        this.setParamObj(map, prefix + "ShapeAttr.", this.ShapeAttr);
        this.setParamObj(map, prefix + "SkinMedulla.", this.SkinMedulla);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamObj(map, prefix + "Calcification.", this.Calcification);
        this.setParamObj(map, prefix + "Envelope.", this.Envelope);
        this.setParamObj(map, prefix + "Enhancement.", this.Enhancement);
        this.setParamObj(map, prefix + "LymphEnlargement.", this.LymphEnlargement);
        this.setParamObj(map, prefix + "LymphDoor.", this.LymphDoor);
        this.setParamObj(map, prefix + "Activity.", this.Activity);
        this.setParamObj(map, prefix + "Operation.", this.Operation);
        this.setParamObj(map, prefix + "CDFI.", this.CDFI);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamObj(map, prefix + "SizeStatus.", this.SizeStatus);
        this.setParamObj(map, prefix + "InnerEchoDistribution.", this.InnerEchoDistribution);
        this.setParamArrayObj(map, prefix + "InnerEchoType.", this.InnerEchoType);
        this.setParamObj(map, prefix + "Outline.", this.Outline);
        this.setParamObj(map, prefix + "Structure.", this.Structure);
        this.setParamObj(map, prefix + "Density.", this.Density);
        this.setParamObj(map, prefix + "Vas.", this.Vas);
        this.setParamObj(map, prefix + "Cysticwall.", this.Cysticwall);
        this.setParamObj(map, prefix + "Capsule.", this.Capsule);
        this.setParamObj(map, prefix + "IsthmusThicknese.", this.IsthmusThicknese);
        this.setParamSimple(map, prefix + "Src", this.Src);

    }
}

