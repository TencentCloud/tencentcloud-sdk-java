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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGeneralStatResponse extends AbstractModel{

    /**
    * 云主机总数
    */
    @SerializedName("MachinesAll")
    @Expose
    private Long MachinesAll;

    /**
    * 云主机没有安装主机安全客户端的总数
    */
    @SerializedName("MachinesUninstalled")
    @Expose
    private Long MachinesUninstalled;

    /**
    * 主机安全客户端总数的总数
    */
    @SerializedName("AgentsAll")
    @Expose
    private Long AgentsAll;

    /**
    * 主机安全客户端在线的总数
    */
    @SerializedName("AgentsOnline")
    @Expose
    private Long AgentsOnline;

    /**
    * 主机安全客户端 离线+关机 的总数
    */
    @SerializedName("AgentsOffline")
    @Expose
    private Long AgentsOffline;

    /**
    * 主机安全客户端专业版的总数
    */
    @SerializedName("AgentsPro")
    @Expose
    private Long AgentsPro;

    /**
    * 主机安全客户端基础版的总数
    */
    @SerializedName("AgentsBasic")
    @Expose
    private Long AgentsBasic;

    /**
    * 7天内到期的预付费专业版总数
    */
    @SerializedName("AgentsProExpireWithInSevenDays")
    @Expose
    private Long AgentsProExpireWithInSevenDays;

    /**
    * 风险主机总数
    */
    @SerializedName("RiskMachine")
    @Expose
    private Long RiskMachine;

    /**
    * 已关机总数
    */
    @SerializedName("Shutdown")
    @Expose
    private Long Shutdown;

    /**
    * 已离线总数
    */
    @SerializedName("Offline")
    @Expose
    private Long Offline;

    /**
    * 旗舰版主机数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlagshipMachineCnt")
    @Expose
    private Long FlagshipMachineCnt;

    /**
    * 保护天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云主机总数 
     * @return MachinesAll 云主机总数
     */
    public Long getMachinesAll() {
        return this.MachinesAll;
    }

    /**
     * Set 云主机总数
     * @param MachinesAll 云主机总数
     */
    public void setMachinesAll(Long MachinesAll) {
        this.MachinesAll = MachinesAll;
    }

    /**
     * Get 云主机没有安装主机安全客户端的总数 
     * @return MachinesUninstalled 云主机没有安装主机安全客户端的总数
     */
    public Long getMachinesUninstalled() {
        return this.MachinesUninstalled;
    }

    /**
     * Set 云主机没有安装主机安全客户端的总数
     * @param MachinesUninstalled 云主机没有安装主机安全客户端的总数
     */
    public void setMachinesUninstalled(Long MachinesUninstalled) {
        this.MachinesUninstalled = MachinesUninstalled;
    }

    /**
     * Get 主机安全客户端总数的总数 
     * @return AgentsAll 主机安全客户端总数的总数
     */
    public Long getAgentsAll() {
        return this.AgentsAll;
    }

    /**
     * Set 主机安全客户端总数的总数
     * @param AgentsAll 主机安全客户端总数的总数
     */
    public void setAgentsAll(Long AgentsAll) {
        this.AgentsAll = AgentsAll;
    }

    /**
     * Get 主机安全客户端在线的总数 
     * @return AgentsOnline 主机安全客户端在线的总数
     */
    public Long getAgentsOnline() {
        return this.AgentsOnline;
    }

    /**
     * Set 主机安全客户端在线的总数
     * @param AgentsOnline 主机安全客户端在线的总数
     */
    public void setAgentsOnline(Long AgentsOnline) {
        this.AgentsOnline = AgentsOnline;
    }

    /**
     * Get 主机安全客户端 离线+关机 的总数 
     * @return AgentsOffline 主机安全客户端 离线+关机 的总数
     */
    public Long getAgentsOffline() {
        return this.AgentsOffline;
    }

    /**
     * Set 主机安全客户端 离线+关机 的总数
     * @param AgentsOffline 主机安全客户端 离线+关机 的总数
     */
    public void setAgentsOffline(Long AgentsOffline) {
        this.AgentsOffline = AgentsOffline;
    }

    /**
     * Get 主机安全客户端专业版的总数 
     * @return AgentsPro 主机安全客户端专业版的总数
     */
    public Long getAgentsPro() {
        return this.AgentsPro;
    }

    /**
     * Set 主机安全客户端专业版的总数
     * @param AgentsPro 主机安全客户端专业版的总数
     */
    public void setAgentsPro(Long AgentsPro) {
        this.AgentsPro = AgentsPro;
    }

    /**
     * Get 主机安全客户端基础版的总数 
     * @return AgentsBasic 主机安全客户端基础版的总数
     */
    public Long getAgentsBasic() {
        return this.AgentsBasic;
    }

    /**
     * Set 主机安全客户端基础版的总数
     * @param AgentsBasic 主机安全客户端基础版的总数
     */
    public void setAgentsBasic(Long AgentsBasic) {
        this.AgentsBasic = AgentsBasic;
    }

    /**
     * Get 7天内到期的预付费专业版总数 
     * @return AgentsProExpireWithInSevenDays 7天内到期的预付费专业版总数
     */
    public Long getAgentsProExpireWithInSevenDays() {
        return this.AgentsProExpireWithInSevenDays;
    }

    /**
     * Set 7天内到期的预付费专业版总数
     * @param AgentsProExpireWithInSevenDays 7天内到期的预付费专业版总数
     */
    public void setAgentsProExpireWithInSevenDays(Long AgentsProExpireWithInSevenDays) {
        this.AgentsProExpireWithInSevenDays = AgentsProExpireWithInSevenDays;
    }

    /**
     * Get 风险主机总数 
     * @return RiskMachine 风险主机总数
     */
    public Long getRiskMachine() {
        return this.RiskMachine;
    }

    /**
     * Set 风险主机总数
     * @param RiskMachine 风险主机总数
     */
    public void setRiskMachine(Long RiskMachine) {
        this.RiskMachine = RiskMachine;
    }

    /**
     * Get 已关机总数 
     * @return Shutdown 已关机总数
     */
    public Long getShutdown() {
        return this.Shutdown;
    }

    /**
     * Set 已关机总数
     * @param Shutdown 已关机总数
     */
    public void setShutdown(Long Shutdown) {
        this.Shutdown = Shutdown;
    }

    /**
     * Get 已离线总数 
     * @return Offline 已离线总数
     */
    public Long getOffline() {
        return this.Offline;
    }

    /**
     * Set 已离线总数
     * @param Offline 已离线总数
     */
    public void setOffline(Long Offline) {
        this.Offline = Offline;
    }

    /**
     * Get 旗舰版主机数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlagshipMachineCnt 旗舰版主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlagshipMachineCnt() {
        return this.FlagshipMachineCnt;
    }

    /**
     * Set 旗舰版主机数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlagshipMachineCnt 旗舰版主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlagshipMachineCnt(Long FlagshipMachineCnt) {
        this.FlagshipMachineCnt = FlagshipMachineCnt;
    }

    /**
     * Get 保护天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectDays 保护天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set 保护天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectDays 保护天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeGeneralStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralStatResponse(DescribeGeneralStatResponse source) {
        if (source.MachinesAll != null) {
            this.MachinesAll = new Long(source.MachinesAll);
        }
        if (source.MachinesUninstalled != null) {
            this.MachinesUninstalled = new Long(source.MachinesUninstalled);
        }
        if (source.AgentsAll != null) {
            this.AgentsAll = new Long(source.AgentsAll);
        }
        if (source.AgentsOnline != null) {
            this.AgentsOnline = new Long(source.AgentsOnline);
        }
        if (source.AgentsOffline != null) {
            this.AgentsOffline = new Long(source.AgentsOffline);
        }
        if (source.AgentsPro != null) {
            this.AgentsPro = new Long(source.AgentsPro);
        }
        if (source.AgentsBasic != null) {
            this.AgentsBasic = new Long(source.AgentsBasic);
        }
        if (source.AgentsProExpireWithInSevenDays != null) {
            this.AgentsProExpireWithInSevenDays = new Long(source.AgentsProExpireWithInSevenDays);
        }
        if (source.RiskMachine != null) {
            this.RiskMachine = new Long(source.RiskMachine);
        }
        if (source.Shutdown != null) {
            this.Shutdown = new Long(source.Shutdown);
        }
        if (source.Offline != null) {
            this.Offline = new Long(source.Offline);
        }
        if (source.FlagshipMachineCnt != null) {
            this.FlagshipMachineCnt = new Long(source.FlagshipMachineCnt);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachinesAll", this.MachinesAll);
        this.setParamSimple(map, prefix + "MachinesUninstalled", this.MachinesUninstalled);
        this.setParamSimple(map, prefix + "AgentsAll", this.AgentsAll);
        this.setParamSimple(map, prefix + "AgentsOnline", this.AgentsOnline);
        this.setParamSimple(map, prefix + "AgentsOffline", this.AgentsOffline);
        this.setParamSimple(map, prefix + "AgentsPro", this.AgentsPro);
        this.setParamSimple(map, prefix + "AgentsBasic", this.AgentsBasic);
        this.setParamSimple(map, prefix + "AgentsProExpireWithInSevenDays", this.AgentsProExpireWithInSevenDays);
        this.setParamSimple(map, prefix + "RiskMachine", this.RiskMachine);
        this.setParamSimple(map, prefix + "Shutdown", this.Shutdown);
        this.setParamSimple(map, prefix + "Offline", this.Offline);
        this.setParamSimple(map, prefix + "FlagshipMachineCnt", this.FlagshipMachineCnt);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

