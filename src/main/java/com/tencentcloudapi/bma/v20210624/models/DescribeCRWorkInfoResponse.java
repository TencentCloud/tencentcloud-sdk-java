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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCRWorkInfoResponse extends AbstractModel{

    /**
    * x
    */
    @SerializedName("WorkName")
    @Expose
    private String WorkName;

    /**
    * x
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * x
    */
    @SerializedName("AuthStatus")
    @Expose
    private Long AuthStatus;

    /**
    * x
    */
    @SerializedName("CommStatus")
    @Expose
    private Long CommStatus;

    /**
    * x
    */
    @SerializedName("IsProducer")
    @Expose
    private Long IsProducer;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get x 
     * @return WorkName x
     */
    public String getWorkName() {
        return this.WorkName;
    }

    /**
     * Set x
     * @param WorkName x
     */
    public void setWorkName(String WorkName) {
        this.WorkName = WorkName;
    }

    /**
     * Get x 
     * @return MonitorStatus x
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set x
     * @param MonitorStatus x
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get x 
     * @return AuthStatus x
     */
    public Long getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set x
     * @param AuthStatus x
     */
    public void setAuthStatus(Long AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get x 
     * @return CommStatus x
     */
    public Long getCommStatus() {
        return this.CommStatus;
    }

    /**
     * Set x
     * @param CommStatus x
     */
    public void setCommStatus(Long CommStatus) {
        this.CommStatus = CommStatus;
    }

    /**
     * Get x 
     * @return IsProducer x
     */
    public Long getIsProducer() {
        return this.IsProducer;
    }

    /**
     * Set x
     * @param IsProducer x
     */
    public void setIsProducer(Long IsProducer) {
        this.IsProducer = IsProducer;
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

    public DescribeCRWorkInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCRWorkInfoResponse(DescribeCRWorkInfoResponse source) {
        if (source.WorkName != null) {
            this.WorkName = new String(source.WorkName);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new Long(source.AuthStatus);
        }
        if (source.CommStatus != null) {
            this.CommStatus = new Long(source.CommStatus);
        }
        if (source.IsProducer != null) {
            this.IsProducer = new Long(source.IsProducer);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkName", this.WorkName);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamSimple(map, prefix + "CommStatus", this.CommStatus);
        this.setParamSimple(map, prefix + "IsProducer", this.IsProducer);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

