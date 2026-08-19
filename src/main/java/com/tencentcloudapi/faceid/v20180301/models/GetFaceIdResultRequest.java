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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdResultRequest extends AbstractModel {

    /**
    * <p>SDK人脸核身流程的标识。</p><ul><li>调用<a href="https://cloud.tencent.com/document/product/1007/49198">GetFaceIdToken</a>接口时生成。</li></ul>
    */
    @SerializedName("FaceIdToken")
    @Expose
    private String FaceIdToken;

    /**
    * <p>是否需要拉取视频。</p><ul><li>默认false：不需要。</li></ul>
    */
    @SerializedName("IsNeedVideo")
    @Expose
    private Boolean IsNeedVideo;

    /**
    * <p>是否需要拉取截帧。</p><ul><li>默认false：不需要。</li></ul>
    */
    @SerializedName("IsNeedBestFrame")
    @Expose
    private Boolean IsNeedBestFrame;

    /**
    * <p>是否对回包整体进行加密。</p>
    */
    @SerializedName("IsEncryptResponse")
    @Expose
    private Boolean IsEncryptResponse;

    /**
    * <p>是否需要对返回中的敏感信息进行加密。<br>只需指定加密算法Algorithm即可，其余字段传入默认值。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get <p>SDK人脸核身流程的标识。</p><ul><li>调用<a href="https://cloud.tencent.com/document/product/1007/49198">GetFaceIdToken</a>接口时生成。</li></ul> 
     * @return FaceIdToken <p>SDK人脸核身流程的标识。</p><ul><li>调用<a href="https://cloud.tencent.com/document/product/1007/49198">GetFaceIdToken</a>接口时生成。</li></ul>
     */
    public String getFaceIdToken() {
        return this.FaceIdToken;
    }

    /**
     * Set <p>SDK人脸核身流程的标识。</p><ul><li>调用<a href="https://cloud.tencent.com/document/product/1007/49198">GetFaceIdToken</a>接口时生成。</li></ul>
     * @param FaceIdToken <p>SDK人脸核身流程的标识。</p><ul><li>调用<a href="https://cloud.tencent.com/document/product/1007/49198">GetFaceIdToken</a>接口时生成。</li></ul>
     */
    public void setFaceIdToken(String FaceIdToken) {
        this.FaceIdToken = FaceIdToken;
    }

    /**
     * Get <p>是否需要拉取视频。</p><ul><li>默认false：不需要。</li></ul> 
     * @return IsNeedVideo <p>是否需要拉取视频。</p><ul><li>默认false：不需要。</li></ul>
     */
    public Boolean getIsNeedVideo() {
        return this.IsNeedVideo;
    }

    /**
     * Set <p>是否需要拉取视频。</p><ul><li>默认false：不需要。</li></ul>
     * @param IsNeedVideo <p>是否需要拉取视频。</p><ul><li>默认false：不需要。</li></ul>
     */
    public void setIsNeedVideo(Boolean IsNeedVideo) {
        this.IsNeedVideo = IsNeedVideo;
    }

    /**
     * Get <p>是否需要拉取截帧。</p><ul><li>默认false：不需要。</li></ul> 
     * @return IsNeedBestFrame <p>是否需要拉取截帧。</p><ul><li>默认false：不需要。</li></ul>
     */
    public Boolean getIsNeedBestFrame() {
        return this.IsNeedBestFrame;
    }

    /**
     * Set <p>是否需要拉取截帧。</p><ul><li>默认false：不需要。</li></ul>
     * @param IsNeedBestFrame <p>是否需要拉取截帧。</p><ul><li>默认false：不需要。</li></ul>
     */
    public void setIsNeedBestFrame(Boolean IsNeedBestFrame) {
        this.IsNeedBestFrame = IsNeedBestFrame;
    }

    /**
     * Get <p>是否对回包整体进行加密。</p> 
     * @return IsEncryptResponse <p>是否对回包整体进行加密。</p>
     */
    public Boolean getIsEncryptResponse() {
        return this.IsEncryptResponse;
    }

    /**
     * Set <p>是否对回包整体进行加密。</p>
     * @param IsEncryptResponse <p>是否对回包整体进行加密。</p>
     */
    public void setIsEncryptResponse(Boolean IsEncryptResponse) {
        this.IsEncryptResponse = IsEncryptResponse;
    }

    /**
     * Get <p>是否需要对返回中的敏感信息进行加密。<br>只需指定加密算法Algorithm即可，其余字段传入默认值。</p> 
     * @return Encryption <p>是否需要对返回中的敏感信息进行加密。<br>只需指定加密算法Algorithm即可，其余字段传入默认值。</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>是否需要对返回中的敏感信息进行加密。<br>只需指定加密算法Algorithm即可，其余字段传入默认值。</p>
     * @param Encryption <p>是否需要对返回中的敏感信息进行加密。<br>只需指定加密算法Algorithm即可，其余字段传入默认值。</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public GetFaceIdResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdResultRequest(GetFaceIdResultRequest source) {
        if (source.FaceIdToken != null) {
            this.FaceIdToken = new String(source.FaceIdToken);
        }
        if (source.IsNeedVideo != null) {
            this.IsNeedVideo = new Boolean(source.IsNeedVideo);
        }
        if (source.IsNeedBestFrame != null) {
            this.IsNeedBestFrame = new Boolean(source.IsNeedBestFrame);
        }
        if (source.IsEncryptResponse != null) {
            this.IsEncryptResponse = new Boolean(source.IsEncryptResponse);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceIdToken", this.FaceIdToken);
        this.setParamSimple(map, prefix + "IsNeedVideo", this.IsNeedVideo);
        this.setParamSimple(map, prefix + "IsNeedBestFrame", this.IsNeedBestFrame);
        this.setParamSimple(map, prefix + "IsEncryptResponse", this.IsEncryptResponse);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

