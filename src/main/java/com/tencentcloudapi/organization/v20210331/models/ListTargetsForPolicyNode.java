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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTargetsForPolicyNode extends AbstractModel {

    /**
    * scp账号uin或节点Id
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 关联类型 1-节点关联 2-用户关联
    */
    @SerializedName("RelatedType")
    @Expose
    private Long RelatedType;

    /**
    * 账号或者节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 绑定时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get scp账号uin或节点Id 
     * @return Uin scp账号uin或节点Id
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set scp账号uin或节点Id
     * @param Uin scp账号uin或节点Id
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 关联类型 1-节点关联 2-用户关联 
     * @return RelatedType 关联类型 1-节点关联 2-用户关联
     */
    public Long getRelatedType() {
        return this.RelatedType;
    }

    /**
     * Set 关联类型 1-节点关联 2-用户关联
     * @param RelatedType 关联类型 1-节点关联 2-用户关联
     */
    public void setRelatedType(Long RelatedType) {
        this.RelatedType = RelatedType;
    }

    /**
     * Get 账号或者节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 账号或者节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号或者节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 账号或者节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 绑定时间 
     * @return AddTime 绑定时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 绑定时间
     * @param AddTime 绑定时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    public ListTargetsForPolicyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTargetsForPolicyNode(ListTargetsForPolicyNode source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.RelatedType != null) {
            this.RelatedType = new Long(source.RelatedType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RelatedType", this.RelatedType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

