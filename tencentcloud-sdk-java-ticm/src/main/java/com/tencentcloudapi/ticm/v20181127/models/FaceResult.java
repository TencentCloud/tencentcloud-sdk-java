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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceResult extends AbstractModel{

    /**
    * 检测出的人脸框位置。
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * 候选人列表。当前返回相似度最高的候选人。
    */
    @SerializedName("Candidates")
    @Expose
    private Candidate [] Candidates;

    /**
     * Get 检测出的人脸框位置。 
     * @return FaceRect 检测出的人脸框位置。
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 检测出的人脸框位置。
     * @param FaceRect 检测出的人脸框位置。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 候选人列表。当前返回相似度最高的候选人。 
     * @return Candidates 候选人列表。当前返回相似度最高的候选人。
     */
    public Candidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set 候选人列表。当前返回相似度最高的候选人。
     * @param Candidates 候选人列表。当前返回相似度最高的候选人。
     */
    public void setCandidates(Candidate [] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamArrayObj(map, prefix + "Candidates.", this.Candidates);

    }
}

