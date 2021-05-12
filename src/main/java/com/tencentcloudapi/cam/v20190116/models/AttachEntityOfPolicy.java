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

public class AttachEntityOfPolicy extends AbstractModel{

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
    * 策略关联时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachmentTime")
    @Expose
    private String AttachmentTime;

    /**
     * Get 实体ID 
     * @return Id 实体ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 实体ID
     * @param Id 实体ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 实体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实体Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 实体Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 关联类型。1 用户关联 ； 2 用户组关联 
     * @return RelatedType 关联类型。1 用户关联 ； 2 用户组关联
     */
    public Long getRelatedType() {
        return this.RelatedType;
    }

    /**
     * Set 关联类型。1 用户关联 ； 2 用户组关联
     * @param RelatedType 关联类型。1 用户关联 ； 2 用户组关联
     */
    public void setRelatedType(Long RelatedType) {
        this.RelatedType = RelatedType;
    }

    /**
     * Get 策略关联时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachmentTime 策略关联时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttachmentTime() {
        return this.AttachmentTime;
    }

    /**
     * Set 策略关联时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachmentTime 策略关联时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachmentTime(String AttachmentTime) {
        this.AttachmentTime = AttachmentTime;
    }

    public AttachEntityOfPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachEntityOfPolicy(AttachEntityOfPolicy source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.RelatedType != null) {
            this.RelatedType = new Long(source.RelatedType);
        }
        if (source.AttachmentTime != null) {
            this.AttachmentTime = new String(source.AttachmentTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RelatedType", this.RelatedType);
        this.setParamSimple(map, prefix + "AttachmentTime", this.AttachmentTime);

    }
}

