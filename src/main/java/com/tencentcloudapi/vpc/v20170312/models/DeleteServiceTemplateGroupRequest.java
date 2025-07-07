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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteServiceTemplateGroupRequest extends AbstractModel {

    /**
    * 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
    */
    @SerializedName("ServiceTemplateGroupId")
    @Expose
    private String ServiceTemplateGroupId;

    /**
     * Get 协议端口模板集合实例ID，例如：ppmg-n17uxvve。 
     * @return ServiceTemplateGroupId 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     */
    public String getServiceTemplateGroupId() {
        return this.ServiceTemplateGroupId;
    }

    /**
     * Set 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     * @param ServiceTemplateGroupId 协议端口模板集合实例ID，例如：ppmg-n17uxvve。
     */
    public void setServiceTemplateGroupId(String ServiceTemplateGroupId) {
        this.ServiceTemplateGroupId = ServiceTemplateGroupId;
    }

    public DeleteServiceTemplateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServiceTemplateGroupRequest(DeleteServiceTemplateGroupRequest source) {
        if (source.ServiceTemplateGroupId != null) {
            this.ServiceTemplateGroupId = new String(source.ServiceTemplateGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupId", this.ServiceTemplateGroupId);

    }
}

