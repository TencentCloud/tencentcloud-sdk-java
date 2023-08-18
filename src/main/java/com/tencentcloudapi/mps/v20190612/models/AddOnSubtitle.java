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

public class AddOnSubtitle extends AbstractModel{

    /**
    * 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption：编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subtitle")
    @Expose
    private MediaInputInfo Subtitle;

    /**
     * Get 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption：编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption：编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption：编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 插入形式，可选值：
<li>subtitle-stream：插入字幕轨道</li>
<li>close-caption：编码到SEI帧</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subtitle 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subtitle 字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitle(MediaInputInfo Subtitle) {
        this.Subtitle = Subtitle;
    }

    public AddOnSubtitle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnSubtitle(AddOnSubtitle source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new MediaInputInfo(source.Subtitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);

    }
}

