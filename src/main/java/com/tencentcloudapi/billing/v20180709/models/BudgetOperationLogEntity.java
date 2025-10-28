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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetOperationLogEntity extends AbstractModel {

    /**
    * 支付者Uin
    */
    @SerializedName("PayerUin")
    @Expose
    private Long PayerUin;

    /**
    * 使用者Uin

    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 操作用户Uin
    */
    @SerializedName("OperateUin")
    @Expose
    private Long OperateUin;

    /**
    * 日期
    */
    @SerializedName("BillDay")
    @Expose
    private Long BillDay;

    /**
    * 月份
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * 修改类型：ADD(新增)、UPDATE(更新)、DELETE(删除)
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 变更信息
    */
    @SerializedName("DiffValue")
    @Expose
    private BudgetInfoDiffEntity [] DiffValue;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 修改渠道：CONSOLE/API
    */
    @SerializedName("OperationChannel")
    @Expose
    private String OperationChannel;

    /**
    * 预算项目id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
     * Get 支付者Uin 
     * @return PayerUin 支付者Uin
     */
    public Long getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者Uin
     * @param PayerUin 支付者Uin
     */
    public void setPayerUin(Long PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 使用者Uin
 
     * @return OwnerUin 使用者Uin

     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 使用者Uin

     * @param OwnerUin 使用者Uin

     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 操作用户Uin 
     * @return OperateUin 操作用户Uin
     */
    public Long getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作用户Uin
     * @param OperateUin 操作用户Uin
     */
    public void setOperateUin(Long OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 日期 
     * @return BillDay 日期
     */
    public Long getBillDay() {
        return this.BillDay;
    }

    /**
     * Set 日期
     * @param BillDay 日期
     */
    public void setBillDay(Long BillDay) {
        this.BillDay = BillDay;
    }

    /**
     * Get 月份 
     * @return BillMonth 月份
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set 月份
     * @param BillMonth 月份
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Get 修改类型：ADD(新增)、UPDATE(更新)、DELETE(删除) 
     * @return Action 修改类型：ADD(新增)、UPDATE(更新)、DELETE(删除)
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 修改类型：ADD(新增)、UPDATE(更新)、DELETE(删除)
     * @param Action 修改类型：ADD(新增)、UPDATE(更新)、DELETE(删除)
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 变更信息 
     * @return DiffValue 变更信息
     */
    public BudgetInfoDiffEntity [] getDiffValue() {
        return this.DiffValue;
    }

    /**
     * Set 变更信息
     * @param DiffValue 变更信息
     */
    public void setDiffValue(BudgetInfoDiffEntity [] DiffValue) {
        this.DiffValue = DiffValue;
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
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 修改渠道：CONSOLE/API 
     * @return OperationChannel 修改渠道：CONSOLE/API
     */
    public String getOperationChannel() {
        return this.OperationChannel;
    }

    /**
     * Set 修改渠道：CONSOLE/API
     * @param OperationChannel 修改渠道：CONSOLE/API
     */
    public void setOperationChannel(String OperationChannel) {
        this.OperationChannel = OperationChannel;
    }

    /**
     * Get 预算项目id 
     * @return BudgetId 预算项目id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set 预算项目id
     * @param BudgetId 预算项目id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    public BudgetOperationLogEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetOperationLogEntity(BudgetOperationLogEntity source) {
        if (source.PayerUin != null) {
            this.PayerUin = new Long(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new Long(source.OperateUin);
        }
        if (source.BillDay != null) {
            this.BillDay = new Long(source.BillDay);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.DiffValue != null) {
            this.DiffValue = new BudgetInfoDiffEntity[source.DiffValue.length];
            for (int i = 0; i < source.DiffValue.length; i++) {
                this.DiffValue[i] = new BudgetInfoDiffEntity(source.DiffValue[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperationChannel != null) {
            this.OperationChannel = new String(source.OperationChannel);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "BillDay", this.BillDay);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "DiffValue.", this.DiffValue);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperationChannel", this.OperationChannel);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);

    }
}

