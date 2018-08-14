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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceHourResponse  extends AbstractModel{

    /**
    * 短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
    */
    @SerializedName("DealIds")
    @Expose
    private String [] DealIds;

    /**
    * 实例ID列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     * @return DealIds 短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     */
    public String [] getDealIds() {
        return this.DealIds;
    }

    /**
     * 设置短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     * @param DealIds 短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     */
    public void setDealIds(String [] DealIds) {
        this.DealIds = DealIds;
    }

    /**
     * 获取实例ID列表
     * @return InstanceIds 实例ID列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例ID列表
     * @param InstanceIds 实例ID列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealIds.", this.DealIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

