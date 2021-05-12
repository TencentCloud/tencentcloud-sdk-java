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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteServiceSubDomainMappingRequest extends AbstractModel{

    /**
    * 服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务绑定的自定义域名。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 待删除映射的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 服务唯一 ID。 
     * @return ServiceId 服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一 ID。
     * @param ServiceId 服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务绑定的自定义域名。 
     * @return SubDomain 服务绑定的自定义域名。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 服务绑定的自定义域名。
     * @param SubDomain 服务绑定的自定义域名。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 待删除映射的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。 
     * @return Environment 待删除映射的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 待删除映射的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     * @param Environment 待删除映射的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public DeleteServiceSubDomainMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServiceSubDomainMappingRequest(DeleteServiceSubDomainMappingRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

