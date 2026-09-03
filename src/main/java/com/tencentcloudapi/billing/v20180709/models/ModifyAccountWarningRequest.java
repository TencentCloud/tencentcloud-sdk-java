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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountWarningRequest extends AbstractModel {

    /**
    * 余额阈值（单位：国内分、国际美分）
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 是否开启余额告警 1 开启 0 关闭
    */
    @SerializedName("Open")
    @Expose
    private Long Open;

    /**
     * Get 余额阈值（单位：国内分、国际美分） 
     * @return Threshold 余额阈值（单位：国内分、国际美分）
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 余额阈值（单位：国内分、国际美分）
     * @param Threshold 余额阈值（单位：国内分、国际美分）
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 是否开启余额告警 1 开启 0 关闭 
     * @return Open 是否开启余额告警 1 开启 0 关闭
     */
    public Long getOpen() {
        return this.Open;
    }

    /**
     * Set 是否开启余额告警 1 开启 0 关闭
     * @param Open 是否开启余额告警 1 开启 0 关闭
     */
    public void setOpen(Long Open) {
        this.Open = Open;
    }

    public ModifyAccountWarningRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountWarningRequest(ModifyAccountWarningRequest source) {
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Open != null) {
            this.Open = new Long(source.Open);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Open", this.Open);

    }
}

