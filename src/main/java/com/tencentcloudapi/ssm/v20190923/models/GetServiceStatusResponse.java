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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel {

    /**
    * true表示服务已开通，false 表示服务尚未开通。
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * true表示用户已经可以使用密钥安全托管功能，
false表示用户暂时不能使用密钥安全托管功能。
    */
    @SerializedName("AccessKeyEscrowEnabled")
    @Expose
    private Boolean AccessKeyEscrowEnabled;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 计算性能限制
    */
    @SerializedName("QPSLimit")
    @Expose
    private Long QPSLimit;

    /**
    * 凭据个数限制
    */
    @SerializedName("SecretLimit")
    @Expose
    private Long SecretLimit;

    /**
    * 付费模式
    */
    @SerializedName("PayModel")
    @Expose
    private String PayModel;

    /**
    * 自动续费标识，0:手动续费 1:自动续费 2:到期不续
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 已托管凭据个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get true表示服务已开通，false 表示服务尚未开通。 
     * @return ServiceEnabled true表示服务已开通，false 表示服务尚未开通。
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set true表示服务已开通，false 表示服务尚未开通。
     * @param ServiceEnabled true表示服务已开通，false 表示服务尚未开通。
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。 
     * @return InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
     * @param InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get true表示用户已经可以使用密钥安全托管功能，
false表示用户暂时不能使用密钥安全托管功能。 
     * @return AccessKeyEscrowEnabled true表示用户已经可以使用密钥安全托管功能，
false表示用户暂时不能使用密钥安全托管功能。
     */
    public Boolean getAccessKeyEscrowEnabled() {
        return this.AccessKeyEscrowEnabled;
    }

    /**
     * Set true表示用户已经可以使用密钥安全托管功能，
false表示用户暂时不能使用密钥安全托管功能。
     * @param AccessKeyEscrowEnabled true表示用户已经可以使用密钥安全托管功能，
false表示用户暂时不能使用密钥安全托管功能。
     */
    public void setAccessKeyEscrowEnabled(Boolean AccessKeyEscrowEnabled) {
        this.AccessKeyEscrowEnabled = AccessKeyEscrowEnabled;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 计算性能限制 
     * @return QPSLimit 计算性能限制
     */
    public Long getQPSLimit() {
        return this.QPSLimit;
    }

    /**
     * Set 计算性能限制
     * @param QPSLimit 计算性能限制
     */
    public void setQPSLimit(Long QPSLimit) {
        this.QPSLimit = QPSLimit;
    }

    /**
     * Get 凭据个数限制 
     * @return SecretLimit 凭据个数限制
     */
    public Long getSecretLimit() {
        return this.SecretLimit;
    }

    /**
     * Set 凭据个数限制
     * @param SecretLimit 凭据个数限制
     */
    public void setSecretLimit(Long SecretLimit) {
        this.SecretLimit = SecretLimit;
    }

    /**
     * Get 付费模式 
     * @return PayModel 付费模式
     */
    public String getPayModel() {
        return this.PayModel;
    }

    /**
     * Set 付费模式
     * @param PayModel 付费模式
     */
    public void setPayModel(String PayModel) {
        this.PayModel = PayModel;
    }

    /**
     * Get 自动续费标识，0:手动续费 1:自动续费 2:到期不续 
     * @return RenewFlag 自动续费标识，0:手动续费 1:自动续费 2:到期不续
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识，0:手动续费 1:自动续费 2:到期不续
     * @param RenewFlag 自动续费标识，0:手动续费 1:自动续费 2:到期不续
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 已托管凭据个数 
     * @return TotalCount 已托管凭据个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 已托管凭据个数
     * @param TotalCount 已托管凭据个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public GetServiceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceStatusResponse(GetServiceStatusResponse source) {
        if (source.ServiceEnabled != null) {
            this.ServiceEnabled = new Boolean(source.ServiceEnabled);
        }
        if (source.InvalidType != null) {
            this.InvalidType = new Long(source.InvalidType);
        }
        if (source.AccessKeyEscrowEnabled != null) {
            this.AccessKeyEscrowEnabled = new Boolean(source.AccessKeyEscrowEnabled);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.QPSLimit != null) {
            this.QPSLimit = new Long(source.QPSLimit);
        }
        if (source.SecretLimit != null) {
            this.SecretLimit = new Long(source.SecretLimit);
        }
        if (source.PayModel != null) {
            this.PayModel = new String(source.PayModel);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEnabled", this.ServiceEnabled);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "AccessKeyEscrowEnabled", this.AccessKeyEscrowEnabled);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "QPSLimit", this.QPSLimit);
        this.setParamSimple(map, prefix + "SecretLimit", this.SecretLimit);
        this.setParamSimple(map, prefix + "PayModel", this.PayModel);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

