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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StarRocksQueryInfo extends AbstractModel {

    /**
    * 提交IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * CPU总时间(ns)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPUCost")
    @Expose
    private Long CPUCost;

    /**
    * 默认DB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDB")
    @Expose
    private String DefaultDB;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 执行IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionIP")
    @Expose
    private String ExecutionIP;

    /**
    * 查询ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryID")
    @Expose
    private String QueryID;

    /**
    * 查询类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 消耗总内存(bytes)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemCost")
    @Expose
    private Long MemCost;

    /**
    * plan阶段CPU占用(ns)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanCpuCosts")
    @Expose
    private Long PlanCpuCosts;

    /**
    * plan阶段内存占用(bytes)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanMemCosts")
    @Expose
    private Long PlanMemCosts;

    /**
    * 执行时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
    * 资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 获取行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnRows")
    @Expose
    private Long ReturnRows;

    /**
    * 扫描数据量(bytes)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanBytes")
    @Expose
    private Long ScanBytes;

    /**
    * 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRows")
    @Expose
    private Long ScanRows;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * 执行语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStatement")
    @Expose
    private String ExecutionStatement;

    /**
    * 用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 提交IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIP 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIP 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get CPU总时间(ns)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPUCost CPU总时间(ns)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCPUCost() {
        return this.CPUCost;
    }

    /**
     * Set CPU总时间(ns)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPUCost CPU总时间(ns)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPUCost(Long CPUCost) {
        this.CPUCost = CPUCost;
    }

    /**
     * Get 默认DB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDB 默认DB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultDB() {
        return this.DefaultDB;
    }

    /**
     * Set 默认DB
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDB 默认DB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDB(String DefaultDB) {
        this.DefaultDB = DefaultDB;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 执行IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionIP 执行IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionIP() {
        return this.ExecutionIP;
    }

    /**
     * Set 执行IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionIP 执行IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionIP(String ExecutionIP) {
        this.ExecutionIP = ExecutionIP;
    }

    /**
     * Get 查询ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryID 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryID() {
        return this.QueryID;
    }

    /**
     * Set 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryID 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryID(String QueryID) {
        this.QueryID = QueryID;
    }

    /**
     * Get 查询类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryType 查询类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryType 查询类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 消耗总内存(bytes)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemCost 消耗总内存(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemCost() {
        return this.MemCost;
    }

    /**
     * Set 消耗总内存(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemCost 消耗总内存(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemCost(Long MemCost) {
        this.MemCost = MemCost;
    }

    /**
     * Get plan阶段CPU占用(ns)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanCpuCosts plan阶段CPU占用(ns)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlanCpuCosts() {
        return this.PlanCpuCosts;
    }

    /**
     * Set plan阶段CPU占用(ns)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanCpuCosts plan阶段CPU占用(ns)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanCpuCosts(Long PlanCpuCosts) {
        this.PlanCpuCosts = PlanCpuCosts;
    }

    /**
     * Get plan阶段内存占用(bytes)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanMemCosts plan阶段内存占用(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlanMemCosts() {
        return this.PlanMemCosts;
    }

    /**
     * Set plan阶段内存占用(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanMemCosts plan阶段内存占用(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanMemCosts(Long PlanMemCosts) {
        this.PlanMemCosts = PlanMemCosts;
    }

    /**
     * Get 执行时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryTime 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryTime 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryTime(Long QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 获取行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnRows 获取行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReturnRows() {
        return this.ReturnRows;
    }

    /**
     * Set 获取行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnRows 获取行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnRows(Long ReturnRows) {
        this.ReturnRows = ReturnRows;
    }

    /**
     * Get 扫描数据量(bytes)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanBytes 扫描数据量(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanBytes() {
        return this.ScanBytes;
    }

    /**
     * Set 扫描数据量(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanBytes 扫描数据量(bytes)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanBytes(Long ScanBytes) {
        this.ScanBytes = ScanBytes;
    }

    /**
     * Get 扫描行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRows 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanRows() {
        return this.ScanRows;
    }

    /**
     * Set 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRows 扫描行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRows(Long ScanRows) {
        this.ScanRows = ScanRows;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get 执行语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStatement 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStatement() {
        return this.ExecutionStatement;
    }

    /**
     * Set 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStatement 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStatement(String ExecutionStatement) {
        this.ExecutionStatement = ExecutionStatement;
    }

    /**
     * Get 用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    public StarRocksQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StarRocksQueryInfo(StarRocksQueryInfo source) {
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.CPUCost != null) {
            this.CPUCost = new Long(source.CPUCost);
        }
        if (source.DefaultDB != null) {
            this.DefaultDB = new String(source.DefaultDB);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ExecutionIP != null) {
            this.ExecutionIP = new String(source.ExecutionIP);
        }
        if (source.QueryID != null) {
            this.QueryID = new String(source.QueryID);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.MemCost != null) {
            this.MemCost = new Long(source.MemCost);
        }
        if (source.PlanCpuCosts != null) {
            this.PlanCpuCosts = new Long(source.PlanCpuCosts);
        }
        if (source.PlanMemCosts != null) {
            this.PlanMemCosts = new Long(source.PlanMemCosts);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Long(source.QueryTime);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ReturnRows != null) {
            this.ReturnRows = new Long(source.ReturnRows);
        }
        if (source.ScanBytes != null) {
            this.ScanBytes = new Long(source.ScanBytes);
        }
        if (source.ScanRows != null) {
            this.ScanRows = new Long(source.ScanRows);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ExecutionStatement != null) {
            this.ExecutionStatement = new String(source.ExecutionStatement);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "CPUCost", this.CPUCost);
        this.setParamSimple(map, prefix + "DefaultDB", this.DefaultDB);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionIP", this.ExecutionIP);
        this.setParamSimple(map, prefix + "QueryID", this.QueryID);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "MemCost", this.MemCost);
        this.setParamSimple(map, prefix + "PlanCpuCosts", this.PlanCpuCosts);
        this.setParamSimple(map, prefix + "PlanMemCosts", this.PlanMemCosts);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ReturnRows", this.ReturnRows);
        this.setParamSimple(map, prefix + "ScanBytes", this.ScanBytes);
        this.setParamSimple(map, prefix + "ScanRows", this.ScanRows);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecutionStatement", this.ExecutionStatement);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

