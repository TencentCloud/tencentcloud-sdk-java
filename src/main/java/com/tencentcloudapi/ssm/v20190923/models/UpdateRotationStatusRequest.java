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

public class UpdateRotationStatusRequest extends AbstractModel{

    /**
    * 云产品凭据名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 是否开启轮转。
true -- 开启轮转；
false -- 禁止轮转。
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * 轮转周期，以天为单位，最小为30天，最大为365天。
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * 用户设置的期望开始轮转时间，格式为：2006-01-02 15:04:05。
当EnableRotation为true时，如果不填RotationBeginTime，则默认填充为当前时间。
    */
    @SerializedName("RotationBeginTime")
    @Expose
    private String RotationBeginTime;

    /**
     * Get 云产品凭据名称。 
     * @return SecretName 云产品凭据名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 云产品凭据名称。
     * @param SecretName 云产品凭据名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 是否开启轮转。
true -- 开启轮转；
false -- 禁止轮转。 
     * @return EnableRotation 是否开启轮转。
true -- 开启轮转；
false -- 禁止轮转。
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set 是否开启轮转。
true -- 开启轮转；
false -- 禁止轮转。
     * @param EnableRotation 是否开启轮转。
true -- 开启轮转；
false -- 禁止轮转。
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get 轮转周期，以天为单位，最小为30天，最大为365天。 
     * @return Frequency 轮转周期，以天为单位，最小为30天，最大为365天。
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 轮转周期，以天为单位，最小为30天，最大为365天。
     * @param Frequency 轮转周期，以天为单位，最小为30天，最大为365天。
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 用户设置的期望开始轮转时间，格式为：2006-01-02 15:04:05。
当EnableRotation为true时，如果不填RotationBeginTime，则默认填充为当前时间。 
     * @return RotationBeginTime 用户设置的期望开始轮转时间，格式为：2006-01-02 15:04:05。
当EnableRotation为true时，如果不填RotationBeginTime，则默认填充为当前时间。
     */
    public String getRotationBeginTime() {
        return this.RotationBeginTime;
    }

    /**
     * Set 用户设置的期望开始轮转时间，格式为：2006-01-02 15:04:05。
当EnableRotation为true时，如果不填RotationBeginTime，则默认填充为当前时间。
     * @param RotationBeginTime 用户设置的期望开始轮转时间，格式为：2006-01-02 15:04:05。
当EnableRotation为true时，如果不填RotationBeginTime，则默认填充为当前时间。
     */
    public void setRotationBeginTime(String RotationBeginTime) {
        this.RotationBeginTime = RotationBeginTime;
    }

    public UpdateRotationStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRotationStatusRequest(UpdateRotationStatusRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.RotationBeginTime != null) {
            this.RotationBeginTime = new String(source.RotationBeginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "RotationBeginTime", this.RotationBeginTime);

    }
}

