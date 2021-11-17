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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopSecurityGroupRuleDispatchRequest extends AbstractModel{

    /**
    * 值为1，中止全部
    */
    @SerializedName("StopType")
    @Expose
    private Long StopType;

    /**
     * Get 值为1，中止全部 
     * @return StopType 值为1，中止全部
     */
    public Long getStopType() {
        return this.StopType;
    }

    /**
     * Set 值为1，中止全部
     * @param StopType 值为1，中止全部
     */
    public void setStopType(Long StopType) {
        this.StopType = StopType;
    }

    public StopSecurityGroupRuleDispatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopSecurityGroupRuleDispatchRequest(StopSecurityGroupRuleDispatchRequest source) {
        if (source.StopType != null) {
            this.StopType = new Long(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

