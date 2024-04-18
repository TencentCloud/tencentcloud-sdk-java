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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseRep extends AbstractModel {

    /**
    * 诊断信息内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private Content Content;

    /**
    * 诊断结果相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private Table Table;

    /**
     * Get 诊断信息内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 诊断信息内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Content getContent() {
        return this.Content;
    }

    /**
     * Set 诊断信息内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 诊断信息内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(Content Content) {
        this.Content = Content;
    }

    /**
     * Get 诊断结果相关信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 诊断结果相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Table getTable() {
        return this.Table;
    }

    /**
     * Set 诊断结果相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 诊断结果相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(Table Table) {
        this.Table = Table;
    }

    public DiagnoseRep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseRep(DiagnoseRep source) {
        if (source.Content != null) {
            this.Content = new Content(source.Content);
        }
        if (source.Table != null) {
            this.Table = new Table(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Table.", this.Table);

    }
}

