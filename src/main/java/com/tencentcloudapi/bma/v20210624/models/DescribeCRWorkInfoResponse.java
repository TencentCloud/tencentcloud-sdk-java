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
    * xxx
    */
    @SerializedName("EvidenceStatus")
    @Expose
    private Long EvidenceStatus;

    /**
    * xxx
    */
    @SerializedName("WorkCategory")
    @Expose
    private String WorkCategory;

    /**
    * xxx
    */
    @SerializedName("IsOriginal")
    @Expose
    private String IsOriginal;

    /**
    * xxx
    */
    @SerializedName("IsRelease")
    @Expose
    private String IsRelease;

    /**
    * xxx
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * xxx
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * xxx
    */
    @SerializedName("WhiteLists")
    @Expose
    private String [] WhiteLists;

    /**
    * xxx
    */
    @SerializedName("WorkDesc")
    @Expose
    private String WorkDesc;

    /**
    * xxx
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * xxx
    */
    @SerializedName("AuthorizationStartTime")
    @Expose
    private String AuthorizationStartTime;

    /**
    * xxx
    */
    @SerializedName("AuthorizationEndTime")
    @Expose
    private String AuthorizationEndTime;

    /**
    * xxx
    */
    @SerializedName("Commission")
    @Expose
    private String Commission;

    /**
    * xxx
    */
    @SerializedName("CommissionStartTime")
    @Expose
    private String CommissionStartTime;

    /**
    * xxx
    */
    @SerializedName("CommissionEndTime")
    @Expose
    private String CommissionEndTime;

    /**
    * xxx
    */
    @SerializedName("EvidenceUrl")
    @Expose
    private String EvidenceUrl;

    /**
    * xxx
    */
    @SerializedName("EvidenceStartTime")
    @Expose
    private String EvidenceStartTime;

    /**
    * xxx
    */
    @SerializedName("EvidenceEndTime")
    @Expose
    private String EvidenceEndTime;

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
     * Get xxx 
     * @return EvidenceStatus xxx
     */
    public Long getEvidenceStatus() {
        return this.EvidenceStatus;
    }

    /**
     * Set xxx
     * @param EvidenceStatus xxx
     */
    public void setEvidenceStatus(Long EvidenceStatus) {
        this.EvidenceStatus = EvidenceStatus;
    }

    /**
     * Get xxx 
     * @return WorkCategory xxx
     */
    public String getWorkCategory() {
        return this.WorkCategory;
    }

    /**
     * Set xxx
     * @param WorkCategory xxx
     */
    public void setWorkCategory(String WorkCategory) {
        this.WorkCategory = WorkCategory;
    }

    /**
     * Get xxx 
     * @return IsOriginal xxx
     */
    public String getIsOriginal() {
        return this.IsOriginal;
    }

    /**
     * Set xxx
     * @param IsOriginal xxx
     */
    public void setIsOriginal(String IsOriginal) {
        this.IsOriginal = IsOriginal;
    }

    /**
     * Get xxx 
     * @return IsRelease xxx
     */
    public String getIsRelease() {
        return this.IsRelease;
    }

    /**
     * Set xxx
     * @param IsRelease xxx
     */
    public void setIsRelease(String IsRelease) {
        this.IsRelease = IsRelease;
    }

    /**
     * Get xxx 
     * @return ProducerName xxx
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set xxx
     * @param ProducerName xxx
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get xxx 
     * @return ProduceTime xxx
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set xxx
     * @param ProduceTime xxx
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get xxx 
     * @return WhiteLists xxx
     */
    public String [] getWhiteLists() {
        return this.WhiteLists;
    }

    /**
     * Set xxx
     * @param WhiteLists xxx
     */
    public void setWhiteLists(String [] WhiteLists) {
        this.WhiteLists = WhiteLists;
    }

    /**
     * Get xxx 
     * @return WorkDesc xxx
     */
    public String getWorkDesc() {
        return this.WorkDesc;
    }

    /**
     * Set xxx
     * @param WorkDesc xxx
     */
    public void setWorkDesc(String WorkDesc) {
        this.WorkDesc = WorkDesc;
    }

    /**
     * Get xxx 
     * @return Authorization xxx
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set xxx
     * @param Authorization xxx
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get xxx 
     * @return AuthorizationStartTime xxx
     */
    public String getAuthorizationStartTime() {
        return this.AuthorizationStartTime;
    }

    /**
     * Set xxx
     * @param AuthorizationStartTime xxx
     */
    public void setAuthorizationStartTime(String AuthorizationStartTime) {
        this.AuthorizationStartTime = AuthorizationStartTime;
    }

    /**
     * Get xxx 
     * @return AuthorizationEndTime xxx
     */
    public String getAuthorizationEndTime() {
        return this.AuthorizationEndTime;
    }

    /**
     * Set xxx
     * @param AuthorizationEndTime xxx
     */
    public void setAuthorizationEndTime(String AuthorizationEndTime) {
        this.AuthorizationEndTime = AuthorizationEndTime;
    }

    /**
     * Get xxx 
     * @return Commission xxx
     */
    public String getCommission() {
        return this.Commission;
    }

    /**
     * Set xxx
     * @param Commission xxx
     */
    public void setCommission(String Commission) {
        this.Commission = Commission;
    }

    /**
     * Get xxx 
     * @return CommissionStartTime xxx
     */
    public String getCommissionStartTime() {
        return this.CommissionStartTime;
    }

    /**
     * Set xxx
     * @param CommissionStartTime xxx
     */
    public void setCommissionStartTime(String CommissionStartTime) {
        this.CommissionStartTime = CommissionStartTime;
    }

    /**
     * Get xxx 
     * @return CommissionEndTime xxx
     */
    public String getCommissionEndTime() {
        return this.CommissionEndTime;
    }

    /**
     * Set xxx
     * @param CommissionEndTime xxx
     */
    public void setCommissionEndTime(String CommissionEndTime) {
        this.CommissionEndTime = CommissionEndTime;
    }

    /**
     * Get xxx 
     * @return EvidenceUrl xxx
     */
    public String getEvidenceUrl() {
        return this.EvidenceUrl;
    }

    /**
     * Set xxx
     * @param EvidenceUrl xxx
     */
    public void setEvidenceUrl(String EvidenceUrl) {
        this.EvidenceUrl = EvidenceUrl;
    }

    /**
     * Get xxx 
     * @return EvidenceStartTime xxx
     */
    public String getEvidenceStartTime() {
        return this.EvidenceStartTime;
    }

    /**
     * Set xxx
     * @param EvidenceStartTime xxx
     */
    public void setEvidenceStartTime(String EvidenceStartTime) {
        this.EvidenceStartTime = EvidenceStartTime;
    }

    /**
     * Get xxx 
     * @return EvidenceEndTime xxx
     */
    public String getEvidenceEndTime() {
        return this.EvidenceEndTime;
    }

    /**
     * Set xxx
     * @param EvidenceEndTime xxx
     */
    public void setEvidenceEndTime(String EvidenceEndTime) {
        this.EvidenceEndTime = EvidenceEndTime;
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
        if (source.EvidenceStatus != null) {
            this.EvidenceStatus = new Long(source.EvidenceStatus);
        }
        if (source.WorkCategory != null) {
            this.WorkCategory = new String(source.WorkCategory);
        }
        if (source.IsOriginal != null) {
            this.IsOriginal = new String(source.IsOriginal);
        }
        if (source.IsRelease != null) {
            this.IsRelease = new String(source.IsRelease);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.WhiteLists != null) {
            this.WhiteLists = new String[source.WhiteLists.length];
            for (int i = 0; i < source.WhiteLists.length; i++) {
                this.WhiteLists[i] = new String(source.WhiteLists[i]);
            }
        }
        if (source.WorkDesc != null) {
            this.WorkDesc = new String(source.WorkDesc);
        }
        if (source.Authorization != null) {
            this.Authorization = new String(source.Authorization);
        }
        if (source.AuthorizationStartTime != null) {
            this.AuthorizationStartTime = new String(source.AuthorizationStartTime);
        }
        if (source.AuthorizationEndTime != null) {
            this.AuthorizationEndTime = new String(source.AuthorizationEndTime);
        }
        if (source.Commission != null) {
            this.Commission = new String(source.Commission);
        }
        if (source.CommissionStartTime != null) {
            this.CommissionStartTime = new String(source.CommissionStartTime);
        }
        if (source.CommissionEndTime != null) {
            this.CommissionEndTime = new String(source.CommissionEndTime);
        }
        if (source.EvidenceUrl != null) {
            this.EvidenceUrl = new String(source.EvidenceUrl);
        }
        if (source.EvidenceStartTime != null) {
            this.EvidenceStartTime = new String(source.EvidenceStartTime);
        }
        if (source.EvidenceEndTime != null) {
            this.EvidenceEndTime = new String(source.EvidenceEndTime);
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
        this.setParamSimple(map, prefix + "EvidenceStatus", this.EvidenceStatus);
        this.setParamSimple(map, prefix + "WorkCategory", this.WorkCategory);
        this.setParamSimple(map, prefix + "IsOriginal", this.IsOriginal);
        this.setParamSimple(map, prefix + "IsRelease", this.IsRelease);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamArraySimple(map, prefix + "WhiteLists.", this.WhiteLists);
        this.setParamSimple(map, prefix + "WorkDesc", this.WorkDesc);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "AuthorizationStartTime", this.AuthorizationStartTime);
        this.setParamSimple(map, prefix + "AuthorizationEndTime", this.AuthorizationEndTime);
        this.setParamSimple(map, prefix + "Commission", this.Commission);
        this.setParamSimple(map, prefix + "CommissionStartTime", this.CommissionStartTime);
        this.setParamSimple(map, prefix + "CommissionEndTime", this.CommissionEndTime);
        this.setParamSimple(map, prefix + "EvidenceUrl", this.EvidenceUrl);
        this.setParamSimple(map, prefix + "EvidenceStartTime", this.EvidenceStartTime);
        this.setParamSimple(map, prefix + "EvidenceEndTime", this.EvidenceEndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

