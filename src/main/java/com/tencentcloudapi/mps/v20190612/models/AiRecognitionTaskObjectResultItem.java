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

public class AiRecognitionTaskObjectResultItem extends AbstractModel {

    /**
    * 识别的物体名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 物体出现的片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskObjectSeqmentItem [] SegmentSet;

    /**
     * Get 识别的物体名称。 
     * @return Name 识别的物体名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别的物体名称。
     * @param Name 识别的物体名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 物体出现的片段列表。 
     * @return SegmentSet 物体出现的片段列表。
     */
    public AiRecognitionTaskObjectSeqmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 物体出现的片段列表。
     * @param SegmentSet 物体出现的片段列表。
     */
    public void setSegmentSet(AiRecognitionTaskObjectSeqmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public AiRecognitionTaskObjectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskObjectResultItem(AiRecognitionTaskObjectResultItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskObjectSeqmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskObjectSeqmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

