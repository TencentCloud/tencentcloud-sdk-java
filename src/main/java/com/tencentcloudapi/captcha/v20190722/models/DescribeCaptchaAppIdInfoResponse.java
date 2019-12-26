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

public class DescribeCaptchaAppIdInfoResponse extends AbstractModel{

    /**
    * 界面风格
    */
    @SerializedName("SchemeColor")
    @Expose
    private String SchemeColor;

    /**
    * 语言
    */
    @SerializedName("Language")
    @Expose
    private Long Language;

    /**
    * 场景
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * 防控风险等级
    */
    @SerializedName("EvilInterceptGrade")
    @Expose
    private Long EvilInterceptGrade;

    /**
    * 智能验证
    */
    @SerializedName("SmartVerify")
    @Expose
    private Long SmartVerify;

    /**
    * 智能引擎
    */
    @SerializedName("SmartEngine")
    @Expose
    private Long SmartEngine;

    /**
    * 验证码类型
    */
    @SerializedName("CapType")
    @Expose
    private Long CapType;

    /**
    * 应用名称
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
    * 邮件告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MailAlarm")
    @Expose
    private String [] MailAlarm;

    /**
    * 流量控制
    */
    @SerializedName("TrafficThreshold")
    @Expose
    private Long TrafficThreshold;

    /**
    * 加密key
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * 是否全屏
    */
    @SerializedName("TopFullScreen")
    @Expose
    private Long TopFullScreen;

    /**
    * 成功返回0 其它失败
    */
    @SerializedName("CaptchaCode")
    @Expose
    private Long CaptchaCode;

    /**
    * 返回操作信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaptchaMsg")
    @Expose
    private String CaptchaMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 界面风格 
     * @return SchemeColor 界面风格
     */
    public String getSchemeColor() {
        return this.SchemeColor;
    }

    /**
     * Set 界面风格
     * @param SchemeColor 界面风格
     */
    public void setSchemeColor(String SchemeColor) {
        this.SchemeColor = SchemeColor;
    }

    /**
     * Get 语言 
     * @return Language 语言
     */
    public Long getLanguage() {
        return this.Language;
    }

    /**
     * Set 语言
     * @param Language 语言
     */
    public void setLanguage(Long Language) {
        this.Language = Language;
    }

    /**
     * Get 场景 
     * @return SceneType 场景
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景
     * @param SceneType 场景
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get 防控风险等级 
     * @return EvilInterceptGrade 防控风险等级
     */
    public Long getEvilInterceptGrade() {
        return this.EvilInterceptGrade;
    }

    /**
     * Set 防控风险等级
     * @param EvilInterceptGrade 防控风险等级
     */
    public void setEvilInterceptGrade(Long EvilInterceptGrade) {
        this.EvilInterceptGrade = EvilInterceptGrade;
    }

    /**
     * Get 智能验证 
     * @return SmartVerify 智能验证
     */
    public Long getSmartVerify() {
        return this.SmartVerify;
    }

    /**
     * Set 智能验证
     * @param SmartVerify 智能验证
     */
    public void setSmartVerify(Long SmartVerify) {
        this.SmartVerify = SmartVerify;
    }

    /**
     * Get 智能引擎 
     * @return SmartEngine 智能引擎
     */
    public Long getSmartEngine() {
        return this.SmartEngine;
    }

    /**
     * Set 智能引擎
     * @param SmartEngine 智能引擎
     */
    public void setSmartEngine(Long SmartEngine) {
        this.SmartEngine = SmartEngine;
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
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
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
     * Get 邮件告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MailAlarm 邮件告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMailAlarm() {
        return this.MailAlarm;
    }

    /**
     * Set 邮件告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param MailAlarm 邮件告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMailAlarm(String [] MailAlarm) {
        this.MailAlarm = MailAlarm;
    }

    /**
     * Get 流量控制 
     * @return TrafficThreshold 流量控制
     */
    public Long getTrafficThreshold() {
        return this.TrafficThreshold;
    }

    /**
     * Set 流量控制
     * @param TrafficThreshold 流量控制
     */
    public void setTrafficThreshold(Long TrafficThreshold) {
        this.TrafficThreshold = TrafficThreshold;
    }

    /**
     * Get 加密key 
     * @return EncryptKey 加密key
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set 加密key
     * @param EncryptKey 加密key
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
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
     * Get 成功返回0 其它失败 
     * @return CaptchaCode 成功返回0 其它失败
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set 成功返回0 其它失败
     * @param CaptchaCode 成功返回0 其它失败
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * Get 返回操作信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaptchaMsg 返回操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set 返回操作信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaptchaMsg 返回操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchemeColor", this.SchemeColor);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "EvilInterceptGrade", this.EvilInterceptGrade);
        this.setParamSimple(map, prefix + "SmartVerify", this.SmartVerify);
        this.setParamSimple(map, prefix + "SmartEngine", this.SmartEngine);
        this.setParamSimple(map, prefix + "CapType", this.CapType);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainLimit", this.DomainLimit);
        this.setParamArraySimple(map, prefix + "MailAlarm.", this.MailAlarm);
        this.setParamSimple(map, prefix + "TrafficThreshold", this.TrafficThreshold);
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "TopFullScreen", this.TopFullScreen);
        this.setParamSimple(map, prefix + "CaptchaCode", this.CaptchaCode);
        this.setParamSimple(map, prefix + "CaptchaMsg", this.CaptchaMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

