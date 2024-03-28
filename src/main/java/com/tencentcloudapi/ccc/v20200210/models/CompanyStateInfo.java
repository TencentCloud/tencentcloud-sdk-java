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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompanyStateInfo extends AbstractModel {

    /**
    * 申请单ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公司名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 审核时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckTime")
    @Expose
    private Long CheckTime;

    /**
    * 审核备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckMsg")
    @Expose
    private String CheckMsg;

    /**
    * 审核状态，1-待审核，2-审核通过，3-驳回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 公司统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
     * Get 申请单ID 
     * @return Id 申请单ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 申请单ID
     * @param Id 申请单ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公司名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyName 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyName 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审核时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckTime 审核时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set 审核时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckTime 审核时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckTime(Long CheckTime) {
        this.CheckTime = CheckTime;
    }

    /**
     * Get 审核备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckMsg 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckMsg() {
        return this.CheckMsg;
    }

    /**
     * Set 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckMsg 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckMsg(String CheckMsg) {
        this.CheckMsg = CheckMsg;
    }

    /**
     * Get 审核状态，1-待审核，2-审核通过，3-驳回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 审核状态，1-待审核，2-审核通过，3-驳回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 审核状态，1-待审核，2-审核通过，3-驳回
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 审核状态，1-待审核，2-审核通过，3-驳回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 公司统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 公司统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 公司统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 公司统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    public CompanyStateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompanyStateInfo(CompanyStateInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new Long(source.CheckTime);
        }
        if (source.CheckMsg != null) {
            this.CheckMsg = new String(source.CheckMsg);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);
        this.setParamSimple(map, prefix + "CheckMsg", this.CheckMsg);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);

    }
}

