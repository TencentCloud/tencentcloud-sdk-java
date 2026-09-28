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

public class GetFolderRsp extends AbstractModel {

    /**
    * <p>文件夹信息</p>
    */
    @SerializedName("Folder")
    @Expose
    private FileNode Folder;

    /**
     * Get <p>文件夹信息</p> 
     * @return Folder <p>文件夹信息</p>
     */
    public FileNode getFolder() {
        return this.Folder;
    }

    /**
     * Set <p>文件夹信息</p>
     * @param Folder <p>文件夹信息</p>
     */
    public void setFolder(FileNode Folder) {
        this.Folder = Folder;
    }

    public GetFolderRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFolderRsp(GetFolderRsp source) {
        if (source.Folder != null) {
            this.Folder = new FileNode(source.Folder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Folder.", this.Folder);

    }
}

