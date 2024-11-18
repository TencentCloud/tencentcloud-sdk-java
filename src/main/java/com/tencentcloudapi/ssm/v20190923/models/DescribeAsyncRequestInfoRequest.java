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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncRequestInfoRequest extends AbstractModel {

    /**
    * 异步任务ID号
    */
    @SerializedName("FlowID")
    @Expose
    private Long FlowID;

    /**
     * Get 异步任务ID号 
     * @return FlowID 异步任务ID号
     */
    public Long getFlowID() {
        return this.FlowID;
    }

    /**
     * Set 异步任务ID号
     * @param FlowID 异步任务ID号
     */
    public void setFlowID(Long FlowID) {
        this.FlowID = FlowID;
    }

    public DescribeAsyncRequestInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncRequestInfoRequest(DescribeAsyncRequestInfoRequest source) {
        if (source.FlowID != null) {
            this.FlowID = new Long(source.FlowID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowID", this.FlowID);

    }
}

