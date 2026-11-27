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
    * <p>数字人直播间 ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>数字人直播间名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数字人直播间状态，<br>CLOSE - 未开播。<br>OPEN - 直播中。</p><p>枚举值：</p><ul><li>CLOSE： 未开播</li><li>OPEN： 直播中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>数字人形象 KEY。</p>
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * <p>音色 KEY。</p>
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * <p>数字人形象图片 URL。</p>
    */
    @SerializedName("AvatarImageUrl")
    @Expose
    private String AvatarImageUrl;

    /**
    * <p>背景图片 URL。</p>
    */
    @SerializedName("BackgroundUrl")
    @Expose
    private String BackgroundUrl;

    /**
    * <p>推流目标描述。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>目标推流地址。</p>
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

    /**
    * <p>主播大小，默认1.00。 取值范围(0, 15.00]。</p>
    */
    @SerializedName("AnchorScale")
    @Expose
    private Float AnchorScale;

    /**
    * <p>主播纵向位置。默认-1贴底部。</p>
    */
    @SerializedName("AnchorVerticalPos")
    @Expose
    private Long AnchorVerticalPos;

    /**
    * <p>主播横向位置。默认-1居中。</p>
    */
    @SerializedName("AnchorHorizontalPos")
    @Expose
    private Long AnchorHorizontalPos;

    /**
    * <p>语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。</p>
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * <p>音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
    */
    @SerializedName("SpeechVolume")
    @Expose
    private Long SpeechVolume;

    /**
    * <p>直播间创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>直播间最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>直播间类型。</p><p>枚举值：</p><ul><li>AIGC： AIGC直播</li></ul>
    */
    @SerializedName("RoomType")
    @Expose
    private String RoomType;

    /**
    * <p>通过AIGC生成的数字人形象图片 URL。</p>
    */
    @SerializedName("AvatarAigcImageUrl")
    @Expose
    private String AvatarAigcImageUrl;

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
     * Get <p>数字人直播间名称。</p> 
     * @return Name <p>数字人直播间名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数字人直播间名称。</p>
     * @param Name <p>数字人直播间名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数字人直播间状态，<br>CLOSE - 未开播。<br>OPEN - 直播中。</p><p>枚举值：</p><ul><li>CLOSE： 未开播</li><li>OPEN： 直播中</li></ul> 
     * @return Status <p>数字人直播间状态，<br>CLOSE - 未开播。<br>OPEN - 直播中。</p><p>枚举值：</p><ul><li>CLOSE： 未开播</li><li>OPEN： 直播中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数字人直播间状态，<br>CLOSE - 未开播。<br>OPEN - 直播中。</p><p>枚举值：</p><ul><li>CLOSE： 未开播</li><li>OPEN： 直播中</li></ul>
     * @param Status <p>数字人直播间状态，<br>CLOSE - 未开播。<br>OPEN - 直播中。</p><p>枚举值：</p><ul><li>CLOSE： 未开播</li><li>OPEN： 直播中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数字人形象 KEY。</p> 
     * @return AvatarKey <p>数字人形象 KEY。</p>
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set <p>数字人形象 KEY。</p>
     * @param AvatarKey <p>数字人形象 KEY。</p>
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get <p>音色 KEY。</p> 
     * @return TimbreKey <p>音色 KEY。</p>
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set <p>音色 KEY。</p>
     * @param TimbreKey <p>音色 KEY。</p>
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get <p>数字人形象图片 URL。</p> 
     * @return AvatarImageUrl <p>数字人形象图片 URL。</p>
     */
    public String getAvatarImageUrl() {
        return this.AvatarImageUrl;
    }

    /**
     * Set <p>数字人形象图片 URL。</p>
     * @param AvatarImageUrl <p>数字人形象图片 URL。</p>
     */
    public void setAvatarImageUrl(String AvatarImageUrl) {
        this.AvatarImageUrl = AvatarImageUrl;
    }

    /**
     * Get <p>背景图片 URL。</p> 
     * @return BackgroundUrl <p>背景图片 URL。</p>
     */
    public String getBackgroundUrl() {
        return this.BackgroundUrl;
    }

    /**
     * Set <p>背景图片 URL。</p>
     * @param BackgroundUrl <p>背景图片 URL。</p>
     */
    public void setBackgroundUrl(String BackgroundUrl) {
        this.BackgroundUrl = BackgroundUrl;
    }

    /**
     * Get <p>推流目标描述。</p> 
     * @return Comment <p>推流目标描述。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>推流目标描述。</p>
     * @param Comment <p>推流目标描述。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>目标推流地址。</p> 
     * @return ToUrl <p>目标推流地址。</p>
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set <p>目标推流地址。</p>
     * @param ToUrl <p>目标推流地址。</p>
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
    }

    /**
     * Get <p>主播大小，默认1.00。 取值范围(0, 15.00]。</p> 
     * @return AnchorScale <p>主播大小，默认1.00。 取值范围(0, 15.00]。</p>
     */
    public Float getAnchorScale() {
        return this.AnchorScale;
    }

    /**
     * Set <p>主播大小，默认1.00。 取值范围(0, 15.00]。</p>
     * @param AnchorScale <p>主播大小，默认1.00。 取值范围(0, 15.00]。</p>
     */
    public void setAnchorScale(Float AnchorScale) {
        this.AnchorScale = AnchorScale;
    }

    /**
     * Get <p>主播纵向位置。默认-1贴底部。</p> 
     * @return AnchorVerticalPos <p>主播纵向位置。默认-1贴底部。</p>
     */
    public Long getAnchorVerticalPos() {
        return this.AnchorVerticalPos;
    }

    /**
     * Set <p>主播纵向位置。默认-1贴底部。</p>
     * @param AnchorVerticalPos <p>主播纵向位置。默认-1贴底部。</p>
     */
    public void setAnchorVerticalPos(Long AnchorVerticalPos) {
        this.AnchorVerticalPos = AnchorVerticalPos;
    }

    /**
     * Get <p>主播横向位置。默认-1居中。</p> 
     * @return AnchorHorizontalPos <p>主播横向位置。默认-1居中。</p>
     */
    public Long getAnchorHorizontalPos() {
        return this.AnchorHorizontalPos;
    }

    /**
     * Set <p>主播横向位置。默认-1居中。</p>
     * @param AnchorHorizontalPos <p>主播横向位置。默认-1居中。</p>
     */
    public void setAnchorHorizontalPos(Long AnchorHorizontalPos) {
        this.AnchorHorizontalPos = AnchorHorizontalPos;
    }

    /**
     * Get <p>语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。</p> 
     * @return SpeechSpeed <p>语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。</p>
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set <p>语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。</p>
     * @param SpeechSpeed <p>语速（1.0为正常语速，范围[0.5-1.5]，值为0.5时播报语速最慢，值为1.5时播报语速最快。</p>
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get <p>音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p> 
     * @return SpeechVolume <p>音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
     */
    public Long getSpeechVolume() {
        return this.SpeechVolume;
    }

    /**
     * Set <p>音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
     * @param SpeechVolume <p>音量大小，范围[0，10]，对应音量大小。默认为0，代表正常音量，值越大音量越高。</p>
     */
    public void setSpeechVolume(Long SpeechVolume) {
        this.SpeechVolume = SpeechVolume;
    }

    /**
     * Get <p>直播间创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p> 
     * @return CreateTime <p>直播间创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>直播间创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     * @param CreateTime <p>直播间创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>直播间最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p> 
     * @return UpdateTime <p>直播间最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>直播间最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     * @param UpdateTime <p>直播间最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>直播间类型。</p><p>枚举值：</p><ul><li>AIGC： AIGC直播</li></ul> 
     * @return RoomType <p>直播间类型。</p><p>枚举值：</p><ul><li>AIGC： AIGC直播</li></ul>
     */
    public String getRoomType() {
        return this.RoomType;
    }

    /**
     * Set <p>直播间类型。</p><p>枚举值：</p><ul><li>AIGC： AIGC直播</li></ul>
     * @param RoomType <p>直播间类型。</p><p>枚举值：</p><ul><li>AIGC： AIGC直播</li></ul>
     */
    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get <p>通过AIGC生成的数字人形象图片 URL。</p> 
     * @return AvatarAigcImageUrl <p>通过AIGC生成的数字人形象图片 URL。</p>
     */
    public String getAvatarAigcImageUrl() {
        return this.AvatarAigcImageUrl;
    }

    /**
     * Set <p>通过AIGC生成的数字人形象图片 URL。</p>
     * @param AvatarAigcImageUrl <p>通过AIGC生成的数字人形象图片 URL。</p>
     */
    public void setAvatarAigcImageUrl(String AvatarAigcImageUrl) {
        this.AvatarAigcImageUrl = AvatarAigcImageUrl;
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
        if (source.RoomType != null) {
            this.RoomType = new String(source.RoomType);
        }
        if (source.AvatarAigcImageUrl != null) {
            this.AvatarAigcImageUrl = new String(source.AvatarAigcImageUrl);
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
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "AvatarAigcImageUrl", this.AvatarAigcImageUrl);

    }
}

