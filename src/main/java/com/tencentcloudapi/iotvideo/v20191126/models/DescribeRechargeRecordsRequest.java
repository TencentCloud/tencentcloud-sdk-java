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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRechargeRecordsRequest extends AbstractModel{

    /**
    * 账户类型 1:设备接入 2:云存。
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 从第几条记录开始显示, 默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 总共查询多少条记录，默认为值50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 账户类型 1:设备接入 2:云存。 
     * @return AccountType 账户类型 1:设备接入 2:云存。
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型 1:设备接入 2:云存。
     * @param AccountType 账户类型 1:设备接入 2:云存。
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 从第几条记录开始显示, 默认值为0。 
     * @return Offset 从第几条记录开始显示, 默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 从第几条记录开始显示, 默认值为0。
     * @param Offset 从第几条记录开始显示, 默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 总共查询多少条记录，默认为值50。 
     * @return Limit 总共查询多少条记录，默认为值50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 总共查询多少条记录，默认为值50。
     * @param Limit 总共查询多少条记录，默认为值50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRechargeRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRechargeRecordsRequest(DescribeRechargeRecordsRequest source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

