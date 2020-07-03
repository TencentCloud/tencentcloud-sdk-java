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

public class LightResult extends AbstractModel{

    /**
    * 光照程度，参考提交任务时的LightStandard指定的Name参数
    */
    @SerializedName("LightLevel")
    @Expose
    private String LightLevel;

    /**
    * 光照亮度
    */
    @SerializedName("LightValue")
    @Expose
    private Float LightValue;

    /**
     * Get 光照程度，参考提交任务时的LightStandard指定的Name参数 
     * @return LightLevel 光照程度，参考提交任务时的LightStandard指定的Name参数
     */
    public String getLightLevel() {
        return this.LightLevel;
    }

    /**
     * Set 光照程度，参考提交任务时的LightStandard指定的Name参数
     * @param LightLevel 光照程度，参考提交任务时的LightStandard指定的Name参数
     */
    public void setLightLevel(String LightLevel) {
        this.LightLevel = LightLevel;
    }

    /**
     * Get 光照亮度 
     * @return LightValue 光照亮度
     */
    public Float getLightValue() {
        return this.LightValue;
    }

    /**
     * Set 光照亮度
     * @param LightValue 光照亮度
     */
    public void setLightValue(Float LightValue) {
        this.LightValue = LightValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LightLevel", this.LightLevel);
        this.setParamSimple(map, prefix + "LightValue", this.LightValue);

    }
}

