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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveDocRequest extends AbstractModel {

    /**
    * <p>应用ID。应用ID 获取方法参看<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">如何获取   BotBizId</a><br>导入知识库文档时，该参数填入知识库 ID。</p>
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * <p>文件名，需要包含文件扩展名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文档支持下面类型<br>pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；<br>xlsx、xls、md、txt、csv、html，单个文件不超过20MB；</p><p>图片支持下面类型：<br>jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致</p>
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * <p>ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取</p>
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * <p>cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性<br>成功上传cos后，从返回头中获取</p><p>请注意：<br>cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档</p>
    */
    @SerializedName("CosHash")
    @Expose
    private String CosHash;

    /**
    * <p>文件大小</p>
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * <p>标签适用范围，1:全部，2:按条件。默认为1。</p>
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * <p>来源（0 从本地文档导入），默认值为0</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>自定义链接地址, IsRefer为true的时候，该值才有意义</p>
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
    * <p>标签引用</p>
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
    * <p>外部引用链接类型 0：系统链接 1：自定义链接<br>值为1时，WebUrl 字段不能为空，否则不生效。</p>
    */
    @SerializedName("ReferUrlType")
    @Expose
    private Long ReferUrlType;

    /**
    * <p>有效开始时间，unix秒级时间戳，默认为0</p>
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * <p>有效结束时间，unix秒级时间戳，默认为0代表永久有效</p>
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * <p>是否显示引用的文档来源(false不显示 true显示）默认false</p>
    */
    @SerializedName("IsRefer")
    @Expose
    private Boolean IsRefer;

    /**
    * <p>文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为2 <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板</p>
    */
    @SerializedName("Opt")
    @Expose
    private Long Opt;

    /**
    * <p>分类ID</p>
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * <p>是否可下载，IsRefer为true并且ReferUrlType为0时，该值才有意义</p>
    */
    @SerializedName("IsDownload")
    @Expose
    private Boolean IsDownload;

    /**
    * <p>重复文档处理方式，按顺序匹配第一个满足条件的方式处理</p>
    */
    @SerializedName("DuplicateFileHandles")
    @Expose
    private DuplicateFileHandle [] DuplicateFileHandles;

    /**
    * <p>自定义切分规则</p><p>请求参数为一个 <strong>JSON Object</strong>，具体格式可参见接口示例值。包含以下主要字段：</p><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>xlsx_splitter</code></td><td>Object</td><td><strong>Excel（xlsx）文件切分策略配置</strong>，仅当处理 Excel 文件时有效</td></tr><tr><td><code>common_splitter</code></td><td>Object</td><td><strong>通用文件（如 txt、pdf 等）切分策略配置</strong>，按页或按标签切分</td></tr><tr><td><code>table_style</code></td><td>String</td><td>表格内容的输出格式，如 HTML 或 Markdown</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88Excel-.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>xlsx_splitter</code>（Excel 切分策略）</h2><p>用于配置 <strong>表格文件的切分方式</strong>。<br><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;xlsx_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;header_interval&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">[</span><span class="hljs-number">1</span><span class="hljs-punctuation">,</span> <span class="hljs-number">2</span><span class="hljs-punctuation">]</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;content_start&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">10</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;split_row&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">2</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>header_interval</code></td><td>Array&lt;Number&gt;</td><td>表头所在的行区间，格式为 <code>[起始行, 结束行]</code>，<strong>行号从 1 开始计数</strong>。例如 <code>[1, 2]</code> 表示第 1~2 行为表头。</td></tr><tr><td><code>content_start</code></td><td>Number</td><td><strong>表格内容的起始行号（从 1 开始）</strong>。</td></tr><tr><td><code>split_row</code></td><td>Number</td><td><strong>切分行数</strong>。</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E9.80.9A.E7.94.A8.E6.96.87.E4.BB.B6.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>common_splitter</code>（通用文件切分策略）</h2><p>用于配置 <strong>非 Excel 文件（如 TXT、PDF、DOCX 等）的切分方式</strong>，支持两种策略：<strong>按页切分（page）</strong> 或 <strong>按标识符切分（tag）</strong>。</p><p><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;common_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;page&quot;</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;page_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>    <span class="hljs-attr">&quot;chunk_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">1000</span><span class="hljs-punctuation">,</span>    <span class="hljs-attr">&quot;chunk_overlap_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">100</span>  <span class="hljs-punctuation">}</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A2">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>splitter</code></td><td>String</td><td>切分策略类型，可选值为：<code>&quot;page&quot;</code>（按页切分） 或 <code>&quot;tag&quot;</code>（按标识符切分）。</td></tr><tr><td><code>page_splitter</code></td><td>Object</td><td><strong>按页切分的配置</strong>。</td></tr><tr><td><code>page_splitter.chunk_length</code></td><td>1000</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>page_splitter.chunk_overlap_length</code></td><td>100</td><td><strong>切片重叠长度</strong>。</td></tr><tr><td><code>tag_splitter</code></td><td>Object</td><td><strong>自定义切分配置</strong>。</td></tr><tr><td><code>tag_splitter.tag</code></td><td>Array&lt;String&gt;</td><td><strong>切分标识符</strong>。</td></tr><tr><td><code>tag_splitter.chunk_length</code></td><td>Number</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>tag_splitter.chunk_overlap_length</code></td><td>Number</td><td><strong>切块重叠长度</strong>。</td></tr></tbody></table><p>???? <strong>补充说明：</strong></p><ul><li><code>splitter</code> 字段的值可以是：<ul><li><code>&quot;page&quot;</code>：只使用按页切分逻辑，此时只需要关心 <code>page_splitter</code> 相关字段。</li><li><code>&quot;tag&quot;</code>：只使用按标识符（如分号、换行等）切分逻辑，此时关注 <code>tag_splitter</code>。</li></ul></li></ul><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E8.A1.A8.E6.A0.BC.E8.BE.93.E5.87.BA.E6.A0.B7.E5.BC.8F.EF.BC.89"><code>table_style</code>（表格输出样式）</h2><p>用于指定 <strong>表格类内容（比如从 Excel 或 CSV 中提取的表格）最终以何种格式返回</strong>，方便前端展示或后续处理。</p><p><strong>类型：String</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;table_style&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;md&quot;</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A3">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>table_style</code></td><td>String</td><td>指定表格内容的输出格式。可用值：<br>• <code>&quot;html&quot;</code>：以 HTML 表格形式返回，适合网页展示。<br>• <code>&quot;md&quot;</code>：以 Markdown 表格语法返回，适合文档或 Markdown 渲染环境。</td></tr></tbody></table>
    */
    @SerializedName("SplitRule")
    @Expose
    private String SplitRule;

    /**
    * <p>文档更新频率，默认值为0不更新</p>
    */
    @SerializedName("UpdatePeriodInfo")
    @Expose
    private UpdatePeriodInfo UpdatePeriodInfo;

    /**
    * <p>文档生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效<br>默认值：应用内默认知识库为2，共享知识库为4。</p>
    */
    @SerializedName("EnableScope")
    @Expose
    private Long EnableScope;

    /**
    * <p>文件url 文件的 FileUrl、CosUrl必须提供一个，如果都提供，只使用CosUrl</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * Get <p>应用ID。应用ID 获取方法参看<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">如何获取   BotBizId</a><br>导入知识库文档时，该参数填入知识库 ID。</p> 
     * @return BotBizId <p>应用ID。应用ID 获取方法参看<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">如何获取   BotBizId</a><br>导入知识库文档时，该参数填入知识库 ID。</p>
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set <p>应用ID。应用ID 获取方法参看<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">如何获取   BotBizId</a><br>导入知识库文档时，该参数填入知识库 ID。</p>
     * @param BotBizId <p>应用ID。应用ID 获取方法参看<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">如何获取   BotBizId</a><br>导入知识库文档时，该参数填入知识库 ID。</p>
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get <p>文件名，需要包含文件扩展名</p> 
     * @return FileName <p>文件名，需要包含文件扩展名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名，需要包含文件扩展名</p>
     * @param FileName <p>文件名，需要包含文件扩展名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文档支持下面类型<br>pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；<br>xlsx、xls、md、txt、csv、html，单个文件不超过20MB；</p><p>图片支持下面类型：<br>jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB</p> 
     * @return FileType <p>文档支持下面类型<br>pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；<br>xlsx、xls、md、txt、csv、html，单个文件不超过20MB；</p><p>图片支持下面类型：<br>jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文档支持下面类型<br>pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；<br>xlsx、xls、md、txt、csv、html，单个文件不超过20MB；</p><p>图片支持下面类型：<br>jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB</p>
     * @param FileType <p>文档支持下面类型<br>pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；<br>xlsx、xls、md、txt、csv、html，单个文件不超过20MB；</p><p>图片支持下面类型：<br>jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致</p> 
     * @return CosUrl <p>平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致</p>
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set <p>平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致</p>
     * @param CosUrl <p>平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致</p>
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get <p>ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取</p> 
     * @return ETag <p>ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取</p>
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set <p>ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取</p>
     * @param ETag <p>ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取</p>
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get <p>cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性<br>成功上传cos后，从返回头中获取</p><p>请注意：<br>cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档</p> 
     * @return CosHash <p>cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性<br>成功上传cos后，从返回头中获取</p><p>请注意：<br>cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档</p>
     */
    public String getCosHash() {
        return this.CosHash;
    }

    /**
     * Set <p>cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性<br>成功上传cos后，从返回头中获取</p><p>请注意：<br>cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档</p>
     * @param CosHash <p>cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性<br>成功上传cos后，从返回头中获取</p><p>请注意：<br>cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档</p>
     */
    public void setCosHash(String CosHash) {
        this.CosHash = CosHash;
    }

    /**
     * Get <p>文件大小</p> 
     * @return Size <p>文件大小</p>
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set <p>文件大小</p>
     * @param Size <p>文件大小</p>
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get <p>标签适用范围，1:全部，2:按条件。默认为1。</p> 
     * @return AttrRange <p>标签适用范围，1:全部，2:按条件。默认为1。</p>
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set <p>标签适用范围，1:全部，2:按条件。默认为1。</p>
     * @param AttrRange <p>标签适用范围，1:全部，2:按条件。默认为1。</p>
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get <p>来源（0 从本地文档导入），默认值为0</p> 
     * @return Source <p>来源（0 从本地文档导入），默认值为0</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源（0 从本地文档导入），默认值为0</p>
     * @param Source <p>来源（0 从本地文档导入），默认值为0</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>自定义链接地址, IsRefer为true的时候，该值才有意义</p> 
     * @return WebUrl <p>自定义链接地址, IsRefer为true的时候，该值才有意义</p>
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set <p>自定义链接地址, IsRefer为true的时候，该值才有意义</p>
     * @param WebUrl <p>自定义链接地址, IsRefer为true的时候，该值才有意义</p>
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
    }

    /**
     * Get <p>标签引用</p> 
     * @return AttrLabels <p>标签引用</p>
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set <p>标签引用</p>
     * @param AttrLabels <p>标签引用</p>
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get <p>外部引用链接类型 0：系统链接 1：自定义链接<br>值为1时，WebUrl 字段不能为空，否则不生效。</p> 
     * @return ReferUrlType <p>外部引用链接类型 0：系统链接 1：自定义链接<br>值为1时，WebUrl 字段不能为空，否则不生效。</p>
     */
    public Long getReferUrlType() {
        return this.ReferUrlType;
    }

    /**
     * Set <p>外部引用链接类型 0：系统链接 1：自定义链接<br>值为1时，WebUrl 字段不能为空，否则不生效。</p>
     * @param ReferUrlType <p>外部引用链接类型 0：系统链接 1：自定义链接<br>值为1时，WebUrl 字段不能为空，否则不生效。</p>
     */
    public void setReferUrlType(Long ReferUrlType) {
        this.ReferUrlType = ReferUrlType;
    }

    /**
     * Get <p>有效开始时间，unix秒级时间戳，默认为0</p> 
     * @return ExpireStart <p>有效开始时间，unix秒级时间戳，默认为0</p>
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set <p>有效开始时间，unix秒级时间戳，默认为0</p>
     * @param ExpireStart <p>有效开始时间，unix秒级时间戳，默认为0</p>
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get <p>有效结束时间，unix秒级时间戳，默认为0代表永久有效</p> 
     * @return ExpireEnd <p>有效结束时间，unix秒级时间戳，默认为0代表永久有效</p>
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set <p>有效结束时间，unix秒级时间戳，默认为0代表永久有效</p>
     * @param ExpireEnd <p>有效结束时间，unix秒级时间戳，默认为0代表永久有效</p>
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get <p>是否显示引用的文档来源(false不显示 true显示）默认false</p> 
     * @return IsRefer <p>是否显示引用的文档来源(false不显示 true显示）默认false</p>
     */
    public Boolean getIsRefer() {
        return this.IsRefer;
    }

    /**
     * Set <p>是否显示引用的文档来源(false不显示 true显示）默认false</p>
     * @param IsRefer <p>是否显示引用的文档来源(false不显示 true显示）默认false</p>
     */
    public void setIsRefer(Boolean IsRefer) {
        this.IsRefer = IsRefer;
    }

    /**
     * Get <p>文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为2 <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板</p> 
     * @return Opt <p>文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为2 <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板</p>
     */
    public Long getOpt() {
        return this.Opt;
    }

    /**
     * Set <p>文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为2 <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板</p>
     * @param Opt <p>文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为2 <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板</p>
     */
    public void setOpt(Long Opt) {
        this.Opt = Opt;
    }

    /**
     * Get <p>分类ID</p> 
     * @return CateBizId <p>分类ID</p>
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set <p>分类ID</p>
     * @param CateBizId <p>分类ID</p>
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get <p>是否可下载，IsRefer为true并且ReferUrlType为0时，该值才有意义</p> 
     * @return IsDownload <p>是否可下载，IsRefer为true并且ReferUrlType为0时，该值才有意义</p>
     */
    public Boolean getIsDownload() {
        return this.IsDownload;
    }

    /**
     * Set <p>是否可下载，IsRefer为true并且ReferUrlType为0时，该值才有意义</p>
     * @param IsDownload <p>是否可下载，IsRefer为true并且ReferUrlType为0时，该值才有意义</p>
     */
    public void setIsDownload(Boolean IsDownload) {
        this.IsDownload = IsDownload;
    }

    /**
     * Get <p>重复文档处理方式，按顺序匹配第一个满足条件的方式处理</p> 
     * @return DuplicateFileHandles <p>重复文档处理方式，按顺序匹配第一个满足条件的方式处理</p>
     */
    public DuplicateFileHandle [] getDuplicateFileHandles() {
        return this.DuplicateFileHandles;
    }

    /**
     * Set <p>重复文档处理方式，按顺序匹配第一个满足条件的方式处理</p>
     * @param DuplicateFileHandles <p>重复文档处理方式，按顺序匹配第一个满足条件的方式处理</p>
     */
    public void setDuplicateFileHandles(DuplicateFileHandle [] DuplicateFileHandles) {
        this.DuplicateFileHandles = DuplicateFileHandles;
    }

    /**
     * Get <p>自定义切分规则</p><p>请求参数为一个 <strong>JSON Object</strong>，具体格式可参见接口示例值。包含以下主要字段：</p><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>xlsx_splitter</code></td><td>Object</td><td><strong>Excel（xlsx）文件切分策略配置</strong>，仅当处理 Excel 文件时有效</td></tr><tr><td><code>common_splitter</code></td><td>Object</td><td><strong>通用文件（如 txt、pdf 等）切分策略配置</strong>，按页或按标签切分</td></tr><tr><td><code>table_style</code></td><td>String</td><td>表格内容的输出格式，如 HTML 或 Markdown</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88Excel-.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>xlsx_splitter</code>（Excel 切分策略）</h2><p>用于配置 <strong>表格文件的切分方式</strong>。<br><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;xlsx_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;header_interval&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">[</span><span class="hljs-number">1</span><span class="hljs-punctuation">,</span> <span class="hljs-number">2</span><span class="hljs-punctuation">]</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;content_start&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">10</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;split_row&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">2</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>header_interval</code></td><td>Array&lt;Number&gt;</td><td>表头所在的行区间，格式为 <code>[起始行, 结束行]</code>，<strong>行号从 1 开始计数</strong>。例如 <code>[1, 2]</code> 表示第 1~2 行为表头。</td></tr><tr><td><code>content_start</code></td><td>Number</td><td><strong>表格内容的起始行号（从 1 开始）</strong>。</td></tr><tr><td><code>split_row</code></td><td>Number</td><td><strong>切分行数</strong>。</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E9.80.9A.E7.94.A8.E6.96.87.E4.BB.B6.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>common_splitter</code>（通用文件切分策略）</h2><p>用于配置 <strong>非 Excel 文件（如 TXT、PDF、DOCX 等）的切分方式</strong>，支持两种策略：<strong>按页切分（page）</strong> 或 <strong>按标识符切分（tag）</strong>。</p><p><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;common_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;page&quot;</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;page_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>    <span class="hljs-attr">&quot;chunk_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">1000</span><span class="hljs-punctuation">,</span>    <span class="hljs-attr">&quot;chunk_overlap_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">100</span>  <span class="hljs-punctuation">}</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A2">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>splitter</code></td><td>String</td><td>切分策略类型，可选值为：<code>&quot;page&quot;</code>（按页切分） 或 <code>&quot;tag&quot;</code>（按标识符切分）。</td></tr><tr><td><code>page_splitter</code></td><td>Object</td><td><strong>按页切分的配置</strong>。</td></tr><tr><td><code>page_splitter.chunk_length</code></td><td>1000</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>page_splitter.chunk_overlap_length</code></td><td>100</td><td><strong>切片重叠长度</strong>。</td></tr><tr><td><code>tag_splitter</code></td><td>Object</td><td><strong>自定义切分配置</strong>。</td></tr><tr><td><code>tag_splitter.tag</code></td><td>Array&lt;String&gt;</td><td><strong>切分标识符</strong>。</td></tr><tr><td><code>tag_splitter.chunk_length</code></td><td>Number</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>tag_splitter.chunk_overlap_length</code></td><td>Number</td><td><strong>切块重叠长度</strong>。</td></tr></tbody></table><p>???? <strong>补充说明：</strong></p><ul><li><code>splitter</code> 字段的值可以是：<ul><li><code>&quot;page&quot;</code>：只使用按页切分逻辑，此时只需要关心 <code>page_splitter</code> 相关字段。</li><li><code>&quot;tag&quot;</code>：只使用按标识符（如分号、换行等）切分逻辑，此时关注 <code>tag_splitter</code>。</li></ul></li></ul><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E8.A1.A8.E6.A0.BC.E8.BE.93.E5.87.BA.E6.A0.B7.E5.BC.8F.EF.BC.89"><code>table_style</code>（表格输出样式）</h2><p>用于指定 <strong>表格类内容（比如从 Excel 或 CSV 中提取的表格）最终以何种格式返回</strong>，方便前端展示或后续处理。</p><p><strong>类型：String</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;table_style&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;md&quot;</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A3">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>table_style</code></td><td>String</td><td>指定表格内容的输出格式。可用值：<br>• <code>&quot;html&quot;</code>：以 HTML 表格形式返回，适合网页展示。<br>• <code>&quot;md&quot;</code>：以 Markdown 表格语法返回，适合文档或 Markdown 渲染环境。</td></tr></tbody></table> 
     * @return SplitRule <p>自定义切分规则</p><p>请求参数为一个 <strong>JSON Object</strong>，具体格式可参见接口示例值。包含以下主要字段：</p><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>xlsx_splitter</code></td><td>Object</td><td><strong>Excel（xlsx）文件切分策略配置</strong>，仅当处理 Excel 文件时有效</td></tr><tr><td><code>common_splitter</code></td><td>Object</td><td><strong>通用文件（如 txt、pdf 等）切分策略配置</strong>，按页或按标签切分</td></tr><tr><td><code>table_style</code></td><td>String</td><td>表格内容的输出格式，如 HTML 或 Markdown</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88Excel-.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>xlsx_splitter</code>（Excel 切分策略）</h2><p>用于配置 <strong>表格文件的切分方式</strong>。<br><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;xlsx_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;header_interval&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">[</span><span class="hljs-number">1</span><span class="hljs-punctuation">,</span> <span class="hljs-number">2</span><span class="hljs-punctuation">]</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;content_start&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">10</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;split_row&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">2</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>header_interval</code></td><td>Array&lt;Number&gt;</td><td>表头所在的行区间，格式为 <code>[起始行, 结束行]</code>，<strong>行号从 1 开始计数</strong>。例如 <code>[1, 2]</code> 表示第 1~2 行为表头。</td></tr><tr><td><code>content_start</code></td><td>Number</td><td><strong>表格内容的起始行号（从 1 开始）</strong>。</td></tr><tr><td><code>split_row</code></td><td>Number</td><td><strong>切分行数</strong>。</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E9.80.9A.E7.94.A8.E6.96.87.E4.BB.B6.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>common_splitter</code>（通用文件切分策略）</h2><p>用于配置 <strong>非 Excel 文件（如 TXT、PDF、DOCX 等）的切分方式</strong>，支持两种策略：<strong>按页切分（page）</strong> 或 <strong>按标识符切分（tag）</strong>。</p><p><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;common_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;page&quot;</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;page_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>    <span class="hljs-attr">&quot;chunk_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">1000</span><span class="hljs-punctuation">,</span>    <span class="hljs-attr">&quot;chunk_overlap_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">100</span>  <span class="hljs-punctuation">}</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A2">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>splitter</code></td><td>String</td><td>切分策略类型，可选值为：<code>&quot;page&quot;</code>（按页切分） 或 <code>&quot;tag&quot;</code>（按标识符切分）。</td></tr><tr><td><code>page_splitter</code></td><td>Object</td><td><strong>按页切分的配置</strong>。</td></tr><tr><td><code>page_splitter.chunk_length</code></td><td>1000</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>page_splitter.chunk_overlap_length</code></td><td>100</td><td><strong>切片重叠长度</strong>。</td></tr><tr><td><code>tag_splitter</code></td><td>Object</td><td><strong>自定义切分配置</strong>。</td></tr><tr><td><code>tag_splitter.tag</code></td><td>Array&lt;String&gt;</td><td><strong>切分标识符</strong>。</td></tr><tr><td><code>tag_splitter.chunk_length</code></td><td>Number</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>tag_splitter.chunk_overlap_length</code></td><td>Number</td><td><strong>切块重叠长度</strong>。</td></tr></tbody></table><p>???? <strong>补充说明：</strong></p><ul><li><code>splitter</code> 字段的值可以是：<ul><li><code>&quot;page&quot;</code>：只使用按页切分逻辑，此时只需要关心 <code>page_splitter</code> 相关字段。</li><li><code>&quot;tag&quot;</code>：只使用按标识符（如分号、换行等）切分逻辑，此时关注 <code>tag_splitter</code>。</li></ul></li></ul><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E8.A1.A8.E6.A0.BC.E8.BE.93.E5.87.BA.E6.A0.B7.E5.BC.8F.EF.BC.89"><code>table_style</code>（表格输出样式）</h2><p>用于指定 <strong>表格类内容（比如从 Excel 或 CSV 中提取的表格）最终以何种格式返回</strong>，方便前端展示或后续处理。</p><p><strong>类型：String</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;table_style&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;md&quot;</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A3">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>table_style</code></td><td>String</td><td>指定表格内容的输出格式。可用值：<br>• <code>&quot;html&quot;</code>：以 HTML 表格形式返回，适合网页展示。<br>• <code>&quot;md&quot;</code>：以 Markdown 表格语法返回，适合文档或 Markdown 渲染环境。</td></tr></tbody></table>
     */
    public String getSplitRule() {
        return this.SplitRule;
    }

    /**
     * Set <p>自定义切分规则</p><p>请求参数为一个 <strong>JSON Object</strong>，具体格式可参见接口示例值。包含以下主要字段：</p><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>xlsx_splitter</code></td><td>Object</td><td><strong>Excel（xlsx）文件切分策略配置</strong>，仅当处理 Excel 文件时有效</td></tr><tr><td><code>common_splitter</code></td><td>Object</td><td><strong>通用文件（如 txt、pdf 等）切分策略配置</strong>，按页或按标签切分</td></tr><tr><td><code>table_style</code></td><td>String</td><td>表格内容的输出格式，如 HTML 或 Markdown</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88Excel-.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>xlsx_splitter</code>（Excel 切分策略）</h2><p>用于配置 <strong>表格文件的切分方式</strong>。<br><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;xlsx_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;header_interval&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">[</span><span class="hljs-number">1</span><span class="hljs-punctuation">,</span> <span class="hljs-number">2</span><span class="hljs-punctuation">]</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;content_start&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">10</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;split_row&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">2</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>header_interval</code></td><td>Array&lt;Number&gt;</td><td>表头所在的行区间，格式为 <code>[起始行, 结束行]</code>，<strong>行号从 1 开始计数</strong>。例如 <code>[1, 2]</code> 表示第 1~2 行为表头。</td></tr><tr><td><code>content_start</code></td><td>Number</td><td><strong>表格内容的起始行号（从 1 开始）</strong>。</td></tr><tr><td><code>split_row</code></td><td>Number</td><td><strong>切分行数</strong>。</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E9.80.9A.E7.94.A8.E6.96.87.E4.BB.B6.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>common_splitter</code>（通用文件切分策略）</h2><p>用于配置 <strong>非 Excel 文件（如 TXT、PDF、DOCX 等）的切分方式</strong>，支持两种策略：<strong>按页切分（page）</strong> 或 <strong>按标识符切分（tag）</strong>。</p><p><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;common_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;page&quot;</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;page_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>    <span class="hljs-attr">&quot;chunk_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">1000</span><span class="hljs-punctuation">,</span>    <span class="hljs-attr">&quot;chunk_overlap_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">100</span>  <span class="hljs-punctuation">}</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A2">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>splitter</code></td><td>String</td><td>切分策略类型，可选值为：<code>&quot;page&quot;</code>（按页切分） 或 <code>&quot;tag&quot;</code>（按标识符切分）。</td></tr><tr><td><code>page_splitter</code></td><td>Object</td><td><strong>按页切分的配置</strong>。</td></tr><tr><td><code>page_splitter.chunk_length</code></td><td>1000</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>page_splitter.chunk_overlap_length</code></td><td>100</td><td><strong>切片重叠长度</strong>。</td></tr><tr><td><code>tag_splitter</code></td><td>Object</td><td><strong>自定义切分配置</strong>。</td></tr><tr><td><code>tag_splitter.tag</code></td><td>Array&lt;String&gt;</td><td><strong>切分标识符</strong>。</td></tr><tr><td><code>tag_splitter.chunk_length</code></td><td>Number</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>tag_splitter.chunk_overlap_length</code></td><td>Number</td><td><strong>切块重叠长度</strong>。</td></tr></tbody></table><p>???? <strong>补充说明：</strong></p><ul><li><code>splitter</code> 字段的值可以是：<ul><li><code>&quot;page&quot;</code>：只使用按页切分逻辑，此时只需要关心 <code>page_splitter</code> 相关字段。</li><li><code>&quot;tag&quot;</code>：只使用按标识符（如分号、换行等）切分逻辑，此时关注 <code>tag_splitter</code>。</li></ul></li></ul><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E8.A1.A8.E6.A0.BC.E8.BE.93.E5.87.BA.E6.A0.B7.E5.BC.8F.EF.BC.89"><code>table_style</code>（表格输出样式）</h2><p>用于指定 <strong>表格类内容（比如从 Excel 或 CSV 中提取的表格）最终以何种格式返回</strong>，方便前端展示或后续处理。</p><p><strong>类型：String</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;table_style&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;md&quot;</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A3">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>table_style</code></td><td>String</td><td>指定表格内容的输出格式。可用值：<br>• <code>&quot;html&quot;</code>：以 HTML 表格形式返回，适合网页展示。<br>• <code>&quot;md&quot;</code>：以 Markdown 表格语法返回，适合文档或 Markdown 渲染环境。</td></tr></tbody></table>
     * @param SplitRule <p>自定义切分规则</p><p>请求参数为一个 <strong>JSON Object</strong>，具体格式可参见接口示例值。包含以下主要字段：</p><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>xlsx_splitter</code></td><td>Object</td><td><strong>Excel（xlsx）文件切分策略配置</strong>，仅当处理 Excel 文件时有效</td></tr><tr><td><code>common_splitter</code></td><td>Object</td><td><strong>通用文件（如 txt、pdf 等）切分策略配置</strong>，按页或按标签切分</td></tr><tr><td><code>table_style</code></td><td>String</td><td>表格内容的输出格式，如 HTML 或 Markdown</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88Excel-.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>xlsx_splitter</code>（Excel 切分策略）</h2><p>用于配置 <strong>表格文件的切分方式</strong>。<br><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;xlsx_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;header_interval&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">[</span><span class="hljs-number">1</span><span class="hljs-punctuation">,</span> <span class="hljs-number">2</span><span class="hljs-punctuation">]</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;content_start&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">10</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;split_row&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">2</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>header_interval</code></td><td>Array&lt;Number&gt;</td><td>表头所在的行区间，格式为 <code>[起始行, 结束行]</code>，<strong>行号从 1 开始计数</strong>。例如 <code>[1, 2]</code> 表示第 1~2 行为表头。</td></tr><tr><td><code>content_start</code></td><td>Number</td><td><strong>表格内容的起始行号（从 1 开始）</strong>。</td></tr><tr><td><code>split_row</code></td><td>Number</td><td><strong>切分行数</strong>。</td></tr></tbody></table><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E9.80.9A.E7.94.A8.E6.96.87.E4.BB.B6.E5.88.87.E5.88.86.E7.AD.96.E7.95.A5.EF.BC.89"><code>common_splitter</code>（通用文件切分策略）</h2><p>用于配置 <strong>非 Excel 文件（如 TXT、PDF、DOCX 等）的切分方式</strong>，支持两种策略：<strong>按页切分（page）</strong> 或 <strong>按标识符切分（tag）</strong>。</p><p><strong>类型：Object</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;common_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>  <span class="hljs-attr">&quot;splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;page&quot;</span><span class="hljs-punctuation">,</span>  <span class="hljs-attr">&quot;page_splitter&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-punctuation">{</span>    <span class="hljs-attr">&quot;chunk_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">1000</span><span class="hljs-punctuation">,</span>    <span class="hljs-attr">&quot;chunk_overlap_length&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-number">100</span>  <span class="hljs-punctuation">}</span><span class="hljs-punctuation">}</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A2">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>splitter</code></td><td>String</td><td>切分策略类型，可选值为：<code>&quot;page&quot;</code>（按页切分） 或 <code>&quot;tag&quot;</code>（按标识符切分）。</td></tr><tr><td><code>page_splitter</code></td><td>Object</td><td><strong>按页切分的配置</strong>。</td></tr><tr><td><code>page_splitter.chunk_length</code></td><td>1000</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>page_splitter.chunk_overlap_length</code></td><td>100</td><td><strong>切片重叠长度</strong>。</td></tr><tr><td><code>tag_splitter</code></td><td>Object</td><td><strong>自定义切分配置</strong>。</td></tr><tr><td><code>tag_splitter.tag</code></td><td>Array&lt;String&gt;</td><td><strong>切分标识符</strong>。</td></tr><tr><td><code>tag_splitter.chunk_length</code></td><td>Number</td><td><strong>切片最大长度</strong>。</td></tr><tr><td><code>tag_splitter.chunk_overlap_length</code></td><td>Number</td><td><strong>切块重叠长度</strong>。</td></tr></tbody></table><p>???? <strong>补充说明：</strong></p><ul><li><code>splitter</code> 字段的值可以是：<ul><li><code>&quot;page&quot;</code>：只使用按页切分逻辑，此时只需要关心 <code>page_splitter</code> 相关字段。</li><li><code>&quot;tag&quot;</code>：只使用按标识符（如分号、换行等）切分逻辑，此时关注 <code>tag_splitter</code>。</li></ul></li></ul><hr><h2 id=".3Cdx-inline-code-holder.3E.3C.2Fdx-inline-code-holder.3E.EF.BC.88.E8.A1.A8.E6.A0.BC.E8.BE.93.E5.87.BA.E6.A0.B7.E5.BC.8F.EF.BC.89"><code>table_style</code>（表格输出样式）</h2><p>用于指定 <strong>表格类内容（比如从 Excel 或 CSV 中提取的表格）最终以何种格式返回</strong>，方便前端展示或后续处理。</p><p><strong>类型：String</strong></p><p><pre><code class="language-json"><span class="hljs-attr">&quot;table_style&quot;</span><span class="hljs-punctuation">:</span> <span class="hljs-string">&quot;md&quot;</span></code></pre></p><h3 id=".E5.AD.97.E6.AE.B5.E8.AF.B4.E6.98.8E.EF.BC.9A3">字段说明：</h3><table><thead><tr><th>字段名</th><th>类型</th><th>说明</th></tr></thead><tbody><tr><td><code>table_style</code></td><td>String</td><td>指定表格内容的输出格式。可用值：<br>• <code>&quot;html&quot;</code>：以 HTML 表格形式返回，适合网页展示。<br>• <code>&quot;md&quot;</code>：以 Markdown 表格语法返回，适合文档或 Markdown 渲染环境。</td></tr></tbody></table>
     */
    public void setSplitRule(String SplitRule) {
        this.SplitRule = SplitRule;
    }

    /**
     * Get <p>文档更新频率，默认值为0不更新</p> 
     * @return UpdatePeriodInfo <p>文档更新频率，默认值为0不更新</p>
     */
    public UpdatePeriodInfo getUpdatePeriodInfo() {
        return this.UpdatePeriodInfo;
    }

    /**
     * Set <p>文档更新频率，默认值为0不更新</p>
     * @param UpdatePeriodInfo <p>文档更新频率，默认值为0不更新</p>
     */
    public void setUpdatePeriodInfo(UpdatePeriodInfo UpdatePeriodInfo) {
        this.UpdatePeriodInfo = UpdatePeriodInfo;
    }

    /**
     * Get <p>文档生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效<br>默认值：应用内默认知识库为2，共享知识库为4。</p> 
     * @return EnableScope <p>文档生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效<br>默认值：应用内默认知识库为2，共享知识库为4。</p>
     */
    public Long getEnableScope() {
        return this.EnableScope;
    }

    /**
     * Set <p>文档生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效<br>默认值：应用内默认知识库为2，共享知识库为4。</p>
     * @param EnableScope <p>文档生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效<br>默认值：应用内默认知识库为2，共享知识库为4。</p>
     */
    public void setEnableScope(Long EnableScope) {
        this.EnableScope = EnableScope;
    }

    /**
     * Get <p>文件url 文件的 FileUrl、CosUrl必须提供一个，如果都提供，只使用CosUrl</p> 
     * @return FileUrl <p>文件url 文件的 FileUrl、CosUrl必须提供一个，如果都提供，只使用CosUrl</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件url 文件的 FileUrl、CosUrl必须提供一个，如果都提供，只使用CosUrl</p>
     * @param FileUrl <p>文件url 文件的 FileUrl、CosUrl必须提供一个，如果都提供，只使用CosUrl</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    public SaveDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveDocRequest(SaveDocRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.ETag != null) {
            this.ETag = new String(source.ETag);
        }
        if (source.CosHash != null) {
            this.CosHash = new String(source.CosHash);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabelRefer[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabelRefer(source.AttrLabels[i]);
            }
        }
        if (source.ReferUrlType != null) {
            this.ReferUrlType = new Long(source.ReferUrlType);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.IsRefer != null) {
            this.IsRefer = new Boolean(source.IsRefer);
        }
        if (source.Opt != null) {
            this.Opt = new Long(source.Opt);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.IsDownload != null) {
            this.IsDownload = new Boolean(source.IsDownload);
        }
        if (source.DuplicateFileHandles != null) {
            this.DuplicateFileHandles = new DuplicateFileHandle[source.DuplicateFileHandles.length];
            for (int i = 0; i < source.DuplicateFileHandles.length; i++) {
                this.DuplicateFileHandles[i] = new DuplicateFileHandle(source.DuplicateFileHandles[i]);
            }
        }
        if (source.SplitRule != null) {
            this.SplitRule = new String(source.SplitRule);
        }
        if (source.UpdatePeriodInfo != null) {
            this.UpdatePeriodInfo = new UpdatePeriodInfo(source.UpdatePeriodInfo);
        }
        if (source.EnableScope != null) {
            this.EnableScope = new Long(source.EnableScope);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "ETag", this.ETag);
        this.setParamSimple(map, prefix + "CosHash", this.CosHash);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "ReferUrlType", this.ReferUrlType);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamSimple(map, prefix + "IsRefer", this.IsRefer);
        this.setParamSimple(map, prefix + "Opt", this.Opt);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "IsDownload", this.IsDownload);
        this.setParamArrayObj(map, prefix + "DuplicateFileHandles.", this.DuplicateFileHandles);
        this.setParamSimple(map, prefix + "SplitRule", this.SplitRule);
        this.setParamObj(map, prefix + "UpdatePeriodInfo.", this.UpdatePeriodInfo);
        this.setParamSimple(map, prefix + "EnableScope", this.EnableScope);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

