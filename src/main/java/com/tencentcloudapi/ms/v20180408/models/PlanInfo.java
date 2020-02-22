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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanInfo extends AbstractModel{

    /**
    * apk大小优化，0关闭，1开启
    */
    @SerializedName("ApkSizeOpt")
    @Expose
    private Long ApkSizeOpt;

    /**
    * Dex加固，0关闭，1开启
    */
    @SerializedName("Dex")
    @Expose
    private Long Dex;

    /**
    * So加固，0关闭，1开启
    */
    @SerializedName("So")
    @Expose
    private Long So;

    /**
    * 数据收集，0关闭，1开启
    */
    @SerializedName("Bugly")
    @Expose
    private Long Bugly;

    /**
    * 防止重打包，0关闭，1开启
    */
    @SerializedName("AntiRepack")
    @Expose
    private Long AntiRepack;

    /**
    * Dex分离，0关闭，1开启
    */
    @SerializedName("SeperateDex")
    @Expose
    private Long SeperateDex;

    /**
    * 内存保护，0关闭，1开启
    */
    @SerializedName("Db")
    @Expose
    private Long Db;

    /**
    * Dex签名校验，0关闭，1开启
    */
    @SerializedName("DexSig")
    @Expose
    private Long DexSig;

    /**
    * So文件信息
    */
    @SerializedName("SoInfo")
    @Expose
    private SoInfo SoInfo;

    /**
    * vmp，0关闭，1开启
    */
    @SerializedName("AntiVMP")
    @Expose
    private Long AntiVMP;

    /**
    * 保护so的强度，
    */
    @SerializedName("SoType")
    @Expose
    private String [] SoType;

    /**
    * 防日志泄漏，0关闭，1开启
    */
    @SerializedName("AntiLogLeak")
    @Expose
    private Long AntiLogLeak;

    /**
    * root检测，0关闭，1开启
    */
    @SerializedName("AntiQemuRoot")
    @Expose
    private Long AntiQemuRoot;

    /**
    * 资源防篡改，0关闭，1开启
    */
    @SerializedName("AntiAssets")
    @Expose
    private Long AntiAssets;

    /**
    * 防止截屏，0关闭，1开启
    */
    @SerializedName("AntiScreenshot")
    @Expose
    private Long AntiScreenshot;

    /**
    * SSL证书防窃取，0关闭，1开启
    */
    @SerializedName("AntiSSL")
    @Expose
    private Long AntiSSL;

    /**
     * Get apk大小优化，0关闭，1开启 
     * @return ApkSizeOpt apk大小优化，0关闭，1开启
     */
    public Long getApkSizeOpt() {
        return this.ApkSizeOpt;
    }

    /**
     * Set apk大小优化，0关闭，1开启
     * @param ApkSizeOpt apk大小优化，0关闭，1开启
     */
    public void setApkSizeOpt(Long ApkSizeOpt) {
        this.ApkSizeOpt = ApkSizeOpt;
    }

    /**
     * Get Dex加固，0关闭，1开启 
     * @return Dex Dex加固，0关闭，1开启
     */
    public Long getDex() {
        return this.Dex;
    }

    /**
     * Set Dex加固，0关闭，1开启
     * @param Dex Dex加固，0关闭，1开启
     */
    public void setDex(Long Dex) {
        this.Dex = Dex;
    }

    /**
     * Get So加固，0关闭，1开启 
     * @return So So加固，0关闭，1开启
     */
    public Long getSo() {
        return this.So;
    }

    /**
     * Set So加固，0关闭，1开启
     * @param So So加固，0关闭，1开启
     */
    public void setSo(Long So) {
        this.So = So;
    }

    /**
     * Get 数据收集，0关闭，1开启 
     * @return Bugly 数据收集，0关闭，1开启
     */
    public Long getBugly() {
        return this.Bugly;
    }

    /**
     * Set 数据收集，0关闭，1开启
     * @param Bugly 数据收集，0关闭，1开启
     */
    public void setBugly(Long Bugly) {
        this.Bugly = Bugly;
    }

    /**
     * Get 防止重打包，0关闭，1开启 
     * @return AntiRepack 防止重打包，0关闭，1开启
     */
    public Long getAntiRepack() {
        return this.AntiRepack;
    }

    /**
     * Set 防止重打包，0关闭，1开启
     * @param AntiRepack 防止重打包，0关闭，1开启
     */
    public void setAntiRepack(Long AntiRepack) {
        this.AntiRepack = AntiRepack;
    }

    /**
     * Get Dex分离，0关闭，1开启 
     * @return SeperateDex Dex分离，0关闭，1开启
     */
    public Long getSeperateDex() {
        return this.SeperateDex;
    }

    /**
     * Set Dex分离，0关闭，1开启
     * @param SeperateDex Dex分离，0关闭，1开启
     */
    public void setSeperateDex(Long SeperateDex) {
        this.SeperateDex = SeperateDex;
    }

    /**
     * Get 内存保护，0关闭，1开启 
     * @return Db 内存保护，0关闭，1开启
     */
    public Long getDb() {
        return this.Db;
    }

    /**
     * Set 内存保护，0关闭，1开启
     * @param Db 内存保护，0关闭，1开启
     */
    public void setDb(Long Db) {
        this.Db = Db;
    }

    /**
     * Get Dex签名校验，0关闭，1开启 
     * @return DexSig Dex签名校验，0关闭，1开启
     */
    public Long getDexSig() {
        return this.DexSig;
    }

    /**
     * Set Dex签名校验，0关闭，1开启
     * @param DexSig Dex签名校验，0关闭，1开启
     */
    public void setDexSig(Long DexSig) {
        this.DexSig = DexSig;
    }

    /**
     * Get So文件信息 
     * @return SoInfo So文件信息
     */
    public SoInfo getSoInfo() {
        return this.SoInfo;
    }

    /**
     * Set So文件信息
     * @param SoInfo So文件信息
     */
    public void setSoInfo(SoInfo SoInfo) {
        this.SoInfo = SoInfo;
    }

    /**
     * Get vmp，0关闭，1开启 
     * @return AntiVMP vmp，0关闭，1开启
     */
    public Long getAntiVMP() {
        return this.AntiVMP;
    }

    /**
     * Set vmp，0关闭，1开启
     * @param AntiVMP vmp，0关闭，1开启
     */
    public void setAntiVMP(Long AntiVMP) {
        this.AntiVMP = AntiVMP;
    }

    /**
     * Get 保护so的强度， 
     * @return SoType 保护so的强度，
     */
    public String [] getSoType() {
        return this.SoType;
    }

    /**
     * Set 保护so的强度，
     * @param SoType 保护so的强度，
     */
    public void setSoType(String [] SoType) {
        this.SoType = SoType;
    }

    /**
     * Get 防日志泄漏，0关闭，1开启 
     * @return AntiLogLeak 防日志泄漏，0关闭，1开启
     */
    public Long getAntiLogLeak() {
        return this.AntiLogLeak;
    }

    /**
     * Set 防日志泄漏，0关闭，1开启
     * @param AntiLogLeak 防日志泄漏，0关闭，1开启
     */
    public void setAntiLogLeak(Long AntiLogLeak) {
        this.AntiLogLeak = AntiLogLeak;
    }

    /**
     * Get root检测，0关闭，1开启 
     * @return AntiQemuRoot root检测，0关闭，1开启
     */
    public Long getAntiQemuRoot() {
        return this.AntiQemuRoot;
    }

    /**
     * Set root检测，0关闭，1开启
     * @param AntiQemuRoot root检测，0关闭，1开启
     */
    public void setAntiQemuRoot(Long AntiQemuRoot) {
        this.AntiQemuRoot = AntiQemuRoot;
    }

    /**
     * Get 资源防篡改，0关闭，1开启 
     * @return AntiAssets 资源防篡改，0关闭，1开启
     */
    public Long getAntiAssets() {
        return this.AntiAssets;
    }

    /**
     * Set 资源防篡改，0关闭，1开启
     * @param AntiAssets 资源防篡改，0关闭，1开启
     */
    public void setAntiAssets(Long AntiAssets) {
        this.AntiAssets = AntiAssets;
    }

    /**
     * Get 防止截屏，0关闭，1开启 
     * @return AntiScreenshot 防止截屏，0关闭，1开启
     */
    public Long getAntiScreenshot() {
        return this.AntiScreenshot;
    }

    /**
     * Set 防止截屏，0关闭，1开启
     * @param AntiScreenshot 防止截屏，0关闭，1开启
     */
    public void setAntiScreenshot(Long AntiScreenshot) {
        this.AntiScreenshot = AntiScreenshot;
    }

    /**
     * Get SSL证书防窃取，0关闭，1开启 
     * @return AntiSSL SSL证书防窃取，0关闭，1开启
     */
    public Long getAntiSSL() {
        return this.AntiSSL;
    }

    /**
     * Set SSL证书防窃取，0关闭，1开启
     * @param AntiSSL SSL证书防窃取，0关闭，1开启
     */
    public void setAntiSSL(Long AntiSSL) {
        this.AntiSSL = AntiSSL;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApkSizeOpt", this.ApkSizeOpt);
        this.setParamSimple(map, prefix + "Dex", this.Dex);
        this.setParamSimple(map, prefix + "So", this.So);
        this.setParamSimple(map, prefix + "Bugly", this.Bugly);
        this.setParamSimple(map, prefix + "AntiRepack", this.AntiRepack);
        this.setParamSimple(map, prefix + "SeperateDex", this.SeperateDex);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "DexSig", this.DexSig);
        this.setParamObj(map, prefix + "SoInfo.", this.SoInfo);
        this.setParamSimple(map, prefix + "AntiVMP", this.AntiVMP);
        this.setParamArraySimple(map, prefix + "SoType.", this.SoType);
        this.setParamSimple(map, prefix + "AntiLogLeak", this.AntiLogLeak);
        this.setParamSimple(map, prefix + "AntiQemuRoot", this.AntiQemuRoot);
        this.setParamSimple(map, prefix + "AntiAssets", this.AntiAssets);
        this.setParamSimple(map, prefix + "AntiScreenshot", this.AntiScreenshot);
        this.setParamSimple(map, prefix + "AntiSSL", this.AntiSSL);

    }
}

