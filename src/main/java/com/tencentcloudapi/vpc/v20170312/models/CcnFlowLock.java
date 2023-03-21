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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnFlowLock extends AbstractModel{

    /**
    * 带宽所属的云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 实例所属用户主账号ID。
    */
    @SerializedName("UserAccountID")
    @Expose
    private String UserAccountID;

    /**
    * 带宽实例的唯一ID。作为`UnlockCcnBandwidths`接口和`LockCcnBandwidths`接口的入参时，该字段必传。
    */
    @SerializedName("RegionFlowControlId")
    @Expose
    private String RegionFlowControlId;

    /**
     * Get 带宽所属的云联网ID。 
     * @return CcnId 带宽所属的云联网ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 带宽所属的云联网ID。
     * @param CcnId 带宽所属的云联网ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 实例所属用户主账号ID。 
     * @return UserAccountID 实例所属用户主账号ID。
     */
    public String getUserAccountID() {
        return this.UserAccountID;
    }

    /**
     * Set 实例所属用户主账号ID。
     * @param UserAccountID 实例所属用户主账号ID。
     */
    public void setUserAccountID(String UserAccountID) {
        this.UserAccountID = UserAccountID;
    }

    /**
     * Get 带宽实例的唯一ID。作为`UnlockCcnBandwidths`接口和`LockCcnBandwidths`接口的入参时，该字段必传。 
     * @return RegionFlowControlId 带宽实例的唯一ID。作为`UnlockCcnBandwidths`接口和`LockCcnBandwidths`接口的入参时，该字段必传。
     */
    public String getRegionFlowControlId() {
        return this.RegionFlowControlId;
    }

    /**
     * Set 带宽实例的唯一ID。作为`UnlockCcnBandwidths`接口和`LockCcnBandwidths`接口的入参时，该字段必传。
     * @param RegionFlowControlId 带宽实例的唯一ID。作为`UnlockCcnBandwidths`接口和`LockCcnBandwidths`接口的入参时，该字段必传。
     */
    public void setRegionFlowControlId(String RegionFlowControlId) {
        this.RegionFlowControlId = RegionFlowControlId;
    }

    public CcnFlowLock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnFlowLock(CcnFlowLock source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.UserAccountID != null) {
            this.UserAccountID = new String(source.UserAccountID);
        }
        if (source.RegionFlowControlId != null) {
            this.RegionFlowControlId = new String(source.RegionFlowControlId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "UserAccountID", this.UserAccountID);
        this.setParamSimple(map, prefix + "RegionFlowControlId", this.RegionFlowControlId);

    }
}

