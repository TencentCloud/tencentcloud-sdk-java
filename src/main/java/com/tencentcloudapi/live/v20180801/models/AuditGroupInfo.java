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

public class AuditGroupInfo extends AbstractModel {

    /**
    * <p>标签类型。<br>可取值：TagImage，TagText，TagAudio。</p>
    */
    @SerializedName("TagType")
    @Expose
    private String TagType;

    /**
    * <p>标签组分类列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupClassList")
    @Expose
    private AuditGroupClassInfo [] GroupClassList;

    /**
     * Get <p>标签类型。<br>可取值：TagImage，TagText，TagAudio。</p> 
     * @return TagType <p>标签类型。<br>可取值：TagImage，TagText，TagAudio。</p>
     */
    public String getTagType() {
        return this.TagType;
    }

    /**
     * Set <p>标签类型。<br>可取值：TagImage，TagText，TagAudio。</p>
     * @param TagType <p>标签类型。<br>可取值：TagImage，TagText，TagAudio。</p>
     */
    public void setTagType(String TagType) {
        this.TagType = TagType;
    }

    /**
     * Get <p>标签组分类列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupClassList <p>标签组分类列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuditGroupClassInfo [] getGroupClassList() {
        return this.GroupClassList;
    }

    /**
     * Set <p>标签组分类列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupClassList <p>标签组分类列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupClassList(AuditGroupClassInfo [] GroupClassList) {
        this.GroupClassList = GroupClassList;
    }

    public AuditGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditGroupInfo(AuditGroupInfo source) {
        if (source.TagType != null) {
            this.TagType = new String(source.TagType);
        }
        if (source.GroupClassList != null) {
            this.GroupClassList = new AuditGroupClassInfo[source.GroupClassList.length];
            for (int i = 0; i < source.GroupClassList.length; i++) {
                this.GroupClassList[i] = new AuditGroupClassInfo(source.GroupClassList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagType", this.TagType);
        this.setParamArrayObj(map, prefix + "GroupClassList.", this.GroupClassList);

    }
}

