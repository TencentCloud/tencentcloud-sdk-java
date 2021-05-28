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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo extends AbstractModel{

    /**
    * 厂商名称
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 此厂商旗下的设备信息列表
    */
    @SerializedName("HsmTypes")
    @Expose
    private HsmInfo [] HsmTypes;

    /**
     * Get 厂商名称 
     * @return Manufacturer 厂商名称
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 厂商名称
     * @param Manufacturer 厂商名称
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 此厂商旗下的设备信息列表 
     * @return HsmTypes 此厂商旗下的设备信息列表
     */
    public HsmInfo [] getHsmTypes() {
        return this.HsmTypes;
    }

    /**
     * Set 此厂商旗下的设备信息列表
     * @param HsmTypes 此厂商旗下的设备信息列表
     */
    public void setHsmTypes(HsmInfo [] HsmTypes) {
        this.HsmTypes = HsmTypes;
    }

    public DeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceInfo(DeviceInfo source) {
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.HsmTypes != null) {
            this.HsmTypes = new HsmInfo[source.HsmTypes.length];
            for (int i = 0; i < source.HsmTypes.length; i++) {
                this.HsmTypes[i] = new HsmInfo(source.HsmTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamArrayObj(map, prefix + "HsmTypes.", this.HsmTypes);

    }
}

