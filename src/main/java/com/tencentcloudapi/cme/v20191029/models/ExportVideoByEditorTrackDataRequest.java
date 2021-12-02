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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportVideoByEditorTrackDataRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 导出视频预设配置 Id，推荐优先使用下面的默认预设配置 Id，有其他需求可通过接口定制预设配置。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 导出目标，指定导出视频的目标媒资库，可取值有：
<li>CME：多媒体创建引擎，即导出到多媒体创作引擎媒资库，此导出目标在云点播媒资库依然可见；</li>
<li>VOD：云点播，即导出为云点播媒资库，此导出目标在多媒体创作引擎媒资库将不可见。</li>
    */
    @SerializedName("ExportDestination")
    @Expose
    private String ExportDestination;

    /**
    * 在线编辑轨道数据。轨道数据相关介绍，请查看 [视频合成协议](https://cloud.tencent.com/document/product/1156/51225)。
    */
    @SerializedName("TrackData")
    @Expose
    private String TrackData;

    /**
    * 轨道数据对应的画布宽高比，配合预设配置中的视频短边尺寸，可决定导出画面的尺寸。例：
<li>如果 AspectRatio 取值 16:9，预设配置选为12（短边1080），则导出尺寸为 1920 * 1080；</li>
<li>如果 AspectRatio 取值 9:16，预设配置选为11（短边720），则导出尺寸为 720 *1280。</li>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * 导出的多媒体创作引擎媒体信息。当导出目标为 CME 时必填。
    */
    @SerializedName("CMEExportInfo")
    @Expose
    private CMEExportInfo CMEExportInfo;

    /**
    * 导出的云点播媒资信息。当导出目标为 VOD 时必填。
    */
    @SerializedName("VODExportInfo")
    @Expose
    private VODExportInfo VODExportInfo;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，无权限限制。如果指定操作者，轨道数据中使的媒资该操作者需要拥有使用权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 导出视频预设配置 Id，推荐优先使用下面的默认预设配置 Id，有其他需求可通过接口定制预设配置。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li> 
     * @return Definition 导出视频预设配置 Id，推荐优先使用下面的默认预设配置 Id，有其他需求可通过接口定制预设配置。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 导出视频预设配置 Id，推荐优先使用下面的默认预设配置 Id，有其他需求可通过接口定制预设配置。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
     * @param Definition 导出视频预设配置 Id，推荐优先使用下面的默认预设配置 Id，有其他需求可通过接口定制预设配置。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 导出目标，指定导出视频的目标媒资库，可取值有：
<li>CME：多媒体创建引擎，即导出到多媒体创作引擎媒资库，此导出目标在云点播媒资库依然可见；</li>
<li>VOD：云点播，即导出为云点播媒资库，此导出目标在多媒体创作引擎媒资库将不可见。</li> 
     * @return ExportDestination 导出目标，指定导出视频的目标媒资库，可取值有：
