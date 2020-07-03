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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteBoxKeyDetailsRequest extends AbstractModel{

    /**
    * 过滤条件：密钥的状态，0：disabled，1：enabled
    */
    @SerializedName("KeyStatus")
    @Expose
    private Long KeyStatus;

    /**
     * Get 过滤条件：密钥的状态，0：disabled，1：enabled 
     * @return KeyStatus 过滤条件：密钥的状态，0：disabled，1：enabled
     */
    public Long getKeyStatus() {
        return this.KeyStatus;
    }

    /**
     * Set 过滤条件：密钥的状态，0：disabled，1：enabled
     * @param KeyStatus 过滤条件：密钥的状态，0：disabled，1：enabled
     */
    public void setKeyStatus(Long KeyStatus) {
        this.KeyStatus = KeyStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyStatus", this.KeyStatus);

    }
}

