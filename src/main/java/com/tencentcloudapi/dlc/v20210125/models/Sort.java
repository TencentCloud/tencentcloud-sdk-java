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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel {

    /**
    * 排序字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 是否按照ASC排序，否则DESC排序
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
     * Get 排序字段 
     * @return Field 排序字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 排序字段
     * @param Field 排序字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 是否按照ASC排序，否则DESC排序 
     * @return Asc 是否按照ASC排序，否则DESC排序
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 是否按照ASC排序，否则DESC排序
     * @param Asc 是否按照ASC排序，否则DESC排序
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    public Sort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sort(Sort source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

