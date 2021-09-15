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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFilesRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 文件对应业务类型，用于区分文件存储路径：
1. TEMPLATE - 模版； 文件类型：.pdf/.html
2. DOCUMENT - 签署过程及签署后的合同文档 文件类型：.pdf/.html
3. FLOW - 签署过程 文件类型：.pdf/.html
4. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
5. BUSINESSLICENSE - 营业执照 文件类型：.jpg/.jpeg/.png
6. IDCARD - 身份证 文件类型：.jpg/.jpeg/.png
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 上传文件内容数组，最多支持20个文件
    */
    @SerializedName("FileInfos")
    @Expose
    private UploadFile [] FileInfos;

    /**
    * 上传文件链接数组，最多支持20个URL
    */
    @SerializedName("FileUrls")
    @Expose
    private String [] FileUrls;

    /**
    * 是否将pdf灰色矩阵置白
true--是，处理置白
false--否，不处理
    */
    @SerializedName("CoverRect")
    @Expose
    private Boolean CoverRect;

    /**
    * 特殊文件类型需要指定文件类型：
HTML-- .html文件
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 用户自定义ID数组，与上传文件一一对应
    */
    @SerializedName("CustomIds")
    @Expose
    private String [] CustomIds;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 文件对应业务类型，用于区分文件存储路径：
1. TEMPLATE - 模版； 文件类型：.pdf/.html
2. DOCUMENT - 签署过程及签署后的合同文档 文件类型：.pdf/.html
3. FLOW - 签署过程 文件类型：.pdf/.html
4. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
5. BUSINESSLICENSE - 营业执照 文件类型：.jpg/.jpeg/.png
6. IDCARD - 身份证 文件类型：.jpg/.jpeg/.png 
     * @return BusinessType 文件对应业务类型，用于区分文件存储路径：
1. TEMPLATE - 模版； 文件类型：.pdf/.html
2. DOCUMENT - 签署过程及签署后的合同文档 文件类型：.pdf/.html
3. FLOW - 签署过程 文件类型：.pdf/.html
4. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
5. BUSINESSLICENSE - 营业执照 文件类型：.jpg/.jpeg/.png
6. IDCARD - 身份证 文件类型：.jpg/.jpeg/.png
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 文件对应业务类型，用于区分文件存储路径：
1. TEMPLATE - 模版； 文件类型：.pdf/.html
2. DOCUMENT - 签署过程及签署后的合同文档 文件类型：.pdf/.html
3. FLOW - 签署过程 文件类型：.pdf/.html
4. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
5. BUSINESSLICENSE - 营业执照 文件类型：.jpg/.jpeg/.png
6. IDCARD - 身份证 文件类型：.jpg/.jpeg/.png
     * @param BusinessType 文件对应业务类型，用于区分文件存储路径：
1. TEMPLATE - 模版； 文件类型：.pdf/.html
2. DOCUMENT - 签署过程及签署后的合同文档 文件类型：.pdf/.html
3. FLOW - 签署过程 文件类型：.pdf/.html
4. SEAL - 印章； 文件类型：.jpg/.jpeg/.png
5. BUSINESSLICENSE - 营业执照 文件类型：.jpg/.jpeg/.png
6. IDCARD - 身份证 文件类型：.jpg/.jpeg/.png
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
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
     * Get 上传文件链接数组，最多支持20个URL 
     * @return FileUrls 上传文件链接数组，最多支持20个URL
     */
    public String [] getFileUrls() {
        return this.FileUrls;
    }

    /**
     * Set 上传文件链接数组，最多支持20个URL
     * @param FileUrls 上传文件链接数组，最多支持20个URL
     */
    public void setFileUrls(String [] FileUrls) {
        this.FileUrls = FileUrls;
    }

    /**
     * Get 是否将pdf灰色矩阵置白
true--是，处理置白
false--否，不处理 
     * @return CoverRect 是否将pdf灰色矩阵置白
true--是，处理置白
false--否，不处理
     */
    public Boolean getCoverRect() {
        return this.CoverRect;
    }

    /**
     * Set 是否将pdf灰色矩阵置白
true--是，处理置白
false--否，不处理
     * @param CoverRect 是否将pdf灰色矩阵置白
true--是，处理置白
false--否，不处理
     */
    public void setCoverRect(Boolean CoverRect) {
        this.CoverRect = CoverRect;
    }

    /**
     * Get 特殊文件类型需要指定文件类型：
HTML-- .html文件 
     * @return FileType 特殊文件类型需要指定文件类型：
HTML-- .html文件
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 特殊文件类型需要指定文件类型：
HTML-- .html文件
     * @param FileType 特殊文件类型需要指定文件类型：
HTML-- .html文件
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
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

    public UploadFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesRequest(UploadFilesRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new UploadFile[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new UploadFile(source.FileInfos[i]);
            }
        }
        if (source.FileUrls != null) {
            this.FileUrls = new String[source.FileUrls.length];
            for (int i = 0; i < source.FileUrls.length; i++) {
                this.FileUrls[i] = new String(source.FileUrls[i]);
            }
        }
        if (source.CoverRect != null) {
            this.CoverRect = new Boolean(source.CoverRect);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CustomIds != null) {
            this.CustomIds = new String[source.CustomIds.length];
            for (int i = 0; i < source.CustomIds.length; i++) {
                this.CustomIds[i] = new String(source.CustomIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArraySimple(map, prefix + "FileUrls.", this.FileUrls);
        this.setParamSimple(map, prefix + "CoverRect", this.CoverRect);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamArraySimple(map, prefix + "CustomIds.", this.CustomIds);

    }
}

