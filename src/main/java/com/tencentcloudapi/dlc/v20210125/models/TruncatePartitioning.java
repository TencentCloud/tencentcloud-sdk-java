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

public class TruncatePartitioning extends AbstractModel {

    /**
    * <p>截取长度</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>字段名</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
     * Get <p>截取长度</p> 
     * @return Width <p>截取长度</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>截取长度</p>
     * @param Width <p>截取长度</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>字段名</p> 
     * @return FieldName <p>字段名</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名</p>
     * @param FieldName <p>字段名</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public TruncatePartitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TruncatePartitioning(TruncatePartitioning source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);

    }
}

