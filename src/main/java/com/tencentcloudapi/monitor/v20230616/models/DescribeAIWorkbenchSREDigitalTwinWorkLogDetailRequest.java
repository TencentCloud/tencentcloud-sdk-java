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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIWorkbenchSREDigitalTwinWorkLogDetailRequest extends AbstractModel {

    /**
    * 工作日志ID
    */
    @SerializedName("WorkLogID")
    @Expose
    private Long WorkLogID;

    /**
     * Get 工作日志ID 
     * @return WorkLogID 工作日志ID
     */
    public Long getWorkLogID() {
        return this.WorkLogID;
    }

    /**
     * Set 工作日志ID
     * @param WorkLogID 工作日志ID
     */
    public void setWorkLogID(Long WorkLogID) {
        this.WorkLogID = WorkLogID;
    }

    public DescribeAIWorkbenchSREDigitalTwinWorkLogDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIWorkbenchSREDigitalTwinWorkLogDetailRequest(DescribeAIWorkbenchSREDigitalTwinWorkLogDetailRequest source) {
        if (source.WorkLogID != null) {
            this.WorkLogID = new Long(source.WorkLogID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkLogID", this.WorkLogID);

    }
}

