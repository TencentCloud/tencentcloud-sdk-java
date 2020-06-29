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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldInfo extends AbstractModel{

    /**
    * 表格字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 字段是否是主键字段
    */
    @SerializedName("IsPrimaryKey")
    @Expose
    private String IsPrimaryKey;

    /**
    * 字段类型
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * 字段长度
    */
    @SerializedName("FieldSize")
    @Expose
    private Long FieldSize;

    /**
     * Get 表格字段名称 
     * @return FieldName 表格字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 表格字段名称
     * @param FieldName 表格字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 字段是否是主键字段 
     * @return IsPrimaryKey 字段是否是主键字段
     */
    public String getIsPrimaryKey() {
        return this.IsPrimaryKey;
    }

    /**
     * Set 字段是否是主键字段
     * @param IsPrimaryKey 字段是否是主键字段
     */
    public void setIsPrimaryKey(String IsPrimaryKey) {
        this.IsPrimaryKey = IsPrimaryKey;
    }

    /**
     * Get 字段类型 
     * @return FieldType 字段类型
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set 字段类型
     * @param FieldType 字段类型
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get 字段长度 
     * @return FieldSize 字段长度
     */
    public Long getFieldSize() {
        return this.FieldSize;
    }

    /**
     * Set 字段长度
     * @param FieldSize 字段长度
     */
    public void setFieldSize(Long FieldSize) {
        this.FieldSize = FieldSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "IsPrimaryKey", this.IsPrimaryKey);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "FieldSize", this.FieldSize);

    }
}

