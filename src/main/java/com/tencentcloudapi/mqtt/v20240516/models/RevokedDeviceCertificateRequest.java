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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RevokedDeviceCertificateRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设备证书序列号
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设备证书序列号 
     * @return DeviceCertificateSn 设备证书序列号
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set 设备证书序列号
     * @param DeviceCertificateSn 设备证书序列号
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    public RevokedDeviceCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokedDeviceCertificateRequest(RevokedDeviceCertificateRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceCertificateSn != null) {
            this.DeviceCertificateSn = new String(source.DeviceCertificateSn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceCertificateSn", this.DeviceCertificateSn);

    }
}

