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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Transition extends AbstractModel{

    /**
    * 触发时间（单位天）
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * 转换类型（1：归档；2：删除）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 触发时间（单位天） 
     * @return Days 触发时间（单位天）
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set 触发时间（单位天）
     * @param Days 触发时间（单位天）
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get 转换类型（1：归档；2：删除） 
     * @return Type 转换类型（1：归档；2：删除）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 转换类型（1：归档；2：删除）
     * @param Type 转换类型（1：归档；2：删除）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public Transition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transition(Transition source) {
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

