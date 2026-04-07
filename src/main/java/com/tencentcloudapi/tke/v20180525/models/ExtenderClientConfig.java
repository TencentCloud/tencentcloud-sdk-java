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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtenderClientConfig extends AbstractModel {

    /**
    * 访问extender服务url设置
    */
    @SerializedName("Service")
    @Expose
    private ServiceReference Service;

    /**
     * Get 访问extender服务url设置 
     * @return Service 访问extender服务url设置
     */
    public ServiceReference getService() {
        return this.Service;
    }

    /**
     * Set 访问extender服务url设置
     * @param Service 访问extender服务url设置
     */
    public void setService(ServiceReference Service) {
        this.Service = Service;
    }

    public ExtenderClientConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtenderClientConfig(ExtenderClientConfig source) {
        if (source.Service != null) {
            this.Service = new ServiceReference(source.Service);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Service.", this.Service);

    }
}

