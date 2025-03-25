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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewResource extends AbstractModel {

    /**
    * 资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 自动续期标记，0：默认，1：自动续期，2：不续期
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 资源冻结时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * 资源销毁状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Refund")
    @Expose
    private Boolean Refund;

    /**
    * 子产品码
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 资源到期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 资源Id 
     * @return ResourceId 资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
     * @param ResourceId 资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 自动续期标记，0：默认，1：自动续期，2：不续期 
     * @return AutoRenewFlag 自动续期标记，0：默认，1：自动续期，2：不续期
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续期标记，0：默认，1：自动续期，2：不续期
     * @param AutoRenewFlag 自动续期标记，0：默认，1：自动续期，2：不续期
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 资源冻结时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTimestamp 资源冻结时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set 资源冻结时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTimestamp 资源冻结时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get 资源销毁状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Refund 资源销毁状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRefund() {
        return this.Refund;
    }

    /**
     * Set 资源销毁状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Refund 资源销毁状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefund(Boolean Refund) {
        this.Refund = Refund;
    }

    /**
     * Get 子产品码 
     * @return SubProductCode 子产品码
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品码
     * @param SubProductCode 子产品码
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 资源到期时间 
     * @return EndTime 资源到期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 资源到期时间
     * @param EndTime 资源到期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public RenewResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewResource(RenewResource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.IsolatedTimestamp != null) {
            this.IsolatedTimestamp = new String(source.IsolatedTimestamp);
        }
        if (source.Refund != null) {
            this.Refund = new Boolean(source.Refund);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "Refund", this.Refund);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

