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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceIdResult extends AbstractModel{

    /**
    * 核身结果：
0 - 通过；
1 - 未通过
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 核身失败描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 订单号 (orderNo)
    */
    @SerializedName("OrderNumber")
    @Expose
    private String OrderNumber;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证件类型： 
ID_CARD - 居民身份证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 活体检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveRate")
    @Expose
    private Long LiveRate;

    /**
    * 人脸检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * 刷脸时间 (UNIX时间戳)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OccurredTime")
    @Expose
    private Long OccurredTime;

    /**
    * 照片数据 (base64编码, 一般为JPG或PNG)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * 视频数据 (base64编码, 一般为MP4)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Video")
    @Expose
    private String Video;

    /**
     * Get 核身结果：
0 - 通过；
1 - 未通过 
     * @return Result 核身结果：
0 - 通过；
1 - 未通过
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 核身结果：
0 - 通过；
1 - 未通过
     * @param Result 核身结果：
0 - 通过；
1 - 未通过
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 核身失败描述 
     * @return Description 核身失败描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 核身失败描述
     * @param Description 核身失败描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 订单号 (orderNo) 
     * @return OrderNumber 订单号 (orderNo)
     */
    public String getOrderNumber() {
        return this.OrderNumber;
    }

    /**
     * Set 订单号 (orderNo)
     * @param OrderNumber 订单号 (orderNo)
     */
    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证件类型： 
ID_CARD - 居民身份证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardType 身份证件类型： 
ID_CARD - 居民身份证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型： 
ID_CARD - 居民身份证
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardType 身份证件类型： 
ID_CARD - 居民身份证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 身份证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardNumber 身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardNumber 身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 活体检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveRate 活体检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveRate() {
        return this.LiveRate;
    }

    /**
     * Set 活体检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveRate 活体检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveRate(Long LiveRate) {
        this.LiveRate = LiveRate;
    }

    /**
     * Get 人脸检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Similarity 人脸检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 人脸检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Similarity 人脸检测得分 (百分制)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get 刷脸时间 (UNIX时间戳)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OccurredTime 刷脸时间 (UNIX时间戳)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOccurredTime() {
        return this.OccurredTime;
    }

    /**
     * Set 刷脸时间 (UNIX时间戳)
注意：此字段可能返回 null，表示取不到有效值。
     * @param OccurredTime 刷脸时间 (UNIX时间戳)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOccurredTime(Long OccurredTime) {
        this.OccurredTime = OccurredTime;
    }

    /**
     * Get 照片数据 (base64编码, 一般为JPG或PNG)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Photo 照片数据 (base64编码, 一般为JPG或PNG)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set 照片数据 (base64编码, 一般为JPG或PNG)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Photo 照片数据 (base64编码, 一般为JPG或PNG)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     * Get 视频数据 (base64编码, 一般为MP4)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Video 视频数据 (base64编码, 一般为MP4)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideo() {
        return this.Video;
    }

    /**
     * Set 视频数据 (base64编码, 一般为MP4)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Video 视频数据 (base64编码, 一般为MP4)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideo(String Video) {
        this.Video = Video;
    }

    public FaceIdResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceIdResult(FaceIdResult source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderNumber != null) {
            this.OrderNumber = new String(source.OrderNumber);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.LiveRate != null) {
            this.LiveRate = new Long(source.LiveRate);
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
        if (source.OccurredTime != null) {
            this.OccurredTime = new Long(source.OccurredTime);
        }
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.Video != null) {
            this.Video = new String(source.Video);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderNumber", this.OrderNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "LiveRate", this.LiveRate);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "OccurredTime", this.OccurredTime);
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamSimple(map, prefix + "Video", this.Video);

    }
}

