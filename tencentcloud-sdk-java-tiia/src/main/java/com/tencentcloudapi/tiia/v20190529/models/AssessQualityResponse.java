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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessQualityResponse extends AbstractModel{

    /**
    * 取值为TRUE或FALSE，TRUE为长图，FALSE为正常图，长图定义为长宽比大于等于3或小于等于1/3的图片。
    */
    @SerializedName("LongImage")
    @Expose
    private Boolean LongImage;

    /**
    * 取值为TRUE或FALSE，TRUE为黑白图，FALSE为否。黑白图即灰度图，指红绿蓝三个通道都是以灰度色阶显示的图片，并非视觉上的“黑白图片”。
    */
    @SerializedName("BlackAndWhite")
    @Expose
    private Boolean BlackAndWhite;

    /**
    * 取值为TRUE或FALSE，TRUE为小图，FALSE为否, 小图定义为最长边小于179像素的图片。当一张图片被判断为小图时，不建议做推荐和展示，其他字段统一输出为0或FALSE。
    */
    @SerializedName("SmallImage")
    @Expose
    private Boolean SmallImage;

    /**
    * 取值为TRUE或FALSE，TRUE为大图，FALSE为否，定义为最短边大于1000像素的图片
    */
    @SerializedName("BigImage")
    @Expose
    private Boolean BigImage;

    /**
    * 取值为TRUE或FALSE，TRUE为纯色图或纯文字图，即没有内容或只有简单内容的图片，FALSE为正常图片。
    */
    @SerializedName("PureImage")
    @Expose
    private Boolean PureImage;

    /**
    * 综合评分。图像清晰度的得分，对图片的噪声、曝光、模糊、压缩等因素进行综合评估，取值为[0, 100]，值越大，越清晰。一般大于50为较清晰图片，标准可以自行把握。
    */
    @SerializedName("ClarityScore")
    @Expose
    private Long ClarityScore;

    /**
    * 综合评分。图像美观度得分， 从构图、色彩等多个艺术性维度评价图片，取值为[0, 100]，值越大，越美观。一般大于50为较美观图片，标准可以自行把握。
    */
    @SerializedName("AestheticScore")
    @Expose
    private Long AestheticScore;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 取值为TRUE或FALSE，TRUE为长图，FALSE为正常图，长图定义为长宽比大于等于3或小于等于1/3的图片。 
     * @return LongImage 取值为TRUE或FALSE，TRUE为长图，FALSE为正常图，长图定义为长宽比大于等于3或小于等于1/3的图片。
     */
    public Boolean getLongImage() {
        return this.LongImage;
    }

    /**
     * Set 取值为TRUE或FALSE，TRUE为长图，FALSE为正常图，长图定义为长宽比大于等于3或小于等于1/3的图片。
     * @param LongImage 取值为TRUE或FALSE，TRUE为长图，FALSE为正常图，长图定义为长宽比大于等于3或小于等于1/3的图片。
     */
    public void setLongImage(Boolean LongImage) {
        this.LongImage = LongImage;
    }

    /**
     * Get 取值为TRUE或FALSE，TRUE为黑白图，FALSE为否。黑白图即灰度图，指红绿蓝三个通道都是以灰度色阶显示的图片，并非视觉上的“黑白图片”。 
     * @return BlackAndWhite 取值为TRUE或FALSE，TRUE为黑白图，FALSE为否。黑白图即灰度图，指红绿蓝三个通道都是以灰度色阶显示的图片，并非视觉上的“黑白图片”。
     */
    public Boolean getBlackAndWhite() {
        return this.BlackAndWhite;
    }

    /**
     * Set 取值为TRUE或FALSE，TRUE为黑白图，FALSE为否。黑白图即灰度图，指红绿蓝三个通道都是以灰度色阶显示的图片，并非视觉上的“黑白图片”。
     * @param BlackAndWhite 取值为TRUE或FALSE，TRUE为黑白图，FALSE为否。黑白图即灰度图，指红绿蓝三个通道都是以灰度色阶显示的图片，并非视觉上的“黑白图片”。
     */
    public void setBlackAndWhite(Boolean BlackAndWhite) {
        this.BlackAndWhite = BlackAndWhite;
    }

    /**
     * Get 取值为TRUE或FALSE，TRUE为小图，FALSE为否, 小图定义为最长边小于179像素的图片。当一张图片被判断为小图时，不建议做推荐和展示，其他字段统一输出为0或FALSE。 
     * @return SmallImage 取值为TRUE或FALSE，TRUE为小图，FALSE为否, 小图定义为最长边小于179像素的图片。当一张图片被判断为小图时，不建议做推荐和展示，其他字段统一输出为0或FALSE。
     */
    public Boolean getSmallImage() {
        return this.SmallImage;
    }

    /**
     * Set 取值为TRUE或FALSE，TRUE为小图，FALSE为否, 小图定义为最长边小于179像素的图片。当一张图片被判断为小图时，不建议做推荐和展示，其他字段统一输出为0或FALSE。
     * @param SmallImage 取值为TRUE或FALSE，TRUE为小图，FALSE为否, 小图定义为最长边小于179像素的图片。当一张图片被判断为小图时，不建议做推荐和展示，其他字段统一输出为0或FALSE。
     */
    public void setSmallImage(Boolean SmallImage) {
        this.SmallImage = SmallImage;
    }

    /**
     * Get 取值为TRUE或FALSE，TRUE为大图，FALSE为否，定义为最短边大于1000像素的图片 
     * @return BigImage 取值为TRUE或FALSE，TRUE为大图，FALSE为否，定义为最短边大于1000像素的图片
     */
    public Boolean getBigImage() {
        return this.BigImage;
    }

    /**
     * Set 取值为TRUE或FALSE，TRUE为大图，FALSE为否，定义为最短边大于1000像素的图片
     * @param BigImage 取值为TRUE或FALSE，TRUE为大图，FALSE为否，定义为最短边大于1000像素的图片
     */
    public void setBigImage(Boolean BigImage) {
        this.BigImage = BigImage;
    }

    /**
     * Get 取值为TRUE或FALSE，TRUE为纯色图或纯文字图，即没有内容或只有简单内容的图片，FALSE为正常图片。 
     * @return PureImage 取值为TRUE或FALSE，TRUE为纯色图或纯文字图，即没有内容或只有简单内容的图片，FALSE为正常图片。
     */
    public Boolean getPureImage() {
        return this.PureImage;
    }

    /**
     * Set 取值为TRUE或FALSE，TRUE为纯色图或纯文字图，即没有内容或只有简单内容的图片，FALSE为正常图片。
     * @param PureImage 取值为TRUE或FALSE，TRUE为纯色图或纯文字图，即没有内容或只有简单内容的图片，FALSE为正常图片。
     */
    public void setPureImage(Boolean PureImage) {
        this.PureImage = PureImage;
    }

    /**
     * Get 综合评分。图像清晰度的得分，对图片的噪声、曝光、模糊、压缩等因素进行综合评估，取值为[0, 100]，值越大，越清晰。一般大于50为较清晰图片，标准可以自行把握。 
     * @return ClarityScore 综合评分。图像清晰度的得分，对图片的噪声、曝光、模糊、压缩等因素进行综合评估，取值为[0, 100]，值越大，越清晰。一般大于50为较清晰图片，标准可以自行把握。
     */
    public Long getClarityScore() {
        return this.ClarityScore;
    }

    /**
     * Set 综合评分。图像清晰度的得分，对图片的噪声、曝光、模糊、压缩等因素进行综合评估，取值为[0, 100]，值越大，越清晰。一般大于50为较清晰图片，标准可以自行把握。
     * @param ClarityScore 综合评分。图像清晰度的得分，对图片的噪声、曝光、模糊、压缩等因素进行综合评估，取值为[0, 100]，值越大，越清晰。一般大于50为较清晰图片，标准可以自行把握。
     */
    public void setClarityScore(Long ClarityScore) {
        this.ClarityScore = ClarityScore;
    }

    /**
     * Get 综合评分。图像美观度得分， 从构图、色彩等多个艺术性维度评价图片，取值为[0, 100]，值越大，越美观。一般大于50为较美观图片，标准可以自行把握。 
     * @return AestheticScore 综合评分。图像美观度得分， 从构图、色彩等多个艺术性维度评价图片，取值为[0, 100]，值越大，越美观。一般大于50为较美观图片，标准可以自行把握。
     */
    public Long getAestheticScore() {
        return this.AestheticScore;
    }

    /**
     * Set 综合评分。图像美观度得分， 从构图、色彩等多个艺术性维度评价图片，取值为[0, 100]，值越大，越美观。一般大于50为较美观图片，标准可以自行把握。
     * @param AestheticScore 综合评分。图像美观度得分， 从构图、色彩等多个艺术性维度评价图片，取值为[0, 100]，值越大，越美观。一般大于50为较美观图片，标准可以自行把握。
     */
    public void setAestheticScore(Long AestheticScore) {
        this.AestheticScore = AestheticScore;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LongImage", this.LongImage);
        this.setParamSimple(map, prefix + "BlackAndWhite", this.BlackAndWhite);
        this.setParamSimple(map, prefix + "SmallImage", this.SmallImage);
        this.setParamSimple(map, prefix + "BigImage", this.BigImage);
        this.setParamSimple(map, prefix + "PureImage", this.PureImage);
        this.setParamSimple(map, prefix + "ClarityScore", this.ClarityScore);
        this.setParamSimple(map, prefix + "AestheticScore", this.AestheticScore);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

