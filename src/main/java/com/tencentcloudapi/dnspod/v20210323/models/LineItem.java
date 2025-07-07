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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineItem extends AbstractModel {

    /**
    * 解析线路名称。
    */
    @SerializedName("LineName")
    @Expose
    private String LineName;

    /**
    * 解析线路 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * 当前线路在当前域名下是否可用。
    */
    @SerializedName("Useful")
    @Expose
    private Boolean Useful;

    /**
    * 当前线路最低套餐等级要求。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 当前线路分类下的子线路列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubGroup")
    @Expose
    private LineItem [] SubGroup;

    /**
    * 自定义线路分组内包含的线路。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lines")
    @Expose
    private String [] Lines;

    /**
     * Get 解析线路名称。 
     * @return LineName 解析线路名称。
     */
    public String getLineName() {
        return this.LineName;
    }

    /**
     * Set 解析线路名称。
     * @param LineName 解析线路名称。
     */
    public void setLineName(String LineName) {
        this.LineName = LineName;
    }

    /**
     * Get 解析线路 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineId 解析线路 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 解析线路 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineId 解析线路 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get 当前线路在当前域名下是否可用。 
     * @return Useful 当前线路在当前域名下是否可用。
     */
    public Boolean getUseful() {
        return this.Useful;
    }

    /**
     * Set 当前线路在当前域名下是否可用。
     * @param Useful 当前线路在当前域名下是否可用。
     */
    public void setUseful(Boolean Useful) {
        this.Useful = Useful;
    }

    /**
     * Get 当前线路最低套餐等级要求。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade 当前线路最低套餐等级要求。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 当前线路最低套餐等级要求。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade 当前线路最低套餐等级要求。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 当前线路分类下的子线路列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubGroup 当前线路分类下的子线路列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineItem [] getSubGroup() {
        return this.SubGroup;
    }

    /**
     * Set 当前线路分类下的子线路列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubGroup 当前线路分类下的子线路列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubGroup(LineItem [] SubGroup) {
        this.SubGroup = SubGroup;
    }

    /**
     * Get 自定义线路分组内包含的线路。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lines 自定义线路分组内包含的线路。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLines() {
        return this.Lines;
    }

    /**
     * Set 自定义线路分组内包含的线路。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lines 自定义线路分组内包含的线路。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLines(String [] Lines) {
        this.Lines = Lines;
    }

    public LineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineItem(LineItem source) {
        if (source.LineName != null) {
            this.LineName = new String(source.LineName);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Useful != null) {
            this.Useful = new Boolean(source.Useful);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.SubGroup != null) {
            this.SubGroup = new LineItem[source.SubGroup.length];
            for (int i = 0; i < source.SubGroup.length; i++) {
                this.SubGroup[i] = new LineItem(source.SubGroup[i]);
            }
        }
        if (source.Lines != null) {
            this.Lines = new String[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new String(source.Lines[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineName", this.LineName);
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Useful", this.Useful);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamArrayObj(map, prefix + "SubGroup.", this.SubGroup);
        this.setParamArraySimple(map, prefix + "Lines.", this.Lines);

    }
}

