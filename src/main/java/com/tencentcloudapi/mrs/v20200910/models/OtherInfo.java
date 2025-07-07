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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherInfo extends AbstractModel {

    /**
    * 麻醉方法
    */
    @SerializedName("Anesthesia")
    @Expose
    private SurgeryAttr Anesthesia;

    /**
    * 术中出血
    */
    @SerializedName("BloodLoss")
    @Expose
    private SurgeryAttr BloodLoss;

    /**
    * 输血
    */
    @SerializedName("BloodTransfusion")
    @Expose
    private SurgeryAttr BloodTransfusion;

    /**
    * 手术用时
    */
    @SerializedName("Duration")
    @Expose
    private SurgeryAttr Duration;

    /**
    * 手术开始时间
    */
    @SerializedName("EndTime")
    @Expose
    private SurgeryAttr EndTime;

    /**
    * 手术结束时间
    */
    @SerializedName("StartTime")
    @Expose
    private SurgeryAttr StartTime;

    /**
     * Get 麻醉方法 
     * @return Anesthesia 麻醉方法
     */
    public SurgeryAttr getAnesthesia() {
        return this.Anesthesia;
    }

    /**
     * Set 麻醉方法
     * @param Anesthesia 麻醉方法
     */
    public void setAnesthesia(SurgeryAttr Anesthesia) {
        this.Anesthesia = Anesthesia;
    }

    /**
     * Get 术中出血 
     * @return BloodLoss 术中出血
     */
    public SurgeryAttr getBloodLoss() {
        return this.BloodLoss;
    }

    /**
     * Set 术中出血
     * @param BloodLoss 术中出血
     */
    public void setBloodLoss(SurgeryAttr BloodLoss) {
        this.BloodLoss = BloodLoss;
    }

    /**
     * Get 输血 
     * @return BloodTransfusion 输血
     */
    public SurgeryAttr getBloodTransfusion() {
        return this.BloodTransfusion;
    }

    /**
     * Set 输血
     * @param BloodTransfusion 输血
     */
    public void setBloodTransfusion(SurgeryAttr BloodTransfusion) {
        this.BloodTransfusion = BloodTransfusion;
    }

    /**
     * Get 手术用时 
     * @return Duration 手术用时
     */
    public SurgeryAttr getDuration() {
        return this.Duration;
    }

    /**
     * Set 手术用时
     * @param Duration 手术用时
     */
    public void setDuration(SurgeryAttr Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 手术开始时间 
     * @return EndTime 手术开始时间
     */
    public SurgeryAttr getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 手术开始时间
     * @param EndTime 手术开始时间
     */
    public void setEndTime(SurgeryAttr EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 手术结束时间 
     * @return StartTime 手术结束时间
     */
    public SurgeryAttr getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 手术结束时间
     * @param StartTime 手术结束时间
     */
    public void setStartTime(SurgeryAttr StartTime) {
        this.StartTime = StartTime;
    }

    public OtherInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherInfo(OtherInfo source) {
        if (source.Anesthesia != null) {
            this.Anesthesia = new SurgeryAttr(source.Anesthesia);
        }
        if (source.BloodLoss != null) {
            this.BloodLoss = new SurgeryAttr(source.BloodLoss);
        }
        if (source.BloodTransfusion != null) {
            this.BloodTransfusion = new SurgeryAttr(source.BloodTransfusion);
        }
        if (source.Duration != null) {
            this.Duration = new SurgeryAttr(source.Duration);
        }
        if (source.EndTime != null) {
            this.EndTime = new SurgeryAttr(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new SurgeryAttr(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Anesthesia.", this.Anesthesia);
        this.setParamObj(map, prefix + "BloodLoss.", this.BloodLoss);
        this.setParamObj(map, prefix + "BloodTransfusion.", this.BloodTransfusion);
        this.setParamObj(map, prefix + "Duration.", this.Duration);
        this.setParamObj(map, prefix + "EndTime.", this.EndTime);
        this.setParamObj(map, prefix + "StartTime.", this.StartTime);

    }
}

