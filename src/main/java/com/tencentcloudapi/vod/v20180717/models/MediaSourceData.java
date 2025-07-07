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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSourceData extends AbstractModel {

    /**
    * 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>TrtcRecord：来自TRTC 伴生录制。</li>
<li>WebPageRecord：来自全景录制。</li>
<li>Unknown：未知来源。</li>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 用户创建文件时透传的字段。
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * 直播录制信息，当文件来源为 Record 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveRecordInfo")
    @Expose
    private LiveRecordInfo LiveRecordInfo;

    /**
    * TRTC 伴生录制信息，当文件来源为 TrtcRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrtcRecordInfo")
    @Expose
    private TrtcRecordInfo TrtcRecordInfo;

    /**
    * 全景录制信息，当文件来源为 WebPageRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebPageRecordInfo")
    @Expose
    private WebPageRecordInfo WebPageRecordInfo;

    /**
     * Get 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>TrtcRecord：来自TRTC 伴生录制。</li>
<li>WebPageRecord：来自全景录制。</li>
<li>Unknown：未知来源。</li> 
     * @return SourceType 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>TrtcRecord：来自TRTC 伴生录制。</li>
<li>WebPageRecord：来自全景录制。</li>
<li>Unknown：未知来源。</li>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>TrtcRecord：来自TRTC 伴生录制。</li>
<li>WebPageRecord：来自全景录制。</li>
<li>Unknown：未知来源。</li>
     * @param SourceType 媒体文件的来源类别：
<li>Record：来自录制。如直播录制、直播时移录制等。</li>
<li>Upload：来自上传。如拉取上传、服务端上传、客户端 UGC 上传等。</li>
<li>VideoProcessing：来自视频处理。如视频拼接、视频剪辑等。</li>
<li>TrtcRecord：来自TRTC 伴生录制。</li>
<li>WebPageRecord：来自全景录制。</li>
<li>Unknown：未知来源。</li>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 用户创建文件时透传的字段。 
     * @return SourceContext 用户创建文件时透传的字段。
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set 用户创建文件时透传的字段。
     * @param SourceContext 用户创建文件时透传的字段。
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get 直播录制信息，当文件来源为 Record 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveRecordInfo 直播录制信息，当文件来源为 Record 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveRecordInfo getLiveRecordInfo() {
        return this.LiveRecordInfo;
    }

    /**
     * Set 直播录制信息，当文件来源为 Record 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveRecordInfo 直播录制信息，当文件来源为 Record 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveRecordInfo(LiveRecordInfo LiveRecordInfo) {
        this.LiveRecordInfo = LiveRecordInfo;
    }

    /**
     * Get TRTC 伴生录制信息，当文件来源为 TrtcRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrtcRecordInfo TRTC 伴生录制信息，当文件来源为 TrtcRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrtcRecordInfo getTrtcRecordInfo() {
        return this.TrtcRecordInfo;
    }

    /**
     * Set TRTC 伴生录制信息，当文件来源为 TrtcRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrtcRecordInfo TRTC 伴生录制信息，当文件来源为 TrtcRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrtcRecordInfo(TrtcRecordInfo TrtcRecordInfo) {
        this.TrtcRecordInfo = TrtcRecordInfo;
    }

    /**
     * Get 全景录制信息，当文件来源为 WebPageRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebPageRecordInfo 全景录制信息，当文件来源为 WebPageRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebPageRecordInfo getWebPageRecordInfo() {
        return this.WebPageRecordInfo;
    }

    /**
     * Set 全景录制信息，当文件来源为 WebPageRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebPageRecordInfo 全景录制信息，当文件来源为 WebPageRecord 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebPageRecordInfo(WebPageRecordInfo WebPageRecordInfo) {
        this.WebPageRecordInfo = WebPageRecordInfo;
    }

    public MediaSourceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSourceData(MediaSourceData source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
        if (source.LiveRecordInfo != null) {
            this.LiveRecordInfo = new LiveRecordInfo(source.LiveRecordInfo);
        }
        if (source.TrtcRecordInfo != null) {
            this.TrtcRecordInfo = new TrtcRecordInfo(source.TrtcRecordInfo);
        }
        if (source.WebPageRecordInfo != null) {
            this.WebPageRecordInfo = new WebPageRecordInfo(source.WebPageRecordInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamObj(map, prefix + "LiveRecordInfo.", this.LiveRecordInfo);
        this.setParamObj(map, prefix + "TrtcRecordInfo.", this.TrtcRecordInfo);
        this.setParamObj(map, prefix + "WebPageRecordInfo.", this.WebPageRecordInfo);

    }
}

