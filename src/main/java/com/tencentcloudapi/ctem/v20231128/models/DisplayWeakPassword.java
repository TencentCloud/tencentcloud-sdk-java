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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayWeakPassword extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * 解析的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Url地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 弱口令类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 弱口令账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 弱口令密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否蜜罐
    */
    @SerializedName("IsHoneypot")
    @Expose
    private Boolean IsHoneypot;

    /**
    * 截图
    */
    @SerializedName("ScreenshotUrl")
    @Expose
    private String ScreenshotUrl;

    /**
    * 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略, checking:复测中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 上次复测时间
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get 解析的IP 
     * @return Ip 解析的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 解析的IP
     * @param Ip 解析的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Url地址 
     * @return Url Url地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url地址
     * @param Url Url地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 弱口令类型 
     * @return Type 弱口令类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 弱口令类型
     * @param Type 弱口令类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 弱口令账号 
     * @return Account 弱口令账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 弱口令账号
     * @param Account 弱口令账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 弱口令密码 
     * @return Password 弱口令密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 弱口令密码
     * @param Password 弱口令密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否蜜罐 
     * @return IsHoneypot 是否蜜罐
     */
    public Boolean getIsHoneypot() {
        return this.IsHoneypot;
    }

    /**
     * Set 是否蜜罐
     * @param IsHoneypot 是否蜜罐
     */
    public void setIsHoneypot(Boolean IsHoneypot) {
        this.IsHoneypot = IsHoneypot;
    }

    /**
     * Get 截图 
     * @return ScreenshotUrl 截图
     */
    public String getScreenshotUrl() {
        return this.ScreenshotUrl;
    }

    /**
     * Set 截图
     * @param ScreenshotUrl 截图
     */
    public void setScreenshotUrl(String ScreenshotUrl) {
        this.ScreenshotUrl = ScreenshotUrl;
    }

    /**
     * Get 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略, checking:复测中 
     * @return Status 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略, checking:复测中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略, checking:复测中
     * @param Status 状态：unrepaired:未修复，repaired:已修复, offline:资产已下线, ignore:已忽略, checking:复测中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 上次复测时间 
     * @return LastCheckTime 上次复测时间
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 上次复测时间
     * @param LastCheckTime 上次复测时间
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    public DisplayWeakPassword() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayWeakPassword(DisplayWeakPassword source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.IsHoneypot != null) {
            this.IsHoneypot = new Boolean(source.IsHoneypot);
        }
        if (source.ScreenshotUrl != null) {
            this.ScreenshotUrl = new String(source.ScreenshotUrl);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "IsHoneypot", this.IsHoneypot);
        this.setParamSimple(map, prefix + "ScreenshotUrl", this.ScreenshotUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);

    }
}

