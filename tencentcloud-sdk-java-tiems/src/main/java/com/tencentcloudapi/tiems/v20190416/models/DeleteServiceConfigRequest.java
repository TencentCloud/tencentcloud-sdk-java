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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteServiceConfigRequest extends AbstractModel{

    /**
    * 服务配置Id
    */
    @SerializedName("ServiceConfigId")
    @Expose
    private String ServiceConfigId;

    /**
    * 服务配置名称
    */
    @SerializedName("ServiceConfigName")
    @Expose
    private String ServiceConfigName;

    /**
     * Get 服务配置Id 
     * @return ServiceConfigId 服务配置Id
     */
    public String getServiceConfigId() {
        return this.ServiceConfigId;
    }

    /**
     * Set 服务配置Id
     * @param ServiceConfigId 服务配置Id
     */
    public void setServiceConfigId(String ServiceConfigId) {
        this.ServiceConfigId = ServiceConfigId;
    }

    /**
     * Get 服务配置名称 
     * @return ServiceConfigName 服务配置名称
     */
    public String getServiceConfigName() {
        return this.ServiceConfigName;
    }

    /**
     * Set 服务配置名称
     * @param ServiceConfigName 服务配置名称
     */
    public void setServiceConfigName(String ServiceConfigName) {
        this.ServiceConfigName = ServiceConfigName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceConfigId", this.ServiceConfigId);
        this.setParamSimple(map, prefix + "ServiceConfigName", this.ServiceConfigName);

    }
}

