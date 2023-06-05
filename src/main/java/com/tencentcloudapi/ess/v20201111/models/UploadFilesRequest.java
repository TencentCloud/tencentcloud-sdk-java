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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFilesRequest extends AbstractModel{

    /**
    * 文件对应业务类型
1. TEMPLATE - 模板； 文件类型：.pdf/.doc/.docx/.html
2. DOCUMENT - 签署过程及签署后的合同文档/图片控件 文件类型：.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html
3. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 调用方信息，其中OperatorId为必填字段，即用户的UserId
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 上传文件内容数组，最多支持20个文件
    */
    @SerializedName("FileInfos")
    @Expose
    private UploadFile [] FileInfos;

    /**
    * 文件类型， 默认通过文件内容解析得到文件类型，客户可以显示的说明上传文件的类型。
如：PDF 表示上传的文件 xxx.pdf的文件类型是 PDF
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 此参数只对 PDF 文件有效。是否将pdf灰色矩阵置白
true--是，处理置白
默认为false--否，不处理
    */
    @SerializedName("CoverRect")
    @Expose
    private Boolean CoverRect;

    /**
    * 用户自定义ID数组，与上传文件一一对应
    */
    @SerializedName("CustomIds")
    @Expose
    private String [] CustomIds;

    /**
    * 不再使用，上传文件链接数组，最多支持20个URL
    */
    @SerializedName("FileUrls")
    @Expose
    private String FileUrls;

    /**
     * Get 文件对应业务类型
1. TEMPLATE - 模板； 文件类型：.pdf/.doc/.docx/.html
2. DOCUMENT - 签署过程及签署后的合同文档/图片控件 文件类型：.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html
3. SEAL - 印章； 文件类型：.jpg/.jpeg/.png 
     * @return BusinessType 文件对应业务类型
1. TEMPLATE - 模板； 文件类型：.pdf/.doc/.docx/.html
2. DOCUMENT - 签署过程及签署后的合同文档/图片控件 文件类型：.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html
3. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 文件对应业务类型
1. TEMPLATE - 模板； 文件类型：.pdf/.doc/.docx/.html
2. DOCUMENT - 签署过程及签署后的合同文档/图片控件 文件类型：.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html
3. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
     * @param BusinessType 文件对应业务类型
1. TEMPLATE - 模板； 文件类型：.pdf/.doc/.docx/.html
2. DOCUMENT - 签署过程及签署后的合同文档/图片控件 文件类型：.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html
3. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 调用方信息，其中OperatorId为必填字段，即用户的UserId 
     * @return Caller 调用方信息，其中OperatorId为必填字段，即用户的UserId
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息，其中OperatorId为必填字段，即用户的UserId
     * @param Caller 调用方信息，其中OperatorId为必填字段，即用户的UserId
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 上传文件内容数组，最多支持20个文件 
     * @return FileInfos 上传文件内容数组，最多支持20个文件
     */
    public UploadFile [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 上传文件内容数组，最多支持20个文件
     * @param FileInfos 上传文件内容数组，最多支持20个文件
     */
    public void setFileInfos(UploadFile [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 文件类型， 默认通过文件内容解析得到文件类型，客户可以显示的说明上传文件的类型。
如：PDF 表示上传的文件 xxx.pdf的文件类型是 PDF 
     * @return FileType 文件类型， 默认通过文件内容解析得到文件类型，客户可以显示的说明上传文件的类型。
如：PDF 表示上传的文件 xxx.pdf的文件类型是 PDF
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型， 默认通过文件内容解析得到文件类型，客户可以显示的说明上传文件的类型。
如：PDF 表示上传的文件 xxx.pdf的文件类型是 PDF
     * @param FileType 文件类型， 默认通过文件内容解析得到文件类型，客户可以显示的说明上传文件的类型。
如：PDF 表示上传的文件 xxx.pdf的文件类型是 PDF
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 此参数只对 PDF 文件有效。是否将pdf灰色矩阵置白
true--是，处理置白
默认为false--否，不处理 
     * @return CoverRect 此参数只对 PDF 文件有效。是否将pdf灰色矩阵置白
true--是，处理置白
默认为false--否，不处理
     */
    public Boolean getCoverRect() {
        return this.CoverRect;
    }

    /**
     * Set 此参数只对 PDF 文件有效。是否将pdf灰色矩阵置白
true--是，处理置白
默认为false--否，不处理
     * @param CoverRect 此参数只对 PDF 文件有效。是否将pdf灰色矩阵置白
true--是，处理置白
默认为false--否，不处理
     */
    public void setCoverRect(Boolean CoverRect) {
        this.CoverRect = CoverRect;
    }

    /**
     * Get 用户自定义ID数组，与上传文件一一对应 
     * @return CustomIds 用户自定义ID数组，与上传文件一一对应
     */
    public String [] getCustomIds() {
        return this.CustomIds;
    }

    /**
     * Set 用户自定义ID数组，与上传文件一一对应
     * @param CustomIds 用户自定义ID数组，与上传文件一一对应
     */
    public void setCustomIds(String [] CustomIds) {
        this.CustomIds = CustomIds;
    }

    /**
     * Get 不再使用，上传文件链接数组，最多支持20个URL 
     * @return FileUrls 不再使用，上传文件链接数组，最多支持20个URL
     * @deprecated
     */
    @Deprecated
    public String getFileUrls() {
        return this.FileUrls;
    }

    /**
     * Set 不再使用，上传文件链接数组，最多支持20个URL
     * @param FileUrls 不再使用，上传文件链接数组，最多支持20个URL
     * @deprecated
     */
    @Deprecated
    public void setFileUrls(String FileUrls) {
        this.FileUrls = FileUrls;
    }

    public UploadFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesRequest(UploadFilesRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new UploadFile[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new UploadFile(source.FileInfos[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CoverRect != null) {
            this.CoverRect = new Boolean(source.CoverRect);
        }
        if (source.CustomIds != null) {
            this.CustomIds = new String[source.CustomIds.length];
            for (int i = 0; i < source.CustomIds.length; i++) {
                this.CustomIds[i] = new String(source.CustomIds[i]);
            }
        }
        if (source.FileUrls != null) {
            this.FileUrls = new String(source.FileUrls);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CoverRect", this.CoverRect);
        this.setParamArraySimple(map, prefix + "CustomIds.", this.CustomIds);
        this.setParamSimple(map, prefix + "FileUrls", this.FileUrls);

    }
}

