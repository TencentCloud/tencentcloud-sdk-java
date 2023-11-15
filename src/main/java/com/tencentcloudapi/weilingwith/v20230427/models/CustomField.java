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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomField extends AbstractModel {

    /**
    * 字段id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 字段内容
    */
    @SerializedName("Val")
    @Expose
    private String Val;

    /**
     * Get 字段id 
     * @return Id 字段id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 字段id
     * @param Id 字段id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 字段内容 
     * @return Val 字段内容
     */
    public String getVal() {
        return this.Val;
    }

    /**
     * Set 字段内容
     * @param Val 字段内容
     */
    public void setVal(String Val) {
        this.Val = Val;
    }

    public CustomField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomField(CustomField source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Val != null) {
            this.Val = new String(source.Val);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Val", this.Val);

    }
}

