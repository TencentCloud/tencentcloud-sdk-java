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
    * <p>订单编号唯一标识符</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>用量类型</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>上报月份，默认当前月</p>
    */
    @SerializedName("ReportMonth")
    @Expose
    private String ReportMonth;

    /**
     * Get <p>订单编号唯一标识符</p> 
     * @return OrderId <p>订单编号唯一标识符</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单编号唯一标识符</p>
     * @param OrderId <p>订单编号唯一标识符</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>用量类型</p> 
     * @return PackageType <p>用量类型</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>用量类型</p>
     * @param PackageType <p>用量类型</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>上报月份，默认当前月</p> 
     * @return ReportMonth <p>上报月份，默认当前月</p>
     */
    public String getReportMonth() {
        return this.ReportMonth;
    }

    /**
     * Set <p>上报月份，默认当前月</p>
     * @param ReportMonth <p>上报月份，默认当前月</p>
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

