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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricObjectMeaning extends AbstractModel{

    /**
    * 指标英文解释
    */
    @SerializedName("En")
    @Expose
    private String En;

    /**
    * 指标中文解释
    */
    @SerializedName("Zh")
    @Expose
    private String Zh;

    /**
     * Get 指标英文解释 
     * @return En 指标英文解释
     */
    public String getEn() {
        return this.En;
    }

    /**
     * Set 指标英文解释
     * @param En 指标英文解释
     */
    public void setEn(String En) {
        this.En = En;
    }

    /**
     * Get 指标中文解释 
     * @return Zh 指标中文解释
     */
    public String getZh() {
        return this.Zh;
    }

    /**
     * Set 指标中文解释
     * @param Zh 指标中文解释
     */
    public void setZh(String Zh) {
        this.Zh = Zh;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "En", this.En);
        this.setParamSimple(map, prefix + "Zh", this.Zh);

    }
}

