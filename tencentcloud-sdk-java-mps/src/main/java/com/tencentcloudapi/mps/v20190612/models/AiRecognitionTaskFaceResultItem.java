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

public class AiRecognitionTaskFaceResultItem extends AbstractModel{

    /**
    * 人物唯一标识 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 人物名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人物出现的片段结果集。
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskFaceSegmentItem [] SegmentSet;

    /**
     * Get 人物唯一标识 ID。 
     * @return Id 人物唯一标识 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 人物唯一标识 ID。
     * @param Id 人物唯一标识 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li> 
     * @return Type 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
     * @param Type 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 人物名称。 
     * @return Name 人物名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人物名称。
     * @param Name 人物名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人物出现的片段结果集。 
     * @return SegmentSet 人物出现的片段结果集。
     */
    public AiRecognitionTaskFaceSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 人物出现的片段结果集。
     * @param SegmentSet 人物出现的片段结果集。
     */
    public void setSegmentSet(AiRecognitionTaskFaceSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

