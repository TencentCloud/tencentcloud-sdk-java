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
package com.tencentcloudapi.bri.v20190328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BRIRequest extends AbstractModel{

    /**
    * 业务名, 必须是以下六个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url,bri_social)
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * QQ号 (业务名为bri_social时必填, 除非已填Wechat)
    */
    @SerializedName("QQ")
    @Expose
    private String QQ;

    /**
    * QQ号的可疑标签
    */
    @SerializedName("QQTag")
    @Expose
    private String QQTag;

    /**
    * 网址 (业务名为bri_url时必填)
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
    */
    @SerializedName("CertMd5")
    @Expose
    private String CertMd5;

    /**
    * Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 业务场景 (1-注册, 2-登录, 3-发消息)
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 电话号码 (业务名为bri_num时必填)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 点分格式的IP (业务名为bri_ip时必填)
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 安卓设备的Imei (业务名为bri_dev时必填)
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 微信号 (业务名为bri_social时必填, 除非已填QQ)
    */
    @SerializedName("Wechat")
    @Expose
    private String Wechat;

    /**
    * 微信号的可疑标签
    */
    @SerializedName("WechatTag")
    @Expose
    private String WechatTag;

    /**
     * Get 业务名, 必须是以下六个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url,bri_social) 
     * @return Service 业务名, 必须是以下六个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url,bri_social)
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 业务名, 必须是以下六个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url,bri_social)
     * @param Service 业务名, 必须是以下六个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url,bri_social)
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get QQ号 (业务名为bri_social时必填, 除非已填Wechat) 
     * @return QQ QQ号 (业务名为bri_social时必填, 除非已填Wechat)
     */
    public String getQQ() {
        return this.QQ;
    }

    /**
     * Set QQ号 (业务名为bri_social时必填, 除非已填Wechat)
     * @param QQ QQ号 (业务名为bri_social时必填, 除非已填Wechat)
     */
    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    /**
     * Get QQ号的可疑标签 
     * @return QQTag QQ号的可疑标签
     */
    public String getQQTag() {
        return this.QQTag;
    }

    /**
     * Set QQ号的可疑标签
     * @param QQTag QQ号的可疑标签
     */
    public void setQQTag(String QQTag) {
        this.QQTag = QQTag;
    }

    /**
     * Get 网址 (业务名为bri_url时必填) 
     * @return Url 网址 (业务名为bri_url时必填)
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 网址 (业务名为bri_url时必填)
     * @param Url 网址 (业务名为bri_url时必填)
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5) 
     * @return CertMd5 Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public String getCertMd5() {
        return this.CertMd5;
    }

    /**
     * Set Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     * @param CertMd5 Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public void setCertMd5(String CertMd5) {
        this.CertMd5 = CertMd5;
    }

    /**
     * Get Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5) 
     * @return PackageName Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     * @param PackageName Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize) 
     * @return FileMd5 Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     * @param FileMd5 Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 业务场景 (1-注册, 2-登录, 3-发消息) 
     * @return Scene 业务场景 (1-注册, 2-登录, 3-发消息)
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 业务场景 (1-注册, 2-登录, 3-发消息)
     * @param Scene 业务场景 (1-注册, 2-登录, 3-发消息)
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 电话号码 (业务名为bri_num时必填)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNumber 电话号码 (业务名为bri_num时必填)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 电话号码 (业务名为bri_num时必填)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNumber 电话号码 (业务名为bri_num时必填)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5) 
     * @return FileSize Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     * @param FileSize Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 点分格式的IP (业务名为bri_ip时必填) 
     * @return Ip 点分格式的IP (业务名为bri_ip时必填)
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 点分格式的IP (业务名为bri_ip时必填)
     * @param Ip 点分格式的IP (业务名为bri_ip时必填)
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 安卓设备的Imei (业务名为bri_dev时必填) 
     * @return Imei 安卓设备的Imei (业务名为bri_dev时必填)
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 安卓设备的Imei (业务名为bri_dev时必填)
     * @param Imei 安卓设备的Imei (业务名为bri_dev时必填)
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get 微信号 (业务名为bri_social时必填, 除非已填QQ) 
     * @return Wechat 微信号 (业务名为bri_social时必填, 除非已填QQ)
     */
    public String getWechat() {
        return this.Wechat;
    }

    /**
     * Set 微信号 (业务名为bri_social时必填, 除非已填QQ)
     * @param Wechat 微信号 (业务名为bri_social时必填, 除非已填QQ)
     */
    public void setWechat(String Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get 微信号的可疑标签 
     * @return WechatTag 微信号的可疑标签
     */
    public String getWechatTag() {
        return this.WechatTag;
    }

    /**
     * Set 微信号的可疑标签
     * @param WechatTag 微信号的可疑标签
     */
    public void setWechatTag(String WechatTag) {
        this.WechatTag = WechatTag;
    }

    public BRIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BRIRequest(BRIRequest source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.QQ != null) {
            this.QQ = new String(source.QQ);
        }
        if (source.QQTag != null) {
            this.QQTag = new String(source.QQTag);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CertMd5 != null) {
            this.CertMd5 = new String(source.CertMd5);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.Wechat != null) {
            this.Wechat = new String(source.Wechat);
        }
        if (source.WechatTag != null) {
            this.WechatTag = new String(source.WechatTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "QQ", this.QQ);
        this.setParamSimple(map, prefix + "QQTag", this.QQTag);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CertMd5", this.CertMd5);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "WechatTag", this.WechatTag);

    }
}

