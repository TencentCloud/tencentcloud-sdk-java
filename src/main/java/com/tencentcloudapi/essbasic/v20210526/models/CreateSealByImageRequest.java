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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSealByImageRequest extends AbstractModel {

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 印章名称，最大长度不超过50字符
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 印章图片base64，大小不超过10M（原始图片不超过7.6M）
    */
    @SerializedName("SealImage")
    @Expose
    private String SealImage;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 本接口支持上传图片印章及系统直接生成印章； 如果要使用系统生成印章，此值传：SealGenerateSourceSystem； 如果要使用图片上传请传字段 SealImage
    */
    @SerializedName("GenerateSource")
    @Expose
    private String GenerateSource;

    /**
    * 电子印章类型：
<ul><li>OFFICIAL-公章</li>
<li>CONTRACT-合同专用章;</li>
<li>FINANCE-合财务专用章;</li>
<li>PERSONNEL-人事专用章
</li>
<li>默认：OFFICIAL</li>
</ul>
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 企业印章横向文字，最多可填15个汉字（若超过印章最大宽度，优先压缩字间距，其次缩小字号
    */
    @SerializedName("SealHorizontalText")
    @Expose
    private String SealHorizontalText;

    /**
    * 印章样式:

<ul><li>cycle:圆形印章</li>
<li>ellipse:椭圆印章</li>
<li> 注：默认圆形印章</li></ul>
    */
    @SerializedName("SealStyle")
    @Expose
    private String SealStyle;

    /**
    * 印章尺寸取值描述：<ul><li> 42_42 圆形企业公章直径42mm</li>
<li> 40_40 圆形企业印章直径40mm</li>
<li> 45_30 椭圆形印章45mm x 30mm</li>
</ul>
    */
    @SerializedName("SealSize")
    @Expose
    private String SealSize;

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 印章名称，最大长度不超过50字符 
     * @return SealName 印章名称，最大长度不超过50字符
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称，最大长度不超过50字符
     * @param SealName 印章名称，最大长度不超过50字符
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 印章图片base64，大小不超过10M（原始图片不超过7.6M） 
     * @return SealImage 印章图片base64，大小不超过10M（原始图片不超过7.6M）
     */
    public String getSealImage() {
        return this.SealImage;
    }

    /**
     * Set 印章图片base64，大小不超过10M（原始图片不超过7.6M）
     * @param SealImage 印章图片base64，大小不超过10M（原始图片不超过7.6M）
     */
    public void setSealImage(String SealImage) {
        this.SealImage = SealImage;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 本接口支持上传图片印章及系统直接生成印章； 如果要使用系统生成印章，此值传：SealGenerateSourceSystem； 如果要使用图片上传请传字段 SealImage 
     * @return GenerateSource 本接口支持上传图片印章及系统直接生成印章； 如果要使用系统生成印章，此值传：SealGenerateSourceSystem； 如果要使用图片上传请传字段 SealImage
     */
    public String getGenerateSource() {
        return this.GenerateSource;
    }

    /**
     * Set 本接口支持上传图片印章及系统直接生成印章； 如果要使用系统生成印章，此值传：SealGenerateSourceSystem； 如果要使用图片上传请传字段 SealImage
     * @param GenerateSource 本接口支持上传图片印章及系统直接生成印章； 如果要使用系统生成印章，此值传：SealGenerateSourceSystem； 如果要使用图片上传请传字段 SealImage
     */
    public void setGenerateSource(String GenerateSource) {
        this.GenerateSource = GenerateSource;
    }

    /**
     * Get 电子印章类型：
<ul><li>OFFICIAL-公章</li>
<li>CONTRACT-合同专用章;</li>
<li>FINANCE-合财务专用章;</li>
<li>PERSONNEL-人事专用章
</li>
<li>默认：OFFICIAL</li>
</ul> 
     * @return SealType 电子印章类型：
<ul><li>OFFICIAL-公章</li>
<li>CONTRACT-合同专用章;</li>
<li>FINANCE-合财务专用章;</li>
<li>PERSONNEL-人事专用章
</li>
<li>默认：OFFICIAL</li>
</ul>
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 电子印章类型：
<ul><li>OFFICIAL-公章</li>
<li>CONTRACT-合同专用章;</li>
<li>FINANCE-合财务专用章;</li>
<li>PERSONNEL-人事专用章
</li>
<li>默认：OFFICIAL</li>
</ul>
     * @param SealType 电子印章类型：
<ul><li>OFFICIAL-公章</li>
<li>CONTRACT-合同专用章;</li>
<li>FINANCE-合财务专用章;</li>
<li>PERSONNEL-人事专用章
</li>
<li>默认：OFFICIAL</li>
</ul>
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 企业印章横向文字，最多可填15个汉字（若超过印章最大宽度，优先压缩字间距，其次缩小字号 
     * @return SealHorizontalText 企业印章横向文字，最多可填15个汉字（若超过印章最大宽度，优先压缩字间距，其次缩小字号
     */
    public String getSealHorizontalText() {
        return this.SealHorizontalText;
    }

    /**
     * Set 企业印章横向文字，最多可填15个汉字（若超过印章最大宽度，优先压缩字间距，其次缩小字号
     * @param SealHorizontalText 企业印章横向文字，最多可填15个汉字（若超过印章最大宽度，优先压缩字间距，其次缩小字号
     */
    public void setSealHorizontalText(String SealHorizontalText) {
        this.SealHorizontalText = SealHorizontalText;
    }

    /**
     * Get 印章样式:

<ul><li>cycle:圆形印章</li>
<li>ellipse:椭圆印章</li>
<li> 注：默认圆形印章</li></ul> 
     * @return SealStyle 印章样式:

<ul><li>cycle:圆形印章</li>
<li>ellipse:椭圆印章</li>
<li> 注：默认圆形印章</li></ul>
     */
    public String getSealStyle() {
        return this.SealStyle;
    }

    /**
     * Set 印章样式:

<ul><li>cycle:圆形印章</li>
<li>ellipse:椭圆印章</li>
<li> 注：默认圆形印章</li></ul>
     * @param SealStyle 印章样式:

<ul><li>cycle:圆形印章</li>
<li>ellipse:椭圆印章</li>
<li> 注：默认圆形印章</li></ul>
     */
    public void setSealStyle(String SealStyle) {
        this.SealStyle = SealStyle;
    }

    /**
     * Get 印章尺寸取值描述：<ul><li> 42_42 圆形企业公章直径42mm</li>
<li> 40_40 圆形企业印章直径40mm</li>
<li> 45_30 椭圆形印章45mm x 30mm</li>
</ul> 
     * @return SealSize 印章尺寸取值描述：<ul><li> 42_42 圆形企业公章直径42mm</li>
<li> 40_40 圆形企业印章直径40mm</li>
<li> 45_30 椭圆形印章45mm x 30mm</li>
</ul>
     */
    public String getSealSize() {
        return this.SealSize;
    }

    /**
     * Set 印章尺寸取值描述：<ul><li> 42_42 圆形企业公章直径42mm</li>
<li> 40_40 圆形企业印章直径40mm</li>
<li> 45_30 椭圆形印章45mm x 30mm</li>
</ul>
     * @param SealSize 印章尺寸取值描述：<ul><li> 42_42 圆形企业公章直径42mm</li>
<li> 40_40 圆形企业印章直径40mm</li>
<li> 45_30 椭圆形印章45mm x 30mm</li>
</ul>
     */
    public void setSealSize(String SealSize) {
        this.SealSize = SealSize;
    }

    public CreateSealByImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealByImageRequest(CreateSealByImageRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SealImage != null) {
            this.SealImage = new String(source.SealImage);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.GenerateSource != null) {
            this.GenerateSource = new String(source.GenerateSource);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.SealHorizontalText != null) {
            this.SealHorizontalText = new String(source.SealHorizontalText);
        }
        if (source.SealStyle != null) {
            this.SealStyle = new String(source.SealStyle);
        }
        if (source.SealSize != null) {
            this.SealSize = new String(source.SealSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SealImage", this.SealImage);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "GenerateSource", this.GenerateSource);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "SealHorizontalText", this.SealHorizontalText);
        this.setParamSimple(map, prefix + "SealStyle", this.SealStyle);
        this.setParamSimple(map, prefix + "SealSize", this.SealSize);

    }
}

