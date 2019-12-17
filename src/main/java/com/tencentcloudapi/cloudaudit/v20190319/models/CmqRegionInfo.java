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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmqRegionInfo extends AbstractModel{

    /**
    * cmq地域
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 地域描述
    */
    @SerializedName("CmqRegionName")
    @Expose
    private String CmqRegionName;

    /**
     * Get cmq地域 
     * @return CmqRegion cmq地域
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set cmq地域
     * @param CmqRegion cmq地域
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get 地域描述 
     * @return CmqRegionName 地域描述
     */
    public String getCmqRegionName() {
        return this.CmqRegionName;
    }

    /**
     * Set 地域描述
     * @param CmqRegionName 地域描述
     */
    public void setCmqRegionName(String CmqRegionName) {
        this.CmqRegionName = CmqRegionName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "CmqRegionName", this.CmqRegionName);

    }
}

