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

public class AiAnalysisTaskHighlightOutput extends AbstractModel{

    /**
    * 视频智能精彩片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 HighlightSetFileUrl 对应的文件中获取。
    */
    @SerializedName("HighlightSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightSet;

    /**
    * 视频智能精彩片段列表文件 URL。文件的内容为 JSON，数据结构与 HighlightSet 字段一致。 （文件不会永久存储，到达 HighlightSetFileUrlExpireTime 时间点后文件将被删除）。
    */
    @SerializedName("HighlightSetFileUrl")
    @Expose
    private String HighlightSetFileUrl;

    /**
    * 视频智能精彩片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("HighlightSetFileUrlExpireTime")
    @Expose
    private String HighlightSetFileUrlExpireTime;

    /**
     * Get 视频智能精彩片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 HighlightSetFileUrl 对应的文件中获取。 
     * @return HighlightSet 视频智能精彩片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 HighlightSetFileUrl 对应的文件中获取。
     */
    public MediaAiAnalysisHighlightItem [] getHighlightSet() {
        return this.HighlightSet;
    }

    /**
     * Set 视频智能精彩片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 HighlightSetFileUrl 对应的文件中获取。
     * @param HighlightSet 视频智能精彩片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 HighlightSetFileUrl 对应的文件中获取。
     */
    public void setHighlightSet(MediaAiAnalysisHighlightItem [] HighlightSet) {
        this.HighlightSet = HighlightSet;
    }

    /**
     * Get 视频智能精彩片段列表文件 URL。文件的内容为 JSON，数据结构与 HighlightSet 字段一致。 （文件不会永久存储，到达 HighlightSetFileUrlExpireTime 时间点后文件将被删除）。 
     * @return HighlightSetFileUrl 视频智能精彩片段列表文件 URL。文件的内容为 JSON，数据结构与 HighlightSet 字段一致。 （文件不会永久存储，到达 HighlightSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public String getHighlightSetFileUrl() {
        return this.HighlightSetFileUrl;
    }

    /**
     * Set 视频智能精彩片段列表文件 URL。文件的内容为 JSON，数据结构与 HighlightSet 字段一致。 （文件不会永久存储，到达 HighlightSetFileUrlExpireTime 时间点后文件将被删除）。
     * @param HighlightSetFileUrl 视频智能精彩片段列表文件 URL。文件的内容为 JSON，数据结构与 HighlightSet 字段一致。 （文件不会永久存储，到达 HighlightSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public void setHighlightSetFileUrl(String HighlightSetFileUrl) {
        this.HighlightSetFileUrl = HighlightSetFileUrl;
    }

    /**
     * Get 视频智能精彩片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return HighlightSetFileUrlExpireTime 视频智能精彩片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getHighlightSetFileUrlExpireTime() {
        return this.HighlightSetFileUrlExpireTime;
    }

    /**
     * Set 视频智能精彩片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param HighlightSetFileUrlExpireTime 视频智能精彩片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setHighlightSetFileUrlExpireTime(String HighlightSetFileUrlExpireTime) {
        this.HighlightSetFileUrlExpireTime = HighlightSetFileUrlExpireTime;
    }

    public AiAnalysisTaskHighlightOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHighlightOutput(AiAnalysisTaskHighlightOutput source) {
        if (source.HighlightSet != null) {
            this.HighlightSet = new MediaAiAnalysisHighlightItem[source.HighlightSet.length];
            for (int i = 0; i < source.HighlightSet.length; i++) {
                this.HighlightSet[i] = new MediaAiAnalysisHighlightItem(source.HighlightSet[i]);
            }
        }
        if (source.HighlightSetFileUrl != null) {
            this.HighlightSetFileUrl = new String(source.HighlightSetFileUrl);
        }
        if (source.HighlightSetFileUrlExpireTime != null) {
            this.HighlightSetFileUrlExpireTime = new String(source.HighlightSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightSet.", this.HighlightSet);
        this.setParamSimple(map, prefix + "HighlightSetFileUrl", this.HighlightSetFileUrl);
        this.setParamSimple(map, prefix + "HighlightSetFileUrlExpireTime", this.HighlightSetFileUrlExpireTime);

    }
}

