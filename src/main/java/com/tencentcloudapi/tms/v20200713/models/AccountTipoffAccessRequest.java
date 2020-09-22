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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountTipoffAccessRequest extends AbstractModel{

    /**
    * 被举报账号，长度低于 128 个字符
    */
    @SerializedName("ReportedAccount")
    @Expose
    private String ReportedAccount;

    /**
    * 被举报账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
    */
    @SerializedName("ReportedAccountType")
    @Expose
    private Long ReportedAccountType;

    /**
    * 被举报账号所属恶意类型(1-诈骗，2-骚扰，3-广告，4-违法违规，5-赌博传销，0-其他)
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 举报者账号，长度低于 128 个字符
    */
    @SerializedName("SenderAccount")
    @Expose
    private String SenderAccount;

    /**
    * 举报者账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
    */
    @SerializedName("SenderAccountType")
    @Expose
    private Long SenderAccountType;

    /**
    * 举报者IP地址
    */
    @SerializedName("SenderIP")
    @Expose
    private String SenderIP;

    /**
    * 包含被举报账号的恶意内容（比如文本、图片链接，长度低于1024个字符）
    */
    @SerializedName("EvilContent")
    @Expose
    private String EvilContent;

    /**
     * Get 被举报账号，长度低于 128 个字符 
     * @return ReportedAccount 被举报账号，长度低于 128 个字符
     */
    public String getReportedAccount() {
        return this.ReportedAccount;
    }

    /**
     * Set 被举报账号，长度低于 128 个字符
     * @param ReportedAccount 被举报账号，长度低于 128 个字符
     */
    public void setReportedAccount(String ReportedAccount) {
        this.ReportedAccount = ReportedAccount;
    }

    /**
     * Get 被举报账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它) 
     * @return ReportedAccountType 被举报账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
     */
    public Long getReportedAccountType() {
        return this.ReportedAccountType;
    }

    /**
     * Set 被举报账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
     * @param ReportedAccountType 被举报账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
     */
    public void setReportedAccountType(Long ReportedAccountType) {
        this.ReportedAccountType = ReportedAccountType;
    }

    /**
     * Get 被举报账号所属恶意类型(1-诈骗，2-骚扰，3-广告，4-违法违规，5-赌博传销，0-其他) 
     * @return EvilType 被举报账号所属恶意类型(1-诈骗，2-骚扰，3-广告，4-违法违规，5-赌博传销，0-其他)
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 被举报账号所属恶意类型(1-诈骗，2-骚扰，3-广告，4-违法违规，5-赌博传销，0-其他)
     * @param EvilType 被举报账号所属恶意类型(1-诈骗，2-骚扰，3-广告，4-违法违规，5-赌博传销，0-其他)
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 举报者账号，长度低于 128 个字符 
     * @return SenderAccount 举报者账号，长度低于 128 个字符
     */
    public String getSenderAccount() {
        return this.SenderAccount;
    }

    /**
     * Set 举报者账号，长度低于 128 个字符
     * @param SenderAccount 举报者账号，长度低于 128 个字符
     */
    public void setSenderAccount(String SenderAccount) {
        this.SenderAccount = SenderAccount;
    }

    /**
     * Get 举报者账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它) 
     * @return SenderAccountType 举报者账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
     */
    public Long getSenderAccountType() {
        return this.SenderAccountType;
    }

    /**
     * Set 举报者账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
     * @param SenderAccountType 举报者账号类型(1-手机号 2-QQ号 3-微信号 4-QQ群号 5-微信openid 6-QQopenid 0-其它)
     */
    public void setSenderAccountType(Long SenderAccountType) {
        this.SenderAccountType = SenderAccountType;
    }

    /**
     * Get 举报者IP地址 
     * @return SenderIP 举报者IP地址
     */
    public String getSenderIP() {
        return this.SenderIP;
    }

    /**
     * Set 举报者IP地址
     * @param SenderIP 举报者IP地址
     */
    public void setSenderIP(String SenderIP) {
        this.SenderIP = SenderIP;
    }

    /**
     * Get 包含被举报账号的恶意内容（比如文本、图片链接，长度低于1024个字符） 
     * @return EvilContent 包含被举报账号的恶意内容（比如文本、图片链接，长度低于1024个字符）
     */
    public String getEvilContent() {
        return this.EvilContent;
    }

    /**
     * Set 包含被举报账号的恶意内容（比如文本、图片链接，长度低于1024个字符）
     * @param EvilContent 包含被举报账号的恶意内容（比如文本、图片链接，长度低于1024个字符）
     */
    public void setEvilContent(String EvilContent) {
        this.EvilContent = EvilContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportedAccount", this.ReportedAccount);
        this.setParamSimple(map, prefix + "ReportedAccountType", this.ReportedAccountType);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "SenderAccount", this.SenderAccount);
        this.setParamSimple(map, prefix + "SenderAccountType", this.SenderAccountType);
        this.setParamSimple(map, prefix + "SenderIP", this.SenderIP);
        this.setParamSimple(map, prefix + "EvilContent", this.EvilContent);

    }
}

