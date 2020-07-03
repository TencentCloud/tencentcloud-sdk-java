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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfoMember extends AbstractModel{

    /**
    * coordinator 为消费分组中的消费者生成的唯一 ID
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 客户消费者 SDK 自己设置的 client.id 信息
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 一般存储客户的 IP 地址
    */
    @SerializedName("ClientHost")
    @Expose
    private String ClientHost;

    /**
    * 存储着分配给该消费者的 partition 信息
    */
    @SerializedName("Assignment")
    @Expose
    private Assignment Assignment;

    /**
     * Get coordinator 为消费分组中的消费者生成的唯一 ID 
     * @return MemberId coordinator 为消费分组中的消费者生成的唯一 ID
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set coordinator 为消费分组中的消费者生成的唯一 ID
     * @param MemberId coordinator 为消费分组中的消费者生成的唯一 ID
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 客户消费者 SDK 自己设置的 client.id 信息 
     * @return ClientId 客户消费者 SDK 自己设置的 client.id 信息
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户消费者 SDK 自己设置的 client.id 信息
     * @param ClientId 客户消费者 SDK 自己设置的 client.id 信息
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 一般存储客户的 IP 地址 
     * @return ClientHost 一般存储客户的 IP 地址
     */
    public String getClientHost() {
        return this.ClientHost;
    }

    /**
     * Set 一般存储客户的 IP 地址
     * @param ClientHost 一般存储客户的 IP 地址
     */
    public void setClientHost(String ClientHost) {
        this.ClientHost = ClientHost;
    }

    /**
     * Get 存储着分配给该消费者的 partition 信息 
     * @return Assignment 存储着分配给该消费者的 partition 信息
     */
    public Assignment getAssignment() {
        return this.Assignment;
    }

    /**
     * Set 存储着分配给该消费者的 partition 信息
     * @param Assignment 存储着分配给该消费者的 partition 信息
     */
    public void setAssignment(Assignment Assignment) {
        this.Assignment = Assignment;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientHost", this.ClientHost);
        this.setParamObj(map, prefix + "Assignment.", this.Assignment);

    }
}

