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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdResultResponse extends AbstractModel{

    /**
    * 身份证
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 业务核验结果，参考https://cloud.tencent.com/document/product/1007/47912
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务核验描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 相似度，0-100，数值越大相似度越高
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * 用户核验的视频
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * 用户核验视频的截帧
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrameBase64")
    @Expose
    private String BestFrameBase64;

    /**
    * 获取token时透传的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份证 
     * @return IdCard 身份证
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证
     * @param IdCard 身份证
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 业务核验结果，参考https://cloud.tencent.com/document/product/1007/47912 
     * @return Result 业务核验结果，参考https://cloud.tencent.com/document/product/1007/47912
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 业务核验结果，参考https://cloud.tencent.com/document/product/1007/47912
     * @param Result 业务核验结果，参考https://cloud.tencent.com/document/product/1007/47912
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 业务核验描述 
     * @return Description 业务核验描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务核验描述
     * @param Description 业务核验描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 相似度，0-100，数值越大相似度越高 
     * @return Similarity 相似度，0-100，数值越大相似度越高
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 相似度，0-100，数值越大相似度越高
     * @param Similarity 相似度，0-100，数值越大相似度越高
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get 用户核验的视频
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoBase64 用户核验的视频
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set 用户核验的视频
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoBase64 用户核验的视频
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get 用户核验视频的截帧
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrameBase64 用户核验视频的截帧
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBestFrameBase64() {
        return this.BestFrameBase64;
    }

    /**
     * Set 用户核验视频的截帧
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrameBase64 用户核验视频的截帧
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrameBase64(String BestFrameBase64) {
        this.BestFrameBase64 = BestFrameBase64;
    }

    /**
     * Get 获取token时透传的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 获取token时透传的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 获取token时透传的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 获取token时透传的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
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
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "BestFrameBase64", this.BestFrameBase64);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

