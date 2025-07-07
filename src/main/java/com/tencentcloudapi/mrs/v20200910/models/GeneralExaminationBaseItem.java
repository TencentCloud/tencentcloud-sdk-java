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

public class GeneralExaminationBaseItem extends AbstractModel {

    /**
    * 生命体征
    */
    @SerializedName("VitalSign")
    @Expose
    private GeneralExaminationVitalSign VitalSign;

    /**
    * 其他
    */
    @SerializedName("Others")
    @Expose
    private GeneralExaminationOthers Others;

    /**
    * 小结
    */
    @SerializedName("BriefSummary")
    @Expose
    private GeneralExaminationBriefSummary BriefSummary;

    /**
     * Get 生命体征 
     * @return VitalSign 生命体征
     */
    public GeneralExaminationVitalSign getVitalSign() {
        return this.VitalSign;
    }

    /**
     * Set 生命体征
     * @param VitalSign 生命体征
     */
    public void setVitalSign(GeneralExaminationVitalSign VitalSign) {
        this.VitalSign = VitalSign;
    }

    /**
     * Get 其他 
     * @return Others 其他
     */
    public GeneralExaminationOthers getOthers() {
        return this.Others;
    }

    /**
     * Set 其他
     * @param Others 其他
     */
    public void setOthers(GeneralExaminationOthers Others) {
        this.Others = Others;
    }

    /**
     * Get 小结 
     * @return BriefSummary 小结
     */
    public GeneralExaminationBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 小结
     * @param BriefSummary 小结
     */
    public void setBriefSummary(GeneralExaminationBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public GeneralExaminationBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralExaminationBaseItem(GeneralExaminationBaseItem source) {
        if (source.VitalSign != null) {
            this.VitalSign = new GeneralExaminationVitalSign(source.VitalSign);
        }
        if (source.Others != null) {
            this.Others = new GeneralExaminationOthers(source.Others);
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new GeneralExaminationBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VitalSign.", this.VitalSign);
        this.setParamObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

