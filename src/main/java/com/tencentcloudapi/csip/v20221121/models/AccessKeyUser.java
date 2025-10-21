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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessKeyUser extends AbstractModel {

    /**
    * 账号ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 账号名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 0 主账号 1子账号
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 访问方式
0 API
1 控制台与API
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 安全建议 枚举 0 正常 1 立即处理 2 建议加固
    */
    @SerializedName("Advice")
    @Expose
    private Long Advice;

    /**
    * 告警信息列表
    */
    @SerializedName("AccessKeyAlarmList")
    @Expose
    private AccessKeyAlarmInfo [] AccessKeyAlarmList;

    /**
    * 风险信息列表
    */
    @SerializedName("AccessKeyRiskList")
    @Expose
    private AccessKeyAlarmInfo [] AccessKeyRiskList;

    /**
    * 账号所属APPID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 主账号昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 子账号昵称
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * 账号所属主账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 账号自身uin，主账号时与主账号uin一致
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 登录IP
    */
    @SerializedName("LoginIP")
    @Expose
    private String LoginIP;

    /**
    * 登录地址
    */
    @SerializedName("LoginLocation")
    @Expose
    private String LoginLocation;

    /**
    * 登录时间
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * 运营商名称
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * 操作保护是否开启
0 未开启
1 已开启
    */
    @SerializedName("ActionFlag")
    @Expose
    private Long ActionFlag;

    /**
    * 登录保护是否开启
0 未开启
1 已开启
    */
    @SerializedName("LoginFlag")
    @Expose
    private Long LoginFlag;

    /**
    * 0 表示已检测 1 表示检测中
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
    * 云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get 账号ID 
     * @return ID 账号ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 账号ID
     * @param ID 账号ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 账号名称 
     * @return Name 账号名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号名称
     * @param Name 账号名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 0 主账号 1子账号 
     * @return Type 0 主账号 1子账号
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 主账号 1子账号
     * @param Type 0 主账号 1子账号
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 访问方式
0 API
1 控制台与API 
     * @return AccessType 访问方式
0 API
1 控制台与API
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问方式
0 API
1 控制台与API
     * @param AccessType 访问方式
0 API
1 控制台与API
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 安全建议 枚举 0 正常 1 立即处理 2 建议加固 
     * @return Advice 安全建议 枚举 0 正常 1 立即处理 2 建议加固
     */
    public Long getAdvice() {
        return this.Advice;
    }

    /**
     * Set 安全建议 枚举 0 正常 1 立即处理 2 建议加固
     * @param Advice 安全建议 枚举 0 正常 1 立即处理 2 建议加固
     */
    public void setAdvice(Long Advice) {
        this.Advice = Advice;
    }

    /**
     * Get 告警信息列表 
     * @return AccessKeyAlarmList 告警信息列表
     */
    public AccessKeyAlarmInfo [] getAccessKeyAlarmList() {
        return this.AccessKeyAlarmList;
    }

    /**
     * Set 告警信息列表
     * @param AccessKeyAlarmList 告警信息列表
     */
    public void setAccessKeyAlarmList(AccessKeyAlarmInfo [] AccessKeyAlarmList) {
        this.AccessKeyAlarmList = AccessKeyAlarmList;
    }

    /**
     * Get 风险信息列表 
     * @return AccessKeyRiskList 风险信息列表
     */
    public AccessKeyAlarmInfo [] getAccessKeyRiskList() {
        return this.AccessKeyRiskList;
    }

    /**
     * Set 风险信息列表
     * @param AccessKeyRiskList 风险信息列表
     */
    public void setAccessKeyRiskList(AccessKeyAlarmInfo [] AccessKeyRiskList) {
        this.AccessKeyRiskList = AccessKeyRiskList;
    }

    /**
     * Get 账号所属APPID 
     * @return AppID 账号所属APPID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 账号所属APPID
     * @param AppID 账号所属APPID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 主账号昵称 
     * @return Nickname 主账号昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 主账号昵称
     * @param Nickname 主账号昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 子账号昵称 
     * @return SubNickname 子账号昵称
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set 子账号昵称
     * @param SubNickname 子账号昵称
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get 账号所属主账号Uin 
     * @return Uin 账号所属主账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号所属主账号Uin
     * @param Uin 账号所属主账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 账号自身uin，主账号时与主账号uin一致 
     * @return SubUin 账号自身uin，主账号时与主账号uin一致
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 账号自身uin，主账号时与主账号uin一致
     * @param SubUin 账号自身uin，主账号时与主账号uin一致
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 登录IP 
     * @return LoginIP 登录IP
     */
    public String getLoginIP() {
        return this.LoginIP;
    }

    /**
     * Set 登录IP
     * @param LoginIP 登录IP
     */
    public void setLoginIP(String LoginIP) {
        this.LoginIP = LoginIP;
    }

    /**
     * Get 登录地址 
     * @return LoginLocation 登录地址
     */
    public String getLoginLocation() {
        return this.LoginLocation;
    }

    /**
     * Set 登录地址
     * @param LoginLocation 登录地址
     */
    public void setLoginLocation(String LoginLocation) {
        this.LoginLocation = LoginLocation;
    }

    /**
     * Get 登录时间 
     * @return LoginTime 登录时间
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set 登录时间
     * @param LoginTime 登录时间
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get 运营商名称 
     * @return ISP 运营商名称
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set 运营商名称
     * @param ISP 运营商名称
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get 操作保护是否开启
0 未开启
1 已开启 
     * @return ActionFlag 操作保护是否开启
0 未开启
1 已开启
     */
    public Long getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set 操作保护是否开启
0 未开启
1 已开启
     * @param ActionFlag 操作保护是否开启
0 未开启
1 已开启
     */
    public void setActionFlag(Long ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get 登录保护是否开启
0 未开启
1 已开启 
     * @return LoginFlag 登录保护是否开启
0 未开启
1 已开启
     */
    public Long getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set 登录保护是否开启
0 未开启
1 已开启
     * @param LoginFlag 登录保护是否开启
0 未开启
1 已开启
     */
    public void setLoginFlag(Long LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get 0 表示已检测 1 表示检测中 
     * @return CheckStatus 0 表示已检测 1 表示检测中
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0 表示已检测 1 表示检测中
     * @param CheckStatus 0 表示已检测 1 表示检测中
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云 
     * @return CloudType 云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云
     * @param CloudType 云厂商类型 0:腾讯云 1:亚马逊云 2:微软云 3:谷歌云 4:阿里云 5:华为云
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public AccessKeyUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyUser(AccessKeyUser source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.Advice != null) {
            this.Advice = new Long(source.Advice);
        }
        if (source.AccessKeyAlarmList != null) {
            this.AccessKeyAlarmList = new AccessKeyAlarmInfo[source.AccessKeyAlarmList.length];
            for (int i = 0; i < source.AccessKeyAlarmList.length; i++) {
                this.AccessKeyAlarmList[i] = new AccessKeyAlarmInfo(source.AccessKeyAlarmList[i]);
            }
        }
        if (source.AccessKeyRiskList != null) {
            this.AccessKeyRiskList = new AccessKeyAlarmInfo[source.AccessKeyRiskList.length];
            for (int i = 0; i < source.AccessKeyRiskList.length; i++) {
                this.AccessKeyRiskList[i] = new AccessKeyAlarmInfo(source.AccessKeyRiskList[i]);
            }
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubNickname != null) {
            this.SubNickname = new String(source.SubNickname);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.LoginIP != null) {
            this.LoginIP = new String(source.LoginIP);
        }
        if (source.LoginLocation != null) {
            this.LoginLocation = new String(source.LoginLocation);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.ActionFlag != null) {
            this.ActionFlag = new Long(source.ActionFlag);
        }
        if (source.LoginFlag != null) {
            this.LoginFlag = new Long(source.LoginFlag);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Advice", this.Advice);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmList.", this.AccessKeyAlarmList);
        this.setParamArrayObj(map, prefix + "AccessKeyRiskList.", this.AccessKeyRiskList);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "LoginIP", this.LoginIP);
        this.setParamSimple(map, prefix + "LoginLocation", this.LoginLocation);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "ActionFlag", this.ActionFlag);
        this.setParamSimple(map, prefix + "LoginFlag", this.LoginFlag);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

