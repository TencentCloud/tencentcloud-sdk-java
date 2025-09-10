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

public class AccessKeyAsset extends AbstractModel {

    /**
    * AK 的id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * AK名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * 所属主账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 主账号昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 所属子账号Uin
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 所属子账号昵称
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * 0 主账号AK
1 子账号AK
2 临时密钥
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 安全建议 枚举
0 正常
1 立即处理
2 建议加固
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
    * 源IP数量
    */
    @SerializedName("IPCount")
    @Expose
    private Long IPCount;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近访问时间
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * AK状态 
0:禁用
1:已启用
2:已删除(已在cam侧删除，安全中心仍然存留之前的记录)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0 表示已检测
1 表示检测中
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
     * Get AK 的id 
     * @return ID AK 的id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set AK 的id
     * @param ID AK 的id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get AK名称 
     * @return Name AK名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set AK名称
     * @param Name AK名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 所属主账号Uin 
     * @return Uin 所属主账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 所属主账号Uin
     * @param Uin 所属主账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get 所属子账号Uin 
     * @return SubUin 所属子账号Uin
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 所属子账号Uin
     * @param SubUin 所属子账号Uin
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 所属子账号昵称 
     * @return SubNickname 所属子账号昵称
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set 所属子账号昵称
     * @param SubNickname 所属子账号昵称
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get 0 主账号AK
1 子账号AK
2 临时密钥 
     * @return Type 0 主账号AK
1 子账号AK
2 临时密钥
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 主账号AK
1 子账号AK
2 临时密钥
     * @param Type 0 主账号AK
1 子账号AK
2 临时密钥
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 安全建议 枚举
0 正常
1 立即处理
2 建议加固 
     * @return Advice 安全建议 枚举
0 正常
1 立即处理
2 建议加固
     */
    public Long getAdvice() {
        return this.Advice;
    }

    /**
     * Set 安全建议 枚举
0 正常
1 立即处理
2 建议加固
     * @param Advice 安全建议 枚举
0 正常
1 立即处理
2 建议加固
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
     * Get 源IP数量 
     * @return IPCount 源IP数量
     */
    public Long getIPCount() {
        return this.IPCount;
    }

    /**
     * Set 源IP数量
     * @param IPCount 源IP数量
     */
    public void setIPCount(Long IPCount) {
        this.IPCount = IPCount;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get AK状态 
0:禁用
1:已启用
2:已删除(已在cam侧删除，安全中心仍然存留之前的记录) 
     * @return Status AK状态 
0:禁用
1:已启用
2:已删除(已在cam侧删除，安全中心仍然存留之前的记录)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set AK状态 
0:禁用
1:已启用
2:已删除(已在cam侧删除，安全中心仍然存留之前的记录)
     * @param Status AK状态 
0:禁用
1:已启用
2:已删除(已在cam侧删除，安全中心仍然存留之前的记录)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0 表示已检测
1 表示检测中 
     * @return CheckStatus 0 表示已检测
1 表示检测中
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0 表示已检测
1 表示检测中
     * @param CheckStatus 0 表示已检测
1 表示检测中
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    public AccessKeyAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAsset(AccessKeyAsset source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubNickname != null) {
            this.SubNickname = new String(source.SubNickname);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
        if (source.IPCount != null) {
            this.IPCount = new Long(source.IPCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Advice", this.Advice);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmList.", this.AccessKeyAlarmList);
        this.setParamArrayObj(map, prefix + "AccessKeyRiskList.", this.AccessKeyRiskList);
        this.setParamSimple(map, prefix + "IPCount", this.IPCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);

    }
}

