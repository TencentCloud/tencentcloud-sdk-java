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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdResultRequest extends AbstractModel {

    /**
    * SDK人脸核身流程的标识。
- 调用[GetFaceIdToken](https://cloud.tencent.com/document/product/1007/49198)接口时生成。
    */
    @SerializedName("FaceIdToken")
    @Expose
    private String FaceIdToken;

    /**
    * 是否需要拉取视频。
- 默认false：不需要。
    */
    @SerializedName("IsNeedVideo")
    @Expose
    private Boolean IsNeedVideo;

    /**
    * 是否需要拉取截帧。
- 默认false：不需要。
    */
    @SerializedName("IsNeedBestFrame")
    @Expose
    private Boolean IsNeedBestFrame;

    /**
    * 是否对回包整体进行加密。
    */
    @SerializedName("IsEncryptResponse")
    @Expose
    private Boolean IsEncryptResponse;

    /**
    * 是否需要对返回中的敏感信息进行加密。  
只需指定加密算法Algorithm即可，其余字段传入默认值。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get SDK人脸核身流程的标识。
- 调用[GetFaceIdToken](https://cloud.tencent.com/document/product/1007/49198)接口时生成。 
     * @return FaceIdToken SDK人脸核身流程的标识。
- 调用[GetFaceIdToken](https://cloud.tencent.com/document/product/1007/49198)接口时生成。
     */
    public String getFaceIdToken() {
        return this.FaceIdToken;
    }

    /**
     * Set SDK人脸核身流程的标识。
- 调用[GetFaceIdToken](https://cloud.tencent.com/document/product/1007/49198)接口时生成。
     * @param FaceIdToken SDK人脸核身流程的标识。
- 调用[GetFaceIdToken](https://cloud.tencent.com/document/product/1007/49198)接口时生成。
     */
    public void setFaceIdToken(String FaceIdToken) {
        this.FaceIdToken = FaceIdToken;
    }

    /**
     * Get 是否需要拉取视频。
- 默认false：不需要。 
     * @return IsNeedVideo 是否需要拉取视频。
- 默认false：不需要。
     */
    public Boolean getIsNeedVideo() {
        return this.IsNeedVideo;
    }

    /**
     * Set 是否需要拉取视频。
- 默认false：不需要。
     * @param IsNeedVideo 是否需要拉取视频。
- 默认false：不需要。
     */
    public void setIsNeedVideo(Boolean IsNeedVideo) {
        this.IsNeedVideo = IsNeedVideo;
    }

    /**
     * Get 是否需要拉取截帧。
- 默认false：不需要。 
     * @return IsNeedBestFrame 是否需要拉取截帧。
- 默认false：不需要。
     */
    public Boolean getIsNeedBestFrame() {
        return this.IsNeedBestFrame;
    }

    /**
     * Set 是否需要拉取截帧。
- 默认false：不需要。
     * @param IsNeedBestFrame 是否需要拉取截帧。
- 默认false：不需要。
     */
    public void setIsNeedBestFrame(Boolean IsNeedBestFrame) {
        this.IsNeedBestFrame = IsNeedBestFrame;
    }

    /**
     * Get 是否对回包整体进行加密。 
     * @return IsEncryptResponse 是否对回包整体进行加密。
     */
    public Boolean getIsEncryptResponse() {
        return this.IsEncryptResponse;
    }

    /**
     * Set 是否对回包整体进行加密。
     * @param IsEncryptResponse 是否对回包整体进行加密。
     */
    public void setIsEncryptResponse(Boolean IsEncryptResponse) {
        this.IsEncryptResponse = IsEncryptResponse;
    }

    /**
     * Get 是否需要对返回中的敏感信息进行加密。  
只需指定加密算法Algorithm即可，其余字段传入默认值。 
     * @return Encryption 是否需要对返回中的敏感信息进行加密。  
只需指定加密算法Algorithm即可，其余字段传入默认值。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 是否需要对返回中的敏感信息进行加密。  
只需指定加密算法Algorithm即可，其余字段传入默认值。
     * @param Encryption 是否需要对返回中的敏感信息进行加密。  
只需指定加密算法Algorithm即可，其余字段传入默认值。
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

