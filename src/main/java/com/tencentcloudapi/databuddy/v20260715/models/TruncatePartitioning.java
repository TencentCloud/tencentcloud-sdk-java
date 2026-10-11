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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TruncatePartitioning extends AbstractModel {

    /**
    * 字段名
    */
    @SerializedName("FiledName")
    @Expose
    private String FiledName;

    /**
    * 截取长度
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
     * Get 字段名 
     * @return FiledName 字段名
     */
    public String getFiledName() {
        return this.FiledName;
    }

    /**
     * Set 字段名
     * @param FiledName 字段名
     */
    public void setFiledName(String FiledName) {
        this.FiledName = FiledName;
    }

    /**
     * Get 截取长度 
     * @return Width 截取长度
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 截取长度
     * @param Width 截取长度
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    public TruncatePartitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TruncatePartitioning(TruncatePartitioning source) {
        if (source.FiledName != null) {
            this.FiledName = new String(source.FiledName);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FiledName", this.FiledName);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

