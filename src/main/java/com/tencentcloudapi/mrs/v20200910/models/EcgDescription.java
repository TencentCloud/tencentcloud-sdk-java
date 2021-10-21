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

public class EcgDescription extends AbstractModel{

    /**
    * 心率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeartRate")
    @Expose
    private EcgItem HeartRate;

    /**
    * 心房率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuricularRate")
    @Expose
    private EcgItem AuricularRate;

    /**
    * 心室率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VentricularRate")
    @Expose
    private EcgItem VentricularRate;

    /**
    * 节律
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rhythm")
    @Expose
    private EcgItem Rhythm;

    /**
    * P波时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PDuration")
    @Expose
    private EcgItem PDuration;

    /**
    * QRS时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QrsDuration")
    @Expose
    private EcgItem QrsDuration;

    /**
    * QRS电轴
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QrsAxis")
    @Expose
    private EcgItem QrsAxis;

    /**
    * P-R间期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PRInterval")
    @Expose
    private EcgItem PRInterval;

    /**
    * P-P间期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PPInterval")
    @Expose
    private EcgItem PPInterval;

    /**
    * R-R间期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RRInterval")
    @Expose
    private EcgItem RRInterval;

    /**
    * P-J间期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PJInterval")
    @Expose
    private EcgItem PJInterval;

    /**
    * Q-T间期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QTInterval")
    @Expose
    private EcgItem QTInterval;

    /**
    * qt/qtc间期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QTCInterval")
    @Expose
    private EcgItem QTCInterval;

    /**
    * RV5/SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rv5SV1Amplitude")
    @Expose
    private EcgItem Rv5SV1Amplitude;

    /**
    * RV5+SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rv5AddSV1Amplitude")
    @Expose
    private EcgItem Rv5AddSV1Amplitude;

    /**
    * PRT电轴
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PRTAxis")
    @Expose
    private EcgItem PRTAxis;

    /**
    * RV5振幅
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rv5Amplitude")
    @Expose
    private EcgItem Rv5Amplitude;

    /**
    * SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SV1Amplitude")
    @Expose
    private EcgItem SV1Amplitude;

    /**
    * RV6/SV2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RV6SV2")
    @Expose
    private EcgItem RV6SV2;

    /**
    * P/QRS/T电轴
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PQRSTAxis")
    @Expose
    private EcgItem PQRSTAxis;

    /**
     * Get 心率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeartRate 心率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getHeartRate() {
        return this.HeartRate;
    }

    /**
     * Set 心率
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeartRate 心率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeartRate(EcgItem HeartRate) {
        this.HeartRate = HeartRate;
    }

    /**
     * Get 心房率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuricularRate 心房率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getAuricularRate() {
        return this.AuricularRate;
    }

    /**
     * Set 心房率
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuricularRate 心房率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuricularRate(EcgItem AuricularRate) {
        this.AuricularRate = AuricularRate;
    }

    /**
     * Get 心室率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VentricularRate 心室率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getVentricularRate() {
        return this.VentricularRate;
    }

    /**
     * Set 心室率
注意：此字段可能返回 null，表示取不到有效值。
     * @param VentricularRate 心室率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVentricularRate(EcgItem VentricularRate) {
        this.VentricularRate = VentricularRate;
    }

    /**
     * Get 节律
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rhythm 节律
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getRhythm() {
        return this.Rhythm;
    }

    /**
     * Set 节律
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rhythm 节律
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRhythm(EcgItem Rhythm) {
        this.Rhythm = Rhythm;
    }

    /**
     * Get P波时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PDuration P波时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getPDuration() {
        return this.PDuration;
    }

    /**
     * Set P波时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PDuration P波时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPDuration(EcgItem PDuration) {
        this.PDuration = PDuration;
    }

    /**
     * Get QRS时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QrsDuration QRS时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getQrsDuration() {
        return this.QrsDuration;
    }

    /**
     * Set QRS时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param QrsDuration QRS时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQrsDuration(EcgItem QrsDuration) {
        this.QrsDuration = QrsDuration;
    }

    /**
     * Get QRS电轴
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QrsAxis QRS电轴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getQrsAxis() {
        return this.QrsAxis;
    }

    /**
     * Set QRS电轴
注意：此字段可能返回 null，表示取不到有效值。
     * @param QrsAxis QRS电轴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQrsAxis(EcgItem QrsAxis) {
        this.QrsAxis = QrsAxis;
    }

    /**
     * Get P-R间期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PRInterval P-R间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getPRInterval() {
        return this.PRInterval;
    }

    /**
     * Set P-R间期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PRInterval P-R间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPRInterval(EcgItem PRInterval) {
        this.PRInterval = PRInterval;
    }

    /**
     * Get P-P间期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PPInterval P-P间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getPPInterval() {
        return this.PPInterval;
    }

    /**
     * Set P-P间期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PPInterval P-P间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPPInterval(EcgItem PPInterval) {
        this.PPInterval = PPInterval;
    }

    /**
     * Get R-R间期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RRInterval R-R间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getRRInterval() {
        return this.RRInterval;
    }

    /**
     * Set R-R间期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RRInterval R-R间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRRInterval(EcgItem RRInterval) {
        this.RRInterval = RRInterval;
    }

    /**
     * Get P-J间期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PJInterval P-J间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getPJInterval() {
        return this.PJInterval;
    }

    /**
     * Set P-J间期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PJInterval P-J间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPJInterval(EcgItem PJInterval) {
        this.PJInterval = PJInterval;
    }

    /**
     * Get Q-T间期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QTInterval Q-T间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getQTInterval() {
        return this.QTInterval;
    }

    /**
     * Set Q-T间期
注意：此字段可能返回 null，表示取不到有效值。
     * @param QTInterval Q-T间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQTInterval(EcgItem QTInterval) {
        this.QTInterval = QTInterval;
    }

    /**
     * Get qt/qtc间期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QTCInterval qt/qtc间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getQTCInterval() {
        return this.QTCInterval;
    }

    /**
     * Set qt/qtc间期
注意：此字段可能返回 null，表示取不到有效值。
     * @param QTCInterval qt/qtc间期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQTCInterval(EcgItem QTCInterval) {
        this.QTCInterval = QTCInterval;
    }

    /**
     * Get RV5/SV1振幅
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rv5SV1Amplitude RV5/SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getRv5SV1Amplitude() {
        return this.Rv5SV1Amplitude;
    }

    /**
     * Set RV5/SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rv5SV1Amplitude RV5/SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRv5SV1Amplitude(EcgItem Rv5SV1Amplitude) {
        this.Rv5SV1Amplitude = Rv5SV1Amplitude;
    }

    /**
     * Get RV5+SV1振幅
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rv5AddSV1Amplitude RV5+SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getRv5AddSV1Amplitude() {
        return this.Rv5AddSV1Amplitude;
    }

    /**
     * Set RV5+SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rv5AddSV1Amplitude RV5+SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRv5AddSV1Amplitude(EcgItem Rv5AddSV1Amplitude) {
        this.Rv5AddSV1Amplitude = Rv5AddSV1Amplitude;
    }

    /**
     * Get PRT电轴
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PRTAxis PRT电轴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getPRTAxis() {
        return this.PRTAxis;
    }

    /**
     * Set PRT电轴
注意：此字段可能返回 null，表示取不到有效值。
     * @param PRTAxis PRT电轴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPRTAxis(EcgItem PRTAxis) {
        this.PRTAxis = PRTAxis;
    }

    /**
     * Get RV5振幅
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rv5Amplitude RV5振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getRv5Amplitude() {
        return this.Rv5Amplitude;
    }

    /**
     * Set RV5振幅
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rv5Amplitude RV5振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRv5Amplitude(EcgItem Rv5Amplitude) {
        this.Rv5Amplitude = Rv5Amplitude;
    }

    /**
     * Get SV1振幅
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SV1Amplitude SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getSV1Amplitude() {
        return this.SV1Amplitude;
    }

    /**
     * Set SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     * @param SV1Amplitude SV1振幅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSV1Amplitude(EcgItem SV1Amplitude) {
        this.SV1Amplitude = SV1Amplitude;
    }

    /**
     * Get RV6/SV2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RV6SV2 RV6/SV2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getRV6SV2() {
        return this.RV6SV2;
    }

    /**
     * Set RV6/SV2
注意：此字段可能返回 null，表示取不到有效值。
     * @param RV6SV2 RV6/SV2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRV6SV2(EcgItem RV6SV2) {
        this.RV6SV2 = RV6SV2;
    }

    /**
     * Get P/QRS/T电轴
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PQRSTAxis P/QRS/T电轴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgItem getPQRSTAxis() {
        return this.PQRSTAxis;
    }

    /**
     * Set P/QRS/T电轴
注意：此字段可能返回 null，表示取不到有效值。
     * @param PQRSTAxis P/QRS/T电轴
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPQRSTAxis(EcgItem PQRSTAxis) {
        this.PQRSTAxis = PQRSTAxis;
    }

    public EcgDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EcgDescription(EcgDescription source) {
        if (source.HeartRate != null) {
            this.HeartRate = new EcgItem(source.HeartRate);
        }
        if (source.AuricularRate != null) {
            this.AuricularRate = new EcgItem(source.AuricularRate);
        }
        if (source.VentricularRate != null) {
            this.VentricularRate = new EcgItem(source.VentricularRate);
        }
        if (source.Rhythm != null) {
            this.Rhythm = new EcgItem(source.Rhythm);
        }
        if (source.PDuration != null) {
            this.PDuration = new EcgItem(source.PDuration);
        }
        if (source.QrsDuration != null) {
            this.QrsDuration = new EcgItem(source.QrsDuration);
        }
        if (source.QrsAxis != null) {
            this.QrsAxis = new EcgItem(source.QrsAxis);
        }
        if (source.PRInterval != null) {
            this.PRInterval = new EcgItem(source.PRInterval);
        }
        if (source.PPInterval != null) {
            this.PPInterval = new EcgItem(source.PPInterval);
        }
        if (source.RRInterval != null) {
            this.RRInterval = new EcgItem(source.RRInterval);
        }
        if (source.PJInterval != null) {
            this.PJInterval = new EcgItem(source.PJInterval);
        }
        if (source.QTInterval != null) {
            this.QTInterval = new EcgItem(source.QTInterval);
        }
        if (source.QTCInterval != null) {
            this.QTCInterval = new EcgItem(source.QTCInterval);
        }
        if (source.Rv5SV1Amplitude != null) {
            this.Rv5SV1Amplitude = new EcgItem(source.Rv5SV1Amplitude);
        }
        if (source.Rv5AddSV1Amplitude != null) {
            this.Rv5AddSV1Amplitude = new EcgItem(source.Rv5AddSV1Amplitude);
        }
        if (source.PRTAxis != null) {
            this.PRTAxis = new EcgItem(source.PRTAxis);
        }
        if (source.Rv5Amplitude != null) {
            this.Rv5Amplitude = new EcgItem(source.Rv5Amplitude);
        }
        if (source.SV1Amplitude != null) {
            this.SV1Amplitude = new EcgItem(source.SV1Amplitude);
        }
        if (source.RV6SV2 != null) {
            this.RV6SV2 = new EcgItem(source.RV6SV2);
        }
        if (source.PQRSTAxis != null) {
            this.PQRSTAxis = new EcgItem(source.PQRSTAxis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeartRate.", this.HeartRate);
        this.setParamObj(map, prefix + "AuricularRate.", this.AuricularRate);
        this.setParamObj(map, prefix + "VentricularRate.", this.VentricularRate);
        this.setParamObj(map, prefix + "Rhythm.", this.Rhythm);
        this.setParamObj(map, prefix + "PDuration.", this.PDuration);
        this.setParamObj(map, prefix + "QrsDuration.", this.QrsDuration);
        this.setParamObj(map, prefix + "QrsAxis.", this.QrsAxis);
        this.setParamObj(map, prefix + "PRInterval.", this.PRInterval);
        this.setParamObj(map, prefix + "PPInterval.", this.PPInterval);
        this.setParamObj(map, prefix + "RRInterval.", this.RRInterval);
        this.setParamObj(map, prefix + "PJInterval.", this.PJInterval);
        this.setParamObj(map, prefix + "QTInterval.", this.QTInterval);
        this.setParamObj(map, prefix + "QTCInterval.", this.QTCInterval);
        this.setParamObj(map, prefix + "Rv5SV1Amplitude.", this.Rv5SV1Amplitude);
        this.setParamObj(map, prefix + "Rv5AddSV1Amplitude.", this.Rv5AddSV1Amplitude);
        this.setParamObj(map, prefix + "PRTAxis.", this.PRTAxis);
        this.setParamObj(map, prefix + "Rv5Amplitude.", this.Rv5Amplitude);
        this.setParamObj(map, prefix + "SV1Amplitude.", this.SV1Amplitude);
        this.setParamObj(map, prefix + "RV6SV2.", this.RV6SV2);
        this.setParamObj(map, prefix + "PQRSTAxis.", this.PQRSTAxis);

    }
}

