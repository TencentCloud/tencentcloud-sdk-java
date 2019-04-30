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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachEntityOfPolicy  extends AbstractModel{

    /**
    * 实体ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 实体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实体Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 关联类型。1 用户关联 ； 2 用户组关联
    */
    @SerializedName("RelatedType")
    @Expose
    private Long RelatedType;

    /**
     * 获取实体ID
     * @return Id 实体ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置实体ID
     * @param Id 实体ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取实体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return Name 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置实体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @return Uin 实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * 设置实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取关联类型。1 用户关联 ； 2 用户组关联
     * @return RelatedType 关联类型。1 用户关联 ； 2 用户组关联
     */
    public Long getRelatedType() {
        return this.RelatedType;
    }

    /**
     * 设置关联类型。1 用户关联 ； 2 用户组关联
     * @param RelatedType 关联类型。1 用户关联 ； 2 用户组关联
     */
    public void setRelatedType(Long RelatedType) {
        this.RelatedType = RelatedType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RelatedType", this.RelatedType);

    }
}

