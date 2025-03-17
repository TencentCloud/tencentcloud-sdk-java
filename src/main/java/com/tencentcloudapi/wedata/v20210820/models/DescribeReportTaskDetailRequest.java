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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportTaskDetailRequest extends AbstractModel {

    /**
    * 租户id
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 引擎任务id
    */
    @SerializedName("EngineTaskId")
    @Expose
    private String EngineTaskId;

    /**
     * Get 租户id 
     * @return TenantId 租户id
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
     * @param TenantId 租户id
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 引擎任务id 
     * @return EngineTaskId 引擎任务id
     */
    public String getEngineTaskId() {
        return this.EngineTaskId;
    }

    /**
     * Set 引擎任务id
     * @param EngineTaskId 引擎任务id
     */
    public void setEngineTaskId(String EngineTaskId) {
        this.EngineTaskId = EngineTaskId;
    }

    public DescribeReportTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportTaskDetailRequest(DescribeReportTaskDetailRequest source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.EngineTaskId != null) {
            this.EngineTaskId = new String(source.EngineTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "EngineTaskId", this.EngineTaskId);

    }
}

