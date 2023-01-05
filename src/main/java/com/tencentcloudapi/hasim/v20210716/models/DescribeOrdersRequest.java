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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrdersRequest extends AbstractModel{

    /**
    * 子订单ID
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 审批状态 0全部 1通过 2驳回 3待审核
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * 翻页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 开始时间,例如2022-06-30 00:00:00
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间,例如2022-06-30 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 子订单ID 
     * @return DealName 子订单ID
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 子订单ID
     * @param DealName 子订单ID
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 审批状态 0全部 1通过 2驳回 3待审核 
     * @return AuditStatus 审批状态 0全部 1通过 2驳回 3待审核
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审批状态 0全部 1通过 2驳回 3待审核
     * @param AuditStatus 审批状态 0全部 1通过 2驳回 3待审核
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 翻页大小 
     * @return Limit 翻页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页大小
     * @param Limit 翻页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页偏移 
     * @return Offset 翻页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移
     * @param Offset 翻页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 开始时间,例如2022-06-30 00:00:00 
     * @return BeginTime 开始时间,例如2022-06-30 00:00:00
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间,例如2022-06-30 00:00:00
     * @param BeginTime 开始时间,例如2022-06-30 00:00:00
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间,例如2022-06-30 00:00:00 
     * @return EndTime 结束时间,例如2022-06-30 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间,例如2022-06-30 00:00:00
     * @param EndTime 结束时间,例如2022-06-30 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeOrdersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrdersRequest(DescribeOrdersRequest source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

