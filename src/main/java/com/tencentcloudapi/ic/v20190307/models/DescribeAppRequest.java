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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppRequest extends AbstractModel{

    /**
    * 物联卡应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private Long Sdkappid;

    /**
     * Get 物联卡应用ID 
     * @return Sdkappid 物联卡应用ID
     */
    public Long getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 物联卡应用ID
     * @param Sdkappid 物联卡应用ID
     */
    public void setSdkappid(Long Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);

    }
}

