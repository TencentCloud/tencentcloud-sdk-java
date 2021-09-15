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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomFileIdMap extends AbstractModel{

    /**
    * 用户自定义ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 文件id
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get 用户自定义ID 
     * @return CustomId 用户自定义ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 用户自定义ID
     * @param CustomId 用户自定义ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 文件id 
     * @return FileId 文件id
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件id
     * @param FileId 文件id
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public CustomFileIdMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomFileIdMap(CustomFileIdMap source) {
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

