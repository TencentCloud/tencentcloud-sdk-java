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

public class AuditMaterialAgentResponse extends AbstractModel {

    /**
    * <p>商户照片类型  支持该出参的资料审核Agent类型：StorePicAudit</p>
    */
    @SerializedName("StoreLabel")
    @Expose
    private String [] StoreLabel;

    /**
    * <p>商户照片分类具体场景标签，输出3个最匹配的场景， 注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>商户门头名称  支持该出参的资料审核Agent类型：StorePicAudit</p>
    */
    @SerializedName("StoreInfo")
    @Expose
    private StoreInfo [] StoreInfo;

    /**
    * <p>图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负  支持该出参的资料审核Agent类型：StorePicAudit</p>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * <p>区域篡改提示</p>
    */
    @SerializedName("Tamper")
    @Expose
    private SceneWarnInfo Tamper;

    /**
    * <p>AIGC合成提示</p>
    */
    @SerializedName("Synthesis")
    @Expose
    private SceneWarnInfo Synthesis;

    /**
    * <p>屏幕翻拍提示</p>
    */
    @SerializedName("RemakeScreen")
    @Expose
    private SceneWarnInfo RemakeScreen;

    /**
    * <p>截图提示</p>
    */
    @SerializedName("Screenshot")
    @Expose
    private SceneWarnInfo Screenshot;

    /**
    * <p>文字水印提示</p>
    */
    @SerializedName("TextWatermark")
    @Expose
    private SceneWarnInfo TextWatermark;

    /**
    * <p>水印内容，当未检测到文字水印时不返回，返回多组水印时以 | 分隔。</p>
    */
    @SerializedName("WatermarkContent")
    @Expose
    private String WatermarkContent;

    /**
    * <p>模板图片提示</p>
    */
    @SerializedName("Template")
    @Expose
    private SceneWarnInfo Template;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>商户照片类型  支持该出参的资料审核Agent类型：StorePicAudit</p> 
     * @return StoreLabel <p>商户照片类型  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public String [] getStoreLabel() {
        return this.StoreLabel;
    }

    /**
     * Set <p>商户照片类型  支持该出参的资料审核Agent类型：StorePicAudit</p>
     * @param StoreLabel <p>商户照片类型  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public void setStoreLabel(String [] StoreLabel) {
        this.StoreLabel = StoreLabel;
    }

    /**
     * Get <p>商户照片分类具体场景标签，输出3个最匹配的场景， 注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p> 
     * @return SceneType <p>商户照片分类具体场景标签，输出3个最匹配的场景， 注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>商户照片分类具体场景标签，输出3个最匹配的场景， 注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
     * @param SceneType <p>商户照片分类具体场景标签，输出3个最匹配的场景， 注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>商户门头名称  支持该出参的资料审核Agent类型：StorePicAudit</p> 
     * @return StoreInfo <p>商户门头名称  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public StoreInfo [] getStoreInfo() {
        return this.StoreInfo;
    }

    /**
     * Set <p>商户门头名称  支持该出参的资料审核Agent类型：StorePicAudit</p>
     * @param StoreInfo <p>商户门头名称  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public void setStoreInfo(StoreInfo [] StoreInfo) {
        this.StoreInfo = StoreInfo;
    }

    /**
     * Get <p>图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负  支持该出参的资料审核Agent类型：StorePicAudit</p> 
     * @return Angle <p>图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负  支持该出参的资料审核Agent类型：StorePicAudit</p>
     * @param Angle <p>图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get <p>区域篡改提示</p> 
     * @return Tamper <p>区域篡改提示</p>
     */
    public SceneWarnInfo getTamper() {
        return this.Tamper;
    }

    /**
     * Set <p>区域篡改提示</p>
     * @param Tamper <p>区域篡改提示</p>
     */
    public void setTamper(SceneWarnInfo Tamper) {
        this.Tamper = Tamper;
    }

