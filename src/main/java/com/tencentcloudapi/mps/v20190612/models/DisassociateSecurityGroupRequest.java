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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupRequest extends AbstractModel {

    /**
    * 媒体传输安全组ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 要解绑的输入输出信息列表。
    */
    @SerializedName("UnattachInOutInfos")
    @Expose
    private UnattachSecurityGroupInOutInfo [] UnattachInOutInfos;

    /**
     * Get 媒体传输安全组ID。 
     * @return Id 媒体传输安全组ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 媒体传输安全组ID。
     * @param Id 媒体传输安全组ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 要解绑的输入输出信息列表。 
     * @return UnattachInOutInfos 要解绑的输入输出信息列表。
     */
    public UnattachSecurityGroupInOutInfo [] getUnattachInOutInfos() {
        return this.UnattachInOutInfos;
    }

    /**
     * Set 要解绑的输入输出信息列表。
     * @param UnattachInOutInfos 要解绑的输入输出信息列表。
     */
    public void setUnattachInOutInfos(UnattachSecurityGroupInOutInfo [] UnattachInOutInfos) {
        this.UnattachInOutInfos = UnattachInOutInfos;
    }

    public DisassociateSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateSecurityGroupRequest(DisassociateSecurityGroupRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.UnattachInOutInfos != null) {
            this.UnattachInOutInfos = new UnattachSecurityGroupInOutInfo[source.UnattachInOutInfos.length];
            for (int i = 0; i < source.UnattachInOutInfos.length; i++) {
                this.UnattachInOutInfos[i] = new UnattachSecurityGroupInOutInfo(source.UnattachInOutInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UnattachInOutInfos.", this.UnattachInOutInfos);

    }
}

