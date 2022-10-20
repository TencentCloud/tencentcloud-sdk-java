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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunPrometheusInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子网ID，默认使用实例所用子网初始化，也可通过该参数传递新的子网ID初始化
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子网ID，默认使用实例所用子网初始化，也可通过该参数传递新的子网ID初始化 
     * @return SubnetId 子网ID，默认使用实例所用子网初始化，也可通过该参数传递新的子网ID初始化
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID，默认使用实例所用子网初始化，也可通过该参数传递新的子网ID初始化
     * @param SubnetId 子网ID，默认使用实例所用子网初始化，也可通过该参数传递新的子网ID初始化
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public RunPrometheusInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunPrometheusInstanceRequest(RunPrometheusInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

