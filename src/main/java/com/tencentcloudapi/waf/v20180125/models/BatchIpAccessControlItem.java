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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchIpAccessControlItem extends AbstractModel {

    /**
    * mongo表自增Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 黑名单42或白名单40
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 黑白名单的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 添加路径
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 修改时间
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 超时时间
    */
    @SerializedName("ValidTs")
    @Expose
    private Long ValidTs;

    /**
    * 域名列表
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 55101145
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get mongo表自增Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id mongo表自增Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set mongo表自增Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id mongo表自增Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 黑名单42或白名单40 
     * @return ActionType 黑名单42或白名单40
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 黑名单42或白名单40
     * @param ActionType 黑名单42或白名单40
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 黑白名单的IP 
     * @return Ip 黑白名单的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 黑白名单的IP
     * @param Ip 黑白名单的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 添加路径 
     * @return Source 添加路径
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 添加路径
     * @param Source 添加路径
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 修改时间 
     * @return TsVersion 修改时间
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 修改时间
     * @param TsVersion 修改时间
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 超时时间 
     * @return ValidTs 超时时间
     */
    public Long getValidTs() {
        return this.ValidTs;
    }

    /**
     * Set 超时时间
     * @param ValidTs 超时时间
     */
    public void setValidTs(Long ValidTs) {
        this.ValidTs = ValidTs;
    }

    /**
     * Get 域名列表 
     * @return Hosts 域名列表
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 域名列表
     * @param Hosts 域名列表
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 55101145
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 55101145
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 55101145
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 55101145
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpList IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpList IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public BatchIpAccessControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchIpAccessControlItem(BatchIpAccessControlItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.ValidTs != null) {
            this.ValidTs = new Long(source.ValidTs);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "ValidTs", this.ValidTs);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

