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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitDrawPortraitJobRequest extends AbstractModel {

    /**
    * 写真模型 ID。

    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 风格模板，支持以下风格：
zhengjian_female：证件照（适用女性）
zhengjian_male：证件照（适用男性）
hanfu_female：汉服（适用女性）
hanfu2_female：汉服2（适用女性）
qipao_female：旗袍（适用女性）
green_female：绿色系穿搭（适用女性）
white_sweater_female：白色系毛衣（适用女性）
sports_female：蓝色系运动（适用女性）
wedding_female：婚纱裙（适用女性）
forest_female：户外森林（适用女性）
flower_female：户外花丛（适用女性）
lolita_female：洛丽塔（适用女性
black_dress1_female：小黑裙1（适用女性）
black_dress2_female：小黑裙2（适用女性）
black_dress3_female：小黑裙3（适用女性）
wedding2_female：婚纱裙2（适用女性）
fire_female：火焰背景（适用女性）
wreath_female：头戴花环（适用女性）
bow_female：蝴蝶结发饰（适用女性）
feather_female：羽毛（适用女性）
blue_shirt_female：缤纷衬衣系列-蓝色（适用女性）
green_shirt_female：缤纷衬衣系列-绿色（适用女性）
purple_shirt_female：缤纷衬衣系列-紫色（适用女性）
grey_suit_male: 灰色西装（适用男性）
beige_suit_male: 米色西装（适用男性）
white_sweater_male: 白色系毛衣（适用男性）
christmas1_female: 圣诞1（适用女性）
christmas2_female: 圣诞2（适用女性）
christmas3_female: 圣诞3（适用女性）
newyear1_female：新春1（适用女性）
newyear2_female：新春2（适用女性）
newyear3_female：新春3（适用女性）
newyear5_female：新春5（适用女性）
simple：简洁风格（通用），一般用于写真模型封面示意图，每个ModelId的生成结果固定，多次生成将返回相同图片
    */
    @SerializedName("StyleId")
    @Expose
    private String StyleId;

    /**
    * 本次生成的图片数量，取值范围[1,4]
    */
    @SerializedName("ImageNum")
    @Expose
    private Long ImageNum;

    /**
    * 为生成结果图添加标识的开关，默认为1。 
1：添加标识。
 0：不添加标识。 
其他数值：默认按1处理。 
建议您使用显著标识来提示结果图是 AI 生成的图片。
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 标识内容设置。 
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * 清晰度，支持以下选项：
sd：基础版，分辨率512:640
hd：高清畅享版，分辨率1024:1280
hdpro：高清优享版，分辨率1024:1280（推荐）
uhd：超清版，分辨率2048:2560
不填默认为sd。

    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
     * Get 写真模型 ID。
 
     * @return ModelId 写真模型 ID。

     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 写真模型 ID。

     * @param ModelId 写真模型 ID。

     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 风格模板，支持以下风格：
zhengjian_female：证件照（适用女性）
zhengjian_male：证件照（适用男性）
hanfu_female：汉服（适用女性）
hanfu2_female：汉服2（适用女性）
qipao_female：旗袍（适用女性）
green_female：绿色系穿搭（适用女性）
white_sweater_female：白色系毛衣（适用女性）
sports_female：蓝色系运动（适用女性）
wedding_female：婚纱裙（适用女性）
forest_female：户外森林（适用女性）
flower_female：户外花丛（适用女性）
lolita_female：洛丽塔（适用女性
black_dress1_female：小黑裙1（适用女性）
black_dress2_female：小黑裙2（适用女性）
black_dress3_female：小黑裙3（适用女性）
wedding2_female：婚纱裙2（适用女性）
fire_female：火焰背景（适用女性）
wreath_female：头戴花环（适用女性）
bow_female：蝴蝶结发饰（适用女性）
feather_female：羽毛（适用女性）
blue_shirt_female：缤纷衬衣系列-蓝色（适用女性）
green_shirt_female：缤纷衬衣系列-绿色（适用女性）
purple_shirt_female：缤纷衬衣系列-紫色（适用女性）
grey_suit_male: 灰色西装（适用男性）
beige_suit_male: 米色西装（适用男性）
white_sweater_male: 白色系毛衣（适用男性）
christmas1_female: 圣诞1（适用女性）
christmas2_female: 圣诞2（适用女性）
christmas3_female: 圣诞3（适用女性）
newyear1_female：新春1（适用女性）
newyear2_female：新春2（适用女性）
newyear3_female：新春3（适用女性）
newyear5_female：新春5（适用女性）
simple：简洁风格（通用），一般用于写真模型封面示意图，每个ModelId的生成结果固定，多次生成将返回相同图片 
     * @return StyleId 风格模板，支持以下风格：
zhengjian_female：证件照（适用女性）
zhengjian_male：证件照（适用男性）
hanfu_female：汉服（适用女性）
hanfu2_female：汉服2（适用女性）
qipao_female：旗袍（适用女性）
green_female：绿色系穿搭（适用女性）
white_sweater_female：白色系毛衣（适用女性）
sports_female：蓝色系运动（适用女性）
wedding_female：婚纱裙（适用女性）
forest_female：户外森林（适用女性）
flower_female：户外花丛（适用女性）
lolita_female：洛丽塔（适用女性
black_dress1_female：小黑裙1（适用女性）
black_dress2_female：小黑裙2（适用女性）
black_dress3_female：小黑裙3（适用女性）
wedding2_female：婚纱裙2（适用女性）
fire_female：火焰背景（适用女性）
wreath_female：头戴花环（适用女性）
bow_female：蝴蝶结发饰（适用女性）
feather_female：羽毛（适用女性）
blue_shirt_female：缤纷衬衣系列-蓝色（适用女性）
green_shirt_female：缤纷衬衣系列-绿色（适用女性）
purple_shirt_female：缤纷衬衣系列-紫色（适用女性）
grey_suit_male: 灰色西装（适用男性）
beige_suit_male: 米色西装（适用男性）
white_sweater_male: 白色系毛衣（适用男性）
christmas1_female: 圣诞1（适用女性）
christmas2_female: 圣诞2（适用女性）
christmas3_female: 圣诞3（适用女性）
newyear1_female：新春1（适用女性）
newyear2_female：新春2（适用女性）
newyear3_female：新春3（适用女性）
newyear5_female：新春5（适用女性）
simple：简洁风格（通用），一般用于写真模型封面示意图，每个ModelId的生成结果固定，多次生成将返回相同图片
     */
    public String getStyleId() {
        return this.StyleId;
    }

    /**
     * Set 风格模板，支持以下风格：
zhengjian_female：证件照（适用女性）
zhengjian_male：证件照（适用男性）
hanfu_female：汉服（适用女性）
hanfu2_female：汉服2（适用女性）
qipao_female：旗袍（适用女性）
green_female：绿色系穿搭（适用女性）
white_sweater_female：白色系毛衣（适用女性）
sports_female：蓝色系运动（适用女性）
wedding_female：婚纱裙（适用女性）
forest_female：户外森林（适用女性）
flower_female：户外花丛（适用女性）
lolita_female：洛丽塔（适用女性
black_dress1_female：小黑裙1（适用女性）
black_dress2_female：小黑裙2（适用女性）
black_dress3_female：小黑裙3（适用女性）
wedding2_female：婚纱裙2（适用女性）
fire_female：火焰背景（适用女性）
wreath_female：头戴花环（适用女性）
bow_female：蝴蝶结发饰（适用女性）
feather_female：羽毛（适用女性）
blue_shirt_female：缤纷衬衣系列-蓝色（适用女性）
green_shirt_female：缤纷衬衣系列-绿色（适用女性）
purple_shirt_female：缤纷衬衣系列-紫色（适用女性）
grey_suit_male: 灰色西装（适用男性）
beige_suit_male: 米色西装（适用男性）
white_sweater_male: 白色系毛衣（适用男性）
christmas1_female: 圣诞1（适用女性）
christmas2_female: 圣诞2（适用女性）
christmas3_female: 圣诞3（适用女性）
newyear1_female：新春1（适用女性）
newyear2_female：新春2（适用女性）
newyear3_female：新春3（适用女性）
newyear5_female：新春5（适用女性）
simple：简洁风格（通用），一般用于写真模型封面示意图，每个ModelId的生成结果固定，多次生成将返回相同图片
     * @param StyleId 风格模板，支持以下风格：
zhengjian_female：证件照（适用女性）
zhengjian_male：证件照（适用男性）
hanfu_female：汉服（适用女性）
hanfu2_female：汉服2（适用女性）
qipao_female：旗袍（适用女性）
green_female：绿色系穿搭（适用女性）
white_sweater_female：白色系毛衣（适用女性）
sports_female：蓝色系运动（适用女性）
wedding_female：婚纱裙（适用女性）
forest_female：户外森林（适用女性）
flower_female：户外花丛（适用女性）
lolita_female：洛丽塔（适用女性
black_dress1_female：小黑裙1（适用女性）
black_dress2_female：小黑裙2（适用女性）
black_dress3_female：小黑裙3（适用女性）
wedding2_female：婚纱裙2（适用女性）
fire_female：火焰背景（适用女性）
wreath_female：头戴花环（适用女性）
bow_female：蝴蝶结发饰（适用女性）
feather_female：羽毛（适用女性）
blue_shirt_female：缤纷衬衣系列-蓝色（适用女性）
green_shirt_female：缤纷衬衣系列-绿色（适用女性）
purple_shirt_female：缤纷衬衣系列-紫色（适用女性）
grey_suit_male: 灰色西装（适用男性）
beige_suit_male: 米色西装（适用男性）
white_sweater_male: 白色系毛衣（适用男性）
christmas1_female: 圣诞1（适用女性）
christmas2_female: 圣诞2（适用女性）
christmas3_female: 圣诞3（适用女性）
newyear1_female：新春1（适用女性）
newyear2_female：新春2（适用女性）
newyear3_female：新春3（适用女性）
newyear5_female：新春5（适用女性）
simple：简洁风格（通用），一般用于写真模型封面示意图，每个ModelId的生成结果固定，多次生成将返回相同图片
     */
    public void setStyleId(String StyleId) {
        this.StyleId = StyleId;
    }

    /**
     * Get 本次生成的图片数量，取值范围[1,4] 
     * @return ImageNum 本次生成的图片数量，取值范围[1,4]
     */
    public Long getImageNum() {
        return this.ImageNum;
    }

    /**
     * Set 本次生成的图片数量，取值范围[1,4]
     * @param ImageNum 本次生成的图片数量，取值范围[1,4]
     */
    public void setImageNum(Long ImageNum) {
        this.ImageNum = ImageNum;
    }

    /**
     * Get 为生成结果图添加标识的开关，默认为1。 
1：添加标识。
 0：不添加标识。 
其他数值：默认按1处理。 
建议您使用显著标识来提示结果图是 AI 生成的图片。 
     * @return LogoAdd 为生成结果图添加标识的开关，默认为1。 
1：添加标识。
 0：不添加标识。 
其他数值：默认按1处理。 
建议您使用显著标识来提示结果图是 AI 生成的图片。
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 为生成结果图添加标识的开关，默认为1。 
1：添加标识。
 0：不添加标识。 
其他数值：默认按1处理。 
建议您使用显著标识来提示结果图是 AI 生成的图片。
     * @param LogoAdd 为生成结果图添加标识的开关，默认为1。 
1：添加标识。
 0：不添加标识。 
其他数值：默认按1处理。 
建议您使用显著标识来提示结果图是 AI 生成的图片。
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get 标识内容设置。 
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。 
     * @return LogoParam 标识内容设置。 
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set 标识内容设置。 
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     * @param LogoParam 标识内容设置。 
默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get 清晰度，支持以下选项：
sd：基础版，分辨率512:640
hd：高清畅享版，分辨率1024:1280
hdpro：高清优享版，分辨率1024:1280（推荐）
uhd：超清版，分辨率2048:2560
不填默认为sd。
 
     * @return Definition 清晰度，支持以下选项：
sd：基础版，分辨率512:640
hd：高清畅享版，分辨率1024:1280
hdpro：高清优享版，分辨率1024:1280（推荐）
uhd：超清版，分辨率2048:2560
不填默认为sd。

     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 清晰度，支持以下选项：
sd：基础版，分辨率512:640
hd：高清畅享版，分辨率1024:1280
hdpro：高清优享版，分辨率1024:1280（推荐）
uhd：超清版，分辨率2048:2560
不填默认为sd。

     * @param Definition 清晰度，支持以下选项：
sd：基础版，分辨率512:640
hd：高清畅享版，分辨率1024:1280
hdpro：高清优享版，分辨率1024:1280（推荐）
uhd：超清版，分辨率2048:2560
不填默认为sd。

     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    public SubmitDrawPortraitJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitDrawPortraitJobRequest(SubmitDrawPortraitJobRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.StyleId != null) {
            this.StyleId = new String(source.StyleId);
        }
        if (source.ImageNum != null) {
            this.ImageNum = new Long(source.ImageNum);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "StyleId", this.StyleId);
        this.setParamSimple(map, prefix + "ImageNum", this.ImageNum);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

