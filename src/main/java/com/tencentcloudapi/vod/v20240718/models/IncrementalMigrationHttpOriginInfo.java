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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpOriginInfo extends AbstractModel {

    /**
    * 增量迁移源站地址信息。
    */
    @SerializedName("EndpointInfo")
    @Expose
    private IncrementalMigrationHttpEndpointInfo EndpointInfo;

    /**
    * 增量迁移源站文件信息。
    */
    @SerializedName("FileInfo")
    @Expose
    private IncrementalMigrationOriginFileInfo FileInfo;

    /**
     * Get 增量迁移源站地址信息。 
     * @return EndpointInfo 增量迁移源站地址信息。
     */
    public IncrementalMigrationHttpEndpointInfo getEndpointInfo() {
        return this.EndpointInfo;
    }

    /**
     * Set 增量迁移源站地址信息。
     * @param EndpointInfo 增量迁移源站地址信息。
     */
    public void setEndpointInfo(IncrementalMigrationHttpEndpointInfo EndpointInfo) {
        this.EndpointInfo = EndpointInfo;
    }

    /**
     * Get 增量迁移源站文件信息。 
     * @return FileInfo 增量迁移源站文件信息。
     */
    public IncrementalMigrationOriginFileInfo getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set 增量迁移源站文件信息。
     * @param FileInfo 增量迁移源站文件信息。
     */
    public void setFileInfo(IncrementalMigrationOriginFileInfo FileInfo) {
        this.FileInfo = FileInfo;
    }

    public IncrementalMigrationHttpOriginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpOriginInfo(IncrementalMigrationHttpOriginInfo source) {
        if (source.EndpointInfo != null) {
            this.EndpointInfo = new IncrementalMigrationHttpEndpointInfo(source.EndpointInfo);
        }
        if (source.FileInfo != null) {
            this.FileInfo = new IncrementalMigrationOriginFileInfo(source.FileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EndpointInfo.", this.EndpointInfo);
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);

    }
}

