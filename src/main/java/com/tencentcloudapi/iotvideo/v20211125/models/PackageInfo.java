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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageInfo extends AbstractModel{

    /**
    * 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 云存类型，1为全时云存，2为事件云存
    */
    @SerializedName("CSType")
    @Expose
    private Long CSType;

    /**
    * 云存回看时长
    */
    @SerializedName("CSShiftDuration")
    @Expose
    private Long CSShiftDuration;

    /**
    * 云存套餐过期时间
    */
    @SerializedName("CSExpiredTime")
    @Expose
    private Long CSExpiredTime;

    /**
     * Get 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据 
     * @return Status 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
     * @param Status 云存开启状态，0为未开启，2为正在生效，1为已过期
注：这里只返回状态为0的数据
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 云存类型，1为全时云存，2为事件云存 
     * @return CSType 云存类型，1为全时云存，2为事件云存
     */
    public Long getCSType() {
        return this.CSType;
    }

    /**
     * Set 云存类型，1为全时云存，2为事件云存
     * @param CSType 云存类型，1为全时云存，2为事件云存
     */
    public void setCSType(Long CSType) {
        this.CSType = CSType;
    }

    /**
     * Get 云存回看时长 
     * @return CSShiftDuration 云存回看时长
     */
    public Long getCSShiftDuration() {
        return this.CSShiftDuration;
    }

    /**
     * Set 云存回看时长
     * @param CSShiftDuration 云存回看时长
     */
    public void setCSShiftDuration(Long CSShiftDuration) {
        this.CSShiftDuration = CSShiftDuration;
    }

    /**
     * Get 云存套餐过期时间 
     * @return CSExpiredTime 云存套餐过期时间
     */
    public Long getCSExpiredTime() {
        return this.CSExpiredTime;
    }

    /**
     * Set 云存套餐过期时间
     * @param CSExpiredTime 云存套餐过期时间
     */
    public void setCSExpiredTime(Long CSExpiredTime) {
        this.CSExpiredTime = CSExpiredTime;
    }

    public PackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageInfo(PackageInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CSType != null) {
            this.CSType = new Long(source.CSType);
        }
        if (source.CSShiftDuration != null) {
            this.CSShiftDuration = new Long(source.CSShiftDuration);
        }
        if (source.CSExpiredTime != null) {
            this.CSExpiredTime = new Long(source.CSExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CSType", this.CSType);
        this.setParamSimple(map, prefix + "CSShiftDuration", this.CSShiftDuration);
        this.setParamSimple(map, prefix + "CSExpiredTime", this.CSExpiredTime);

    }
}

