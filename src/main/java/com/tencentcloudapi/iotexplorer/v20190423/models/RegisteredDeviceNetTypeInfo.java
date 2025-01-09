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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisteredDeviceNetTypeInfo extends AbstractModel {

    /**
    * 普通设备数
    */
    @SerializedName("NormalDeviceNum")
    @Expose
    private Long NormalDeviceNum;

    /**
    * 蓝牙设备数
    */
    @SerializedName("BluetoothDeviceNum")
    @Expose
    private Long BluetoothDeviceNum;

    /**
     * Get 普通设备数 
     * @return NormalDeviceNum 普通设备数
     */
    public Long getNormalDeviceNum() {
        return this.NormalDeviceNum;
    }

    /**
     * Set 普通设备数
     * @param NormalDeviceNum 普通设备数
     */
    public void setNormalDeviceNum(Long NormalDeviceNum) {
        this.NormalDeviceNum = NormalDeviceNum;
    }

    /**
     * Get 蓝牙设备数 
     * @return BluetoothDeviceNum 蓝牙设备数
     */
    public Long getBluetoothDeviceNum() {
        return this.BluetoothDeviceNum;
    }

    /**
     * Set 蓝牙设备数
     * @param BluetoothDeviceNum 蓝牙设备数
     */
    public void setBluetoothDeviceNum(Long BluetoothDeviceNum) {
        this.BluetoothDeviceNum = BluetoothDeviceNum;
    }

    public RegisteredDeviceNetTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisteredDeviceNetTypeInfo(RegisteredDeviceNetTypeInfo source) {
        if (source.NormalDeviceNum != null) {
            this.NormalDeviceNum = new Long(source.NormalDeviceNum);
        }
        if (source.BluetoothDeviceNum != null) {
            this.BluetoothDeviceNum = new Long(source.BluetoothDeviceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NormalDeviceNum", this.NormalDeviceNum);
        this.setParamSimple(map, prefix + "BluetoothDeviceNum", this.BluetoothDeviceNum);

    }
}

