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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServersAndRiskAndFirstInfoResponse extends AbstractModel{

    /**
    * 风险文件数
    */
    @SerializedName("RiskFileCount")
    @Expose
    private Long RiskFileCount;

    /**
    * 今日新增风险文件数
    */
    @SerializedName("AddRiskFileCount")
    @Expose
    private Long AddRiskFileCount;

    /**
    * 受影响服务器台数
    */
    @SerializedName("ServersCount")
    @Expose
    private Long ServersCount;

    /**
    * 是否试用：true-是，false-否
    */
    @SerializedName("IsFirstCheck")
    @Expose
    private Boolean IsFirstCheck;

    /**
    * 木马最近检测时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险文件数 
     * @return RiskFileCount 风险文件数
     */
    public Long getRiskFileCount() {
        return this.RiskFileCount;
    }

    /**
     * Set 风险文件数
     * @param RiskFileCount 风险文件数
     */
    public void setRiskFileCount(Long RiskFileCount) {
        this.RiskFileCount = RiskFileCount;
    }

    /**
     * Get 今日新增风险文件数 
     * @return AddRiskFileCount 今日新增风险文件数
     */
    public Long getAddRiskFileCount() {
        return this.AddRiskFileCount;
    }

    /**
     * Set 今日新增风险文件数
     * @param AddRiskFileCount 今日新增风险文件数
     */
    public void setAddRiskFileCount(Long AddRiskFileCount) {
        this.AddRiskFileCount = AddRiskFileCount;
    }

    /**
     * Get 受影响服务器台数 
     * @return ServersCount 受影响服务器台数
     */
    public Long getServersCount() {
        return this.ServersCount;
    }

    /**
     * Set 受影响服务器台数
     * @param ServersCount 受影响服务器台数
     */
    public void setServersCount(Long ServersCount) {
        this.ServersCount = ServersCount;
    }

    /**
     * Get 是否试用：true-是，false-否 
     * @return IsFirstCheck 是否试用：true-是，false-否
     */
    public Boolean getIsFirstCheck() {
        return this.IsFirstCheck;
    }

    /**
     * Set 是否试用：true-是，false-否
     * @param IsFirstCheck 是否试用：true-是，false-否
     */
    public void setIsFirstCheck(Boolean IsFirstCheck) {
        this.IsFirstCheck = IsFirstCheck;
    }

    /**
     * Get 木马最近检测时间 
     * @return ScanTime 木马最近检测时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 木马最近检测时间
     * @param ScanTime 木马最近检测时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
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

    public DescribeServersAndRiskAndFirstInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServersAndRiskAndFirstInfoResponse(DescribeServersAndRiskAndFirstInfoResponse source) {
        if (source.RiskFileCount != null) {
            this.RiskFileCount = new Long(source.RiskFileCount);
        }
        if (source.AddRiskFileCount != null) {
            this.AddRiskFileCount = new Long(source.AddRiskFileCount);
        }
        if (source.ServersCount != null) {
            this.ServersCount = new Long(source.ServersCount);
        }
        if (source.IsFirstCheck != null) {
            this.IsFirstCheck = new Boolean(source.IsFirstCheck);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskFileCount", this.RiskFileCount);
        this.setParamSimple(map, prefix + "AddRiskFileCount", this.AddRiskFileCount);
        this.setParamSimple(map, prefix + "ServersCount", this.ServersCount);
        this.setParamSimple(map, prefix + "IsFirstCheck", this.IsFirstCheck);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

