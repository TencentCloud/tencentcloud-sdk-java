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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstancesResponse extends AbstractModel{

    /**
    * 订单名称
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 订单名称数组
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 订单名称 
     * @return DealName 订单名称
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单名称
     * @param DealName 订单名称
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 订单名称数组 
     * @return DealNames 订单名称数组
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单名称数组
     * @param DealNames 订单名称数组
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
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
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

