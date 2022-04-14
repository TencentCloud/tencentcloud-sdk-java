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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAttachmentInfo extends AbstractModel{

    /**
    * 附加项金额。
附加项的金额（必须是正数，单位：分），代表积分的数量、抵扣的金额、溢价的金额、补贴的金额
    */
    @SerializedName("AttachmentAmount")
    @Expose
    private Long AttachmentAmount;

    /**
    * 附加项类型。
Add：加项；
Sub：减项；
Point：积分项；
Subsidy：补贴项。
    */
    @SerializedName("AttachmentType")
    @Expose
    private String AttachmentType;

    /**
    * 附加项名称。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
    */
    @SerializedName("AttachmentName")
    @Expose
    private String AttachmentName;

    /**
    * 附加项编号。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
    */
    @SerializedName("AttachmentCode")
    @Expose
    private String AttachmentCode;

    /**
     * Get 附加项金额。
附加项的金额（必须是正数，单位：分），代表积分的数量、抵扣的金额、溢价的金额、补贴的金额 
     * @return AttachmentAmount 附加项金额。
附加项的金额（必须是正数，单位：分），代表积分的数量、抵扣的金额、溢价的金额、补贴的金额
     */
    public Long getAttachmentAmount() {
        return this.AttachmentAmount;
    }

    /**
     * Set 附加项金额。
附加项的金额（必须是正数，单位：分），代表积分的数量、抵扣的金额、溢价的金额、补贴的金额
     * @param AttachmentAmount 附加项金额。
附加项的金额（必须是正数，单位：分），代表积分的数量、抵扣的金额、溢价的金额、补贴的金额
     */
    public void setAttachmentAmount(Long AttachmentAmount) {
        this.AttachmentAmount = AttachmentAmount;
    }

    /**
     * Get 附加项类型。
Add：加项；
Sub：减项；
Point：积分项；
Subsidy：补贴项。 
     * @return AttachmentType 附加项类型。
Add：加项；
Sub：减项；
Point：积分项；
Subsidy：补贴项。
     */
    public String getAttachmentType() {
        return this.AttachmentType;
    }

    /**
     * Set 附加项类型。
Add：加项；
Sub：减项；
Point：积分项；
Subsidy：补贴项。
     * @param AttachmentType 附加项类型。
Add：加项；
Sub：减项；
Point：积分项；
Subsidy：补贴项。
     */
    public void setAttachmentType(String AttachmentType) {
        this.AttachmentType = AttachmentType;
    }

    /**
     * Get 附加项名称。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。 
     * @return AttachmentName 附加项名称。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
     */
    public String getAttachmentName() {
        return this.AttachmentName;
    }

    /**
     * Set 附加项名称。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
     * @param AttachmentName 附加项名称。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
     */
    public void setAttachmentName(String AttachmentName) {
        this.AttachmentName = AttachmentName;
    }

    /**
     * Get 附加项编号。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。 
     * @return AttachmentCode 附加项编号。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
     */
    public String getAttachmentCode() {
        return this.AttachmentCode;
    }

    /**
     * Set 附加项编号。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
     * @param AttachmentCode 附加项编号。
当银行作为收单机构可能会对该字段有要求，请向米大师确认。
     */
    public void setAttachmentCode(String AttachmentCode) {
        this.AttachmentCode = AttachmentCode;
    }

    public CloudAttachmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAttachmentInfo(CloudAttachmentInfo source) {
        if (source.AttachmentAmount != null) {
            this.AttachmentAmount = new Long(source.AttachmentAmount);
        }
        if (source.AttachmentType != null) {
            this.AttachmentType = new String(source.AttachmentType);
        }
        if (source.AttachmentName != null) {
            this.AttachmentName = new String(source.AttachmentName);
        }
        if (source.AttachmentCode != null) {
            this.AttachmentCode = new String(source.AttachmentCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttachmentAmount", this.AttachmentAmount);
        this.setParamSimple(map, prefix + "AttachmentType", this.AttachmentType);
        this.setParamSimple(map, prefix + "AttachmentName", this.AttachmentName);
        this.setParamSimple(map, prefix + "AttachmentCode", this.AttachmentCode);

    }
}

