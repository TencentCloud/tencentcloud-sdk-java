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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFaceResponse extends AbstractModel {

    /**
    * <p>加入成功的人脸数量。</p>
    */
    @SerializedName("SucFaceNum")
    @Expose
    private Long SucFaceNum;

    /**
    * <p>加入成功的人脸ID列表。</p>
    */
    @SerializedName("SucFaceIds")
    @Expose
    private String [] SucFaceIds;

    /**
    * <p>每张人脸图片添加结果。</p><ul><li>其他非 0 值代表算法服务异常，取值范围：<br>-1101 代表未检测到人脸。<br>-1102 代表图片解码失败。<br>-1109 代表图片尺寸过大或者过小。<br>-1601代表不符合图片质量控制要求。<br>-1604 代表人脸相似度没有超过FaceMatchThreshold。 </li><li>RetCode的顺序和入参中 Images 或 Urls 的顺序一致。</li></ul>
    */
    @SerializedName("RetCode")
    @Expose
    private Long [] RetCode;

    /**
    * <p>加入成功的人脸索引。</p><ul><li>索引顺序和入参中 Images 或 Urls 的顺序一致。 </li><li>例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。</li></ul>
    */
    @SerializedName("SucIndexes")
    @Expose
    private Long [] SucIndexes;

    /**
    * <p>加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。</p>
    */
    @SerializedName("SucFaceRects")
    @Expose
    private FaceRect [] SucFaceRects;

    /**
    * <p>人脸识别所用的算法模型版本。</p>
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
     * Get <p>加入成功的人脸数量。</p> 
     * @return SucFaceNum <p>加入成功的人脸数量。</p>
     */
    public Long getSucFaceNum() {
        return this.SucFaceNum;
    }

    /**
     * Set <p>加入成功的人脸数量。</p>
     * @param SucFaceNum <p>加入成功的人脸数量。</p>
     */
    public void setSucFaceNum(Long SucFaceNum) {
        this.SucFaceNum = SucFaceNum;
    }

    /**
     * Get <p>加入成功的人脸ID列表。</p> 
     * @return SucFaceIds <p>加入成功的人脸ID列表。</p>
     */
    public String [] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set <p>加入成功的人脸ID列表。</p>
     * @param SucFaceIds <p>加入成功的人脸ID列表。</p>
     */
    public void setSucFaceIds(String [] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
    }

    /**
     * Get <p>每张人脸图片添加结果。</p><ul><li>其他非 0 值代表算法服务异常，取值范围：<br>-1101 代表未检测到人脸。<br>-1102 代表图片解码失败。<br>-1109 代表图片尺寸过大或者过小。<br>-1601代表不符合图片质量控制要求。<br>-1604 代表人脸相似度没有超过FaceMatchThreshold。 </li><li>RetCode的顺序和入参中 Images 或 Urls 的顺序一致。</li></ul> 
     * @return RetCode <p>每张人脸图片添加结果。</p><ul><li>其他非 0 值代表算法服务异常，取值范围：<br>-1101 代表未检测到人脸。<br>-1102 代表图片解码失败。<br>-1109 代表图片尺寸过大或者过小。<br>-1601代表不符合图片质量控制要求。<br>-1604 代表人脸相似度没有超过FaceMatchThreshold。 </li><li>RetCode的顺序和入参中 Images 或 Urls 的顺序一致。</li></ul>
     */
    public Long [] getRetCode() {
        return this.RetCode;
    }

    /**
     * Set <p>每张人脸图片添加结果。</p><ul><li>其他非 0 值代表算法服务异常，取值范围：<br>-1101 代表未检测到人脸。<br>-1102 代表图片解码失败。<br>-1109 代表图片尺寸过大或者过小。<br>-1601代表不符合图片质量控制要求。<br>-1604 代表人脸相似度没有超过FaceMatchThreshold。 </li><li>RetCode的顺序和入参中 Images 或 Urls 的顺序一致。</li></ul>
     * @param RetCode <p>每张人脸图片添加结果。</p><ul><li>其他非 0 值代表算法服务异常，取值范围：<br>-1101 代表未检测到人脸。<br>-1102 代表图片解码失败。<br>-1109 代表图片尺寸过大或者过小。<br>-1601代表不符合图片质量控制要求。<br>-1604 代表人脸相似度没有超过FaceMatchThreshold。 </li><li>RetCode的顺序和入参中 Images 或 Urls 的顺序一致。</li></ul>
     */
    public void setRetCode(Long [] RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get <p>加入成功的人脸索引。</p><ul><li>索引顺序和入参中 Images 或 Urls 的顺序一致。 </li><li>例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。</li></ul> 
     * @return SucIndexes <p>加入成功的人脸索引。</p><ul><li>索引顺序和入参中 Images 或 Urls 的顺序一致。 </li><li>例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。</li></ul>
     */
    public Long [] getSucIndexes() {
        return this.SucIndexes;
    }

    /**
     * Set <p>加入成功的人脸索引。</p><ul><li>索引顺序和入参中 Images 或 Urls 的顺序一致。 </li><li>例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。</li></ul>
     * @param SucIndexes <p>加入成功的人脸索引。</p><ul><li>索引顺序和入参中 Images 或 Urls 的顺序一致。 </li><li>例如， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。</li></ul>
     */
    public void setSucIndexes(Long [] SucIndexes) {
        this.SucIndexes = SucIndexes;
    }

    /**
     * Get <p>加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。</p> 
     * @return SucFaceRects <p>加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。</p>
     */
    public FaceRect [] getSucFaceRects() {
        return this.SucFaceRects;
    }

    /**
     * Set <p>加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。</p>
     * @param SucFaceRects <p>加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。</p>
     */
    public void setSucFaceRects(FaceRect [] SucFaceRects) {
        this.SucFaceRects = SucFaceRects;
    }

    /**
     * Get <p>人脸识别所用的算法模型版本。</p> 
     * @return FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set <p>人脸识别所用的算法模型版本。</p>
     * @param FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
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

