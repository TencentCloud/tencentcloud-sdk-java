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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveInfo extends AbstractModel{

    /**
    * 存储类型，可选值： 
1：CosInfo。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Cos形式存储信息，当Type等于1时必选。
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
     * Get 存储类型，可选值： 
1：CosInfo。 
     * @return Type 存储类型，可选值： 
1：CosInfo。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 存储类型，可选值： 
1：CosInfo。
     * @param Type 存储类型，可选值： 
1：CosInfo。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Cos形式存储信息，当Type等于1时必选。 
     * @return CosInfo Cos形式存储信息，当Type等于1时必选。
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set Cos形式存储信息，当Type等于1时必选。
     * @param CosInfo Cos形式存储信息，当Type等于1时必选。
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);

    }
}

