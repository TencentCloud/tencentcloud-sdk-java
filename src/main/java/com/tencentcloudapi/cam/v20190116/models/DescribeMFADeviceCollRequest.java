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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMFADeviceCollRequest extends AbstractModel{

    /**
    * 子用户Uin
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
     * Get 子用户Uin 
     * @return SubUin 子用户Uin
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子用户Uin
     * @param SubUin 子用户Uin
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

