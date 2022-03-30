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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherUsageDetailsRequest extends AbstractModel{

    /**
    * 一页多少条数据，默认是20条，最大不超过1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 第多少页，默认是1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 代金券id
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * 操作人，默认就是用户uin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 一页多少条数据，默认是20条，最大不超过1000 
     * @return Limit 一页多少条数据，默认是20条，最大不超过1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页多少条数据，默认是20条，最大不超过1000
     * @param Limit 一页多少条数据，默认是20条，最大不超过1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 第多少页，默认是1 
     * @return Offset 第多少页，默认是1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 第多少页，默认是1
     * @param Offset 第多少页，默认是1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 代金券id 
     * @return VoucherId 代金券id
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set 代金券id
     * @param VoucherId 代金券id
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get 操作人，默认就是用户uin 
     * @return Operator 操作人，默认就是用户uin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人，默认就是用户uin
     * @param Operator 操作人，默认就是用户uin
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeVoucherUsageDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherUsageDetailsRequest(DescribeVoucherUsageDetailsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

