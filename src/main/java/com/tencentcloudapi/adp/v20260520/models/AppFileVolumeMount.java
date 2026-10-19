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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppFileVolumeMount extends AbstractModel {

    /**
    * <p>应用云盘配置</p>
    */
    @SerializedName("FileVolumeMount")
    @Expose
    private FileVolumeMount FileVolumeMount;

    /**
    * <p>1：新增 2：修改 3：删除</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
     * Get <p>应用云盘配置</p> 
     * @return FileVolumeMount <p>应用云盘配置</p>
     */
    public FileVolumeMount getFileVolumeMount() {
        return this.FileVolumeMount;
    }

    /**
     * Set <p>应用云盘配置</p>
     * @param FileVolumeMount <p>应用云盘配置</p>
     */
    public void setFileVolumeMount(FileVolumeMount FileVolumeMount) {
        this.FileVolumeMount = FileVolumeMount;
    }

    /**
     * Get <p>1：新增 2：修改 3：删除</p> 
     * @return Action <p>1：新增 2：修改 3：删除</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>1：新增 2：修改 3：删除</p>
     * @param Action <p>1：新增 2：修改 3：删除</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    public AppFileVolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppFileVolumeMount(AppFileVolumeMount source) {
        if (source.FileVolumeMount != null) {
            this.FileVolumeMount = new FileVolumeMount(source.FileVolumeMount);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FileVolumeMount.", this.FileVolumeMount);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

