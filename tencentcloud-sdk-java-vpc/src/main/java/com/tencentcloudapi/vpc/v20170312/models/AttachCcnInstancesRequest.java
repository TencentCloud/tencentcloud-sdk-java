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

public class AttachCcnInstancesRequest extends AbstractModel{

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 关联网络实例列表
    */
    @SerializedName("Instances")
    @Expose
    private CcnInstance [] Instances;

    /**
    * CCN所属UIN（根账号），默认当前账号所属UIN
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

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
     * Get 关联网络实例列表 
     * @return Instances 关联网络实例列表
     */
    public CcnInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 关联网络实例列表
     * @param Instances 关联网络实例列表
     */
    public void setInstances(CcnInstance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get CCN所属UIN（根账号），默认当前账号所属UIN 
     * @return CcnUin CCN所属UIN（根账号），默认当前账号所属UIN
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set CCN所属UIN（根账号），默认当前账号所属UIN
     * @param CcnUin CCN所属UIN（根账号），默认当前账号所属UIN
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);

    }
}

