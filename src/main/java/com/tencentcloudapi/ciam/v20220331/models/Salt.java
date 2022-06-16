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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Salt extends AbstractModel{

    /**
    * 盐值
    */
    @SerializedName("SaltValue")
    @Expose
    private String SaltValue;

    /**
    * 盐值位置
    */
    @SerializedName("SaltLocation")
    @Expose
    private SaltLocation SaltLocation;

    /**
     * Get 盐值 
     * @return SaltValue 盐值
     */
    public String getSaltValue() {
        return this.SaltValue;
    }

    /**
     * Set 盐值
     * @param SaltValue 盐值
     */
    public void setSaltValue(String SaltValue) {
        this.SaltValue = SaltValue;
    }

    /**
     * Get 盐值位置 
     * @return SaltLocation 盐值位置
     */
    public SaltLocation getSaltLocation() {
        return this.SaltLocation;
    }

    /**
     * Set 盐值位置
     * @param SaltLocation 盐值位置
     */
    public void setSaltLocation(SaltLocation SaltLocation) {
        this.SaltLocation = SaltLocation;
    }

    public Salt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Salt(Salt source) {
        if (source.SaltValue != null) {
            this.SaltValue = new String(source.SaltValue);
        }
        if (source.SaltLocation != null) {
            this.SaltLocation = new SaltLocation(source.SaltLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaltValue", this.SaltValue);
        this.setParamObj(map, prefix + "SaltLocation.", this.SaltLocation);

    }
}

