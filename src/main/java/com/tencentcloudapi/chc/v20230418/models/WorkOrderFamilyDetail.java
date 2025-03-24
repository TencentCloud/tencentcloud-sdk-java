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

public class WorkOrderFamilyDetail extends AbstractModel {

    /**
    * 工单类型大类的名称
    */
    @SerializedName("WorkOrderFamily")
    @Expose
    private String WorkOrderFamily;

    /**
    * 工单类型详情列表
    */
    @SerializedName("WorkOrderTypeSet")
    @Expose
    private WorkOrderTypeDetail [] WorkOrderTypeSet;

    /**
     * Get 工单类型大类的名称 
     * @return WorkOrderFamily 工单类型大类的名称
     */
    public String getWorkOrderFamily() {
        return this.WorkOrderFamily;
    }

    /**
     * Set 工单类型大类的名称
     * @param WorkOrderFamily 工单类型大类的名称
     */
    public void setWorkOrderFamily(String WorkOrderFamily) {
        this.WorkOrderFamily = WorkOrderFamily;
    }

    /**
     * Get 工单类型详情列表 
     * @return WorkOrderTypeSet 工单类型详情列表
     */
    public WorkOrderTypeDetail [] getWorkOrderTypeSet() {
        return this.WorkOrderTypeSet;
    }

    /**
     * Set 工单类型详情列表
     * @param WorkOrderTypeSet 工单类型详情列表
     */
    public void setWorkOrderTypeSet(WorkOrderTypeDetail [] WorkOrderTypeSet) {
        this.WorkOrderTypeSet = WorkOrderTypeSet;
    }

    public WorkOrderFamilyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkOrderFamilyDetail(WorkOrderFamilyDetail source) {
        if (source.WorkOrderFamily != null) {
            this.WorkOrderFamily = new String(source.WorkOrderFamily);
        }
        if (source.WorkOrderTypeSet != null) {
            this.WorkOrderTypeSet = new WorkOrderTypeDetail[source.WorkOrderTypeSet.length];
            for (int i = 0; i < source.WorkOrderTypeSet.length; i++) {
                this.WorkOrderTypeSet[i] = new WorkOrderTypeDetail(source.WorkOrderTypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkOrderFamily", this.WorkOrderFamily);
        this.setParamArrayObj(map, prefix + "WorkOrderTypeSet.", this.WorkOrderTypeSet);

    }
}

