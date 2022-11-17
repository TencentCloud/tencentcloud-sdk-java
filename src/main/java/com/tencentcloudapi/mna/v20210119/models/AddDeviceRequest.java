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

public class AddDeviceRequest extends AbstractModel{

    /**
    * 新建设备的名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 新建设备的备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
    */
    @SerializedName("DataKey")
    @Expose
    private String DataKey;

    /**
    * 是否设置预置密钥
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
     * Get 新建设备的名称 
     * @return DeviceName 新建设备的名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 新建设备的名称
     * @param DeviceName 新建设备的名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 新建设备的备注 
     * @return Remark 新建设备的备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 新建设备的备注
     * @param Remark 新建设备的备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成 
     * @return DataKey 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
     */
    public String getDataKey() {
        return this.DataKey;
    }

    /**
     * Set 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
     * @param DataKey 新建设备的base64密钥字符串，非必选，如果不填写则由系统自动生成
     */
    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    /**
     * Get 是否设置预置密钥 
     * @return Encrypted 是否设置预置密钥
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set 是否设置预置密钥
     * @param Encrypted 是否设置预置密钥
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    public AddDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDeviceRequest(AddDeviceRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DataKey != null) {
            this.DataKey = new String(source.DataKey);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DataKey", this.DataKey);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);

    }
}

