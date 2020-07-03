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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPayDealsRequest extends AbstractModel{

    /**
    * 订单所有者uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 代付标志，1：代付；0：自付
    */
    @SerializedName("AgentPay")
    @Expose
    private Long AgentPay;

    /**
    * 订单号数组
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * Get 订单所有者uin 
     * @return OwnerUin 订单所有者uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 订单所有者uin
     * @param OwnerUin 订单所有者uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 代付标志，1：代付；0：自付 
     * @return AgentPay 代付标志，1：代付；0：自付
     */
    public Long getAgentPay() {
        return this.AgentPay;
    }

    /**
     * Set 代付标志，1：代付；0：自付
     * @param AgentPay 代付标志，1：代付；0：自付
     */
    public void setAgentPay(Long AgentPay) {
        this.AgentPay = AgentPay;
    }

    /**
     * Get 订单号数组 
     * @return DealNames 订单号数组
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单号数组
     * @param DealNames 订单号数组
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AgentPay", this.AgentPay);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

