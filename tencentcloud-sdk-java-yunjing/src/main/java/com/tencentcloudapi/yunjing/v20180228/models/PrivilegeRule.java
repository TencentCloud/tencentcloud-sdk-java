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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivilegeRule extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 是否S权限
    */
    @SerializedName("SMode")
    @Expose
    private Long SMode;

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
    * 状态(0: 有效 1: 无效)
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
    * 主机IP
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

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
     * @return Uuid 客户端ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端ID
     * @param Uuid 客户端ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 进程名 
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 是否S权限 
     * @return SMode 是否S权限
     */
    public Long getSMode() {
        return this.SMode;
    }

    /**
     * Set 是否S权限
     * @param SMode 是否S权限
     */
    public void setSMode(Long SMode) {
        this.SMode = SMode;
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
     * Get 状态(0: 有效 1: 无效) 
     * @return Status 状态(0: 有效 1: 无效)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态(0: 有效 1: 无效)
     * @param Status 状态(0: 有效 1: 无效)
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
     * Get 主机IP 
     * @return Hostip 主机IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set 主机IP
     * @param Hostip 主机IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "SMode", this.SMode);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);

    }
}

