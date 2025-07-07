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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceCertificate extends AbstractModel {

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 设备初始证书信息，base64编码
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * 设备私钥下载地址
    */
    @SerializedName("WhiteBoxSoUrl")
    @Expose
    private String WhiteBoxSoUrl;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 设备初始证书信息，base64编码 
     * @return Certificate 设备初始证书信息，base64编码
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 设备初始证书信息，base64编码
     * @param Certificate 设备初始证书信息，base64编码
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 设备私钥下载地址 
     * @return WhiteBoxSoUrl 设备私钥下载地址
     */
    public String getWhiteBoxSoUrl() {
        return this.WhiteBoxSoUrl;
    }

    /**
     * Set 设备私钥下载地址
     * @param WhiteBoxSoUrl 设备私钥下载地址
     */
    public void setWhiteBoxSoUrl(String WhiteBoxSoUrl) {
        this.WhiteBoxSoUrl = WhiteBoxSoUrl;
    }

    public DeviceCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCertificate(DeviceCertificate source) {
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.Certificate != null) {
            this.Certificate = new String(source.Certificate);
        }
        if (source.WhiteBoxSoUrl != null) {
            this.WhiteBoxSoUrl = new String(source.WhiteBoxSoUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "WhiteBoxSoUrl", this.WhiteBoxSoUrl);

    }
}

