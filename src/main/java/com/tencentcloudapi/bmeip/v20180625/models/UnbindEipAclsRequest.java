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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindEipAclsRequest extends AbstractModel {

    /**
    * 待解关联的 EIP 与 ACL列表
    */
    @SerializedName("EipIdAclIdList")
    @Expose
    private EipAclMap [] EipIdAclIdList;

    /**
     * Get 待解关联的 EIP 与 ACL列表 
     * @return EipIdAclIdList 待解关联的 EIP 与 ACL列表
     */
    public EipAclMap [] getEipIdAclIdList() {
        return this.EipIdAclIdList;
    }

    /**
     * Set 待解关联的 EIP 与 ACL列表
     * @param EipIdAclIdList 待解关联的 EIP 与 ACL列表
     */
    public void setEipIdAclIdList(EipAclMap [] EipIdAclIdList) {
        this.EipIdAclIdList = EipIdAclIdList;
    }

    public UnbindEipAclsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindEipAclsRequest(UnbindEipAclsRequest source) {
        if (source.EipIdAclIdList != null) {
            this.EipIdAclIdList = new EipAclMap[source.EipIdAclIdList.length];
            for (int i = 0; i < source.EipIdAclIdList.length; i++) {
                this.EipIdAclIdList[i] = new EipAclMap(source.EipIdAclIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EipIdAclIdList.", this.EipIdAclIdList);

    }
}

