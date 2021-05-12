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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachMediaSubtitlesRequest extends AbstractModel{

    /**
    * 媒体文件唯一标识。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 操作。取值如下：
<li>Attach：关联字幕。</li>
<li>Detach：解除关联字幕。</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * [转自适应码流模板号](https://cloud.tencent.com/document/product/266/34071#zsy)。
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * 字幕的唯一标识。
    */
    @SerializedName("SubtitleIds")
    @Expose
    private String [] SubtitleIds;

    /**
    * 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 媒体文件唯一标识。 
     * @return FileId 媒体文件唯一标识。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件唯一标识。
     * @param FileId 媒体文件唯一标识。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 操作。取值如下：
<li>Attach：关联字幕。</li>
<li>Detach：解除关联字幕。</li> 
     * @return Operation 操作。取值如下：
<li>Attach：关联字幕。</li>
<li>Detach：解除关联字幕。</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作。取值如下：
<li>Attach：关联字幕。</li>
<li>Detach：解除关联字幕。</li>
     * @param Operation 操作。取值如下：
<li>Attach：关联字幕。</li>
<li>Detach：解除关联字幕。</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get [转自适应码流模板号](https://cloud.tencent.com/document/product/266/34071#zsy)。 
     * @return AdaptiveDynamicStreamingDefinition [转自适应码流模板号](https://cloud.tencent.com/document/product/266/34071#zsy)。
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set [转自适应码流模板号](https://cloud.tencent.com/document/product/266/34071#zsy)。
     * @param AdaptiveDynamicStreamingDefinition [转自适应码流模板号](https://cloud.tencent.com/document/product/266/34071#zsy)。
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get 字幕的唯一标识。 
     * @return SubtitleIds 字幕的唯一标识。
     */
    public String [] getSubtitleIds() {
        return this.SubtitleIds;
    }

    /**
     * Set 字幕的唯一标识。
     * @param SubtitleIds 字幕的唯一标识。
     */
    public void setSubtitleIds(String [] SubtitleIds) {
        this.SubtitleIds = SubtitleIds;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public AttachMediaSubtitlesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachMediaSubtitlesRequest(AttachMediaSubtitlesRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.AdaptiveDynamicStreamingDefinition != null) {
            this.AdaptiveDynamicStreamingDefinition = new Long(source.AdaptiveDynamicStreamingDefinition);
        }
        if (source.SubtitleIds != null) {
            this.SubtitleIds = new String[source.SubtitleIds.length];
            for (int i = 0; i < source.SubtitleIds.length; i++) {
                this.SubtitleIds[i] = new String(source.SubtitleIds[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamArraySimple(map, prefix + "SubtitleIds.", this.SubtitleIds);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

