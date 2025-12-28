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
    * 成片视频路径。
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * 脚本文件路径

    */
    @SerializedName("ScriptPath")
    @Expose
    private String ScriptPath;

    /**
    * 成片视频存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get 成片视频路径。 
     * @return VideoPath 成片视频路径。
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set 成片视频路径。
     * @param VideoPath 成片视频路径。
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
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
     * Get 成片视频存储位置。 
     * @return OutputStorage 成片视频存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 成片视频存储位置。
     * @param OutputStorage 成片视频存储位置。
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
        this.setParamSimple(map, prefix + "ScriptPath", this.ScriptPath);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

