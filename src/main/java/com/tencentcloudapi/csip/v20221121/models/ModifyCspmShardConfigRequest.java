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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCspmShardConfigRequest extends AbstractModel {

    /**
    * <p>开关状态</p>
    */
    @SerializedName("AutoShardStatus")
    @Expose
    private Long AutoShardStatus;

    /**
     * Get <p>开关状态</p> 
     * @return AutoShardStatus <p>开关状态</p>
     */
    public Long getAutoShardStatus() {
        return this.AutoShardStatus;
    }

    /**
     * Set <p>开关状态</p>
     * @param AutoShardStatus <p>开关状态</p>
     */
    public void setAutoShardStatus(Long AutoShardStatus) {
        this.AutoShardStatus = AutoShardStatus;
    }

    public ModifyCspmShardConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCspmShardConfigRequest(ModifyCspmShardConfigRequest source) {
        if (source.AutoShardStatus != null) {
            this.AutoShardStatus = new Long(source.AutoShardStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoShardStatus", this.AutoShardStatus);

    }
}

