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

public class SearchFacesResponse  extends AbstractModel{

    /**
    * 识别结果。
    */
    @SerializedName("Results")
    @Expose
    private Result [] Results;

    /**
    * 搜索的人员库中包含的人脸数。
    */
    @SerializedName("FaceNum")
    @Expose
    private Integer FaceNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取识别结果。
     * @return Results 识别结果。
     */
    public Result [] getResults() {
        return this.Results;
    }

    /**
     * 设置识别结果。
     * @param Results 识别结果。
     */
    public void setResults(Result [] Results) {
        this.Results = Results;
    }

    /**
     * 获取搜索的人员库中包含的人脸数。
     * @return FaceNum 搜索的人员库中包含的人脸数。
     */
    public Integer getFaceNum() {
        return this.FaceNum;
    }

    /**
     * 设置搜索的人员库中包含的人脸数。
     * @param FaceNum 搜索的人员库中包含的人脸数。
     */
    public void setFaceNum(Integer FaceNum) {
        this.FaceNum = FaceNum;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "FaceNum", this.FaceNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

