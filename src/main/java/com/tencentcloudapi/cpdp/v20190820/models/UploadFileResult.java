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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFileResult extends AbstractModel{

    /**
    * 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Storage")
    @Expose
    private String Storage;

    /**
    * 文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Storage 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Storage 存储区域（0私密区，1公共区），请严格按文件要求，上传到不同的区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public UploadFileResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFileResult(UploadFileResult source) {
        if (source.Storage != null) {
            this.Storage = new String(source.Storage);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

