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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverwriteWhiteBoxDeviceFingerprintsRequest extends AbstractModel {

    /**
    * 白盒密钥ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 设备指纹列表，如果列表为空，则表示删除该密钥对应的所有指纹信息。列表最大长度不超过200。
    */
    @SerializedName("DeviceFingerprints")
    @Expose
    private DeviceFingerprint [] DeviceFingerprints;

    /**
     * Get 白盒密钥ID 
     * @return KeyId 白盒密钥ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 白盒密钥ID
     * @param KeyId 白盒密钥ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 设备指纹列表，如果列表为空，则表示删除该密钥对应的所有指纹信息。列表最大长度不超过200。 
     * @return DeviceFingerprints 设备指纹列表，如果列表为空，则表示删除该密钥对应的所有指纹信息。列表最大长度不超过200。
     */
    public DeviceFingerprint [] getDeviceFingerprints() {
        return this.DeviceFingerprints;
    }

    /**
     * Set 设备指纹列表，如果列表为空，则表示删除该密钥对应的所有指纹信息。列表最大长度不超过200。
     * @param DeviceFingerprints 设备指纹列表，如果列表为空，则表示删除该密钥对应的所有指纹信息。列表最大长度不超过200。
     */
    public void setDeviceFingerprints(DeviceFingerprint [] DeviceFingerprints) {
        this.DeviceFingerprints = DeviceFingerprints;
    }

    public OverwriteWhiteBoxDeviceFingerprintsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverwriteWhiteBoxDeviceFingerprintsRequest(OverwriteWhiteBoxDeviceFingerprintsRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.DeviceFingerprints != null) {
            this.DeviceFingerprints = new DeviceFingerprint[source.DeviceFingerprints.length];
            for (int i = 0; i < source.DeviceFingerprints.length; i++) {
                this.DeviceFingerprints[i] = new DeviceFingerprint(source.DeviceFingerprints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamArrayObj(map, prefix + "DeviceFingerprints.", this.DeviceFingerprints);

    }
}

