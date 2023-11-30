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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSLConfig extends AbstractModel {

    /**
    * SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLValidityPeriod")
    @Expose
    private String SSLValidityPeriod;

    /**
    * SSL证书有效性，0-无效，1-有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLValidity")
    @Expose
    private Long SSLValidity;

    /**
     * Get SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encryption SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encryption SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLValidityPeriod SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSLValidityPeriod() {
        return this.SSLValidityPeriod;
    }

    /**
     * Set SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLValidityPeriod SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLValidityPeriod(String SSLValidityPeriod) {
        this.SSLValidityPeriod = SSLValidityPeriod;
    }

    /**
     * Get SSL证书有效性，0-无效，1-有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLValidity SSL证书有效性，0-无效，1-有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSSLValidity() {
        return this.SSLValidity;
    }

    /**
     * Set SSL证书有效性，0-无效，1-有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLValidity SSL证书有效性，0-无效，1-有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLValidity(Long SSLValidity) {
        this.SSLValidity = SSLValidity;
    }

    public SSLConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSLConfig(SSLConfig source) {
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.SSLValidityPeriod != null) {
            this.SSLValidityPeriod = new String(source.SSLValidityPeriod);
        }
        if (source.SSLValidity != null) {
            this.SSLValidity = new Long(source.SSLValidity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "SSLValidityPeriod", this.SSLValidityPeriod);
        this.setParamSimple(map, prefix + "SSLValidity", this.SSLValidity);

    }
}

