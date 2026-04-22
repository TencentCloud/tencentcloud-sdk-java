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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectGroupDomainInfo extends AbstractModel {

    /**
    * 防护对象组中绑定的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 防护对象组中绑定的域名对应所属的实例信息，一个域名可能存在多个实例中
    */
    @SerializedName("Instances")
    @Expose
    private InstanceBriefInfo [] Instances;

    /**
     * Get 防护对象组中绑定的域名 
     * @return Domain 防护对象组中绑定的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 防护对象组中绑定的域名
     * @param Domain 防护对象组中绑定的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 防护对象组中绑定的域名对应所属的实例信息，一个域名可能存在多个实例中 
     * @return Instances 防护对象组中绑定的域名对应所属的实例信息，一个域名可能存在多个实例中
     */
    public InstanceBriefInfo [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 防护对象组中绑定的域名对应所属的实例信息，一个域名可能存在多个实例中
     * @param Instances 防护对象组中绑定的域名对应所属的实例信息，一个域名可能存在多个实例中
     */
    public void setInstances(InstanceBriefInfo [] Instances) {
        this.Instances = Instances;
    }

    public ProtectGroupDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectGroupDomainInfo(ProtectGroupDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Instances != null) {
            this.Instances = new InstanceBriefInfo[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new InstanceBriefInfo(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

