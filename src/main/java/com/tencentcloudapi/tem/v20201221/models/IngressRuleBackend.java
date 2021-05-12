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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressRuleBackend extends AbstractModel{

    /**
    * eks service 名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * eks service 端口
    */
    @SerializedName("ServicePort")
    @Expose
    private Long ServicePort;

    /**
     * Get eks service 名 
     * @return ServiceName eks service 名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set eks service 名
     * @param ServiceName eks service 名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get eks service 端口 
     * @return ServicePort eks service 端口
     */
    public Long getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set eks service 端口
     * @param ServicePort eks service 端口
     */
    public void setServicePort(Long ServicePort) {
        this.ServicePort = ServicePort;
    }

    public IngressRuleBackend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressRuleBackend(IngressRuleBackend source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new Long(source.ServicePort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);

    }
}

