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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertType extends AbstractModel{

    /**
    * 标准时间格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertTime")
    @Expose
    private String AlertTime;

    /**
    * 唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetPrivateIp")
    @Expose
    private String [] AssetPrivateIp;

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertName")
    @Expose
    private String AlertName;

    /**
    * 告警级别  0:未知 1:低危 2:中危 3:高危 4:严重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 攻击字段1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackChain")
    @Expose
    private String AttackChain;

    /**
    * 攻击字段2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackId")
    @Expose
    private String AttackId;

    /**
    * 关注点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Concerns")
    @Expose
    private ConcernInfo [] Concerns;

    /**
    * 1：已防御，0,2：仅检测(0:告警类 1:拦截类 2:放行类 )
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 0/空：未知，1：未成功，2：成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackResult")
    @Expose
    private Long AttackResult;

    /**
    * //调查状态  0/空：未启用，1：调查中，2：完成调查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * //关联事件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * //处置状态  0：未关闭，1：已关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资产名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 恶意实体
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcernMaliciousCount")
    @Expose
    private Long ConcernMaliciousCount;

    /**
    * 受害者实体
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcernVictimCount")
    @Expose
    private Long ConcernVictimCount;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VictimAssetType")
    @Expose
    private String VictimAssetType;

    /**
    * 告警子类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 攻击技术名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackName")
    @Expose
    private String AttackName;

    /**
    * 外网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetPublicIp")
    @Expose
    private String [] AssetPublicIp;

    /**
    * 攻击战术名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackTactic")
    @Expose
    private String AttackTactic;

    /**
    * 资产子网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VictimAssetSub")
    @Expose
    private String VictimAssetSub;

    /**
     * Get 标准时间格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertTime 标准时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertTime() {
        return this.AlertTime;
    }

    /**
     * Set 标准时间格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertTime 标准时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertTime(String AlertTime) {
        this.AlertTime = AlertTime;
    }

    /**
     * Get 唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertId 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertId 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get 资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetPrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetPrivateIp() {
        return this.AssetPrivateIp;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetPrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetPrivateIp(String [] AssetPrivateIp) {
        this.AssetPrivateIp = AssetPrivateIp;
    }

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertName 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlertName() {
        return this.AlertName;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertName 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertName(String AlertName) {
        this.AlertName = AlertName;
    }

    /**
     * Get 告警级别  0:未知 1:低危 2:中危 3:高危 4:严重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 告警级别  0:未知 1:低危 2:中危 3:高危 4:严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 告警级别  0:未知 1:低危 2:中危 3:高危 4:严重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 告警级别  0:未知 1:低危 2:中危 3:高危 4:严重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 攻击字段1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackChain 攻击字段1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackChain() {
        return this.AttackChain;
    }

    /**
     * Set 攻击字段1
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackChain 攻击字段1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackChain(String AttackChain) {
        this.AttackChain = AttackChain;
    }

    /**
     * Get 攻击字段2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackId 攻击字段2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackId() {
        return this.AttackId;
    }

    /**
     * Set 攻击字段2
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackId 攻击字段2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackId(String AttackId) {
        this.AttackId = AttackId;
    }

    /**
     * Get 关注点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Concerns 关注点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConcernInfo [] getConcerns() {
        return this.Concerns;
    }

    /**
     * Set 关注点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Concerns 关注点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcerns(ConcernInfo [] Concerns) {
        this.Concerns = Concerns;
    }

    /**
     * Get 1：已防御，0,2：仅检测(0:告警类 1:拦截类 2:放行类 )
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 1：已防御，0,2：仅检测(0:告警类 1:拦截类 2:放行类 )
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 1：已防御，0,2：仅检测(0:告警类 1:拦截类 2:放行类 )
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 1：已防御，0,2：仅检测(0:告警类 1:拦截类 2:放行类 )
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 0/空：未知，1：未成功，2：成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackResult 0/空：未知，1：未成功，2：成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackResult() {
        return this.AttackResult;
    }

    /**
     * Set 0/空：未知，1：未成功，2：成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackResult 0/空：未知，1：未成功，2：成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackResult(Long AttackResult) {
        this.AttackResult = AttackResult;
    }

    /**
     * Get //调查状态  0/空：未启用，1：调查中，2：完成调查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventStatus //调查状态  0/空：未启用，1：调查中，2：完成调查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set //调查状态  0/空：未启用，1：调查中，2：完成调查
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventStatus //调查状态  0/空：未启用，1：调查中，2：完成调查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get //关联事件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId //关联事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set //关联事件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId //关联事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get //处置状态  0：未关闭，1：已关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status //处置状态  0：未关闭，1：已关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set //处置状态  0：未关闭，1：已关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status //处置状态  0：未关闭，1：已关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资产名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 恶意实体
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcernMaliciousCount 恶意实体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcernMaliciousCount() {
        return this.ConcernMaliciousCount;
    }

    /**
     * Set 恶意实体
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcernMaliciousCount 恶意实体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcernMaliciousCount(Long ConcernMaliciousCount) {
        this.ConcernMaliciousCount = ConcernMaliciousCount;
    }

    /**
     * Get 受害者实体
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcernVictimCount 受害者实体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcernVictimCount() {
        return this.ConcernVictimCount;
    }

    /**
     * Set 受害者实体
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcernVictimCount 受害者实体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcernVictimCount(Long ConcernVictimCount) {
        this.ConcernVictimCount = ConcernVictimCount;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VictimAssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVictimAssetType() {
        return this.VictimAssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VictimAssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVictimAssetType(String VictimAssetType) {
        this.VictimAssetType = VictimAssetType;
    }

    /**
     * Get 告警子类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubType 告警子类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 告警子类
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubType 告警子类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 攻击技术名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackName 攻击技术名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackName() {
        return this.AttackName;
    }

    /**
     * Set 攻击技术名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackName 攻击技术名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackName(String AttackName) {
        this.AttackName = AttackName;
    }

    /**
     * Get 外网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetPublicIp 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetPublicIp() {
        return this.AssetPublicIp;
    }

    /**
     * Set 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetPublicIp 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetPublicIp(String [] AssetPublicIp) {
        this.AssetPublicIp = AssetPublicIp;
    }

    /**
     * Get 攻击战术名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackTactic 攻击战术名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackTactic() {
        return this.AttackTactic;
    }

    /**
     * Set 攻击战术名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackTactic 攻击战术名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackTactic(String AttackTactic) {
        this.AttackTactic = AttackTactic;
    }

    /**
     * Get 资产子网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VictimAssetSub 资产子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVictimAssetSub() {
        return this.VictimAssetSub;
    }

    /**
     * Set 资产子网
注意：此字段可能返回 null，表示取不到有效值。
     * @param VictimAssetSub 资产子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVictimAssetSub(String VictimAssetSub) {
        this.VictimAssetSub = VictimAssetSub;
    }

    public AlertType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertType(AlertType source) {
        if (source.AlertTime != null) {
            this.AlertTime = new String(source.AlertTime);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetPrivateIp != null) {
            this.AssetPrivateIp = new String[source.AssetPrivateIp.length];
            for (int i = 0; i < source.AssetPrivateIp.length; i++) {
                this.AssetPrivateIp[i] = new String(source.AssetPrivateIp[i]);
            }
        }
        if (source.AlertName != null) {
            this.AlertName = new String(source.AlertName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.AttackChain != null) {
            this.AttackChain = new String(source.AttackChain);
        }
        if (source.AttackId != null) {
            this.AttackId = new String(source.AttackId);
        }
        if (source.Concerns != null) {
            this.Concerns = new ConcernInfo[source.Concerns.length];
            for (int i = 0; i < source.Concerns.length; i++) {
                this.Concerns[i] = new ConcernInfo(source.Concerns[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.AttackResult != null) {
            this.AttackResult = new Long(source.AttackResult);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.ConcernMaliciousCount != null) {
            this.ConcernMaliciousCount = new Long(source.ConcernMaliciousCount);
        }
        if (source.ConcernVictimCount != null) {
            this.ConcernVictimCount = new Long(source.ConcernVictimCount);
        }
        if (source.VictimAssetType != null) {
            this.VictimAssetType = new String(source.VictimAssetType);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.AttackName != null) {
            this.AttackName = new String(source.AttackName);
        }
        if (source.AssetPublicIp != null) {
            this.AssetPublicIp = new String[source.AssetPublicIp.length];
            for (int i = 0; i < source.AssetPublicIp.length; i++) {
                this.AssetPublicIp[i] = new String(source.AssetPublicIp[i]);
            }
        }
        if (source.AttackTactic != null) {
            this.AttackTactic = new String(source.AttackTactic);
        }
        if (source.VictimAssetSub != null) {
            this.VictimAssetSub = new String(source.VictimAssetSub);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertTime", this.AlertTime);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamArraySimple(map, prefix + "AssetPrivateIp.", this.AssetPrivateIp);
        this.setParamSimple(map, prefix + "AlertName", this.AlertName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AttackChain", this.AttackChain);
        this.setParamSimple(map, prefix + "AttackId", this.AttackId);
        this.setParamArrayObj(map, prefix + "Concerns.", this.Concerns);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "AttackResult", this.AttackResult);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "ConcernMaliciousCount", this.ConcernMaliciousCount);
        this.setParamSimple(map, prefix + "ConcernVictimCount", this.ConcernVictimCount);
        this.setParamSimple(map, prefix + "VictimAssetType", this.VictimAssetType);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "AttackName", this.AttackName);
        this.setParamArraySimple(map, prefix + "AssetPublicIp.", this.AssetPublicIp);
        this.setParamSimple(map, prefix + "AttackTactic", this.AttackTactic);
        this.setParamSimple(map, prefix + "VictimAssetSub", this.VictimAssetSub);

    }
}

