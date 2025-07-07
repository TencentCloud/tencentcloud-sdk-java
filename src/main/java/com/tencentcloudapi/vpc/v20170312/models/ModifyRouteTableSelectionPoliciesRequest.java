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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRouteTableSelectionPoliciesRequest extends AbstractModel {

    /**
    * 云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 选择策略信息集合，表示需要按照当前的策略来修改。
    */
    @SerializedName("SelectionPolicies")
    @Expose
    private CcnRouteTableSelectPolicy [] SelectionPolicies;

    /**
     * Get 云联网ID。 
     * @return CcnId 云联网ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID。
     * @param CcnId 云联网ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 选择策略信息集合，表示需要按照当前的策略来修改。 
     * @return SelectionPolicies 选择策略信息集合，表示需要按照当前的策略来修改。
     */
    public CcnRouteTableSelectPolicy [] getSelectionPolicies() {
        return this.SelectionPolicies;
    }

    /**
     * Set 选择策略信息集合，表示需要按照当前的策略来修改。
     * @param SelectionPolicies 选择策略信息集合，表示需要按照当前的策略来修改。
     */
    public void setSelectionPolicies(CcnRouteTableSelectPolicy [] SelectionPolicies) {
        this.SelectionPolicies = SelectionPolicies;
    }

    public ModifyRouteTableSelectionPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRouteTableSelectionPoliciesRequest(ModifyRouteTableSelectionPoliciesRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.SelectionPolicies != null) {
            this.SelectionPolicies = new CcnRouteTableSelectPolicy[source.SelectionPolicies.length];
            for (int i = 0; i < source.SelectionPolicies.length; i++) {
                this.SelectionPolicies[i] = new CcnRouteTableSelectPolicy(source.SelectionPolicies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "SelectionPolicies.", this.SelectionPolicies);

    }
}

