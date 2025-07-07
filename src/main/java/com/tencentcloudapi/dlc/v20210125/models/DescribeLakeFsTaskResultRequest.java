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

public class DescribeLakeFsTaskResultRequest extends AbstractModel {

    /**
    * 需要访问的任务结果路径
    */
    @SerializedName("FsPath")
    @Expose
    private String FsPath;

    /**
     * Get 需要访问的任务结果路径 
     * @return FsPath 需要访问的任务结果路径
     */
    public String getFsPath() {
        return this.FsPath;
    }

    /**
     * Set 需要访问的任务结果路径
     * @param FsPath 需要访问的任务结果路径
     */
    public void setFsPath(String FsPath) {
        this.FsPath = FsPath;
    }

    public DescribeLakeFsTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLakeFsTaskResultRequest(DescribeLakeFsTaskResultRequest source) {
        if (source.FsPath != null) {
            this.FsPath = new String(source.FsPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FsPath", this.FsPath);

    }
}

