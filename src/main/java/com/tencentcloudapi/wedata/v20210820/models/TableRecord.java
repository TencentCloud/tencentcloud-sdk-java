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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableRecord extends AbstractModel {

    /**
    * 表一行数据，包含多个Field
    */
    @SerializedName("TableRecordFieldSet")
    @Expose
    private TableRecordField [] TableRecordFieldSet;

    /**
     * Get 表一行数据，包含多个Field 
     * @return TableRecordFieldSet 表一行数据，包含多个Field
     */
    public TableRecordField [] getTableRecordFieldSet() {
        return this.TableRecordFieldSet;
    }

    /**
     * Set 表一行数据，包含多个Field
     * @param TableRecordFieldSet 表一行数据，包含多个Field
     */
    public void setTableRecordFieldSet(TableRecordField [] TableRecordFieldSet) {
        this.TableRecordFieldSet = TableRecordFieldSet;
    }

    public TableRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableRecord(TableRecord source) {
        if (source.TableRecordFieldSet != null) {
            this.TableRecordFieldSet = new TableRecordField[source.TableRecordFieldSet.length];
            for (int i = 0; i < source.TableRecordFieldSet.length; i++) {
                this.TableRecordFieldSet[i] = new TableRecordField(source.TableRecordFieldSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableRecordFieldSet.", this.TableRecordFieldSet);

    }
}

