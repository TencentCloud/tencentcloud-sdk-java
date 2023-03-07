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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditAllocationHistoryData extends AbstractModel{

    /**
    * 分配时间
    */
    @SerializedName("AllocatedTime")
    @Expose
    private String AllocatedTime;

    /**
    * 操作员
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 分配的信用值
    */
    @SerializedName("Credit")
    @Expose
    private Float Credit;

    /**
    * 分配的总金额
    */
    @SerializedName("AllocatedCredit")
    @Expose
    private Float AllocatedCredit;

    /**
     * Get 分配时间 
     * @return AllocatedTime 分配时间
     */
    public String getAllocatedTime() {
        return this.AllocatedTime;
    }

    /**
     * Set 分配时间
     * @param AllocatedTime 分配时间
     */
    public void setAllocatedTime(String AllocatedTime) {
        this.AllocatedTime = AllocatedTime;
    }

    /**
     * Get 操作员 
     * @return Operator 操作员
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作员
     * @param Operator 操作员
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 分配的信用值 
     * @return Credit 分配的信用值
     */
    public Float getCredit() {
        return this.Credit;
    }

    /**
     * Set 分配的信用值
     * @param Credit 分配的信用值
     */
    public void setCredit(Float Credit) {
        this.Credit = Credit;
    }

    /**
     * Get 分配的总金额 
     * @return AllocatedCredit 分配的总金额
     */
    public Float getAllocatedCredit() {
        return this.AllocatedCredit;
    }

    /**
     * Set 分配的总金额
     * @param AllocatedCredit 分配的总金额
     */
    public void setAllocatedCredit(Float AllocatedCredit) {
        this.AllocatedCredit = AllocatedCredit;
    }

    public QueryCreditAllocationHistoryData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditAllocationHistoryData(QueryCreditAllocationHistoryData source) {
        if (source.AllocatedTime != null) {
            this.AllocatedTime = new String(source.AllocatedTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Credit != null) {
            this.Credit = new Float(source.Credit);
        }
        if (source.AllocatedCredit != null) {
            this.AllocatedCredit = new Float(source.AllocatedCredit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedTime", this.AllocatedTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Credit", this.Credit);
        this.setParamSimple(map, prefix + "AllocatedCredit", this.AllocatedCredit);

    }
}

