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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackInfo extends AbstractModel{

    /**
    * 套餐包的类型，取值[
staticpack：高防IP三网套餐包
insurance：保险套餐包
]
    */
    @SerializedName("PackType")
    @Expose
    private String PackType;

    /**
    * 套餐包的ID
    */
    @SerializedName("PackId")
    @Expose
    private String PackId;

    /**
     * Get 套餐包的类型，取值[
staticpack：高防IP三网套餐包
insurance：保险套餐包
] 
     * @return PackType 套餐包的类型，取值[
staticpack：高防IP三网套餐包
insurance：保险套餐包
]
     */
    public String getPackType() {
        return this.PackType;
    }

    /**
     * Set 套餐包的类型，取值[
staticpack：高防IP三网套餐包
insurance：保险套餐包
]
     * @param PackType 套餐包的类型，取值[
staticpack：高防IP三网套餐包
insurance：保险套餐包
]
     */
    public void setPackType(String PackType) {
        this.PackType = PackType;
    }

    /**
     * Get 套餐包的ID 
     * @return PackId 套餐包的ID
     */
    public String getPackId() {
        return this.PackId;
    }

    /**
     * Set 套餐包的ID
     * @param PackId 套餐包的ID
     */
    public void setPackId(String PackId) {
        this.PackId = PackId;
    }

    public PackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackInfo(PackInfo source) {
        if (source.PackType != null) {
            this.PackType = new String(source.PackType);
        }
        if (source.PackId != null) {
            this.PackId = new String(source.PackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackType", this.PackType);
        this.setParamSimple(map, prefix + "PackId", this.PackId);

    }
}

