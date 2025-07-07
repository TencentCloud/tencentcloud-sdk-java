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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WidgetListVO extends AbstractModel {

    /**
    * uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页面id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 组件数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetList")
    @Expose
    private WidgetVO [] WidgetList;

    /**
     * Get uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页面id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageId 页面id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set 页面id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageId 页面id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 组件数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetList 组件数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WidgetVO [] getWidgetList() {
        return this.WidgetList;
    }

    /**
     * Set 组件数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetList 组件数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetList(WidgetVO [] WidgetList) {
        this.WidgetList = WidgetList;
    }

    public WidgetListVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WidgetListVO(WidgetListVO source) {
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.WidgetList != null) {
            this.WidgetList = new WidgetVO[source.WidgetList.length];
            for (int i = 0; i < source.WidgetList.length; i++) {
                this.WidgetList[i] = new WidgetVO(source.WidgetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamArrayObj(map, prefix + "WidgetList.", this.WidgetList);

    }
}

