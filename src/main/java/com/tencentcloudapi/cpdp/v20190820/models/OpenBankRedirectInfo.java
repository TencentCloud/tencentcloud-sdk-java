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

public class OpenBankRedirectInfo extends AbstractModel{

    /**
    * 生成二维码，引导用户扫码
    */
    @SerializedName("QRCodeUrl")
    @Expose
    private String QRCodeUrl;

    /**
    * 二维码凭证
    */
    @SerializedName("QRCodeKey")
    @Expose
    private String QRCodeKey;

    /**
    * 跳转 URL,用于客户端跳转，订单未支付时返回该参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 跳转凭证过期时间,yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 小程序 appid
    */
    @SerializedName("MpAppId")
    @Expose
    private String MpAppId;

    /**
    * 小程序路径
    */
    @SerializedName("MpPath")
    @Expose
    private String MpPath;

    /**
    * 小程序原始 id
    */
    @SerializedName("MpUserName")
    @Expose
    private String MpUserName;

    /**
     * Get 生成二维码，引导用户扫码 
     * @return QRCodeUrl 生成二维码，引导用户扫码
     */
    public String getQRCodeUrl() {
        return this.QRCodeUrl;
    }

    /**
     * Set 生成二维码，引导用户扫码
     * @param QRCodeUrl 生成二维码，引导用户扫码
     */
    public void setQRCodeUrl(String QRCodeUrl) {
        this.QRCodeUrl = QRCodeUrl;
    }

    /**
     * Get 二维码凭证 
     * @return QRCodeKey 二维码凭证
     */
    public String getQRCodeKey() {
        return this.QRCodeKey;
    }

    /**
     * Set 二维码凭证
     * @param QRCodeKey 二维码凭证
     */
    public void setQRCodeKey(String QRCodeKey) {
        this.QRCodeKey = QRCodeKey;
    }

    /**
     * Get 跳转 URL,用于客户端跳转，订单未支付时返回该参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 跳转 URL,用于客户端跳转，订单未支付时返回该参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 跳转 URL,用于客户端跳转，订单未支付时返回该参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 跳转 URL,用于客户端跳转，订单未支付时返回该参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 跳转凭证过期时间,yyyy-MM-dd HH:mm:ss 
     * @return ExpireTime 跳转凭证过期时间,yyyy-MM-dd HH:mm:ss
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 跳转凭证过期时间,yyyy-MM-dd HH:mm:ss
     * @param ExpireTime 跳转凭证过期时间,yyyy-MM-dd HH:mm:ss
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 小程序 appid 
     * @return MpAppId 小程序 appid
     */
    public String getMpAppId() {
        return this.MpAppId;
    }

    /**
     * Set 小程序 appid
     * @param MpAppId 小程序 appid
     */
    public void setMpAppId(String MpAppId) {
        this.MpAppId = MpAppId;
    }

    /**
     * Get 小程序路径 
     * @return MpPath 小程序路径
     */
    public String getMpPath() {
        return this.MpPath;
    }

    /**
     * Set 小程序路径
     * @param MpPath 小程序路径
     */
    public void setMpPath(String MpPath) {
        this.MpPath = MpPath;
    }

    /**
     * Get 小程序原始 id 
     * @return MpUserName 小程序原始 id
     */
    public String getMpUserName() {
        return this.MpUserName;
    }

    /**
     * Set 小程序原始 id
     * @param MpUserName 小程序原始 id
     */
    public void setMpUserName(String MpUserName) {
        this.MpUserName = MpUserName;
    }

    public OpenBankRedirectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankRedirectInfo(OpenBankRedirectInfo source) {
        if (source.QRCodeUrl != null) {
            this.QRCodeUrl = new String(source.QRCodeUrl);
        }
        if (source.QRCodeKey != null) {
            this.QRCodeKey = new String(source.QRCodeKey);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.MpAppId != null) {
            this.MpAppId = new String(source.MpAppId);
        }
        if (source.MpPath != null) {
            this.MpPath = new String(source.MpPath);
        }
        if (source.MpUserName != null) {
            this.MpUserName = new String(source.MpUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QRCodeUrl", this.QRCodeUrl);
        this.setParamSimple(map, prefix + "QRCodeKey", this.QRCodeKey);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "MpAppId", this.MpAppId);
        this.setParamSimple(map, prefix + "MpPath", this.MpPath);
        this.setParamSimple(map, prefix + "MpUserName", this.MpUserName);

    }
}

