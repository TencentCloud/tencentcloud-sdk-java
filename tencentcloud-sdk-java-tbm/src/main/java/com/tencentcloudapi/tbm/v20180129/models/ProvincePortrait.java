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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProvincePortrait extends AbstractModel{

    /**
    * 省份名称
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * Get 省份名称 
     * @return Province 省份名称
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份名称
     * @param Province 省份名称
     */
    public void setProvince(String Province) {
        this.Province = Province;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

