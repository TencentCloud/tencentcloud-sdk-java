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

public class ModifyLiveAvatarRoomRequest extends AbstractModel {

    /**
    * 数字人直播间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 直播间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数字人形象KEY。
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * 音色KEY。
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * 背景图片URL。
    */
    @SerializedName("BackgroundUrl")
    @Expose
    private String BackgroundUrl;

    /**
    * 主播大小，默认1.00。
取值范围(0, 15.00]。
精度：使用小数点后两位。
    */
    @SerializedName("AnchorScale")
    @Expose
    private Float AnchorScale;

    /**
    * 主播纵向位置。默认-1贴底部。
左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。
即该纵向位置最大为：数字人分辨率的高 - 形象高。
    */
    @SerializedName("AnchorVerticalPos")
    @Expose
    private Long AnchorVerticalPos;

    /**
    * 主播横向位置。默认-1居中。
左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。
即最大值为：数字人分辨率的宽 - 形象宽。
    */
    @SerializedName("AnchorHorizontalPos")
    @Expose
    private Long AnchorHorizontalPos;

    /**
    * 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。
    */
    @SerializedName("SpeechVolume")
    @Expose
    private Long SpeechVolume;

    /**
    * 操作者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

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
     * Get 直播间名称。 
     * @return Name 直播间名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 直播间名称。
     * @param Name 直播间名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数字人形象KEY。 
     * @return AvatarKey 数字人形象KEY。
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set 数字人形象KEY。
     * @param AvatarKey 数字人形象KEY。
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get 音色KEY。 
     * @return TimbreKey 音色KEY。
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set 音色KEY。
     * @param TimbreKey 音色KEY。
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get 背景图片URL。 
     * @return BackgroundUrl 背景图片URL。
     */
    public String getBackgroundUrl() {
        return this.BackgroundUrl;
    }

    /**
     * Set 背景图片URL。
     * @param BackgroundUrl 背景图片URL。
     */
    public void setBackgroundUrl(String BackgroundUrl) {
        this.BackgroundUrl = BackgroundUrl;
    }

    /**
     * Get 主播大小，默认1.00。
取值范围(0, 15.00]。
精度：使用小数点后两位。 
     * @return AnchorScale 主播大小，默认1.00。
取值范围(0, 15.00]。
精度：使用小数点后两位。
     */
    public Float getAnchorScale() {
        return this.AnchorScale;
    }

    /**
     * Set 主播大小，默认1.00。
取值范围(0, 15.00]。
精度：使用小数点后两位。
     * @param AnchorScale 主播大小，默认1.00。
取值范围(0, 15.00]。
精度：使用小数点后两位。
     */
    public void setAnchorScale(Float AnchorScale) {
        this.AnchorScale = AnchorScale;
    }

    /**
     * Get 主播纵向位置。默认-1贴底部。
左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。
即该纵向位置最大为：数字人分辨率的高 - 形象高。 
     * @return AnchorVerticalPos 主播纵向位置。默认-1贴底部。
左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。
即该纵向位置最大为：数字人分辨率的高 - 形象高。
     */
    public Long getAnchorVerticalPos() {
        return this.AnchorVerticalPos;
    }

    /**
     * Set 主播纵向位置。默认-1贴底部。
左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。
即该纵向位置最大为：数字人分辨率的高 - 形象高。
     * @param AnchorVerticalPos 主播纵向位置。默认-1贴底部。
左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。
即该纵向位置最大为：数字人分辨率的高 - 形象高。
     */
    public void setAnchorVerticalPos(Long AnchorVerticalPos) {
        this.AnchorVerticalPos = AnchorVerticalPos;
    }

    /**
     * Get 主播横向位置。默认-1居中。
左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。
即最大值为：数字人分辨率的宽 - 形象宽。 
     * @return AnchorHorizontalPos 主播横向位置。默认-1居中。
左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。
即最大值为：数字人分辨率的宽 - 形象宽。
     */
    public Long getAnchorHorizontalPos() {
        return this.AnchorHorizontalPos;
    }

    /**
     * Set 主播横向位置。默认-1居中。
左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。
即最大值为：数字人分辨率的宽 - 形象宽。
     * @param AnchorHorizontalPos 主播横向位置。默认-1居中。
左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。
即最大值为：数字人分辨率的宽 - 形象宽。
     */
    public void setAnchorHorizontalPos(Long AnchorHorizontalPos) {
        this.AnchorHorizontalPos = AnchorHorizontalPos;
    }

    /**
     * Get 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。 
     * @return SpeechSpeed 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。
     * @param SpeechSpeed 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。 
     * @return SpeechVolume 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。
     */
    public Long getSpeechVolume() {
        return this.SpeechVolume;
    }

    /**
     * Set 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。
     * @param SpeechVolume 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。
     */
    public void setSpeechVolume(Long SpeechVolume) {
        this.SpeechVolume = SpeechVolume;
    }

    /**
     * Get 操作者。 
     * @return Operator 操作者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。
     * @param Operator 操作者。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ModifyLiveAvatarRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveAvatarRoomRequest(ModifyLiveAvatarRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AvatarKey != null) {
            this.AvatarKey = new String(source.AvatarKey);
        }
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.BackgroundUrl != null) {
            this.BackgroundUrl = new String(source.BackgroundUrl);
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AvatarKey", this.AvatarKey);
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "BackgroundUrl", this.BackgroundUrl);
        this.setParamSimple(map, prefix + "AnchorScale", this.AnchorScale);
        this.setParamSimple(map, prefix + "AnchorVerticalPos", this.AnchorVerticalPos);
        this.setParamSimple(map, prefix + "AnchorHorizontalPos", this.AnchorHorizontalPos);
        this.setParamSimple(map, prefix + "SpeechSpeed", this.SpeechSpeed);
        this.setParamSimple(map, prefix + "SpeechVolume", this.SpeechVolume);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

