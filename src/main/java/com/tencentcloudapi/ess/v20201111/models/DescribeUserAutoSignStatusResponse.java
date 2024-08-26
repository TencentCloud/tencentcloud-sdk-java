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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserAutoSignStatusResponse extends AbstractModel {

    /**
    * 查询用户是否已开通自动签
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
    * 自动签许可生效时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
    */
    @SerializedName("LicenseFrom")
    @Expose
    private Long LicenseFrom;

    /**
    * 自动签许可到期时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
    */
    @SerializedName("LicenseTo")
    @Expose
    private Long LicenseTo;

    /**
    * 设置用户开通自动签时是否绑定个人自动签账号许可。<ul><li>**0**: 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li><li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 用户开通自动签指定使用的印章，为空则未设置印章，需重新进入开通链接设置印章。
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询用户是否已开通自动签 
     * @return IsOpen 查询用户是否已开通自动签
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 查询用户是否已开通自动签
     * @param IsOpen 查询用户是否已开通自动签
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get 自动签许可生效时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。 
     * @return LicenseFrom 自动签许可生效时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
     */
    public Long getLicenseFrom() {
        return this.LicenseFrom;
    }

    /**
     * Set 自动签许可生效时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
     * @param LicenseFrom 自动签许可生效时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
     */
    public void setLicenseFrom(Long LicenseFrom) {
        this.LicenseFrom = LicenseFrom;
    }

    /**
     * Get 自动签许可到期时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。 
     * @return LicenseTo 自动签许可到期时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
     */
    public Long getLicenseTo() {
        return this.LicenseTo;
    }

    /**
     * Set 自动签许可到期时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
     * @param LicenseTo 自动签许可到期时间。当且仅当已通过许可开通自动签时有值。

值为unix时间戳,单位为秒。
     */
    public void setLicenseTo(Long LicenseTo) {
        this.LicenseTo = LicenseTo;
    }

    /**
     * Get 设置用户开通自动签时是否绑定个人自动签账号许可。<ul><li>**0**: 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li><li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul> 
     * @return LicenseType 设置用户开通自动签时是否绑定个人自动签账号许可。<ul><li>**0**: 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li><li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 设置用户开通自动签时是否绑定个人自动签账号许可。<ul><li>**0**: 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li><li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
     * @param LicenseType 设置用户开通自动签时是否绑定个人自动签账号许可。<ul><li>**0**: 使用个人自动签账号许可进行开通，个人自动签账号许可有效期1年，注: `不可解绑释放更换他人`</li><li>**1**: 不绑定自动签账号许可开通，后续使用合同份额进行合同发起</li></ul>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 用户开通自动签指定使用的印章，为空则未设置印章，需重新进入开通链接设置印章。 
     * @return SealId 用户开通自动签指定使用的印章，为空则未设置印章，需重新进入开通链接设置印章。
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 用户开通自动签指定使用的印章，为空则未设置印章，需重新进入开通链接设置印章。
     * @param SealId 用户开通自动签指定使用的印章，为空则未设置印章，需重新进入开通链接设置印章。
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
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

    public DescribeUserAutoSignStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserAutoSignStatusResponse(DescribeUserAutoSignStatusResponse source) {
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
        if (source.LicenseFrom != null) {
            this.LicenseFrom = new Long(source.LicenseFrom);
        }
        if (source.LicenseTo != null) {
            this.LicenseTo = new Long(source.LicenseTo);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "LicenseFrom", this.LicenseFrom);
        this.setParamSimple(map, prefix + "LicenseTo", this.LicenseTo);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

