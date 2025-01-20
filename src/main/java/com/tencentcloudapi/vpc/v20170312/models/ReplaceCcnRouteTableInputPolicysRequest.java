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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCcnRouteTableInputPolicysRequest extends AbstractModel {

    /**
    * 云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网路由表ID。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 新的路由接收策略。
    */
    @SerializedName("Policys")
    @Expose
    private CcnRouteTableInputPolicy [] Policys;

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
     * Get 云联网路由表ID。 
     * @return RouteTableId 云联网路由表ID。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 云联网路由表ID。
     * @param RouteTableId 云联网路由表ID。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 新的路由接收策略。 
     * @return Policys 新的路由接收策略。
     */
    public CcnRouteTableInputPolicy [] getPolicys() {
        return this.Policys;
    }

    /**
     * Set 新的路由接收策略。
     * @param Policys 新的路由接收策略。
     */
    public void setPolicys(CcnRouteTableInputPolicy [] Policys) {
        this.Policys = Policys;
    }

    public ReplaceCcnRouteTableInputPolicysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceCcnRouteTableInputPolicysRequest(ReplaceCcnRouteTableInputPolicysRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.Policys != null) {
            this.Policys = new CcnRouteTableInputPolicy[source.Policys.length];
            for (int i = 0; i < source.Policys.length; i++) {
                this.Policys[i] = new CcnRouteTableInputPolicy(source.Policys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArrayObj(map, prefix + "Policys.", this.Policys);

    }
}

