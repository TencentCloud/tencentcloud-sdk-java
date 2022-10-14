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

public class CreateDocumentRequest extends AbstractModel{

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 文档地址。
    */
    @SerializedName("DocumentUrl")
    @Expose
    private String DocumentUrl;

    /**
    * 文档名称。
    */
    @SerializedName("DocumentName")
    @Expose
    private String DocumentName;

    /**
    * 文档所有者的Id
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 转码类型，可以有如下取值：
0 无需转码（默认）
1 需要转码的文档，ppt，pptx，pdf，doc，docx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
    */
    @SerializedName("TranscodeType")
    @Expose
    private Long TranscodeType;

    /**
    * 权限，可以有如下取值：
0 私有文档（默认）
1 公共文档
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * 文档后缀名。
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * 文档大小，单位 字节
    */
    @SerializedName("DocumentSize")
    @Expose
    private Long DocumentSize;

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 文档地址。 
     * @return DocumentUrl 文档地址。
     */
    public String getDocumentUrl() {
        return this.DocumentUrl;
    }

    /**
     * Set 文档地址。
     * @param DocumentUrl 文档地址。
     */
    public void setDocumentUrl(String DocumentUrl) {
        this.DocumentUrl = DocumentUrl;
    }

    /**
     * Get 文档名称。 
     * @return DocumentName 文档名称。
     */
    public String getDocumentName() {
        return this.DocumentName;
    }

    /**
     * Set 文档名称。
     * @param DocumentName 文档名称。
     */
    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    /**
     * Get 文档所有者的Id 
     * @return Owner 文档所有者的Id
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 文档所有者的Id
     * @param Owner 文档所有者的Id
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 转码类型，可以有如下取值：
0 无需转码（默认）
1 需要转码的文档，ppt，pptx，pdf，doc，docx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus 
     * @return TranscodeType 转码类型，可以有如下取值：
0 无需转码（默认）
1 需要转码的文档，ppt，pptx，pdf，doc，docx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set 转码类型，可以有如下取值：
0 无需转码（默认）
1 需要转码的文档，ppt，pptx，pdf，doc，docx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
     * @param TranscodeType 转码类型，可以有如下取值：
0 无需转码（默认）
1 需要转码的文档，ppt，pptx，pdf，doc，docx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
     */
    public void setTranscodeType(Long TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    /**
     * Get 权限，可以有如下取值：
0 私有文档（默认）
1 公共文档 
     * @return Permission 权限，可以有如下取值：
0 私有文档（默认）
1 公共文档
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set 权限，可以有如下取值：
0 私有文档（默认）
1 公共文档
     * @param Permission 权限，可以有如下取值：
0 私有文档（默认）
1 公共文档
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 文档后缀名。 
     * @return DocumentType 文档后缀名。
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set 文档后缀名。
     * @param DocumentType 文档后缀名。
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get 文档大小，单位 字节 
     * @return DocumentSize 文档大小，单位 字节
     */
    public Long getDocumentSize() {
        return this.DocumentSize;
    }

    /**
     * Set 文档大小，单位 字节
     * @param DocumentSize 文档大小，单位 字节
     */
    public void setDocumentSize(Long DocumentSize) {
        this.DocumentSize = DocumentSize;
    }

    public CreateDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDocumentRequest(CreateDocumentRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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
        if (source.TranscodeType != null) {
            this.TranscodeType = new Long(source.TranscodeType);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new String(source.DocumentType);
        }
        if (source.DocumentSize != null) {
            this.DocumentSize = new Long(source.DocumentSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "DocumentUrl", this.DocumentUrl);
        this.setParamSimple(map, prefix + "DocumentName", this.DocumentName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "TranscodeType", this.TranscodeType);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "DocumentSize", this.DocumentSize);

    }
}

