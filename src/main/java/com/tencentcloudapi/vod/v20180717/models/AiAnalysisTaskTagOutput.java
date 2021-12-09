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

public class AiAnalysisTaskTagOutput extends AbstractModel{

    /**
    * 视频智能标签列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 TagSetFileUrl 对应的文件中获取。
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisTagItem [] TagSet;

    /**
    * 视频智能标签列表文件 URL。文件的内容为 JSON，数据结构与 TagSet 字段一致。 （文件不会永久存储，到达 TagSetFileUrlExpireTime 时间点后文件将被删除）。
    */
    @SerializedName("TagSetFileUrl")
    @Expose
    private String TagSetFileUrl;

    /**
    * 视频智能标签列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("TagSetFileUrlExpireTime")
    @Expose
    private String TagSetFileUrlExpireTime;

    /**
     * Get 视频智能标签列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 TagSetFileUrl 对应的文件中获取。 
     * @return TagSet 视频智能标签列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 TagSetFileUrl 对应的文件中获取。
     */
    public MediaAiAnalysisTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 视频智能标签列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 TagSetFileUrl 对应的文件中获取。
     * @param TagSet 视频智能标签列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 TagSetFileUrl 对应的文件中获取。
     */
    public void setTagSet(MediaAiAnalysisTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 视频智能标签列表文件 URL。文件的内容为 JSON，数据结构与 TagSet 字段一致。 （文件不会永久存储，到达 TagSetFileUrlExpireTime 时间点后文件将被删除）。 
     * @return TagSetFileUrl 视频智能标签列表文件 URL。文件的内容为 JSON，数据结构与 TagSet 字段一致。 （文件不会永久存储，到达 TagSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public String getTagSetFileUrl() {
        return this.TagSetFileUrl;
    }

    /**
     * Set 视频智能标签列表文件 URL。文件的内容为 JSON，数据结构与 TagSet 字段一致。 （文件不会永久存储，到达 TagSetFileUrlExpireTime 时间点后文件将被删除）。
     * @param TagSetFileUrl 视频智能标签列表文件 URL。文件的内容为 JSON，数据结构与 TagSet 字段一致。 （文件不会永久存储，到达 TagSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public void setTagSetFileUrl(String TagSetFileUrl) {
        this.TagSetFileUrl = TagSetFileUrl;
    }

    /**
     * Get 视频智能标签列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return TagSetFileUrlExpireTime 视频智能标签列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getTagSetFileUrlExpireTime() {
        return this.TagSetFileUrlExpireTime;
    }

    /**
     * Set 视频智能标签列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param TagSetFileUrlExpireTime 视频智能标签列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setTagSetFileUrlExpireTime(String TagSetFileUrlExpireTime) {
        this.TagSetFileUrlExpireTime = TagSetFileUrlExpireTime;
    }

    public AiAnalysisTaskTagOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskTagOutput(AiAnalysisTaskTagOutput source) {
        if (source.TagSet != null) {
            this.TagSet = new MediaAiAnalysisTagItem[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new MediaAiAnalysisTagItem(source.TagSet[i]);
            }
        }
        if (source.TagSetFileUrl != null) {
            this.TagSetFileUrl = new String(source.TagSetFileUrl);
        }
        if (source.TagSetFileUrlExpireTime != null) {
            this.TagSetFileUrlExpireTime = new String(source.TagSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "TagSetFileUrl", this.TagSetFileUrl);
        this.setParamSimple(map, prefix + "TagSetFileUrlExpireTime", this.TagSetFileUrlExpireTime);

    }
}

