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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognitionTag extends AbstractModel{

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 置信分：0～100，数值越大表示置信度越高
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 标签位置信息，若模型无位置信息，则可能为零值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 置信分：0～100，数值越大表示置信度越高
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 置信分：0～100，数值越大表示置信度越高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 置信分：0～100，数值越大表示置信度越高
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 置信分：0～100，数值越大表示置信度越高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 标签位置信息，若模型无位置信息，则可能为零值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 标签位置信息，若模型无位置信息，则可能为零值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 标签位置信息，若模型无位置信息，则可能为零值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 标签位置信息，若模型无位置信息，则可能为零值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public RecognitionTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognitionTag(RecognitionTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

