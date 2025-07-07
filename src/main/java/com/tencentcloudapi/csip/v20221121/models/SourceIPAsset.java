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

public class SourceIPAsset extends AbstractModel {

    /**
    * 源IP id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 源IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 账号所属APPID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * IP地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 调用方式
0:控制台调用
1:API
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * IP类型
0:账号内（未备注）
1:账号外（未备注）
2:账号内   (已备注)
3:账号外   (已备注)
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * 告警信息列表
    */
    @SerializedName("AccessKeyAlarmList")
    @Expose
    private AccessKeyAlarmInfo [] AccessKeyAlarmList;

    /**
    * ak信息列表
    */
    @SerializedName("AKInfo")
    @Expose
    private AKInfo [] AKInfo;

    /**
    * 调用接口数量
    */
    @SerializedName("ActionCount")
    @Expose
    private Long ActionCount;

    /**
    * 最近访问时间
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * IP关联实例ID，如果为空字符串，代表非账号内资产
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * IP关联实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 账号所属Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 展示状态
    */
    @SerializedName("ShowStatus")
    @Expose
    private Boolean ShowStatus;

    /**
    * 运营商字段
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
     * Get 源IP id 
     * @return ID 源IP id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 源IP id
     * @param ID 源IP id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 源IP 
     * @return SourceIP 源IP
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set 源IP
     * @param SourceIP 源IP
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get IP地域 
     * @return Region IP地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set IP地域
     * @param Region IP地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 调用方式
0:控制台调用
1:API 
     * @return EventType 调用方式
0:控制台调用
1:API
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 调用方式
0:控制台调用
1:API
     * @param EventType 调用方式
0:控制台调用
1:API
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get IP类型
0:账号内（未备注）
1:账号外（未备注）
2:账号内   (已备注)
3:账号外   (已备注) 
     * @return IPType IP类型
0:账号内（未备注）
1:账号外（未备注）
2:账号内   (已备注)
3:账号外   (已备注)
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set IP类型
0:账号内（未备注）
1:账号外（未备注）
2:账号内   (已备注)
3:账号外   (已备注)
     * @param IPType IP类型
0:账号内（未备注）
1:账号外（未备注）
2:账号内   (已备注)
3:账号外   (已备注)
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
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
     * Get ak信息列表 
     * @return AKInfo ak信息列表
     */
    public AKInfo [] getAKInfo() {
        return this.AKInfo;
    }

    /**
     * Set ak信息列表
     * @param AKInfo ak信息列表
     */
    public void setAKInfo(AKInfo [] AKInfo) {
        this.AKInfo = AKInfo;
    }

    /**
     * Get 调用接口数量 
     * @return ActionCount 调用接口数量
     */
    public Long getActionCount() {
        return this.ActionCount;
    }

    /**
     * Set 调用接口数量
     * @param ActionCount 调用接口数量
     */
    public void setActionCount(Long ActionCount) {
        this.ActionCount = ActionCount;
    }

    /**
     * Get 最近访问时间 
     * @return LastAccessTime 最近访问时间
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 最近访问时间
     * @param LastAccessTime 最近访问时间
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get IP关联实例ID，如果为空字符串，代表非账号内资产 
     * @return InstanceID IP关联实例ID，如果为空字符串，代表非账号内资产
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set IP关联实例ID，如果为空字符串，代表非账号内资产
     * @param InstanceID IP关联实例ID，如果为空字符串，代表非账号内资产
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get IP关联实例名称 
     * @return InstanceName IP关联实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set IP关联实例名称
     * @param InstanceName IP关联实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 账号所属Uin 
     * @return Uin 账号所属Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号所属Uin
     * @param Uin 账号所属Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 昵称 
     * @return Nickname 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
     * @param Nickname 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 展示状态 
     * @return ShowStatus 展示状态
     */
    public Boolean getShowStatus() {
        return this.ShowStatus;
    }

    /**
     * Set 展示状态
     * @param ShowStatus 展示状态
     */
    public void setShowStatus(Boolean ShowStatus) {
        this.ShowStatus = ShowStatus;
    }

    /**
     * Get 运营商字段 
     * @return ISP 运营商字段
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set 运营商字段
     * @param ISP 运营商字段
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public SourceIPAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceIPAsset(SourceIPAsset source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.IPType != null) {
            this.IPType = new Long(source.IPType);
        }
        if (source.AccessKeyAlarmList != null) {
            this.AccessKeyAlarmList = new AccessKeyAlarmInfo[source.AccessKeyAlarmList.length];
            for (int i = 0; i < source.AccessKeyAlarmList.length; i++) {
                this.AccessKeyAlarmList[i] = new AccessKeyAlarmInfo(source.AccessKeyAlarmList[i]);
            }
        }
        if (source.AKInfo != null) {
            this.AKInfo = new AKInfo[source.AKInfo.length];
            for (int i = 0; i < source.AKInfo.length; i++) {
                this.AKInfo[i] = new AKInfo(source.AKInfo[i]);
            }
        }
        if (source.ActionCount != null) {
            this.ActionCount = new Long(source.ActionCount);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.ShowStatus != null) {
            this.ShowStatus = new Boolean(source.ShowStatus);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "IPType", this.IPType);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmList.", this.AccessKeyAlarmList);
        this.setParamArrayObj(map, prefix + "AKInfo.", this.AKInfo);
        this.setParamSimple(map, prefix + "ActionCount", this.ActionCount);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "ShowStatus", this.ShowStatus);
        this.setParamSimple(map, prefix + "ISP", this.ISP);

    }
}

