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

public class DlcFailTableInfo extends AbstractModel {

    /**
    * <p>DLC的表名称</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>表中的字段名称</p><p>字段类型必须是String类型</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
     * Get <p>DLC的表名称</p> 
     * @return TableName <p>DLC的表名称</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>DLC的表名称</p>
     * @param TableName <p>DLC的表名称</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>表中的字段名称</p><p>字段类型必须是String类型</p> 
     * @return FieldName <p>表中的字段名称</p><p>字段类型必须是String类型</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>表中的字段名称</p><p>字段类型必须是String类型</p>
     * @param FieldName <p>表中的字段名称</p><p>字段类型必须是String类型</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public DlcFailTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcFailTableInfo(DlcFailTableInfo source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);

    }
}

