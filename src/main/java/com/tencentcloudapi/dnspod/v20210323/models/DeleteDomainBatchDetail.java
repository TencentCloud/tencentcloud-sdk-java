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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainBatchDetail extends AbstractModel{

    /**
    * 域名 ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * 删除状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 操作
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 域名 ID 
     * @return DomainId 域名 ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID
     * @param DomainId 域名 ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get 删除状态 
     * @return Status 删除状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 删除状态
     * @param Status 删除状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 操作 
     * @return Operation 操作
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作
     * @param Operation 操作
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public DeleteDomainBatchDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainBatchDetail(DeleteDomainBatchDetail source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

