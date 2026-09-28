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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFolderRsp extends AbstractModel {

    /**
    * <p>文件夹 ID</p>
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
     * Get <p>文件夹 ID</p> 
     * @return FolderId <p>文件夹 ID</p>
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹 ID</p>
     * @param FolderId <p>文件夹 ID</p>
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    public CreateFolderRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFolderRsp(CreateFolderRsp source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);

    }
}

