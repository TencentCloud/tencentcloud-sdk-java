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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComponentInfoRequest extends AbstractModel {

    /**
    * 组件ID。
    */
    @SerializedName("ComponentId")
    @Expose
    private Long ComponentId;

    /**
     * Get 组件ID。 
     * @return ComponentId 组件ID。
     */
    public Long getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 组件ID。
     * @param ComponentId 组件ID。
     */
    public void setComponentId(Long ComponentId) {
        this.ComponentId = ComponentId;
    }

    public DescribeComponentInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComponentInfoRequest(DescribeComponentInfoRequest source) {
        if (source.ComponentId != null) {
            this.ComponentId = new Long(source.ComponentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);

    }
}

