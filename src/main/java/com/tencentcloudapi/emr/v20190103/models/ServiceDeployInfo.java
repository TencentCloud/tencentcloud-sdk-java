/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDeployInfo extends AbstractModel {

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 角色的部署信息列表
    */
    @SerializedName("ComponentDeployInfoList")
    @Expose
    private ComponentDeployInfo [] ComponentDeployInfoList;

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 角色的部署信息列表 
     * @return ComponentDeployInfoList 角色的部署信息列表
     */
    public ComponentDeployInfo [] getComponentDeployInfoList() {
        return this.ComponentDeployInfoList;
    }

    /**
     * Set 角色的部署信息列表
     * @param ComponentDeployInfoList 角色的部署信息列表
     */
    public void setComponentDeployInfoList(ComponentDeployInfo [] ComponentDeployInfoList) {
        this.ComponentDeployInfoList = ComponentDeployInfoList;
    }

    public ServiceDeployInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDeployInfo(ServiceDeployInfo source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ComponentDeployInfoList != null) {
            this.ComponentDeployInfoList = new ComponentDeployInfo[source.ComponentDeployInfoList.length];
            for (int i = 0; i < source.ComponentDeployInfoList.length; i++) {
                this.ComponentDeployInfoList[i] = new ComponentDeployInfo(source.ComponentDeployInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArrayObj(map, prefix + "ComponentDeployInfoList.", this.ComponentDeployInfoList);

    }
}

