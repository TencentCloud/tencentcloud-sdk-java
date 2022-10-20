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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogKafkaUINRequest extends AbstractModel{

    /**
    * 目标UIN
    */
    @SerializedName("DstUIN")
    @Expose
    private String DstUIN;

    /**
     * Get 目标UIN 
     * @return DstUIN 目标UIN
     */
    public String getDstUIN() {
        return this.DstUIN;
    }

    /**
     * Set 目标UIN
     * @param DstUIN 目标UIN
     */
    public void setDstUIN(String DstUIN) {
        this.DstUIN = DstUIN;
    }

    public ModifySecLogKafkaUINRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogKafkaUINRequest(ModifySecLogKafkaUINRequest source) {
        if (source.DstUIN != null) {
            this.DstUIN = new String(source.DstUIN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DstUIN", this.DstUIN);

    }
}

