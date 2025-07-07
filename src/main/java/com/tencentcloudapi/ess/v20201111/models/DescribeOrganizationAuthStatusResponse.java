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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationAuthStatusResponse extends AbstractModel {

    /**
    * 企业是否已认证
    */
    @SerializedName("IsVerified")
    @Expose
    private Boolean IsVerified;

    /**
    * 企业认证状态 0-未认证 1-认证中 2-已认证
    */
    @SerializedName("AuthStatus")
    @Expose
    private Long AuthStatus;

    /**
    * 企业认证信息
    */
    @SerializedName("AuthRecords")
    @Expose
    private AuthRecord [] AuthRecords;

    /**
    * 企业在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多"->"企业设置"->"企业中心"- 中查看企业电子签账号。
p.s. 只有当前企业认证成功的时候返回
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业是否已认证 
     * @return IsVerified 企业是否已认证
     */
    public Boolean getIsVerified() {
        return this.IsVerified;
    }

    /**
     * Set 企业是否已认证
     * @param IsVerified 企业是否已认证
     */
    public void setIsVerified(Boolean IsVerified) {
        this.IsVerified = IsVerified;
    }

    /**
     * Get 企业认证状态 0-未认证 1-认证中 2-已认证 
     * @return AuthStatus 企业认证状态 0-未认证 1-认证中 2-已认证
     */
    public Long getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 企业认证状态 0-未认证 1-认证中 2-已认证
     * @param AuthStatus 企业认证状态 0-未认证 1-认证中 2-已认证
     */
    public void setAuthStatus(Long AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 企业认证信息 
     * @return AuthRecords 企业认证信息
     */
    public AuthRecord [] getAuthRecords() {
        return this.AuthRecords;
    }

    /**
     * Set 企业认证信息
     * @param AuthRecords 企业认证信息
     */
    public void setAuthRecords(AuthRecord [] AuthRecords) {
        this.AuthRecords = AuthRecords;
    }

    /**
     * Get 企业在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多"->"企业设置"->"企业中心"- 中查看企业电子签账号。
p.s. 只有当前企业认证成功的时候返回 
     * @return OrganizationId 企业在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多"->"企业设置"->"企业中心"- 中查看企业电子签账号。
p.s. 只有当前企业认证成功的时候返回
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 企业在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多"->"企业设置"->"企业中心"- 中查看企业电子签账号。
p.s. 只有当前企业认证成功的时候返回
     * @param OrganizationId 企业在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多"->"企业设置"->"企业中心"- 中查看企业电子签账号。
p.s. 只有当前企业认证成功的时候返回
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
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

    public DescribeOrganizationAuthStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationAuthStatusResponse(DescribeOrganizationAuthStatusResponse source) {
        if (source.IsVerified != null) {
            this.IsVerified = new Boolean(source.IsVerified);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new Long(source.AuthStatus);
        }
        if (source.AuthRecords != null) {
            this.AuthRecords = new AuthRecord[source.AuthRecords.length];
            for (int i = 0; i < source.AuthRecords.length; i++) {
                this.AuthRecords[i] = new AuthRecord(source.AuthRecords[i]);
            }
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsVerified", this.IsVerified);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamArrayObj(map, prefix + "AuthRecords.", this.AuthRecords);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

