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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialModifiedEvent extends AbstractModel{

    /**
    * 媒体 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 更新后的媒体名称。如未更新则为空。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 更新后的媒体预置标签列表。如未更新媒体预置标签，则该字段为空数组。
    */
    @SerializedName("PresetTagIdSet")
    @Expose
    private String [] PresetTagIdSet;

    /**
    * 更新后的媒体自定义标签列表。如未更新媒体自定义标签，则该字段为空数组。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
     * Get 媒体 Id。 
     * @return MaterialId 媒体 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 媒体 Id。
     * @param MaterialId 媒体 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 更新后的媒体名称。如未更新则为空。 
     * @return Name 更新后的媒体名称。如未更新则为空。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 更新后的媒体名称。如未更新则为空。
     * @param Name 更新后的媒体名称。如未更新则为空。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 更新后的媒体预置标签列表。如未更新媒体预置标签，则该字段为空数组。 
     * @return PresetTagIdSet 更新后的媒体预置标签列表。如未更新媒体预置标签，则该字段为空数组。
     */
    public String [] getPresetTagIdSet() {
        return this.PresetTagIdSet;
    }

    /**
     * Set 更新后的媒体预置标签列表。如未更新媒体预置标签，则该字段为空数组。
     * @param PresetTagIdSet 更新后的媒体预置标签列表。如未更新媒体预置标签，则该字段为空数组。
     */
    public void setPresetTagIdSet(String [] PresetTagIdSet) {
        this.PresetTagIdSet = PresetTagIdSet;
    }

    /**
     * Get 更新后的媒体自定义标签列表。如未更新媒体自定义标签，则该字段为空数组。 
     * @return TagSet 更新后的媒体自定义标签列表。如未更新媒体自定义标签，则该字段为空数组。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 更新后的媒体自定义标签列表。如未更新媒体自定义标签，则该字段为空数组。
     * @param TagSet 更新后的媒体自定义标签列表。如未更新媒体自定义标签，则该字段为空数组。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    public MaterialModifiedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialModifiedEvent(MaterialModifiedEvent source) {
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PresetTagIdSet != null) {
            this.PresetTagIdSet = new String[source.PresetTagIdSet.length];
            for (int i = 0; i < source.PresetTagIdSet.length; i++) {
                this.PresetTagIdSet[i] = new String(source.PresetTagIdSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "PresetTagIdSet.", this.PresetTagIdSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);

    }
}

