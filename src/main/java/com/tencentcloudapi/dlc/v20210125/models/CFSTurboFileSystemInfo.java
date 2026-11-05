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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFSTurboFileSystemInfo extends AbstractModel {

    /**
    * <p>CFS Turbo ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get <p>CFS Turbo ID</p> 
     * @return FileSystemId <p>CFS Turbo ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>CFS Turbo ID</p>
     * @param FileSystemId <p>CFS Turbo ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public CFSTurboFileSystemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSTurboFileSystemInfo(CFSTurboFileSystemInfo source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

