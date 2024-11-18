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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostLoginList extends AbstractModel {

    /**
    * 记录Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机ip
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 来源ip
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 国家id
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * 城市id
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * 省份id
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * 登录时间
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 是否命中异地登录异常  1表示命中此类异常, 0表示未命中
    */
    @SerializedName("IsRiskArea")
    @Expose
    private Long IsRiskArea;

    /**
    * 是否命中异常用户异常 1表示命中此类异常, 0表示未命中
    */
    @SerializedName("IsRiskUser")
    @Expose
    private Long IsRiskUser;

    /**
    * 是否命中异常时间异常 1表示命中此类异常, 0表示未命中
    */
    @SerializedName("IsRiskTime")
    @Expose
    private Long IsRiskTime;

    /**
    * 是否命中异常IP异常 1表示命中此类异常, 0表示未命中
    */
    @SerializedName("IsRiskSrcIp")
    @Expose
    private Long IsRiskSrcIp;

    /**
    * 危险等级：
0 高危
1 可疑
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 位置名称
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 高危信息说明：
ABROAD - 海外IP；
XTI - 威胁情报
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 请求目的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 记录Id 
     * @return Id 记录Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录Id
     * @param Id 记录Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机ip 
     * @return MachineIp 主机ip
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机ip
     * @param MachineIp 主机ip
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名 
     * @return MachineName 主机名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名
     * @param MachineName 主机名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 来源ip 
     * @return SrcIp 来源ip
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 来源ip
     * @param SrcIp 来源ip
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。 
     * @return Status 1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。
     * @param Status 1:正常登录；2异地登录； 5已加白； 14：已处理；15：已忽略。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 国家id 
     * @return Country 国家id
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set 国家id
     * @param Country 国家id
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get 城市id 
     * @return City 城市id
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set 城市id
     * @param City 城市id
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get 省份id 
     * @return Province 省份id
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set 省份id
     * @param Province 省份id
     */
    public void setProvince(Long Province) {
        this.Province = Province;
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
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 是否命中异地登录异常  1表示命中此类异常, 0表示未命中 
     * @return IsRiskArea 是否命中异地登录异常  1表示命中此类异常, 0表示未命中
     */
    public Long getIsRiskArea() {
        return this.IsRiskArea;
    }

    /**
     * Set 是否命中异地登录异常  1表示命中此类异常, 0表示未命中
     * @param IsRiskArea 是否命中异地登录异常  1表示命中此类异常, 0表示未命中
     */
    public void setIsRiskArea(Long IsRiskArea) {
        this.IsRiskArea = IsRiskArea;
    }

    /**
     * Get 是否命中异常用户异常 1表示命中此类异常, 0表示未命中 
     * @return IsRiskUser 是否命中异常用户异常 1表示命中此类异常, 0表示未命中
     */
    public Long getIsRiskUser() {
        return this.IsRiskUser;
    }

    /**
     * Set 是否命中异常用户异常 1表示命中此类异常, 0表示未命中
     * @param IsRiskUser 是否命中异常用户异常 1表示命中此类异常, 0表示未命中
     */
    public void setIsRiskUser(Long IsRiskUser) {
        this.IsRiskUser = IsRiskUser;
    }

    /**
     * Get 是否命中异常时间异常 1表示命中此类异常, 0表示未命中 
     * @return IsRiskTime 是否命中异常时间异常 1表示命中此类异常, 0表示未命中
     */
    public Long getIsRiskTime() {
        return this.IsRiskTime;
    }

    /**
     * Set 是否命中异常时间异常 1表示命中此类异常, 0表示未命中
     * @param IsRiskTime 是否命中异常时间异常 1表示命中此类异常, 0表示未命中
     */
    public void setIsRiskTime(Long IsRiskTime) {
        this.IsRiskTime = IsRiskTime;
    }

    /**
     * Get 是否命中异常IP异常 1表示命中此类异常, 0表示未命中 
     * @return IsRiskSrcIp 是否命中异常IP异常 1表示命中此类异常, 0表示未命中
     */
    public Long getIsRiskSrcIp() {
        return this.IsRiskSrcIp;
    }

    /**
     * Set 是否命中异常IP异常 1表示命中此类异常, 0表示未命中
     * @param IsRiskSrcIp 是否命中异常IP异常 1表示命中此类异常, 0表示未命中
     */
    public void setIsRiskSrcIp(Long IsRiskSrcIp) {
        this.IsRiskSrcIp = IsRiskSrcIp;
    }

    /**
     * Get 危险等级：
0 高危
1 可疑 
     * @return RiskLevel 危险等级：
0 高危
1 可疑
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 危险等级：
0 高危
1 可疑
     * @param RiskLevel 危险等级：
0 高危
1 可疑
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 位置名称 
     * @return Location 位置名称
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 位置名称
     * @param Location 位置名称
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 高危信息说明：
ABROAD - 海外IP；
XTI - 威胁情报 
     * @return Desc 高危信息说明：
ABROAD - 海外IP；
XTI - 威胁情报
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 高危信息说明：
ABROAD - 海外IP；
XTI - 威胁情报
     * @param Desc 高危信息说明：
ABROAD - 海外IP；
XTI - 威胁情报
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 请求目的端口 
     * @return Port 请求目的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 请求目的端口
     * @param Port 请求目的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
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

    }
}

