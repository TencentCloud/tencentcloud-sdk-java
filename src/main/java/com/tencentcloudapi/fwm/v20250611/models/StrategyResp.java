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
    * <p>策略Id</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * <p>规则组Id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>产品类型</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>规则组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>规则数</p>
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * <p>策略状态</p>
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * <p>下发账号</p>
    */
    @SerializedName("ReceiveAccount")
    @Expose
    private ReceiveAccount [] ReceiveAccount;

    /**
    * <p>优先级</p>
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * <p>下发失败原因</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>下发失败原因类型</p>
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建人</p>
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * <p>更新人</p>
    */
    @SerializedName("UpdateBy")
    @Expose
    private String UpdateBy;

    /**
    * <p>执行区域</p>
    */
    @SerializedName("ExecArea")
    @Expose
    private String ExecArea;

    /**
    * <p>创建人名称</p>
    */
    @SerializedName("CreateName")
    @Expose
    private String CreateName;

    /**
    * <p>更新人名称</p>
    */
    @SerializedName("UpdateName")
    @Expose
    private String UpdateName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>策略Id</p> 
     * @return StrategyId <p>策略Id</p>
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>策略Id</p>
     * @param StrategyId <p>策略Id</p>
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get <p>规则组Id</p> 
     * @return GroupId <p>规则组Id</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>规则组Id</p>
     * @param GroupId <p>规则组Id</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>产品类型</p> 
     * @return Product <p>产品类型</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品类型</p>
     * @param Product <p>产品类型</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>规则组名称</p> 
     * @return GroupName <p>规则组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>规则组名称</p>
     * @param GroupName <p>规则组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>规则数</p> 
     * @return RuleCount <p>规则数</p>
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set <p>规则数</p>
     * @param RuleCount <p>规则数</p>
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get <p>策略状态</p> 
     * @return RuleStatus <p>策略状态</p>
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set <p>策略状态</p>
     * @param RuleStatus <p>策略状态</p>
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get <p>下发账号</p> 
     * @return ReceiveAccount <p>下发账号</p>
     */
    public ReceiveAccount [] getReceiveAccount() {
        return this.ReceiveAccount;
    }

    /**
     * Set <p>下发账号</p>
     * @param ReceiveAccount <p>下发账号</p>
     */
    public void setReceiveAccount(ReceiveAccount [] ReceiveAccount) {
        this.ReceiveAccount = ReceiveAccount;
    }

    /**
     * Get <p>优先级</p> 
     * @return Sequence <p>优先级</p>
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set <p>优先级</p>
     * @param Sequence <p>优先级</p>
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get <p>下发失败原因</p> 
     * @return ErrMsg <p>下发失败原因</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>下发失败原因</p>
     * @param ErrMsg <p>下发失败原因</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>下发失败原因类型</p> 
     * @return ErrorType <p>下发失败原因类型</p>
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set <p>下发失败原因类型</p>
     * @param ErrorType <p>下发失败原因类型</p>
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建人</p> 
     * @return CreateBy <p>创建人</p>
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set <p>创建人</p>
     * @param CreateBy <p>创建人</p>
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get <p>更新人</p> 
     * @return UpdateBy <p>更新人</p>
     */
    public String getUpdateBy() {
        return this.UpdateBy;
    }

    /**
     * Set <p>更新人</p>
     * @param UpdateBy <p>更新人</p>
     */
    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    /**
     * Get <p>执行区域</p> 
     * @return ExecArea <p>执行区域</p>
     */
    public String getExecArea() {
        return this.ExecArea;
    }

    /**
     * Set <p>执行区域</p>
     * @param ExecArea <p>执行区域</p>
     */
    public void setExecArea(String ExecArea) {
        this.ExecArea = ExecArea;
    }

    /**
     * Get <p>创建人名称</p> 
     * @return CreateName <p>创建人名称</p>
     */
    public String getCreateName() {
        return this.CreateName;
    }

    /**
     * Set <p>创建人名称</p>
     * @param CreateName <p>创建人名称</p>
     */
    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    /**
     * Get <p>更新人名称</p> 
     * @return UpdateName <p>更新人名称</p>
     */
    public String getUpdateName() {
        return this.UpdateName;
    }

    /**
     * Set <p>更新人名称</p>
     * @param UpdateName <p>更新人名称</p>
     */
    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
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
        if (source.Product != null) {
            this.Product = new String(source.Product);
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
        this.setParamSimple(map, prefix + "Product", this.Product);
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

