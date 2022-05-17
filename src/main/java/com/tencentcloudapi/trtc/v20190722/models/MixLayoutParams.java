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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixLayoutParams extends AbstractModel{

    /**
    * 布局模式:
1：悬浮布局；
2：屏幕分享布局；
3：九宫格布局（默认）；
4：自定义布局；

悬浮布局：默认第一个进入房间的主播（也可以指定一个主播）的视频画面会铺满整个屏幕。其他主播的视频画面从左下角开始依次按照进房顺序水平排列，显示为小画面，小画面悬浮于大画面之上。当画面数量小于等于17个时，每行4个（4 x 4排列）。当画面数量大于17个时，重新布局小画面为每行5个（5 x 5）排列。最多支持25个画面，如果用户只发送音频，仍然会占用画面位置。

屏幕分享布局：指定一个主播在屏幕左侧的大画面位置（如果不指定，那么大画面位置为背景色），其他主播自上而下依次垂直排列于右侧。当画面数量少于17个的时候，右侧每列最多8人，最多占据两列。当画面数量多于17个的时候，超过17个画面的主播从左下角开始依次水平排列。最多支持25个画面，如果主播只发送音频，仍然会占用画面位置。

九宫格布局：根据主播的数量自动调整每个画面的大小，每个主播的画面大小一致，最多支持25个画面。

自定义布局：根据需要在MixLayoutList内定制每个主播画面的布局。
    */
    @SerializedName("MixLayoutMode")
    @Expose
    private Long MixLayoutMode;

    /**
    * 如果MixLayoutMode 选择为4自定义布局模式的话，设置此参数为每个主播所对应的布局画面的详细信息，最大不超过25个。
    */
    @SerializedName("MixLayoutList")
    @Expose
    private MixLayout [] MixLayoutList;

    /**
    * 录制背景颜色，RGB的颜色表的16进制表示，每个颜色通过8bit长度标识，默认为黑色。比如橙色对应的RGB为 R:255 G:165 B:0, 那么对应的字符串描述为#FFA500，格式规范：‘#‘开头，后面跟固定RGB的颜色值
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * 在布局模式为1：悬浮布局和 2：屏幕分享布局时，设定为显示大视频画面的UserId。不填的话：悬浮布局默认是第一个进房间的主播，屏幕分享布局默认是背景色
    */
    @SerializedName("MaxResolutionUserId")
    @Expose
    private String MaxResolutionUserId;

    /**
    * 主辅路标识，
0：主流（默认）；
1：辅流（屏幕分享）；
这个位置的MediaId代表的是对应MaxResolutionUserId的主辅路，MixLayoutList内代表的是自定义用户的主辅路。
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * 下载的url地址， 只支持jpg， png，大小限制不超过5M。
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * 设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
    */
    @SerializedName("PlaceHolderMode")
    @Expose
    private Long PlaceHolderMode;

    /**
    * 背景画面宽高比不一致的时候处理方案，与MixLayoufList定义的RenderMode一致。
    */
    @SerializedName("BackgroundImageRenderMode")
    @Expose
    private Long BackgroundImageRenderMode;

    /**
    * 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
    */
    @SerializedName("DefaultSubBackgroundImage")
    @Expose
    private String DefaultSubBackgroundImage;

    /**
    * 水印布局参数， 最多支持25个。
    */
    @SerializedName("WaterMarkList")
    @Expose
    private WaterMark [] WaterMarkList;

    /**
     * Get 布局模式:
1：悬浮布局；
2：屏幕分享布局；
3：九宫格布局（默认）；
4：自定义布局；

悬浮布局：默认第一个进入房间的主播（也可以指定一个主播）的视频画面会铺满整个屏幕。其他主播的视频画面从左下角开始依次按照进房顺序水平排列，显示为小画面，小画面悬浮于大画面之上。当画面数量小于等于17个时，每行4个（4 x 4排列）。当画面数量大于17个时，重新布局小画面为每行5个（5 x 5）排列。最多支持25个画面，如果用户只发送音频，仍然会占用画面位置。

屏幕分享布局：指定一个主播在屏幕左侧的大画面位置（如果不指定，那么大画面位置为背景色），其他主播自上而下依次垂直排列于右侧。当画面数量少于17个的时候，右侧每列最多8人，最多占据两列。当画面数量多于17个的时候，超过17个画面的主播从左下角开始依次水平排列。最多支持25个画面，如果主播只发送音频，仍然会占用画面位置。

九宫格布局：根据主播的数量自动调整每个画面的大小，每个主播的画面大小一致，最多支持25个画面。

自定义布局：根据需要在MixLayoutList内定制每个主播画面的布局。 
     * @return MixLayoutMode 布局模式:
1：悬浮布局；
2：屏幕分享布局；
3：九宫格布局（默认）；
4：自定义布局；

悬浮布局：默认第一个进入房间的主播（也可以指定一个主播）的视频画面会铺满整个屏幕。其他主播的视频画面从左下角开始依次按照进房顺序水平排列，显示为小画面，小画面悬浮于大画面之上。当画面数量小于等于17个时，每行4个（4 x 4排列）。当画面数量大于17个时，重新布局小画面为每行5个（5 x 5）排列。最多支持25个画面，如果用户只发送音频，仍然会占用画面位置。

屏幕分享布局：指定一个主播在屏幕左侧的大画面位置（如果不指定，那么大画面位置为背景色），其他主播自上而下依次垂直排列于右侧。当画面数量少于17个的时候，右侧每列最多8人，最多占据两列。当画面数量多于17个的时候，超过17个画面的主播从左下角开始依次水平排列。最多支持25个画面，如果主播只发送音频，仍然会占用画面位置。

九宫格布局：根据主播的数量自动调整每个画面的大小，每个主播的画面大小一致，最多支持25个画面。

自定义布局：根据需要在MixLayoutList内定制每个主播画面的布局。
     */
    public Long getMixLayoutMode() {
        return this.MixLayoutMode;
    }

    /**
     * Set 布局模式:
1：悬浮布局；
2：屏幕分享布局；
3：九宫格布局（默认）；
4：自定义布局；

悬浮布局：默认第一个进入房间的主播（也可以指定一个主播）的视频画面会铺满整个屏幕。其他主播的视频画面从左下角开始依次按照进房顺序水平排列，显示为小画面，小画面悬浮于大画面之上。当画面数量小于等于17个时，每行4个（4 x 4排列）。当画面数量大于17个时，重新布局小画面为每行5个（5 x 5）排列。最多支持25个画面，如果用户只发送音频，仍然会占用画面位置。

屏幕分享布局：指定一个主播在屏幕左侧的大画面位置（如果不指定，那么大画面位置为背景色），其他主播自上而下依次垂直排列于右侧。当画面数量少于17个的时候，右侧每列最多8人，最多占据两列。当画面数量多于17个的时候，超过17个画面的主播从左下角开始依次水平排列。最多支持25个画面，如果主播只发送音频，仍然会占用画面位置。

九宫格布局：根据主播的数量自动调整每个画面的大小，每个主播的画面大小一致，最多支持25个画面。

自定义布局：根据需要在MixLayoutList内定制每个主播画面的布局。
     * @param MixLayoutMode 布局模式:
1：悬浮布局；
2：屏幕分享布局；
3：九宫格布局（默认）；
4：自定义布局；

悬浮布局：默认第一个进入房间的主播（也可以指定一个主播）的视频画面会铺满整个屏幕。其他主播的视频画面从左下角开始依次按照进房顺序水平排列，显示为小画面，小画面悬浮于大画面之上。当画面数量小于等于17个时，每行4个（4 x 4排列）。当画面数量大于17个时，重新布局小画面为每行5个（5 x 5）排列。最多支持25个画面，如果用户只发送音频，仍然会占用画面位置。

屏幕分享布局：指定一个主播在屏幕左侧的大画面位置（如果不指定，那么大画面位置为背景色），其他主播自上而下依次垂直排列于右侧。当画面数量少于17个的时候，右侧每列最多8人，最多占据两列。当画面数量多于17个的时候，超过17个画面的主播从左下角开始依次水平排列。最多支持25个画面，如果主播只发送音频，仍然会占用画面位置。

九宫格布局：根据主播的数量自动调整每个画面的大小，每个主播的画面大小一致，最多支持25个画面。

自定义布局：根据需要在MixLayoutList内定制每个主播画面的布局。
     */
    public void setMixLayoutMode(Long MixLayoutMode) {
        this.MixLayoutMode = MixLayoutMode;
    }

    /**
     * Get 如果MixLayoutMode 选择为4自定义布局模式的话，设置此参数为每个主播所对应的布局画面的详细信息，最大不超过25个。 
     * @return MixLayoutList 如果MixLayoutMode 选择为4自定义布局模式的话，设置此参数为每个主播所对应的布局画面的详细信息，最大不超过25个。
     */
    public MixLayout [] getMixLayoutList() {
        return this.MixLayoutList;
    }

    /**
     * Set 如果MixLayoutMode 选择为4自定义布局模式的话，设置此参数为每个主播所对应的布局画面的详细信息，最大不超过25个。
     * @param MixLayoutList 如果MixLayoutMode 选择为4自定义布局模式的话，设置此参数为每个主播所对应的布局画面的详细信息，最大不超过25个。
     */
    public void setMixLayoutList(MixLayout [] MixLayoutList) {
        this.MixLayoutList = MixLayoutList;
    }

    /**
     * Get 录制背景颜色，RGB的颜色表的16进制表示，每个颜色通过8bit长度标识，默认为黑色。比如橙色对应的RGB为 R:255 G:165 B:0, 那么对应的字符串描述为#FFA500，格式规范：‘#‘开头，后面跟固定RGB的颜色值 
     * @return BackGroundColor 录制背景颜色，RGB的颜色表的16进制表示，每个颜色通过8bit长度标识，默认为黑色。比如橙色对应的RGB为 R:255 G:165 B:0, 那么对应的字符串描述为#FFA500，格式规范：‘#‘开头，后面跟固定RGB的颜色值
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set 录制背景颜色，RGB的颜色表的16进制表示，每个颜色通过8bit长度标识，默认为黑色。比如橙色对应的RGB为 R:255 G:165 B:0, 那么对应的字符串描述为#FFA500，格式规范：‘#‘开头，后面跟固定RGB的颜色值
     * @param BackGroundColor 录制背景颜色，RGB的颜色表的16进制表示，每个颜色通过8bit长度标识，默认为黑色。比如橙色对应的RGB为 R:255 G:165 B:0, 那么对应的字符串描述为#FFA500，格式规范：‘#‘开头，后面跟固定RGB的颜色值
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get 在布局模式为1：悬浮布局和 2：屏幕分享布局时，设定为显示大视频画面的UserId。不填的话：悬浮布局默认是第一个进房间的主播，屏幕分享布局默认是背景色 
     * @return MaxResolutionUserId 在布局模式为1：悬浮布局和 2：屏幕分享布局时，设定为显示大视频画面的UserId。不填的话：悬浮布局默认是第一个进房间的主播，屏幕分享布局默认是背景色
     */
    public String getMaxResolutionUserId() {
        return this.MaxResolutionUserId;
    }

    /**
     * Set 在布局模式为1：悬浮布局和 2：屏幕分享布局时，设定为显示大视频画面的UserId。不填的话：悬浮布局默认是第一个进房间的主播，屏幕分享布局默认是背景色
     * @param MaxResolutionUserId 在布局模式为1：悬浮布局和 2：屏幕分享布局时，设定为显示大视频画面的UserId。不填的话：悬浮布局默认是第一个进房间的主播，屏幕分享布局默认是背景色
     */
    public void setMaxResolutionUserId(String MaxResolutionUserId) {
        this.MaxResolutionUserId = MaxResolutionUserId;
    }

    /**
     * Get 主辅路标识，
0：主流（默认）；
1：辅流（屏幕分享）；
这个位置的MediaId代表的是对应MaxResolutionUserId的主辅路，MixLayoutList内代表的是自定义用户的主辅路。 
     * @return MediaId 主辅路标识，
0：主流（默认）；
1：辅流（屏幕分享）；
这个位置的MediaId代表的是对应MaxResolutionUserId的主辅路，MixLayoutList内代表的是自定义用户的主辅路。
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 主辅路标识，
0：主流（默认）；
1：辅流（屏幕分享）；
这个位置的MediaId代表的是对应MaxResolutionUserId的主辅路，MixLayoutList内代表的是自定义用户的主辅路。
     * @param MediaId 主辅路标识，
0：主流（默认）；
1：辅流（屏幕分享）；
这个位置的MediaId代表的是对应MaxResolutionUserId的主辅路，MixLayoutList内代表的是自定义用户的主辅路。
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get 下载的url地址， 只支持jpg， png，大小限制不超过5M。 
     * @return BackgroundImageUrl 下载的url地址， 只支持jpg， png，大小限制不超过5M。
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set 下载的url地址， 只支持jpg， png，大小限制不超过5M。
     * @param BackgroundImageUrl 下载的url地址， 只支持jpg， png，大小限制不超过5M。
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get 设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。 
     * @return PlaceHolderMode 设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
     */
    public Long getPlaceHolderMode() {
        return this.PlaceHolderMode;
    }

    /**
     * Set 设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
     * @param PlaceHolderMode 设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
     */
    public void setPlaceHolderMode(Long PlaceHolderMode) {
        this.PlaceHolderMode = PlaceHolderMode;
    }

    /**
     * Get 背景画面宽高比不一致的时候处理方案，与MixLayoufList定义的RenderMode一致。 
     * @return BackgroundImageRenderMode 背景画面宽高比不一致的时候处理方案，与MixLayoufList定义的RenderMode一致。
     */
    public Long getBackgroundImageRenderMode() {
        return this.BackgroundImageRenderMode;
    }

    /**
     * Set 背景画面宽高比不一致的时候处理方案，与MixLayoufList定义的RenderMode一致。
     * @param BackgroundImageRenderMode 背景画面宽高比不一致的时候处理方案，与MixLayoufList定义的RenderMode一致。
     */
    public void setBackgroundImageRenderMode(Long BackgroundImageRenderMode) {
        this.BackgroundImageRenderMode = BackgroundImageRenderMode;
    }

    /**
     * Get 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。 
     * @return DefaultSubBackgroundImage 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
     */
    public String getDefaultSubBackgroundImage() {
        return this.DefaultSubBackgroundImage;
    }

    /**
     * Set 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
     * @param DefaultSubBackgroundImage 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
     */
    public void setDefaultSubBackgroundImage(String DefaultSubBackgroundImage) {
        this.DefaultSubBackgroundImage = DefaultSubBackgroundImage;
    }

    /**
     * Get 水印布局参数， 最多支持25个。 
     * @return WaterMarkList 水印布局参数， 最多支持25个。
     */
    public WaterMark [] getWaterMarkList() {
        return this.WaterMarkList;
    }

    /**
     * Set 水印布局参数， 最多支持25个。
     * @param WaterMarkList 水印布局参数， 最多支持25个。
     */
    public void setWaterMarkList(WaterMark [] WaterMarkList) {
        this.WaterMarkList = WaterMarkList;
    }

    public MixLayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixLayoutParams(MixLayoutParams source) {
        if (source.MixLayoutMode != null) {
            this.MixLayoutMode = new Long(source.MixLayoutMode);
        }
        if (source.MixLayoutList != null) {
            this.MixLayoutList = new MixLayout[source.MixLayoutList.length];
            for (int i = 0; i < source.MixLayoutList.length; i++) {
                this.MixLayoutList[i] = new MixLayout(source.MixLayoutList[i]);
            }
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.MaxResolutionUserId != null) {
            this.MaxResolutionUserId = new String(source.MaxResolutionUserId);
        }
        if (source.MediaId != null) {
            this.MediaId = new Long(source.MediaId);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.PlaceHolderMode != null) {
            this.PlaceHolderMode = new Long(source.PlaceHolderMode);
        }
        if (source.BackgroundImageRenderMode != null) {
            this.BackgroundImageRenderMode = new Long(source.BackgroundImageRenderMode);
        }
        if (source.DefaultSubBackgroundImage != null) {
            this.DefaultSubBackgroundImage = new String(source.DefaultSubBackgroundImage);
        }
        if (source.WaterMarkList != null) {
            this.WaterMarkList = new WaterMark[source.WaterMarkList.length];
            for (int i = 0; i < source.WaterMarkList.length; i++) {
                this.WaterMarkList[i] = new WaterMark(source.WaterMarkList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MixLayoutMode", this.MixLayoutMode);
        this.setParamArrayObj(map, prefix + "MixLayoutList.", this.MixLayoutList);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "MaxResolutionUserId", this.MaxResolutionUserId);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamSimple(map, prefix + "PlaceHolderMode", this.PlaceHolderMode);
        this.setParamSimple(map, prefix + "BackgroundImageRenderMode", this.BackgroundImageRenderMode);
        this.setParamSimple(map, prefix + "DefaultSubBackgroundImage", this.DefaultSubBackgroundImage);
        this.setParamArrayObj(map, prefix + "WaterMarkList.", this.WaterMarkList);

    }
}

