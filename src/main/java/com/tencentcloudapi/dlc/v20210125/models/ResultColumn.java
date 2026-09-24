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

public class ResultColumn extends AbstractModel {

    /**
    * <p>列名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>列数据类型（如 int / string）。</p>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <p>列注释。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>是否可为 NULL。</p>
    */
    @SerializedName("Nullable")
    @Expose
    private Boolean Nullable;

    /**
     * Get <p>列名。</p> 
     * @return Name <p>列名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>列名。</p>
     * @param Name <p>列名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>列数据类型（如 int / string）。</p> 
     * @return DataType <p>列数据类型（如 int / string）。</p>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set <p>列数据类型（如 int / string）。</p>
     * @param DataType <p>列数据类型（如 int / string）。</p>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <p>列注释。</p> 
     * @return Comment <p>列注释。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>列注释。</p>
     * @param Comment <p>列注释。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>是否可为 NULL。</p> 
     * @return Nullable <p>是否可为 NULL。</p>
     */
    public Boolean getNullable() {
        return this.Nullable;
    }

    /**
     * Set <p>是否可为 NULL。</p>
     * @param Nullable <p>是否可为 NULL。</p>
     */
    public void setNullable(Boolean Nullable) {
        this.Nullable = Nullable;
    }

    public ResultColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultColumn(ResultColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Nullable != null) {
            this.Nullable = new Boolean(source.Nullable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Nullable", this.Nullable);

    }
}

