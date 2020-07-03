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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCSelfDefinePolicyResponse extends AbstractModel{

    /**
    * 自定义规则总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 策略列表
    */
    @SerializedName("Policys")
    @Expose
    private CCPolicy [] Policys;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义规则总数 
     * @return Total 自定义规则总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 自定义规则总数
     * @param Total 自定义规则总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 策略列表 
     * @return Policys 策略列表
     */
    public CCPolicy [] getPolicys() {
        return this.Policys;
    }

    /**
     * Set 策略列表
     * @param Policys 策略列表
     */
    public void setPolicys(CCPolicy [] Policys) {
        this.Policys = Policys;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Policys.", this.Policys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

