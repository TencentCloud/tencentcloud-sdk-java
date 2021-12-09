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

public class AiAnalysisTaskClassificationOutput extends AbstractModel{

    /**
    * 视频智能分类列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ClassificationSetFileUrl 对应的文件中获取。
    */
    @SerializedName("ClassificationSet")
    @Expose
    private MediaAiAnalysisClassificationItem [] ClassificationSet;

    /**
    * 视频智能分类列表文件 URL。文件的内容为 JSON，数据结构与 ClassificationSet 字段一致。 （文件不会永久存储，到达 ClassificationSetFileUrlExpireTime 时间点后文件将被删除）。
    */
    @SerializedName("ClassificationSetFileUrl")
    @Expose
    private String ClassificationSetFileUrl;

    /**
    * 视频智能分类列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ClassificationSetFileUrlExpireTime")
    @Expose
    private String ClassificationSetFileUrlExpireTime;

    /**
     * Get 视频智能分类列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ClassificationSetFileUrl 对应的文件中获取。 
     * @return ClassificationSet 视频智能分类列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ClassificationSetFileUrl 对应的文件中获取。
     */
    public MediaAiAnalysisClassificationItem [] getClassificationSet() {
        return this.ClassificationSet;
    }

    /**
     * Set 视频智能分类列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ClassificationSetFileUrl 对应的文件中获取。
     * @param ClassificationSet 视频智能分类列表。
<font color=red>注意</font> ：该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 ClassificationSetFileUrl 对应的文件中获取。
     */
    public void setClassificationSet(MediaAiAnalysisClassificationItem [] ClassificationSet) {
        this.ClassificationSet = ClassificationSet;
    }

    /**
     * Get 视频智能分类列表文件 URL。文件的内容为 JSON，数据结构与 ClassificationSet 字段一致。 （文件不会永久存储，到达 ClassificationSetFileUrlExpireTime 时间点后文件将被删除）。 
     * @return ClassificationSetFileUrl 视频智能分类列表文件 URL。文件的内容为 JSON，数据结构与 ClassificationSet 字段一致。 （文件不会永久存储，到达 ClassificationSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public String getClassificationSetFileUrl() {
        return this.ClassificationSetFileUrl;
    }

    /**
     * Set 视频智能分类列表文件 URL。文件的内容为 JSON，数据结构与 ClassificationSet 字段一致。 （文件不会永久存储，到达 ClassificationSetFileUrlExpireTime 时间点后文件将被删除）。
     * @param ClassificationSetFileUrl 视频智能分类列表文件 URL。文件的内容为 JSON，数据结构与 ClassificationSet 字段一致。 （文件不会永久存储，到达 ClassificationSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public void setClassificationSetFileUrl(String ClassificationSetFileUrl) {
        this.ClassificationSetFileUrl = ClassificationSetFileUrl;
    }

    /**
     * Get 视频智能分类列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ClassificationSetFileUrlExpireTime 视频智能分类列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getClassificationSetFileUrlExpireTime() {
        return this.ClassificationSetFileUrlExpireTime;
    }

    /**
     * Set 视频智能分类列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ClassificationSetFileUrlExpireTime 视频智能分类列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setClassificationSetFileUrlExpireTime(String ClassificationSetFileUrlExpireTime) {
        this.ClassificationSetFileUrlExpireTime = ClassificationSetFileUrlExpireTime;
    }

    public AiAnalysisTaskClassificationOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskClassificationOutput(AiAnalysisTaskClassificationOutput source) {
        if (source.ClassificationSet != null) {
            this.ClassificationSet = new MediaAiAnalysisClassificationItem[source.ClassificationSet.length];
            for (int i = 0; i < source.ClassificationSet.length; i++) {
                this.ClassificationSet[i] = new MediaAiAnalysisClassificationItem(source.ClassificationSet[i]);
            }
        }
        if (source.ClassificationSetFileUrl != null) {
            this.ClassificationSetFileUrl = new String(source.ClassificationSetFileUrl);
        }
        if (source.ClassificationSetFileUrlExpireTime != null) {
            this.ClassificationSetFileUrlExpireTime = new String(source.ClassificationSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClassificationSet.", this.ClassificationSet);
        this.setParamSimple(map, prefix + "ClassificationSetFileUrl", this.ClassificationSetFileUrl);
        this.setParamSimple(map, prefix + "ClassificationSetFileUrlExpireTime", this.ClassificationSetFileUrlExpireTime);

    }
}

