/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Key extends AbstractModel{

    /**
    * 自动识别的字段名称
    */
    @SerializedName("AutoName")
    @Expose
    private String AutoName;

    /**
     * Get 自动识别的字段名称 
     * @return AutoName 自动识别的字段名称
     */
    public String getAutoName() {
        return this.AutoName;
    }

    /**
     * Set 自动识别的字段名称
     * @param AutoName 自动识别的字段名称
     */
    public void setAutoName(String AutoName) {
        this.AutoName = AutoName;
    }

    public Key() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Key(Key source) {
        if (source.AutoName != null) {
            this.AutoName = new String(source.AutoName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoName", this.AutoName);

    }
}

