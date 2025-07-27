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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosCredentialRequest extends AbstractModel {

    /**
    * Cos 密钥类型，取值： Mobile 云手游、PC 云端游、AndroidApp 云手机应用管理、AndroidAppFile 云手机文件管理、AndroidAppBackup 云手机备份还原
    */
    @SerializedName("CosType")
    @Expose
    private String CosType;

    /**
    * 云手机应用管理 Cos 数据
    */
    @SerializedName("AndroidAppCosInfo")
    @Expose
    private AndroidAppCosInfo AndroidAppCosInfo;

    /**
    * 云手机文件管理 Cos 数据
    */
    @SerializedName("AndroidAppFileCosInfo")
    @Expose
    private FileCosInfo AndroidAppFileCosInfo;

    /**
     * Get Cos 密钥类型，取值： Mobile 云手游、PC 云端游、AndroidApp 云手机应用管理、AndroidAppFile 云手机文件管理、AndroidAppBackup 云手机备份还原 
     * @return CosType Cos 密钥类型，取值： Mobile 云手游、PC 云端游、AndroidApp 云手机应用管理、AndroidAppFile 云手机文件管理、AndroidAppBackup 云手机备份还原
     */
    public String getCosType() {
        return this.CosType;
    }

    /**
     * Set Cos 密钥类型，取值： Mobile 云手游、PC 云端游、AndroidApp 云手机应用管理、AndroidAppFile 云手机文件管理、AndroidAppBackup 云手机备份还原
     * @param CosType Cos 密钥类型，取值： Mobile 云手游、PC 云端游、AndroidApp 云手机应用管理、AndroidAppFile 云手机文件管理、AndroidAppBackup 云手机备份还原
     */
    public void setCosType(String CosType) {
        this.CosType = CosType;
    }

    /**
     * Get 云手机应用管理 Cos 数据 
     * @return AndroidAppCosInfo 云手机应用管理 Cos 数据
     */
    public AndroidAppCosInfo getAndroidAppCosInfo() {
        return this.AndroidAppCosInfo;
    }

    /**
     * Set 云手机应用管理 Cos 数据
     * @param AndroidAppCosInfo 云手机应用管理 Cos 数据
     */
    public void setAndroidAppCosInfo(AndroidAppCosInfo AndroidAppCosInfo) {
        this.AndroidAppCosInfo = AndroidAppCosInfo;
    }

    /**
     * Get 云手机文件管理 Cos 数据 
     * @return AndroidAppFileCosInfo 云手机文件管理 Cos 数据
     */
    public FileCosInfo getAndroidAppFileCosInfo() {
        return this.AndroidAppFileCosInfo;
    }

    /**
     * Set 云手机文件管理 Cos 数据
     * @param AndroidAppFileCosInfo 云手机文件管理 Cos 数据
     */
    public void setAndroidAppFileCosInfo(FileCosInfo AndroidAppFileCosInfo) {
        this.AndroidAppFileCosInfo = AndroidAppFileCosInfo;
    }

    public CreateCosCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosCredentialRequest(CreateCosCredentialRequest source) {
        if (source.CosType != null) {
            this.CosType = new String(source.CosType);
        }
        if (source.AndroidAppCosInfo != null) {
            this.AndroidAppCosInfo = new AndroidAppCosInfo(source.AndroidAppCosInfo);
        }
        if (source.AndroidAppFileCosInfo != null) {
            this.AndroidAppFileCosInfo = new FileCosInfo(source.AndroidAppFileCosInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosType", this.CosType);
        this.setParamObj(map, prefix + "AndroidAppCosInfo.", this.AndroidAppCosInfo);
        this.setParamObj(map, prefix + "AndroidAppFileCosInfo.", this.AndroidAppFileCosInfo);

    }
}

