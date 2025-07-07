/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnosisInfo extends AbstractModel {

    /**
    * 默认0，0:初诊-常规诊疗 1:复诊 2:检验检查/取药/咨询/疫苗 3:信息缺失 4:信息错误
    */
    @SerializedName("IntentType")
    @Expose
    private Long IntentType;

    /**
    * 诊断风险
    */
    @SerializedName("RiskInfo")
    @Expose
    private String RiskInfo;

    /**
    * 疑似诊断列表
    */
    @SerializedName("SuspectedDiagnosis")
    @Expose
    private SuspectedDiagnosis [] SuspectedDiagnosis;

    /**
    * 转诊提醒
    */
    @SerializedName("ReferralInfo")
    @Expose
    private ReferralInfo ReferralInfo;

    /**
    * 危急重症
    */
    @SerializedName("CriticalInfo")
    @Expose
    private CriticalInfo [] CriticalInfo;

    /**
    * 生命体征风险
    */
    @SerializedName("VitalSignsInfo")
    @Expose
    private VitalSignsInfo VitalSignsInfo;

    /**
    * 鉴别诊断
    */
    @SerializedName("DifferDiagnosis")
    @Expose
    private DifferDiagnosis [] DifferDiagnosis;

    /**
    * 病历质控
    */
    @SerializedName("RecordQuality")
    @Expose
    private RecordQuality RecordQuality;

    /**
    * 当前诊断
    */
    @SerializedName("CurrentDiagnosis")
    @Expose
    private CurrentDiagnosis [] CurrentDiagnosis;

    /**
    * 治疗方案
    */
    @SerializedName("TreatmentGuide")
    @Expose
    private TreatmentGuide [] TreatmentGuide;

    /**
    * 病历质控
    */
    @SerializedName("EmrQuality")
    @Expose
    private EmrQuality EmrQuality;

    /**
    * 健康处方
    */
    @SerializedName("HealthPrescriptions")
    @Expose
    private HealthPrescriptions [] HealthPrescriptions;

    /**
     * Get 默认0，0:初诊-常规诊疗 1:复诊 2:检验检查/取药/咨询/疫苗 3:信息缺失 4:信息错误 
     * @return IntentType 默认0，0:初诊-常规诊疗 1:复诊 2:检验检查/取药/咨询/疫苗 3:信息缺失 4:信息错误
     */
    public Long getIntentType() {
        return this.IntentType;
    }

    /**
     * Set 默认0，0:初诊-常规诊疗 1:复诊 2:检验检查/取药/咨询/疫苗 3:信息缺失 4:信息错误
     * @param IntentType 默认0，0:初诊-常规诊疗 1:复诊 2:检验检查/取药/咨询/疫苗 3:信息缺失 4:信息错误
     */
    public void setIntentType(Long IntentType) {
        this.IntentType = IntentType;
    }

    /**
     * Get 诊断风险 
     * @return RiskInfo 诊断风险
     */
    public String getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 诊断风险
     * @param RiskInfo 诊断风险
     */
    public void setRiskInfo(String RiskInfo) {
        this.RiskInfo = RiskInfo;
    }

    /**
     * Get 疑似诊断列表 
     * @return SuspectedDiagnosis 疑似诊断列表
     */
    public SuspectedDiagnosis [] getSuspectedDiagnosis() {
        return this.SuspectedDiagnosis;
    }

    /**
     * Set 疑似诊断列表
     * @param SuspectedDiagnosis 疑似诊断列表
     */
    public void setSuspectedDiagnosis(SuspectedDiagnosis [] SuspectedDiagnosis) {
        this.SuspectedDiagnosis = SuspectedDiagnosis;
    }

    /**
     * Get 转诊提醒 
     * @return ReferralInfo 转诊提醒
     */
    public ReferralInfo getReferralInfo() {
        return this.ReferralInfo;
    }

    /**
     * Set 转诊提醒
     * @param ReferralInfo 转诊提醒
     */
    public void setReferralInfo(ReferralInfo ReferralInfo) {
        this.ReferralInfo = ReferralInfo;
    }

    /**
     * Get 危急重症 
     * @return CriticalInfo 危急重症
     */
    public CriticalInfo [] getCriticalInfo() {
        return this.CriticalInfo;
    }

    /**
     * Set 危急重症
     * @param CriticalInfo 危急重症
     */
    public void setCriticalInfo(CriticalInfo [] CriticalInfo) {
        this.CriticalInfo = CriticalInfo;
    }

    /**
     * Get 生命体征风险 
     * @return VitalSignsInfo 生命体征风险
     */
    public VitalSignsInfo getVitalSignsInfo() {
        return this.VitalSignsInfo;
    }

    /**
     * Set 生命体征风险
     * @param VitalSignsInfo 生命体征风险
     */
    public void setVitalSignsInfo(VitalSignsInfo VitalSignsInfo) {
        this.VitalSignsInfo = VitalSignsInfo;
    }

    /**
     * Get 鉴别诊断 
     * @return DifferDiagnosis 鉴别诊断
     */
    public DifferDiagnosis [] getDifferDiagnosis() {
        return this.DifferDiagnosis;
    }

    /**
     * Set 鉴别诊断
     * @param DifferDiagnosis 鉴别诊断
     */
    public void setDifferDiagnosis(DifferDiagnosis [] DifferDiagnosis) {
        this.DifferDiagnosis = DifferDiagnosis;
    }

    /**
     * Get 病历质控 
     * @return RecordQuality 病历质控
     */
    public RecordQuality getRecordQuality() {
        return this.RecordQuality;
    }

    /**
     * Set 病历质控
     * @param RecordQuality 病历质控
     */
    public void setRecordQuality(RecordQuality RecordQuality) {
        this.RecordQuality = RecordQuality;
    }

    /**
     * Get 当前诊断 
     * @return CurrentDiagnosis 当前诊断
     */
    public CurrentDiagnosis [] getCurrentDiagnosis() {
        return this.CurrentDiagnosis;
    }

    /**
     * Set 当前诊断
     * @param CurrentDiagnosis 当前诊断
     */
    public void setCurrentDiagnosis(CurrentDiagnosis [] CurrentDiagnosis) {
        this.CurrentDiagnosis = CurrentDiagnosis;
    }

    /**
     * Get 治疗方案 
     * @return TreatmentGuide 治疗方案
     */
    public TreatmentGuide [] getTreatmentGuide() {
        return this.TreatmentGuide;
    }

    /**
     * Set 治疗方案
     * @param TreatmentGuide 治疗方案
     */
    public void setTreatmentGuide(TreatmentGuide [] TreatmentGuide) {
        this.TreatmentGuide = TreatmentGuide;
    }

    /**
     * Get 病历质控 
     * @return EmrQuality 病历质控
     */
    public EmrQuality getEmrQuality() {
        return this.EmrQuality;
    }

    /**
     * Set 病历质控
     * @param EmrQuality 病历质控
     */
    public void setEmrQuality(EmrQuality EmrQuality) {
        this.EmrQuality = EmrQuality;
    }

    /**
     * Get 健康处方 
     * @return HealthPrescriptions 健康处方
     */
    public HealthPrescriptions [] getHealthPrescriptions() {
        return this.HealthPrescriptions;
    }

    /**
     * Set 健康处方
     * @param HealthPrescriptions 健康处方
     */
    public void setHealthPrescriptions(HealthPrescriptions [] HealthPrescriptions) {
        this.HealthPrescriptions = HealthPrescriptions;
    }

    public DiagnosisInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnosisInfo(DiagnosisInfo source) {
        if (source.IntentType != null) {
            this.IntentType = new Long(source.IntentType);
        }
        if (source.RiskInfo != null) {
            this.RiskInfo = new String(source.RiskInfo);
        }
        if (source.SuspectedDiagnosis != null) {
            this.SuspectedDiagnosis = new SuspectedDiagnosis[source.SuspectedDiagnosis.length];
            for (int i = 0; i < source.SuspectedDiagnosis.length; i++) {
                this.SuspectedDiagnosis[i] = new SuspectedDiagnosis(source.SuspectedDiagnosis[i]);
            }
        }
        if (source.ReferralInfo != null) {
            this.ReferralInfo = new ReferralInfo(source.ReferralInfo);
        }
        if (source.CriticalInfo != null) {
            this.CriticalInfo = new CriticalInfo[source.CriticalInfo.length];
            for (int i = 0; i < source.CriticalInfo.length; i++) {
                this.CriticalInfo[i] = new CriticalInfo(source.CriticalInfo[i]);
            }
        }
        if (source.VitalSignsInfo != null) {
            this.VitalSignsInfo = new VitalSignsInfo(source.VitalSignsInfo);
        }
        if (source.DifferDiagnosis != null) {
            this.DifferDiagnosis = new DifferDiagnosis[source.DifferDiagnosis.length];
            for (int i = 0; i < source.DifferDiagnosis.length; i++) {
                this.DifferDiagnosis[i] = new DifferDiagnosis(source.DifferDiagnosis[i]);
            }
        }
        if (source.RecordQuality != null) {
            this.RecordQuality = new RecordQuality(source.RecordQuality);
        }
        if (source.CurrentDiagnosis != null) {
            this.CurrentDiagnosis = new CurrentDiagnosis[source.CurrentDiagnosis.length];
            for (int i = 0; i < source.CurrentDiagnosis.length; i++) {
                this.CurrentDiagnosis[i] = new CurrentDiagnosis(source.CurrentDiagnosis[i]);
            }
        }
        if (source.TreatmentGuide != null) {
            this.TreatmentGuide = new TreatmentGuide[source.TreatmentGuide.length];
            for (int i = 0; i < source.TreatmentGuide.length; i++) {
                this.TreatmentGuide[i] = new TreatmentGuide(source.TreatmentGuide[i]);
            }
        }
        if (source.EmrQuality != null) {
            this.EmrQuality = new EmrQuality(source.EmrQuality);
        }
        if (source.HealthPrescriptions != null) {
            this.HealthPrescriptions = new HealthPrescriptions[source.HealthPrescriptions.length];
            for (int i = 0; i < source.HealthPrescriptions.length; i++) {
                this.HealthPrescriptions[i] = new HealthPrescriptions(source.HealthPrescriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentType", this.IntentType);
        this.setParamSimple(map, prefix + "RiskInfo", this.RiskInfo);
        this.setParamArrayObj(map, prefix + "SuspectedDiagnosis.", this.SuspectedDiagnosis);
        this.setParamObj(map, prefix + "ReferralInfo.", this.ReferralInfo);
        this.setParamArrayObj(map, prefix + "CriticalInfo.", this.CriticalInfo);
        this.setParamObj(map, prefix + "VitalSignsInfo.", this.VitalSignsInfo);
        this.setParamArrayObj(map, prefix + "DifferDiagnosis.", this.DifferDiagnosis);
        this.setParamObj(map, prefix + "RecordQuality.", this.RecordQuality);
        this.setParamArrayObj(map, prefix + "CurrentDiagnosis.", this.CurrentDiagnosis);
        this.setParamArrayObj(map, prefix + "TreatmentGuide.", this.TreatmentGuide);
        this.setParamObj(map, prefix + "EmrQuality.", this.EmrQuality);
        this.setParamArrayObj(map, prefix + "HealthPrescriptions.", this.HealthPrescriptions);

    }
}

