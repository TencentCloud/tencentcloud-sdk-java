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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuspectedInfo extends AbstractModel{

    /**
    * TopN匹配信息列表
    */
    @SerializedName("FaceSet")
    @Expose
    private FrameInfo [] FaceSet;

    /**
    * 识别到的人员id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * Get TopN匹配信息列表 
     * @return FaceSet TopN匹配信息列表
     */
    public FrameInfo [] getFaceSet() {
        return this.FaceSet;
    }

    /**
     * Set TopN匹配信息列表
     * @param FaceSet TopN匹配信息列表
     */
    public void setFaceSet(FrameInfo [] FaceSet) {
        this.FaceSet = FaceSet;
    }

    /**
     * Get 识别到的人员id 
     * @return PersonId 识别到的人员id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 识别到的人员id
     * @param PersonId 识别到的人员id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FaceSet.", this.FaceSet);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