    /**
     * Get <p>AIGC合成提示</p> 
     * @return Synthesis <p>AIGC合成提示</p>
     */
    public SceneWarnInfo getSynthesis() {
        return this.Synthesis;
    }

    /**
     * Set <p>AIGC合成提示</p>
     * @param Synthesis <p>AIGC合成提示</p>
     */
    public void setSynthesis(SceneWarnInfo Synthesis) {
        this.Synthesis = Synthesis;
    }

    /**
     * Get <p>屏幕翻拍提示</p> 
     * @return RemakeScreen <p>屏幕翻拍提示</p>
     */
    public SceneWarnInfo getRemakeScreen() {
        return this.RemakeScreen;
    }

    /**
     * Set <p>屏幕翻拍提示</p>
     * @param RemakeScreen <p>屏幕翻拍提示</p>
     */
    public void setRemakeScreen(SceneWarnInfo RemakeScreen) {
        this.RemakeScreen = RemakeScreen;
    }

    /**
     * Get <p>截图提示</p> 
     * @return Screenshot <p>截图提示</p>
     */
    public SceneWarnInfo getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set <p>截图提示</p>
     * @param Screenshot <p>截图提示</p>
     */
    public void setScreenshot(SceneWarnInfo Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get <p>文字水印提示</p> 
     * @return TextWatermark <p>文字水印提示</p>
     */
    public SceneWarnInfo getTextWatermark() {
        return this.TextWatermark;
    }

    /**
     * Set <p>文字水印提示</p>
     * @param TextWatermark <p>文字水印提示</p>
     */
    public void setTextWatermark(SceneWarnInfo TextWatermark) {
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
     * Get <p>模板图片提示</p> 
     * @return Template <p>模板图片提示</p>
     */
    public SceneWarnInfo getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>模板图片提示</p>
     * @param Template <p>模板图片提示</p>
     */
    public void setTemplate(SceneWarnInfo Template) {
        this.Template = Template;
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

    public AuditMaterialAgentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditMaterialAgentResponse(AuditMaterialAgentResponse source) {
        if (source.StoreLabel != null) {
            this.StoreLabel = new String[source.StoreLabel.length];
            for (int i = 0; i < source.StoreLabel.length; i++) {
                this.StoreLabel[i] = new String(source.StoreLabel[i]);
            }
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.StoreInfo != null) {
            this.StoreInfo = new StoreInfo[source.StoreInfo.length];
            for (int i = 0; i < source.StoreInfo.length; i++) {
                this.StoreInfo[i] = new StoreInfo(source.StoreInfo[i]);
            }
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.Tamper != null) {
            this.Tamper = new SceneWarnInfo(source.Tamper);
        }
        if (source.Synthesis != null) {
            this.Synthesis = new SceneWarnInfo(source.Synthesis);
        }
        if (source.RemakeScreen != null) {
            this.RemakeScreen = new SceneWarnInfo(source.RemakeScreen);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new SceneWarnInfo(source.Screenshot);
        }
        if (source.TextWatermark != null) {
            this.TextWatermark = new SceneWarnInfo(source.TextWatermark);
        }
        if (source.WatermarkContent != null) {
            this.WatermarkContent = new String(source.WatermarkContent);
        }
        if (source.Template != null) {
            this.Template = new SceneWarnInfo(source.Template);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StoreLabel.", this.StoreLabel);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamArrayObj(map, prefix + "StoreInfo.", this.StoreInfo);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamObj(map, prefix + "Tamper.", this.Tamper);
        this.setParamObj(map, prefix + "Synthesis.", this.Synthesis);
        this.setParamObj(map, prefix + "RemakeScreen.", this.RemakeScreen);
        this.setParamObj(map, prefix + "Screenshot.", this.Screenshot);
        this.setParamObj(map, prefix + "TextWatermark.", this.TextWatermark);
        this.setParamSimple(map, prefix + "WatermarkContent", this.WatermarkContent);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

