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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseClientQPSPolicy extends AbstractModel {

    /**
    * UserID 或 ClientIP 或 None，如果为 None 代表不限制
    */
    @SerializedName("LimitBy")
    @Expose
    private String LimitBy;

    /**
    * 限制值
    */
    @SerializedName("LimitValue")
    @Expose
    private Long LimitValue;

    /**
     * Get UserID 或 ClientIP 或 None，如果为 None 代表不限制 
     * @return LimitBy UserID 或 ClientIP 或 None，如果为 None 代表不限制
     */
    public String getLimitBy() {
        return this.LimitBy;
    }

    /**
     * Set UserID 或 ClientIP 或 None，如果为 None 代表不限制
     * @param LimitBy UserID 或 ClientIP 或 None，如果为 None 代表不限制
     */
    public void setLimitBy(String LimitBy) {
        this.LimitBy = LimitBy;
    }

    /**
     * Get 限制值 
     * @return LimitValue 限制值
     */
    public Long getLimitValue() {
        return this.LimitValue;
    }

    /**
     * Set 限制值
     * @param LimitValue 限制值
     */
    public void setLimitValue(Long LimitValue) {
        this.LimitValue = LimitValue;
    }

    public CloudBaseClientQPSPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseClientQPSPolicy(CloudBaseClientQPSPolicy source) {
        if (source.LimitBy != null) {
            this.LimitBy = new String(source.LimitBy);
        }
        if (source.LimitValue != null) {
            this.LimitValue = new Long(source.LimitValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitBy", this.LimitBy);
        this.setParamSimple(map, prefix + "LimitValue", this.LimitValue);

    }
}

