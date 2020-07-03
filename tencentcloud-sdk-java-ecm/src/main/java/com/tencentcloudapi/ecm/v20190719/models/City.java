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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class City extends AbstractModel{

    /**
    * 城市ID
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 城市名称
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
     * Get 城市ID 
     * @return CityId 城市ID
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市ID
     * @param CityId 城市ID
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 城市名称 
     * @return CityName 城市名称
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 城市名称
     * @param CityName 城市名称
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "CityName", this.CityName);

    }
}

