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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTranslateRequest extends AbstractModel{

    /**
    * 源语言，支持
zh:简体中文
zh-HK：繁体中文
zh-TW : 繁体中文
zh-TR:  繁体中文
en ：英语
ar：阿拉伯语
de：德语
es：西班牙语
fr：法语
it：意大利语
ja：日语
pt：葡萄牙语
ru：俄语
ko：韩语
km：高棉语
lo：老挝语
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言，各源语言的目标语言支持列表如下
zh（简体中文）： en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-HK（繁体中文） ：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TW（繁体中文）：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TR 繁体中文 : en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
en （英语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、 zh-TR(繁体中文）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
ar（阿拉伯语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
de（德语 ）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
es（西班牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
fr（法语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
it（意大利语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ja（日语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
pt（葡萄牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ru（俄语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ko（韩语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
km（高棉语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
lo（老挝语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 文档类型：可支持以下几种(pdf,docx,pptx,xlsx,txt,xml,html,markdown,properties)
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * 数据来源，0：url，1：直接传文件编码后数据
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 需要翻译文件url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 原始文档类型
    */
    @SerializedName("BasicDocumentType")
    @Expose
    private String BasicDocumentType;

    /**
    * 回调url
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 文件数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。数据要小于5MB。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 源语言，支持
zh:简体中文
zh-HK：繁体中文
zh-TW : 繁体中文
zh-TR:  繁体中文
en ：英语
ar：阿拉伯语
de：德语
es：西班牙语
fr：法语
it：意大利语
ja：日语
pt：葡萄牙语
ru：俄语
ko：韩语
km：高棉语
lo：老挝语 
     * @return Source 源语言，支持
zh:简体中文
zh-HK：繁体中文
zh-TW : 繁体中文
zh-TR:  繁体中文
en ：英语
ar：阿拉伯语
de：德语
es：西班牙语
fr：法语
it：意大利语
ja：日语
pt：葡萄牙语
ru：俄语
ko：韩语
km：高棉语
lo：老挝语
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言，支持
zh:简体中文
zh-HK：繁体中文
zh-TW : 繁体中文
zh-TR:  繁体中文
en ：英语
ar：阿拉伯语
de：德语
es：西班牙语
fr：法语
it：意大利语
ja：日语
pt：葡萄牙语
ru：俄语
ko：韩语
km：高棉语
lo：老挝语
     * @param Source 源语言，支持
zh:简体中文
zh-HK：繁体中文
zh-TW : 繁体中文
zh-TR:  繁体中文
en ：英语
ar：阿拉伯语
de：德语
es：西班牙语
fr：法语
it：意大利语
ja：日语
pt：葡萄牙语
ru：俄语
ko：韩语
km：高棉语
lo：老挝语
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言，各源语言的目标语言支持列表如下
zh（简体中文）： en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-HK（繁体中文） ：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TW（繁体中文）：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TR 繁体中文 : en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
en （英语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、 zh-TR(繁体中文）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
ar（阿拉伯语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
de（德语 ）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
es（西班牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
fr（法语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
it（意大利语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ja（日语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
pt（葡萄牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ru（俄语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ko（韩语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
km（高棉语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
lo（老挝语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文） 
     * @return Target 目标语言，各源语言的目标语言支持列表如下
zh（简体中文）： en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-HK（繁体中文） ：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TW（繁体中文）：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TR 繁体中文 : en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
en （英语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、 zh-TR(繁体中文）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
ar（阿拉伯语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
de（德语 ）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
es（西班牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
fr（法语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
it（意大利语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ja（日语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
pt（葡萄牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ru（俄语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ko（韩语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
km（高棉语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
lo（老挝语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言，各源语言的目标语言支持列表如下
zh（简体中文）： en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-HK（繁体中文） ：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TW（繁体中文）：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TR 繁体中文 : en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
en （英语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、 zh-TR(繁体中文）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
ar（阿拉伯语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
de（德语 ）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
es（西班牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
fr（法语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
it（意大利语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ja（日语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
pt（葡萄牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ru（俄语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ko（韩语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
km（高棉语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
lo（老挝语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
     * @param Target 目标语言，各源语言的目标语言支持列表如下
zh（简体中文）： en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-HK（繁体中文） ：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TW（繁体中文）：en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
zh-TR 繁体中文 : en （英语）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
en （英语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、 zh-TR(繁体中文）、 ar (阿拉伯语）、 de （德语）、  es（西班牙语） 、fr（法语）、  it（意大利语） 、 ja （日语）、 pt （葡萄牙语）、 ru（俄语）、  ko（韩语）、 km（高棉语）、   lo（老挝语）
ar（阿拉伯语） ：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
de（德语 ）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
es（西班牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
fr（法语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
it（意大利语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ja（日语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
pt（葡萄牙语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ru（俄语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
ko（韩语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
km（高棉语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
lo（老挝语）：zh（简体中文）、zh-HK（繁体中文）、 zh-TW（繁体中文)、zh-TR(繁体中文）
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 文档类型：可支持以下几种(pdf,docx,pptx,xlsx,txt,xml,html,markdown,properties) 
     * @return DocumentType 文档类型：可支持以下几种(pdf,docx,pptx,xlsx,txt,xml,html,markdown,properties)
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set 文档类型：可支持以下几种(pdf,docx,pptx,xlsx,txt,xml,html,markdown,properties)
     * @param DocumentType 文档类型：可支持以下几种(pdf,docx,pptx,xlsx,txt,xml,html,markdown,properties)
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 数据来源，0：url，1：直接传文件编码后数据 
     * @return SourceType 数据来源，0：url，1：直接传文件编码后数据
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 数据来源，0：url，1：直接传文件编码后数据
     * @param SourceType 数据来源，0：url，1：直接传文件编码后数据
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 需要翻译文件url 
     * @return Url 需要翻译文件url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 需要翻译文件url
     * @param Url 需要翻译文件url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 原始文档类型 
     * @return BasicDocumentType 原始文档类型
     */
    public String getBasicDocumentType() {
        return this.BasicDocumentType;
    }

    /**
     * Set 原始文档类型
     * @param BasicDocumentType 原始文档类型
     */
    public void setBasicDocumentType(String BasicDocumentType) {
        this.BasicDocumentType = BasicDocumentType;
    }

    /**
     * Get 回调url 
     * @return CallbackUrl 回调url
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调url
     * @param CallbackUrl 回调url
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 文件数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。数据要小于5MB。 
     * @return Data 文件数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。数据要小于5MB。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 文件数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。数据要小于5MB。
     * @param Data 文件数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。数据要小于5MB。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public FileTranslateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTranslateRequest(FileTranslateRequest source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new String(source.DocumentType);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BasicDocumentType != null) {
            this.BasicDocumentType = new String(source.BasicDocumentType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BasicDocumentType", this.BasicDocumentType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

