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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecUnit extends AbstractModel{

    /**
    * 计费项名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 计费项数量,建议不超过100万
    */
    @SerializedName("SpecCount")
    @Expose
    private Long SpecCount;

    /**
     * Get 计费项名称 
     * @return SpecName 计费项名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 计费项名称
     * @param SpecName 计费项名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 计费项数量,建议不超过100万 
     * @return SpecCount 计费项数量,建议不超过100万
     */
    public Long getSpecCount() {
        return this.SpecCount;
    }

    /**
     * Set 计费项数量,建议不超过100万
     * @param SpecCount 计费项数量,建议不超过100万
     */
    public void setSpecCount(Long SpecCount) {
        this.SpecCount = SpecCount;
    }

    public SpecUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecUnit(SpecUnit source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.SpecCount != null) {
            this.SpecCount = new Long(source.SpecCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "SpecCount", this.SpecCount);

    }
}

