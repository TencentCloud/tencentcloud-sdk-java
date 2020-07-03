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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchPersonsReturnsByGroupResponse extends AbstractModel{

    /**
    * 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
    */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
    * 识别结果。
    */
    @SerializedName("ResultsReturnsByGroup")
    @Expose
    private ResultsReturnsByGroup [] ResultsReturnsByGroup;

    /**
    * 人脸识别所用的算法模型版本。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。 
     * @return PersonNum 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     * @param PersonNum 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get 识别结果。 
     * @return ResultsReturnsByGroup 识别结果。
     */
    public ResultsReturnsByGroup [] getResultsReturnsByGroup() {
        return this.ResultsReturnsByGroup;
    }

    /**
     * Set 识别结果。
     * @param ResultsReturnsByGroup 识别结果。
     */
    public void setResultsReturnsByGroup(ResultsReturnsByGroup [] ResultsReturnsByGroup) {
        this.ResultsReturnsByGroup = ResultsReturnsByGroup;
    }

    /**
     * Get 人脸识别所用的算法模型版本。 
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本。
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonNum", this.PersonNum);
        this.setParamArrayObj(map, prefix + "ResultsReturnsByGroup.", this.ResultsReturnsByGroup);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

