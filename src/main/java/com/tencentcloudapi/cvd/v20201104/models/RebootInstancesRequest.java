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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootInstancesRequest extends AbstractModel {

    /**
    * 重启实例id列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例所在区域，保证传入的列表在统一区域，否则报错
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启
FALSE：表示在正常重启失败后不进行强制重启

默认取值：FALSE。
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
    * 重启是否需要预登录
    */
    @SerializedName("PreLogin")
    @Expose
    private Boolean PreLogin;

    /**
     * Get 重启实例id列表 
     * @return InstanceIds 重启实例id列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 重启实例id列表
     * @param InstanceIds 重启实例id列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例所在区域，保证传入的列表在统一区域，否则报错 
     * @return InstanceRegion 实例所在区域，保证传入的列表在统一区域，否则报错
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 实例所在区域，保证传入的列表在统一区域，否则报错
     * @param InstanceRegion 实例所在区域，保证传入的列表在统一区域，否则报错
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启
FALSE：表示在正常重启失败后不进行强制重启

默认取值：FALSE。 
     * @return Force 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启
FALSE：表示在正常重启失败后不进行强制重启

默认取值：FALSE。
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启
FALSE：表示在正常重启失败后不进行强制重启

默认取值：FALSE。
     * @param Force 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启
FALSE：表示在正常重启失败后不进行强制重启

默认取值：FALSE。
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Get 重启是否需要预登录 
     * @return PreLogin 重启是否需要预登录
     */
    public Boolean getPreLogin() {
        return this.PreLogin;
    }

    /**
     * Set 重启是否需要预登录
     * @param PreLogin 重启是否需要预登录
     */
    public void setPreLogin(Boolean PreLogin) {
        this.PreLogin = PreLogin;
    }

    public RebootInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebootInstancesRequest(RebootInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
        if (source.PreLogin != null) {
            this.PreLogin = new Boolean(source.PreLogin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "PreLogin", this.PreLogin);

    }
}

