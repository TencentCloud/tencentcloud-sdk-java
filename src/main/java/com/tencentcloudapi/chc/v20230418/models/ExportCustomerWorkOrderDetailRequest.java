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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportCustomerWorkOrderDetailRequest extends AbstractModel {

    /**
    * 服务工单类型
    */
    @SerializedName("WorkOrderType")
    @Expose
    private String [] WorkOrderType;

    /**
    * 要导出的工单的起始时间
    */
    @SerializedName("BeginDateTime")
    @Expose
    private String BeginDateTime;

    /**
    * 要导出的工单的结束时间
    */
    @SerializedName("EndDateTime")
    @Expose
    private String EndDateTime;

    /**
     * Get 服务工单类型 
     * @return WorkOrderType 服务工单类型
     */
    public String [] getWorkOrderType() {
        return this.WorkOrderType;
    }

    /**
     * Set 服务工单类型
     * @param WorkOrderType 服务工单类型
     */
    public void setWorkOrderType(String [] WorkOrderType) {
        this.WorkOrderType = WorkOrderType;
    }

    /**
     * Get 要导出的工单的起始时间 
     * @return BeginDateTime 要导出的工单的起始时间
     */
    public String getBeginDateTime() {
        return this.BeginDateTime;
    }

    /**
     * Set 要导出的工单的起始时间
     * @param BeginDateTime 要导出的工单的起始时间
     */
    public void setBeginDateTime(String BeginDateTime) {
        this.BeginDateTime = BeginDateTime;
    }

    /**
     * Get 要导出的工单的结束时间 
     * @return EndDateTime 要导出的工单的结束时间
     */
    public String getEndDateTime() {
        return this.EndDateTime;
    }

    /**
     * Set 要导出的工单的结束时间
     * @param EndDateTime 要导出的工单的结束时间
     */
    public void setEndDateTime(String EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    public ExportCustomerWorkOrderDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportCustomerWorkOrderDetailRequest(ExportCustomerWorkOrderDetailRequest source) {
        if (source.WorkOrderType != null) {
            this.WorkOrderType = new String[source.WorkOrderType.length];
            for (int i = 0; i < source.WorkOrderType.length; i++) {
                this.WorkOrderType[i] = new String(source.WorkOrderType[i]);
            }
        }
        if (source.BeginDateTime != null) {
            this.BeginDateTime = new String(source.BeginDateTime);
        }
        if (source.EndDateTime != null) {
            this.EndDateTime = new String(source.EndDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WorkOrderType.", this.WorkOrderType);
        this.setParamSimple(map, prefix + "BeginDateTime", this.BeginDateTime);
        this.setParamSimple(map, prefix + "EndDateTime", this.EndDateTime);

    }
}

