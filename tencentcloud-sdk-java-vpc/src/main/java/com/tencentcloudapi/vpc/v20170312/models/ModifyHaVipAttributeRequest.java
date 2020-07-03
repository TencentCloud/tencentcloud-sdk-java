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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHaVipAttributeRequest extends AbstractModel{

    /**
    * `HAVIP`唯一`ID`，形如：`havip-9o233uri`。
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * `HAVIP`名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
     * Get `HAVIP`唯一`ID`，形如：`havip-9o233uri`。 
     * @return HaVipId `HAVIP`唯一`ID`，形如：`havip-9o233uri`。
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set `HAVIP`唯一`ID`，形如：`havip-9o233uri`。
     * @param HaVipId `HAVIP`唯一`ID`，形如：`havip-9o233uri`。
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get `HAVIP`名称，可任意命名，但不得超过60个字符。 
     * @return HaVipName `HAVIP`名称，可任意命名，但不得超过60个字符。
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set `HAVIP`名称，可任意命名，但不得超过60个字符。
     * @param HaVipName `HAVIP`名称，可任意命名，但不得超过60个字符。
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);

    }
}

