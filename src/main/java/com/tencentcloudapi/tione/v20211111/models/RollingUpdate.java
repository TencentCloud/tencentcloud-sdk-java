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

public class RollingUpdate extends AbstractModel {

    /**
    * 滚动更新的最大不可用
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private NumOrPercent MaxUnavailable;

    /**
    * 滚动更新的最大新增实例
    */
    @SerializedName("MaxSurge")
    @Expose
    private NumOrPercent MaxSurge;

    /**
     * Get 滚动更新的最大不可用 
     * @return MaxUnavailable 滚动更新的最大不可用
     */
    public NumOrPercent getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set 滚动更新的最大不可用
     * @param MaxUnavailable 滚动更新的最大不可用
     */
    public void setMaxUnavailable(NumOrPercent MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    /**
     * Get 滚动更新的最大新增实例 
     * @return MaxSurge 滚动更新的最大新增实例
     */
    public NumOrPercent getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set 滚动更新的最大新增实例
     * @param MaxSurge 滚动更新的最大新增实例
     */
    public void setMaxSurge(NumOrPercent MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    public RollingUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollingUpdate(RollingUpdate source) {
        if (source.MaxUnavailable != null) {
            this.MaxUnavailable = new NumOrPercent(source.MaxUnavailable);
        }
        if (source.MaxSurge != null) {
            this.MaxSurge = new NumOrPercent(source.MaxSurge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MaxUnavailable.", this.MaxUnavailable);
        this.setParamObj(map, prefix + "MaxSurge.", this.MaxSurge);

    }
}

