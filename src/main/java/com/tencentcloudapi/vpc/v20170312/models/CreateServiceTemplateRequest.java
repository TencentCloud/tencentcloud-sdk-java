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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceTemplateRequest extends AbstractModel{

    /**
    * 协议端口模板名称
    */
    @SerializedName("ServiceTemplateName")
    @Expose
    private String ServiceTemplateName;

    /**
    * 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
    * 支持添加备注，单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
    */
    @SerializedName("ServicesExtra")
    @Expose
    private ServicesInfo [] ServicesExtra;

    /**
     * Get 协议端口模板名称 
     * @return ServiceTemplateName 协议端口模板名称
     */
    public String getServiceTemplateName() {
        return this.ServiceTemplateName;
    }

    /**
     * Set 协议端口模板名称
     * @param ServiceTemplateName 协议端口模板名称
     */
    public void setServiceTemplateName(String ServiceTemplateName) {
        this.ServiceTemplateName = ServiceTemplateName;
    }

    /**
     * Get 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。 
     * @return Services 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * Set 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
     * @param Services 支持单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    /**
     * Get 支持添加备注，单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。 
     * @return ServicesExtra 支持添加备注，单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
     */
    public ServicesInfo [] getServicesExtra() {
        return this.ServicesExtra;
    }

    /**
     * Set 支持添加备注，单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
     * @param ServicesExtra 支持添加备注，单个端口、多个端口、连续端口及所有端口，协议支持：TCP、UDP、ICMP、GRE 协议。Services与ServicesExtra必填其一。
     */
    public void setServicesExtra(ServicesInfo [] ServicesExtra) {
        this.ServicesExtra = ServicesExtra;
    }

    public CreateServiceTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceTemplateRequest(CreateServiceTemplateRequest source) {
        if (source.ServiceTemplateName != null) {
            this.ServiceTemplateName = new String(source.ServiceTemplateName);
        }
        if (source.Services != null) {
            this.Services = new String[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new String(source.Services[i]);
            }
        }
        if (source.ServicesExtra != null) {
            this.ServicesExtra = new ServicesInfo[source.ServicesExtra.length];
            for (int i = 0; i < source.ServicesExtra.length; i++) {
                this.ServicesExtra[i] = new ServicesInfo(source.ServicesExtra[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateName", this.ServiceTemplateName);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);
        this.setParamArrayObj(map, prefix + "ServicesExtra.", this.ServicesExtra);

    }
}

