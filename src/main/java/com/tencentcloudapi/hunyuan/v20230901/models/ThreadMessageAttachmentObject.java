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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThreadMessageAttachmentObject extends AbstractModel {

    /**
    * 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileID")
    @Expose
    private String FileID;

    /**
     * Get 文件 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileID 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileID() {
        return this.FileID;
    }

    /**
     * Set 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileID 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileID(String FileID) {
        this.FileID = FileID;
    }

    public ThreadMessageAttachmentObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThreadMessageAttachmentObject(ThreadMessageAttachmentObject source) {
        if (source.FileID != null) {
            this.FileID = new String(source.FileID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileID", this.FileID);

    }
}

