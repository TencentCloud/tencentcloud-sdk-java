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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralTaskParam extends AbstractModel{

    /**
    * 通用任务参数类型,例：SPARK_SQL
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 通用任务参数内容,直接作用于任务的参数。不同参数用;
分割
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 通用任务参数类型,例：SPARK_SQL 
     * @return Type 通用任务参数类型,例：SPARK_SQL
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 通用任务参数类型,例：SPARK_SQL
     * @param Type 通用任务参数类型,例：SPARK_SQL
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 通用任务参数内容,直接作用于任务的参数。不同参数用;
分割 
     * @return Value 通用任务参数内容,直接作用于任务的参数。不同参数用;
分割
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 通用任务参数内容,直接作用于任务的参数。不同参数用;
分割
     * @param Value 通用任务参数内容,直接作用于任务的参数。不同参数用;
分割
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public GeneralTaskParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralTaskParam(GeneralTaskParam source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

