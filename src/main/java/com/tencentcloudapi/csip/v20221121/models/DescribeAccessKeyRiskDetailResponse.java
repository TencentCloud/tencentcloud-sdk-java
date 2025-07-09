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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessKeyRiskDetailResponse extends AbstractModel {

    /**
    * 风险列表
    */
    @SerializedName("RiskInfo")
    @Expose
    private AccessKeyRisk RiskInfo;

    /**
    * CAM策略总数
    */
    @SerializedName("CamCount")
    @Expose
    private Long CamCount;

    /**
    * 账号关联告警数量
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * 访问方式 0 API 1 控制台与API
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 访问密钥告警数量列表
    */
    @SerializedName("AccessKeyAlarmCount")
    @Expose
    private AccessKeyAlarmCount [] AccessKeyAlarmCount;

    /**
    * 操作保护是否开启 0 未开启 1 已开启
    */
    @SerializedName("ActionFlag")
    @Expose
    private Long ActionFlag;

    /**
    * 登录保护是否开启 0 未开启 1 已开启
    */
    @SerializedName("LoginFlag")
    @Expose
    private Long LoginFlag;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险列表 
     * @return RiskInfo 风险列表
     */
    public AccessKeyRisk getRiskInfo() {
        return this.RiskInfo;
    }

    /**
     * Set 风险列表
     * @param RiskInfo 风险列表
     */
    public void setRiskInfo(AccessKeyRisk RiskInfo) {
        this.RiskInfo = RiskInfo;
    }

    /**
     * Get CAM策略总数 
     * @return CamCount CAM策略总数
     */
    public Long getCamCount() {
        return this.CamCount;
    }

    /**
     * Set CAM策略总数
     * @param CamCount CAM策略总数
     */
    public void setCamCount(Long CamCount) {
        this.CamCount = CamCount;
    }

    /**
     * Get 账号关联告警数量 
     * @return AlarmCount 账号关联告警数量
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set 账号关联告警数量
     * @param AlarmCount 账号关联告警数量
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get 访问方式 0 API 1 控制台与API 
     * @return AccessType 访问方式 0 API 1 控制台与API
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问方式 0 API 1 控制台与API
     * @param AccessType 访问方式 0 API 1 控制台与API
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 访问密钥告警数量列表 
     * @return AccessKeyAlarmCount 访问密钥告警数量列表
     */
    public AccessKeyAlarmCount [] getAccessKeyAlarmCount() {
        return this.AccessKeyAlarmCount;
    }

    /**
     * Set 访问密钥告警数量列表
     * @param AccessKeyAlarmCount 访问密钥告警数量列表
     */
    public void setAccessKeyAlarmCount(AccessKeyAlarmCount [] AccessKeyAlarmCount) {
        this.AccessKeyAlarmCount = AccessKeyAlarmCount;
    }

    /**
     * Get 操作保护是否开启 0 未开启 1 已开启 
     * @return ActionFlag 操作保护是否开启 0 未开启 1 已开启
     */
    public Long getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set 操作保护是否开启 0 未开启 1 已开启
     * @param ActionFlag 操作保护是否开启 0 未开启 1 已开启
     */
    public void setActionFlag(Long ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get 登录保护是否开启 0 未开启 1 已开启 
     * @return LoginFlag 登录保护是否开启 0 未开启 1 已开启
     */
    public Long getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set 登录保护是否开启 0 未开启 1 已开启
     * @param LoginFlag 登录保护是否开启 0 未开启 1 已开启
     */
    public void setLoginFlag(Long LoginFlag) {
        this.LoginFlag = LoginFlag;
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

    public DescribeAccessKeyRiskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessKeyRiskDetailResponse(DescribeAccessKeyRiskDetailResponse source) {
        if (source.RiskInfo != null) {
            this.RiskInfo = new AccessKeyRisk(source.RiskInfo);
        }
        if (source.CamCount != null) {
            this.CamCount = new Long(source.CamCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AccessKeyAlarmCount != null) {
            this.AccessKeyAlarmCount = new AccessKeyAlarmCount[source.AccessKeyAlarmCount.length];
            for (int i = 0; i < source.AccessKeyAlarmCount.length; i++) {
                this.AccessKeyAlarmCount[i] = new AccessKeyAlarmCount(source.AccessKeyAlarmCount[i]);
            }
        }
        if (source.ActionFlag != null) {
            this.ActionFlag = new Long(source.ActionFlag);
        }
        if (source.LoginFlag != null) {
            this.LoginFlag = new Long(source.LoginFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RiskInfo.", this.RiskInfo);
        this.setParamSimple(map, prefix + "CamCount", this.CamCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmCount.", this.AccessKeyAlarmCount);
        this.setParamSimple(map, prefix + "ActionFlag", this.ActionFlag);
        this.setParamSimple(map, prefix + "LoginFlag", this.LoginFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

