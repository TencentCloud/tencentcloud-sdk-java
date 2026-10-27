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

public class DescribeInstanceLoginMsgRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 绑定实例的UserID，为后续多会话预留参数
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 拉取桌面title，用户可自行定义，默认为云桌面实例名称
    */
    @SerializedName("DesktopName")
    @Expose
    private String DesktopName;

    /**
    * 是否抢占桌面，即桌面使用过程中，抢占登录。
true：抢占登录
false：非抢占登录
默认为抢占登录
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
    * 是否内网方式
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 绑定实例的UserID，为后续多会话预留参数 
     * @return UserId 绑定实例的UserID，为后续多会话预留参数
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 绑定实例的UserID，为后续多会话预留参数
     * @param UserId 绑定实例的UserID，为后续多会话预留参数
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 拉取桌面title，用户可自行定义，默认为云桌面实例名称 
     * @return DesktopName 拉取桌面title，用户可自行定义，默认为云桌面实例名称
     */
    public String getDesktopName() {
        return this.DesktopName;
    }

    /**
     * Set 拉取桌面title，用户可自行定义，默认为云桌面实例名称
     * @param DesktopName 拉取桌面title，用户可自行定义，默认为云桌面实例名称
     */
    public void setDesktopName(String DesktopName) {
        this.DesktopName = DesktopName;
    }

    /**
     * Get 是否抢占桌面，即桌面使用过程中，抢占登录。
true：抢占登录
false：非抢占登录
默认为抢占登录 
     * @return Force 是否抢占桌面，即桌面使用过程中，抢占登录。
true：抢占登录
false：非抢占登录
默认为抢占登录
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否抢占桌面，即桌面使用过程中，抢占登录。
true：抢占登录
false：非抢占登录
默认为抢占登录
     * @param Force 是否抢占桌面，即桌面使用过程中，抢占登录。
true：抢占登录
false：非抢占登录
默认为抢占登录
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Get 是否内网方式 
     * @return IsInternal 是否内网方式
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set 是否内网方式
     * @param IsInternal 是否内网方式
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    public DescribeInstanceLoginMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLoginMsgRequest(DescribeInstanceLoginMsgRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DesktopName != null) {
            this.DesktopName = new String(source.DesktopName);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DesktopName", this.DesktopName);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);

    }
}

