/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyAutoSnapshotPolicyCrossAccountRequest extends AbstractModel {

    /**
    * 要备份的定期快照策略ID列表
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * 目标账户uin
    */
    @SerializedName("TargetAccountUin")
    @Expose
    private String TargetAccountUin;

    /**
     * Get 要备份的定期快照策略ID列表 
     * @return AutoSnapshotPolicyIds 要备份的定期快照策略ID列表
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set 要备份的定期快照策略ID列表
     * @param AutoSnapshotPolicyIds 要备份的定期快照策略ID列表
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * Get 目标账户uin 
     * @return TargetAccountUin 目标账户uin
     */
    public String getTargetAccountUin() {
        return this.TargetAccountUin;
    }

    /**
     * Set 目标账户uin
     * @param TargetAccountUin 目标账户uin
     */
    public void setTargetAccountUin(String TargetAccountUin) {
        this.TargetAccountUin = TargetAccountUin;
    }

    public CopyAutoSnapshotPolicyCrossAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAutoSnapshotPolicyCrossAccountRequest(CopyAutoSnapshotPolicyCrossAccountRequest source) {
        if (source.AutoSnapshotPolicyIds != null) {
            this.AutoSnapshotPolicyIds = new String[source.AutoSnapshotPolicyIds.length];
            for (int i = 0; i < source.AutoSnapshotPolicyIds.length; i++) {
                this.AutoSnapshotPolicyIds[i] = new String(source.AutoSnapshotPolicyIds[i]);
            }
        }
        if (source.TargetAccountUin != null) {
            this.TargetAccountUin = new String(source.TargetAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamSimple(map, prefix + "TargetAccountUin", this.TargetAccountUin);

    }
}

