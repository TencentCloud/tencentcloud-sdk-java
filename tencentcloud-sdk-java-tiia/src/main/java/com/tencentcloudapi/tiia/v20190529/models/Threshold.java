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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Threshold extends AbstractModel{

    /**
    * 误识率在百分之一时的推荐阈值。
    */
    @SerializedName("FalseRate1Percent")
    @Expose
    private Long FalseRate1Percent;

    /**
    * 误识率在千分之五时的推荐阈值。
    */
    @SerializedName("FalseRate5Permil")
    @Expose
    private Long FalseRate5Permil;

    /**
    * 误识率在千分之一时的推荐阈值。
    */
    @SerializedName("FalseRate1Permil")
    @Expose
    private Long FalseRate1Permil;

    /**
     * Get 误识率在百分之一时的推荐阈值。 
     * @return FalseRate1Percent 误识率在百分之一时的推荐阈值。
     */
    public Long getFalseRate1Percent() {
        return this.FalseRate1Percent;
    }

    /**
     * Set 误识率在百分之一时的推荐阈值。
     * @param FalseRate1Percent 误识率在百分之一时的推荐阈值。
     */
    public void setFalseRate1Percent(Long FalseRate1Percent) {
        this.FalseRate1Percent = FalseRate1Percent;
    }

    /**
     * Get 误识率在千分之五时的推荐阈值。 
     * @return FalseRate5Permil 误识率在千分之五时的推荐阈值。
     */
    public Long getFalseRate5Permil() {
        return this.FalseRate5Permil;
    }

    /**
     * Set 误识率在千分之五时的推荐阈值。
     * @param FalseRate5Permil 误识率在千分之五时的推荐阈值。
     */
    public void setFalseRate5Permil(Long FalseRate5Permil) {
        this.FalseRate5Permil = FalseRate5Permil;
    }

    /**
     * Get 误识率在千分之一时的推荐阈值。 
     * @return FalseRate1Permil 误识率在千分之一时的推荐阈值。
     */
    public Long getFalseRate1Permil() {
        return this.FalseRate1Permil;
    }

    /**
     * Set 误识率在千分之一时的推荐阈值。
     * @param FalseRate1Permil 误识率在千分之一时的推荐阈值。
     */
    public void setFalseRate1Permil(Long FalseRate1Permil) {
        this.FalseRate1Permil = FalseRate1Permil;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FalseRate1Percent", this.FalseRate1Percent);
        this.setParamSimple(map, prefix + "FalseRate5Permil", this.FalseRate5Permil);
        this.setParamSimple(map, prefix + "FalseRate1Permil", this.FalseRate1Permil);

    }
}

