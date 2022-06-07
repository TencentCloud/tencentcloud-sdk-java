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

public class PayeeInfoResult extends AbstractModel{

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 用户外部业务ID
    */
    @SerializedName("OutUserId")
    @Expose
    private String OutUserId;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 证件类型
0:身份证
1:社会信用代码
    */
    @SerializedName("IdType")
    @Expose
    private Long IdType;

    /**
    * 证件号
    */
    @SerializedName("IdNo")
    @Expose
    private String IdNo;

    /**
    * 服务商ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 用户外部业务ID 
     * @return OutUserId 用户外部业务ID
     */
    public String getOutUserId() {
        return this.OutUserId;
    }

    /**
     * Set 用户外部业务ID
     * @param OutUserId 用户外部业务ID
     */
    public void setOutUserId(String OutUserId) {
        this.OutUserId = OutUserId;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 证件类型
0:身份证
1:社会信用代码 
     * @return IdType 证件类型
0:身份证
1:社会信用代码
     */
    public Long getIdType() {
        return this.IdType;
    }

    /**
     * Set 证件类型
0:身份证
1:社会信用代码
     * @param IdType 证件类型
0:身份证
1:社会信用代码
     */
    public void setIdType(Long IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 证件号 
     * @return IdNo 证件号
     */
    public String getIdNo() {
        return this.IdNo;
    }

    /**
     * Set 证件号
     * @param IdNo 证件号
     */
    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    /**
     * Get 服务商ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceProviderId 服务商ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set 服务商ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceProviderId 服务商ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public PayeeInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeInfoResult(PayeeInfoResult source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.OutUserId != null) {
            this.OutUserId = new String(source.OutUserId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdType != null) {
            this.IdType = new Long(source.IdType);
        }
        if (source.IdNo != null) {
            this.IdNo = new String(source.IdNo);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "OutUserId", this.OutUserId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdNo", this.IdNo);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

