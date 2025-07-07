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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddHardwareRequest extends AbstractModel {

    /**
    * 硬件列表
    */
    @SerializedName("Hardware")
    @Expose
    private Hardware [] Hardware;

    /**
     * Get 硬件列表 
     * @return Hardware 硬件列表
     */
    public Hardware [] getHardware() {
        return this.Hardware;
    }

    /**
     * Set 硬件列表
     * @param Hardware 硬件列表
     */
    public void setHardware(Hardware [] Hardware) {
        this.Hardware = Hardware;
    }

    public AddHardwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddHardwareRequest(AddHardwareRequest source) {
        if (source.Hardware != null) {
            this.Hardware = new Hardware[source.Hardware.length];
            for (int i = 0; i < source.Hardware.length; i++) {
                this.Hardware[i] = new Hardware(source.Hardware[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Hardware.", this.Hardware);

    }
}

