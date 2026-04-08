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
    * <p>数字人直播间 ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>直播间名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数字人形象KEY。</p>
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * <p>音色KEY。</p>
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * <p>背景图片URL。</p>
    */
    @SerializedName("BackgroundUrl")
    @Expose
    private String BackgroundUrl;

    /**
    * <p>主播大小，默认1.00。<br>取值范围(0, 15.00]。<br>精度：使用小数点后两位。</p>
    */
    @SerializedName("AnchorScale")
    @Expose
    private Float AnchorScale;

    /**
    * <p>主播纵向位置。默认-1贴底部。<br>左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。<br>即该纵向位置最大为：数字人分辨率的高 - 形象高。</p>
    */
    @SerializedName("AnchorVerticalPos")
    @Expose
    private Long AnchorVerticalPos;

    /**
    * <p>主播横向位置。默认-1居中。<br>左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。<br>即最大值为：数字人分辨率的宽 - 形象宽。</p>
    */
    @SerializedName("AnchorHorizontalPos")
    @Expose
    private Long AnchorHorizontalPos;

    /**
    * <p>语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。</p>
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * <p>音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。</p>
    */
    @SerializedName("SpeechVolume")
    @Expose
    private Long SpeechVolume;

    /**
    * <p>操作者。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
    */
    @SerializedName("RoomType")
    @Expose
    private String RoomType;

    /**
     * Get <p>数字人直播间 ID。</p> 
     * @return RoomId <p>数字人直播间 ID。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>数字人直播间 ID。</p>
     * @param RoomId <p>数字人直播间 ID。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>直播间名称。</p> 
     * @return Name <p>直播间名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>直播间名称。</p>
     * @param Name <p>直播间名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数字人形象KEY。</p> 
     * @return AvatarKey <p>数字人形象KEY。</p>
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set <p>数字人形象KEY。</p>
     * @param AvatarKey <p>数字人形象KEY。</p>
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get <p>音色KEY。</p> 
     * @return TimbreKey <p>音色KEY。</p>
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set <p>音色KEY。</p>
     * @param TimbreKey <p>音色KEY。</p>
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get <p>背景图片URL。</p> 
     * @return BackgroundUrl <p>背景图片URL。</p>
     */
    public String getBackgroundUrl() {
        return this.BackgroundUrl;
    }

    /**
     * Set <p>背景图片URL。</p>
     * @param BackgroundUrl <p>背景图片URL。</p>
     */
    public void setBackgroundUrl(String BackgroundUrl) {
        this.BackgroundUrl = BackgroundUrl;
    }

    /**
     * Get <p>主播大小，默认1.00。<br>取值范围(0, 15.00]。<br>精度：使用小数点后两位。</p> 
     * @return AnchorScale <p>主播大小，默认1.00。<br>取值范围(0, 15.00]。<br>精度：使用小数点后两位。</p>
     */
    public Float getAnchorScale() {
        return this.AnchorScale;
    }

    /**
     * Set <p>主播大小，默认1.00。<br>取值范围(0, 15.00]。<br>精度：使用小数点后两位。</p>
     * @param AnchorScale <p>主播大小，默认1.00。<br>取值范围(0, 15.00]。<br>精度：使用小数点后两位。</p>
     */
    public void setAnchorScale(Float AnchorScale) {
        this.AnchorScale = AnchorScale;
    }

    /**
     * Get <p>主播纵向位置。默认-1贴底部。<br>左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。<br>即该纵向位置最大为：数字人分辨率的高 - 形象高。</p> 
     * @return AnchorVerticalPos <p>主播纵向位置。默认-1贴底部。<br>左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。<br>即该纵向位置最大为：数字人分辨率的高 - 形象高。</p>
     */
    public Long getAnchorVerticalPos() {
        return this.AnchorVerticalPos;
    }

    /**
     * Set <p>主播纵向位置。默认-1贴底部。<br>左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。<br>即该纵向位置最大为：数字人分辨率的高 - 形象高。</p>
     * @param AnchorVerticalPos <p>主播纵向位置。默认-1贴底部。<br>左上角为原点，形象顶部离屏幕顶部的距离，最大不能使形象底部超出屏幕。<br>即该纵向位置最大为：数字人分辨率的高 - 形象高。</p>
     */
    public void setAnchorVerticalPos(Long AnchorVerticalPos) {
        this.AnchorVerticalPos = AnchorVerticalPos;
    }

    /**
     * Get <p>主播横向位置。默认-1居中。<br>左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。<br>即最大值为：数字人分辨率的宽 - 形象宽。</p> 
     * @return AnchorHorizontalPos <p>主播横向位置。默认-1居中。<br>左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。<br>即最大值为：数字人分辨率的宽 - 形象宽。</p>
     */
    public Long getAnchorHorizontalPos() {
        return this.AnchorHorizontalPos;
    }

    /**
     * Set <p>主播横向位置。默认-1居中。<br>左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。<br>即最大值为：数字人分辨率的宽 - 形象宽。</p>
     * @param AnchorHorizontalPos <p>主播横向位置。默认-1居中。<br>左上角为原点，形象左侧离左侧屏幕的距离。最大值不可使形象右侧超出右侧屏幕。<br>即最大值为：数字人分辨率的宽 - 形象宽。</p>
     */
    public void setAnchorHorizontalPos(Long AnchorHorizontalPos) {
        this.AnchorHorizontalPos = AnchorHorizontalPos;
    }

    /**
     * Get <p>语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。</p> 
     * @return SpeechSpeed <p>语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。</p>
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set <p>语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。</p>
     * @param SpeechSpeed <p>语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。</p>
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get <p>音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。</p> 
     * @return SpeechVolume <p>音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。</p>
     */
    public Long getSpeechVolume() {
        return this.SpeechVolume;
    }

    /**
     * Set <p>音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。</p>
     * @param SpeechVolume <p>音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。</p>
     */
    public void setSpeechVolume(Long SpeechVolume) {
        this.SpeechVolume = SpeechVolume;
    }

    /**
     * Get <p>操作者。</p> 
     * @return Operator <p>操作者。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者。</p>
     * @param Operator <p>操作者。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul> 
     * @return RoomType <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
     */
    public String getRoomType() {
        return this.RoomType;
    }

    /**
     * Set <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
     * @param RoomType <p>房间类型。AIGC：AIGC形象房间；PRESET：预设形象房间</p><p>枚举值：</p><ul><li>AIGC： AIGC形象房间</li><li>PRESET： 预设形象房间</li></ul>
     */
    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
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
        if (source.RoomType != null) {
            this.RoomType = new String(source.RoomType);
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
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);

    }
}

