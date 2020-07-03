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

public class BashEvent extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云镜ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机内网IP
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * 执行用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 平台类型
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 执行命令
    */
    @SerializedName("BashCmd")
    @Expose
    private String BashCmd;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则等级
    */
    @SerializedName("RuleLevel")
    @Expose
    private Long RuleLevel;

    /**
    * 处理状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发生时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 主机名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云镜ID 
     * @return Uuid 云镜ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜ID
     * @param Uuid 云镜ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机ID 
     * @return Quuid 主机ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机ID
     * @param Quuid 主机ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机内网IP 
     * @return Hostip 主机内网IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set 主机内网IP
     * @param Hostip 主机内网IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Get 执行用户名 
     * @return User 执行用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 执行用户名
     * @param User 执行用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 平台类型 
     * @return Platform 平台类型
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台类型
     * @param Platform 平台类型
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 执行命令 
     * @return BashCmd 执行命令
     */
    public String getBashCmd() {
        return this.BashCmd;
    }

    /**
     * Set 执行命令
     * @param BashCmd 执行命令
     */
    public void setBashCmd(String BashCmd) {
        this.BashCmd = BashCmd;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则等级 
     * @return RuleLevel 规则等级
     */
    public Long getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set 规则等级
     * @param RuleLevel 规则等级
     */
    public void setRuleLevel(Long RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get 处理状态 
     * @return Status 处理状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
     * @param Status 处理状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 发生时间 
     * @return CreateTime 发生时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发生时间
     * @param CreateTime 发生时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "BashCmd", this.BashCmd);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);

    }
}

