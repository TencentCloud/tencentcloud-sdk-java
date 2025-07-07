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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DislikeInfo extends AbstractModel {

    /**
    * 不喜欢的物料类别，对应物料上传协议中的字段名，如authorId，keyword，topic等
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * type对应字段名的值，如具体的topic名，作者id等
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 不喜欢的物料类别，对应物料上传协议中的字段名，如authorId，keyword，topic等 
     * @return Type 不喜欢的物料类别，对应物料上传协议中的字段名，如authorId，keyword，topic等
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 不喜欢的物料类别，对应物料上传协议中的字段名，如authorId，keyword，topic等
     * @param Type 不喜欢的物料类别，对应物料上传协议中的字段名，如authorId，keyword，topic等
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get type对应字段名的值，如具体的topic名，作者id等 
     * @return Value type对应字段名的值，如具体的topic名，作者id等
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set type对应字段名的值，如具体的topic名，作者id等
     * @param Value type对应字段名的值，如具体的topic名，作者id等
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public DislikeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DislikeInfo(DislikeInfo source) {
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

