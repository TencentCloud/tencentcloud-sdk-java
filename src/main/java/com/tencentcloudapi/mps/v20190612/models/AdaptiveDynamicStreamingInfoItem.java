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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel{

    /**
    * 转自适应码流规格。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 打包格式，可能为 HLS和 MPEG-DASH 两种。
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * 播放路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 自适应码流文件的存储位置。
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
     * Get 转自适应码流规格。 
     * @return Definition 转自适应码流规格。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转自适应码流规格。
     * @param Definition 转自适应码流规格。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 打包格式，可能为 HLS和 MPEG-DASH 两种。 
     * @return Package 打包格式，可能为 HLS和 MPEG-DASH 两种。
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 打包格式，可能为 HLS和 MPEG-DASH 两种。
     * @param Package 打包格式，可能为 HLS和 MPEG-DASH 两种。
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get 播放路径。 
     * @return Path 播放路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 播放路径。
     * @param Path 播放路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 自适应码流文件的存储位置。 
     * @return Storage 自适应码流文件的存储位置。
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set 自适应码流文件的存储位置。
     * @param Storage 自适应码流文件的存储位置。
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "Storage.", this.Storage);

    }
}

