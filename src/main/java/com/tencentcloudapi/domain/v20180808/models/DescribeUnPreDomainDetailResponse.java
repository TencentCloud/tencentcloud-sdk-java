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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUnPreDomainDetailResponse extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 预约人数
    */
    @SerializedName("PreCount")
    @Expose
    private Long PreCount;

    /**
    * 域名注册时间
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 域名删除时间
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 域名状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 域名价格
    */
    @SerializedName("CurrentPrice")
    @Expose
    private Float CurrentPrice;

    /**
    * 域名保证金
    */
    @SerializedName("AppointBondPrice")
    @Expose
    private Float AppointBondPrice;

    /**
    * 是否已经预约
    */
    @SerializedName("IsAppoint")
    @Expose
    private Boolean IsAppoint;

    /**
    * 业务ID
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 是否为原持有者域名
    */
    @SerializedName("IsDomainUser")
    @Expose
    private Boolean IsDomainUser;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 预约人数 
     * @return PreCount 预约人数
     */
    public Long getPreCount() {
        return this.PreCount;
    }

    /**
     * Set 预约人数
     * @param PreCount 预约人数
     */
    public void setPreCount(Long PreCount) {
        this.PreCount = PreCount;
    }

    /**
     * Get 域名注册时间 
     * @return RegTime 域名注册时间
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set 域名注册时间
     * @param RegTime 域名注册时间
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 域名删除时间 
     * @return DeleteTime 域名删除时间
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 域名删除时间
     * @param DeleteTime 域名删除时间
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 到期时间 
     * @return ExpireTime 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
     * @param ExpireTime 到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 域名状态 
     * @return Status 域名状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 域名状态
     * @param Status 域名状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 域名价格 
     * @return CurrentPrice 域名价格
     */
    public Float getCurrentPrice() {
        return this.CurrentPrice;
    }

    /**
     * Set 域名价格
     * @param CurrentPrice 域名价格
     */
    public void setCurrentPrice(Float CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }

    /**
     * Get 域名保证金 
     * @return AppointBondPrice 域名保证金
     */
    public Float getAppointBondPrice() {
        return this.AppointBondPrice;
    }

    /**
     * Set 域名保证金
     * @param AppointBondPrice 域名保证金
     */
    public void setAppointBondPrice(Float AppointBondPrice) {
        this.AppointBondPrice = AppointBondPrice;
    }

    /**
     * Get 是否已经预约 
     * @return IsAppoint 是否已经预约
     */
    public Boolean getIsAppoint() {
        return this.IsAppoint;
    }

    /**
     * Set 是否已经预约
     * @param IsAppoint 是否已经预约
     */
    public void setIsAppoint(Boolean IsAppoint) {
        this.IsAppoint = IsAppoint;
    }

    /**
     * Get 业务ID 
     * @return BusinessId 业务ID
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
     * @param BusinessId 业务ID
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 是否为原持有者域名 
     * @return IsDomainUser 是否为原持有者域名
     */
    public Boolean getIsDomainUser() {
        return this.IsDomainUser;
    }

    /**
     * Set 是否为原持有者域名
     * @param IsDomainUser 是否为原持有者域名
     */
    public void setIsDomainUser(Boolean IsDomainUser) {
        this.IsDomainUser = IsDomainUser;
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

    public DescribeUnPreDomainDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnPreDomainDetailResponse(DescribeUnPreDomainDetailResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.PreCount != null) {
            this.PreCount = new Long(source.PreCount);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CurrentPrice != null) {
            this.CurrentPrice = new Float(source.CurrentPrice);
        }
        if (source.AppointBondPrice != null) {
            this.AppointBondPrice = new Float(source.AppointBondPrice);
        }
        if (source.IsAppoint != null) {
            this.IsAppoint = new Boolean(source.IsAppoint);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.IsDomainUser != null) {
            this.IsDomainUser = new Boolean(source.IsDomainUser);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PreCount", this.PreCount);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CurrentPrice", this.CurrentPrice);
        this.setParamSimple(map, prefix + "AppointBondPrice", this.AppointBondPrice);
        this.setParamSimple(map, prefix + "IsAppoint", this.IsAppoint);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "IsDomainUser", this.IsDomainUser);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

