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

public class DescribeInstanceRenewNodesRequest extends AbstractModel{

    /**
    * 集群实例ID,实例ID形如: emr-xxxxxxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 集群实例ID,实例ID形如: emr-xxxxxxxx 
     * @return InstanceId 集群实例ID,实例ID形如: emr-xxxxxxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID,实例ID形如: emr-xxxxxxxx
     * @param InstanceId 集群实例ID,实例ID形如: emr-xxxxxxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeInstanceRenewNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceRenewNodesRequest(DescribeInstanceRenewNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

