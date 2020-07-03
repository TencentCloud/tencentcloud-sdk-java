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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurchaseReservedInstancesOfferingRequest extends AbstractModel{

    /**
    * 购买预留实例计费数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 预留实例计费配置ID
    */
    @SerializedName("ReservedInstancesOfferingId")
    @Expose
    private String ReservedInstancesOfferingId;

    /**
    * 试运行
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get 购买预留实例计费数量 
     * @return InstanceCount 购买预留实例计费数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买预留实例计费数量
     * @param InstanceCount 购买预留实例计费数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 预留实例计费配置ID 
     * @return ReservedInstancesOfferingId 预留实例计费配置ID
     */
    public String getReservedInstancesOfferingId() {
        return this.ReservedInstancesOfferingId;
    }

    /**
     * Set 预留实例计费配置ID
     * @param ReservedInstancesOfferingId 预留实例计费配置ID
     */
    public void setReservedInstancesOfferingId(String ReservedInstancesOfferingId) {
        this.ReservedInstancesOfferingId = ReservedInstancesOfferingId;
    }

    /**
     * Get 试运行 
     * @return DryRun 试运行
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 试运行
     * @param DryRun 试运行
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ReservedInstancesOfferingId", this.ReservedInstancesOfferingId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

