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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyIdItem extends AbstractModel {

    /**
    * 身份id。
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 身份类型。0-未定义 2-长期身份 3-临时身份
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * 创建者账号uin用户。
    */
    @SerializedName("CreatorUin")
    @Expose
    private DspmUinUser CreatorUin;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 状态。0-不活跃 1-活跃
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
     * Get 身份id。 
     * @return IdentifyId 身份id。
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set 身份id。
     * @param IdentifyId 身份id。
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 身份类型。0-未定义 2-长期身份 3-临时身份 
     * @return IdentifyType 身份类型。0-未定义 2-长期身份 3-临时身份
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 身份类型。0-未定义 2-长期身份 3-临时身份
     * @param IdentifyType 身份类型。0-未定义 2-长期身份 3-临时身份
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 所属云账号uin用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建者账号uin用户。 
     * @return CreatorUin 创建者账号uin用户。
     */
    public DspmUinUser getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者账号uin用户。
     * @param CreatorUin 创建者账号uin用户。
     */
    public void setCreatorUin(DspmUinUser CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 状态。0-不活跃 1-活跃 
     * @return Status 状态。0-不活跃 1-活跃
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。0-不活跃 1-活跃
     * @param Status 状态。0-不活跃 1-活跃
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Person 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Person 所属个人用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    public DspmIdentifyIdItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyIdItem(DspmIdentifyIdItem source) {
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new DspmUinUser(source.CreatorUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "CreatorUin.", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Person.", this.Person);

    }
}

