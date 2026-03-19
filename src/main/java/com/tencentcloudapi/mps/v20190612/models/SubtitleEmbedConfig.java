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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleEmbedConfig extends AbstractModel {

    /**
    * <p>字体类型，支持：</p><li>hei.ttf：黑体</li><li>song.ttf：宋体</li><li>kai.ttf（推荐）或 simkai.ttf：楷体</li><li>msyh.ttf：微软雅黑</li><li>msyhbd.ttf：微软雅黑加粗</li><li>hkjgt.ttf：华康金刚体</li><li>dhttx.ttf：典黑体特细</li><li>xqgdzt.ttf：喜鹊古字典体</li><li>qpcyt.ttf：巧拼超圆体</li><li>arial.ttf：仅支持英文</li><li>dinalternate.ttf：DIN Alternate Bold</li><li>helveticalt.ttf：Helvetica</li><li>helveticains.ttf：Helvetica Inserat</li><li>trajanpro.ttf：TrajanPro-Bold</li><li>korean.ttf：韩语</li><li>japanese.ttf：日语</li><li>thai.ttf：泰语</li><li>roboto.ttf：Roboto</li><li>notosans.ttf：NotoSans</li><li>notosansthai.ttf：泰语NotoSansThai</li><li>sarabun.ttf：泰语Sarabun</li><li>kanit.ttf：泰语Kanit</li><li>charmonman.ttf：泰语Charmonman</li><li>notonaskharabic.ttf：阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf：印度语NotoSansDevanagari</li><li>notosanstc.ttf：粤语思源黑体NotoSansTC</li><li>notosanskr.ttf：韩语NotoSansKR</li><li>gothica1.ttf：韩语GothicA1</li><li>nanummyeongjo.ttf：韩语NanumMyeongjo</li><li>notosansjp.ttf：日语NotoSansJP</li><li>notoserifjp.ttf：日语NotoSerifJP</li><li>shipporimincho.ttf：日语ShipporiMincho</li>默认：hei.ttf 黑体。<br>注意：<li>楷体推荐使用kai.ttf</li><li>填了FontPath时FontPath优先</li>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * <p>自定义字体文件url地址，和CosInputInfo二选一</p>
    */
    @SerializedName("FontPath")
    @Expose
    private String FontPath;

    /**
    * <p>自定义字体文件cos地址</p>
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分百：N%，N范围：(0,100]；例如10%表示字幕字体大小=10%*源视频高度。</li></ul><p>不填且字幕文件无设置时，默认源视频高度的5%。</p>
    */
    @SerializedName("FontSize")
    @Expose
    private Long FontSize;

    /**
    * <p>FontSize单位, 0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("FontSizeUnit")
    @Expose
    private Long FontSizeUnit;

    /**
    * <p>字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。</p>
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * <p>文字透明度，取值范围：(0, 1]</p><li>0：完全透明</li><li>1：完全不透明</li>默认值：1。
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * <p>字幕x轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[-4096,4096]。</li><li>百分百：N%，N范围：[-100,100]；例如10%表示字幕x坐标=10%*源视频宽度。</li></ul><p>默认值：0px。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * <p>PosX单位, 0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("PosXUnit")
    @Expose
    private Long PosXUnit;

    /**
    * <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。</li></ul><p>默认值：源视频高度*4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * <p>PosY单位, 0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("PosYUnit")
    @Expose
    private Long PosYUnit;

    /**
    * <p>背景配置</p>
    */
    @SerializedName("SubtitleBoardConfig")
    @Expose
    private SubtitleBoardConfig SubtitleBoardConfig;

    /**
    * <p>排列配置</p>
    */
    @SerializedName("SubtitleLayoutConfig")
    @Expose
    private SubtitleLayoutConfig SubtitleLayoutConfig;

    /**
    * <p>文字描边配置</p>
    */
    @SerializedName("SubtitleOutlineConfig")
    @Expose
    private SubtitleOutlineConfig SubtitleOutlineConfig;

    /**
    * <p>文字阴影配置</p>
    */
    @SerializedName("SubtitleShadowConfig")
    @Expose
    private SubtitleShadowConfig SubtitleShadowConfig;

    /**
    * <p>源视频尺寸的宽，单位像素值</p>
    */
    @SerializedName("SampleWidth")
    @Expose
    private Long SampleWidth;

    /**
    * <p>源视频尺寸的高，单位像素值</p>
    */
    @SerializedName("SampleHeight")
    @Expose
    private Long SampleHeight;

    /**
     * Get <p>字体类型，支持：</p><li>hei.ttf：黑体</li><li>song.ttf：宋体</li><li>kai.ttf（推荐）或 simkai.ttf：楷体</li><li>msyh.ttf：微软雅黑</li><li>msyhbd.ttf：微软雅黑加粗</li><li>hkjgt.ttf：华康金刚体</li><li>dhttx.ttf：典黑体特细</li><li>xqgdzt.ttf：喜鹊古字典体</li><li>qpcyt.ttf：巧拼超圆体</li><li>arial.ttf：仅支持英文</li><li>dinalternate.ttf：DIN Alternate Bold</li><li>helveticalt.ttf：Helvetica</li><li>helveticains.ttf：Helvetica Inserat</li><li>trajanpro.ttf：TrajanPro-Bold</li><li>korean.ttf：韩语</li><li>japanese.ttf：日语</li><li>thai.ttf：泰语</li><li>roboto.ttf：Roboto</li><li>notosans.ttf：NotoSans</li><li>notosansthai.ttf：泰语NotoSansThai</li><li>sarabun.ttf：泰语Sarabun</li><li>kanit.ttf：泰语Kanit</li><li>charmonman.ttf：泰语Charmonman</li><li>notonaskharabic.ttf：阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf：印度语NotoSansDevanagari</li><li>notosanstc.ttf：粤语思源黑体NotoSansTC</li><li>notosanskr.ttf：韩语NotoSansKR</li><li>gothica1.ttf：韩语GothicA1</li><li>nanummyeongjo.ttf：韩语NanumMyeongjo</li><li>notosansjp.ttf：日语NotoSansJP</li><li>notoserifjp.ttf：日语NotoSerifJP</li><li>shipporimincho.ttf：日语ShipporiMincho</li>默认：hei.ttf 黑体。<br>注意：<li>楷体推荐使用kai.ttf</li><li>填了FontPath时FontPath优先</li> 
     * @return FontType <p>字体类型，支持：</p><li>hei.ttf：黑体</li><li>song.ttf：宋体</li><li>kai.ttf（推荐）或 simkai.ttf：楷体</li><li>msyh.ttf：微软雅黑</li><li>msyhbd.ttf：微软雅黑加粗</li><li>hkjgt.ttf：华康金刚体</li><li>dhttx.ttf：典黑体特细</li><li>xqgdzt.ttf：喜鹊古字典体</li><li>qpcyt.ttf：巧拼超圆体</li><li>arial.ttf：仅支持英文</li><li>dinalternate.ttf：DIN Alternate Bold</li><li>helveticalt.ttf：Helvetica</li><li>helveticains.ttf：Helvetica Inserat</li><li>trajanpro.ttf：TrajanPro-Bold</li><li>korean.ttf：韩语</li><li>japanese.ttf：日语</li><li>thai.ttf：泰语</li><li>roboto.ttf：Roboto</li><li>notosans.ttf：NotoSans</li><li>notosansthai.ttf：泰语NotoSansThai</li><li>sarabun.ttf：泰语Sarabun</li><li>kanit.ttf：泰语Kanit</li><li>charmonman.ttf：泰语Charmonman</li><li>notonaskharabic.ttf：阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf：印度语NotoSansDevanagari</li><li>notosanstc.ttf：粤语思源黑体NotoSansTC</li><li>notosanskr.ttf：韩语NotoSansKR</li><li>gothica1.ttf：韩语GothicA1</li><li>nanummyeongjo.ttf：韩语NanumMyeongjo</li><li>notosansjp.ttf：日语NotoSansJP</li><li>notoserifjp.ttf：日语NotoSerifJP</li><li>shipporimincho.ttf：日语ShipporiMincho</li>默认：hei.ttf 黑体。<br>注意：<li>楷体推荐使用kai.ttf</li><li>填了FontPath时FontPath优先</li>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set <p>字体类型，支持：</p><li>hei.ttf：黑体</li><li>song.ttf：宋体</li><li>kai.ttf（推荐）或 simkai.ttf：楷体</li><li>msyh.ttf：微软雅黑</li><li>msyhbd.ttf：微软雅黑加粗</li><li>hkjgt.ttf：华康金刚体</li><li>dhttx.ttf：典黑体特细</li><li>xqgdzt.ttf：喜鹊古字典体</li><li>qpcyt.ttf：巧拼超圆体</li><li>arial.ttf：仅支持英文</li><li>dinalternate.ttf：DIN Alternate Bold</li><li>helveticalt.ttf：Helvetica</li><li>helveticains.ttf：Helvetica Inserat</li><li>trajanpro.ttf：TrajanPro-Bold</li><li>korean.ttf：韩语</li><li>japanese.ttf：日语</li><li>thai.ttf：泰语</li><li>roboto.ttf：Roboto</li><li>notosans.ttf：NotoSans</li><li>notosansthai.ttf：泰语NotoSansThai</li><li>sarabun.ttf：泰语Sarabun</li><li>kanit.ttf：泰语Kanit</li><li>charmonman.ttf：泰语Charmonman</li><li>notonaskharabic.ttf：阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf：印度语NotoSansDevanagari</li><li>notosanstc.ttf：粤语思源黑体NotoSansTC</li><li>notosanskr.ttf：韩语NotoSansKR</li><li>gothica1.ttf：韩语GothicA1</li><li>nanummyeongjo.ttf：韩语NanumMyeongjo</li><li>notosansjp.ttf：日语NotoSansJP</li><li>notoserifjp.ttf：日语NotoSerifJP</li><li>shipporimincho.ttf：日语ShipporiMincho</li>默认：hei.ttf 黑体。<br>注意：<li>楷体推荐使用kai.ttf</li><li>填了FontPath时FontPath优先</li>
     * @param FontType <p>字体类型，支持：</p><li>hei.ttf：黑体</li><li>song.ttf：宋体</li><li>kai.ttf（推荐）或 simkai.ttf：楷体</li><li>msyh.ttf：微软雅黑</li><li>msyhbd.ttf：微软雅黑加粗</li><li>hkjgt.ttf：华康金刚体</li><li>dhttx.ttf：典黑体特细</li><li>xqgdzt.ttf：喜鹊古字典体</li><li>qpcyt.ttf：巧拼超圆体</li><li>arial.ttf：仅支持英文</li><li>dinalternate.ttf：DIN Alternate Bold</li><li>helveticalt.ttf：Helvetica</li><li>helveticains.ttf：Helvetica Inserat</li><li>trajanpro.ttf：TrajanPro-Bold</li><li>korean.ttf：韩语</li><li>japanese.ttf：日语</li><li>thai.ttf：泰语</li><li>roboto.ttf：Roboto</li><li>notosans.ttf：NotoSans</li><li>notosansthai.ttf：泰语NotoSansThai</li><li>sarabun.ttf：泰语Sarabun</li><li>kanit.ttf：泰语Kanit</li><li>charmonman.ttf：泰语Charmonman</li><li>notonaskharabic.ttf：阿拉伯语NotoNaskhArabic</li><li>notosansdevanagari.ttf：印度语NotoSansDevanagari</li><li>notosanstc.ttf：粤语思源黑体NotoSansTC</li><li>notosanskr.ttf：韩语NotoSansKR</li><li>gothica1.ttf：韩语GothicA1</li><li>nanummyeongjo.ttf：韩语NanumMyeongjo</li><li>notosansjp.ttf：日语NotoSansJP</li><li>notoserifjp.ttf：日语NotoSerifJP</li><li>shipporimincho.ttf：日语ShipporiMincho</li>默认：hei.ttf 黑体。<br>注意：<li>楷体推荐使用kai.ttf</li><li>填了FontPath时FontPath优先</li>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get <p>自定义字体文件url地址，和CosInputInfo二选一</p> 
     * @return FontPath <p>自定义字体文件url地址，和CosInputInfo二选一</p>
     */
    public String getFontPath() {
        return this.FontPath;
    }

    /**
     * Set <p>自定义字体文件url地址，和CosInputInfo二选一</p>
     * @param FontPath <p>自定义字体文件url地址，和CosInputInfo二选一</p>
     */
    public void setFontPath(String FontPath) {
        this.FontPath = FontPath;
    }

    /**
     * Get <p>自定义字体文件cos地址</p> 
     * @return CosInputInfo <p>自定义字体文件cos地址</p>
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set <p>自定义字体文件cos地址</p>
     * @param CosInputInfo <p>自定义字体文件cos地址</p>
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分百：N%，N范围：(0,100]；例如10%表示字幕字体大小=10%*源视频高度。</li></ul><p>不填且字幕文件无设置时，默认源视频高度的5%。</p> 
     * @return FontSize <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分百：N%，N范围：(0,100]；例如10%表示字幕字体大小=10%*源视频高度。</li></ul><p>不填且字幕文件无设置时，默认源视频高度的5%。</p>
     */
    public Long getFontSize() {
        return this.FontSize;
    }

    /**
     * Set <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分百：N%，N范围：(0,100]；例如10%表示字幕字体大小=10%*源视频高度。</li></ul><p>不填且字幕文件无设置时，默认源视频高度的5%。</p>
     * @param FontSize <p>字体大小，不指定则以字幕文件中为准。支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：(0,4096]。</li><li>百分百：N%，N范围：(0,100]；例如10%表示字幕字体大小=10%*源视频高度。</li></ul><p>不填且字幕文件无设置时，默认源视频高度的5%。</p>
     */
    public void setFontSize(Long FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get <p>FontSize单位, 0 像素，1百分比，默认为0，像素</p> 
     * @return FontSizeUnit <p>FontSize单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public Long getFontSizeUnit() {
        return this.FontSizeUnit;
    }

    /**
     * Set <p>FontSize单位, 0 像素，1百分比，默认为0，像素</p>
     * @param FontSizeUnit <p>FontSize单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public void setFontSizeUnit(Long FontSizeUnit) {
        this.FontSizeUnit = FontSizeUnit;
    }

    /**
     * Get <p>字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。</p> 
     * @return FontColor <p>字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。</p>
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set <p>字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。</p>
     * @param FontColor <p>字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。</p>
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get <p>文字透明度，取值范围：(0, 1]</p><li>0：完全透明</li><li>1：完全不透明</li>默认值：1。 
     * @return FontAlpha <p>文字透明度，取值范围：(0, 1]</p><li>0：完全透明</li><li>1：完全不透明</li>默认值：1。
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set <p>文字透明度，取值范围：(0, 1]</p><li>0：完全透明</li><li>1：完全不透明</li>默认值：1。
     * @param FontAlpha <p>文字透明度，取值范围：(0, 1]</p><li>0：完全透明</li><li>1：完全不透明</li>默认值：1。
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get <p>字幕x轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[-4096,4096]。</li><li>百分百：N%，N范围：[-100,100]；例如10%表示字幕x坐标=10%*源视频宽度。</li></ul><p>默认值：0px。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return PosX <p>字幕x轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[-4096,4096]。</li><li>百分百：N%，N范围：[-100,100]；例如10%表示字幕x坐标=10%*源视频宽度。</li></ul><p>默认值：0px。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set <p>字幕x轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[-4096,4096]。</li><li>百分百：N%，N范围：[-100,100]；例如10%表示字幕x坐标=10%*源视频宽度。</li></ul><p>默认值：0px。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param PosX <p>字幕x轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[-4096,4096]。</li><li>百分百：N%，N范围：[-100,100]；例如10%表示字幕x坐标=10%*源视频宽度。</li></ul><p>默认值：0px。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get <p>PosX单位, 0 像素，1百分比，默认为0，像素</p> 
     * @return PosXUnit <p>PosX单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public Long getPosXUnit() {
        return this.PosXUnit;
    }

    /**
     * Set <p>PosX单位, 0 像素，1百分比，默认为0，像素</p>
     * @param PosXUnit <p>PosX单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public void setPosXUnit(Long PosXUnit) {
        this.PosXUnit = PosXUnit;
    }

    /**
     * Get <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。</li></ul><p>默认值：源视频高度*4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p> 
     * @return PosY <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。</li></ul><p>默认值：源视频高度*4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。</li></ul><p>默认值：源视频高度*4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     * @param PosY <p>字幕y轴坐标位置，指定此参数会忽略字幕文件自带坐标；支持像素和百分比格式：</p><ul><li>像素：Npx，N范围：[0,4096]。</li><li>百分百：N%，N范围：[0,100]；例如10%表示字幕y坐标=10%*源视频高度。</li></ul><p>默认值：源视频高度*4%。<br>注意：坐标轴原点在源视频中轴线底部，字幕基准点在字幕中轴线底部，参考下图：<br><img src="https://ie-mps-1258344699.cos.ap-nanjing.tencentcos.cn/common/cloud/mps-demo/102_ai_subtitle/subtitle_style.png" alt="image"></p>
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
    }

    /**
     * Get <p>PosY单位, 0 像素，1百分比，默认为0，像素</p> 
     * @return PosYUnit <p>PosY单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public Long getPosYUnit() {
        return this.PosYUnit;
    }

    /**
     * Set <p>PosY单位, 0 像素，1百分比，默认为0，像素</p>
     * @param PosYUnit <p>PosY单位, 0 像素，1百分比，默认为0，像素</p>
     */
    public void setPosYUnit(Long PosYUnit) {
        this.PosYUnit = PosYUnit;
    }

    /**
     * Get <p>背景配置</p> 
     * @return SubtitleBoardConfig <p>背景配置</p>
     */
    public SubtitleBoardConfig getSubtitleBoardConfig() {
        return this.SubtitleBoardConfig;
    }

    /**
     * Set <p>背景配置</p>
     * @param SubtitleBoardConfig <p>背景配置</p>
     */
    public void setSubtitleBoardConfig(SubtitleBoardConfig SubtitleBoardConfig) {
        this.SubtitleBoardConfig = SubtitleBoardConfig;
    }

    /**
     * Get <p>排列配置</p> 
     * @return SubtitleLayoutConfig <p>排列配置</p>
     */
    public SubtitleLayoutConfig getSubtitleLayoutConfig() {
        return this.SubtitleLayoutConfig;
    }

    /**
     * Set <p>排列配置</p>
     * @param SubtitleLayoutConfig <p>排列配置</p>
     */
    public void setSubtitleLayoutConfig(SubtitleLayoutConfig SubtitleLayoutConfig) {
        this.SubtitleLayoutConfig = SubtitleLayoutConfig;
    }

    /**
     * Get <p>文字描边配置</p> 
     * @return SubtitleOutlineConfig <p>文字描边配置</p>
     */
    public SubtitleOutlineConfig getSubtitleOutlineConfig() {
        return this.SubtitleOutlineConfig;
    }

    /**
     * Set <p>文字描边配置</p>
     * @param SubtitleOutlineConfig <p>文字描边配置</p>
     */
    public void setSubtitleOutlineConfig(SubtitleOutlineConfig SubtitleOutlineConfig) {
        this.SubtitleOutlineConfig = SubtitleOutlineConfig;
    }

    /**
     * Get <p>文字阴影配置</p> 
     * @return SubtitleShadowConfig <p>文字阴影配置</p>
     */
    public SubtitleShadowConfig getSubtitleShadowConfig() {
        return this.SubtitleShadowConfig;
    }

    /**
     * Set <p>文字阴影配置</p>
     * @param SubtitleShadowConfig <p>文字阴影配置</p>
     */
    public void setSubtitleShadowConfig(SubtitleShadowConfig SubtitleShadowConfig) {
        this.SubtitleShadowConfig = SubtitleShadowConfig;
    }

    /**
     * Get <p>源视频尺寸的宽，单位像素值</p> 
     * @return SampleWidth <p>源视频尺寸的宽，单位像素值</p>
     */
    public Long getSampleWidth() {
        return this.SampleWidth;
    }

    /**
     * Set <p>源视频尺寸的宽，单位像素值</p>
     * @param SampleWidth <p>源视频尺寸的宽，单位像素值</p>
     */
    public void setSampleWidth(Long SampleWidth) {
        this.SampleWidth = SampleWidth;
    }

    /**
     * Get <p>源视频尺寸的高，单位像素值</p> 
     * @return SampleHeight <p>源视频尺寸的高，单位像素值</p>
     */
    public Long getSampleHeight() {
        return this.SampleHeight;
    }

    /**
     * Set <p>源视频尺寸的高，单位像素值</p>
     * @param SampleHeight <p>源视频尺寸的高，单位像素值</p>
     */
    public void setSampleHeight(Long SampleHeight) {
        this.SampleHeight = SampleHeight;
    }

    public SubtitleEmbedConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleEmbedConfig(SubtitleEmbedConfig source) {
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontPath != null) {
            this.FontPath = new String(source.FontPath);
        }
        if (source.CosInputInfo != null) {
            this.CosInputInfo = new CosInputInfo(source.CosInputInfo);
        }
        if (source.FontSize != null) {
            this.FontSize = new Long(source.FontSize);
        }
        if (source.FontSizeUnit != null) {
            this.FontSizeUnit = new Long(source.FontSizeUnit);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosXUnit != null) {
            this.PosXUnit = new Long(source.PosXUnit);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.PosYUnit != null) {
            this.PosYUnit = new Long(source.PosYUnit);
        }
        if (source.SubtitleBoardConfig != null) {
            this.SubtitleBoardConfig = new SubtitleBoardConfig(source.SubtitleBoardConfig);
        }
        if (source.SubtitleLayoutConfig != null) {
            this.SubtitleLayoutConfig = new SubtitleLayoutConfig(source.SubtitleLayoutConfig);
        }
        if (source.SubtitleOutlineConfig != null) {
            this.SubtitleOutlineConfig = new SubtitleOutlineConfig(source.SubtitleOutlineConfig);
        }
        if (source.SubtitleShadowConfig != null) {
            this.SubtitleShadowConfig = new SubtitleShadowConfig(source.SubtitleShadowConfig);
        }
        if (source.SampleWidth != null) {
            this.SampleWidth = new Long(source.SampleWidth);
        }
        if (source.SampleHeight != null) {
            this.SampleHeight = new Long(source.SampleHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontPath", this.FontPath);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontSizeUnit", this.FontSizeUnit);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosXUnit", this.PosXUnit);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "PosYUnit", this.PosYUnit);
        this.setParamObj(map, prefix + "SubtitleBoardConfig.", this.SubtitleBoardConfig);
        this.setParamObj(map, prefix + "SubtitleLayoutConfig.", this.SubtitleLayoutConfig);
        this.setParamObj(map, prefix + "SubtitleOutlineConfig.", this.SubtitleOutlineConfig);
        this.setParamObj(map, prefix + "SubtitleShadowConfig.", this.SubtitleShadowConfig);
        this.setParamSimple(map, prefix + "SampleWidth", this.SampleWidth);
        this.setParamSimple(map, prefix + "SampleHeight", this.SampleHeight);

    }
}

