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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeUserAutoSignStatusResponse extends AbstractModel{

    /**
    * 是否开通
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

    /**
    * 自动签许可生效时间。当且仅当已开通自动签时有值。
    */
    @SerializedName("LicenseFrom")
    @Expose
    private Long LicenseFrom;

    /**
    * 自动签许可到期时间。当且仅当已开通自动签时有值。
    */
    @SerializedName("LicenseTo")
    @Expose
    private Long LicenseTo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开通 
     * @return IsOpen 是否开通
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set 是否开通
     * @param IsOpen 是否开通
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get 自动签许可生效时间。当且仅当已开通自动签时有值。 
     * @return LicenseFrom 自动签许可生效时间。当且仅当已开通自动签时有值。
     */
    public Long getLicenseFrom() {
        return this.LicenseFrom;
    }

    /**
     * Set 自动签许可生效时间。当且仅当已开通自动签时有值。
     * @param LicenseFrom 自动签许可生效时间。当且仅当已开通自动签时有值。
     */
    public void setLicenseFrom(Long LicenseFrom) {
        this.LicenseFrom = LicenseFrom;
    }

    /**
     * Get 自动签许可到期时间。当且仅当已开通自动签时有值。 
     * @return LicenseTo 自动签许可到期时间。当且仅当已开通自动签时有值。
     */
    public Long getLicenseTo() {
        return this.LicenseTo;
    }

    /**
     * Set 自动签许可到期时间。当且仅当已开通自动签时有值。
     * @param LicenseTo 自动签许可到期时间。当且仅当已开通自动签时有值。
     */
    public void setLicenseTo(Long LicenseTo) {
        this.LicenseTo = LicenseTo;
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

    public ChannelDescribeUserAutoSignStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeUserAutoSignStatusResponse(ChannelDescribeUserAutoSignStatusResponse source) {
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
        if (source.LicenseFrom != null) {
            this.LicenseFrom = new Long(source.LicenseFrom);
        }
        if (source.LicenseTo != null) {
            this.LicenseTo = new Long(source.LicenseTo);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

