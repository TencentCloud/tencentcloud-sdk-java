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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDetail extends AbstractModel {

    /**
    * <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>业务系统ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>用户appid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>主账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUIN")
    @Expose
    private String CreateUIN;

    /**
    * <p>应用名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>应用描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>业务系统名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableThresholdConfig")
    @Expose
    private Boolean EnableThresholdConfig;

    /**
    * <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p><p>单位：%</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p><p>单位：ms</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
     * Get <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>业务系统ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey <p>业务系统ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>业务系统ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey <p>业务系统ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get <p>用户appid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID <p>用户appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>用户appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID <p>用户appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>主账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUIN <p>主账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUIN() {
        return this.CreateUIN;
    }

    /**
     * Set <p>主账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUIN <p>主账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUIN(String CreateUIN) {
        this.CreateUIN = CreateUIN;
    }

    /**
     * Get <p>应用名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>应用名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>应用名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>应用名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>应用描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDescription <p>应用描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set <p>应用描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDescription <p>应用描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>业务系统名称</p> 
     * @return InstanceName <p>业务系统名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>业务系统名称</p>
     * @param InstanceName <p>业务系统名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableThresholdConfig <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableThresholdConfig() {
        return this.EnableThresholdConfig;
    }

    /**
     * Set <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableThresholdConfig <p>阈值配置开关。true 表示使用应用级阈值；false 表示使用业务系统级阈值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableThresholdConfig(Boolean EnableThresholdConfig) {
        this.EnableThresholdConfig = EnableThresholdConfig;
    }

    /**
     * Get <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p><p>单位：%</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrRateThreshold <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p><p>单位：%</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p><p>单位：%</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrRateThreshold <p>错误率阈值（%），用于判断应用健康状态为&quot;红色&quot;</p><p>单位：%</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p><p>单位：ms</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseDurationWarningThreshold <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p><p>单位：ms</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p><p>单位：ms</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseDurationWarningThreshold <p>响应时间预警阈值（ms），用于判断应用健康状态为&quot;黄色&quot;</p><p>单位：ms</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    public ServiceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDetail(ServiceDetail source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CreateUIN != null) {
            this.CreateUIN = new String(source.CreateUIN);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.EnableThresholdConfig != null) {
            this.EnableThresholdConfig = new Boolean(source.EnableThresholdConfig);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CreateUIN", this.CreateUIN);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "EnableThresholdConfig", this.EnableThresholdConfig);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);

    }
}

