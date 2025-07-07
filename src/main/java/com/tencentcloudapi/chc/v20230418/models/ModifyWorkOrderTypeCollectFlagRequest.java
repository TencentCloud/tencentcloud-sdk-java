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

public class ModifyWorkOrderTypeCollectFlagRequest extends AbstractModel {

    /**
    * 工单类型的唯一英文标识
    */
    @SerializedName("WorkOrderType")
    @Expose
    private String WorkOrderType;

    /**
     * Get 工单类型的唯一英文标识 
     * @return WorkOrderType 工单类型的唯一英文标识
     */
    public String getWorkOrderType() {
        return this.WorkOrderType;
    }

    /**
     * Set 工单类型的唯一英文标识
     * @param WorkOrderType 工单类型的唯一英文标识
     */
    public void setWorkOrderType(String WorkOrderType) {
        this.WorkOrderType = WorkOrderType;
    }

    public ModifyWorkOrderTypeCollectFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkOrderTypeCollectFlagRequest(ModifyWorkOrderTypeCollectFlagRequest source) {
        if (source.WorkOrderType != null) {
            this.WorkOrderType = new String(source.WorkOrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkOrderType", this.WorkOrderType);

    }
}

