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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddDeviceResponse extends AbstractModel{

    /**
    * 经过加密算法加密后的base64格式密钥
    */
    @SerializedName("DataKey")
    @Expose
    private String DataKey;

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 签名字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 经过加密算法加密后的base64格式密钥 
     * @return DataKey 经过加密算法加密后的base64格式密钥
     */
    public String getDataKey() {
        return this.DataKey;
    }

    /**
     * Set 经过加密算法加密后的base64格式密钥
     * @param DataKey 经过加密算法加密后的base64格式密钥
     */
    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 签名字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Signature 签名字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 签名字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param Signature 签名字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public AddDeviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDeviceResponse(AddDeviceResponse source) {
        if (source.DataKey != null) {
            this.DataKey = new String(source.DataKey);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKey", this.DataKey);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

