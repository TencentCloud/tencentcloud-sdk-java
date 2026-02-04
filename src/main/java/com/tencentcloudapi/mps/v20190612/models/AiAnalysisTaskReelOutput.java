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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskReelOutput extends AbstractModel {

    /**
    * 解说视频路径。
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * 解说视频路径列表。

**注意**：
1. 当返回一个文件时，`VideoPath `返回一个文件路径，`VideoPaths `也会填充同样路径的一个元素。
2. 当返回多个文件时，`VideoPath `返回为空字符串，`VideoPaths `返回多文件路径列表。
    */
    @SerializedName("VideoPaths")
    @Expose
    private String [] VideoPaths;

    /**
    * 脚本文件路径

    */
    @SerializedName("ScriptPath")
    @Expose
    private String ScriptPath;

    /**
    * 解说视频存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get 解说视频路径。 
     * @return VideoPath 解说视频路径。
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set 解说视频路径。
     * @param VideoPath 解说视频路径。
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get 解说视频路径列表。

**注意**：
1. 当返回一个文件时，`VideoPath `返回一个文件路径，`VideoPaths `也会填充同样路径的一个元素。
2. 当返回多个文件时，`VideoPath `返回为空字符串，`VideoPaths `返回多文件路径列表。 
     * @return VideoPaths 解说视频路径列表。

**注意**：
1. 当返回一个文件时，`VideoPath `返回一个文件路径，`VideoPaths `也会填充同样路径的一个元素。
2. 当返回多个文件时，`VideoPath `返回为空字符串，`VideoPaths `返回多文件路径列表。
     */
    public String [] getVideoPaths() {
        return this.VideoPaths;
    }

    /**
     * Set 解说视频路径列表。

**注意**：
1. 当返回一个文件时，`VideoPath `返回一个文件路径，`VideoPaths `也会填充同样路径的一个元素。
2. 当返回多个文件时，`VideoPath `返回为空字符串，`VideoPaths `返回多文件路径列表。
     * @param VideoPaths 解说视频路径列表。

**注意**：
1. 当返回一个文件时，`VideoPath `返回一个文件路径，`VideoPaths `也会填充同样路径的一个元素。
2. 当返回多个文件时，`VideoPath `返回为空字符串，`VideoPaths `返回多文件路径列表。
     */
    public void setVideoPaths(String [] VideoPaths) {
        this.VideoPaths = VideoPaths;
    }

    /**
     * Get 脚本文件路径
 
     * @return ScriptPath 脚本文件路径

     */
    public String getScriptPath() {
        return this.ScriptPath;
    }

    /**
     * Set 脚本文件路径

     * @param ScriptPath 脚本文件路径

     */
    public void setScriptPath(String ScriptPath) {
        this.ScriptPath = ScriptPath;
    }

    /**
     * Get 解说视频存储位置。 
     * @return OutputStorage 解说视频存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 解说视频存储位置。
     * @param OutputStorage 解说视频存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AiAnalysisTaskReelOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskReelOutput(AiAnalysisTaskReelOutput source) {
        if (source.VideoPath != null) {
            this.VideoPath = new String(source.VideoPath);
        }
        if (source.VideoPaths != null) {
            this.VideoPaths = new String[source.VideoPaths.length];
            for (int i = 0; i < source.VideoPaths.length; i++) {
                this.VideoPaths[i] = new String(source.VideoPaths[i]);
            }
        }
        if (source.ScriptPath != null) {
            this.ScriptPath = new String(source.ScriptPath);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoPath", this.VideoPath);
        this.setParamArraySimple(map, prefix + "VideoPaths.", this.VideoPaths);
        this.setParamSimple(map, prefix + "ScriptPath", this.ScriptPath);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

