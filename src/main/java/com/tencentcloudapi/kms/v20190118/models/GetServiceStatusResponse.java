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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel{

    /**
    * KMS服务是否开通， true 表示已开通
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * 0-普通版，1-旗舰版
    */
    @SerializedName("UserLevel")
    @Expose
    private Long UserLevel;

    /**
    * 旗舰版到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProExpireTime")
    @Expose
    private Long ProExpireTime;

    /**
    * 旗舰版是否自动续费：0-不自动续费，1-自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProRenewFlag")
    @Expose
    private Long ProRenewFlag;

    /**
    * 旗舰版购买记录的唯一性标识。如果为开通旗舰版，则返回值为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProResourceId")
    @Expose
    private String ProResourceId;

    /**
    * 是否开通 KMS 托管版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveVSMEnabled")
    @Expose
    private Boolean ExclusiveVSMEnabled;

    /**
    * 是否开通 KMS 独享版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveHSMEnabled")
    @Expose
    private Boolean ExclusiveHSMEnabled;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get KMS服务是否开通， true 表示已开通 
     * @return ServiceEnabled KMS服务是否开通， true 表示已开通
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set KMS服务是否开通， true 表示已开通
     * @param ServiceEnabled KMS服务是否开通， true 表示已开通
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get 0-普通版，1-旗舰版 
     * @return UserLevel 0-普通版，1-旗舰版
     */
    public Long getUserLevel() {
        return this.UserLevel;
    }

    /**
     * Set 0-普通版，1-旗舰版
     * @param UserLevel 0-普通版，1-旗舰版
     */
    public void setUserLevel(Long UserLevel) {
        this.UserLevel = UserLevel;
    }

    /**
     * Get 旗舰版到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProExpireTime 旗舰版到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProExpireTime() {
        return this.ProExpireTime;
    }

    /**
     * Set 旗舰版到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProExpireTime 旗舰版到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProExpireTime(Long ProExpireTime) {
        this.ProExpireTime = ProExpireTime;
    }

    /**
     * Get 旗舰版是否自动续费：0-不自动续费，1-自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProRenewFlag 旗舰版是否自动续费：0-不自动续费，1-自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProRenewFlag() {
        return this.ProRenewFlag;
    }

    /**
     * Set 旗舰版是否自动续费：0-不自动续费，1-自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProRenewFlag 旗舰版是否自动续费：0-不自动续费，1-自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProRenewFlag(Long ProRenewFlag) {
        this.ProRenewFlag = ProRenewFlag;
    }

    /**
     * Get 旗舰版购买记录的唯一性标识。如果为开通旗舰版，则返回值为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProResourceId 旗舰版购买记录的唯一性标识。如果为开通旗舰版，则返回值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProResourceId() {
        return this.ProResourceId;
    }

    /**
     * Set 旗舰版购买记录的唯一性标识。如果为开通旗舰版，则返回值为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProResourceId 旗舰版购买记录的唯一性标识。如果为开通旗舰版，则返回值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProResourceId(String ProResourceId) {
        this.ProResourceId = ProResourceId;
    }

    /**
     * Get 是否开通 KMS 托管版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveVSMEnabled 是否开通 KMS 托管版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExclusiveVSMEnabled() {
        return this.ExclusiveVSMEnabled;
    }

    /**
     * Set 是否开通 KMS 托管版
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveVSMEnabled 是否开通 KMS 托管版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveVSMEnabled(Boolean ExclusiveVSMEnabled) {
        this.ExclusiveVSMEnabled = ExclusiveVSMEnabled;
    }

    /**
     * Get 是否开通 KMS 独享版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveHSMEnabled 是否开通 KMS 独享版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExclusiveHSMEnabled() {
        return this.ExclusiveHSMEnabled;
    }

    /**
     * Set 是否开通 KMS 独享版
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveHSMEnabled 是否开通 KMS 独享版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveHSMEnabled(Boolean ExclusiveHSMEnabled) {
        this.ExclusiveHSMEnabled = ExclusiveHSMEnabled;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetServiceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceStatusResponse(GetServiceStatusResponse source) {
        if (source.ServiceEnabled != null) {
            this.ServiceEnabled = new Boolean(source.ServiceEnabled);
        }
        if (source.InvalidType != null) {
            this.InvalidType = new Long(source.InvalidType);
        }
        if (source.UserLevel != null) {
            this.UserLevel = new Long(source.UserLevel);
        }
        if (source.ProExpireTime != null) {
            this.ProExpireTime = new Long(source.ProExpireTime);
        }
        if (source.ProRenewFlag != null) {
            this.ProRenewFlag = new Long(source.ProRenewFlag);
        }
        if (source.ProResourceId != null) {
            this.ProResourceId = new String(source.ProResourceId);
        }
        if (source.ExclusiveVSMEnabled != null) {
            this.ExclusiveVSMEnabled = new Boolean(source.ExclusiveVSMEnabled);
        }
        if (source.ExclusiveHSMEnabled != null) {
            this.ExclusiveHSMEnabled = new Boolean(source.ExclusiveHSMEnabled);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEnabled", this.ServiceEnabled);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "UserLevel", this.UserLevel);
        this.setParamSimple(map, prefix + "ProExpireTime", this.ProExpireTime);
        this.setParamSimple(map, prefix + "ProRenewFlag", this.ProRenewFlag);
        this.setParamSimple(map, prefix + "ProResourceId", this.ProResourceId);
        this.setParamSimple(map, prefix + "ExclusiveVSMEnabled", this.ExclusiveVSMEnabled);
        this.setParamSimple(map, prefix + "ExclusiveHSMEnabled", this.ExclusiveHSMEnabled);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

