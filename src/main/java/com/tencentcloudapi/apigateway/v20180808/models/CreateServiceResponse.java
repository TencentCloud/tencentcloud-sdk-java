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

public class CreateServiceResponse extends AbstractModel{

    /**
    * 服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 用户自定义服务名称。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 用户自定义服务描述。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * 外网默认域名。
    */
    @SerializedName("OuterSubDomain")
    @Expose
    private String OuterSubDomain;

    /**
    * vpc内网默认域名。
    */
    @SerializedName("InnerSubDomain")
    @Expose
    private String InnerSubDomain;

    /**
    * 服务创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 网络类型列表，INNER为内网访问，OUTER为外网访问。
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * IP版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务唯一ID。 
     * @return ServiceId 服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一ID。
     * @param ServiceId 服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 用户自定义服务名称。 
     * @return ServiceName 用户自定义服务名称。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 用户自定义服务名称。
     * @param ServiceName 用户自定义服务名称。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 用户自定义服务描述。 
     * @return ServiceDesc 用户自定义服务描述。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set 用户自定义服务描述。
     * @param ServiceDesc 用户自定义服务描述。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get 外网默认域名。 
     * @return OuterSubDomain 外网默认域名。
     */
    public String getOuterSubDomain() {
        return this.OuterSubDomain;
    }

    /**
     * Set 外网默认域名。
     * @param OuterSubDomain 外网默认域名。
     */
    public void setOuterSubDomain(String OuterSubDomain) {
        this.OuterSubDomain = OuterSubDomain;
    }

    /**
     * Get vpc内网默认域名。 
     * @return InnerSubDomain vpc内网默认域名。
     */
    public String getInnerSubDomain() {
        return this.InnerSubDomain;
    }

    /**
     * Set vpc内网默认域名。
     * @param InnerSubDomain vpc内网默认域名。
     */
    public void setInnerSubDomain(String InnerSubDomain) {
        this.InnerSubDomain = InnerSubDomain;
    }

    /**
     * Get 服务创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime 服务创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 服务创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime 服务创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 网络类型列表，INNER为内网访问，OUTER为外网访问。 
     * @return NetTypes 网络类型列表，INNER为内网访问，OUTER为外网访问。
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set 网络类型列表，INNER为内网访问，OUTER为外网访问。
     * @param NetTypes 网络类型列表，INNER为内网访问，OUTER为外网访问。
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get IP版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpVersion IP版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpVersion IP版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceResponse(CreateServiceResponse source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.OuterSubDomain != null) {
            this.OuterSubDomain = new String(source.OuterSubDomain);
        }
        if (source.InnerSubDomain != null) {
            this.InnerSubDomain = new String(source.InnerSubDomain);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "OuterSubDomain", this.OuterSubDomain);
        this.setParamSimple(map, prefix + "InnerSubDomain", this.InnerSubDomain);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

