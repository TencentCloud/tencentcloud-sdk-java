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

public class VideoSegmentationProjectInput extends AbstractModel{

    /**
    * 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16；</li>
<li>2:1。</li>
默认值 16:9 。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 视频拆条处理模型，不填则默认为手工分割视频。取值 ：
<li>AI.GameHighlights.PUBG：和平精英集锦 ;</li>
<li>AI.GameHighlights.Honor OfKings：王者荣耀集锦 ;</li>
<li>AI.SportHighlights.Football：足球集锦 </li>
<li>AI.SportHighlights.Basketball：篮球集锦 ；</li>
<li>AI.PersonSegmentation：人物集锦  ;</li>
<li>AI.NewsSegmentation：新闻拆条。</li>
    */
    @SerializedName("ProcessModel")
    @Expose
    private String ProcessModel;

    /**
     * Get 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16；</li>
<li>2:1。</li>
默认值 16:9 。 
     * @return AspectRatio 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16；</li>
<li>2:1。</li>
默认值 16:9 。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16；</li>
<li>2:1。</li>
默认值 16:9 。
     * @param AspectRatio 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16；</li>
<li>2:1。</li>
默认值 16:9 。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 视频拆条处理模型，不填则默认为手工分割视频。取值 ：
<li>AI.GameHighlights.PUBG：和平精英集锦 ;</li>
<li>AI.GameHighlights.Honor OfKings：王者荣耀集锦 ;</li>
<li>AI.SportHighlights.Football：足球集锦 </li>
<li>AI.SportHighlights.Basketball：篮球集锦 ；</li>
<li>AI.PersonSegmentation：人物集锦  ;</li>
<li>AI.NewsSegmentation：新闻拆条。</li> 
     * @return ProcessModel 视频拆条处理模型，不填则默认为手工分割视频。取值 ：
<li>AI.GameHighlights.PUBG：和平精英集锦 ;</li>
<li>AI.GameHighlights.Honor OfKings：王者荣耀集锦 ;</li>
<li>AI.SportHighlights.Football：足球集锦 </li>
<li>AI.SportHighlights.Basketball：篮球集锦 ；</li>
<li>AI.PersonSegmentation：人物集锦  ;</li>
<li>AI.NewsSegmentation：新闻拆条。</li>
     */
    public String getProcessModel() {
        return this.ProcessModel;
    }

    /**
     * Set 视频拆条处理模型，不填则默认为手工分割视频。取值 ：
<li>AI.GameHighlights.PUBG：和平精英集锦 ;</li>
<li>AI.GameHighlights.Honor OfKings：王者荣耀集锦 ;</li>
<li>AI.SportHighlights.Football：足球集锦 </li>
<li>AI.SportHighlights.Basketball：篮球集锦 ；</li>
<li>AI.PersonSegmentation：人物集锦  ;</li>
<li>AI.NewsSegmentation：新闻拆条。</li>
     * @param ProcessModel 视频拆条处理模型，不填则默认为手工分割视频。取值 ：
<li>AI.GameHighlights.PUBG：和平精英集锦 ;</li>
<li>AI.GameHighlights.Honor OfKings：王者荣耀集锦 ;</li>
<li>AI.SportHighlights.Football：足球集锦 </li>
<li>AI.SportHighlights.Basketball：篮球集锦 ；</li>
<li>AI.PersonSegmentation：人物集锦  ;</li>
<li>AI.NewsSegmentation：新闻拆条。</li>
     */
    public void setProcessModel(String ProcessModel) {
        this.ProcessModel = ProcessModel;
    }

    public VideoSegmentationProjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSegmentationProjectInput(VideoSegmentationProjectInput source) {
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.ProcessModel != null) {
            this.ProcessModel = new String(source.ProcessModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "ProcessModel", this.ProcessModel);

    }
}

