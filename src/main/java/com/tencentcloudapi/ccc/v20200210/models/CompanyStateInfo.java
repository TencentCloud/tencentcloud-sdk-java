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
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 审核时间
    */
    @SerializedName("CheckTime")
    @Expose
    private Long CheckTime;

    /**
    * 审核备注
    */
    @SerializedName("CheckMsg")
    @Expose
    private String CheckMsg;

    /**
    * 审核状态，1-待审核，2-审核通过，3-驳回
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 公司统一社会信用代码
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 合同编号
    */
    @SerializedName("ContractNo")
    @Expose
    private String ContractNo;

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
     * @return CompanyName 公司名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审核时间 
     * @return CheckTime 审核时间
     */
    public Long getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set 审核时间
     * @param CheckTime 审核时间
     */
    public void setCheckTime(Long CheckTime) {
        this.CheckTime = CheckTime;
    }

    /**
     * Get 审核备注 
     * @return CheckMsg 审核备注
     */
    public String getCheckMsg() {
        return this.CheckMsg;
    }

    /**
     * Set 审核备注
     * @param CheckMsg 审核备注
     */
    public void setCheckMsg(String CheckMsg) {
        this.CheckMsg = CheckMsg;
    }

    /**
     * Get 审核状态，1-待审核，2-审核通过，3-驳回 
     * @return State 审核状态，1-待审核，2-审核通过，3-驳回
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 审核状态，1-待审核，2-审核通过，3-驳回
     * @param State 审核状态，1-待审核，2-审核通过，3-驳回
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 公司统一社会信用代码 
     * @return BusinessId 公司统一社会信用代码
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 公司统一社会信用代码
     * @param BusinessId 公司统一社会信用代码
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 合同编号 
     * @return ContractNo 合同编号
     */
    public String getContractNo() {
        return this.ContractNo;
    }

    /**
     * Set 合同编号
     * @param ContractNo 合同编号
     */
    public void setContractNo(String ContractNo) {
        this.ContractNo = ContractNo;
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.ContractNo != null) {
            this.ContractNo = new String(source.ContractNo);
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
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ContractNo", this.ContractNo);

    }
}

