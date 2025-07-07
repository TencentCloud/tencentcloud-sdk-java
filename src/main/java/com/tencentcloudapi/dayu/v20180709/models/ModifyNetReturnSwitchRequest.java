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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetReturnSwitchRequest extends AbstractModel {

    /**
    * 大禹子产品代号（net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Status 表示回切开关，0: 关闭， 1:打开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 回切时长，单位：小时，取值[0,1,2,3,4,5,6;]当status=1时必选填写Hour>0
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
     * Get 大禹子产品代号（net表示高防IP专业版） 
     * @return Business 大禹子产品代号（net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（net表示高防IP专业版）
     * @param Business 大禹子产品代号（net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源实例ID 
     * @return Id 资源实例ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID
     * @param Id 资源实例ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Status 表示回切开关，0: 关闭， 1:打开 
     * @return Status Status 表示回切开关，0: 关闭， 1:打开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status 表示回切开关，0: 关闭， 1:打开
     * @param Status Status 表示回切开关，0: 关闭， 1:打开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 回切时长，单位：小时，取值[0,1,2,3,4,5,6;]当status=1时必选填写Hour>0 
     * @return Hour 回切时长，单位：小时，取值[0,1,2,3,4,5,6;]当status=1时必选填写Hour>0
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set 回切时长，单位：小时，取值[0,1,2,3,4,5,6;]当status=1时必选填写Hour>0
     * @param Hour 回切时长，单位：小时，取值[0,1,2,3,4,5,6;]当status=1时必选填写Hour>0
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    public ModifyNetReturnSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetReturnSwitchRequest(ModifyNetReturnSwitchRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Hour", this.Hour);

    }
}

