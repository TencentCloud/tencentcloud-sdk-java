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

public class DocumentInfo extends AbstractModel{

    /**
    * 文档Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * 文档原址url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentUrl")
    @Expose
    private String DocumentUrl;

    /**
    * 文档名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentName")
    @Expose
    private String DocumentName;

    /**
    * 文档所有者UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 应用Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 文档权限，0：私有课件 1：公共课件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeResult")
    @Expose
    private String TranscodeResult;

    /**
    * 转码类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeType")
    @Expose
    private Long TranscodeType;

    /**
    * 转码进度， 0 - 100 表示（0% - 100%）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeProgress")
    @Expose
    private Long TranscodeProgress;

    /**
    * 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeState")
    @Expose
    private Long TranscodeState;

    /**
    * 转码失败后的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private String TranscodeInfo;

    /**
    * 文档类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * 文档大小，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentSize")
    @Expose
    private Long DocumentSize;

    /**
    * 更新的UNIX时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 课件页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 宽，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 封面，仅转码的课件会生成封面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cover")
    @Expose
    private String Cover;

    /**
     * Get 文档Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentId 文档Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set 文档Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentId 文档Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get 文档原址url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentUrl 文档原址url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentUrl() {
        return this.DocumentUrl;
    }

    /**
     * Set 文档原址url
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentUrl 文档原址url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentUrl(String DocumentUrl) {
        this.DocumentUrl = DocumentUrl;
    }

    /**
     * Get 文档名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentName 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentName() {
        return this.DocumentName;
    }

    /**
     * Set 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentName 文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    /**
     * Get 文档所有者UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 文档所有者UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 文档所有者UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 文档所有者UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 应用Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SdkAppId 应用Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SdkAppId 应用Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 文档权限，0：私有课件 1：公共课件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission 文档权限，0：私有课件 1：公共课件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set 文档权限，0：私有课件 1：公共课件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission 文档权限，0：私有课件 1：公共课件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeResult 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranscodeResult() {
        return this.TranscodeResult;
    }

    /**
     * Set 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeResult 转码结果，无需转码为空，转码成功为结果url，转码失败为错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeResult(String TranscodeResult) {
        this.TranscodeResult = TranscodeResult;
    }

    /**
     * Get 转码类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeType 转码类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set 转码类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeType 转码类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeType(Long TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    /**
     * Get 转码进度， 0 - 100 表示（0% - 100%）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeProgress 转码进度， 0 - 100 表示（0% - 100%）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTranscodeProgress() {
        return this.TranscodeProgress;
    }

    /**
     * Set 转码进度， 0 - 100 表示（0% - 100%）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeProgress 转码进度， 0 - 100 表示（0% - 100%）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeProgress(Long TranscodeProgress) {
        this.TranscodeProgress = TranscodeProgress;
    }

    /**
     * Get 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeState 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTranscodeState() {
        return this.TranscodeState;
    }

    /**
     * Set 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeState 转码状态，0为无需转码，1为正在转码，2为转码失败，3为转码成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeState(Long TranscodeState) {
        this.TranscodeState = TranscodeState;
    }

    /**
     * Get 转码失败后的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeInfo 转码失败后的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set 转码失败后的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeInfo 转码失败后的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeInfo(String TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get 文档类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentType 文档类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set 文档类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentType 文档类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 文档大小，单位：字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentSize 文档大小，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDocumentSize() {
        return this.DocumentSize;
    }

    /**
     * Set 文档大小，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentSize 文档大小，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentSize(Long DocumentSize) {
        this.DocumentSize = DocumentSize;
    }

    /**
     * Get 更新的UNIX时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新的UNIX时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新的UNIX时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新的UNIX时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 课件页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pages 课件页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 课件页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pages 课件页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 宽，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 宽，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 宽，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 高，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 高，仅在静态转码的课件有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 封面，仅转码的课件会生成封面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cover 封面，仅转码的课件会生成封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCover() {
        return this.Cover;
    }

    /**
     * Set 封面，仅转码的课件会生成封面
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cover 封面，仅转码的课件会生成封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCover(String Cover) {
        this.Cover = Cover;
    }

    public DocumentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentInfo(DocumentInfo source) {
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
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Cover != null) {
            this.Cover = new String(source.Cover);
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
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Cover", this.Cover);

    }
}

