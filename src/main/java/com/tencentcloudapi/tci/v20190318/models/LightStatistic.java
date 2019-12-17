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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LightStatistic extends AbstractModel{

    /**
    * 各个时间点的光线值
    */
    @SerializedName("LightDistribution")
    @Expose
    private LightDistributionStatistic [] LightDistribution;

    /**
    * 光照程度比例统计结果
    */
    @SerializedName("LightLevelRatio")
    @Expose
    private LightLevelRatioStatistic [] LightLevelRatio;

    /**
     * Get 各个时间点的光线值 
     * @return LightDistribution 各个时间点的光线值
     */
    public LightDistributionStatistic [] getLightDistribution() {
        return this.LightDistribution;
    }

    /**
     * Set 各个时间点的光线值
     * @param LightDistribution 各个时间点的光线值
     */
    public void setLightDistribution(LightDistributionStatistic [] LightDistribution) {
        this.LightDistribution = LightDistribution;
    }

    /**
     * Get 光照程度比例统计结果 
     * @return LightLevelRatio 光照程度比例统计结果
     */
    public LightLevelRatioStatistic [] getLightLevelRatio() {
        return this.LightLevelRatio;
    }

    /**
     * Set 光照程度比例统计结果
     * @param LightLevelRatio 光照程度比例统计结果
     */
    public void setLightLevelRatio(LightLevelRatioStatistic [] LightLevelRatio) {
        this.LightLevelRatio = LightLevelRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LightDistribution.", this.LightDistribution);
        this.setParamArrayObj(map, prefix + "LightLevelRatio.", this.LightLevelRatio);

    }
}

