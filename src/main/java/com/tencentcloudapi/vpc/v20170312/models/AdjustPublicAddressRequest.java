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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdjustPublicAddressRequest extends AbstractModel{

    /**
    * 标识CVM实例的唯一 ID。CVM 唯一 ID 形如：`ins-11112222`。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 标识EIP实例的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
     * Get 标识CVM实例的唯一 ID。CVM 唯一 ID 形如：`ins-11112222`。 
     * @return InstanceId 标识CVM实例的唯一 ID。CVM 唯一 ID 形如：`ins-11112222`。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 标识CVM实例的唯一 ID。CVM 唯一 ID 形如：`ins-11112222`。
     * @param InstanceId 标识CVM实例的唯一 ID。CVM 唯一 ID 形如：`ins-11112222`。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 标识EIP实例的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。 
     * @return AddressId 标识EIP实例的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 标识EIP实例的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     * @param AddressId 标识EIP实例的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    public AdjustPublicAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustPublicAddressRequest(AdjustPublicAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);

    }
}

