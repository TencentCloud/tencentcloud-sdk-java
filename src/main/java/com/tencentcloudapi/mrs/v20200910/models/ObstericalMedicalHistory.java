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

public class ObstericalMedicalHistory extends AbstractModel {

    /**
    * 婚史
    */
    @SerializedName("MarriageHistory")
    @Expose
    private String MarriageHistory;

    /**
    * 孕史
    */
    @SerializedName("FertilityHistory")
    @Expose
    private String FertilityHistory;

    /**
     * Get 婚史 
     * @return MarriageHistory 婚史
     */
    public String getMarriageHistory() {
        return this.MarriageHistory;
    }

    /**
     * Set 婚史
     * @param MarriageHistory 婚史
     */
    public void setMarriageHistory(String MarriageHistory) {
        this.MarriageHistory = MarriageHistory;
    }

    /**
     * Get 孕史 
     * @return FertilityHistory 孕史
     */
    public String getFertilityHistory() {
        return this.FertilityHistory;
    }

    /**
     * Set 孕史
     * @param FertilityHistory 孕史
     */
    public void setFertilityHistory(String FertilityHistory) {
        this.FertilityHistory = FertilityHistory;
    }

    public ObstericalMedicalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObstericalMedicalHistory(ObstericalMedicalHistory source) {
        if (source.MarriageHistory != null) {
            this.MarriageHistory = new String(source.MarriageHistory);
        }
        if (source.FertilityHistory != null) {
            this.FertilityHistory = new String(source.FertilityHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarriageHistory", this.MarriageHistory);
        this.setParamSimple(map, prefix + "FertilityHistory", this.FertilityHistory);

    }
}

