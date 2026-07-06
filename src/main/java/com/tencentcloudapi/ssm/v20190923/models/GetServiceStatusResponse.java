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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel {

    /**
    * <p>true表示服务已开通，false 表示服务尚未开通。</p>
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。</p>
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * <p>true表示用户已经可以使用密钥安全托管功能，<br>false表示用户暂时不能使用密钥安全托管功能。</p>
    */
    @SerializedName("AccessKeyEscrowEnabled")
    @Expose
    private Boolean AccessKeyEscrowEnabled;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>计算性能限制</p>
    */
    @SerializedName("QPSLimit")
    @Expose
    private Long QPSLimit;

    /**
    * <p>凭据个数限制</p>
    */
    @SerializedName("SecretLimit")
    @Expose
    private Long SecretLimit;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayModel")
    @Expose
    private String PayModel;

    /**
    * <p>自动续费标识，0:手动续费 1:自动续费 2:到期不续</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>已托管凭据个数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>预付费购买 SSM 资源的地域 ID</p>
    */
    @SerializedName("ResourceRegion")
    @Expose
    private Long ResourceRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>true表示服务已开通，false 表示服务尚未开通。</p> 
     * @return ServiceEnabled <p>true表示服务已开通，false 表示服务尚未开通。</p>
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set <p>true表示服务已开通，false 表示服务尚未开通。</p>
     * @param ServiceEnabled <p>true表示服务已开通，false 表示服务尚未开通。</p>
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。</p> 
     * @return InvalidType <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。</p>
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。</p>
     * @param InvalidType <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。</p>
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get <p>true表示用户已经可以使用密钥安全托管功能，<br>false表示用户暂时不能使用密钥安全托管功能。</p> 
     * @return AccessKeyEscrowEnabled <p>true表示用户已经可以使用密钥安全托管功能，<br>false表示用户暂时不能使用密钥安全托管功能。</p>
     */
    public Boolean getAccessKeyEscrowEnabled() {
        return this.AccessKeyEscrowEnabled;
    }

    /**
     * Set <p>true表示用户已经可以使用密钥安全托管功能，<br>false表示用户暂时不能使用密钥安全托管功能。</p>
     * @param AccessKeyEscrowEnabled <p>true表示用户已经可以使用密钥安全托管功能，<br>false表示用户暂时不能使用密钥安全托管功能。</p>
     */
    public void setAccessKeyEscrowEnabled(Boolean AccessKeyEscrowEnabled) {
        this.AccessKeyEscrowEnabled = AccessKeyEscrowEnabled;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>计算性能限制</p> 
     * @return QPSLimit <p>计算性能限制</p>
     */
    public Long getQPSLimit() {
        return this.QPSLimit;
    }

    /**
     * Set <p>计算性能限制</p>
     * @param QPSLimit <p>计算性能限制</p>
     */
    public void setQPSLimit(Long QPSLimit) {
        this.QPSLimit = QPSLimit;
    }

    /**
     * Get <p>凭据个数限制</p> 
     * @return SecretLimit <p>凭据个数限制</p>
     */
    public Long getSecretLimit() {
        return this.SecretLimit;
    }

    /**
     * Set <p>凭据个数限制</p>
     * @param SecretLimit <p>凭据个数限制</p>
     */
    public void setSecretLimit(Long SecretLimit) {
        this.SecretLimit = SecretLimit;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayModel <p>付费模式</p>
     */
    public String getPayModel() {
        return this.PayModel;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayModel <p>付费模式</p>
     */
    public void setPayModel(String PayModel) {
        this.PayModel = PayModel;
    }

    /**
     * Get <p>自动续费标识，0:手动续费 1:自动续费 2:到期不续</p> 
     * @return RenewFlag <p>自动续费标识，0:手动续费 1:自动续费 2:到期不续</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识，0:手动续费 1:自动续费 2:到期不续</p>
     * @param RenewFlag <p>自动续费标识，0:手动续费 1:自动续费 2:到期不续</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>已托管凭据个数</p> 
     * @return TotalCount <p>已托管凭据个数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>已托管凭据个数</p>
     * @param TotalCount <p>已托管凭据个数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>预付费购买 SSM 资源的地域 ID</p> 
     * @return ResourceRegion <p>预付费购买 SSM 资源的地域 ID</p>
     */
    public Long getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set <p>预付费购买 SSM 资源的地域 ID</p>
     * @param ResourceRegion <p>预付费购买 SSM 资源的地域 ID</p>
     */
    public void setResourceRegion(Long ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
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
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new Long(source.ResourceRegion);
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
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

