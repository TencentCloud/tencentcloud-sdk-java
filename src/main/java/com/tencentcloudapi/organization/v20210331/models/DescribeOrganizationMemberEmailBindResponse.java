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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationMemberEmailBindResponse extends AbstractModel {

    /**
    * 绑定ID。
    */
    @SerializedName("BindId")
    @Expose
    private Long BindId;

    /**
    * 申请时间。
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 邮箱地址。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 安全手机号。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 绑定状态。    未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * 绑定时间。
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
    * 失败说明。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 安全手机绑定状态 。 未绑定：0，已绑定：1
    */
    @SerializedName("PhoneBind")
    @Expose
    private Long PhoneBind;

    /**
    * 国际区号。
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 绑定ID。 
     * @return BindId 绑定ID。
     */
    public Long getBindId() {
        return this.BindId;
    }

    /**
     * Set 绑定ID。
     * @param BindId 绑定ID。
     */
    public void setBindId(Long BindId) {
        this.BindId = BindId;
    }

    /**
     * Get 申请时间。 
     * @return ApplyTime 申请时间。
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间。
     * @param ApplyTime 申请时间。
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 邮箱地址。 
     * @return Email 邮箱地址。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址。
     * @param Email 邮箱地址。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 安全手机号。 
     * @return Phone 安全手机号。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 安全手机号。
     * @param Phone 安全手机号。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 绑定状态。    未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed 
     * @return BindStatus 绑定状态。    未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 绑定状态。    未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
     * @param BindStatus 绑定状态。    未绑定：Unbound，待激活：Valid，绑定成功：Success，绑定失败：Failed
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 绑定时间。 
     * @return BindTime 绑定时间。
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set 绑定时间。
     * @param BindTime 绑定时间。
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    /**
     * Get 失败说明。 
     * @return Description 失败说明。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 失败说明。
     * @param Description 失败说明。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 安全手机绑定状态 。 未绑定：0，已绑定：1 
     * @return PhoneBind 安全手机绑定状态 。 未绑定：0，已绑定：1
     */
    public Long getPhoneBind() {
        return this.PhoneBind;
    }

    /**
     * Set 安全手机绑定状态 。 未绑定：0，已绑定：1
     * @param PhoneBind 安全手机绑定状态 。 未绑定：0，已绑定：1
     */
    public void setPhoneBind(Long PhoneBind) {
        this.PhoneBind = PhoneBind;
    }

    /**
     * Get 国际区号。 
     * @return CountryCode 国际区号。
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 国际区号。
     * @param CountryCode 国际区号。
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
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

    public DescribeOrganizationMemberEmailBindResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMemberEmailBindResponse(DescribeOrganizationMemberEmailBindResponse source) {
        if (source.BindId != null) {
            this.BindId = new Long(source.BindId);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PhoneBind != null) {
            this.PhoneBind = new Long(source.PhoneBind);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindId", this.BindId);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PhoneBind", this.PhoneBind);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

