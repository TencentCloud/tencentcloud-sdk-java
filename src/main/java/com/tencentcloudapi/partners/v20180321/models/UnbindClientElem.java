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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindClientElem extends AbstractModel{

    /**
    * 解绑账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 状态：0:审核中；1：已解绑；2：已撤销 3：关联撤销 4: 已驳回
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 申请时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 解绑/撤销时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
     * Get 解绑账号ID 
     * @return Uin 解绑账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 解绑账号ID
     * @param Uin 解绑账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 状态：0:审核中；1：已解绑；2：已撤销 3：关联撤销 4: 已驳回 
     * @return Status 状态：0:审核中；1：已解绑；2：已撤销 3：关联撤销 4: 已驳回
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0:审核中；1：已解绑；2：已撤销 3：关联撤销 4: 已驳回
     * @param Status 状态：0:审核中；1：已解绑；2：已撤销 3：关联撤销 4: 已驳回
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 申请时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 解绑/撤销时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionTime 解绑/撤销时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set 解绑/撤销时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionTime 解绑/撤销时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    public UnbindClientElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindClientElem(UnbindClientElem source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);

    }
}

