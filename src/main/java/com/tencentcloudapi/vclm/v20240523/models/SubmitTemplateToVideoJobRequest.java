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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTemplateToVideoJobRequest extends AbstractModel {

    /**
    * 特效模板名称。
枚举值：
hug ：拥抱
kiss ：亲吻
heart ： 比心
fuzzy ： 毛茸茸
befigure：变手办风
longhair：金色长发
morphlab：膨胀
bloom：万物生花
pinch：捏捏
balloonfly：飞走了
dragme：被拽走了

    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * 参考图像，最多输入2张图。
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300\*300px，不大于4096\*4096，图片宽高比应在1:4 ~ 4:1之间

    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * 为生成视频添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 标识内容设置。
默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get 特效模板名称。
枚举值：
hug ：拥抱
kiss ：亲吻
heart ： 比心
fuzzy ： 毛茸茸
befigure：变手办风
longhair：金色长发
morphlab：膨胀
bloom：万物生花
pinch：捏捏
balloonfly：飞走了
dragme：被拽走了
 
     * @return Template 特效模板名称。
枚举值：
hug ：拥抱
kiss ：亲吻
heart ： 比心
fuzzy ： 毛茸茸
befigure：变手办风
longhair：金色长发
morphlab：膨胀
bloom：万物生花
pinch：捏捏
balloonfly：飞走了
dragme：被拽走了

     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 特效模板名称。
枚举值：
hug ：拥抱
kiss ：亲吻
heart ： 比心
fuzzy ： 毛茸茸
befigure：变手办风
longhair：金色长发
morphlab：膨胀
bloom：万物生花
pinch：捏捏
balloonfly：飞走了
dragme：被拽走了

     * @param Template 特效模板名称。
枚举值：
hug ：拥抱
kiss ：亲吻
heart ： 比心
fuzzy ： 毛茸茸
befigure：变手办风
longhair：金色长发
morphlab：膨胀
bloom：万物生花
pinch：捏捏
balloonfly：飞走了
dragme：被拽走了

     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get 参考图像，最多输入2张图。
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300\*300px，不大于4096\*4096，图片宽高比应在1:4 ~ 4:1之间
 
     * @return Images 参考图像，最多输入2张图。
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300\*300px，不大于4096\*4096，图片宽高比应在1:4 ~ 4:1之间

     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set 参考图像，最多输入2张图。
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300\*300px，不大于4096\*4096，图片宽高比应在1:4 ~ 4:1之间

     * @param Images 参考图像，最多输入2张图。
- 支持传入图片Base64编码或图片URL（确保可访问）
- 图片格式：支持png、jpg、jpeg、webp、bmp、tiff
- 图片文件：大小不能超过10MB（base64后），图片分辨率不小于300\*300px，不大于4096\*4096，图片宽高比应在1:4 ~ 4:1之间

     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get 为生成视频添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。 
     * @return LogoAdd 为生成视频添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成视频添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
     * @param LogoAdd 为生成视频添加标识的开关，默认为1。
1：添加标识。
0：不添加标识。
其他数值：默认按1处理。
建议您使用显著标识来提示，该视频是 AI 生成的视频。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 标识内容设置。
默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。 
     * @return LogoParam 标识内容设置。
默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 标识内容设置。
默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     * @param LogoParam 标识内容设置。
默认在生成视频的右下角添加“视频由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitTemplateToVideoJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTemplateToVideoJobRequest(SubmitTemplateToVideoJobRequest source) {
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.Images != null) {
            this.Images = new Image[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new Image(source.Images[i]);
            }
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

