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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetDeviceResult extends AbstractModel{

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 是否成功
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 是否成功 
     * @return Success 是否成功
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set 是否成功
     * @param Success 是否成功
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ResetDeviceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetDeviceResult(ResetDeviceResult source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

