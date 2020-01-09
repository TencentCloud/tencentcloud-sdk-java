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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionsDetail extends AbstractModel{

    /**
    * 运营商列表
    */
    @SerializedName("Isp")
    @Expose
    private String [] Isp;

    /**
    * 省份列表
    */
    @SerializedName("Province")
    @Expose
    private String [] Province;

    /**
     * Get 运营商列表 
     * @return Isp 运营商列表
     */
    public String [] getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商列表
     * @param Isp 运营商列表
     */
    public void setIsp(String [] Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 省份列表 
     * @return Province 省份列表
     */
    public String [] getProvince() {
        return this.Province;
    }

    /**
     * Set 省份列表
     * @param Province 省份列表
     */
    public void setProvince(String [] Province) {
        this.Province = Province;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Isp.", this.Isp);
        this.setParamArraySimple(map, prefix + "Province.", this.Province);

    }
}

