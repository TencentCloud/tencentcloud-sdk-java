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

public class GetFileContentRequest extends AbstractModel {

    /**
    * <p>工作空间ID，必填，最大长度64</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>文件ID，FileId/FilePath 二选一，最大长度128；非空时优先生效</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>工作空间ID，必填，最大长度64</p> 
     * @return WorkspaceId <p>工作空间ID，必填，最大长度64</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID，必填，最大长度64</p>
     * @param WorkspaceId <p>工作空间ID，必填，最大长度64</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>文件ID，FileId/FilePath 二选一，最大长度128；非空时优先生效</p> 
     * @return FileId <p>文件ID，FileId/FilePath 二选一，最大长度128；非空时优先生效</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件ID，FileId/FilePath 二选一，最大长度128；非空时优先生效</p>
     * @param FileId <p>文件ID，FileId/FilePath 二选一，最大长度128；非空时优先生效</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public GetFileContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFileContentRequest(GetFileContentRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

