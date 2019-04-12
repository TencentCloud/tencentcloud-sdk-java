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

public class ScaleOutInstanceResult  extends AbstractModel{

    /**
    * 客户端调用时传入的TOKEN
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 扩容实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 订单名称
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * 获取客户端调用时传入的TOKEN
     * @return ClientToken 客户端调用时传入的TOKEN
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * 设置客户端调用时传入的TOKEN
     * @param ClientToken 客户端调用时传入的TOKEN
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * 获取扩容实例ID
     * @return InstanceId 扩容实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置扩容实例ID
     * @param InstanceId 扩容实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取订单名称
     * @return DealNames 订单名称
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * 设置订单名称
     * @param DealNames 订单名称
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

