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

public class ResetAttachCcnInstancesRequest extends AbstractModel {

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * CCN所属UIN（根账号）。
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
    * 重新申请关联网络实例列表。
    */
    @SerializedName("Instances")
    @Expose
    private CcnInstance [] Instances;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。 
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get CCN所属UIN（根账号）。 
     * @return CcnUin CCN所属UIN（根账号）。
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set CCN所属UIN（根账号）。
     * @param CcnUin CCN所属UIN（根账号）。
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Get 重新申请关联网络实例列表。 
     * @return Instances 重新申请关联网络实例列表。
     */
    public CcnInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 重新申请关联网络实例列表。
     * @param Instances 重新申请关联网络实例列表。
     */
    public void setInstances(CcnInstance [] Instances) {
        this.Instances = Instances;
    }

    public ResetAttachCcnInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetAttachCcnInstancesRequest(ResetAttachCcnInstancesRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnUin != null) {
            this.CcnUin = new String(source.CcnUin);
        }
        if (source.Instances != null) {
            this.Instances = new CcnInstance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new CcnInstance(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

