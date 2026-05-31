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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeDetectContinuousResult extends AbstractModel {

    /**
    * 检测标签是否在当前区间内持续
    */
    @SerializedName("IsContinuousInRange")
    @Expose
    private Boolean IsContinuousInRange;

    /**
     * Get 检测标签是否在当前区间内持续 
     * @return IsContinuousInRange 检测标签是否在当前区间内持续
     */
    public Boolean getIsContinuousInRange() {
        return this.IsContinuousInRange;
    }

    /**
     * Set 检测标签是否在当前区间内持续
     * @param IsContinuousInRange 检测标签是否在当前区间内持续
     */
    public void setIsContinuousInRange(Boolean IsContinuousInRange) {
        this.IsContinuousInRange = IsContinuousInRange;
    }

    public SeeDetectContinuousResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeDetectContinuousResult(SeeDetectContinuousResult source) {
        if (source.IsContinuousInRange != null) {
            this.IsContinuousInRange = new Boolean(source.IsContinuousInRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsContinuousInRange", this.IsContinuousInRange);

    }
}

