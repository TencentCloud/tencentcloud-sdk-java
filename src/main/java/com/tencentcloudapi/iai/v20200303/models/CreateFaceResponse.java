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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFaceResponse extends AbstractModel {

    /**
    * 加入成功的人脸数量。
    */
    @SerializedName("SucFaceNum")
    @Expose
    private Long SucFaceNum;

    /**
    * 加入成功的人脸ID列表。
    */
    @SerializedName("SucFaceIds")
    @Expose
    private String [] SucFaceIds;

    /**
    * 每张人脸图片添加结果。
- 其他非 0 值代表算法服务异常，取值范围：
-1101 代表未检测到人脸。
-1102 代表图片解码失败。
-1109 代表图片尺寸过大或者过小。
-1601代表不符合图片质量控制要求。
-1604 代表人脸相似度没有超过FaceMatchThreshold。 
- RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
    */
    @SerializedName("RetCode")
    @Expose
    private Long [] RetCode;

    /**
    * 加入成功的人脸索引。
- 索引顺序和入参中 Images 或 Urls 的顺序一致。 
- 例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
    */
    @SerializedName("SucIndexes")
    @Expose
    private Long [] SucIndexes;

    /**
    * 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
    */
    @SerializedName("SucFaceRects")
    @Expose
    private FaceRect [] SucFaceRects;

    /**
    * 人脸识别所用的算法模型版本。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加入成功的人脸数量。 
     * @return SucFaceNum 加入成功的人脸数量。
     */
    public Long getSucFaceNum() {
        return this.SucFaceNum;
    }

    /**
     * Set 加入成功的人脸数量。
     * @param SucFaceNum 加入成功的人脸数量。
     */
    public void setSucFaceNum(Long SucFaceNum) {
        this.SucFaceNum = SucFaceNum;
    }

    /**
     * Get 加入成功的人脸ID列表。 
     * @return SucFaceIds 加入成功的人脸ID列表。
     */
    public String [] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set 加入成功的人脸ID列表。
     * @param SucFaceIds 加入成功的人脸ID列表。
     */
    public void setSucFaceIds(String [] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
    }

    /**
     * Get 每张人脸图片添加结果。
- 其他非 0 值代表算法服务异常，取值范围：
-1101 代表未检测到人脸。
-1102 代表图片解码失败。
-1109 代表图片尺寸过大或者过小。
-1601代表不符合图片质量控制要求。
-1604 代表人脸相似度没有超过FaceMatchThreshold。 
- RetCode的顺序和入参中 Images 或 Urls 的顺序一致。 
     * @return RetCode 每张人脸图片添加结果。
- 其他非 0 值代表算法服务异常，取值范围：
-1101 代表未检测到人脸。
-1102 代表图片解码失败。
-1109 代表图片尺寸过大或者过小。
-1601代表不符合图片质量控制要求。
-1604 代表人脸相似度没有超过FaceMatchThreshold。 
- RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public Long [] getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 每张人脸图片添加结果。
- 其他非 0 值代表算法服务异常，取值范围：
-1101 代表未检测到人脸。
-1102 代表图片解码失败。
-1109 代表图片尺寸过大或者过小。
-1601代表不符合图片质量控制要求。
-1604 代表人脸相似度没有超过FaceMatchThreshold。 
- RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     * @param RetCode 每张人脸图片添加结果。
- 其他非 0 值代表算法服务异常，取值范围：
-1101 代表未检测到人脸。
-1102 代表图片解码失败。
-1109 代表图片尺寸过大或者过小。
-1601代表不符合图片质量控制要求。
-1604 代表人脸相似度没有超过FaceMatchThreshold。 
- RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public void setRetCode(Long [] RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 加入成功的人脸索引。
- 索引顺序和入参中 Images 或 Urls 的顺序一致。 
- 例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。 
     * @return SucIndexes 加入成功的人脸索引。
- 索引顺序和入参中 Images 或 Urls 的顺序一致。 
- 例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     */
    public Long [] getSucIndexes() {
        return this.SucIndexes;
    }

    /**
     * Set 加入成功的人脸索引。
- 索引顺序和入参中 Images 或 Urls 的顺序一致。 
- 例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     * @param SucIndexes 加入成功的人脸索引。
- 索引顺序和入参中 Images 或 Urls 的顺序一致。 
- 例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     */
    public void setSucIndexes(Long [] SucIndexes) {
        this.SucIndexes = SucIndexes;
    }

    /**
     * Get 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。 
     * @return SucFaceRects 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public FaceRect [] getSucFaceRects() {
        return this.SucFaceRects;
    }

    /**
     * Set 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     * @param SucFaceRects 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public void setSucFaceRects(FaceRect [] SucFaceRects) {
        this.SucFaceRects = SucFaceRects;
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
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFaceResponse(CreateFaceResponse source) {
        if (source.SucFaceNum != null) {
            this.SucFaceNum = new Long(source.SucFaceNum);
        }
        if (source.SucFaceIds != null) {
            this.SucFaceIds = new String[source.SucFaceIds.length];
            for (int i = 0; i < source.SucFaceIds.length; i++) {
                this.SucFaceIds[i] = new String(source.SucFaceIds[i]);
            }
        }
        if (source.RetCode != null) {
            this.RetCode = new Long[source.RetCode.length];
            for (int i = 0; i < source.RetCode.length; i++) {
                this.RetCode[i] = new Long(source.RetCode[i]);
            }
        }
        if (source.SucIndexes != null) {
            this.SucIndexes = new Long[source.SucIndexes.length];
            for (int i = 0; i < source.SucIndexes.length; i++) {
                this.SucIndexes[i] = new Long(source.SucIndexes[i]);
            }
        }
        if (source.SucFaceRects != null) {
            this.SucFaceRects = new FaceRect[source.SucFaceRects.length];
            for (int i = 0; i < source.SucFaceRects.length; i++) {
                this.SucFaceRects[i] = new FaceRect(source.SucFaceRects[i]);
            }
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SucFaceNum", this.SucFaceNum);
        this.setParamArraySimple(map, prefix + "SucFaceIds.", this.SucFaceIds);
        this.setParamArraySimple(map, prefix + "RetCode.", this.RetCode);
        this.setParamArraySimple(map, prefix + "SucIndexes.", this.SucIndexes);
        this.setParamArrayObj(map, prefix + "SucFaceRects.", this.SucFaceRects);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

