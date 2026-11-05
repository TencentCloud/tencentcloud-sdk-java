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
    * <p>解说视频路径。</p>
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * <p>解说视频路径列表。</p><p><strong>注意</strong>：</p><ol><li>当返回一个文件时，<code>VideoPath</code>返回一个文件路径，<code>VideoPaths</code>也会填充同样路径的一个元素。</li><li>当返回多个文件时，<code>VideoPath</code>返回为空字符串，<code>VideoPaths</code>返回多文件路径列表。</li></ol>
    */
    @SerializedName("VideoPaths")
    @Expose
    private String [] VideoPaths;

    /**
    * <p>脚本文件路径</p>
    */
    @SerializedName("ScriptPath")
    @Expose
    private String ScriptPath;

    /**
    * <p>多个脚本文件路径</p>
    */
    @SerializedName("ScriptPaths")
    @Expose
    private String [] ScriptPaths;

    /**
    * <p>解说视频存储位置。</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>输出视频字幕文件</p>
    */
    @SerializedName("OutputSubtitlePath")
    @Expose
    private String OutputSubtitlePath;

    /**
    * <p>多个输出视频字幕文件，与输出的VideoPaths对应</p>
    */
    @SerializedName("OutputSubtitlePaths")
    @Expose
    private String [] OutputSubtitlePaths;

    /**
     * Get <p>解说视频路径。</p> 
     * @return VideoPath <p>解说视频路径。</p>
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set <p>解说视频路径。</p>
     * @param VideoPath <p>解说视频路径。</p>
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get <p>解说视频路径列表。</p><p><strong>注意</strong>：</p><ol><li>当返回一个文件时，<code>VideoPath</code>返回一个文件路径，<code>VideoPaths</code>也会填充同样路径的一个元素。</li><li>当返回多个文件时，<code>VideoPath</code>返回为空字符串，<code>VideoPaths</code>返回多文件路径列表。</li></ol> 
     * @return VideoPaths <p>解说视频路径列表。</p><p><strong>注意</strong>：</p><ol><li>当返回一个文件时，<code>VideoPath</code>返回一个文件路径，<code>VideoPaths</code>也会填充同样路径的一个元素。</li><li>当返回多个文件时，<code>VideoPath</code>返回为空字符串，<code>VideoPaths</code>返回多文件路径列表。</li></ol>
     */
    public String [] getVideoPaths() {
        return this.VideoPaths;
    }

    /**
     * Set <p>解说视频路径列表。</p><p><strong>注意</strong>：</p><ol><li>当返回一个文件时，<code>VideoPath</code>返回一个文件路径，<code>VideoPaths</code>也会填充同样路径的一个元素。</li><li>当返回多个文件时，<code>VideoPath</code>返回为空字符串，<code>VideoPaths</code>返回多文件路径列表。</li></ol>
     * @param VideoPaths <p>解说视频路径列表。</p><p><strong>注意</strong>：</p><ol><li>当返回一个文件时，<code>VideoPath</code>返回一个文件路径，<code>VideoPaths</code>也会填充同样路径的一个元素。</li><li>当返回多个文件时，<code>VideoPath</code>返回为空字符串，<code>VideoPaths</code>返回多文件路径列表。</li></ol>
     */
    public void setVideoPaths(String [] VideoPaths) {
        this.VideoPaths = VideoPaths;
    }

    /**
     * Get <p>脚本文件路径</p> 
     * @return ScriptPath <p>脚本文件路径</p>
     */
    public String getScriptPath() {
        return this.ScriptPath;
    }

    /**
     * Set <p>脚本文件路径</p>
     * @param ScriptPath <p>脚本文件路径</p>
     */
    public void setScriptPath(String ScriptPath) {
        this.ScriptPath = ScriptPath;
    }

    /**
     * Get <p>多个脚本文件路径</p> 
     * @return ScriptPaths <p>多个脚本文件路径</p>
     */
    public String [] getScriptPaths() {
        return this.ScriptPaths;
    }

    /**
     * Set <p>多个脚本文件路径</p>
     * @param ScriptPaths <p>多个脚本文件路径</p>
     */
    public void setScriptPaths(String [] ScriptPaths) {
        this.ScriptPaths = ScriptPaths;
    }

    /**
     * Get <p>解说视频存储位置。</p> 
     * @return OutputStorage <p>解说视频存储位置。</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>解说视频存储位置。</p>
     * @param OutputStorage <p>解说视频存储位置。</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>输出视频字幕文件</p> 
     * @return OutputSubtitlePath <p>输出视频字幕文件</p>
     */
    public String getOutputSubtitlePath() {
        return this.OutputSubtitlePath;
    }

    /**
     * Set <p>输出视频字幕文件</p>
     * @param OutputSubtitlePath <p>输出视频字幕文件</p>
     */
    public void setOutputSubtitlePath(String OutputSubtitlePath) {
        this.OutputSubtitlePath = OutputSubtitlePath;
    }

    /**
     * Get <p>多个输出视频字幕文件，与输出的VideoPaths对应</p> 
     * @return OutputSubtitlePaths <p>多个输出视频字幕文件，与输出的VideoPaths对应</p>
     */
    public String [] getOutputSubtitlePaths() {
        return this.OutputSubtitlePaths;
    }

    /**
     * Set <p>多个输出视频字幕文件，与输出的VideoPaths对应</p>
     * @param OutputSubtitlePaths <p>多个输出视频字幕文件，与输出的VideoPaths对应</p>
     */
    public void setOutputSubtitlePaths(String [] OutputSubtitlePaths) {
        this.OutputSubtitlePaths = OutputSubtitlePaths;
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
        if (source.ScriptPaths != null) {
            this.ScriptPaths = new String[source.ScriptPaths.length];
            for (int i = 0; i < source.ScriptPaths.length; i++) {
                this.ScriptPaths[i] = new String(source.ScriptPaths[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputSubtitlePath != null) {
            this.OutputSubtitlePath = new String(source.OutputSubtitlePath);
        }
        if (source.OutputSubtitlePaths != null) {
            this.OutputSubtitlePaths = new String[source.OutputSubtitlePaths.length];
            for (int i = 0; i < source.OutputSubtitlePaths.length; i++) {
                this.OutputSubtitlePaths[i] = new String(source.OutputSubtitlePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoPath", this.VideoPath);
        this.setParamArraySimple(map, prefix + "VideoPaths.", this.VideoPaths);
        this.setParamSimple(map, prefix + "ScriptPath", this.ScriptPath);
        this.setParamArraySimple(map, prefix + "ScriptPaths.", this.ScriptPaths);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputSubtitlePath", this.OutputSubtitlePath);
        this.setParamArraySimple(map, prefix + "OutputSubtitlePaths.", this.OutputSubtitlePaths);

    }
}

