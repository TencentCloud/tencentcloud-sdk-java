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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeFaceInfo extends AbstractModel {

    /**
    * 人脸框坐标，依次为左、上、右、下，取值范围为 0 到 1
    */
    @SerializedName("BoundingBox")
    @Expose
    private Float [] BoundingBox;

    /**
    * 人脸 ID
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 人脸裁剪图 URL
    */
    @SerializedName("CropImageURL")
    @Expose
    private String CropImageURL;

    /**
    * 是否为代表人脸
    */
    @SerializedName("IsPrototype")
    @Expose
    private Boolean IsPrototype;

    /**
    * 人员 ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 创建来源。0：自动识别；1：图片导入
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 人脸所在画面的毫秒级 UNIX 时间戳
    */
    @SerializedName("TimestampMs")
    @Expose
    private Long TimestampMs;

    /**
     * Get 人脸框坐标，依次为左、上、右、下，取值范围为 0 到 1 
     * @return BoundingBox 人脸框坐标，依次为左、上、右、下，取值范围为 0 到 1
     */
    public Float [] getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set 人脸框坐标，依次为左、上、右、下，取值范围为 0 到 1
     * @param BoundingBox 人脸框坐标，依次为左、上、右、下，取值范围为 0 到 1
     */
    public void setBoundingBox(Float [] BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get 人脸 ID 
     * @return FaceId 人脸 ID
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸 ID
     * @param FaceId 人脸 ID
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 人脸裁剪图 URL 
     * @return CropImageURL 人脸裁剪图 URL
     */
    public String getCropImageURL() {
        return this.CropImageURL;
    }

    /**
     * Set 人脸裁剪图 URL
     * @param CropImageURL 人脸裁剪图 URL
     */
    public void setCropImageURL(String CropImageURL) {
        this.CropImageURL = CropImageURL;
    }

    /**
     * Get 是否为代表人脸 
     * @return IsPrototype 是否为代表人脸
     */
    public Boolean getIsPrototype() {
        return this.IsPrototype;
    }

    /**
     * Set 是否为代表人脸
     * @param IsPrototype 是否为代表人脸
     */
    public void setIsPrototype(Boolean IsPrototype) {
        this.IsPrototype = IsPrototype;
    }

    /**
     * Get 人员 ID 
     * @return PersonId 人员 ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员 ID
     * @param PersonId 人员 ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 创建来源。0：自动识别；1：图片导入 
     * @return Source 创建来源。0：自动识别；1：图片导入
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 创建来源。0：自动识别；1：图片导入
     * @param Source 创建来源。0：自动识别；1：图片导入
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 人脸所在画面的毫秒级 UNIX 时间戳 
     * @return TimestampMs 人脸所在画面的毫秒级 UNIX 时间戳
     */
    public Long getTimestampMs() {
        return this.TimestampMs;
    }

    /**
     * Set 人脸所在画面的毫秒级 UNIX 时间戳
     * @param TimestampMs 人脸所在画面的毫秒级 UNIX 时间戳
     */
    public void setTimestampMs(Long TimestampMs) {
        this.TimestampMs = TimestampMs;
    }

    public SeeFaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeFaceInfo(SeeFaceInfo source) {
        if (source.BoundingBox != null) {
            this.BoundingBox = new Float[source.BoundingBox.length];
            for (int i = 0; i < source.BoundingBox.length; i++) {
                this.BoundingBox[i] = new Float(source.BoundingBox[i]);
            }
        }
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.CropImageURL != null) {
            this.CropImageURL = new String(source.CropImageURL);
        }
        if (source.IsPrototype != null) {
            this.IsPrototype = new Boolean(source.IsPrototype);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.TimestampMs != null) {
            this.TimestampMs = new Long(source.TimestampMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "CropImageURL", this.CropImageURL);
        this.setParamSimple(map, prefix + "IsPrototype", this.IsPrototype);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TimestampMs", this.TimestampMs);

    }
}

