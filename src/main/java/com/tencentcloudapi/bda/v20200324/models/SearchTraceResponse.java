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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchTraceResponse extends AbstractModel{

    /**
    * 识别出的最相似候选人。
    */
    @SerializedName("Candidates")
    @Expose
    private Candidate [] Candidates;

    /**
    * 输入的人体轨迹图片中的合法性校验结果。
只有为0时结果才有意义。
-1001: 输入图片不合法。-1002: 输入图片不能构成轨迹。
    */
    @SerializedName("InputRetCode")
    @Expose
    private Long InputRetCode;

    /**
    * 输入的人体轨迹图片中的合法性校验结果详情。 
-1101:图片无效，-1102:url不合法。-1103:图片过大。-1104:图片下载失败。-1105:图片解码失败。-1109:图片分辨率过高。-2023:轨迹中有非同人图片。-2024: 轨迹提取失败。-2025: 人体检测失败。
    */
    @SerializedName("InputRetCodeDetails")
    @Expose
    private Long [] InputRetCodeDetails;

    /**
    * 人体识别所用的算法模型版本。
    */
    @SerializedName("BodyModelVersion")
    @Expose
    private String BodyModelVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 识别出的最相似候选人。 
     * @return Candidates 识别出的最相似候选人。
     */
    public Candidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set 识别出的最相似候选人。
     * @param Candidates 识别出的最相似候选人。
     */
    public void setCandidates(Candidate [] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Get 输入的人体轨迹图片中的合法性校验结果。
只有为0时结果才有意义。
-1001: 输入图片不合法。-1002: 输入图片不能构成轨迹。 
     * @return InputRetCode 输入的人体轨迹图片中的合法性校验结果。
只有为0时结果才有意义。
-1001: 输入图片不合法。-1002: 输入图片不能构成轨迹。
     */
    public Long getInputRetCode() {
        return this.InputRetCode;
    }

    /**
     * Set 输入的人体轨迹图片中的合法性校验结果。
只有为0时结果才有意义。
-1001: 输入图片不合法。-1002: 输入图片不能构成轨迹。
     * @param InputRetCode 输入的人体轨迹图片中的合法性校验结果。
只有为0时结果才有意义。
-1001: 输入图片不合法。-1002: 输入图片不能构成轨迹。
     */
    public void setInputRetCode(Long InputRetCode) {
        this.InputRetCode = InputRetCode;
    }

    /**
     * Get 输入的人体轨迹图片中的合法性校验结果详情。 
-1101:图片无效，-1102:url不合法。-1103:图片过大。-1104:图片下载失败。-1105:图片解码失败。-1109:图片分辨率过高。-2023:轨迹中有非同人图片。-2024: 轨迹提取失败。-2025: 人体检测失败。 
     * @return InputRetCodeDetails 输入的人体轨迹图片中的合法性校验结果详情。 
-1101:图片无效，-1102:url不合法。-1103:图片过大。-1104:图片下载失败。-1105:图片解码失败。-1109:图片分辨率过高。-2023:轨迹中有非同人图片。-2024: 轨迹提取失败。-2025: 人体检测失败。
     */
    public Long [] getInputRetCodeDetails() {
        return this.InputRetCodeDetails;
    }

    /**
     * Set 输入的人体轨迹图片中的合法性校验结果详情。 
-1101:图片无效，-1102:url不合法。-1103:图片过大。-1104:图片下载失败。-1105:图片解码失败。-1109:图片分辨率过高。-2023:轨迹中有非同人图片。-2024: 轨迹提取失败。-2025: 人体检测失败。
     * @param InputRetCodeDetails 输入的人体轨迹图片中的合法性校验结果详情。 
-1101:图片无效，-1102:url不合法。-1103:图片过大。-1104:图片下载失败。-1105:图片解码失败。-1109:图片分辨率过高。-2023:轨迹中有非同人图片。-2024: 轨迹提取失败。-2025: 人体检测失败。
     */
    public void setInputRetCodeDetails(Long [] InputRetCodeDetails) {
        this.InputRetCodeDetails = InputRetCodeDetails;
    }

    /**
     * Get 人体识别所用的算法模型版本。 
     * @return BodyModelVersion 人体识别所用的算法模型版本。
     */
    public String getBodyModelVersion() {
        return this.BodyModelVersion;
    }

    /**
     * Set 人体识别所用的算法模型版本。
     * @param BodyModelVersion 人体识别所用的算法模型版本。
     */
    public void setBodyModelVersion(String BodyModelVersion) {
        this.BodyModelVersion = BodyModelVersion;
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
        this.setParamArrayObj(map, prefix + "Candidates.", this.Candidates);
        this.setParamSimple(map, prefix + "InputRetCode", this.InputRetCode);
        this.setParamArraySimple(map, prefix + "InputRetCodeDetails.", this.InputRetCodeDetails);
        this.setParamSimple(map, prefix + "BodyModelVersion", this.BodyModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

