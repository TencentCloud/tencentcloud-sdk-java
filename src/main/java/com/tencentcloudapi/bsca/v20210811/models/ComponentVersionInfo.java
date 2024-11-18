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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentVersionInfo extends AbstractModel {

    /**
    * 版本发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 当前版本的所有copyright
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CopyrightList")
    @Expose
    private String [] CopyrightList;

    /**
    * 版本标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get 版本发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishTime 版本发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 版本发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishTime 版本发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 当前版本的所有copyright
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CopyrightList 当前版本的所有copyright
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCopyrightList() {
        return this.CopyrightList;
    }

    /**
     * Set 当前版本的所有copyright
注意：此字段可能返回 null，表示取不到有效值。
     * @param CopyrightList 当前版本的所有copyright
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCopyrightList(String [] CopyrightList) {
        this.CopyrightList = CopyrightList;
    }

    /**
     * Get 版本标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 版本标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 版本标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 版本标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public ComponentVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentVersionInfo(ComponentVersionInfo source) {
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.CopyrightList != null) {
            this.CopyrightList = new String[source.CopyrightList.length];
            for (int i = 0; i < source.CopyrightList.length; i++) {
                this.CopyrightList[i] = new String(source.CopyrightList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamArraySimple(map, prefix + "CopyrightList.", this.CopyrightList);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

