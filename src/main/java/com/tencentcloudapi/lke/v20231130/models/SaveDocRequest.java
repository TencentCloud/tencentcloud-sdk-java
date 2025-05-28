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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveDocRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文档支持下面类型
pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；
xlsx、xls、md、txt、csv、html，单个文件不超过20MB；

图片支持下面类型：
jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性  
成功上传cos后，从返回头中获取

请注意：
cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档
    */
    @SerializedName("CosHash")
    @Expose
    private String CosHash;

    /**
    * 文件大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 标签适用范围，需要传参为1
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * 来源（0 从本地文档导入），默认值为0
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 自定义链接地址, IsRefer为true的时候，该值才有意义
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
    * 标签引用
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
    * 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
    */
    @SerializedName("ReferUrlType")
    @Expose
    private Long ReferUrlType;

    /**
    * 有效开始时间，unix时间戳
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * 有效结束时间，unix时间戳，0代表永久有效
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * 是否引用链接
    */
    @SerializedName("IsRefer")
    @Expose
    private Boolean IsRefer;

    /**
    * 文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为1  <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板
    */
    @SerializedName("Opt")
    @Expose
    private Long Opt;

    /**
    * 分类ID
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文档支持下面类型
pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；
xlsx、xls、md、txt、csv、html，单个文件不超过20MB；

图片支持下面类型：
jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB 
     * @return FileType 文档支持下面类型
pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；
xlsx、xls、md、txt、csv、html，单个文件不超过20MB；

图片支持下面类型：
jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文档支持下面类型
pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；
xlsx、xls、md、txt、csv、html，单个文件不超过20MB；

图片支持下面类型：
jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB
     * @param FileType 文档支持下面类型
pdf、doc、docx、ppt、mhtml、pptx、wps、ppsx，单个文件不超过200MB；
xlsx、xls、md、txt、csv、html，单个文件不超过20MB；

图片支持下面类型：
jpg、png、jpeg、tiff、bmp、gif，单个文件不超过50MB
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致 
     * @return CosUrl 平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致
     * @param CosUrl 平台cos路径，与DescribeStorageCredential接口查询UploadPath参数保持一致
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取 
     * @return ETag ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取
     * @param ETag ETag 全称为 Entity Tag，是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化 成功上传cos后，从返回头中获取
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性  
成功上传cos后，从返回头中获取

请注意：
cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档 
     * @return CosHash cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性  
成功上传cos后，从返回头中获取

请注意：
cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档
     */
    public String getCosHash() {
        return this.CosHash;
    }

    /**
     * Set cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性  
成功上传cos后，从返回头中获取

请注意：
cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档
     * @param CosHash cos_hash x-cos-hash-crc64ecma 头部中的 CRC64编码进行校验上传到云端的文件和本地文件的一致性  
成功上传cos后，从返回头中获取

请注意：
cos_hash为文档唯一性标识，与文件名无关 相同的cos_hash会被判定为重复文档
     */
    public void setCosHash(String CosHash) {
        this.CosHash = CosHash;
    }

    /**
     * Get 文件大小 
     * @return Size 文件大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
     * @param Size 文件大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 标签适用范围，需要传参为1 
     * @return AttrRange 标签适用范围，需要传参为1
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set 标签适用范围，需要传参为1
     * @param AttrRange 标签适用范围，需要传参为1
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get 来源（0 从本地文档导入），默认值为0 
     * @return Source 来源（0 从本地文档导入），默认值为0
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源（0 从本地文档导入），默认值为0
     * @param Source 来源（0 从本地文档导入），默认值为0
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 自定义链接地址, IsRefer为true的时候，该值才有意义 
     * @return WebUrl 自定义链接地址, IsRefer为true的时候，该值才有意义
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set 自定义链接地址, IsRefer为true的时候，该值才有意义
     * @param WebUrl 自定义链接地址, IsRefer为true的时候，该值才有意义
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
    }

    /**
     * Get 标签引用 
     * @return AttrLabels 标签引用
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set 标签引用
     * @param AttrLabels 标签引用
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。 
     * @return ReferUrlType 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
     */
    public Long getReferUrlType() {
        return this.ReferUrlType;
    }

    /**
     * Set 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
     * @param ReferUrlType 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
     */
    public void setReferUrlType(Long ReferUrlType) {
        this.ReferUrlType = ReferUrlType;
    }

    /**
     * Get 有效开始时间，unix时间戳 
     * @return ExpireStart 有效开始时间，unix时间戳
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set 有效开始时间，unix时间戳
     * @param ExpireStart 有效开始时间，unix时间戳
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get 有效结束时间，unix时间戳，0代表永久有效 
     * @return ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set 有效结束时间，unix时间戳，0代表永久有效
     * @param ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get 是否引用链接 
     * @return IsRefer 是否引用链接
     */
    public Boolean getIsRefer() {
        return this.IsRefer;
    }

    /**
     * Set 是否引用链接
     * @param IsRefer 是否引用链接
     */
    public void setIsRefer(Boolean IsRefer) {
        this.IsRefer = IsRefer;
    }

    /**
     * Get 文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为1  <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板 
     * @return Opt 文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为1  <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板
     */
    public Long getOpt() {
        return this.Opt;
    }

    /**
     * Set 文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为1  <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板
     * @param Opt 文档操作类型：1：批量导入（批量导入问答对）；2:文档导入（正常导入单个文档） 默认为1  <br> 请注意，opt=1的时候请从腾讯云智能体开发平台页面下载excel模板
     */
    public void setOpt(Long Opt) {
        this.Opt = Opt;
    }

    /**
     * Get 分类ID 
     * @return CateBizId 分类ID
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID
     * @param CateBizId 分类ID
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
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

    }
}

