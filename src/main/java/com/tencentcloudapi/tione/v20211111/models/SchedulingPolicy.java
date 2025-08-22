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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulingPolicy extends AbstractModel {

    /**
    * 是否启用了跨资源组调度开关
    */
    @SerializedName("CrossResourceGroupScheduling")
    @Expose
    private Boolean CrossResourceGroupScheduling;

    /**
     * Get 是否启用了跨资源组调度开关 
     * @return CrossResourceGroupScheduling 是否启用了跨资源组调度开关
     */
    public Boolean getCrossResourceGroupScheduling() {
        return this.CrossResourceGroupScheduling;
    }

    /**
     * Set 是否启用了跨资源组调度开关
     * @param CrossResourceGroupScheduling 是否启用了跨资源组调度开关
     */
    public void setCrossResourceGroupScheduling(Boolean CrossResourceGroupScheduling) {
        this.CrossResourceGroupScheduling = CrossResourceGroupScheduling;
    }

    public SchedulingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulingPolicy(SchedulingPolicy source) {
        if (source.CrossResourceGroupScheduling != null) {
            this.CrossResourceGroupScheduling = new Boolean(source.CrossResourceGroupScheduling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossResourceGroupScheduling", this.CrossResourceGroupScheduling);

    }
}

