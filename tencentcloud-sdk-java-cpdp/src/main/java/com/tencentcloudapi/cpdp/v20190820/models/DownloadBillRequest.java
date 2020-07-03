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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadBillRequest extends AbstractModel{

    /**
    * 请求下载对账单日期
    */
    @SerializedName("StateDate")
    @Expose
    private String StateDate;

    /**
    * 聚鑫分配的MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 聚鑫分配的SecretId
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 使用聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
     * Get 请求下载对账单日期 
     * @return StateDate 请求下载对账单日期
     */
    public String getStateDate() {
        return this.StateDate;
    }

    /**
     * Set 请求下载对账单日期
     * @param StateDate 请求下载对账单日期
     */
    public void setStateDate(String StateDate) {
        this.StateDate = StateDate;
    }

    /**
     * Get 聚鑫分配的MidasAppId 
     * @return MidasAppId 聚鑫分配的MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的MidasAppId
     * @param MidasAppId 聚鑫分配的MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 聚鑫分配的SecretId 
     * @return MidasSecretId 聚鑫分配的SecretId
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的SecretId
     * @param MidasSecretId 聚鑫分配的SecretId
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 使用聚鑫安全密钥计算的签名 
     * @return MidasSignature 使用聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 使用聚鑫安全密钥计算的签名
     * @param MidasSignature 使用聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StateDate", this.StateDate);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);

    }
}

