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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditGroupClassInfo extends AbstractModel {

    /**
    * <p>标签组分类中文名。</p>
    */
    @SerializedName("GroupClassName")
    @Expose
    private String GroupClassName;

    /**
    * <p>标签组分类英文名。</p>
    */
    @SerializedName("GroupClassEname")
    @Expose
    private String GroupClassEname;

    /**
    * <p>标签组列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelGroupList")
    @Expose
    private AuditLabelGroupInfo [] LabelGroupList;

    /**
     * Get <p>标签组分类中文名。</p> 
     * @return GroupClassName <p>标签组分类中文名。</p>
     */
    public String getGroupClassName() {
        return this.GroupClassName;
    }

    /**
     * Set <p>标签组分类中文名。</p>
     * @param GroupClassName <p>标签组分类中文名。</p>
     */
    public void setGroupClassName(String GroupClassName) {
        this.GroupClassName = GroupClassName;
    }

    /**
     * Get <p>标签组分类英文名。</p> 
     * @return GroupClassEname <p>标签组分类英文名。</p>
     */
    public String getGroupClassEname() {
        return this.GroupClassEname;
    }

    /**
     * Set <p>标签组分类英文名。</p>
     * @param GroupClassEname <p>标签组分类英文名。</p>
     */
    public void setGroupClassEname(String GroupClassEname) {
        this.GroupClassEname = GroupClassEname;
    }

    /**
     * Get <p>标签组列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelGroupList <p>标签组列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuditLabelGroupInfo [] getLabelGroupList() {
        return this.LabelGroupList;
    }

    /**
     * Set <p>标签组列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelGroupList <p>标签组列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelGroupList(AuditLabelGroupInfo [] LabelGroupList) {
        this.LabelGroupList = LabelGroupList;
    }

    public AuditGroupClassInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditGroupClassInfo(AuditGroupClassInfo source) {
        if (source.GroupClassName != null) {
            this.GroupClassName = new String(source.GroupClassName);
        }
        if (source.GroupClassEname != null) {
            this.GroupClassEname = new String(source.GroupClassEname);
        }
        if (source.LabelGroupList != null) {
            this.LabelGroupList = new AuditLabelGroupInfo[source.LabelGroupList.length];
            for (int i = 0; i < source.LabelGroupList.length; i++) {
                this.LabelGroupList[i] = new AuditLabelGroupInfo(source.LabelGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupClassName", this.GroupClassName);
        this.setParamSimple(map, prefix + "GroupClassEname", this.GroupClassEname);
        this.setParamArrayObj(map, prefix + "LabelGroupList.", this.LabelGroupList);

    }
}

