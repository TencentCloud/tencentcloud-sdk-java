/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostItem extends AbstractModel {

    /**
    * 计费项名称
    */
    @SerializedName("CostName")
    @Expose
    private String CostName;

    /**
    * 计费项值
    */
    @SerializedName("CostValue")
    @Expose
    private Long CostValue;

    /**
     * Get 计费项名称 
     * @return CostName 计费项名称
     */
    public String getCostName() {
        return this.CostName;
    }

    /**
     * Set 计费项名称
     * @param CostName 计费项名称
     */
    public void setCostName(String CostName) {
        this.CostName = CostName;
    }

    /**
     * Get 计费项值 
     * @return CostValue 计费项值
     */
    public Long getCostValue() {
        return this.CostValue;
    }

    /**
     * Set 计费项值
     * @param CostValue 计费项值
     */
    public void setCostValue(Long CostValue) {
        this.CostValue = CostValue;
    }

    public CostItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostItem(CostItem source) {
        if (source.CostName != null) {
            this.CostName = new String(source.CostName);
        }
        if (source.CostValue != null) {
            this.CostValue = new Long(source.CostValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CostName", this.CostName);
        this.setParamSimple(map, prefix + "CostValue", this.CostValue);

    }
}

