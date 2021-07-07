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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIModelInfo extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 申请状态：1-已申请；2-已取消；3-已拒绝；4-已通过
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 可调用数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已调用数量
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * 申请时间
    */
    @SerializedName("ApplyTime")
    @Expose
    private Long ApplyTime;

    /**
    * 审批通过时间
    */
    @SerializedName("ApprovalTime")
    @Expose
    private Long ApprovalTime;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 申请状态：1-已申请；2-已取消；3-已拒绝；4-已通过 
     * @return Status 申请状态：1-已申请；2-已取消；3-已拒绝；4-已通过
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 申请状态：1-已申请；2-已取消；3-已拒绝；4-已通过
     * @param Status 申请状态：1-已申请；2-已取消；3-已拒绝；4-已通过
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 可调用数量 
     * @return Total 可调用数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 可调用数量
     * @param Total 可调用数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已调用数量 
     * @return Used 已调用数量
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已调用数量
     * @param Used 已调用数量
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get 申请时间 
     * @return ApplyTime 申请时间
     */
    public Long getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
     * @param ApplyTime 申请时间
     */
    public void setApplyTime(Long ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 审批通过时间 
     * @return ApprovalTime 审批通过时间
     */
    public Long getApprovalTime() {
        return this.ApprovalTime;
    }

    /**
     * Set 审批通过时间
     * @param ApprovalTime 审批通过时间
     */
    public void setApprovalTime(Long ApprovalTime) {
        this.ApprovalTime = ApprovalTime;
    }

    public AIModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIModelInfo(AIModelInfo source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new Long(source.ApplyTime);
        }
        if (source.ApprovalTime != null) {
            this.ApprovalTime = new Long(source.ApprovalTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ApprovalTime", this.ApprovalTime);

    }
}

