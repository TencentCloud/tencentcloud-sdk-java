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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunOneClickTaskExternalRequest extends AbstractModel{

    /**
    * 外部任务Id 最长64字节
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
     * Get 外部任务Id 最长64字节 
     * @return ExternalId 外部任务Id 最长64字节
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set 外部任务Id 最长64字节
     * @param ExternalId 外部任务Id 最长64字节
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public DescribeCloudBaseRunOneClickTaskExternalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunOneClickTaskExternalRequest(DescribeCloudBaseRunOneClickTaskExternalRequest source) {
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);

    }
}

