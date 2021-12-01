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

public class MultiLevelTag extends AbstractModel{

    /**
    * 树状标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private L1Tag [] TagSet;

    /**
    * 标签在识别结果中的定位信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppearInfo")
    @Expose
    private AppearInfo AppearInfo;

    /**
     * Get 树状标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 树状标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public L1Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 树状标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 树状标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(L1Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 标签在识别结果中的定位信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppearInfo 标签在识别结果中的定位信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppearInfo getAppearInfo() {
        return this.AppearInfo;
    }

    /**
     * Set 标签在识别结果中的定位信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppearInfo 标签在识别结果中的定位信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppearInfo(AppearInfo AppearInfo) {
        this.AppearInfo = AppearInfo;
    }

    public MultiLevelTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiLevelTag(MultiLevelTag source) {
        if (source.TagSet != null) {
            this.TagSet = new L1Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new L1Tag(source.TagSet[i]);
            }
        }
        if (source.AppearInfo != null) {
            this.AppearInfo = new AppearInfo(source.AppearInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamObj(map, prefix + "AppearInfo.", this.AppearInfo);

    }
}

