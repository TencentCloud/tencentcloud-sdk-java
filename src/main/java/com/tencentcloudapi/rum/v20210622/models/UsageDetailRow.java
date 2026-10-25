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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetailRow extends AbstractModel {

    /**
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>业务系统名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>业务系统状态</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>端类型</p>
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * <p>应用状态</p>
    */
    @SerializedName("AppStatus")
    @Expose
    private Long AppStatus;

    /**
    * <p>上报量</p>
    */
    @SerializedName("ReportVolume")
    @Expose
    private Long ReportVolume;

    /**
    * <p>占当前结果集比例</p>
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * <p>行趋势</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ByDate")
    @Expose
    private UsageTimePoint [] ByDate;

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceId <p>业务系统 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceId <p>业务系统 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>业务系统状态</p> 
     * @return InstanceStatus <p>业务系统状态</p>
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>业务系统状态</p>
     * @param InstanceStatus <p>业务系统状态</p>
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用名称</p> 
     * @return AppName <p>应用名称</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用名称</p>
     * @param AppName <p>应用名称</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>端类型</p> 
     * @return AppType <p>端类型</p>
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>端类型</p>
     * @param AppType <p>端类型</p>
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>应用状态</p> 
     * @return AppStatus <p>应用状态</p>
     */
    public Long getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set <p>应用状态</p>
     * @param AppStatus <p>应用状态</p>
     */
    public void setAppStatus(Long AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get <p>上报量</p> 
     * @return ReportVolume <p>上报量</p>
     */
    public Long getReportVolume() {
        return this.ReportVolume;
    }

    /**
     * Set <p>上报量</p>
     * @param ReportVolume <p>上报量</p>
     */
    public void setReportVolume(Long ReportVolume) {
        this.ReportVolume = ReportVolume;
    }

    /**
     * Get <p>占当前结果集比例</p> 
     * @return Percent <p>占当前结果集比例</p>
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>占当前结果集比例</p>
     * @param Percent <p>占当前结果集比例</p>
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>行趋势</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ByDate <p>行趋势</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageTimePoint [] getByDate() {
        return this.ByDate;
    }

    /**
     * Set <p>行趋势</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ByDate <p>行趋势</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setByDate(UsageTimePoint [] ByDate) {
        this.ByDate = ByDate;
    }

    public UsageDetailRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetailRow(UsageDetailRow source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Long(source.AppStatus);
        }
        if (source.ReportVolume != null) {
            this.ReportVolume = new Long(source.ReportVolume);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.ByDate != null) {
            this.ByDate = new UsageTimePoint[source.ByDate.length];
            for (int i = 0; i < source.ByDate.length; i++) {
                this.ByDate[i] = new UsageTimePoint(source.ByDate[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "ReportVolume", this.ReportVolume);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "ByDate.", this.ByDate);

    }
}

