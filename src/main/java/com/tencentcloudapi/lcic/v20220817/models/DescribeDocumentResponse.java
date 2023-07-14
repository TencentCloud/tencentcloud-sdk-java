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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDocumentResponse extends AbstractModel{

    /**
    * 文档Id
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * 文档原址url
    */
    @SerializedName("DocumentUrl")
    @Expose
    private String DocumentUrl;

    /**
    * 文档名称
    */
    @SerializedName("DocumentName")
    @Expose
    private String DocumentName;

    /**
    * 文档所有者UserId
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 应用Id
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 文档权限
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
    */
    @SerializedName("TranscodeResult")
    @Expose
    private String TranscodeResult;

    /**
    * 转码类型
    */
    @SerializedName("TranscodeType")
    @Expose
    private Long TranscodeType;

    /**
    * 转码进度， 0 - 100 表示（0% - 100%）
    */
    @SerializedName("TranscodeProgress")
    @Expose
    private Long TranscodeProgress;

    /**
    * 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
    */
    @SerializedName("TranscodeState")
    @Expose
    private Long TranscodeState;

    /**
    * 转码失败后的错误信息
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private String TranscodeInfo;

    /**
    * 文档类型
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * 文档大小，单位：字节
    */
    @SerializedName("DocumentSize")
    @Expose
    private Long DocumentSize;

    /**
    * 更新的UNIX时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 课件页数
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 课件预览地址
    */
    @SerializedName("Preview")
    @Expose
    private String Preview;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文档Id 
     * @return DocumentId 文档Id
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set 文档Id
     * @param DocumentId 文档Id
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get 文档原址url 
     * @return DocumentUrl 文档原址url
     */
    public String getDocumentUrl() {
        return this.DocumentUrl;
    }

    /**
     * Set 文档原址url
     * @param DocumentUrl 文档原址url
     */
    public void setDocumentUrl(String DocumentUrl) {
        this.DocumentUrl = DocumentUrl;
    }

    /**
     * Get 文档名称 
     * @return DocumentName 文档名称
     */
    public String getDocumentName() {
        return this.DocumentName;
    }

    /**
     * Set 文档名称
     * @param DocumentName 文档名称
     */
    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    /**
     * Get 文档所有者UserId 
     * @return Owner 文档所有者UserId
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 文档所有者UserId
     * @param Owner 文档所有者UserId
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 应用Id 
     * @return SdkAppId 应用Id
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用Id
     * @param SdkAppId 应用Id
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 文档权限 
     * @return Permission 文档权限
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set 文档权限
     * @param Permission 文档权限
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码 
     * @return TranscodeResult 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
     */
    public String getTranscodeResult() {
        return this.TranscodeResult;
    }

    /**
     * Set 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
     * @param TranscodeResult 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
     */
    public void setTranscodeResult(String TranscodeResult) {
        this.TranscodeResult = TranscodeResult;
    }

    /**
     * Get 转码类型 
     * @return TranscodeType 转码类型
     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set 转码类型
     * @param TranscodeType 转码类型
     */
    public void setTranscodeType(Long TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    /**
     * Get 转码进度， 0 - 100 表示（0% - 100%） 
     * @return TranscodeProgress 转码进度， 0 - 100 表示（0% - 100%）
     */
    public Long getTranscodeProgress() {
        return this.TranscodeProgress;
    }

    /**
     * Set 转码进度， 0 - 100 表示（0% - 100%）
     * @param TranscodeProgress 转码进度， 0 - 100 表示（0% - 100%）
     */
    public void setTranscodeProgress(Long TranscodeProgress) {
        this.TranscodeProgress = TranscodeProgress;
    }

    /**
     * Get 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功 
     * @return TranscodeState 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
     */
    public Long getTranscodeState() {
        return this.TranscodeState;
    }

    /**
     * Set 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
     * @param TranscodeState 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
     */
    public void setTranscodeState(Long TranscodeState) {
        this.TranscodeState = TranscodeState;
    }

    /**
     * Get 转码失败后的错误信息 
     * @return TranscodeInfo 转码失败后的错误信息
     */
    public String getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set 转码失败后的错误信息
     * @param TranscodeInfo 转码失败后的错误信息
     */
    public void setTranscodeInfo(String TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get 文档类型 
     * @return DocumentType 文档类型
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set 文档类型
     * @param DocumentType 文档类型
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 文档大小，单位：字节 
     * @return DocumentSize 文档大小，单位：字节
     */
    public Long getDocumentSize() {
        return this.DocumentSize;
    }

    /**
     * Set 文档大小，单位：字节
     * @param DocumentSize 文档大小，单位：字节
     */
    public void setDocumentSize(Long DocumentSize) {
        this.DocumentSize = DocumentSize;
    }

    /**
     * Get 更新的UNIX时间戳 
     * @return UpdateTime 更新的UNIX时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新的UNIX时间戳
     * @param UpdateTime 更新的UNIX时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 课件页数 
     * @return Pages 课件页数
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 课件页数
     * @param Pages 课件页数
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 课件预览地址 
     * @return Preview 课件预览地址
     */
    public String getPreview() {
        return this.Preview;
    }

    /**
     * Set 课件预览地址
     * @param Preview 课件预览地址
     */
    public void setPreview(String Preview) {
        this.Preview = Preview;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocumentResponse(DescribeDocumentResponse source) {
        if (source.DocumentId != null) {
            this.DocumentId = new String(source.DocumentId);
        }
        if (source.DocumentUrl != null) {
            this.DocumentUrl = new String(source.DocumentUrl);
        }
        if (source.DocumentName != null) {
            this.DocumentName = new String(source.DocumentName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.TranscodeResult != null) {
            this.TranscodeResult = new String(source.TranscodeResult);
        }
        if (source.TranscodeType != null) {
            this.TranscodeType = new Long(source.TranscodeType);
        }
        if (source.TranscodeProgress != null) {
            this.TranscodeProgress = new Long(source.TranscodeProgress);
        }
        if (source.TranscodeState != null) {
            this.TranscodeState = new Long(source.TranscodeState);
        }
        if (source.TranscodeInfo != null) {
            this.TranscodeInfo = new String(source.TranscodeInfo);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new String(source.DocumentType);
        }
        if (source.DocumentSize != null) {
            this.DocumentSize = new Long(source.DocumentSize);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Preview != null) {
            this.Preview = new String(source.Preview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentId", this.DocumentId);
        this.setParamSimple(map, prefix + "DocumentUrl", this.DocumentUrl);
        this.setParamSimple(map, prefix + "DocumentName", this.DocumentName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "TranscodeResult", this.TranscodeResult);
        this.setParamSimple(map, prefix + "TranscodeType", this.TranscodeType);
        this.setParamSimple(map, prefix + "TranscodeProgress", this.TranscodeProgress);
        this.setParamSimple(map, prefix + "TranscodeState", this.TranscodeState);
        this.setParamSimple(map, prefix + "TranscodeInfo", this.TranscodeInfo);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "DocumentSize", this.DocumentSize);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "Preview", this.Preview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

