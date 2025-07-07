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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgePortrait extends AbstractModel {

    /**
    * 年龄区间
    */
    @SerializedName("AgeRange")
    @Expose
    private String AgeRange;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * Get 年龄区间 
     * @return AgeRange 年龄区间
     */
    public String getAgeRange() {
        return this.AgeRange;
    }

    /**
     * Set 年龄区间
     * @param AgeRange 年龄区间
     */
    public void setAgeRange(String AgeRange) {
        this.AgeRange = AgeRange;
    }

    /**
     * Get 百分比 
     * @return Percent 百分比
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比
     * @param Percent 百分比
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    public AgePortrait() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgePortrait(AgePortrait source) {
        if (source.AgeRange != null) {
            this.AgeRange = new String(source.AgeRange);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgeRange", this.AgeRange);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

