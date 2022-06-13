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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignQrCode extends AbstractModel{

    /**
    * 二维码id
    */
    @SerializedName("QrCodeId")
    @Expose
    private String QrCodeId;

    /**
    * 二维码url
    */
    @SerializedName("QrCodeUrl")
    @Expose
    private String QrCodeUrl;

    /**
    * 二维码过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get 二维码id 
     * @return QrCodeId 二维码id
     */
    public String getQrCodeId() {
        return this.QrCodeId;
    }

    /**
     * Set 二维码id
     * @param QrCodeId 二维码id
     */
    public void setQrCodeId(String QrCodeId) {
        this.QrCodeId = QrCodeId;
    }

    /**
     * Get 二维码url 
     * @return QrCodeUrl 二维码url
     */
    public String getQrCodeUrl() {
        return this.QrCodeUrl;
    }

    /**
     * Set 二维码url
     * @param QrCodeUrl 二维码url
     */
    public void setQrCodeUrl(String QrCodeUrl) {
        this.QrCodeUrl = QrCodeUrl;
    }

    /**
     * Get 二维码过期时间 
     * @return ExpiredTime 二维码过期时间
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 二维码过期时间
     * @param ExpiredTime 二维码过期时间
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public SignQrCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignQrCode(SignQrCode source) {
        if (source.QrCodeId != null) {
            this.QrCodeId = new String(source.QrCodeId);
        }
        if (source.QrCodeUrl != null) {
            this.QrCodeUrl = new String(source.QrCodeUrl);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QrCodeId", this.QrCodeId);
        this.setParamSimple(map, prefix + "QrCodeUrl", this.QrCodeUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

