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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetBpaasApproveDetailRequest extends AbstractModel{

    /**
    * 审批id
    */
    @SerializedName("ApproveId")
    @Expose
    private Long ApproveId;

    /**
     * Get 审批id 
     * @return ApproveId 审批id
     */
    public Long getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set 审批id
     * @param ApproveId 审批id
     */
    public void setApproveId(Long ApproveId) {
        this.ApproveId = ApproveId;
    }

    public GetBpaasApproveDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBpaasApproveDetailRequest(GetBpaasApproveDetailRequest source) {
        if (source.ApproveId != null) {
            this.ApproveId = new Long(source.ApproveId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproveId", this.ApproveId);

    }
}

