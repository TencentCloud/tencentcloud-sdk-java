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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatInstanceRequest extends AbstractModel{

    /**
    * NAT防火墙实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * NAT防火墙实例ID
    */
    @SerializedName("NatInstanceId")
    @Expose
    private String NatInstanceId;

    /**
     * Get NAT防火墙实例名称 
     * @return InstanceName NAT防火墙实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set NAT防火墙实例名称
     * @param InstanceName NAT防火墙实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get NAT防火墙实例ID 
     * @return NatInstanceId NAT防火墙实例ID
     */
    public String getNatInstanceId() {
        return this.NatInstanceId;
    }

    /**
     * Set NAT防火墙实例ID
     * @param NatInstanceId NAT防火墙实例ID
     */
    public void setNatInstanceId(String NatInstanceId) {
        this.NatInstanceId = NatInstanceId;
    }

    public ModifyNatInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatInstanceRequest(ModifyNatInstanceRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NatInstanceId != null) {
            this.NatInstanceId = new String(source.NatInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NatInstanceId", this.NatInstanceId);

    }
}

