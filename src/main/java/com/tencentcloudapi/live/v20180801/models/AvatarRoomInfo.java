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

public class AvatarRoomInfo extends AbstractModel {

    /**
    * 数字人直播间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 数字人直播间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数字人直播间状态，
CLOSE - 未开播。
OPEN - 直播中。

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数字人形象 KEY。
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * 音色 KEy。
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * 数字人形象图片 URL。
    */
    @SerializedName("AvatarImageUrl")
    @Expose
    private String AvatarImageUrl;

    /**
    * 背景图片 URL。
    */
    @SerializedName("BackgroundUrl")
    @Expose
    private String BackgroundUrl;

    /**
    * 推流目标描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 目标推流地址。
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * 主播大小，默认1.00。 取值范围(0, 15.00]。
    */
    @SerializedName("AnchorScale")
    @Expose
    private Float AnchorScale;

    /**
    * 主播纵向位置。默认-1贴底部。
    */
    @SerializedName("AnchorVerticalPos")
    @Expose
    private Long AnchorVerticalPos;

    /**
    * 主播横向位置。默认-1居中。
    */
    @SerializedName("AnchorHorizontalPos")
    @Expose
    private Long AnchorHorizontalPos;

    /**
    * 语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
    */
    @SerializedName("SpeechVolume")
    @Expose
    private Long SpeechVolume;

    /**
    * 直播间创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 直播间最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 数字人直播间 ID。 
     * @return RoomId 数字人直播间 ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 数字人直播间 ID。
     * @param RoomId 数字人直播间 ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 数字人直播间名称。 
     * @return Name 数字人直播间名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数字人直播间名称。
     * @param Name 数字人直播间名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数字人直播间状态，
CLOSE - 未开播。
OPEN - 直播中。
 
     * @return Status 数字人直播间状态，
CLOSE - 未开播。
OPEN - 直播中。

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数字人直播间状态，
CLOSE - 未开播。
OPEN - 直播中。

     * @param Status 数字人直播间状态，
CLOSE - 未开播。
OPEN - 直播中。

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数字人形象 KEY。 
     * @return AvatarKey 数字人形象 KEY。
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set 数字人形象 KEY。
     * @param AvatarKey 数字人形象 KEY。
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get 音色 KEy。 
     * @return TimbreKey 音色 KEy。
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set 音色 KEy。
     * @param TimbreKey 音色 KEy。
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get 数字人形象图片 URL。 
     * @return AvatarImageUrl 数字人形象图片 URL。
     */
    public String getAvatarImageUrl() {
        return this.AvatarImageUrl;
    }

    /**
     * Set 数字人形象图片 URL。
     * @param AvatarImageUrl 数字人形象图片 URL。
     */
    public void setAvatarImageUrl(String AvatarImageUrl) {
        this.AvatarImageUrl = AvatarImageUrl;
    }

    /**
     * Get 背景图片 URL。 
     * @return BackgroundUrl 背景图片 URL。
     */
    public String getBackgroundUrl() {
        return this.BackgroundUrl;
    }

    /**
     * Set 背景图片 URL。
     * @param BackgroundUrl 背景图片 URL。
     */
    public void setBackgroundUrl(String BackgroundUrl) {
        this.BackgroundUrl = BackgroundUrl;
    }

    /**
     * Get 推流目标描述。 
     * @return Comment 推流目标描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 推流目标描述。
     * @param Comment 推流目标描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 目标推流地址。 
     * @return ToUrl 目标推流地址。
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set 目标推流地址。
     * @param ToUrl 目标推流地址。
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get 主播大小，默认1.00。 取值范围(0, 15.00]。 
     * @return AnchorScale 主播大小，默认1.00。 取值范围(0, 15.00]。
     */
    public Float getAnchorScale() {
        return this.AnchorScale;
    }

    /**
     * Set 主播大小，默认1.00。 取值范围(0, 15.00]。
     * @param AnchorScale 主播大小，默认1.00。 取值范围(0, 15.00]。
     */
    public void setAnchorScale(Float AnchorScale) {
        this.AnchorScale = AnchorScale;
    }

    /**
     * Get 主播纵向位置。默认-1贴底部。 
     * @return AnchorVerticalPos 主播纵向位置。默认-1贴底部。
     */
    public Long getAnchorVerticalPos() {
        return this.AnchorVerticalPos;
    }

    /**
     * Set 主播纵向位置。默认-1贴底部。
     * @param AnchorVerticalPos 主播纵向位置。默认-1贴底部。
     */
    public void setAnchorVerticalPos(Long AnchorVerticalPos) {
        this.AnchorVerticalPos = AnchorVerticalPos;
    }

    /**
     * Get 主播横向位置。默认-1居中。 
     * @return AnchorHorizontalPos 主播横向位置。默认-1居中。
     */
    public Long getAnchorHorizontalPos() {
        return this.AnchorHorizontalPos;
    }

    /**
     * Set 主播横向位置。默认-1居中。
     * @param AnchorHorizontalPos 主播横向位置。默认-1居中。
     */
    public void setAnchorHorizontalPos(Long AnchorHorizontalPos) {
        this.AnchorHorizontalPos = AnchorHorizontalPos;
    }

    /**
     * Get 语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。 
     * @return SpeechSpeed 语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set 语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。
     * @param SpeechSpeed 语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。 
     * @return SpeechVolume 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     */
    public Long getSpeechVolume() {
        return this.SpeechVolume;
    }

    /**
     * Set 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     * @param SpeechVolume 音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。
     */
    public void setSpeechVolume(Long SpeechVolume) {
        this.SpeechVolume = SpeechVolume;
    }

    /**
     * Get 直播间创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。 
     * @return CreateTime 直播间创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 直播间创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     * @param CreateTime 直播间创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 直播间最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。 
     * @return UpdateTime 直播间最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 直播间最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     * @param UpdateTime 直播间最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AvatarRoomInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarRoomInfo(AvatarRoomInfo source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AvatarKey != null) {
            this.AvatarKey = new String(source.AvatarKey);
        }
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.AvatarImageUrl != null) {
            this.AvatarImageUrl = new String(source.AvatarImageUrl);
        }
        if (source.BackgroundUrl != null) {
            this.BackgroundUrl = new String(source.BackgroundUrl);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ToUrl != null) {
            this.ToUrl = new String(source.ToUrl);
        }
        if (source.AnchorScale != null) {
            this.AnchorScale = new Float(source.AnchorScale);
        }
        if (source.AnchorVerticalPos != null) {
            this.AnchorVerticalPos = new Long(source.AnchorVerticalPos);
        }
        if (source.AnchorHorizontalPos != null) {
            this.AnchorHorizontalPos = new Long(source.AnchorHorizontalPos);
        }
        if (source.SpeechSpeed != null) {
            this.SpeechSpeed = new Float(source.SpeechSpeed);
        }
        if (source.SpeechVolume != null) {
            this.SpeechVolume = new Long(source.SpeechVolume);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AvatarKey", this.AvatarKey);
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "AvatarImageUrl", this.AvatarImageUrl);
        this.setParamSimple(map, prefix + "BackgroundUrl", this.BackgroundUrl);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "AnchorScale", this.AnchorScale);
        this.setParamSimple(map, prefix + "AnchorVerticalPos", this.AnchorVerticalPos);
        this.setParamSimple(map, prefix + "AnchorHorizontalPos", this.AnchorHorizontalPos);
        this.setParamSimple(map, prefix + "SpeechSpeed", this.SpeechSpeed);
        this.setParamSimple(map, prefix + "SpeechVolume", this.SpeechVolume);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

