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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Activity extends AbstractModel {

    /**
    * <p>原子任务类型：</p><li>input: 起始节点</li><li>output：终止节点</li><li>action-trans：转码</li><li>action-samplesnapshot：采样截图</li><li>action-AIAnalysis: 分析</li><li>action-AIRecognition：识别</li><li>action-aiReview：审核</li><li>action-animated-graphics：转动图</li><li>action-image-sprite：雪碧图</li><li>action-snapshotByTimeOffset: 时间点截图</li><li>action-adaptive-substream：自适应码流</li><li>action-AIQualityControl：媒体质检</li><li>action-SmartSubtitles：智能字幕</li><li>action-exec-rules：判断规则</li><li>action-SmartErase：智能擦除</li>
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * <p>前驱节点索引数组。<br>注意：创建和修改编排时，该参数无效，由服务端自动生成。</p>
    */
    @SerializedName("PredriveIndex")
    @Expose
    private Long [] PredriveIndex;

    /**
    * <p>后驱节点索引数组</p>
    */
    @SerializedName("ReardriveIndex")
    @Expose
    private Long [] ReardriveIndex;

    /**
    * <p>原子任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityPara")
    @Expose
    private ActivityPara ActivityPara;

    /**
     * Get <p>原子任务类型：</p><li>input: 起始节点</li><li>output：终止节点</li><li>action-trans：转码</li><li>action-samplesnapshot：采样截图</li><li>action-AIAnalysis: 分析</li><li>action-AIRecognition：识别</li><li>action-aiReview：审核</li><li>action-animated-graphics：转动图</li><li>action-image-sprite：雪碧图</li><li>action-snapshotByTimeOffset: 时间点截图</li><li>action-adaptive-substream：自适应码流</li><li>action-AIQualityControl：媒体质检</li><li>action-SmartSubtitles：智能字幕</li><li>action-exec-rules：判断规则</li><li>action-SmartErase：智能擦除</li> 
     * @return ActivityType <p>原子任务类型：</p><li>input: 起始节点</li><li>output：终止节点</li><li>action-trans：转码</li><li>action-samplesnapshot：采样截图</li><li>action-AIAnalysis: 分析</li><li>action-AIRecognition：识别</li><li>action-aiReview：审核</li><li>action-animated-graphics：转动图</li><li>action-image-sprite：雪碧图</li><li>action-snapshotByTimeOffset: 时间点截图</li><li>action-adaptive-substream：自适应码流</li><li>action-AIQualityControl：媒体质检</li><li>action-SmartSubtitles：智能字幕</li><li>action-exec-rules：判断规则</li><li>action-SmartErase：智能擦除</li>
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set <p>原子任务类型：</p><li>input: 起始节点</li><li>output：终止节点</li><li>action-trans：转码</li><li>action-samplesnapshot：采样截图</li><li>action-AIAnalysis: 分析</li><li>action-AIRecognition：识别</li><li>action-aiReview：审核</li><li>action-animated-graphics：转动图</li><li>action-image-sprite：雪碧图</li><li>action-snapshotByTimeOffset: 时间点截图</li><li>action-adaptive-substream：自适应码流</li><li>action-AIQualityControl：媒体质检</li><li>action-SmartSubtitles：智能字幕</li><li>action-exec-rules：判断规则</li><li>action-SmartErase：智能擦除</li>
     * @param ActivityType <p>原子任务类型：</p><li>input: 起始节点</li><li>output：终止节点</li><li>action-trans：转码</li><li>action-samplesnapshot：采样截图</li><li>action-AIAnalysis: 分析</li><li>action-AIRecognition：识别</li><li>action-aiReview：审核</li><li>action-animated-graphics：转动图</li><li>action-image-sprite：雪碧图</li><li>action-snapshotByTimeOffset: 时间点截图</li><li>action-adaptive-substream：自适应码流</li><li>action-AIQualityControl：媒体质检</li><li>action-SmartSubtitles：智能字幕</li><li>action-exec-rules：判断规则</li><li>action-SmartErase：智能擦除</li>
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get <p>前驱节点索引数组。<br>注意：创建和修改编排时，该参数无效，由服务端自动生成。</p> 
     * @return PredriveIndex <p>前驱节点索引数组。<br>注意：创建和修改编排时，该参数无效，由服务端自动生成。</p>
     */
    public Long [] getPredriveIndex() {
        return this.PredriveIndex;
    }

    /**
     * Set <p>前驱节点索引数组。<br>注意：创建和修改编排时，该参数无效，由服务端自动生成。</p>
     * @param PredriveIndex <p>前驱节点索引数组。<br>注意：创建和修改编排时，该参数无效，由服务端自动生成。</p>
     */
    public void setPredriveIndex(Long [] PredriveIndex) {
        this.PredriveIndex = PredriveIndex;
    }

    /**
     * Get <p>后驱节点索引数组</p> 
     * @return ReardriveIndex <p>后驱节点索引数组</p>
     */
    public Long [] getReardriveIndex() {
        return this.ReardriveIndex;
    }

    /**
     * Set <p>后驱节点索引数组</p>
     * @param ReardriveIndex <p>后驱节点索引数组</p>
     */
    public void setReardriveIndex(Long [] ReardriveIndex) {
        this.ReardriveIndex = ReardriveIndex;
    }

    /**
     * Get <p>原子任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityPara <p>原子任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ActivityPara getActivityPara() {
        return this.ActivityPara;
    }

    /**
     * Set <p>原子任务参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityPara <p>原子任务参数</p>
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
        if (source.PredriveIndex != null) {
            this.PredriveIndex = new Long[source.PredriveIndex.length];
            for (int i = 0; i < source.PredriveIndex.length; i++) {
                this.PredriveIndex[i] = new Long(source.PredriveIndex[i]);
            }
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
        this.setParamArraySimple(map, prefix + "PredriveIndex.", this.PredriveIndex);
        this.setParamArraySimple(map, prefix + "ReardriveIndex.", this.ReardriveIndex);
        this.setParamObj(map, prefix + "ActivityPara.", this.ActivityPara);

    }
}

