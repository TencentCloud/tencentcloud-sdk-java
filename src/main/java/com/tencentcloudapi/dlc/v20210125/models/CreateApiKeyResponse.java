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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiKeyResponse extends AbstractModel {

    /**
    * <p>API Key ID（唯一标识）</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>API Key 名称（用户创建时指定的可读名称）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>API Key 值（完整密钥字符串，用于鉴权时携带在请求头中）</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>关联的推理服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>关联的推理服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>API Key 状态，可选值：Active（活跃可用）/ Revoked（已停用）。空闲 Key 通常为 Active 状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>主账号UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建时间（毫秒时间戳）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（毫秒时间戳）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>子账号UIN（实际操作者）</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>API Key ID（唯一标识）</p> 
     * @return ApiKeyId <p>API Key ID（唯一标识）</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>API Key ID（唯一标识）</p>
     * @param ApiKeyId <p>API Key ID（唯一标识）</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>API Key 名称（用户创建时指定的可读名称）</p> 
     * @return Name <p>API Key 名称（用户创建时指定的可读名称）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>API Key 名称（用户创建时指定的可读名称）</p>
     * @param Name <p>API Key 名称（用户创建时指定的可读名称）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>API Key 值（完整密钥字符串，用于鉴权时携带在请求头中）</p> 
     * @return ApiKey <p>API Key 值（完整密钥字符串，用于鉴权时携带在请求头中）</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>API Key 值（完整密钥字符串，用于鉴权时携带在请求头中）</p>
     * @param ApiKey <p>API Key 值（完整密钥字符串，用于鉴权时携带在请求头中）</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>关联的推理服务ID</p> 
     * @return ServiceId <p>关联的推理服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>关联的推理服务ID</p>
     * @param ServiceId <p>关联的推理服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>关联的推理服务名称</p> 
     * @return ServiceName <p>关联的推理服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>关联的推理服务名称</p>
     * @param ServiceName <p>关联的推理服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>API Key 状态，可选值：Active（活跃可用）/ Revoked（已停用）。空闲 Key 通常为 Active 状态</p> 
     * @return Status <p>API Key 状态，可选值：Active（活跃可用）/ Revoked（已停用）。空闲 Key 通常为 Active 状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>API Key 状态，可选值：Active（活跃可用）/ Revoked（已停用）。空闲 Key 通常为 Active 状态</p>
     * @param Status <p>API Key 状态，可选值：Active（活跃可用）/ Revoked（已停用）。空闲 Key 通常为 Active 状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>主账号UIN</p> 
     * @return Uin <p>主账号UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号UIN</p>
     * @param Uin <p>主账号UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p> 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（毫秒时间戳）</p> 
     * @return UpdateTime <p>更新时间（毫秒时间戳）</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（毫秒时间戳）</p>
     * @param UpdateTime <p>更新时间（毫秒时间戳）</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>子账号UIN（实际操作者）</p> 
     * @return SubAccountUin <p>子账号UIN（实际操作者）</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>子账号UIN（实际操作者）</p>
     * @param SubAccountUin <p>子账号UIN（实际操作者）</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateApiKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiKeyResponse(CreateApiKeyResponse source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

