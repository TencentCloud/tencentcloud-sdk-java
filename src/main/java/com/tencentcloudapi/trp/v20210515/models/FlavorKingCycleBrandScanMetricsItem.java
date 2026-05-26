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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlavorKingCycleBrandScanMetricsItem extends AbstractModel {

    /**
    * <p>日期范围</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>口味王分布</p>
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
     * Get <p>日期范围</p> 
     * @return Duration <p>日期范围</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>日期范围</p>
     * @param Duration <p>日期范围</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>口味王分布</p> 
     * @return Ratio <p>口味王分布</p>
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>口味王分布</p>
     * @param Ratio <p>口味王分布</p>
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    public FlavorKingCycleBrandScanMetricsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandScanMetricsItem(FlavorKingCycleBrandScanMetricsItem source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

