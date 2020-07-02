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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentClientGradeResponse extends AbstractModel{

    /**
    * 审核状态：0待审核，1，已审核
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * 实名认证状态：0，未实名认证，1实名认证
    */
    @SerializedName("AuthState")
    @Expose
    private Long AuthState;

    /**
    * 客户级别
    */
    @SerializedName("ClientGrade")
    @Expose
    private String ClientGrade;

    /**
    * 客户类型：1，个人；2，企业；3，其他
    */
    @SerializedName("ClientType")
    @Expose
    private Long ClientType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 审核状态：0待审核，1，已审核 
     * @return AuditStatus 审核状态：0待审核，1，已审核
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审核状态：0待审核，1，已审核
     * @param AuditStatus 审核状态：0待审核，1，已审核
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 实名认证状态：0，未实名认证，1实名认证 
     * @return AuthState 实名认证状态：0，未实名认证，1实名认证
     */
    public Long getAuthState() {
        return this.AuthState;
    }

    /**
     * Set 实名认证状态：0，未实名认证，1实名认证
     * @param AuthState 实名认证状态：0，未实名认证，1实名认证
     */
    public void setAuthState(Long AuthState) {
        this.AuthState = AuthState;
    }

    /**
     * Get 客户级别 
     * @return ClientGrade 客户级别
     */
    public String getClientGrade() {
        return this.ClientGrade;
    }

    /**
     * Set 客户级别
     * @param ClientGrade 客户级别
     */
    public void setClientGrade(String ClientGrade) {
        this.ClientGrade = ClientGrade;
    }

    /**
     * Get 客户类型：1，个人；2，企业；3，其他 
     * @return ClientType 客户类型：1，个人；2，企业；3，其他
     */
    public Long getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户类型：1，个人；2，企业；3，其他
     * @param ClientType 客户类型：1，个人；2，企业；3，其他
     */
    public void setClientType(Long ClientType) {
        this.ClientType = ClientType;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuthState", this.AuthState);
        this.setParamSimple(map, prefix + "ClientGrade", this.ClientGrade);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

