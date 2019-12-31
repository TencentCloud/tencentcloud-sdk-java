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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecretRequest extends AbstractModel{

    /**
    * 指定需要删除的凭据名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。
    */
    @SerializedName("RecoveryWindowInDays")
    @Expose
    private Long RecoveryWindowInDays;

    /**
     * Get 指定需要删除的凭据名称。 
     * @return SecretName 指定需要删除的凭据名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 指定需要删除的凭据名称。
     * @param SecretName 指定需要删除的凭据名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。 
     * @return RecoveryWindowInDays 指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。
     */
    public Long getRecoveryWindowInDays() {
        return this.RecoveryWindowInDays;
    }

    /**
     * Set 指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。
     * @param RecoveryWindowInDays 指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。
     */
    public void setRecoveryWindowInDays(Long RecoveryWindowInDays) {
        this.RecoveryWindowInDays = RecoveryWindowInDays;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "RecoveryWindowInDays", this.RecoveryWindowInDays);

    }
}

