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

public class Candidate extends AbstractModel{

    /**
    * 识别出人脸对应的候选人数组。当前返回相似度最高的候选人。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 相似度，0-100之间。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
     * Get 识别出人脸对应的候选人数组。当前返回相似度最高的候选人。 
     * @return Name 识别出人脸对应的候选人数组。当前返回相似度最高的候选人。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别出人脸对应的候选人数组。当前返回相似度最高的候选人。
     * @param Name 识别出人脸对应的候选人数组。当前返回相似度最高的候选人。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 相似度，0-100之间。 
     * @return Confidence 相似度，0-100之间。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 相似度，0-100之间。
     * @param Confidence 相似度，0-100之间。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

