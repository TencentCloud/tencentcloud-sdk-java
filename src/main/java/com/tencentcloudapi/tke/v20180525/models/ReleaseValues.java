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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseValues extends AbstractModel {

    /**
    * 自定义参数原始值
    */
    @SerializedName("RawOriginal")
    @Expose
    private String RawOriginal;

    /**
    * 自定义参数值类型
    */
    @SerializedName("ValuesType")
    @Expose
    private String ValuesType;

    /**
     * Get 自定义参数原始值 
     * @return RawOriginal 自定义参数原始值
     */
    public String getRawOriginal() {
        return this.RawOriginal;
    }

    /**
     * Set 自定义参数原始值
     * @param RawOriginal 自定义参数原始值
     */
    public void setRawOriginal(String RawOriginal) {
        this.RawOriginal = RawOriginal;
    }

    /**
     * Get 自定义参数值类型 
     * @return ValuesType 自定义参数值类型
     */
    public String getValuesType() {
        return this.ValuesType;
    }

    /**
     * Set 自定义参数值类型
     * @param ValuesType 自定义参数值类型
     */
    public void setValuesType(String ValuesType) {
        this.ValuesType = ValuesType;
    }

    public ReleaseValues() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseValues(ReleaseValues source) {
        if (source.RawOriginal != null) {
            this.RawOriginal = new String(source.RawOriginal);
        }
        if (source.ValuesType != null) {
            this.ValuesType = new String(source.ValuesType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RawOriginal", this.RawOriginal);
        this.setParamSimple(map, prefix + "ValuesType", this.ValuesType);

    }
}

