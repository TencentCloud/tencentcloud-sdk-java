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

public class RecognizeMediaForZhiXueRequest extends AbstractModel{

    /**
    * 输入媒体文件存储信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 表情识别参数配置。默认开启。
    */
    @SerializedName("ExpressionConfig")
    @Expose
    private ExpressionConfigInfo ExpressionConfig;

    /**
    * 动作识别参数配置。默认开启。
    */
    @SerializedName("ActionConfig")
    @Expose
    private ActionConfigInfo ActionConfig;

    /**
     * Get 输入媒体文件存储信息。 
     * @return InputInfo 输入媒体文件存储信息。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 输入媒体文件存储信息。
     * @param InputInfo 输入媒体文件存储信息。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 表情识别参数配置。默认开启。 
     * @return ExpressionConfig 表情识别参数配置。默认开启。
     */
    public ExpressionConfigInfo getExpressionConfig() {
        return this.ExpressionConfig;
    }

    /**
     * Set 表情识别参数配置。默认开启。
     * @param ExpressionConfig 表情识别参数配置。默认开启。
     */
    public void setExpressionConfig(ExpressionConfigInfo ExpressionConfig) {
        this.ExpressionConfig = ExpressionConfig;
    }

    /**
     * Get 动作识别参数配置。默认开启。 
     * @return ActionConfig 动作识别参数配置。默认开启。
     */
    public ActionConfigInfo getActionConfig() {
        return this.ActionConfig;
    }

    /**
     * Set 动作识别参数配置。默认开启。
     * @param ActionConfig 动作识别参数配置。默认开启。
     */
    public void setActionConfig(ActionConfigInfo ActionConfig) {
        this.ActionConfig = ActionConfig;
    }

    public RecognizeMediaForZhiXueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeMediaForZhiXueRequest(RecognizeMediaForZhiXueRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.ExpressionConfig != null) {
            this.ExpressionConfig = new ExpressionConfigInfo(source.ExpressionConfig);
        }
        if (source.ActionConfig != null) {
            this.ActionConfig = new ActionConfigInfo(source.ActionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "ExpressionConfig.", this.ExpressionConfig);
        this.setParamObj(map, prefix + "ActionConfig.", this.ActionConfig);

    }
}

