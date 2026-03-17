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

public class ReverseShellRuleAggregation extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID
    */
    @SerializedName("UuidHostips")
    @Expose
    private UuidHostip [] UuidHostips;

    /**
    * 进程名称
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 目标IP
    */
    @SerializedName("DestIp")
    @Expose
    private String DestIp;

    /**
    * 目标端口
    */
    @SerializedName("DestPort")
    @Expose
    private String DestPort;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 是否全局规则
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 状态 (0: 有效 1: 无效)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 加白方式， 0:常规加白 1:正则加白
    */
    @SerializedName("WhiteType")
    @Expose
    private Long WhiteType;

    /**
    * 正则表达式
    */
    @SerializedName("RuleRegexp")
    @Expose
    private String RuleRegexp;

    /**
    * 处理历史事件， 0:不处理 1:处理
    */
    @SerializedName("HandleHistory")
    @Expose
    private Long HandleHistory;

    /**
    * 批次id
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * 应用资产，描述服务器数量，全局时候为：全部服务器
    */
    @SerializedName("MachinesNums")
    @Expose
    private String MachinesNums;

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID 
     * @return UuidHostips 客户端ID
     */
    public UuidHostip [] getUuidHostips() {
        return this.UuidHostips;
    }

    /**
     * Set 客户端ID
     * @param UuidHostips 客户端ID
     */
    public void setUuidHostips(UuidHostip [] UuidHostips) {
        this.UuidHostips = UuidHostips;
    }

    /**
     * Get 进程名称 
     * @return ProcessName 进程名称
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
     * @param ProcessName 进程名称
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 目标IP 
     * @return DestIp 目标IP
     */
    public String getDestIp() {
        return this.DestIp;
    }

    /**
     * Set 目标IP
     * @param DestIp 目标IP
     */
    public void setDestIp(String DestIp) {
        this.DestIp = DestIp;
    }

    /**
     * Get 目标端口 
     * @return DestPort 目标端口
     */
    public String getDestPort() {
        return this.DestPort;
    }

    /**
     * Set 目标端口
     * @param DestPort 目标端口
     */
    public void setDestPort(String DestPort) {
        this.DestPort = DestPort;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否全局规则 
     * @return IsGlobal 是否全局规则
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则
     * @param IsGlobal 是否全局规则
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 状态 (0: 有效 1: 无效) 
     * @return Status 状态 (0: 有效 1: 无效)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 (0: 有效 1: 无效)
     * @param Status 状态 (0: 有效 1: 无效)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 加白方式， 0:常规加白 1:正则加白 
     * @return WhiteType 加白方式， 0:常规加白 1:正则加白
     */
    public Long getWhiteType() {
        return this.WhiteType;
    }

    /**
     * Set 加白方式， 0:常规加白 1:正则加白
     * @param WhiteType 加白方式， 0:常规加白 1:正则加白
     */
    public void setWhiteType(Long WhiteType) {
        this.WhiteType = WhiteType;
    }

    /**
     * Get 正则表达式 
     * @return RuleRegexp 正则表达式
     */
    public String getRuleRegexp() {
        return this.RuleRegexp;
    }

    /**
     * Set 正则表达式
     * @param RuleRegexp 正则表达式
     */
    public void setRuleRegexp(String RuleRegexp) {
        this.RuleRegexp = RuleRegexp;
    }

    /**
     * Get 处理历史事件， 0:不处理 1:处理 
     * @return HandleHistory 处理历史事件， 0:不处理 1:处理
     */
    public Long getHandleHistory() {
        return this.HandleHistory;
    }

    /**
     * Set 处理历史事件， 0:不处理 1:处理
     * @param HandleHistory 处理历史事件， 0:不处理 1:处理
     */
    public void setHandleHistory(Long HandleHistory) {
        this.HandleHistory = HandleHistory;
    }

    /**
     * Get 批次id 
     * @return GroupID 批次id
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set 批次id
     * @param GroupID 批次id
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get 应用资产，描述服务器数量，全局时候为：全部服务器 
     * @return MachinesNums 应用资产，描述服务器数量，全局时候为：全部服务器
     */
    public String getMachinesNums() {
        return this.MachinesNums;
    }

    /**
     * Set 应用资产，描述服务器数量，全局时候为：全部服务器
     * @param MachinesNums 应用资产，描述服务器数量，全局时候为：全部服务器
     */
    public void setMachinesNums(String MachinesNums) {
        this.MachinesNums = MachinesNums;
    }

    public ReverseShellRuleAggregation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellRuleAggregation(ReverseShellRuleAggregation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UuidHostips != null) {
            this.UuidHostips = new UuidHostip[source.UuidHostips.length];
            for (int i = 0; i < source.UuidHostips.length; i++) {
                this.UuidHostips[i] = new UuidHostip(source.UuidHostips[i]);
            }
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.DestIp != null) {
            this.DestIp = new String(source.DestIp);
        }
        if (source.DestPort != null) {
            this.DestPort = new String(source.DestPort);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.WhiteType != null) {
            this.WhiteType = new Long(source.WhiteType);
        }
        if (source.RuleRegexp != null) {
            this.RuleRegexp = new String(source.RuleRegexp);
        }
        if (source.HandleHistory != null) {
            this.HandleHistory = new Long(source.HandleHistory);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.MachinesNums != null) {
            this.MachinesNums = new String(source.MachinesNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UuidHostips.", this.UuidHostips);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "DestIp", this.DestIp);
        this.setParamSimple(map, prefix + "DestPort", this.DestPort);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);
        this.setParamSimple(map, prefix + "RuleRegexp", this.RuleRegexp);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "MachinesNums", this.MachinesNums);

    }
}

