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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcPartitionInfo extends AbstractModel {

    /**
    * cls日志中的字段名
    */
    @SerializedName("ClsField")
    @Expose
    private String ClsField;

    /**
    * dlc表的列名
    */
    @SerializedName("DlcField")
    @Expose
    private String DlcField;

    /**
    * dlc字段类型
    */
    @SerializedName("DlcFieldType")
    @Expose
    private String DlcFieldType;

    /**
     * Get cls日志中的字段名 
     * @return ClsField cls日志中的字段名
     */
    public String getClsField() {
        return this.ClsField;
    }

    /**
     * Set cls日志中的字段名
     * @param ClsField cls日志中的字段名
     */
    public void setClsField(String ClsField) {
        this.ClsField = ClsField;
    }

    /**
     * Get dlc表的列名 
     * @return DlcField dlc表的列名
     */
    public String getDlcField() {
        return this.DlcField;
    }

    /**
     * Set dlc表的列名
     * @param DlcField dlc表的列名
     */
    public void setDlcField(String DlcField) {
        this.DlcField = DlcField;
    }

    /**
     * Get dlc字段类型 
     * @return DlcFieldType dlc字段类型
     */
    public String getDlcFieldType() {
        return this.DlcFieldType;
    }

    /**
     * Set dlc字段类型
     * @param DlcFieldType dlc字段类型
     */
    public void setDlcFieldType(String DlcFieldType) {
        this.DlcFieldType = DlcFieldType;
    }

    public DlcPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcPartitionInfo(DlcPartitionInfo source) {
        if (source.ClsField != null) {
            this.ClsField = new String(source.ClsField);
        }
        if (source.DlcField != null) {
            this.DlcField = new String(source.DlcField);
        }
        if (source.DlcFieldType != null) {
            this.DlcFieldType = new String(source.DlcFieldType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsField", this.ClsField);
        this.setParamSimple(map, prefix + "DlcField", this.DlcField);
        this.setParamSimple(map, prefix + "DlcFieldType", this.DlcFieldType);

    }
}

