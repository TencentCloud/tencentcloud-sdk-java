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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportImg extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 数据
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 数据 
     * @return Data 数据
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 数据
     * @param Data 数据
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public ReportImg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportImg(ReportImg source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