<li>CME：多媒体创建引擎，即导出到多媒体创作引擎媒资库，此导出目标在云点播媒资库依然可见；</li>
<li>VOD：云点播，即导出为云点播媒资库，此导出目标在多媒体创作引擎媒资库将不可见。</li>
     */
    public String getExportDestination() {
        return this.ExportDestination;
    }

    /**
     * Set 导出目标，指定导出视频的目标媒资库，可取值有：
<li>CME：多媒体创建引擎，即导出到多媒体创作引擎媒资库，此导出目标在云点播媒资库依然可见；</li>
<li>VOD：云点播，即导出为云点播媒资库，此导出目标在多媒体创作引擎媒资库将不可见。</li>
     * @param ExportDestination 导出目标，指定导出视频的目标媒资库，可取值有：
<li>CME：多媒体创建引擎，即导出到多媒体创作引擎媒资库，此导出目标在云点播媒资库依然可见；</li>
<li>VOD：云点播，即导出为云点播媒资库，此导出目标在多媒体创作引擎媒资库将不可见。</li>
     */
    public void setExportDestination(String ExportDestination) {
        this.ExportDestination = ExportDestination;
    }

    /**
     * Get 在线编辑轨道数据。轨道数据相关介绍，请查看 [视频合成协议](https://cloud.tencent.com/document/product/1156/51225)。 
     * @return TrackData 在线编辑轨道数据。轨道数据相关介绍，请查看 [视频合成协议](https://cloud.tencent.com/document/product/1156/51225)。
     */
    public String getTrackData() {
        return this.TrackData;
    }

    /**
     * Set 在线编辑轨道数据。轨道数据相关介绍，请查看 [视频合成协议](https://cloud.tencent.com/document/product/1156/51225)。
     * @param TrackData 在线编辑轨道数据。轨道数据相关介绍，请查看 [视频合成协议](https://cloud.tencent.com/document/product/1156/51225)。
     */
    public void setTrackData(String TrackData) {
        this.TrackData = TrackData;
    }

    /**
     * Get 轨道数据对应的画布宽高比，配合预设配置中的视频短边尺寸，可决定导出画面的尺寸。例：
<li>如果 AspectRatio 取值 16:9，预设配置选为12（短边1080），则导出尺寸为 1920 * 1080；</li>
<li>如果 AspectRatio 取值 9:16，预设配置选为11（短边720），则导出尺寸为 720 *1280。</li> 
     * @return AspectRatio 轨道数据对应的画布宽高比，配合预设配置中的视频短边尺寸，可决定导出画面的尺寸。例：
<li>如果 AspectRatio 取值 16:9，预设配置选为12（短边1080），则导出尺寸为 1920 * 1080；</li>
<li>如果 AspectRatio 取值 9:16，预设配置选为11（短边720），则导出尺寸为 720 *1280。</li>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 轨道数据对应的画布宽高比，配合预设配置中的视频短边尺寸，可决定导出画面的尺寸。例：
<li>如果 AspectRatio 取值 16:9，预设配置选为12（短边1080），则导出尺寸为 1920 * 1080；</li>
<li>如果 AspectRatio 取值 9:16，预设配置选为11（短边720），则导出尺寸为 720 *1280。</li>
     * @param AspectRatio 轨道数据对应的画布宽高比，配合预设配置中的视频短边尺寸，可决定导出画面的尺寸。例：
<li>如果 AspectRatio 取值 16:9，预设配置选为12（短边1080），则导出尺寸为 1920 * 1080；</li>
<li>如果 AspectRatio 取值 9:16，预设配置选为11（短边720），则导出尺寸为 720 *1280。</li>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。 
     * @return CoverData 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
     * @param CoverData 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get 导出的多媒体创作引擎媒体信息。当导出目标为 CME 时必填。 
     * @return CMEExportInfo 导出的多媒体创作引擎媒体信息。当导出目标为 CME 时必填。
     */
    public CMEExportInfo getCMEExportInfo() {
        return this.CMEExportInfo;
    }

    /**
     * Set 导出的多媒体创作引擎媒体信息。当导出目标为 CME 时必填。
     * @param CMEExportInfo 导出的多媒体创作引擎媒体信息。当导出目标为 CME 时必填。
     */
    public void setCMEExportInfo(CMEExportInfo CMEExportInfo) {
        this.CMEExportInfo = CMEExportInfo;
    }

    /**
     * Get 导出的云点播媒资信息。当导出目标为 VOD 时必填。 
     * @return VODExportInfo 导出的云点播媒资信息。当导出目标为 VOD 时必填。
     */
    public VODExportInfo getVODExportInfo() {
        return this.VODExportInfo;
    }

    /**
     * Set 导出的云点播媒资信息。当导出目标为 VOD 时必填。
     * @param VODExportInfo 导出的云点播媒资信息。当导出目标为 VOD 时必填。
     */
    public void setVODExportInfo(VODExportInfo VODExportInfo) {
        this.VODExportInfo = VODExportInfo;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，无权限限制。如果指定操作者，轨道数据中使的媒资该操作者需要拥有使用权限。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，无权限限制。如果指定操作者，轨道数据中使的媒资该操作者需要拥有使用权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，无权限限制。如果指定操作者，轨道数据中使的媒资该操作者需要拥有使用权限。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，无权限限制。如果指定操作者，轨道数据中使的媒资该操作者需要拥有使用权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ExportVideoByEditorTrackDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVideoByEditorTrackDataRequest(ExportVideoByEditorTrackDataRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExportDestination != null) {
            this.ExportDestination = new String(source.ExportDestination);
        }
        if (source.TrackData != null) {
            this.TrackData = new String(source.TrackData);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.CoverData != null) {
            this.CoverData = new String(source.CoverData);
        }
        if (source.CMEExportInfo != null) {
            this.CMEExportInfo = new CMEExportInfo(source.CMEExportInfo);
        }
        if (source.VODExportInfo != null) {
            this.VODExportInfo = new VODExportInfo(source.VODExportInfo);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ExportDestination", this.ExportDestination);
        this.setParamSimple(map, prefix + "TrackData", this.TrackData);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "CoverData", this.CoverData);
        this.setParamObj(map, prefix + "CMEExportInfo.", this.CMEExportInfo);
        this.setParamObj(map, prefix + "VODExportInfo.", this.VODExportInfo);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

