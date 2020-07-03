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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCaptchaAppIdInfoRequest extends AbstractModel{

    /**
    * 验证码应用ID
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * 应用名
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 域名限制
    */
    @SerializedName("DomainLimit")
    @Expose
    private String DomainLimit;

    /**
    * 场景类型
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * 验证码类型
    */
    @SerializedName("CapType")
    @Expose
    private Long CapType;

    /**
    * 风险级别
    */
    @SerializedName("EvilInterceptGrade")
    @Expose
    private Long EvilInterceptGrade;

    /**
    * 智能检测
    */
    @SerializedName("SmartVerify")
    @Expose
    private Long SmartVerify;

    /**
    * 开启智能引擎
    */
    @SerializedName("SmartEngine")
    @Expose
    private Long SmartEngine;

    /**
    * web风格
    */
    @SerializedName("SchemeColor")
    @Expose
    private String SchemeColor;

    /**
    * 语言
    */
    @SerializedName("CaptchaLanguage")
    @Expose
    private Long CaptchaLanguage;

    /**
    * 告警邮箱
    */
    @SerializedName("MailAlarm")
    @Expose
    private String MailAlarm;

    /**
    * 是否全屏
    */
    @SerializedName("TopFullScreen")
    @Expose
    private Long TopFullScreen;

    /**
    * 流量限制
    */
    @SerializedName("TrafficThreshold")
    @Expose
    private Long TrafficThreshold;

    /**
     * Get 验证码应用ID 
     * @return CaptchaAppId 验证码应用ID
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set 验证码应用ID
     * @param CaptchaAppId 验证码应用ID
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get 应用名 
     * @return AppName 应用名
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名
     * @param AppName 应用名
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 域名限制 
     * @return DomainLimit 域名限制
     */
    public String getDomainLimit() {
        return this.DomainLimit;
    }

    /**
     * Set 域名限制
     * @param DomainLimit 域名限制
     */
    public void setDomainLimit(String DomainLimit) {
        this.DomainLimit = DomainLimit;
    }

    /**
     * Get 场景类型 
     * @return SceneType 场景类型
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景类型
     * @param SceneType 场景类型
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get 验证码类型 
     * @return CapType 验证码类型
     */
    public Long getCapType() {
        return this.CapType;
    }

    /**
     * Set 验证码类型
     * @param CapType 验证码类型
     */
    public void setCapType(Long CapType) {
        this.CapType = CapType;
    }

    /**
     * Get 风险级别 
     * @return EvilInterceptGrade 风险级别
     */
    public Long getEvilInterceptGrade() {
        return this.EvilInterceptGrade;
    }

    /**
     * Set 风险级别
     * @param EvilInterceptGrade 风险级别
     */
    public void setEvilInterceptGrade(Long EvilInterceptGrade) {
        this.EvilInterceptGrade = EvilInterceptGrade;
    }

    /**
     * Get 智能检测 
     * @return SmartVerify 智能检测
     */
    public Long getSmartVerify() {
        return this.SmartVerify;
    }

    /**
     * Set 智能检测
     * @param SmartVerify 智能检测
     */
    public void setSmartVerify(Long SmartVerify) {
        this.SmartVerify = SmartVerify;
    }

    /**
     * Get 开启智能引擎 
     * @return SmartEngine 开启智能引擎
     */
    public Long getSmartEngine() {
        return this.SmartEngine;
    }

    /**
     * Set 开启智能引擎
     * @param SmartEngine 开启智能引擎
     */
    public void setSmartEngine(Long SmartEngine) {
        this.SmartEngine = SmartEngine;
    }

    /**
     * Get web风格 
     * @return SchemeColor web风格
     */
    public String getSchemeColor() {
        return this.SchemeColor;
    }

    /**
     * Set web风格
     * @param SchemeColor web风格
     */
    public void setSchemeColor(String SchemeColor) {
        this.SchemeColor = SchemeColor;
    }

    /**
     * Get 语言 
     * @return CaptchaLanguage 语言
     */
    public Long getCaptchaLanguage() {
        return this.CaptchaLanguage;
    }

    /**
     * Set 语言
     * @param CaptchaLanguage 语言
     */
    public void setCaptchaLanguage(Long CaptchaLanguage) {
        this.CaptchaLanguage = CaptchaLanguage;
    }

    /**
     * Get 告警邮箱 
     * @return MailAlarm 告警邮箱
     */
    public String getMailAlarm() {
        return this.MailAlarm;
    }

    /**
     * Set 告警邮箱
     * @param MailAlarm 告警邮箱
     */
    public void setMailAlarm(String MailAlarm) {
        this.MailAlarm = MailAlarm;
    }

    /**
     * Get 是否全屏 
     * @return TopFullScreen 是否全屏
     */
    public Long getTopFullScreen() {
        return this.TopFullScreen;
    }

    /**
     * Set 是否全屏
     * @param TopFullScreen 是否全屏
     */
    public void setTopFullScreen(Long TopFullScreen) {
        this.TopFullScreen = TopFullScreen;
    }

    /**
     * Get 流量限制 
     * @return TrafficThreshold 流量限制
     */
    public Long getTrafficThreshold() {
        return this.TrafficThreshold;
    }

    /**
     * Set 流量限制
     * @param TrafficThreshold 流量限制
     */
    public void setTrafficThreshold(Long TrafficThreshold) {
        this.TrafficThreshold = TrafficThreshold;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainLimit", this.DomainLimit);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "CapType", this.CapType);
        this.setParamSimple(map, prefix + "EvilInterceptGrade", this.EvilInterceptGrade);
        this.setParamSimple(map, prefix + "SmartVerify", this.SmartVerify);
        this.setParamSimple(map, prefix + "SmartEngine", this.SmartEngine);
        this.setParamSimple(map, prefix + "SchemeColor", this.SchemeColor);
        this.setParamSimple(map, prefix + "CaptchaLanguage", this.CaptchaLanguage);
        this.setParamSimple(map, prefix + "MailAlarm", this.MailAlarm);
        this.setParamSimple(map, prefix + "TopFullScreen", this.TopFullScreen);
        this.setParamSimple(map, prefix + "TrafficThreshold", this.TrafficThreshold);

    }
}

