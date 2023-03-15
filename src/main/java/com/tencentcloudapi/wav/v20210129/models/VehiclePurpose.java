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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VehiclePurpose extends AbstractModel{

    /**
    * 购车用途code
    */
    @SerializedName("VehiclePurposeCode")
    @Expose
    private String VehiclePurposeCode;

    /**
    * 购车用途名称
    */
    @SerializedName("VehiclePurposeName")
    @Expose
    private String VehiclePurposeName;

    /**
     * Get 购车用途code 
     * @return VehiclePurposeCode 购车用途code
     */
    public String getVehiclePurposeCode() {
        return this.VehiclePurposeCode;
    }

    /**
     * Set 购车用途code
     * @param VehiclePurposeCode 购车用途code
     */
    public void setVehiclePurposeCode(String VehiclePurposeCode) {
        this.VehiclePurposeCode = VehiclePurposeCode;
    }

    /**
     * Get 购车用途名称 
     * @return VehiclePurposeName 购车用途名称
     */
    public String getVehiclePurposeName() {
        return this.VehiclePurposeName;
    }

    /**
     * Set 购车用途名称
     * @param VehiclePurposeName 购车用途名称
     */
    public void setVehiclePurposeName(String VehiclePurposeName) {
        this.VehiclePurposeName = VehiclePurposeName;
    }

    public VehiclePurpose() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VehiclePurpose(VehiclePurpose source) {
        if (source.VehiclePurposeCode != null) {
            this.VehiclePurposeCode = new String(source.VehiclePurposeCode);
        }
        if (source.VehiclePurposeName != null) {
            this.VehiclePurposeName = new String(source.VehiclePurposeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VehiclePurposeCode", this.VehiclePurposeCode);
        this.setParamSimple(map, prefix + "VehiclePurposeName", this.VehiclePurposeName);

    }
}

