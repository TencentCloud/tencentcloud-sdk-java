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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleInfoInput extends AbstractModel {

    /**
    * <p>字幕 ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>字体类型。</p><p>枚举值：</p><ul><li>hei.ttf： 黑体</li><li>song.ttf： 宋体</li><li>kai.ttf（推荐）或 simkai.ttf： 楷体</li><li>msyh.ttf： 微软雅黑</li><li>msyhbd.ttf： 微软雅黑加粗</li><li>hkjgt.ttf： 华康金刚体</li><li>dhttx.ttf： 典黑体特细</li><li>xqgdzt.ttf： 喜鹊古字典体</li><li>qpcyt.ttf： 巧拼超圆体</li><li>arial.ttf： 仅支持英文</li><li>dinalternate.ttf： DIN Alternate Bold</li><li>helveticalt.ttf： Helvetica</li><li>helveticains.ttf： Helvetica Inserat</li><li>trajanpro.ttf： TrajanPro-Bold</li><li>korean.ttf： 韩语</li><li>japanese.ttf： 日语</li><li>thai.ttf： 泰语</li><li>roboto.ttf： Roboto</li><li>notosans.ttf： NotoSans</li><li>notosansthai.ttf： 泰语NotoSansThai</li><li>sarabun.ttf： 泰语Sarabun</li><li>kanit.ttf： 泰语Kanit</li><li>charmonman.ttf： 泰语Charmonman</li><li>notonaskharabic.ttf： 阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf： 印度语NotoSansDevanagari</li><li>notosanstc.ttf： 粤语思源黑体NotoSansTC</li><li>notosanskr.ttf： 韩语NotoSansKR</li><li>gothica1.ttf： 韩语GothicA1</li><li>nanummyeongjo.ttf： 韩语NanumMyeongjo</li><li>notosansjp.ttf： 日语NotoSansJP</li><li>notoserifjp.ttf： 日语NotoSerifJP</li><li>shipporimincho.ttf： 日语ShipporiMincho</li></ul><p>默认值：hei.ttf 黑体</p>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分比：N%，N范围：(0,100]；例如，10%表示字幕字体大小=10%*源视频高度。不填且字幕文件中无设置时，默认源视频高度的5%。</li></ul>
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * <p>字体颜色，格式：0xRRGGBB。</p><p>默认值：0xFFFFFF（白色）。</p>
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * <p>文字透明度。取值范围：(0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明</li></ul><p>默认值：1</p>
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%<em>源视频高度。默认值：源视频高度</em>4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。不传表示不开启字幕背景底板。<br>注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
    */
    @SerializedName("BoardY")
    @Expose
    private String BoardY;

    /**
    * <p>底板的宽度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认源视频宽像素的90%。</li></ul>
    */
    @SerializedName("BoardWidth")
    @Expose
    private String BoardWidth;

    /**
    * <p>底板的高度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认为源视频高像素的15%。</li></ul>
    */
    @SerializedName("BoardHeight")
    @Expose
    private String BoardHeight;

    /**
    * <p>底板颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * <p>字幕背景板透明度，取值范围：[0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：0.8。</p>
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
    * <p>对齐方式。</p><p>枚举值：</p><ul><li>top： 顶部对齐，字幕顶部按位置固定，底部随行数变化。 </li><li>bottom： 底部对齐，字幕底部按位置固定，顶部随行数变化。 </li></ul><p>默认值：bottom</p>
    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
    * <p>描边宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>不填默认源视频高度的0.3%。</p>
    */
    @SerializedName("OutlineWidth")
    @Expose
    private String OutlineWidth;

    /**
    * <p>描边颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * <p>描边透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1</p>
    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
    * <p>阴影宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。不填默认无阴影。</li></ul>
    */
    @SerializedName("ShadowWidth")
    @Expose
    private String ShadowWidth;

    /**
    * <p>阴影颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色），有设置阴影的情况下。</p>
    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * <p>阴影透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1，完全不透明，有设置阴影的情况下。</p>
    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
    * <p>行间距。正整数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>默认值：0</p>
    */
    @SerializedName("LineSpacing")
    @Expose
    private String LineSpacing;

    /**
     * Get <p>字幕 ID。</p> 
     * @return Id <p>字幕 ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>字幕 ID。</p>
     * @param Id <p>字幕 ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>字体类型。</p><p>枚举值：</p><ul><li>hei.ttf： 黑体</li><li>song.ttf： 宋体</li><li>kai.ttf（推荐）或 simkai.ttf： 楷体</li><li>msyh.ttf： 微软雅黑</li><li>msyhbd.ttf： 微软雅黑加粗</li><li>hkjgt.ttf： 华康金刚体</li><li>dhttx.ttf： 典黑体特细</li><li>xqgdzt.ttf： 喜鹊古字典体</li><li>qpcyt.ttf： 巧拼超圆体</li><li>arial.ttf： 仅支持英文</li><li>dinalternate.ttf： DIN Alternate Bold</li><li>helveticalt.ttf： Helvetica</li><li>helveticains.ttf： Helvetica Inserat</li><li>trajanpro.ttf： TrajanPro-Bold</li><li>korean.ttf： 韩语</li><li>japanese.ttf： 日语</li><li>thai.ttf： 泰语</li><li>roboto.ttf： Roboto</li><li>notosans.ttf： NotoSans</li><li>notosansthai.ttf： 泰语NotoSansThai</li><li>sarabun.ttf： 泰语Sarabun</li><li>kanit.ttf： 泰语Kanit</li><li>charmonman.ttf： 泰语Charmonman</li><li>notonaskharabic.ttf： 阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf： 印度语NotoSansDevanagari</li><li>notosanstc.ttf： 粤语思源黑体NotoSansTC</li><li>notosanskr.ttf： 韩语NotoSansKR</li><li>gothica1.ttf： 韩语GothicA1</li><li>nanummyeongjo.ttf： 韩语NanumMyeongjo</li><li>notosansjp.ttf： 日语NotoSansJP</li><li>notoserifjp.ttf： 日语NotoSerifJP</li><li>shipporimincho.ttf： 日语ShipporiMincho</li></ul><p>默认值：hei.ttf 黑体</p> 
     * @return FontType <p>字体类型。</p><p>枚举值：</p><ul><li>hei.ttf： 黑体</li><li>song.ttf： 宋体</li><li>kai.ttf（推荐）或 simkai.ttf： 楷体</li><li>msyh.ttf： 微软雅黑</li><li>msyhbd.ttf： 微软雅黑加粗</li><li>hkjgt.ttf： 华康金刚体</li><li>dhttx.ttf： 典黑体特细</li><li>xqgdzt.ttf： 喜鹊古字典体</li><li>qpcyt.ttf： 巧拼超圆体</li><li>arial.ttf： 仅支持英文</li><li>dinalternate.ttf： DIN Alternate Bold</li><li>helveticalt.ttf： Helvetica</li><li>helveticains.ttf： Helvetica Inserat</li><li>trajanpro.ttf： TrajanPro-Bold</li><li>korean.ttf： 韩语</li><li>japanese.ttf： 日语</li><li>thai.ttf： 泰语</li><li>roboto.ttf： Roboto</li><li>notosans.ttf： NotoSans</li><li>notosansthai.ttf： 泰语NotoSansThai</li><li>sarabun.ttf： 泰语Sarabun</li><li>kanit.ttf： 泰语Kanit</li><li>charmonman.ttf： 泰语Charmonman</li><li>notonaskharabic.ttf： 阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf： 印度语NotoSansDevanagari</li><li>notosanstc.ttf： 粤语思源黑体NotoSansTC</li><li>notosanskr.ttf： 韩语NotoSansKR</li><li>gothica1.ttf： 韩语GothicA1</li><li>nanummyeongjo.ttf： 韩语NanumMyeongjo</li><li>notosansjp.ttf： 日语NotoSansJP</li><li>notoserifjp.ttf： 日语NotoSerifJP</li><li>shipporimincho.ttf： 日语ShipporiMincho</li></ul><p>默认值：hei.ttf 黑体</p>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set <p>字体类型。</p><p>枚举值：</p><ul><li>hei.ttf： 黑体</li><li>song.ttf： 宋体</li><li>kai.ttf（推荐）或 simkai.ttf： 楷体</li><li>msyh.ttf： 微软雅黑</li><li>msyhbd.ttf： 微软雅黑加粗</li><li>hkjgt.ttf： 华康金刚体</li><li>dhttx.ttf： 典黑体特细</li><li>xqgdzt.ttf： 喜鹊古字典体</li><li>qpcyt.ttf： 巧拼超圆体</li><li>arial.ttf： 仅支持英文</li><li>dinalternate.ttf： DIN Alternate Bold</li><li>helveticalt.ttf： Helvetica</li><li>helveticains.ttf： Helvetica Inserat</li><li>trajanpro.ttf： TrajanPro-Bold</li><li>korean.ttf： 韩语</li><li>japanese.ttf： 日语</li><li>thai.ttf： 泰语</li><li>roboto.ttf： Roboto</li><li>notosans.ttf： NotoSans</li><li>notosansthai.ttf： 泰语NotoSansThai</li><li>sarabun.ttf： 泰语Sarabun</li><li>kanit.ttf： 泰语Kanit</li><li>charmonman.ttf： 泰语Charmonman</li><li>notonaskharabic.ttf： 阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf： 印度语NotoSansDevanagari</li><li>notosanstc.ttf： 粤语思源黑体NotoSansTC</li><li>notosanskr.ttf： 韩语NotoSansKR</li><li>gothica1.ttf： 韩语GothicA1</li><li>nanummyeongjo.ttf： 韩语NanumMyeongjo</li><li>notosansjp.ttf： 日语NotoSansJP</li><li>notoserifjp.ttf： 日语NotoSerifJP</li><li>shipporimincho.ttf： 日语ShipporiMincho</li></ul><p>默认值：hei.ttf 黑体</p>
     * @param FontType <p>字体类型。</p><p>枚举值：</p><ul><li>hei.ttf： 黑体</li><li>song.ttf： 宋体</li><li>kai.ttf（推荐）或 simkai.ttf： 楷体</li><li>msyh.ttf： 微软雅黑</li><li>msyhbd.ttf： 微软雅黑加粗</li><li>hkjgt.ttf： 华康金刚体</li><li>dhttx.ttf： 典黑体特细</li><li>xqgdzt.ttf： 喜鹊古字典体</li><li>qpcyt.ttf： 巧拼超圆体</li><li>arial.ttf： 仅支持英文</li><li>dinalternate.ttf： DIN Alternate Bold</li><li>helveticalt.ttf： Helvetica</li><li>helveticains.ttf： Helvetica Inserat</li><li>trajanpro.ttf： TrajanPro-Bold</li><li>korean.ttf： 韩语</li><li>japanese.ttf： 日语</li><li>thai.ttf： 泰语</li><li>roboto.ttf： Roboto</li><li>notosans.ttf： NotoSans</li><li>notosansthai.ttf： 泰语NotoSansThai</li><li>sarabun.ttf： 泰语Sarabun</li><li>kanit.ttf： 泰语Kanit</li><li>charmonman.ttf： 泰语Charmonman</li><li>notonaskharabic.ttf： 阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf： 印度语NotoSansDevanagari</li><li>notosanstc.ttf： 粤语思源黑体NotoSansTC</li><li>notosanskr.ttf： 韩语NotoSansKR</li><li>gothica1.ttf： 韩语GothicA1</li><li>nanummyeongjo.ttf： 韩语NanumMyeongjo</li><li>notosansjp.ttf： 日语NotoSansJP</li><li>notoserifjp.ttf： 日语NotoSerifJP</li><li>shipporimincho.ttf： 日语ShipporiMincho</li></ul><p>默认值：hei.ttf 黑体</p>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分比：N%，N范围：(0,100]；例如，10%表示字幕字体大小=10%*源视频高度。不填且字幕文件中无设置时，默认源视频高度的5%。</li></ul> 
     * @return FontSize <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分比：N%，N范围：(0,100]；例如，10%表示字幕字体大小=10%*源视频高度。不填且字幕文件中无设置时，默认源视频高度的5%。</li></ul>
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分比：N%，N范围：(0,100]；例如，10%表示字幕字体大小=10%*源视频高度。不填且字幕文件中无设置时，默认源视频高度的5%。</li></ul>
     * @param FontSize <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分比：N%，N范围：(0,100]；例如，10%表示字幕字体大小=10%*源视频高度。不填且字幕文件中无设置时，默认源视频高度的5%。</li></ul>
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get <p>字体颜色，格式：0xRRGGBB。</p><p>默认值：0xFFFFFF（白色）。</p> 
     * @return FontColor <p>字体颜色，格式：0xRRGGBB。</p><p>默认值：0xFFFFFF（白色）。</p>
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set <p>字体颜色，格式：0xRRGGBB。</p><p>默认值：0xFFFFFF（白色）。</p>
     * @param FontColor <p>字体颜色，格式：0xRRGGBB。</p><p>默认值：0xFFFFFF（白色）。</p>
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get <p>文字透明度。取值范围：(0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明</li></ul><p>默认值：1</p> 
     * @return FontAlpha <p>文字透明度。取值范围：(0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明</li></ul><p>默认值：1</p>
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set <p>文字透明度。取值范围：(0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明</li></ul><p>默认值：1</p>
     * @param FontAlpha <p>文字透明度。取值范围：(0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明</li></ul><p>默认值：1</p>
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%<em>源视频高度。默认值：源视频高度</em>4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul> 
     * @return YPos <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%<em>源视频高度。默认值：源视频高度</em>4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%<em>源视频高度。默认值：源视频高度</em>4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     * @param YPos <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%<em>源视频高度。默认值：源视频高度</em>4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。不传表示不开启字幕背景底板。<br>注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul> 
     * @return BoardY <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。不传表示不开启字幕背景底板。<br>注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public String getBoardY() {
        return this.BoardY;
    }

    /**
     * Set <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。不传表示不开启字幕背景底板。<br>注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     * @param BoardY <p>字幕背景底板的y轴坐标位置；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分比：N%，N范围：[0,100]；例如10%表示字幕背景底板y坐标=10%*源视频高度。不传表示不开启字幕背景底板。<br>注意：坐标轴原点位于源视频的中轴线底部，字幕背景底板的基准点在其中轴线底部，参考下图：<img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></li></ul>
     */
    public void setBoardY(String BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get <p>底板的宽度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认源视频宽像素的90%。</li></ul> 
     * @return BoardWidth <p>底板的宽度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认源视频宽像素的90%。</li></ul>
     */
    public String getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set <p>底板的宽度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认源视频宽像素的90%。</li></ul>
     * @param BoardWidth <p>底板的宽度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认源视频宽像素的90%。</li></ul>
     */
    public void setBoardWidth(String BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get <p>底板的高度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认为源视频高像素的15%。</li></ul> 
     * @return BoardHeight <p>底板的高度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认为源视频高像素的15%。</li></ul>
     */
    public String getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set <p>底板的高度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认为源视频高像素的15%。</li></ul>
     * @param BoardHeight <p>底板的高度，正整数。</p><ul><li>像素：Npx，N 取值范围：[0,4096]。</li><li>百分比：N%，N 取值范围：[0, 100]。开启底板且不填此值时，默认为源视频高像素的15%。</li></ul>
     */
    public void setBoardHeight(String BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get <p>底板颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p> 
     * @return BoardColor <p>底板颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set <p>底板颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
     * @param BoardColor <p>底板颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get <p>字幕背景板透明度，取值范围：[0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：0.8。</p> 
     * @return BoardAlpha <p>字幕背景板透明度，取值范围：[0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：0.8。</p>
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set <p>字幕背景板透明度，取值范围：[0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：0.8。</p>
     * @param BoardAlpha <p>字幕背景板透明度，取值范围：[0, 1]。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：0.8。</p>
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    /**
     * Get <p>对齐方式。</p><p>枚举值：</p><ul><li>top： 顶部对齐，字幕顶部按位置固定，底部随行数变化。 </li><li>bottom： 底部对齐，字幕底部按位置固定，顶部随行数变化。 </li></ul><p>默认值：bottom</p> 
     * @return Alignment <p>对齐方式。</p><p>枚举值：</p><ul><li>top： 顶部对齐，字幕顶部按位置固定，底部随行数变化。 </li><li>bottom： 底部对齐，字幕底部按位置固定，顶部随行数变化。 </li></ul><p>默认值：bottom</p>
     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set <p>对齐方式。</p><p>枚举值：</p><ul><li>top： 顶部对齐，字幕顶部按位置固定，底部随行数变化。 </li><li>bottom： 底部对齐，字幕底部按位置固定，顶部随行数变化。 </li></ul><p>默认值：bottom</p>
     * @param Alignment <p>对齐方式。</p><p>枚举值：</p><ul><li>top： 顶部对齐，字幕顶部按位置固定，底部随行数变化。 </li><li>bottom： 底部对齐，字幕底部按位置固定，顶部随行数变化。 </li></ul><p>默认值：bottom</p>
     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    /**
     * Get <p>描边宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>不填默认源视频高度的0.3%。</p> 
     * @return OutlineWidth <p>描边宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>不填默认源视频高度的0.3%。</p>
     */
    public String getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set <p>描边宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>不填默认源视频高度的0.3%。</p>
     * @param OutlineWidth <p>描边宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>不填默认源视频高度的0.3%。</p>
     */
    public void setOutlineWidth(String OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get <p>描边颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p> 
     * @return OutlineColor <p>描边颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set <p>描边颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
     * @param OutlineColor <p>描边颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色）。</p>
     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get <p>描边透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1</p> 
     * @return OutlineAlpha <p>描边透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1</p>
     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set <p>描边透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1</p>
     * @param OutlineAlpha <p>描边透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1</p>
     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    /**
     * Get <p>阴影宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。不填默认无阴影。</li></ul> 
     * @return ShadowWidth <p>阴影宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。不填默认无阴影。</li></ul>
     */
    public String getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set <p>阴影宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。不填默认无阴影。</li></ul>
     * @param ShadowWidth <p>阴影宽度。浮点数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。不填默认无阴影。</li></ul>
     */
    public void setShadowWidth(String ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get <p>阴影颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色），有设置阴影的情况下。</p> 
     * @return ShadowColor <p>阴影颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色），有设置阴影的情况下。</p>
     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set <p>阴影颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色），有设置阴影的情况下。</p>
     * @param ShadowColor <p>阴影颜色。格式：0xRRGGBB。</p><p>默认值：0x000000（黑色），有设置阴影的情况下。</p>
     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get <p>阴影透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1，完全不透明，有设置阴影的情况下。</p> 
     * @return ShadowAlpha <p>阴影透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1，完全不透明，有设置阴影的情况下。</p>
     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set <p>阴影透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1，完全不透明，有设置阴影的情况下。</p>
     * @param ShadowAlpha <p>阴影透明度。(0，1] 正浮点数。</p><ul><li>0：完全透明；</li><li>1：完全不透明。</li></ul><p>默认值：1，完全不透明，有设置阴影的情况下。</p>
     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    /**
     * Get <p>行间距。正整数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>默认值：0</p> 
     * @return LineSpacing <p>行间距。正整数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>默认值：0</p>
     */
    public String getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set <p>行间距。正整数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>默认值：0</p>
     * @param LineSpacing <p>行间距。正整数。</p><ul><li>像素：Npx，N 取值范围： [0, 1000]。</li><li>百分比：N%，N 取值范围：[0, 100]。</li></ul><p>默认值：0</p>
     */
    public void setLineSpacing(String LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    public SubtitleInfoInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleInfoInput(SubtitleInfoInput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.BoardY != null) {
            this.BoardY = new String(source.BoardY);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new String(source.BoardWidth);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new String(source.BoardHeight);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new String(source.OutlineWidth);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new String(source.ShadowWidth);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new String(source.LineSpacing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);

    }
}

