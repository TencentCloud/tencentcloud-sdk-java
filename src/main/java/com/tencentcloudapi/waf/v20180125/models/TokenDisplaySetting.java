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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenDisplaySetting extends AbstractModel {

    /**
    * 是否使用payload字段作为显示token
    */
    @SerializedName("DisplayWithPayloadEnable")
    @Expose
    private Boolean DisplayWithPayloadEnable;

    /**
    * 用于显示的payload字段名
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
     * Get 是否使用payload字段作为显示token 
     * @return DisplayWithPayloadEnable 是否使用payload字段作为显示token
     */
    public Boolean getDisplayWithPayloadEnable() {
        return this.DisplayWithPayloadEnable;
    }

    /**
     * Set 是否使用payload字段作为显示token
     * @param DisplayWithPayloadEnable 是否使用payload字段作为显示token
     */
    public void setDisplayWithPayloadEnable(Boolean DisplayWithPayloadEnable) {
        this.DisplayWithPayloadEnable = DisplayWithPayloadEnable;
    }

    /**
     * Get 用于显示的payload字段名 
     * @return FieldName 用于显示的payload字段名
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 用于显示的payload字段名
     * @param FieldName 用于显示的payload字段名
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public TokenDisplaySetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenDisplaySetting(TokenDisplaySetting source) {
        if (source.DisplayWithPayloadEnable != null) {
            this.DisplayWithPayloadEnable = new Boolean(source.DisplayWithPayloadEnable);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayWithPayloadEnable", this.DisplayWithPayloadEnable);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);

    }
}

