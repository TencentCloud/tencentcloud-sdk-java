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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportOrderRequest extends AbstractModel {

    /**
    * 订单编号唯一标识符
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 用量类型
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 上报月份，默认当前月
    */
    @SerializedName("ReportMonth")
    @Expose
    private String ReportMonth;

    /**
     * Get 订单编号唯一标识符 
     * @return OrderId 订单编号唯一标识符
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单编号唯一标识符
     * @param OrderId 订单编号唯一标识符
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 用量类型 
     * @return PackageType 用量类型
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 用量类型
     * @param PackageType 用量类型
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 上报月份，默认当前月 
     * @return ReportMonth 上报月份，默认当前月
     */
    public String getReportMonth() {
        return this.ReportMonth;
    }

    /**
     * Set 上报月份，默认当前月
     * @param ReportMonth 上报月份，默认当前月
     */
    public void setReportMonth(String ReportMonth) {
        this.ReportMonth = ReportMonth;
    }

    public ReportOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportOrderRequest(ReportOrderRequest source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ReportMonth != null) {
            this.ReportMonth = new String(source.ReportMonth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ReportMonth", this.ReportMonth);

    }
}

