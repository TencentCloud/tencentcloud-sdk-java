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

public class EnableKeyRotationRequest extends AbstractModel{

    /**
    * CMK唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥轮转周期，单位天，允许范围 7 ~ 365，默认值 365。
    */
    @SerializedName("RotateDays")
    @Expose
    private Long RotateDays;

    /**
     * Get CMK唯一标识符 
     * @return KeyId CMK唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK唯一标识符
     * @param KeyId CMK唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥轮转周期，单位天，允许范围 7 ~ 365，默认值 365。 
     * @return RotateDays 密钥轮转周期，单位天，允许范围 7 ~ 365，默认值 365。
     */
    public Long getRotateDays() {
        return this.RotateDays;
    }

    /**
     * Set 密钥轮转周期，单位天，允许范围 7 ~ 365，默认值 365。
     * @param RotateDays 密钥轮转周期，单位天，允许范围 7 ~ 365，默认值 365。
     */
    public void setRotateDays(Long RotateDays) {
        this.RotateDays = RotateDays;
    }

    public EnableKeyRotationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableKeyRotationRequest(EnableKeyRotationRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.RotateDays != null) {
            this.RotateDays = new Long(source.RotateDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RotateDays", this.RotateDays);

    }
}

