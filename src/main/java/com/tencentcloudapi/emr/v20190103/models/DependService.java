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

public class DependService extends AbstractModel{

    /**
    * 共用组件名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 共用组件集群
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 共用组件名 
     * @return ServiceName 共用组件名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 共用组件名
     * @param ServiceName 共用组件名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 共用组件集群 
     * @return InstanceId 共用组件集群
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 共用组件集群
     * @param InstanceId 共用组件集群
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DependService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependService(DependService source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

