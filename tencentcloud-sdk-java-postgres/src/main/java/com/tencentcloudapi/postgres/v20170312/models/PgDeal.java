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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PgDeal extends AbstractModel{

    /**
    * 订单名
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 所属用户
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 订单涉及多少个实例
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 付费模式。1-预付费；0-后付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 异步任务流程ID
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 实例ID数组
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
     * Get 订单名 
     * @return DealName 订单名
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单名
     * @param DealName 订单名
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 所属用户 
     * @return OwnerUin 所属用户
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属用户
     * @param OwnerUin 所属用户
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 订单涉及多少个实例 
     * @return Count 订单涉及多少个实例
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 订单涉及多少个实例
     * @param Count 订单涉及多少个实例
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 付费模式。1-预付费；0-后付费 
     * @return PayMode 付费模式。1-预付费；0-后付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式。1-预付费；0-后付费
     * @param PayMode 付费模式。1-预付费；0-后付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 异步任务流程ID 
     * @return FlowId 异步任务流程ID
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 异步任务流程ID
     * @param FlowId 异步任务流程ID
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 实例ID数组 
     * @return DBInstanceIdSet 实例ID数组
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set 实例ID数组
     * @param DBInstanceIdSet 实例ID数组
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);

    }
}

