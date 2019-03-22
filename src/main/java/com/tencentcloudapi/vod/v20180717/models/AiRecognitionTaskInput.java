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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskInput  extends AbstractModel{

    /**
    * 视频智能识别模板 ID ，固定为 10，同时进行按帧标签识别、精彩片段识别、视频头尾识别、拆条、人脸识别、文字识别、语音识别、文字全文识别、语音全文识别，后续会推出用户自定义模板，可根据需要选择相应的识别任务。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * 获取视频智能识别模板 ID ，固定为 10，同时进行按帧标签识别、精彩片段识别、视频头尾识别、拆条、人脸识别、文字识别、语音识别、文字全文识别、语音全文识别，后续会推出用户自定义模板，可根据需要选择相应的识别任务。
     * @return Definition 视频智能识别模板 ID ，固定为 10，同时进行按帧标签识别、精彩片段识别、视频头尾识别、拆条、人脸识别、文字识别、语音识别、文字全文识别、语音全文识别，后续会推出用户自定义模板，可根据需要选择相应的识别任务。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置视频智能识别模板 ID ，固定为 10，同时进行按帧标签识别、精彩片段识别、视频头尾识别、拆条、人脸识别、文字识别、语音识别、文字全文识别、语音全文识别，后续会推出用户自定义模板，可根据需要选择相应的识别任务。
     * @param Definition 视频智能识别模板 ID ，固定为 10，同时进行按帧标签识别、精彩片段识别、视频头尾识别、拆条、人脸识别、文字识别、语音识别、文字全文识别、语音全文识别，后续会推出用户自定义模板，可根据需要选择相应的识别任务。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

