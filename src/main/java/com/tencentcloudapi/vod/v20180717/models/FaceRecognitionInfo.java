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

public class FaceRecognitionInfo extends AbstractModel {

    /**
    * <p>人脸识别任务列表</p>
    */
    @SerializedName("FaceRecognitionTasks")
    @Expose
    private FaceRecognitionTask [] FaceRecognitionTasks;

    /**
     * Get <p>人脸识别任务列表</p> 
     * @return FaceRecognitionTasks <p>人脸识别任务列表</p>
     */
    public FaceRecognitionTask [] getFaceRecognitionTasks() {
        return this.FaceRecognitionTasks;
    }

    /**
     * Set <p>人脸识别任务列表</p>
     * @param FaceRecognitionTasks <p>人脸识别任务列表</p>
     */
    public void setFaceRecognitionTasks(FaceRecognitionTask [] FaceRecognitionTasks) {
        this.FaceRecognitionTasks = FaceRecognitionTasks;
    }

    public FaceRecognitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceRecognitionInfo(FaceRecognitionInfo source) {
        if (source.FaceRecognitionTasks != null) {
            this.FaceRecognitionTasks = new FaceRecognitionTask[source.FaceRecognitionTasks.length];
            for (int i = 0; i < source.FaceRecognitionTasks.length; i++) {
                this.FaceRecognitionTasks[i] = new FaceRecognitionTask(source.FaceRecognitionTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FaceRecognitionTasks.", this.FaceRecognitionTasks);

    }
}

