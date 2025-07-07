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

public class ObstetricalHistoryBlock extends AbstractModel {

    /**
    * 婚姻史
    */
    @SerializedName("MarriageHistory")
    @Expose
    private MenstrualHistoryDetailBlock MarriageHistory;

    /**
    * 婚育史
    */
    @SerializedName("FertilityHistory")
    @Expose
    private FertilityHistoryBlock FertilityHistory;

    /**
     * Get 婚姻史 
     * @return MarriageHistory 婚姻史
     */
    public MenstrualHistoryDetailBlock getMarriageHistory() {
        return this.MarriageHistory;
    }

    /**
     * Set 婚姻史
     * @param MarriageHistory 婚姻史
     */
    public void setMarriageHistory(MenstrualHistoryDetailBlock MarriageHistory) {
        this.MarriageHistory = MarriageHistory;
    }

    /**
     * Get 婚育史 
     * @return FertilityHistory 婚育史
     */
    public FertilityHistoryBlock getFertilityHistory() {
        return this.FertilityHistory;
    }

    /**
     * Set 婚育史
     * @param FertilityHistory 婚育史
     */
    public void setFertilityHistory(FertilityHistoryBlock FertilityHistory) {
        this.FertilityHistory = FertilityHistory;
    }

    public ObstetricalHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObstetricalHistoryBlock(ObstetricalHistoryBlock source) {
        if (source.MarriageHistory != null) {
            this.MarriageHistory = new MenstrualHistoryDetailBlock(source.MarriageHistory);
        }
        if (source.FertilityHistory != null) {
            this.FertilityHistory = new FertilityHistoryBlock(source.FertilityHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MarriageHistory.", this.MarriageHistory);
        this.setParamObj(map, prefix + "FertilityHistory.", this.FertilityHistory);

    }
}

