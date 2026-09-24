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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostLoginList extends AbstractModel {

    /**
    * <p>记录Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>主机Uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>主机ip</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>主机名</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>来源ip</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>国家id</p>
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * <p>城市id</p>
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * <p>省份id</p>
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * <p>登录时间</p>
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>是否命中异地登录异常  1表示命中此类异常, 0表示未命中</p>
    */
    @SerializedName("IsRiskArea")
    @Expose
    private Long IsRiskArea;

    /**
    * <p>是否命中异常用户异常 1表示命中此类异常, 0表示未命中</p>
    */
    @SerializedName("IsRiskUser")
    @Expose
    private Long IsRiskUser;

    /**
    * <p>是否命中异常时间异常 1表示命中此类异常, 0表示未命中</p>
    */
    @SerializedName("IsRiskTime")
    @Expose
    private Long IsRiskTime;

    /**
    * <p>是否命中异常IP异常 1表示命中此类异常, 0表示未命中</p>
    */
    @SerializedName("IsRiskSrcIp")
    @Expose
    private Long IsRiskSrcIp;

    /**
    * <p>危险等级：<br>0 高危<br>1 可疑</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>位置名称</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>主机quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>高危信息说明：<br>ABROAD - 境外IP；<br>XTI - 威胁情报</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>附加信息</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <p>请求目的端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>ip分析</p>
    */
    @SerializedName("IPAnalyse")
    @Expose
    private IPAnalyse IPAnalyse;

    /**
    * <p>命中策略ID</p><p>枚举值：</p><ul><li>risk_login_1： 威胁情报</li><li>risk_login_2： 密码破解成功后登录</li><li>risk_login_3： 弱口令账户登录</li><li>risk_login_4： 非法账户登录</li><li>risk_login_5： 登录后存在入侵行为</li><li>risk_login_101： 海外IP登录</li><li>risk_login_102： 非常用登录地登录</li><li>risk_login_103： 非工作时间登录</li></ul>
    */
    @SerializedName("HitRule")
    @Expose
    private String HitRule;

    /**
    * <p>命中策略名</p>
    */
    @SerializedName("HitRuleName")
    @Expose
    private String HitRuleName;

    /**
    * <p>告警数量</p>
    */
    @SerializedName("AlertCount")
    @Expose
    private Long AlertCount;

    /**
    * <p>首次发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("FirstDiscoverTime")
    @Expose
    private String FirstDiscoverTime;

    /**
    * <p>最近发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("LastDiscoverTime")
    @Expose
    private String LastDiscoverTime;

    /**
    * <p>危害描述</p>
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * <p>修复建议</p>
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * <p>最近登录历史</p>
    */
    @SerializedName("RecentLoginList")
    @Expose
    private RecentLoginItem [] RecentLoginList;

    /**
     * Get <p>记录Id</p> 
     * @return Id <p>记录Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>记录Id</p>
     * @param Id <p>记录Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>主机Uuid</p> 
     * @return Uuid <p>主机Uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机Uuid</p>
     * @param Uuid <p>主机Uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>主机ip</p> 
     * @return MachineIp <p>主机ip</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>主机ip</p>
     * @param MachineIp <p>主机ip</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>主机名</p> 
     * @return MachineName <p>主机名</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名</p>
     * @param MachineName <p>主机名</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>来源ip</p> 
     * @return SrcIp <p>来源ip</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>来源ip</p>
     * @param SrcIp <p>来源ip</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。</p> 
     * @return Status <p>1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。</p>
     * @param Status <p>1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>国家id</p> 
     * @return Country <p>国家id</p>
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家id</p>
     * @param Country <p>国家id</p>
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get <p>城市id</p> 
     * @return City <p>城市id</p>
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set <p>城市id</p>
     * @param City <p>城市id</p>
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get <p>省份id</p> 
     * @return Province <p>省份id</p>
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set <p>省份id</p>
     * @param Province <p>省份id</p>
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get <p>登录时间</p> 
     * @return LoginTime <p>登录时间</p>
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set <p>登录时间</p>
     * @param LoginTime <p>登录时间</p>
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>是否命中异地登录异常  1表示命中此类异常, 0表示未命中</p> 
     * @return IsRiskArea <p>是否命中异地登录异常  1表示命中此类异常, 0表示未命中</p>
     */
    public Long getIsRiskArea() {
        return this.IsRiskArea;
    }

    /**
     * Set <p>是否命中异地登录异常  1表示命中此类异常, 0表示未命中</p>
     * @param IsRiskArea <p>是否命中异地登录异常  1表示命中此类异常, 0表示未命中</p>
     */
    public void setIsRiskArea(Long IsRiskArea) {
        this.IsRiskArea = IsRiskArea;
    }

    /**
     * Get <p>是否命中异常用户异常 1表示命中此类异常, 0表示未命中</p> 
     * @return IsRiskUser <p>是否命中异常用户异常 1表示命中此类异常, 0表示未命中</p>
     */
    public Long getIsRiskUser() {
        return this.IsRiskUser;
    }

    /**
     * Set <p>是否命中异常用户异常 1表示命中此类异常, 0表示未命中</p>
     * @param IsRiskUser <p>是否命中异常用户异常 1表示命中此类异常, 0表示未命中</p>
     */
    public void setIsRiskUser(Long IsRiskUser) {
        this.IsRiskUser = IsRiskUser;
    }

    /**
     * Get <p>是否命中异常时间异常 1表示命中此类异常, 0表示未命中</p> 
     * @return IsRiskTime <p>是否命中异常时间异常 1表示命中此类异常, 0表示未命中</p>
     */
    public Long getIsRiskTime() {
        return this.IsRiskTime;
    }

    /**
     * Set <p>是否命中异常时间异常 1表示命中此类异常, 0表示未命中</p>
     * @param IsRiskTime <p>是否命中异常时间异常 1表示命中此类异常, 0表示未命中</p>
     */
    public void setIsRiskTime(Long IsRiskTime) {
        this.IsRiskTime = IsRiskTime;
    }

    /**
     * Get <p>是否命中异常IP异常 1表示命中此类异常, 0表示未命中</p> 
     * @return IsRiskSrcIp <p>是否命中异常IP异常 1表示命中此类异常, 0表示未命中</p>
     */
    public Long getIsRiskSrcIp() {
        return this.IsRiskSrcIp;
    }

    /**
     * Set <p>是否命中异常IP异常 1表示命中此类异常, 0表示未命中</p>
     * @param IsRiskSrcIp <p>是否命中异常IP异常 1表示命中此类异常, 0表示未命中</p>
     */
    public void setIsRiskSrcIp(Long IsRiskSrcIp) {
        this.IsRiskSrcIp = IsRiskSrcIp;
    }

    /**
     * Get <p>危险等级：<br>0 高危<br>1 可疑</p> 
     * @return RiskLevel <p>危险等级：<br>0 高危<br>1 可疑</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>危险等级：<br>0 高危<br>1 可疑</p>
     * @param RiskLevel <p>危险等级：<br>0 高危<br>1 可疑</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>位置名称</p> 
     * @return Location <p>位置名称</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>位置名称</p>
     * @param Location <p>位置名称</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>主机quuid</p> 
     * @return Quuid <p>主机quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机quuid</p>
     * @param Quuid <p>主机quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>高危信息说明：<br>ABROAD - 境外IP；<br>XTI - 威胁情报</p> 
     * @return Desc <p>高危信息说明：<br>ABROAD - 境外IP；<br>XTI - 威胁情报</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>高危信息说明：<br>ABROAD - 境外IP；<br>XTI - 威胁情报</p>
     * @param Desc <p>高危信息说明：<br>ABROAD - 境外IP；<br>XTI - 威胁情报</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>附加信息</p> 
     * @return MachineExtraInfo <p>附加信息</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>附加信息</p>
     * @param MachineExtraInfo <p>附加信息</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <p>请求目的端口</p> 
     * @return Port <p>请求目的端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>请求目的端口</p>
     * @param Port <p>请求目的端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>ip分析</p> 
     * @return IPAnalyse <p>ip分析</p>
     */
    public IPAnalyse getIPAnalyse() {
        return this.IPAnalyse;
    }

    /**
     * Set <p>ip分析</p>
     * @param IPAnalyse <p>ip分析</p>
     */
    public void setIPAnalyse(IPAnalyse IPAnalyse) {
        this.IPAnalyse = IPAnalyse;
    }

    /**
     * Get <p>命中策略ID</p><p>枚举值：</p><ul><li>risk_login_1： 威胁情报</li><li>risk_login_2： 密码破解成功后登录</li><li>risk_login_3： 弱口令账户登录</li><li>risk_login_4： 非法账户登录</li><li>risk_login_5： 登录后存在入侵行为</li><li>risk_login_101： 海外IP登录</li><li>risk_login_102： 非常用登录地登录</li><li>risk_login_103： 非工作时间登录</li></ul> 
     * @return HitRule <p>命中策略ID</p><p>枚举值：</p><ul><li>risk_login_1： 威胁情报</li><li>risk_login_2： 密码破解成功后登录</li><li>risk_login_3： 弱口令账户登录</li><li>risk_login_4： 非法账户登录</li><li>risk_login_5： 登录后存在入侵行为</li><li>risk_login_101： 海外IP登录</li><li>risk_login_102： 非常用登录地登录</li><li>risk_login_103： 非工作时间登录</li></ul>
     */
    public String getHitRule() {
        return this.HitRule;
    }

    /**
     * Set <p>命中策略ID</p><p>枚举值：</p><ul><li>risk_login_1： 威胁情报</li><li>risk_login_2： 密码破解成功后登录</li><li>risk_login_3： 弱口令账户登录</li><li>risk_login_4： 非法账户登录</li><li>risk_login_5： 登录后存在入侵行为</li><li>risk_login_101： 海外IP登录</li><li>risk_login_102： 非常用登录地登录</li><li>risk_login_103： 非工作时间登录</li></ul>
     * @param HitRule <p>命中策略ID</p><p>枚举值：</p><ul><li>risk_login_1： 威胁情报</li><li>risk_login_2： 密码破解成功后登录</li><li>risk_login_3： 弱口令账户登录</li><li>risk_login_4： 非法账户登录</li><li>risk_login_5： 登录后存在入侵行为</li><li>risk_login_101： 海外IP登录</li><li>risk_login_102： 非常用登录地登录</li><li>risk_login_103： 非工作时间登录</li></ul>
     */
    public void setHitRule(String HitRule) {
        this.HitRule = HitRule;
    }

    /**
     * Get <p>命中策略名</p> 
     * @return HitRuleName <p>命中策略名</p>
     */
    public String getHitRuleName() {
        return this.HitRuleName;
    }

    /**
     * Set <p>命中策略名</p>
     * @param HitRuleName <p>命中策略名</p>
     */
    public void setHitRuleName(String HitRuleName) {
        this.HitRuleName = HitRuleName;
    }

    /**
     * Get <p>告警数量</p> 
     * @return AlertCount <p>告警数量</p>
     */
    public Long getAlertCount() {
        return this.AlertCount;
    }

    /**
     * Set <p>告警数量</p>
     * @param AlertCount <p>告警数量</p>
     */
    public void setAlertCount(Long AlertCount) {
        this.AlertCount = AlertCount;
    }

    /**
     * Get <p>首次发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p> 
     * @return FirstDiscoverTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public String getFirstDiscoverTime() {
        return this.FirstDiscoverTime;
    }

    /**
     * Set <p>首次发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     * @param FirstDiscoverTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public void setFirstDiscoverTime(String FirstDiscoverTime) {
        this.FirstDiscoverTime = FirstDiscoverTime;
    }

    /**
     * Get <p>最近发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p> 
     * @return LastDiscoverTime <p>最近发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public String getLastDiscoverTime() {
        return this.LastDiscoverTime;
    }

    /**
     * Set <p>最近发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     * @param LastDiscoverTime <p>最近发现时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public void setLastDiscoverTime(String LastDiscoverTime) {
        this.LastDiscoverTime = LastDiscoverTime;
    }

    /**
     * Get <p>危害描述</p> 
     * @return HarmDescribe <p>危害描述</p>
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set <p>危害描述</p>
     * @param HarmDescribe <p>危害描述</p>
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get <p>修复建议</p> 
     * @return SuggestScheme <p>修复建议</p>
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set <p>修复建议</p>
     * @param SuggestScheme <p>修复建议</p>
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get <p>最近登录历史</p> 
     * @return RecentLoginList <p>最近登录历史</p>
     */
    public RecentLoginItem [] getRecentLoginList() {
        return this.RecentLoginList;
    }

    /**
     * Set <p>最近登录历史</p>
     * @param RecentLoginList <p>最近登录历史</p>
     */
    public void setRecentLoginList(RecentLoginItem [] RecentLoginList) {
        this.RecentLoginList = RecentLoginList;
    }

    public HostLoginList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostLoginList(HostLoginList source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.Province != null) {
            this.Province = new Long(source.Province);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IsRiskArea != null) {
            this.IsRiskArea = new Long(source.IsRiskArea);
        }
        if (source.IsRiskUser != null) {
            this.IsRiskUser = new Long(source.IsRiskUser);
        }
        if (source.IsRiskTime != null) {
            this.IsRiskTime = new Long(source.IsRiskTime);
        }
        if (source.IsRiskSrcIp != null) {
            this.IsRiskSrcIp = new Long(source.IsRiskSrcIp);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.IPAnalyse != null) {
            this.IPAnalyse = new IPAnalyse(source.IPAnalyse);
        }
        if (source.HitRule != null) {
            this.HitRule = new String(source.HitRule);
        }
        if (source.HitRuleName != null) {
            this.HitRuleName = new String(source.HitRuleName);
        }
        if (source.AlertCount != null) {
            this.AlertCount = new Long(source.AlertCount);
        }
        if (source.FirstDiscoverTime != null) {
            this.FirstDiscoverTime = new String(source.FirstDiscoverTime);
        }
        if (source.LastDiscoverTime != null) {
            this.LastDiscoverTime = new String(source.LastDiscoverTime);
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.RecentLoginList != null) {
            this.RecentLoginList = new RecentLoginItem[source.RecentLoginList.length];
            for (int i = 0; i < source.RecentLoginList.length; i++) {
                this.RecentLoginList[i] = new RecentLoginItem(source.RecentLoginList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IsRiskArea", this.IsRiskArea);
        this.setParamSimple(map, prefix + "IsRiskUser", this.IsRiskUser);
        this.setParamSimple(map, prefix + "IsRiskTime", this.IsRiskTime);
        this.setParamSimple(map, prefix + "IsRiskSrcIp", this.IsRiskSrcIp);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "IPAnalyse.", this.IPAnalyse);
        this.setParamSimple(map, prefix + "HitRule", this.HitRule);
        this.setParamSimple(map, prefix + "HitRuleName", this.HitRuleName);
        this.setParamSimple(map, prefix + "AlertCount", this.AlertCount);
        this.setParamSimple(map, prefix + "FirstDiscoverTime", this.FirstDiscoverTime);
        this.setParamSimple(map, prefix + "LastDiscoverTime", this.LastDiscoverTime);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamArrayObj(map, prefix + "RecentLoginList.", this.RecentLoginList);

    }
}

