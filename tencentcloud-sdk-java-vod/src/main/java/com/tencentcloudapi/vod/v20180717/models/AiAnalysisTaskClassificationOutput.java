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

public class AiAnalysisTaskClassificationOutput extends AbstractModel{

    /**
    * 视频智能分类列表。
    */
    @SerializedName("ClassificationSet")
    @Expose
    private MediaAiAnalysisClassificationItem [] ClassificationSet;

    /**
     * Get 视频智能分类列表。 
     * @return ClassificationSet 视频智能分类列表。
     */
    public MediaAiAnalysisClassificationItem [] getClassificationSet() {
        return this.ClassificationSet;
    }

    /**
     * Set 视频智能分类列表。
     * @param ClassificationSet 视频智能分类列表。
     */
    public void setClassificationSet(MediaAiAnalysisClassificationItem [] ClassificationSet) {
        this.ClassificationSet = ClassificationSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClassificationSet.", this.ClassificationSet);

    }
}

