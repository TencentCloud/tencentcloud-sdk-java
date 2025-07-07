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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskSyscallWhiteListDetailRequest extends AbstractModel {

    /**
    * 白名单id
    */
    @SerializedName("WhiteListId")
    @Expose
    private String WhiteListId;

    /**
     * Get 白名单id 
     * @return WhiteListId 白名单id
     */
    public String getWhiteListId() {
        return this.WhiteListId;
    }

    /**
     * Set 白名单id
     * @param WhiteListId 白名单id
     */
    public void setWhiteListId(String WhiteListId) {
        this.WhiteListId = WhiteListId;
    }

    public DescribeRiskSyscallWhiteListDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskSyscallWhiteListDetailRequest(DescribeRiskSyscallWhiteListDetailRequest source) {
        if (source.WhiteListId != null) {
            this.WhiteListId = new String(source.WhiteListId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteListId", this.WhiteListId);

    }
}

