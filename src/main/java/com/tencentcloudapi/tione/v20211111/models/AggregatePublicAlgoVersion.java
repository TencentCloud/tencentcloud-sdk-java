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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggregatePublicAlgoVersion extends AbstractModel {

    /**
    * 用于聚合的系列名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 算法公共版本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAlgoVersions")
    @Expose
    private PublicAlgoVersion [] PublicAlgoVersions;

    /**
     * Get 用于聚合的系列名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 用于聚合的系列名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用于聚合的系列名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 用于聚合的系列名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 算法公共版本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAlgoVersions 算法公共版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicAlgoVersion [] getPublicAlgoVersions() {
        return this.PublicAlgoVersions;
    }

    /**
     * Set 算法公共版本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAlgoVersions 算法公共版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAlgoVersions(PublicAlgoVersion [] PublicAlgoVersions) {
        this.PublicAlgoVersions = PublicAlgoVersions;
    }

    public AggregatePublicAlgoVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregatePublicAlgoVersion(AggregatePublicAlgoVersion source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PublicAlgoVersions != null) {
            this.PublicAlgoVersions = new PublicAlgoVersion[source.PublicAlgoVersions.length];
            for (int i = 0; i < source.PublicAlgoVersions.length; i++) {
                this.PublicAlgoVersions[i] = new PublicAlgoVersion(source.PublicAlgoVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "PublicAlgoVersions.", this.PublicAlgoVersions);

    }
}

