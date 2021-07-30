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

public class DescribeBalanceTransactionsRequest extends AbstractModel{

    /**
    * 账户类型：1-设备接入；2-云存。
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 分页游标开始，默认为0开始拉取第一条。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页每页数量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 流水类型：All-全部类型；Recharge-充值；CreateOrder-新购。默认为All
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 账户类型：1-设备接入；2-云存。 
     * @return AccountType 账户类型：1-设备接入；2-云存。
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型：1-设备接入；2-云存。
     * @param AccountType 账户类型：1-设备接入；2-云存。
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 分页游标开始，默认为0开始拉取第一条。 
     * @return Offset 分页游标开始，默认为0开始拉取第一条。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页游标开始，默认为0开始拉取第一条。
     * @param Offset 分页游标开始，默认为0开始拉取第一条。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页每页数量。 
     * @return Limit 分页每页数量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数量。
     * @param Limit 分页每页数量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 流水类型：All-全部类型；Recharge-充值；CreateOrder-新购。默认为All 
     * @return Operation 流水类型：All-全部类型；Recharge-充值；CreateOrder-新购。默认为All
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 流水类型：All-全部类型；Recharge-充值；CreateOrder-新购。默认为All
     * @param Operation 流水类型：All-全部类型；Recharge-充值；CreateOrder-新购。默认为All
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public DescribeBalanceTransactionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBalanceTransactionsRequest(DescribeBalanceTransactionsRequest source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

