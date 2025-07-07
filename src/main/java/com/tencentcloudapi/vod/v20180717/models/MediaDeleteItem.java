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

public class MediaDeleteItem extends AbstractModel {

    /**
    * 所指定的删除部分。如果未填写该字段则参数无效。可选值有：
<li>OriginalFiles（删除原文件，删除后无法发起转码、微信发布等任何视频处理操作）；</li>
<li>TranscodeFiles（删除转码文件）；</li>
<li>AdaptiveDynamicStreamingFiles（删除转自适应码流文件）；</li>
<li>WechatPublishFiles（删除微信发布文件）；</li>
<li>WechatMiniProgramPublishFiles（删除微信小程序发布文件）。</li>
<font color=red>注意：</font> <li>取值为OriginalFiles时，文件上传时携带的封面文件会被删除；</li>
<li>取值为TranscodeFiles时，媒体处理产生的封面文件会被删除。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 删除由Type参数指定的种类下的视频模板号，模板定义参见[转码模板](https://cloud.tencent.com/document/product/266/33478#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
默认值为0，表示删除参数Type指定种类下所有的视频。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get 所指定的删除部分。如果未填写该字段则参数无效。可选值有：
<li>OriginalFiles（删除原文件，删除后无法发起转码、微信发布等任何视频处理操作）；</li>
<li>TranscodeFiles（删除转码文件）；</li>
<li>AdaptiveDynamicStreamingFiles（删除转自适应码流文件）；</li>
<li>WechatPublishFiles（删除微信发布文件）；</li>
<li>WechatMiniProgramPublishFiles（删除微信小程序发布文件）。</li>
<font color=red>注意：</font> <li>取值为OriginalFiles时，文件上传时携带的封面文件会被删除；</li>
<li>取值为TranscodeFiles时，媒体处理产生的封面文件会被删除。</li> 
     * @return Type 所指定的删除部分。如果未填写该字段则参数无效。可选值有：
<li>OriginalFiles（删除原文件，删除后无法发起转码、微信发布等任何视频处理操作）；</li>
<li>TranscodeFiles（删除转码文件）；</li>
<li>AdaptiveDynamicStreamingFiles（删除转自适应码流文件）；</li>
<li>WechatPublishFiles（删除微信发布文件）；</li>
<li>WechatMiniProgramPublishFiles（删除微信小程序发布文件）。</li>
<font color=red>注意：</font> <li>取值为OriginalFiles时，文件上传时携带的封面文件会被删除；</li>
<li>取值为TranscodeFiles时，媒体处理产生的封面文件会被删除。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 所指定的删除部分。如果未填写该字段则参数无效。可选值有：
<li>OriginalFiles（删除原文件，删除后无法发起转码、微信发布等任何视频处理操作）；</li>
<li>TranscodeFiles（删除转码文件）；</li>
<li>AdaptiveDynamicStreamingFiles（删除转自适应码流文件）；</li>
<li>WechatPublishFiles（删除微信发布文件）；</li>
<li>WechatMiniProgramPublishFiles（删除微信小程序发布文件）。</li>
<font color=red>注意：</font> <li>取值为OriginalFiles时，文件上传时携带的封面文件会被删除；</li>
<li>取值为TranscodeFiles时，媒体处理产生的封面文件会被删除。</li>
     * @param Type 所指定的删除部分。如果未填写该字段则参数无效。可选值有：
<li>OriginalFiles（删除原文件，删除后无法发起转码、微信发布等任何视频处理操作）；</li>
<li>TranscodeFiles（删除转码文件）；</li>
<li>AdaptiveDynamicStreamingFiles（删除转自适应码流文件）；</li>
<li>WechatPublishFiles（删除微信发布文件）；</li>
<li>WechatMiniProgramPublishFiles（删除微信小程序发布文件）。</li>
<font color=red>注意：</font> <li>取值为OriginalFiles时，文件上传时携带的封面文件会被删除；</li>
<li>取值为TranscodeFiles时，媒体处理产生的封面文件会被删除。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 删除由Type参数指定的种类下的视频模板号，模板定义参见[转码模板](https://cloud.tencent.com/document/product/266/33478#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
默认值为0，表示删除参数Type指定种类下所有的视频。 
     * @return Definition 删除由Type参数指定的种类下的视频模板号，模板定义参见[转码模板](https://cloud.tencent.com/document/product/266/33478#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
默认值为0，表示删除参数Type指定种类下所有的视频。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 删除由Type参数指定的种类下的视频模板号，模板定义参见[转码模板](https://cloud.tencent.com/document/product/266/33478#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
默认值为0，表示删除参数Type指定种类下所有的视频。
     * @param Definition 删除由Type参数指定的种类下的视频模板号，模板定义参见[转码模板](https://cloud.tencent.com/document/product/266/33478#.3Cspan-id-.3D-.22zm.22-.3E.3C.2Fspan.3E.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
默认值为0，表示删除参数Type指定种类下所有的视频。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public MediaDeleteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaDeleteItem(MediaDeleteItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

