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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainBatchDetailSet extends AbstractModel {

    /**
    * 详情ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 类型  
new：注册域名
renew：续费域名
batch_transfer_prohibition_on：开启禁止转移锁
batch_transfer_prohibition_off：关闭禁止转移锁
batch_update_prohibition_on：开启禁止更新锁
batch_update_prohibition_off：关闭禁止更新锁
batch_modify_owner：域名转移
batch_modify_domain_info：域名信息修改
batch_transfer_in：域名转入
batch_cancel_transfer_out：域名取消转出
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 执行状态：
doing 执行中。
failed 操作失败。
success  操作成功。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因，如果状态成功(Status:success),则该字段为空
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 订单号
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
     * Get 详情ID 
     * @return Id 详情ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 详情ID
     * @param Id 详情ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 类型  
new：注册域名
renew：续费域名
batch_transfer_prohibition_on：开启禁止转移锁
batch_transfer_prohibition_off：关闭禁止转移锁
batch_update_prohibition_on：开启禁止更新锁
batch_update_prohibition_off：关闭禁止更新锁
batch_modify_owner：域名转移
batch_modify_domain_info：域名信息修改
batch_transfer_in：域名转入
batch_cancel_transfer_out：域名取消转出 
     * @return Action 类型  
new：注册域名
renew：续费域名
batch_transfer_prohibition_on：开启禁止转移锁
batch_transfer_prohibition_off：关闭禁止转移锁
batch_update_prohibition_on：开启禁止更新锁
batch_update_prohibition_off：关闭禁止更新锁
batch_modify_owner：域名转移
batch_modify_domain_info：域名信息修改
batch_transfer_in：域名转入
batch_cancel_transfer_out：域名取消转出
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 类型  
new：注册域名
renew：续费域名
batch_transfer_prohibition_on：开启禁止转移锁
batch_transfer_prohibition_off：关闭禁止转移锁
batch_update_prohibition_on：开启禁止更新锁
batch_update_prohibition_off：关闭禁止更新锁
batch_modify_owner：域名转移
batch_modify_domain_info：域名信息修改
batch_transfer_in：域名转入
batch_cancel_transfer_out：域名取消转出
     * @param Action 类型  
new：注册域名
renew：续费域名
batch_transfer_prohibition_on：开启禁止转移锁
batch_transfer_prohibition_off：关闭禁止转移锁
batch_update_prohibition_on：开启禁止更新锁
batch_update_prohibition_off：关闭禁止更新锁
batch_modify_owner：域名转移
batch_modify_domain_info：域名信息修改
batch_transfer_in：域名转入
batch_cancel_transfer_out：域名取消转出
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 执行状态：
doing 执行中。
failed 操作失败。
success  操作成功。 
     * @return Status 执行状态：
doing 执行中。
failed 操作失败。
success  操作成功。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态：
doing 执行中。
failed 操作失败。
success  操作成功。
     * @param Status 执行状态：
doing 执行中。
failed 操作失败。
success  操作成功。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因，如果状态成功(Status:success),则该字段为空 
     * @return Reason 失败原因，如果状态成功(Status:success),则该字段为空
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因，如果状态成功(Status:success),则该字段为空
     * @param Reason 失败原因，如果状态成功(Status:success),则该字段为空
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 订单号 
     * @return BigDealId 订单号
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 订单号
     * @param BigDealId 订单号
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    public DomainBatchDetailSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainBatchDetailSet(DomainBatchDetailSet source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);

    }
}

