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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVTagGroupInfo extends AbstractModel{

    /**
    * 分组 Id。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签列表。
    */
    @SerializedName("TagInfoSet")
    @Expose
    private KTVTagInfo [] TagInfoSet;

    /**
     * Get 分组 Id。 
     * @return GroupId 分组 Id。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组 Id。
     * @param GroupId 分组 Id。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名。 
     * @return Name 分组名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分组名。
     * @param Name 分组名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签列表。 
     * @return TagInfoSet 标签列表。
     */
    public KTVTagInfo [] getTagInfoSet() {
        return this.TagInfoSet;
    }

    /**
     * Set 标签列表。
     * @param TagInfoSet 标签列表。
     */
    public void setTagInfoSet(KTVTagInfo [] TagInfoSet) {
        this.TagInfoSet = TagInfoSet;
    }

    public KTVTagGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVTagGroupInfo(KTVTagGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TagInfoSet != null) {
            this.TagInfoSet = new KTVTagInfo[source.TagInfoSet.length];
            for (int i = 0; i < source.TagInfoSet.length; i++) {
                this.TagInfoSet[i] = new KTVTagInfo(source.TagInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TagInfoSet.", this.TagInfoSet);

    }
}

