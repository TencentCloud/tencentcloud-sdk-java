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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaFilter extends AbstractModel{

    /**
    * 媒资名称过滤条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaNameSet")
    @Expose
    private String [] MediaNameSet;

    /**
    * 媒资状态数组，媒资状态可选值参见MediaInfo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * 媒资ID数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaIdSet")
    @Expose
    private String [] MediaIdSet;

    /**
    * 媒资自定义标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
     * Get 媒资名称过滤条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaNameSet 媒资名称过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMediaNameSet() {
        return this.MediaNameSet;
    }

    /**
     * Set 媒资名称过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaNameSet 媒资名称过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaNameSet(String [] MediaNameSet) {
        this.MediaNameSet = MediaNameSet;
    }

    /**
     * Get 媒资状态数组，媒资状态可选值参见MediaInfo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusSet 媒资状态数组，媒资状态可选值参见MediaInfo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 媒资状态数组，媒资状态可选值参见MediaInfo
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusSet 媒资状态数组，媒资状态可选值参见MediaInfo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 媒资ID数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaIdSet 媒资ID数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMediaIdSet() {
        return this.MediaIdSet;
    }

    /**
     * Set 媒资ID数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaIdSet 媒资ID数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaIdSet(String [] MediaIdSet) {
        this.MediaIdSet = MediaIdSet;
    }

    /**
     * Get 媒资自定义标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelSet 媒资自定义标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set 媒资自定义标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelSet 媒资自定义标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    public MediaFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaFilter(MediaFilter source) {
        if (source.MediaNameSet != null) {
            this.MediaNameSet = new String[source.MediaNameSet.length];
            for (int i = 0; i < source.MediaNameSet.length; i++) {
                this.MediaNameSet[i] = new String(source.MediaNameSet[i]);
            }
        }
        if (source.StatusSet != null) {
            this.StatusSet = new Long[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new Long(source.StatusSet[i]);
            }
        }
        if (source.MediaIdSet != null) {
            this.MediaIdSet = new String[source.MediaIdSet.length];
            for (int i = 0; i < source.MediaIdSet.length; i++) {
                this.MediaIdSet[i] = new String(source.MediaIdSet[i]);
            }
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MediaNameSet.", this.MediaNameSet);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamArraySimple(map, prefix + "MediaIdSet.", this.MediaIdSet);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);

    }
}

