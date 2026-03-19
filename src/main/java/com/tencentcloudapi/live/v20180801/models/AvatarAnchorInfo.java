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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvatarAnchorInfo extends AbstractModel {

    /**
    * 主播昵称。同一个主播可以存在多个数字人ID。
    */
    @SerializedName("AnchorName")
    @Expose
    private String AnchorName;

    /**
    * 主播 ID。用于标识主播形象。同一个主播ID可存在竖屏和横屏两种数字人。
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 主播性别。male-男性，femal-女性。
    */
    @SerializedName("AnchorGender")
    @Expose
    private String AnchorGender;

    /**
    * 形象图片。
    */
    @SerializedName("PoseImage")
    @Expose
    private String PoseImage;

    /**
    * 主播形象图片的分辨率。
    */
    @SerializedName("PoseImageResolution")
    @Expose
    private String PoseImageResolution;

    /**
    * 形象预览视频段。
    */
    @SerializedName("ReferenceVideoSegmentUrl")
    @Expose
    private String ReferenceVideoSegmentUrl;

    /**
    * 横屏数字人信息。
    */
    @SerializedName("HorizontalAvatar")
    @Expose
    private AvatarImageInfo HorizontalAvatar;

    /**
    * 竖屏数字人信息。
    */
    @SerializedName("VerticalAvatar")
    @Expose
    private AvatarImageInfo VerticalAvatar;

    /**
    * 推荐音色。
    */
    @SerializedName("SuggestTimbreKey")
    @Expose
    private String SuggestTimbreKey;

    /**
     * Get 主播昵称。同一个主播可以存在多个数字人ID。 
     * @return AnchorName 主播昵称。同一个主播可以存在多个数字人ID。
     */
    public String getAnchorName() {
        return this.AnchorName;
    }

    /**
     * Set 主播昵称。同一个主播可以存在多个数字人ID。
     * @param AnchorName 主播昵称。同一个主播可以存在多个数字人ID。
     */
    public void setAnchorName(String AnchorName) {
        this.AnchorName = AnchorName;
    }

    /**
     * Get 主播 ID。用于标识主播形象。同一个主播ID可存在竖屏和横屏两种数字人。 
     * @return AnchorId 主播 ID。用于标识主播形象。同一个主播ID可存在竖屏和横屏两种数字人。
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播 ID。用于标识主播形象。同一个主播ID可存在竖屏和横屏两种数字人。
     * @param AnchorId 主播 ID。用于标识主播形象。同一个主播ID可存在竖屏和横屏两种数字人。
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 主播性别。male-男性，femal-女性。 
     * @return AnchorGender 主播性别。male-男性，femal-女性。
     */
    public String getAnchorGender() {
        return this.AnchorGender;
    }

    /**
     * Set 主播性别。male-男性，femal-女性。
     * @param AnchorGender 主播性别。male-男性，femal-女性。
     */
    public void setAnchorGender(String AnchorGender) {
        this.AnchorGender = AnchorGender;
    }

    /**
     * Get 形象图片。 
     * @return PoseImage 形象图片。
     */
    public String getPoseImage() {
        return this.PoseImage;
    }

    /**
     * Set 形象图片。
     * @param PoseImage 形象图片。
     */
    public void setPoseImage(String PoseImage) {
        this.PoseImage = PoseImage;
    }

    /**
     * Get 主播形象图片的分辨率。 
     * @return PoseImageResolution 主播形象图片的分辨率。
     */
    public String getPoseImageResolution() {
        return this.PoseImageResolution;
    }

    /**
     * Set 主播形象图片的分辨率。
     * @param PoseImageResolution 主播形象图片的分辨率。
     */
    public void setPoseImageResolution(String PoseImageResolution) {
        this.PoseImageResolution = PoseImageResolution;
    }

    /**
     * Get 形象预览视频段。 
     * @return ReferenceVideoSegmentUrl 形象预览视频段。
     */
    public String getReferenceVideoSegmentUrl() {
        return this.ReferenceVideoSegmentUrl;
    }

    /**
     * Set 形象预览视频段。
     * @param ReferenceVideoSegmentUrl 形象预览视频段。
     */
    public void setReferenceVideoSegmentUrl(String ReferenceVideoSegmentUrl) {
        this.ReferenceVideoSegmentUrl = ReferenceVideoSegmentUrl;
    }

    /**
     * Get 横屏数字人信息。 
     * @return HorizontalAvatar 横屏数字人信息。
     */
    public AvatarImageInfo getHorizontalAvatar() {
        return this.HorizontalAvatar;
    }

    /**
     * Set 横屏数字人信息。
     * @param HorizontalAvatar 横屏数字人信息。
     */
    public void setHorizontalAvatar(AvatarImageInfo HorizontalAvatar) {
        this.HorizontalAvatar = HorizontalAvatar;
    }

    /**
     * Get 竖屏数字人信息。 
     * @return VerticalAvatar 竖屏数字人信息。
     */
    public AvatarImageInfo getVerticalAvatar() {
        return this.VerticalAvatar;
    }

    /**
     * Set 竖屏数字人信息。
     * @param VerticalAvatar 竖屏数字人信息。
     */
    public void setVerticalAvatar(AvatarImageInfo VerticalAvatar) {
        this.VerticalAvatar = VerticalAvatar;
    }

    /**
     * Get 推荐音色。 
     * @return SuggestTimbreKey 推荐音色。
     */
    public String getSuggestTimbreKey() {
        return this.SuggestTimbreKey;
    }

    /**
     * Set 推荐音色。
     * @param SuggestTimbreKey 推荐音色。
     */
    public void setSuggestTimbreKey(String SuggestTimbreKey) {
        this.SuggestTimbreKey = SuggestTimbreKey;
    }

    public AvatarAnchorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarAnchorInfo(AvatarAnchorInfo source) {
        if (source.AnchorName != null) {
            this.AnchorName = new String(source.AnchorName);
        }
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.AnchorGender != null) {
            this.AnchorGender = new String(source.AnchorGender);
        }
        if (source.PoseImage != null) {
            this.PoseImage = new String(source.PoseImage);
        }
        if (source.PoseImageResolution != null) {
            this.PoseImageResolution = new String(source.PoseImageResolution);
        }
        if (source.ReferenceVideoSegmentUrl != null) {
            this.ReferenceVideoSegmentUrl = new String(source.ReferenceVideoSegmentUrl);
        }
        if (source.HorizontalAvatar != null) {
            this.HorizontalAvatar = new AvatarImageInfo(source.HorizontalAvatar);
        }
        if (source.VerticalAvatar != null) {
            this.VerticalAvatar = new AvatarImageInfo(source.VerticalAvatar);
        }
        if (source.SuggestTimbreKey != null) {
            this.SuggestTimbreKey = new String(source.SuggestTimbreKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorName", this.AnchorName);
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "AnchorGender", this.AnchorGender);
        this.setParamSimple(map, prefix + "PoseImage", this.PoseImage);
        this.setParamSimple(map, prefix + "PoseImageResolution", this.PoseImageResolution);
        this.setParamSimple(map, prefix + "ReferenceVideoSegmentUrl", this.ReferenceVideoSegmentUrl);
        this.setParamObj(map, prefix + "HorizontalAvatar.", this.HorizontalAvatar);
        this.setParamObj(map, prefix + "VerticalAvatar.", this.VerticalAvatar);
        this.setParamSimple(map, prefix + "SuggestTimbreKey", this.SuggestTimbreKey);

    }
}

