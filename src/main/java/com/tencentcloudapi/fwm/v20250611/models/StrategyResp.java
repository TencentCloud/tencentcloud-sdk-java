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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrategyResp extends AbstractModel {

    /**
    * 策略Id
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 规则组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 规则数
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 策略状态
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * 下发账号
    */
    @SerializedName("ReceiveAccount")
    @Expose
    private ReceiveAccount [] ReceiveAccount;

    /**
    * 优先级
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * 下发失败原因
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 下发失败原因类型
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建人
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 更新人
    */
    @SerializedName("UpdateBy")
    @Expose
    private String UpdateBy;

    /**
    * 执行区域
    */
    @SerializedName("ExecArea")
    @Expose
    private String ExecArea;

    /**
    * 创建人名称
    */
    @SerializedName("CreateName")
    @Expose
    private String CreateName;

    /**
    * 更新人名称
    */
    @SerializedName("UpdateName")
    @Expose
    private String UpdateName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 策略Id 
     * @return StrategyId 策略Id
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略Id
     * @param StrategyId 策略Id
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 规则组Id 
     * @return GroupId 规则组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组Id
     * @param GroupId 规则组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 规则组名称 
     * @return GroupName 规则组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 规则组名称
     * @param GroupName 规则组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 规则数 
     * @return RuleCount 规则数
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 规则数
     * @param RuleCount 规则数
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 策略状态 
     * @return RuleStatus 策略状态
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 策略状态
     * @param RuleStatus 策略状态
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 下发账号 
     * @return ReceiveAccount 下发账号
     */
    public ReceiveAccount [] getReceiveAccount() {
        return this.ReceiveAccount;
    }

    /**
     * Set 下发账号
     * @param ReceiveAccount 下发账号
     */
    public void setReceiveAccount(ReceiveAccount [] ReceiveAccount) {
        this.ReceiveAccount = ReceiveAccount;
    }

    /**
     * Get 优先级 
     * @return Sequence 优先级
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 优先级
     * @param Sequence 优先级
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 下发失败原因 
     * @return ErrMsg 下发失败原因
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 下发失败原因
     * @param ErrMsg 下发失败原因
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 下发失败原因类型 
     * @return ErrorType 下发失败原因类型
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set 下发失败原因类型
     * @param ErrorType 下发失败原因类型
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建人 
     * @return CreateBy 创建人
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 创建人
     * @param CreateBy 创建人
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 更新人 
     * @return UpdateBy 更新人
     */
    public String getUpdateBy() {
        return this.UpdateBy;
    }

    /**
     * Set 更新人
     * @param UpdateBy 更新人
     */
    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    /**
     * Get 执行区域 
     * @return ExecArea 执行区域
     */
    public String getExecArea() {
        return this.ExecArea;
    }

    /**
     * Set 执行区域
     * @param ExecArea 执行区域
     */
    public void setExecArea(String ExecArea) {
        this.ExecArea = ExecArea;
    }

    /**
     * Get 创建人名称 
     * @return CreateName 创建人名称
     */
    public String getCreateName() {
        return this.CreateName;
    }

    /**
     * Set 创建人名称
     * @param CreateName 创建人名称
     */
    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    /**
     * Get 更新人名称 
     * @return UpdateName 更新人名称
     */
    public String getUpdateName() {
        return this.UpdateName;
    }

    /**
     * Set 更新人名称
     * @param UpdateName 更新人名称
     */
    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
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

    public StrategyResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyResp(StrategyResp source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.ReceiveAccount != null) {
            this.ReceiveAccount = new ReceiveAccount[source.ReceiveAccount.length];
            for (int i = 0; i < source.ReceiveAccount.length; i++) {
                this.ReceiveAccount[i] = new ReceiveAccount(source.ReceiveAccount[i]);
            }
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ErrorType != null) {
            this.ErrorType = new String(source.ErrorType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.UpdateBy != null) {
            this.UpdateBy = new String(source.UpdateBy);
        }
        if (source.ExecArea != null) {
            this.ExecArea = new String(source.ExecArea);
        }
        if (source.CreateName != null) {
            this.CreateName = new String(source.CreateName);
        }
        if (source.UpdateName != null) {
            this.UpdateName = new String(source.UpdateName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "ReceiveAccount.", this.ReceiveAccount);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "UpdateBy", this.UpdateBy);
        this.setParamSimple(map, prefix + "ExecArea", this.ExecArea);
        this.setParamSimple(map, prefix + "CreateName", this.CreateName);
        this.setParamSimple(map, prefix + "UpdateName", this.UpdateName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

