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

public class ReplaceBackgroundRequest extends AbstractModel {

    /**
    * 商品原图 Url。
图片限制：单边分辨率小于4000，长宽比在2:5 ~ 5:2之间，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
    */
    @SerializedName("ProductUrl")
    @Expose
    private String ProductUrl;

    /**
    * 对新背景的文本描述。
最多支持256个 utf-8 字符，支持中、英文。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 商品图中的商品主体名称。
建议说明商品主体，否则影响生成效果。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 商品 Mask 图 Url，要求背景透明，保留商品主体。
如果不传，将自动使用内置的商品分割算法得到 Mask。
支持自定义上传 Mask，如果该参数不为空，则以实际上传的数据为准。
图片限制：Mask 图必须和商品原图分辨率一致，转成 Base64 字符串后小于 6MB，格式仅支持 png。
    */
    @SerializedName("MaskUrl")
    @Expose
    private String MaskUrl;

    /**
    * 替换背景后生成的商品图分辨率。
支持生成单边分辨率大于500且小于4000、长宽比在2:5 ~ 5:2之间的图片，不传默认生成1280:1280。
建议图片比例为1:1、9:16、16:9，生成效果更佳，使用其他比例的生成效果可能不如建议比例。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

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
    * 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
生成图分辨率较大时建议选择 url，使用 base64 可能因图片过大导致返回失败。
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
     * Get 商品原图 Url。
图片限制：单边分辨率小于4000，长宽比在2:5 ~ 5:2之间，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。 
     * @return ProductUrl 商品原图 Url。
图片限制：单边分辨率小于4000，长宽比在2:5 ~ 5:2之间，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public String getProductUrl() {
        return this.ProductUrl;
    }

    /**
     * Set 商品原图 Url。
图片限制：单边分辨率小于4000，长宽比在2:5 ~ 5:2之间，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     * @param ProductUrl 商品原图 Url。
图片限制：单边分辨率小于4000，长宽比在2:5 ~ 5:2之间，转成 Base64 字符串后小于 6MB，格式支持 jpg、jpeg、png、bmp、tiff、webp。
     */
    public void setProductUrl(String ProductUrl) {
        this.ProductUrl = ProductUrl;
    }

    /**
     * Get 对新背景的文本描述。
最多支持256个 utf-8 字符，支持中、英文。 
     * @return Prompt 对新背景的文本描述。
最多支持256个 utf-8 字符，支持中、英文。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 对新背景的文本描述。
最多支持256个 utf-8 字符，支持中、英文。
     * @param Prompt 对新背景的文本描述。
最多支持256个 utf-8 字符，支持中、英文。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 商品图中的商品主体名称。
建议说明商品主体，否则影响生成效果。 
     * @return Product 商品图中的商品主体名称。
建议说明商品主体，否则影响生成效果。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 商品图中的商品主体名称。
建议说明商品主体，否则影响生成效果。
     * @param Product 商品图中的商品主体名称。
建议说明商品主体，否则影响生成效果。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 商品 Mask 图 Url，要求背景透明，保留商品主体。
如果不传，将自动使用内置的商品分割算法得到 Mask。
支持自定义上传 Mask，如果该参数不为空，则以实际上传的数据为准。
图片限制：Mask 图必须和商品原图分辨率一致，转成 Base64 字符串后小于 6MB，格式仅支持 png。 
     * @return MaskUrl 商品 Mask 图 Url，要求背景透明，保留商品主体。
如果不传，将自动使用内置的商品分割算法得到 Mask。
支持自定义上传 Mask，如果该参数不为空，则以实际上传的数据为准。
图片限制：Mask 图必须和商品原图分辨率一致，转成 Base64 字符串后小于 6MB，格式仅支持 png。
     */
    public String getMaskUrl() {
        return this.MaskUrl;
    }

    /**
     * Set 商品 Mask 图 Url，要求背景透明，保留商品主体。
如果不传，将自动使用内置的商品分割算法得到 Mask。
支持自定义上传 Mask，如果该参数不为空，则以实际上传的数据为准。
图片限制：Mask 图必须和商品原图分辨率一致，转成 Base64 字符串后小于 6MB，格式仅支持 png。
     * @param MaskUrl 商品 Mask 图 Url，要求背景透明，保留商品主体。
如果不传，将自动使用内置的商品分割算法得到 Mask。
支持自定义上传 Mask，如果该参数不为空，则以实际上传的数据为准。
图片限制：Mask 图必须和商品原图分辨率一致，转成 Base64 字符串后小于 6MB，格式仅支持 png。
     */
    public void setMaskUrl(String MaskUrl) {
        this.MaskUrl = MaskUrl;
    }

    /**
     * Get 替换背景后生成的商品图分辨率。
支持生成单边分辨率大于500且小于4000、长宽比在2:5 ~ 5:2之间的图片，不传默认生成1280:1280。
建议图片比例为1:1、9:16、16:9，生成效果更佳，使用其他比例的生成效果可能不如建议比例。 
     * @return Resolution 替换背景后生成的商品图分辨率。
支持生成单边分辨率大于500且小于4000、长宽比在2:5 ~ 5:2之间的图片，不传默认生成1280:1280。
建议图片比例为1:1、9:16、16:9，生成效果更佳，使用其他比例的生成效果可能不如建议比例。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 替换背景后生成的商品图分辨率。
支持生成单边分辨率大于500且小于4000、长宽比在2:5 ~ 5:2之间的图片，不传默认生成1280:1280。
建议图片比例为1:1、9:16、16:9，生成效果更佳，使用其他比例的生成效果可能不如建议比例。
     * @param Resolution 替换背景后生成的商品图分辨率。
支持生成单边分辨率大于500且小于4000、长宽比在2:5 ~ 5:2之间的图片，不传默认生成1280:1280。
建议图片比例为1:1、9:16、16:9，生成效果更佳，使用其他比例的生成效果可能不如建议比例。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
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
     * Get 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
生成图分辨率较大时建议选择 url，使用 base64 可能因图片过大导致返回失败。 
     * @return RspImgType 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
生成图分辨率较大时建议选择 url，使用 base64 可能因图片过大导致返回失败。
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
生成图分辨率较大时建议选择 url，使用 base64 可能因图片过大导致返回失败。
     * @param RspImgType 返回图像方式（base64 或 url) ，二选一，默认为 base64。url 有效期为1小时。
生成图分辨率较大时建议选择 url，使用 base64 可能因图片过大导致返回失败。
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    public ReplaceBackgroundRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceBackgroundRequest(ReplaceBackgroundRequest source) {
        if (source.ProductUrl != null) {
            this.ProductUrl = new String(source.ProductUrl);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.MaskUrl != null) {
            this.MaskUrl = new String(source.MaskUrl);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductUrl", this.ProductUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "MaskUrl", this.MaskUrl);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);

    }
}

