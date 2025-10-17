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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatTranslationsRequest extends AbstractModel {

    /**
    * 模型名称，可选值包括 hunyuan-translation、hunyuan-translation-lite。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 待翻译的文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 源语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 待翻译文本所属领域，例如游戏剧情等
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 参考示例，最多10个
    */
    @SerializedName("References")
    @Expose
    private Reference [] References;

    /**
     * Get 模型名称，可选值包括 hunyuan-translation、hunyuan-translation-lite。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。 
     * @return Model 模型名称，可选值包括 hunyuan-translation、hunyuan-translation-lite。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称，可选值包括 hunyuan-translation、hunyuan-translation-lite。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     * @param Model 模型名称，可选值包括 hunyuan-translation、hunyuan-translation-lite。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。 
     * @return Stream 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
     * @param Stream 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 待翻译的文本 
     * @return Text 待翻译的文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待翻译的文本
     * @param Text 待翻译的文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 源语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug 
     * @return Source 源语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
     * @param Source 源语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug 
     * @return Target 目标语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
     * @param Target 目标语言。
支持语言列表: 
简体中文：zh，繁体中文：zh-TR，粤语：yue，英语：en，法语：fr，葡萄牙语：pt，西班牙语：es，日语：ja，土耳其语：tr，俄语：ru，阿拉伯语：ar，韩语：ko，泰语：th，意大利语：it，德语：de，越南语：vi，马来语：ms，印尼语：id
以下语种仅 hunyuan-translation 模型支持：
菲律宾语：fil，印地语：hi，波兰语：pl，捷克语：cs，荷兰语：nl，高棉语：km，缅甸语：my，波斯语：fa，古吉拉特语：gu，乌尔都语：ur，泰卢固语：te，马拉地语：mr，希伯来语：he，孟加拉语：bn，泰米尔语：ta，乌克兰语：uk，藏语：bo，哈萨克语：kk，蒙古语：mn，维吾尔语：ug
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 待翻译文本所属领域，例如游戏剧情等 
     * @return Field 待翻译文本所属领域，例如游戏剧情等
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 待翻译文本所属领域，例如游戏剧情等
     * @param Field 待翻译文本所属领域，例如游戏剧情等
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 参考示例，最多10个 
     * @return References 参考示例，最多10个
     */
    public Reference [] getReferences() {
        return this.References;
    }

    /**
     * Set 参考示例，最多10个
     * @param References 参考示例，最多10个
     */
    public void setReferences(Reference [] References) {
        this.References = References;
    }

    public ChatTranslationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatTranslationsRequest(ChatTranslationsRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.References != null) {
            this.References = new Reference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new Reference(source.References[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamArrayObj(map, prefix + "References.", this.References);

    }
}

