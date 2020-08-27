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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisFrameTagItem extends AbstractModel{

    /**
    * 按帧标签名称。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 按帧标签名称的分类列表，CategorySet.N 表示第 N+1级分类。
比如 Tag 为“塔楼”时，CategorySet 包含两个元素：CategorySet.0 为“场景”，CategorySet.1为 “建筑”，表示按帧标签为“塔楼”，且第1级分类是“场景”，第2级分类是“建筑”。
    */
    @SerializedName("CategorySet")
    @Expose
    private String [] CategorySet;

    /**
    * 按帧标签的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 按帧标签名称。 
     * @return Tag 按帧标签名称。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 按帧标签名称。
     * @param Tag 按帧标签名称。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 按帧标签名称的分类列表，CategorySet.N 表示第 N+1级分类。
比如 Tag 为“塔楼”时，CategorySet 包含两个元素：CategorySet.0 为“场景”，CategorySet.1为 “建筑”，表示按帧标签为“塔楼”，且第1级分类是“场景”，第2级分类是“建筑”。 
     * @return CategorySet 按帧标签名称的分类列表，CategorySet.N 表示第 N+1级分类。
比如 Tag 为“塔楼”时，CategorySet 包含两个元素：CategorySet.0 为“场景”，CategorySet.1为 “建筑”，表示按帧标签为“塔楼”，且第1级分类是“场景”，第2级分类是“建筑”。
     */
    public String [] getCategorySet() {
        return this.CategorySet;
    }

    /**
     * Set 按帧标签名称的分类列表，CategorySet.N 表示第 N+1级分类。
比如 Tag 为“塔楼”时，CategorySet 包含两个元素：CategorySet.0 为“场景”，CategorySet.1为 “建筑”，表示按帧标签为“塔楼”，且第1级分类是“场景”，第2级分类是“建筑”。
     * @param CategorySet 按帧标签名称的分类列表，CategorySet.N 表示第 N+1级分类。
比如 Tag 为“塔楼”时，CategorySet 包含两个元素：CategorySet.0 为“场景”，CategorySet.1为 “建筑”，表示按帧标签为“塔楼”，且第1级分类是“场景”，第2级分类是“建筑”。
     */
    public void setCategorySet(String [] CategorySet) {
        this.CategorySet = CategorySet;
    }

    /**
     * Get 按帧标签的可信度，取值范围是 0 到 100。 
     * @return Confidence 按帧标签的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 按帧标签的可信度，取值范围是 0 到 100。
     * @param Confidence 按帧标签的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArraySimple(map, prefix + "CategorySet.", this.CategorySet);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

