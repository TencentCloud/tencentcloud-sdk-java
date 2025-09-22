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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeFileConfig extends AbstractModel {

    /**
    * 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * notebook kernel session信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookSessionInfo")
    @Expose
    private NotebookSessionInfo NotebookSessionInfo;

    /**
     * Get 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 高级运行参数,变量替换，map-json String,String
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get notebook kernel session信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookSessionInfo notebook kernel session信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotebookSessionInfo getNotebookSessionInfo() {
        return this.NotebookSessionInfo;
    }

    /**
     * Set notebook kernel session信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookSessionInfo notebook kernel session信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookSessionInfo(NotebookSessionInfo NotebookSessionInfo) {
        this.NotebookSessionInfo = NotebookSessionInfo;
    }

    public CodeFileConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeFileConfig(CodeFileConfig source) {
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.NotebookSessionInfo != null) {
            this.NotebookSessionInfo = new NotebookSessionInfo(source.NotebookSessionInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamObj(map, prefix + "NotebookSessionInfo.", this.NotebookSessionInfo);

    }
}

