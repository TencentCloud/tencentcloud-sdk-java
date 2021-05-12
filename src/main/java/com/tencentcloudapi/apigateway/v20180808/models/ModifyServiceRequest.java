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

public class ModifyServiceRequest extends AbstractModel{

    /**
    * 待修改服务的唯一 Id。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 修改后的服务名称。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 修改后的服务描述。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * 修改后的服务前端请求类型，如 http、https和 http&https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
     * Get 待修改服务的唯一 Id。 
     * @return ServiceId 待修改服务的唯一 Id。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待修改服务的唯一 Id。
     * @param ServiceId 待修改服务的唯一 Id。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 修改后的服务名称。 
     * @return ServiceName 修改后的服务名称。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 修改后的服务名称。
     * @param ServiceName 修改后的服务名称。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 修改后的服务描述。 
     * @return ServiceDesc 修改后的服务描述。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set 修改后的服务描述。
     * @param ServiceDesc 修改后的服务描述。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get 修改后的服务前端请求类型，如 http、https和 http&https。 
     * @return Protocol 修改后的服务前端请求类型，如 http、https和 http&https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 修改后的服务前端请求类型，如 http、https和 http&https。
     * @param Protocol 修改后的服务前端请求类型，如 http、https和 http&https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。 
     * @return NetTypes 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
     * @param NetTypes 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    public ModifyServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceRequest(ModifyServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);

    }
}

