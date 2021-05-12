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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnInstanceSets extends AbstractModel{

    /**
    * 云联网账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 云联网 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网关联时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 云联网实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 云联网状态：申请中、已连接、已过期、已拒绝、已删除、失败的、关联中、解关联中、解关联失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get 云联网账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountId 云联网账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 云联网账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountId 云联网账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 云联网 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId 云联网 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId 云联网 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网关联时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 云联网关联时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 云联网关联时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 云联网关联时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 云联网实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 云联网实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 云联网实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 云联网实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 云联网状态：申请中、已连接、已过期、已拒绝、已删除、失败的、关联中、解关联中、解关联失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 云联网状态：申请中、已连接、已过期、已拒绝、已删除、失败的、关联中、解关联中、解关联失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 云联网状态：申请中、已连接、已过期、已拒绝、已删除、失败的、关联中、解关联中、解关联失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 云联网状态：申请中、已连接、已过期、已拒绝、已删除、失败的、关联中、解关联中、解关联失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    public CcnInstanceSets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnInstanceSets(CcnInstanceSets source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

