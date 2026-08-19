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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportCustomerWorkOrderDetailRequest extends AbstractModel {

    /**
    * <p>要导出的工单的起始时间</p>
    */
    @SerializedName("BeginDateTime")
    @Expose
    private String BeginDateTime;

    /**
    * <p>要导出的工单的结束时间</p>
    */
    @SerializedName("EndDateTime")
    @Expose
    private String EndDateTime;

    /**
    * <p>服务工单类型</p>
    */
    @SerializedName("WorkOrderType")
    @Expose
    private String [] WorkOrderType;

    /**
     * Get <p>要导出的工单的起始时间</p> 
     * @return BeginDateTime <p>要导出的工单的起始时间</p>
     */
    public String getBeginDateTime() {
        return this.BeginDateTime;
    }

    /**
     * Set <p>要导出的工单的起始时间</p>
     * @param BeginDateTime <p>要导出的工单的起始时间</p>
     */
    public void setBeginDateTime(String BeginDateTime) {
        this.BeginDateTime = BeginDateTime;
    }

    /**
     * Get <p>要导出的工单的结束时间</p> 
     * @return EndDateTime <p>要导出的工单的结束时间</p>
     */
    public String getEndDateTime() {
        return this.EndDateTime;
    }

    /**
     * Set <p>要导出的工单的结束时间</p>
     * @param EndDateTime <p>要导出的工单的结束时间</p>
     */
    public void setEndDateTime(String EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    /**
     * Get <p>服务工单类型</p> 
     * @return WorkOrderType <p>服务工单类型</p>
     */
    public String [] getWorkOrderType() {
        return this.WorkOrderType;
    }

    /**
     * Set <p>服务工单类型</p>
     * @param WorkOrderType <p>服务工单类型</p>
     */
    public void setWorkOrderType(String [] WorkOrderType) {
        this.WorkOrderType = WorkOrderType;
    }

    public ExportCustomerWorkOrderDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportCustomerWorkOrderDetailRequest(ExportCustomerWorkOrderDetailRequest source) {
        if (source.BeginDateTime != null) {
            this.BeginDateTime = new String(source.BeginDateTime);
        }
        if (source.EndDateTime != null) {
            this.EndDateTime = new String(source.EndDateTime);
        }
        if (source.WorkOrderType != null) {
            this.WorkOrderType = new String[source.WorkOrderType.length];
            for (int i = 0; i < source.WorkOrderType.length; i++) {
                this.WorkOrderType[i] = new String(source.WorkOrderType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginDateTime", this.BeginDateTime);
        this.setParamSimple(map, prefix + "EndDateTime", this.EndDateTime);
        this.setParamArraySimple(map, prefix + "WorkOrderType.", this.WorkOrderType);

    }
}

