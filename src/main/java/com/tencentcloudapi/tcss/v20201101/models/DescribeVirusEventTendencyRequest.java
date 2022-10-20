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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusEventTendencyRequest extends AbstractModel{

    /**
    * 趋势周期(默认为7天)
    */
    @SerializedName("TendencyPeriod")
    @Expose
    private Long TendencyPeriod;

    /**
     * Get 趋势周期(默认为7天) 
     * @return TendencyPeriod 趋势周期(默认为7天)
     */
    public Long getTendencyPeriod() {
        return this.TendencyPeriod;
    }

    /**
     * Set 趋势周期(默认为7天)
     * @param TendencyPeriod 趋势周期(默认为7天)
     */
    public void setTendencyPeriod(Long TendencyPeriod) {
        this.TendencyPeriod = TendencyPeriod;
    }

    public DescribeVirusEventTendencyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusEventTendencyRequest(DescribeVirusEventTendencyRequest source) {
        if (source.TendencyPeriod != null) {
            this.TendencyPeriod = new Long(source.TendencyPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TendencyPeriod", this.TendencyPeriod);

    }
}

