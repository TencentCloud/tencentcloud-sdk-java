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

public class BRIRequest  extends AbstractModel{

    /**
    * 业务名, 必须是以下五个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url)
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
    */
    @SerializedName("CertMd5")
    @Expose
    private String CertMd5;

    /**
    * Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 安卓设备的Imei (业务名为bri_dev时必填)
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 点分格式的IP (业务名为bri_ip时必填)
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 电话号码 (业务名为bri_num时必填)
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 网址 (业务名为bri_url时必填)
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 获取业务名, 必须是以下五个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url)
     * @return Service 业务名, 必须是以下五个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url)
     */
    public String getService() {
        return this.Service;
    }

    /**
     * 设置业务名, 必须是以下五个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url)
     * @param Service 业务名, 必须是以下五个业务名之一(bri_num,bri_dev,bri_ip_bri_apk,bri_url)
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * 获取Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     * @return CertMd5 Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public String getCertMd5() {
        return this.CertMd5;
    }

    /**
     * 设置Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     * @param CertMd5 Apk证书Md5  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public void setCertMd5(String CertMd5) {
        this.CertMd5 = CertMd5;
    }

    /**
     * 获取Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     * @return FileMd5 Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * 设置Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     * @param FileMd5 Apk文件Md5 (业务名为bri_apk时必填，除非已填PackageName,CertMd5,FileSize)
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * 获取Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     * @return FileSize Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * 设置Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     * @param FileSize Apk文件大小  (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * 获取安卓设备的Imei (业务名为bri_dev时必填)
     * @return Imei 安卓设备的Imei (业务名为bri_dev时必填)
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * 设置安卓设备的Imei (业务名为bri_dev时必填)
     * @param Imei 安卓设备的Imei (业务名为bri_dev时必填)
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * 获取点分格式的IP (业务名为bri_ip时必填)
     * @return Ip 点分格式的IP (业务名为bri_ip时必填)
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置点分格式的IP (业务名为bri_ip时必填)
     * @param Ip 点分格式的IP (业务名为bri_ip时必填)
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     * @return PackageName Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * 设置Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     * @param PackageName Apk安装包名 (业务名为bri_apk时必填，除非已填FileMd5)
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * 获取电话号码 (业务名为bri_num时必填)
     * @return PhoneNumber 电话号码 (业务名为bri_num时必填)
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * 设置电话号码 (业务名为bri_num时必填)
     * @param PhoneNumber 电话号码 (业务名为bri_num时必填)
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * 获取网址 (业务名为bri_url时必填)
     * @return Url 网址 (业务名为bri_url时必填)
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置网址 (业务名为bri_url时必填)
     * @param Url 网址 (业务名为bri_url时必填)
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "CertMd5", this.CertMd5);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

