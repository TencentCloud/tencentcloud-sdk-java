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

public class Fetus extends AbstractModel{

    /**
    * 双顶径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BPD")
    @Expose
    private FieldInfo BPD;

    /**
    * 腹前后径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APTD")
    @Expose
    private FieldInfo APTD;

    /**
    * 腹左右径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TTD")
    @Expose
    private FieldInfo TTD;

    /**
    * 头臀径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CRL")
    @Expose
    private FieldInfo CRL;

    /**
    * 头围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HC")
    @Expose
    private FieldInfo HC;

    /**
    * 腹围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AC")
    @Expose
    private FieldInfo AC;

    /**
    * 股骨长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FL")
    @Expose
    private FieldInfo FL;

    /**
    * 肱骨长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HL")
    @Expose
    private FieldInfo HL;

    /**
    * 胎儿重量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private FieldInfo Weight;

    /**
    * 颈项透明层
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NT")
    @Expose
    private FieldInfo NT;

    /**
    * 脐动脉血流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UmbilicalCord")
    @Expose
    private FieldInfo UmbilicalCord;

    /**
    * 羊水最大深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaterDeep")
    @Expose
    private FieldInfo WaterDeep;

    /**
    * 羊水四象限测量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaterQuad")
    @Expose
    private FieldInfo WaterQuad;

    /**
    * 羊水指数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AFI")
    @Expose
    private FieldInfo AFI;

    /**
    * 胎心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FHR")
    @Expose
    private FieldInfo FHR;

    /**
    * 胎动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Movement")
    @Expose
    private FieldInfo Movement;

    /**
    * 胎数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Num")
    @Expose
    private FieldInfo Num;

    /**
    * 胎位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private FieldInfo Position;

    /**
    * 是否活胎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alive")
    @Expose
    private FieldInfo Alive;

    /**
    * 胎盘位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlacentaLocation")
    @Expose
    private FieldInfo PlacentaLocation;

    /**
    * 胎盘厚度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlacentaThickness")
    @Expose
    private FieldInfo PlacentaThickness;

    /**
    * 胎盘成熟度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlacentaGrade")
    @Expose
    private FieldInfo PlacentaGrade;

    /**
    * 妊娠时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GestationTime")
    @Expose
    private FieldInfo GestationTime;

    /**
    * 妊娠周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GestationPeriod")
    @Expose
    private FieldInfo GestationPeriod;

    /**
    * 绕颈
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AroundNeck")
    @Expose
    private FieldInfo AroundNeck;

    /**
    * 病变
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sym")
    @Expose
    private FieldInfo [] Sym;

    /**
    * 原文内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
     * Get 双顶径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BPD 双顶径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getBPD() {
        return this.BPD;
    }

    /**
     * Set 双顶径
注意：此字段可能返回 null，表示取不到有效值。
     * @param BPD 双顶径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBPD(FieldInfo BPD) {
        this.BPD = BPD;
    }

    /**
     * Get 腹前后径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APTD 腹前后径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getAPTD() {
        return this.APTD;
    }

    /**
     * Set 腹前后径
注意：此字段可能返回 null，表示取不到有效值。
     * @param APTD 腹前后径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPTD(FieldInfo APTD) {
        this.APTD = APTD;
    }

    /**
     * Get 腹左右径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TTD 腹左右径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getTTD() {
        return this.TTD;
    }

    /**
     * Set 腹左右径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TTD 腹左右径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTTD(FieldInfo TTD) {
        this.TTD = TTD;
    }

    /**
     * Get 头臀径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CRL 头臀径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getCRL() {
        return this.CRL;
    }

    /**
     * Set 头臀径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CRL 头臀径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCRL(FieldInfo CRL) {
        this.CRL = CRL;
    }

    /**
     * Get 头围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HC 头围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getHC() {
        return this.HC;
    }

    /**
     * Set 头围
注意：此字段可能返回 null，表示取不到有效值。
     * @param HC 头围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHC(FieldInfo HC) {
        this.HC = HC;
    }

    /**
     * Get 腹围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AC 腹围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getAC() {
        return this.AC;
    }

    /**
     * Set 腹围
注意：此字段可能返回 null，表示取不到有效值。
     * @param AC 腹围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAC(FieldInfo AC) {
        this.AC = AC;
    }

    /**
     * Get 股骨长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FL 股骨长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getFL() {
        return this.FL;
    }

    /**
     * Set 股骨长
注意：此字段可能返回 null，表示取不到有效值。
     * @param FL 股骨长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFL(FieldInfo FL) {
        this.FL = FL;
    }

    /**
     * Get 肱骨长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HL 肱骨长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getHL() {
        return this.HL;
    }

    /**
     * Set 肱骨长
注意：此字段可能返回 null，表示取不到有效值。
     * @param HL 肱骨长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHL(FieldInfo HL) {
        this.HL = HL;
    }

    /**
     * Get 胎儿重量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 胎儿重量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getWeight() {
        return this.Weight;
    }

    /**
     * Set 胎儿重量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 胎儿重量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(FieldInfo Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 颈项透明层
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NT 颈项透明层
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getNT() {
        return this.NT;
    }

    /**
     * Set 颈项透明层
注意：此字段可能返回 null，表示取不到有效值。
     * @param NT 颈项透明层
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNT(FieldInfo NT) {
        this.NT = NT;
    }

    /**
     * Get 脐动脉血流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UmbilicalCord 脐动脉血流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getUmbilicalCord() {
        return this.UmbilicalCord;
    }

    /**
     * Set 脐动脉血流
注意：此字段可能返回 null，表示取不到有效值。
     * @param UmbilicalCord 脐动脉血流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUmbilicalCord(FieldInfo UmbilicalCord) {
        this.UmbilicalCord = UmbilicalCord;
    }

    /**
     * Get 羊水最大深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaterDeep 羊水最大深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getWaterDeep() {
        return this.WaterDeep;
    }

    /**
     * Set 羊水最大深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaterDeep 羊水最大深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaterDeep(FieldInfo WaterDeep) {
        this.WaterDeep = WaterDeep;
    }

    /**
     * Get 羊水四象限测量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaterQuad 羊水四象限测量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getWaterQuad() {
        return this.WaterQuad;
    }

    /**
     * Set 羊水四象限测量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaterQuad 羊水四象限测量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaterQuad(FieldInfo WaterQuad) {
        this.WaterQuad = WaterQuad;
    }

    /**
     * Get 羊水指数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AFI 羊水指数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getAFI() {
        return this.AFI;
    }

    /**
     * Set 羊水指数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AFI 羊水指数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAFI(FieldInfo AFI) {
        this.AFI = AFI;
    }

    /**
     * Get 胎心
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FHR 胎心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getFHR() {
        return this.FHR;
    }

    /**
     * Set 胎心
注意：此字段可能返回 null，表示取不到有效值。
     * @param FHR 胎心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFHR(FieldInfo FHR) {
        this.FHR = FHR;
    }

    /**
     * Get 胎动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Movement 胎动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getMovement() {
        return this.Movement;
    }

    /**
     * Set 胎动
注意：此字段可能返回 null，表示取不到有效值。
     * @param Movement 胎动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMovement(FieldInfo Movement) {
        this.Movement = Movement;
    }

    /**
     * Get 胎数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Num 胎数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getNum() {
        return this.Num;
    }

    /**
     * Set 胎数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Num 胎数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNum(FieldInfo Num) {
        this.Num = Num;
    }

    /**
     * Get 胎位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 胎位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getPosition() {
        return this.Position;
    }

    /**
     * Set 胎位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 胎位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(FieldInfo Position) {
        this.Position = Position;
    }

    /**
     * Get 是否活胎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alive 是否活胎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getAlive() {
        return this.Alive;
    }

    /**
     * Set 是否活胎
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alive 是否活胎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlive(FieldInfo Alive) {
        this.Alive = Alive;
    }

    /**
     * Get 胎盘位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlacentaLocation 胎盘位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getPlacentaLocation() {
        return this.PlacentaLocation;
    }

    /**
     * Set 胎盘位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlacentaLocation 胎盘位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacentaLocation(FieldInfo PlacentaLocation) {
        this.PlacentaLocation = PlacentaLocation;
    }

    /**
     * Get 胎盘厚度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlacentaThickness 胎盘厚度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getPlacentaThickness() {
        return this.PlacentaThickness;
    }

    /**
     * Set 胎盘厚度
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlacentaThickness 胎盘厚度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacentaThickness(FieldInfo PlacentaThickness) {
        this.PlacentaThickness = PlacentaThickness;
    }

    /**
     * Get 胎盘成熟度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlacentaGrade 胎盘成熟度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getPlacentaGrade() {
        return this.PlacentaGrade;
    }

    /**
     * Set 胎盘成熟度
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlacentaGrade 胎盘成熟度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacentaGrade(FieldInfo PlacentaGrade) {
        this.PlacentaGrade = PlacentaGrade;
    }

    /**
     * Get 妊娠时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GestationTime 妊娠时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getGestationTime() {
        return this.GestationTime;
    }

    /**
     * Set 妊娠时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param GestationTime 妊娠时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGestationTime(FieldInfo GestationTime) {
        this.GestationTime = GestationTime;
    }

    /**
     * Get 妊娠周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GestationPeriod 妊娠周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getGestationPeriod() {
        return this.GestationPeriod;
    }

    /**
     * Set 妊娠周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param GestationPeriod 妊娠周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGestationPeriod(FieldInfo GestationPeriod) {
        this.GestationPeriod = GestationPeriod;
    }

    /**
     * Get 绕颈
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AroundNeck 绕颈
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo getAroundNeck() {
        return this.AroundNeck;
    }

    /**
     * Set 绕颈
注意：此字段可能返回 null，表示取不到有效值。
     * @param AroundNeck 绕颈
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAroundNeck(FieldInfo AroundNeck) {
        this.AroundNeck = AroundNeck;
    }

    /**
     * Get 病变
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sym 病变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldInfo [] getSym() {
        return this.Sym;
    }

    /**
     * Set 病变
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sym 病变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSym(FieldInfo [] Sym) {
        this.Sym = Sym;
    }

    /**
     * Get 原文内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    public Fetus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Fetus(Fetus source) {
        if (source.BPD != null) {
            this.BPD = new FieldInfo(source.BPD);
        }
        if (source.APTD != null) {
            this.APTD = new FieldInfo(source.APTD);
        }
        if (source.TTD != null) {
            this.TTD = new FieldInfo(source.TTD);
        }
        if (source.CRL != null) {
            this.CRL = new FieldInfo(source.CRL);
        }
        if (source.HC != null) {
            this.HC = new FieldInfo(source.HC);
        }
        if (source.AC != null) {
            this.AC = new FieldInfo(source.AC);
        }
        if (source.FL != null) {
            this.FL = new FieldInfo(source.FL);
        }
        if (source.HL != null) {
            this.HL = new FieldInfo(source.HL);
        }
        if (source.Weight != null) {
            this.Weight = new FieldInfo(source.Weight);
        }
        if (source.NT != null) {
            this.NT = new FieldInfo(source.NT);
        }
        if (source.UmbilicalCord != null) {
            this.UmbilicalCord = new FieldInfo(source.UmbilicalCord);
        }
        if (source.WaterDeep != null) {
            this.WaterDeep = new FieldInfo(source.WaterDeep);
        }
        if (source.WaterQuad != null) {
            this.WaterQuad = new FieldInfo(source.WaterQuad);
        }
        if (source.AFI != null) {
            this.AFI = new FieldInfo(source.AFI);
        }
        if (source.FHR != null) {
            this.FHR = new FieldInfo(source.FHR);
        }
        if (source.Movement != null) {
            this.Movement = new FieldInfo(source.Movement);
        }
        if (source.Num != null) {
            this.Num = new FieldInfo(source.Num);
        }
        if (source.Position != null) {
            this.Position = new FieldInfo(source.Position);
        }
        if (source.Alive != null) {
            this.Alive = new FieldInfo(source.Alive);
        }
        if (source.PlacentaLocation != null) {
            this.PlacentaLocation = new FieldInfo(source.PlacentaLocation);
        }
        if (source.PlacentaThickness != null) {
            this.PlacentaThickness = new FieldInfo(source.PlacentaThickness);
        }
        if (source.PlacentaGrade != null) {
            this.PlacentaGrade = new FieldInfo(source.PlacentaGrade);
        }
        if (source.GestationTime != null) {
            this.GestationTime = new FieldInfo(source.GestationTime);
        }
        if (source.GestationPeriod != null) {
            this.GestationPeriod = new FieldInfo(source.GestationPeriod);
        }
        if (source.AroundNeck != null) {
            this.AroundNeck = new FieldInfo(source.AroundNeck);
        }
        if (source.Sym != null) {
            this.Sym = new FieldInfo[source.Sym.length];
            for (int i = 0; i < source.Sym.length; i++) {
                this.Sym[i] = new FieldInfo(source.Sym[i]);
            }
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BPD.", this.BPD);
        this.setParamObj(map, prefix + "APTD.", this.APTD);
        this.setParamObj(map, prefix + "TTD.", this.TTD);
        this.setParamObj(map, prefix + "CRL.", this.CRL);
        this.setParamObj(map, prefix + "HC.", this.HC);
        this.setParamObj(map, prefix + "AC.", this.AC);
        this.setParamObj(map, prefix + "FL.", this.FL);
        this.setParamObj(map, prefix + "HL.", this.HL);
        this.setParamObj(map, prefix + "Weight.", this.Weight);
        this.setParamObj(map, prefix + "NT.", this.NT);
        this.setParamObj(map, prefix + "UmbilicalCord.", this.UmbilicalCord);
        this.setParamObj(map, prefix + "WaterDeep.", this.WaterDeep);
        this.setParamObj(map, prefix + "WaterQuad.", this.WaterQuad);
        this.setParamObj(map, prefix + "AFI.", this.AFI);
        this.setParamObj(map, prefix + "FHR.", this.FHR);
        this.setParamObj(map, prefix + "Movement.", this.Movement);
        this.setParamObj(map, prefix + "Num.", this.Num);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamObj(map, prefix + "Alive.", this.Alive);
        this.setParamObj(map, prefix + "PlacentaLocation.", this.PlacentaLocation);
        this.setParamObj(map, prefix + "PlacentaThickness.", this.PlacentaThickness);
        this.setParamObj(map, prefix + "PlacentaGrade.", this.PlacentaGrade);
        this.setParamObj(map, prefix + "GestationTime.", this.GestationTime);
        this.setParamObj(map, prefix + "GestationPeriod.", this.GestationPeriod);
        this.setParamObj(map, prefix + "AroundNeck.", this.AroundNeck);
        this.setParamArrayObj(map, prefix + "Sym.", this.Sym);
        this.setParamSimple(map, prefix + "Src", this.Src);

    }
}

