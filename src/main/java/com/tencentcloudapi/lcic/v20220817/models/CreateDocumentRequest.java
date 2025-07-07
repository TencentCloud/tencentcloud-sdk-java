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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDocumentRequest extends AbstractModel {

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
0 无需转码（默认），bmp，jpg，jpeg，png，gif
1 需要转码的文档，ppt，pptx，pdf，doc，docx，xls，xlsx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
请注意，待录制的页面中任何视频的分辨率不能超过页面录制最大分辨率（1920*1080），否则将导致录制失败。
 - ppt课件内嵌视频或纯视频课件，在上传课件时，云api会进行转码，以确保视频分辨率不超过页面录制最大分辨率。
 - h5课件中内嵌音视频内容时，由于平台无法获取视频内容，因此在制作环节需确保视频分辨率不超过页面录制最大分辨率。

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
    * 是否对不支持元素开启自动处理的功能。默认关闭。
自动处理的元素如下：
1. 墨迹：移除不支持的墨迹（例如WPS墨迹）
2. 自动翻页：移除PPT上所有自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
    */
    @SerializedName("AutoHandleUnsupportedElement")
    @Expose
    private Boolean AutoHandleUnsupportedElement;

    /**
    * 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。该参数仅对TranscodeType=1的课件生效。示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
示例值：1280x720
    */
    @SerializedName("MinScaleResolution")
    @Expose
    private String MinScaleResolution;

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
0 无需转码（默认），bmp，jpg，jpeg，png，gif
1 需要转码的文档，ppt，pptx，pdf，doc，docx，xls，xlsx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
请注意，待录制的页面中任何视频的分辨率不能超过页面录制最大分辨率（1920*1080），否则将导致录制失败。
 - ppt课件内嵌视频或纯视频课件，在上传课件时，云api会进行转码，以确保视频分辨率不超过页面录制最大分辨率。
 - h5课件中内嵌音视频内容时，由于平台无法获取视频内容，因此在制作环节需确保视频分辨率不超过页面录制最大分辨率。
 
     * @return TranscodeType 转码类型，可以有如下取值：
0 无需转码（默认），bmp，jpg，jpeg，png，gif
1 需要转码的文档，ppt，pptx，pdf，doc，docx，xls，xlsx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
请注意，待录制的页面中任何视频的分辨率不能超过页面录制最大分辨率（1920*1080），否则将导致录制失败。
 - ppt课件内嵌视频或纯视频课件，在上传课件时，云api会进行转码，以确保视频分辨率不超过页面录制最大分辨率。
 - h5课件中内嵌音视频内容时，由于平台无法获取视频内容，因此在制作环节需确保视频分辨率不超过页面录制最大分辨率。

     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set 转码类型，可以有如下取值：
0 无需转码（默认），bmp，jpg，jpeg，png，gif
1 需要转码的文档，ppt，pptx，pdf，doc，docx，xls，xlsx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
请注意，待录制的页面中任何视频的分辨率不能超过页面录制最大分辨率（1920*1080），否则将导致录制失败。
 - ppt课件内嵌视频或纯视频课件，在上传课件时，云api会进行转码，以确保视频分辨率不超过页面录制最大分辨率。
 - h5课件中内嵌音视频内容时，由于平台无法获取视频内容，因此在制作环节需确保视频分辨率不超过页面录制最大分辨率。

     * @param TranscodeType 转码类型，可以有如下取值：
0 无需转码（默认），bmp，jpg，jpeg，png，gif
1 需要转码的文档，ppt，pptx，pdf，doc，docx，xls，xlsx
2 需要转码的视频，mp4，3pg，mpeg，avi，flv，wmv，rm，h264等
2 需要转码的音频，mp3，wav，wma，aac，flac，opus
请注意，待录制的页面中任何视频的分辨率不能超过页面录制最大分辨率（1920*1080），否则将导致录制失败。
 - ppt课件内嵌视频或纯视频课件，在上传课件时，云api会进行转码，以确保视频分辨率不超过页面录制最大分辨率。
 - h5课件中内嵌音视频内容时，由于平台无法获取视频内容，因此在制作环节需确保视频分辨率不超过页面录制最大分辨率。

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

    /**
     * Get 是否对不支持元素开启自动处理的功能。默认关闭。
自动处理的元素如下：
1. 墨迹：移除不支持的墨迹（例如WPS墨迹）
2. 自动翻页：移除PPT上所有自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用 
     * @return AutoHandleUnsupportedElement 是否对不支持元素开启自动处理的功能。默认关闭。
自动处理的元素如下：
1. 墨迹：移除不支持的墨迹（例如WPS墨迹）
2. 自动翻页：移除PPT上所有自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
     */
    public Boolean getAutoHandleUnsupportedElement() {
        return this.AutoHandleUnsupportedElement;
    }

    /**
     * Set 是否对不支持元素开启自动处理的功能。默认关闭。
自动处理的元素如下：
1. 墨迹：移除不支持的墨迹（例如WPS墨迹）
2. 自动翻页：移除PPT上所有自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
     * @param AutoHandleUnsupportedElement 是否对不支持元素开启自动处理的功能。默认关闭。
自动处理的元素如下：
1. 墨迹：移除不支持的墨迹（例如WPS墨迹）
2. 自动翻页：移除PPT上所有自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
     */
    public void setAutoHandleUnsupportedElement(Boolean AutoHandleUnsupportedElement) {
        this.AutoHandleUnsupportedElement = AutoHandleUnsupportedElement;
    }

    /**
     * Get 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。该参数仅对TranscodeType=1的课件生效。示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
示例值：1280x720 
     * @return MinScaleResolution 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。该参数仅对TranscodeType=1的课件生效。示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
示例值：1280x720
     */
    public String getMinScaleResolution() {
        return this.MinScaleResolution;
    }

    /**
     * Set 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。该参数仅对TranscodeType=1的课件生效。示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
示例值：1280x720
     * @param MinScaleResolution 转码后文档的最小分辨率，不传、传空字符串或分辨率格式错误则使用文档原分辨率。该参数仅对TranscodeType=1的课件生效。示例：1280x720，注意分辨率宽高中间为英文字母"xyz"的"x"
示例值：1280x720
     */
    public void setMinScaleResolution(String MinScaleResolution) {
        this.MinScaleResolution = MinScaleResolution;
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
        if (source.AutoHandleUnsupportedElement != null) {
            this.AutoHandleUnsupportedElement = new Boolean(source.AutoHandleUnsupportedElement);
        }
        if (source.MinScaleResolution != null) {
            this.MinScaleResolution = new String(source.MinScaleResolution);
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
        this.setParamSimple(map, prefix + "AutoHandleUnsupportedElement", this.AutoHandleUnsupportedElement);
        this.setParamSimple(map, prefix + "MinScaleResolution", this.MinScaleResolution);

    }
}

