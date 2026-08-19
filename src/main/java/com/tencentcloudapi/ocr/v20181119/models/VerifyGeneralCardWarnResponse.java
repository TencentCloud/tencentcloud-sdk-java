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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyGeneralCardWarnResponse extends AbstractModel {

    /**
    * <p>区域篡改提示</p>
    */
    @SerializedName("Tamper")
    @Expose
    private GeneralCardWarnInfo Tamper;

    /**
    * <p>AIGC合成提示</p>
    */
    @SerializedName("Synthesis")
    @Expose
    private GeneralCardWarnInfo Synthesis;

    /**
    * <p>模板图片提示</p>
    */
    @SerializedName("Template")
    @Expose
    private GeneralCardWarnInfo Template;

    /**
    * <p>屏幕翻拍提示</p>
    */
    @SerializedName("RemakeScreen")
    @Expose
    private GeneralCardWarnInfo RemakeScreen;

    /**
    * <p>截图提示</p>
    */
    @SerializedName("Screenshot")
    @Expose
    private GeneralCardWarnInfo Screenshot;

    /**
    * <p>模糊提示</p>
    */
    @SerializedName("Blur")
    @Expose
    private GeneralCardWarnInfo Blur;

    /**
    * <p>边框不完整提示</p>
    */
    @SerializedName("BorderIncomplete")
    @Expose
    private GeneralCardWarnInfo BorderIncomplete;

    /**
    * <p>复印件提示</p>
    */
    @SerializedName("Copy")
    @Expose
    private GeneralCardWarnInfo Copy;

    /**
    * <p>反光提示</p>
    */
    @SerializedName("Reflection")
    @Expose
    private GeneralCardWarnInfo Reflection;

    /**
    * <p>遮挡提示</p>
    */
    @SerializedName("Cover")
    @Expose
    private GeneralCardWarnInfo Cover;

    /**
    * <p>重叠提示</p>
    */
    @SerializedName("Overlap")
    @Expose
    private GeneralCardWarnInfo Overlap;

    /**
    * <p>电子证照提示（目前仅支持电子身份证、电子营业执照识别）</p>
    */
    @SerializedName("Electron")
    @Expose
    private GeneralCardWarnInfo Electron;

    /**
    * <p>文字水印提示</p>
    */
    @SerializedName("TextWatermark")
    @Expose
    private GeneralCardWarnInfo TextWatermark;

    /**
    * <p>水印内容，当未检测到文字水印时不返回，返回多组水印时以 | 分隔。</p>
    */
    @SerializedName("WatermarkContent")
    @Expose
    private String WatermarkContent;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>区域篡改提示</p> 
     * @return Tamper <p>区域篡改提示</p>
     */
    public GeneralCardWarnInfo getTamper() {
        return this.Tamper;
    }

    /**
     * Set <p>区域篡改提示</p>
     * @param Tamper <p>区域篡改提示</p>
     */
    public void setTamper(GeneralCardWarnInfo Tamper) {
        this.Tamper = Tamper;
    }

    /**
     * Get <p>AIGC合成提示</p> 
     * @return Synthesis <p>AIGC合成提示</p>
     */
    public GeneralCardWarnInfo getSynthesis() {
        return this.Synthesis;
    }

    /**
     * Set <p>AIGC合成提示</p>
     * @param Synthesis <p>AIGC合成提示</p>
     */
    public void setSynthesis(GeneralCardWarnInfo Synthesis) {
        this.Synthesis = Synthesis;
    }

    /**
     * Get <p>模板图片提示</p> 
     * @return Template <p>模板图片提示</p>
     */
    public GeneralCardWarnInfo getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>模板图片提示</p>
     * @param Template <p>模板图片提示</p>
     */
    public void setTemplate(GeneralCardWarnInfo Template) {
        this.Template = Template;
    }

    /**
     * Get <p>屏幕翻拍提示</p> 
     * @return RemakeScreen <p>屏幕翻拍提示</p>
     */
    public GeneralCardWarnInfo getRemakeScreen() {
        return this.RemakeScreen;
    }

    /**
     * Set <p>屏幕翻拍提示</p>
     * @param RemakeScreen <p>屏幕翻拍提示</p>
     */
    public void setRemakeScreen(GeneralCardWarnInfo RemakeScreen) {
        this.RemakeScreen = RemakeScreen;
    }

    /**
     * Get <p>截图提示</p> 
     * @return Screenshot <p>截图提示</p>
     */
    public GeneralCardWarnInfo getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set <p>截图提示</p>
     * @param Screenshot <p>截图提示</p>
     */
    public void setScreenshot(GeneralCardWarnInfo Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get <p>模糊提示</p> 
     * @return Blur <p>模糊提示</p>
     */
    public GeneralCardWarnInfo getBlur() {
        return this.Blur;
    }

    /**
     * Set <p>模糊提示</p>
     * @param Blur <p>模糊提示</p>
     */
    public void setBlur(GeneralCardWarnInfo Blur) {
        this.Blur = Blur;
    }

    /**
     * Get <p>边框不完整提示</p> 
     * @return BorderIncomplete <p>边框不完整提示</p>
     */
    public GeneralCardWarnInfo getBorderIncomplete() {
        return this.BorderIncomplete;
    }

    /**
     * Set <p>边框不完整提示</p>
     * @param BorderIncomplete <p>边框不完整提示</p>
     */
    public void setBorderIncomplete(GeneralCardWarnInfo BorderIncomplete) {
        this.BorderIncomplete = BorderIncomplete;
    }

    /**
     * Get <p>复印件提示</p> 
     * @return Copy <p>复印件提示</p>
     */
    public GeneralCardWarnInfo getCopy() {
        return this.Copy;
    }

    /**
     * Set <p>复印件提示</p>
     * @param Copy <p>复印件提示</p>
     */
    public void setCopy(GeneralCardWarnInfo Copy) {
        this.Copy = Copy;
    }

    /**
     * Get <p>反光提示</p> 
     * @return Reflection <p>反光提示</p>
     */
    public GeneralCardWarnInfo getReflection() {
        return this.Reflection;
    }

    /**
     * Set <p>反光提示</p>
     * @param Reflection <p>反光提示</p>
     */
    public void setReflection(GeneralCardWarnInfo Reflection) {
        this.Reflection = Reflection;
    }

    /**
     * Get <p>遮挡提示</p> 
     * @return Cover <p>遮挡提示</p>
     */
    public GeneralCardWarnInfo getCover() {
        return this.Cover;
    }

    /**
     * Set <p>遮挡提示</p>
     * @param Cover <p>遮挡提示</p>
     */
    public void setCover(GeneralCardWarnInfo Cover) {
        this.Cover = Cover;
    }

    /**
     * Get <p>重叠提示</p> 
     * @return Overlap <p>重叠提示</p>
     */
    public GeneralCardWarnInfo getOverlap() {
        return this.Overlap;
    }

    /**
     * Set <p>重叠提示</p>
     * @param Overlap <p>重叠提示</p>
     */
    public void setOverlap(GeneralCardWarnInfo Overlap) {
        this.Overlap = Overlap;
    }

    /**
     * Get <p>电子证照提示（目前仅支持电子身份证、电子营业执照识别）</p> 
     * @return Electron <p>电子证照提示（目前仅支持电子身份证、电子营业执照识别）</p>
     */
    public GeneralCardWarnInfo getElectron() {
        return this.Electron;
    }

    /**
     * Set <p>电子证照提示（目前仅支持电子身份证、电子营业执照识别）</p>
     * @param Electron <p>电子证照提示（目前仅支持电子身份证、电子营业执照识别）</p>
     */
    public void setElectron(GeneralCardWarnInfo Electron) {
        this.Electron = Electron;
    }

    /**
     * Get <p>文字水印提示</p> 
     * @return TextWatermark <p>文字水印提示</p>
     */
    public GeneralCardWarnInfo getTextWatermark() {
        return this.TextWatermark;
    }

    /**
     * Set <p>文字水印提示</p>
     * @param TextWatermark <p>文字水印提示</p>
     */
    public void setTextWatermark(GeneralCardWarnInfo TextWatermark) {
        this.TextWatermark = TextWatermark;
    }

    /**
     * Get <p>水印内容，当未检测到文字水印时不返回，返回多组水印时以 | 分隔。</p> 
     * @return WatermarkContent <p>水印内容，当未检测到文字水印时不返回，返回多组水印时以 | 分隔。</p>
     */
    public String getWatermarkContent() {
        return this.WatermarkContent;
    }

    /**
     * Set <p>水印内容，当未检测到文字水印时不返回，返回多组水印时以 | 分隔。</p>
     * @param WatermarkContent <p>水印内容，当未检测到文字水印时不返回，返回多组水印时以 | 分隔。</p>
     */
    public void setWatermarkContent(String WatermarkContent) {
        this.WatermarkContent = WatermarkContent;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VerifyGeneralCardWarnResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyGeneralCardWarnResponse(VerifyGeneralCardWarnResponse source) {
        if (source.Tamper != null) {
            this.Tamper = new GeneralCardWarnInfo(source.Tamper);
        }
        if (source.Synthesis != null) {
            this.Synthesis = new GeneralCardWarnInfo(source.Synthesis);
        }
        if (source.Template != null) {
            this.Template = new GeneralCardWarnInfo(source.Template);
        }
        if (source.RemakeScreen != null) {
            this.RemakeScreen = new GeneralCardWarnInfo(source.RemakeScreen);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new GeneralCardWarnInfo(source.Screenshot);
        }
        if (source.Blur != null) {
            this.Blur = new GeneralCardWarnInfo(source.Blur);
        }
        if (source.BorderIncomplete != null) {
            this.BorderIncomplete = new GeneralCardWarnInfo(source.BorderIncomplete);
        }
        if (source.Copy != null) {
            this.Copy = new GeneralCardWarnInfo(source.Copy);
        }
        if (source.Reflection != null) {
            this.Reflection = new GeneralCardWarnInfo(source.Reflection);
        }
        if (source.Cover != null) {
            this.Cover = new GeneralCardWarnInfo(source.Cover);
        }
        if (source.Overlap != null) {
            this.Overlap = new GeneralCardWarnInfo(source.Overlap);
        }
        if (source.Electron != null) {
            this.Electron = new GeneralCardWarnInfo(source.Electron);
        }
        if (source.TextWatermark != null) {
            this.TextWatermark = new GeneralCardWarnInfo(source.TextWatermark);
        }
        if (source.WatermarkContent != null) {
            this.WatermarkContent = new String(source.WatermarkContent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Tamper.", this.Tamper);
        this.setParamObj(map, prefix + "Synthesis.", this.Synthesis);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "RemakeScreen.", this.RemakeScreen);
        this.setParamObj(map, prefix + "Screenshot.", this.Screenshot);
        this.setParamObj(map, prefix + "Blur.", this.Blur);
        this.setParamObj(map, prefix + "BorderIncomplete.", this.BorderIncomplete);
        this.setParamObj(map, prefix + "Copy.", this.Copy);
        this.setParamObj(map, prefix + "Reflection.", this.Reflection);
        this.setParamObj(map, prefix + "Cover.", this.Cover);
        this.setParamObj(map, prefix + "Overlap.", this.Overlap);
        this.setParamObj(map, prefix + "Electron.", this.Electron);
        this.setParamObj(map, prefix + "TextWatermark.", this.TextWatermark);
        this.setParamSimple(map, prefix + "WatermarkContent", this.WatermarkContent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

