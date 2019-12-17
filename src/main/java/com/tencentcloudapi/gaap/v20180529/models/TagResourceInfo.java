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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagResourceInfo extends AbstractModel{

    /**
    * 资源类型，其中：
Proxy表示通道，
ProxyGroup表示通道组，
RealServer表示源站
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 资源类型，其中：
Proxy表示通道，
ProxyGroup表示通道组，
RealServer表示源站 
     * @return ResourceType 资源类型，其中：
Proxy表示通道，
ProxyGroup表示通道组，
RealServer表示源站
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，其中：
Proxy表示通道，
ProxyGroup表示通道组，
RealServer表示源站
     * @param ResourceType 资源类型，其中：
Proxy表示通道，
ProxyGroup表示通道组，
RealServer表示源站
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

