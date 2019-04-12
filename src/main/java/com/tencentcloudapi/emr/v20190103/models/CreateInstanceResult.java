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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceResult  extends AbstractModel{

    /**
    * 客户端TOKEN
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 集群名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 订单列表
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * 获取客户端TOKEN
     * @return ClientToken 客户端TOKEN
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * 设置客户端TOKEN
     * @param ClientToken 客户端TOKEN
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * 获取集群名称
     * @return InstanceName 集群名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置集群名称
     * @param InstanceName 集群名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取订单列表
     * @return DealNames 订单列表
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * 设置订单列表
     * @param DealNames 订单列表
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

