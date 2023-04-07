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

public class Activity extends AbstractModel{

    /**
    * 原子任务类型：
<li>input: 起始节点</li>
<li>output：终止节点</li>
<li>action-trans：转码</li>
<li>action-samplesnapshot：采样截图</li>
<li>action-AIAnalysis: 分析</li>
<li>action-AIRecognition：识别</li>
<li>action-aiReview：审核</li>
<li>action-animated-graphics：转动图</li>
<li>action-image-sprite：雪碧图</li>
<li>action-snapshotByTimeOffset: 时间点截图</li>
<li>action-adaptive-substream：自适应码流</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 后驱节点索引数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReardriveIndex")
    @Expose
    private Long [] ReardriveIndex;

    /**
    * 原子任务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityPara")
    @Expose
    private ActivityPara ActivityPara;

    /**
     * Get 原子任务类型：
<li>input: 起始节点</li>
<li>output：终止节点</li>
<li>action-trans：转码</li>
<li>action-samplesnapshot：采样截图</li>
<li>action-AIAnalysis: 分析</li>
<li>action-AIRecognition：识别</li>
<li>action-aiReview：审核</li>
<li>action-animated-graphics：转动图</li>
<li>action-image-sprite：雪碧图</li>
<li>action-snapshotByTimeOffset: 时间点截图</li>
<li>action-adaptive-substream：自适应码流</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityType 原子任务类型：
<li>input: 起始节点</li>
<li>output：终止节点</li>
<li>action-trans：转码</li>
<li>action-samplesnapshot：采样截图</li>
<li>action-AIAnalysis: 分析</li>
<li>action-AIRecognition：识别</li>
<li>action-aiReview：审核</li>
<li>action-animated-graphics：转动图</li>
<li>action-image-sprite：雪碧图</li>
<li>action-snapshotByTimeOffset: 时间点截图</li>
<li>action-adaptive-substream：自适应码流</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 原子任务类型：
<li>input: 起始节点</li>
<li>output：终止节点</li>
<li>action-trans：转码</li>
<li>action-samplesnapshot：采样截图</li>
<li>action-AIAnalysis: 分析</li>
<li>action-AIRecognition：识别</li>
<li>action-aiReview：审核</li>
<li>action-animated-graphics：转动图</li>
<li>action-image-sprite：雪碧图</li>
<li>action-snapshotByTimeOffset: 时间点截图</li>
<li>action-adaptive-substream：自适应码流</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityType 原子任务类型：
<li>input: 起始节点</li>
<li>output：终止节点</li>
<li>action-trans：转码</li>
<li>action-samplesnapshot：采样截图</li>
<li>action-AIAnalysis: 分析</li>
<li>action-AIRecognition：识别</li>
<li>action-aiReview：审核</li>
<li>action-animated-graphics：转动图</li>
<li>action-image-sprite：雪碧图</li>
<li>action-snapshotByTimeOffset: 时间点截图</li>
<li>action-adaptive-substream：自适应码流</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 后驱节点索引数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReardriveIndex 后驱节点索引数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReardriveIndex() {
        return this.ReardriveIndex;
    }

    /**
     * Set 后驱节点索引数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReardriveIndex 后驱节点索引数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReardriveIndex(Long [] ReardriveIndex) {
        this.ReardriveIndex = ReardriveIndex;
    }

    /**
     * Get 原子任务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityPara 原子任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ActivityPara getActivityPara() {
        return this.ActivityPara;
    }

    /**
     * Set 原子任务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityPara 原子任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityPara(ActivityPara ActivityPara) {
        this.ActivityPara = ActivityPara;
    }

    public Activity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Activity(Activity source) {
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.ReardriveIndex != null) {
            this.ReardriveIndex = new Long[source.ReardriveIndex.length];
            for (int i = 0; i < source.ReardriveIndex.length; i++) {
                this.ReardriveIndex[i] = new Long(source.ReardriveIndex[i]);
            }
        }
        if (source.ActivityPara != null) {
            this.ActivityPara = new ActivityPara(source.ActivityPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamArraySimple(map, prefix + "ReardriveIndex.", this.ReardriveIndex);
        this.setParamObj(map, prefix + "ActivityPara.", this.ActivityPara);

    }
}

