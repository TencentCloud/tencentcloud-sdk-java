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
    * 作品名称
    */
    @SerializedName("WorkName")
    @Expose
    private String WorkName;

    /**
    * 监测状态
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 授权文件状态
    */
    @SerializedName("AuthStatus")
    @Expose
    private Long AuthStatus;

    /**
    * 委托书状态
    */
    @SerializedName("CommStatus")
    @Expose
    private Long CommStatus;

    /**
    * 是否著作权人
    */
    @SerializedName("IsProducer")
    @Expose
    private Long IsProducer;

    /**
    * 存证证书状态
    */
    @SerializedName("EvidenceStatus")
    @Expose
    private Long EvidenceStatus;

    /**
    * 作品类型
    */
    @SerializedName("WorkCategory")
    @Expose
    private String WorkCategory;

    /**
    * 是否原创
    */
    @SerializedName("IsOriginal")
    @Expose
    private String IsOriginal;

    /**
    * 是否已发表
    */
    @SerializedName("IsRelease")
    @Expose
    private String IsRelease;

    /**
    * 著作权人姓名
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 发表时间
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 白名单
    */
    @SerializedName("WhiteLists")
    @Expose
    private String [] WhiteLists;

    /**
    * 作品描述
    */
    @SerializedName("WorkDesc")
    @Expose
    private String WorkDesc;

    /**
    * 授权书
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * 授权书生效日期
    */
    @SerializedName("AuthorizationStartTime")
    @Expose
    private String AuthorizationStartTime;

    /**
    * 授权书截止日期
    */
    @SerializedName("AuthorizationEndTime")
    @Expose
    private String AuthorizationEndTime;

    /**
    * 委托书
    */
    @SerializedName("Commission")
    @Expose
    private String Commission;

    /**
    * 委托书生效日期
    */
    @SerializedName("CommissionStartTime")
    @Expose
    private String CommissionStartTime;

    /**
    * 委托书截止日期
    */
    @SerializedName("CommissionEndTime")
    @Expose
    private String CommissionEndTime;

    /**
    * 存证证书
    */
    @SerializedName("EvidenceUrl")
    @Expose
    private String EvidenceUrl;

    /**
    * 存证证书生效日期
    */
    @SerializedName("EvidenceStartTime")
    @Expose
    private String EvidenceStartTime;

    /**
    * 存证证书截止日期
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
     * Get 作品名称 
     * @return WorkName 作品名称
     */
    public String getWorkName() {
        return this.WorkName;
    }

    /**
     * Set 作品名称
     * @param WorkName 作品名称
     */
    public void setWorkName(String WorkName) {
        this.WorkName = WorkName;
    }

    /**
     * Get 监测状态 
     * @return MonitorStatus 监测状态
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监测状态
     * @param MonitorStatus 监测状态
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 授权文件状态 
     * @return AuthStatus 授权文件状态
     */
    public Long getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 授权文件状态
     * @param AuthStatus 授权文件状态
     */
    public void setAuthStatus(Long AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 委托书状态 
     * @return CommStatus 委托书状态
     */
    public Long getCommStatus() {
        return this.CommStatus;
    }

    /**
     * Set 委托书状态
     * @param CommStatus 委托书状态
     */
    public void setCommStatus(Long CommStatus) {
        this.CommStatus = CommStatus;
    }

    /**
     * Get 是否著作权人 
     * @return IsProducer 是否著作权人
     */
    public Long getIsProducer() {
        return this.IsProducer;
    }

    /**
     * Set 是否著作权人
     * @param IsProducer 是否著作权人
     */
    public void setIsProducer(Long IsProducer) {
        this.IsProducer = IsProducer;
    }

    /**
     * Get 存证证书状态 
     * @return EvidenceStatus 存证证书状态
     */
    public Long getEvidenceStatus() {
        return this.EvidenceStatus;
    }

    /**
     * Set 存证证书状态
     * @param EvidenceStatus 存证证书状态
     */
    public void setEvidenceStatus(Long EvidenceStatus) {
        this.EvidenceStatus = EvidenceStatus;
    }

    /**
     * Get 作品类型 
     * @return WorkCategory 作品类型
     */
    public String getWorkCategory() {
        return this.WorkCategory;
    }

    /**
     * Set 作品类型
     * @param WorkCategory 作品类型
     */
    public void setWorkCategory(String WorkCategory) {
        this.WorkCategory = WorkCategory;
    }

    /**
     * Get 是否原创 
     * @return IsOriginal 是否原创
     */
    public String getIsOriginal() {
        return this.IsOriginal;
    }

    /**
     * Set 是否原创
     * @param IsOriginal 是否原创
     */
    public void setIsOriginal(String IsOriginal) {
        this.IsOriginal = IsOriginal;
    }

    /**
     * Get 是否已发表 
     * @return IsRelease 是否已发表
     */
    public String getIsRelease() {
        return this.IsRelease;
    }

    /**
     * Set 是否已发表
     * @param IsRelease 是否已发表
     */
    public void setIsRelease(String IsRelease) {
        this.IsRelease = IsRelease;
    }

    /**
     * Get 著作权人姓名 
     * @return ProducerName 著作权人姓名
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 著作权人姓名
     * @param ProducerName 著作权人姓名
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 发表时间 
     * @return ProduceTime 发表时间
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 发表时间
     * @param ProduceTime 发表时间
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 白名单 
     * @return WhiteLists 白名单
     */
    public String [] getWhiteLists() {
        return this.WhiteLists;
    }

    /**
     * Set 白名单
     * @param WhiteLists 白名单
     */
    public void setWhiteLists(String [] WhiteLists) {
        this.WhiteLists = WhiteLists;
    }

    /**
     * Get 作品描述 
     * @return WorkDesc 作品描述
     */
    public String getWorkDesc() {
        return this.WorkDesc;
    }

    /**
     * Set 作品描述
     * @param WorkDesc 作品描述
     */
    public void setWorkDesc(String WorkDesc) {
        this.WorkDesc = WorkDesc;
    }

    /**
     * Get 授权书 
     * @return Authorization 授权书
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set 授权书
     * @param Authorization 授权书
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get 授权书生效日期 
     * @return AuthorizationStartTime 授权书生效日期
     */
    public String getAuthorizationStartTime() {
        return this.AuthorizationStartTime;
    }

    /**
     * Set 授权书生效日期
     * @param AuthorizationStartTime 授权书生效日期
     */
    public void setAuthorizationStartTime(String AuthorizationStartTime) {
        this.AuthorizationStartTime = AuthorizationStartTime;
    }

    /**
     * Get 授权书截止日期 
     * @return AuthorizationEndTime 授权书截止日期
     */
    public String getAuthorizationEndTime() {
        return this.AuthorizationEndTime;
    }

    /**
     * Set 授权书截止日期
     * @param AuthorizationEndTime 授权书截止日期
     */
    public void setAuthorizationEndTime(String AuthorizationEndTime) {
        this.AuthorizationEndTime = AuthorizationEndTime;
    }

    /**
     * Get 委托书 
     * @return Commission 委托书
     */
    public String getCommission() {
        return this.Commission;
    }

    /**
     * Set 委托书
     * @param Commission 委托书
     */
    public void setCommission(String Commission) {
        this.Commission = Commission;
    }

    /**
     * Get 委托书生效日期 
     * @return CommissionStartTime 委托书生效日期
     */
    public String getCommissionStartTime() {
        return this.CommissionStartTime;
    }

    /**
     * Set 委托书生效日期
     * @param CommissionStartTime 委托书生效日期
     */
    public void setCommissionStartTime(String CommissionStartTime) {
        this.CommissionStartTime = CommissionStartTime;
    }

    /**
     * Get 委托书截止日期 
     * @return CommissionEndTime 委托书截止日期
     */
    public String getCommissionEndTime() {
        return this.CommissionEndTime;
    }

    /**
     * Set 委托书截止日期
     * @param CommissionEndTime 委托书截止日期
     */
    public void setCommissionEndTime(String CommissionEndTime) {
        this.CommissionEndTime = CommissionEndTime;
    }

    /**
     * Get 存证证书 
     * @return EvidenceUrl 存证证书
     */
    public String getEvidenceUrl() {
        return this.EvidenceUrl;
    }

    /**
     * Set 存证证书
     * @param EvidenceUrl 存证证书
     */
    public void setEvidenceUrl(String EvidenceUrl) {
        this.EvidenceUrl = EvidenceUrl;
    }

    /**
     * Get 存证证书生效日期 
     * @return EvidenceStartTime 存证证书生效日期
     */
    public String getEvidenceStartTime() {
        return this.EvidenceStartTime;
    }

    /**
     * Set 存证证书生效日期
     * @param EvidenceStartTime 存证证书生效日期
     */
    public void setEvidenceStartTime(String EvidenceStartTime) {
        this.EvidenceStartTime = EvidenceStartTime;
    }

    /**
     * Get 存证证书截止日期 
     * @return EvidenceEndTime 存证证书截止日期
     */
    public String getEvidenceEndTime() {
        return this.EvidenceEndTime;
    }

    /**
     * Set 存证证书截止日期
     * @param EvidenceEndTime 存证证书截止日期
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

