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

public class ProductImageConfig extends AbstractModel {

    /**
    * 生成图片背景的提示词。如果此字段缺省则内部会自行生成灵感。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 要阻止模型生成图片的提示词。
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 关于产品的描述，详细的描述，有助于生成更符合要求的图片。
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * 特殊要求。如有特殊要求，可通过该字段传入。
    */
    @SerializedName("MoreRequirement")
    @Expose
    private String MoreRequirement;

    /**
    * 期望生成的图片张数。不传默认值为1，最大合法值为10。
    */
    @SerializedName("OutputImageCount")
    @Expose
    private Long OutputImageCount;

    /**
     * Get 生成图片背景的提示词。如果此字段缺省则内部会自行生成灵感。 
     * @return Prompt 生成图片背景的提示词。如果此字段缺省则内部会自行生成灵感。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 生成图片背景的提示词。如果此字段缺省则内部会自行生成灵感。
     * @param Prompt 生成图片背景的提示词。如果此字段缺省则内部会自行生成灵感。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 要阻止模型生成图片的提示词。 
     * @return NegativePrompt 要阻止模型生成图片的提示词。
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 要阻止模型生成图片的提示词。
     * @param NegativePrompt 要阻止模型生成图片的提示词。
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get 关于产品的描述，详细的描述，有助于生成更符合要求的图片。 
     * @return ProductDesc 关于产品的描述，详细的描述，有助于生成更符合要求的图片。
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set 关于产品的描述，详细的描述，有助于生成更符合要求的图片。
     * @param ProductDesc 关于产品的描述，详细的描述，有助于生成更符合要求的图片。
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get 特殊要求。如有特殊要求，可通过该字段传入。 
     * @return MoreRequirement 特殊要求。如有特殊要求，可通过该字段传入。
     */
    public String getMoreRequirement() {
        return this.MoreRequirement;
    }

    /**
     * Set 特殊要求。如有特殊要求，可通过该字段传入。
     * @param MoreRequirement 特殊要求。如有特殊要求，可通过该字段传入。
     */
    public void setMoreRequirement(String MoreRequirement) {
        this.MoreRequirement = MoreRequirement;
    }

    /**
     * Get 期望生成的图片张数。不传默认值为1，最大合法值为10。 
     * @return OutputImageCount 期望生成的图片张数。不传默认值为1，最大合法值为10。
     */
    public Long getOutputImageCount() {
        return this.OutputImageCount;
    }

    /**
     * Set 期望生成的图片张数。不传默认值为1，最大合法值为10。
     * @param OutputImageCount 期望生成的图片张数。不传默认值为1，最大合法值为10。
     */
    public void setOutputImageCount(Long OutputImageCount) {
        this.OutputImageCount = OutputImageCount;
    }

    public ProductImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductImageConfig(ProductImageConfig source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.ProductDesc != null) {
            this.ProductDesc = new String(source.ProductDesc);
        }
        if (source.MoreRequirement != null) {
            this.MoreRequirement = new String(source.MoreRequirement);
        }
        if (source.OutputImageCount != null) {
            this.OutputImageCount = new Long(source.OutputImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "MoreRequirement", this.MoreRequirement);
        this.setParamSimple(map, prefix + "OutputImageCount", this.OutputImageCount);

    }
}

