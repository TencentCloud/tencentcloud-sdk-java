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

public class VulDefenceSetting extends AbstractModel {

    /**
    * 策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 0系统策略
1自定义策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 威胁等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThreatLevel")
    @Expose
    private Long ThreatLevel;

    /**
    * 1全部旗舰版主机
0自选主机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 支持的漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportVulNum")
    @Expose
    private Long SupportVulNum;

    /**
    * 0 关闭 1 开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 用户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户MemberId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 策略动作
0告警
1防御
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyAction")
    @Expose
    private Long StrategyAction;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 防护类型
0漏洞防御
1攻击检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefenceType")
    @Expose
    private Long DefenceType;

    /**
    * 自选主机数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 策略id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get 策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 0系统策略
1自定义策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyType 0系统策略
1自定义策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 0系统策略
1自定义策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyType 0系统策略
1自定义策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 威胁等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThreatLevel 威胁等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThreatLevel() {
        return this.ThreatLevel;
    }

    /**
     * Set 威胁等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThreatLevel 威胁等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreatLevel(Long ThreatLevel) {
        this.ThreatLevel = ThreatLevel;
    }

    /**
     * Get 1全部旗舰版主机
0自选主机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 1全部旗舰版主机
0自选主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 1全部旗舰版主机
0自选主机
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 1全部旗舰版主机
0自选主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 支持的漏洞个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportVulNum 支持的漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportVulNum() {
        return this.SupportVulNum;
    }

    /**
     * Set 支持的漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportVulNum 支持的漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportVulNum(Long SupportVulNum) {
        this.SupportVulNum = SupportVulNum;
    }

    /**
     * Get 0 关闭 1 开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 0 关闭 1 开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 0 关闭 1 开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 0 关闭 1 开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 用户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户MemberId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberId 用户MemberId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 用户MemberId
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberId 用户MemberId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 策略动作
0告警
1防御
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyAction 策略动作
0告警
1防御
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyAction() {
        return this.StrategyAction;
    }

    /**
     * Set 策略动作
0告警
1防御
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyAction 策略动作
0告警
1防御
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyAction(Long StrategyAction) {
        this.StrategyAction = StrategyAction;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nickname 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nickname 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 防护类型
0漏洞防御
1攻击检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefenceType 防护类型
0漏洞防御
1攻击检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefenceType() {
        return this.DefenceType;
    }

    /**
     * Set 防护类型
0漏洞防御
1攻击检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefenceType 防护类型
0漏洞防御
1攻击检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefenceType(Long DefenceType) {
        this.DefenceType = DefenceType;
    }

    /**
     * Get 自选主机数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNum 自选主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 自选主机数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNum 自选主机数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 策略id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public VulDefenceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceSetting(VulDefenceSetting source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.ThreatLevel != null) {
            this.ThreatLevel = new Long(source.ThreatLevel);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.SupportVulNum != null) {
            this.SupportVulNum = new Long(source.SupportVulNum);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.StrategyAction != null) {
            this.StrategyAction = new Long(source.StrategyAction);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.DefenceType != null) {
            this.DefenceType = new Long(source.DefenceType);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "ThreatLevel", this.ThreatLevel);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "SupportVulNum", this.SupportVulNum);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "StrategyAction", this.StrategyAction);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "DefenceType", this.DefenceType);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

