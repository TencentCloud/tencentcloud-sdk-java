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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcLimit extends AbstractModel {

    /**
    * 私有网络配额描述
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * 私有网络配额值
    */
    @SerializedName("LimitValue")
    @Expose
    private Long LimitValue;

    /**
     * Get 私有网络配额描述 
     * @return LimitType 私有网络配额描述
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set 私有网络配额描述
     * @param LimitType 私有网络配额描述
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get 私有网络配额值 
     * @return LimitValue 私有网络配额值
     */
    public Long getLimitValue() {
        return this.LimitValue;
    }

    /**
     * Set 私有网络配额值
     * @param LimitValue 私有网络配额值
     */
    public void setLimitValue(Long LimitValue) {
        this.LimitValue = LimitValue;
    }

    public VpcLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcLimit(VpcLimit source) {
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
        if (source.LimitValue != null) {
            this.LimitValue = new Long(source.LimitValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "LimitValue", this.LimitValue);

    }
}

