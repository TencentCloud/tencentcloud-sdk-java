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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneAigcImageTaskInput extends AbstractModel {

    /**
    * 场景化生图参数配置。
    */
    @SerializedName("SceneInfo")
    @Expose
    private AigcImageSceneInfo SceneInfo;

    /**
    * 输入图片列表。
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] FileInfos;

    /**
    * 场景化生图任务的输出媒体文件配置。
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcImageOutputConfig OutputConfig;

    /**
     * Get 场景化生图参数配置。 
     * @return SceneInfo 场景化生图参数配置。
     */
    public AigcImageSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 场景化生图参数配置。
     * @param SceneInfo 场景化生图参数配置。
     */
    public void setSceneInfo(AigcImageSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get 输入图片列表。 
     * @return FileInfos 输入图片列表。
     */
    public SceneAigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 输入图片列表。
     * @param FileInfos 输入图片列表。
     */
    public void setFileInfos(SceneAigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 场景化生图任务的输出媒体文件配置。 
     * @return OutputConfig 场景化生图任务的输出媒体文件配置。
     */
    public SceneAigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 场景化生图任务的输出媒体文件配置。
     * @param OutputConfig 场景化生图任务的输出媒体文件配置。
     */
    public void setOutputConfig(SceneAigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public SceneAigcImageTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTaskInput(SceneAigcImageTaskInput source) {
        if (source.SceneInfo != null) {
            this.SceneInfo = new AigcImageSceneInfo(source.SceneInfo);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new SceneAigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new SceneAigcImageOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

