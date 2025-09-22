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

public class TaskCodeResult extends AbstractModel {

    /**
    * 代码内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * 代码文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFileSize")
    @Expose
    private String CodeFileSize;

    /**
     * Get 代码内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeInfo 代码内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set 代码内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeInfo 代码内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * Get 代码文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFileSize 代码文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeFileSize() {
        return this.CodeFileSize;
    }

    /**
     * Set 代码文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFileSize 代码文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFileSize(String CodeFileSize) {
        this.CodeFileSize = CodeFileSize;
    }

    public TaskCodeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskCodeResult(TaskCodeResult source) {
        if (source.CodeInfo != null) {
            this.CodeInfo = new String(source.CodeInfo);
        }
        if (source.CodeFileSize != null) {
            this.CodeFileSize = new String(source.CodeFileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "CodeFileSize", this.CodeFileSize);

    }
}

