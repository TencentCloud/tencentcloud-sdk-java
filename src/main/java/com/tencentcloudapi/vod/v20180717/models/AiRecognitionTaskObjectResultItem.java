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

public class AiRecognitionTaskObjectResultItem  extends AbstractModel{

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
     * 获取识别的物体名称。
     * @return Name 识别的物体名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置识别的物体名称。
     * @param Name 识别的物体名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取物体出现的片段列表。
     * @return SegmentSet 物体出现的片段列表。
     */
    public AiRecognitionTaskObjectSeqmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * 设置物体出现的片段列表。
     * @param SegmentSet 物体出现的片段列表。
     */
    public void setSegmentSet(AiRecognitionTaskObjectSeqmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

