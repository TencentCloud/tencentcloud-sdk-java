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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSealRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>电子印章生成方式</p><ul><li><strong>空值</strong>:(默认)使用上传的图片生成印章, 此时需要上传SealImage图片</li><li><strong>SealGenerateSourceSystem</strong>: 系统生成印章, 无需上传SealImage图片</li></ul>
    */
    @SerializedName("GenerateSource")
    @Expose
    private String GenerateSource;

    /**
    * <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: (默认)公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>OTHER</strong>: 其他</li></ul>注: 同企业下只能有<font color="red">一个</font>公章, 重复创建会报错</p>
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * <p>电子印章图片文件名称，1-50个中文字符。</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式</p><p>注: <code>通过图片创建的电子印章，需电子签平台人工审核</code></p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>电子印章宽度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>电子印章高度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>电子印章印章颜色(默认红色RED),RED-红色</p><p>系统目前只支持红色印章创建。</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>企业印章横向文字，最多可填15个汉字  (若超过印章最大宽度，优先压缩字间距，其次缩小字号)<br>横向文字的位置如下图中的&quot;印章横向文字在这里&quot;</p><p><img src="https://dyn.ess.tencent.cn/guide/capi/CreateSealByImage2.png" alt="image"></p>
    */
    @SerializedName("SealHorizontalText")
    @Expose
    private String SealHorizontalText;

    /**
    * <p>暂时不支持下弦文字设置</p>
    */
    @SerializedName("SealChordText")
    @Expose
    private String SealChordText;

    /**
    * <p>系统生成的印章只支持：STAR</p>
    */
    @SerializedName("SealCentralType")
    @Expose
    private String SealCentralType;

    /**
    * <p>通过文件上传时，服务端生成的电子印章上传图片的token</p>
    */
    @SerializedName("FileToken")
    @Expose
    private String FileToken;

    /**
    * <p>印章样式, 可以选择的样式如下: </p><ul><li>**circle**:(默认)圆形印章</li><li>**ellipse**:椭圆印章</li></ul>
    */
    @SerializedName("SealStyle")
    @Expose
    private String SealStyle;

    /**
    * <p>印章尺寸取值描述, 可以选择的尺寸如下: <ul><li> <strong>38_38</strong>: 圆形企业公章直径38mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>40_40</strong>: 圆形企业公章直径40mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>42_42</strong>（默认）: 圆形企业公章直径42mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>45_45</strong>: 圆形企业印章直径45mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>50_50</strong>: 圆形企业印章直径50mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>58_58</strong>: 圆形企业印章直径58mm, 当SealStyle是圆形的时候才有效</li>  <li> <strong>40_30</strong>: 椭圆形印章40mm x 30mm, 当SealStyle是椭圆的时候才有效</li> <li> <strong>45_30</strong>: 椭圆形印章45mm x 30mm, 当SealStyle是椭圆的时候才有效</li> </ul></p>
    */
    @SerializedName("SealSize")
    @Expose
    private String SealSize;

    /**
    * <p>企业税号<br>注:</p><ul><li>1.印章类型SealType是INVOICE类型时，此参数才会生效</li><li>2.印章类型SealType是INVOICE类型，且该字段没有传入值或传入空时，会取该企业对应的统一社会信用代码作为默认的企业税号（<font color="red">如果是通过授权书授权方式认证的企业，此参数必传不能为空</font>）</li></ul>
    */
    @SerializedName("TaxIdentifyCode")
    @Expose
    private String TaxIdentifyCode;

    /**
    * <p>印章描述内容</p>
    */
    @SerializedName("SealDescription")
    @Expose
    private String SealDescription;

    /**
    * <p>个性化配置字段，默认不传。</p>
    */
    @SerializedName("Options")
    @Expose
    private Option [] Options;

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p> 
     * @return SealName <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
     * @param SealName <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>电子印章生成方式</p><ul><li><strong>空值</strong>:(默认)使用上传的图片生成印章, 此时需要上传SealImage图片</li><li><strong>SealGenerateSourceSystem</strong>: 系统生成印章, 无需上传SealImage图片</li></ul> 
     * @return GenerateSource <p>电子印章生成方式</p><ul><li><strong>空值</strong>:(默认)使用上传的图片生成印章, 此时需要上传SealImage图片</li><li><strong>SealGenerateSourceSystem</strong>: 系统生成印章, 无需上传SealImage图片</li></ul>
     */
    public String getGenerateSource() {
        return this.GenerateSource;
    }

    /**
     * Set <p>电子印章生成方式</p><ul><li><strong>空值</strong>:(默认)使用上传的图片生成印章, 此时需要上传SealImage图片</li><li><strong>SealGenerateSourceSystem</strong>: 系统生成印章, 无需上传SealImage图片</li></ul>
     * @param GenerateSource <p>电子印章生成方式</p><ul><li><strong>空值</strong>:(默认)使用上传的图片生成印章, 此时需要上传SealImage图片</li><li><strong>SealGenerateSourceSystem</strong>: 系统生成印章, 无需上传SealImage图片</li></ul>
     */
    public void setGenerateSource(String GenerateSource) {
        this.GenerateSource = GenerateSource;
    }

    /**
     * Get <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: (默认)公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>OTHER</strong>: 其他</li></ul>注: 同企业下只能有<font color="red">一个</font>公章, 重复创建会报错</p> 
     * @return SealType <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: (默认)公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>OTHER</strong>: 其他</li></ul>注: 同企业下只能有<font color="red">一个</font>公章, 重复创建会报错</p>
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: (默认)公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>OTHER</strong>: 其他</li></ul>注: 同企业下只能有<font color="red">一个</font>公章, 重复创建会报错</p>
     * @param SealType <p>电子印章类型 , 可选类型如下: <ul><li><strong>OFFICIAL</strong>: (默认)公章</li><li><strong>CONTRACT</strong>: 合同专用章;</li><li><strong>FINANCE</strong>: 财务专用章;</li><li><strong>PERSONNEL</strong>: 人事专用章</li><li><strong>INVOICE</strong>: 发票专用章</li><li><strong>OTHER</strong>: 其他</li></ul>注: 同企业下只能有<font color="red">一个</font>公章, 重复创建会报错</p>
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get <p>电子印章图片文件名称，1-50个中文字符。</p> 
     * @return FileName <p>电子印章图片文件名称，1-50个中文字符。</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>电子印章图片文件名称，1-50个中文字符。</p>
     * @param FileName <p>电子印章图片文件名称，1-50个中文字符。</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式</p><p>注: <code>通过图片创建的电子印章，需电子签平台人工审核</code></p> 
     * @return Image <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式</p><p>注: <code>通过图片创建的电子印章，需电子签平台人工审核</code></p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式</p><p>注: <code>通过图片创建的电子印章，需电子签平台人工审核</code></p>
     * @param Image <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式</p><p>注: <code>通过图片创建的电子印章，需电子签平台人工审核</code></p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>电子印章宽度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p> 
     * @return Width <p>电子印章宽度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>电子印章宽度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
     * @param Width <p>电子印章宽度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>电子印章高度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p> 
     * @return Height <p>电子印章高度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>电子印章高度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
     * @param Height <p>电子印章高度,单位px<br>参数不再启用，系统会设置印章大小为标准尺寸。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>电子印章印章颜色(默认红色RED),RED-红色</p><p>系统目前只支持红色印章创建。</p> 
     * @return Color <p>电子印章印章颜色(默认红色RED),RED-红色</p><p>系统目前只支持红色印章创建。</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>电子印章印章颜色(默认红色RED),RED-红色</p><p>系统目前只支持红色印章创建。</p>
     * @param Color <p>电子印章印章颜色(默认红色RED),RED-红色</p><p>系统目前只支持红色印章创建。</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>企业印章横向文字，最多可填15个汉字  (若超过印章最大宽度，优先压缩字间距，其次缩小字号)<br>横向文字的位置如下图中的&quot;印章横向文字在这里&quot;</p><p><img src="https://dyn.ess.tencent.cn/guide/capi/CreateSealByImage2.png" alt="image"></p> 
     * @return SealHorizontalText <p>企业印章横向文字，最多可填15个汉字  (若超过印章最大宽度，优先压缩字间距，其次缩小字号)<br>横向文字的位置如下图中的&quot;印章横向文字在这里&quot;</p><p><img src="https://dyn.ess.tencent.cn/guide/capi/CreateSealByImage2.png" alt="image"></p>
     */
    public String getSealHorizontalText() {
        return this.SealHorizontalText;
    }

    /**
     * Set <p>企业印章横向文字，最多可填15个汉字  (若超过印章最大宽度，优先压缩字间距，其次缩小字号)<br>横向文字的位置如下图中的&quot;印章横向文字在这里&quot;</p><p><img src="https://dyn.ess.tencent.cn/guide/capi/CreateSealByImage2.png" alt="image"></p>
     * @param SealHorizontalText <p>企业印章横向文字，最多可填15个汉字  (若超过印章最大宽度，优先压缩字间距，其次缩小字号)<br>横向文字的位置如下图中的&quot;印章横向文字在这里&quot;</p><p><img src="https://dyn.ess.tencent.cn/guide/capi/CreateSealByImage2.png" alt="image"></p>
     */
    public void setSealHorizontalText(String SealHorizontalText) {
        this.SealHorizontalText = SealHorizontalText;
    }

    /**
     * Get <p>暂时不支持下弦文字设置</p> 
     * @return SealChordText <p>暂时不支持下弦文字设置</p>
     */
    public String getSealChordText() {
        return this.SealChordText;
    }

    /**
     * Set <p>暂时不支持下弦文字设置</p>
     * @param SealChordText <p>暂时不支持下弦文字设置</p>
     */
    public void setSealChordText(String SealChordText) {
        this.SealChordText = SealChordText;
    }

    /**
     * Get <p>系统生成的印章只支持：STAR</p> 
     * @return SealCentralType <p>系统生成的印章只支持：STAR</p>
     */
    public String getSealCentralType() {
        return this.SealCentralType;
    }

    /**
     * Set <p>系统生成的印章只支持：STAR</p>
     * @param SealCentralType <p>系统生成的印章只支持：STAR</p>
     */
    public void setSealCentralType(String SealCentralType) {
        this.SealCentralType = SealCentralType;
    }

    /**
     * Get <p>通过文件上传时，服务端生成的电子印章上传图片的token</p> 
     * @return FileToken <p>通过文件上传时，服务端生成的电子印章上传图片的token</p>
     */
    public String getFileToken() {
        return this.FileToken;
    }

    /**
     * Set <p>通过文件上传时，服务端生成的电子印章上传图片的token</p>
     * @param FileToken <p>通过文件上传时，服务端生成的电子印章上传图片的token</p>
     */
    public void setFileToken(String FileToken) {
        this.FileToken = FileToken;
    }

    /**
     * Get <p>印章样式, 可以选择的样式如下: </p><ul><li>**circle**:(默认)圆形印章</li><li>**ellipse**:椭圆印章</li></ul> 
     * @return SealStyle <p>印章样式, 可以选择的样式如下: </p><ul><li>**circle**:(默认)圆形印章</li><li>**ellipse**:椭圆印章</li></ul>
     */
    public String getSealStyle() {
        return this.SealStyle;
    }

    /**
     * Set <p>印章样式, 可以选择的样式如下: </p><ul><li>**circle**:(默认)圆形印章</li><li>**ellipse**:椭圆印章</li></ul>
     * @param SealStyle <p>印章样式, 可以选择的样式如下: </p><ul><li>**circle**:(默认)圆形印章</li><li>**ellipse**:椭圆印章</li></ul>
     */
    public void setSealStyle(String SealStyle) {
        this.SealStyle = SealStyle;
    }

    /**
     * Get <p>印章尺寸取值描述, 可以选择的尺寸如下: <ul><li> <strong>38_38</strong>: 圆形企业公章直径38mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>40_40</strong>: 圆形企业公章直径40mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>42_42</strong>（默认）: 圆形企业公章直径42mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>45_45</strong>: 圆形企业印章直径45mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>50_50</strong>: 圆形企业印章直径50mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>58_58</strong>: 圆形企业印章直径58mm, 当SealStyle是圆形的时候才有效</li>  <li> <strong>40_30</strong>: 椭圆形印章40mm x 30mm, 当SealStyle是椭圆的时候才有效</li> <li> <strong>45_30</strong>: 椭圆形印章45mm x 30mm, 当SealStyle是椭圆的时候才有效</li> </ul></p> 
     * @return SealSize <p>印章尺寸取值描述, 可以选择的尺寸如下: <ul><li> <strong>38_38</strong>: 圆形企业公章直径38mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>40_40</strong>: 圆形企业公章直径40mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>42_42</strong>（默认）: 圆形企业公章直径42mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>45_45</strong>: 圆形企业印章直径45mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>50_50</strong>: 圆形企业印章直径50mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>58_58</strong>: 圆形企业印章直径58mm, 当SealStyle是圆形的时候才有效</li>  <li> <strong>40_30</strong>: 椭圆形印章40mm x 30mm, 当SealStyle是椭圆的时候才有效</li> <li> <strong>45_30</strong>: 椭圆形印章45mm x 30mm, 当SealStyle是椭圆的时候才有效</li> </ul></p>
     */
    public String getSealSize() {
        return this.SealSize;
    }

    /**
     * Set <p>印章尺寸取值描述, 可以选择的尺寸如下: <ul><li> <strong>38_38</strong>: 圆形企业公章直径38mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>40_40</strong>: 圆形企业公章直径40mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>42_42</strong>（默认）: 圆形企业公章直径42mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>45_45</strong>: 圆形企业印章直径45mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>50_50</strong>: 圆形企业印章直径50mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>58_58</strong>: 圆形企业印章直径58mm, 当SealStyle是圆形的时候才有效</li>  <li> <strong>40_30</strong>: 椭圆形印章40mm x 30mm, 当SealStyle是椭圆的时候才有效</li> <li> <strong>45_30</strong>: 椭圆形印章45mm x 30mm, 当SealStyle是椭圆的时候才有效</li> </ul></p>
     * @param SealSize <p>印章尺寸取值描述, 可以选择的尺寸如下: <ul><li> <strong>38_38</strong>: 圆形企业公章直径38mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>40_40</strong>: 圆形企业公章直径40mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>42_42</strong>（默认）: 圆形企业公章直径42mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>45_45</strong>: 圆形企业印章直径45mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>50_50</strong>: 圆形企业印章直径50mm, 当SealStyle是圆形的时候才有效</li> <li> <strong>58_58</strong>: 圆形企业印章直径58mm, 当SealStyle是圆形的时候才有效</li>  <li> <strong>40_30</strong>: 椭圆形印章40mm x 30mm, 当SealStyle是椭圆的时候才有效</li> <li> <strong>45_30</strong>: 椭圆形印章45mm x 30mm, 当SealStyle是椭圆的时候才有效</li> </ul></p>
     */
    public void setSealSize(String SealSize) {
        this.SealSize = SealSize;
    }

    /**
     * Get <p>企业税号<br>注:</p><ul><li>1.印章类型SealType是INVOICE类型时，此参数才会生效</li><li>2.印章类型SealType是INVOICE类型，且该字段没有传入值或传入空时，会取该企业对应的统一社会信用代码作为默认的企业税号（<font color="red">如果是通过授权书授权方式认证的企业，此参数必传不能为空</font>）</li></ul> 
     * @return TaxIdentifyCode <p>企业税号<br>注:</p><ul><li>1.印章类型SealType是INVOICE类型时，此参数才会生效</li><li>2.印章类型SealType是INVOICE类型，且该字段没有传入值或传入空时，会取该企业对应的统一社会信用代码作为默认的企业税号（<font color="red">如果是通过授权书授权方式认证的企业，此参数必传不能为空</font>）</li></ul>
     */
    public String getTaxIdentifyCode() {
        return this.TaxIdentifyCode;
    }

    /**
     * Set <p>企业税号<br>注:</p><ul><li>1.印章类型SealType是INVOICE类型时，此参数才会生效</li><li>2.印章类型SealType是INVOICE类型，且该字段没有传入值或传入空时，会取该企业对应的统一社会信用代码作为默认的企业税号（<font color="red">如果是通过授权书授权方式认证的企业，此参数必传不能为空</font>）</li></ul>
     * @param TaxIdentifyCode <p>企业税号<br>注:</p><ul><li>1.印章类型SealType是INVOICE类型时，此参数才会生效</li><li>2.印章类型SealType是INVOICE类型，且该字段没有传入值或传入空时，会取该企业对应的统一社会信用代码作为默认的企业税号（<font color="red">如果是通过授权书授权方式认证的企业，此参数必传不能为空</font>）</li></ul>
     */
    public void setTaxIdentifyCode(String TaxIdentifyCode) {
        this.TaxIdentifyCode = TaxIdentifyCode;
    }

    /**
     * Get <p>印章描述内容</p> 
     * @return SealDescription <p>印章描述内容</p>
     */
    public String getSealDescription() {
        return this.SealDescription;
    }

    /**
     * Set <p>印章描述内容</p>
     * @param SealDescription <p>印章描述内容</p>
     */
    public void setSealDescription(String SealDescription) {
        this.SealDescription = SealDescription;
    }

    /**
     * Get <p>个性化配置字段，默认不传。</p> 
     * @return Options <p>个性化配置字段，默认不传。</p>
     */
    public Option [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>个性化配置字段，默认不传。</p>
     * @param Options <p>个性化配置字段，默认不传。</p>
     */
    public void setOptions(Option [] Options) {
        this.Options = Options;
    }

    public CreateSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealRequest(CreateSealRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.GenerateSource != null) {
            this.GenerateSource = new String(source.GenerateSource);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.SealHorizontalText != null) {
            this.SealHorizontalText = new String(source.SealHorizontalText);
        }
        if (source.SealChordText != null) {
            this.SealChordText = new String(source.SealChordText);
        }
        if (source.SealCentralType != null) {
            this.SealCentralType = new String(source.SealCentralType);
        }
        if (source.FileToken != null) {
            this.FileToken = new String(source.FileToken);
        }
        if (source.SealStyle != null) {
            this.SealStyle = new String(source.SealStyle);
        }
        if (source.SealSize != null) {
            this.SealSize = new String(source.SealSize);
        }
        if (source.TaxIdentifyCode != null) {
            this.TaxIdentifyCode = new String(source.TaxIdentifyCode);
        }
        if (source.SealDescription != null) {
            this.SealDescription = new String(source.SealDescription);
        }
        if (source.Options != null) {
            this.Options = new Option[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new Option(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "GenerateSource", this.GenerateSource);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "SealHorizontalText", this.SealHorizontalText);
        this.setParamSimple(map, prefix + "SealChordText", this.SealChordText);
        this.setParamSimple(map, prefix + "SealCentralType", this.SealCentralType);
        this.setParamSimple(map, prefix + "FileToken", this.FileToken);
        this.setParamSimple(map, prefix + "SealStyle", this.SealStyle);
        this.setParamSimple(map, prefix + "SealSize", this.SealSize);
        this.setParamSimple(map, prefix + "TaxIdentifyCode", this.TaxIdentifyCode);
        this.setParamSimple(map, prefix + "SealDescription", this.SealDescription);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

