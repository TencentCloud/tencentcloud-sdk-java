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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnterRescueModeRequest extends AbstractModel {

    /**
    * 需要进入救援模式的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 救援模式下系统密码。不同操作系统类型密码复杂度限制不一样，具体如下：<li>Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]中的特殊符号。</li><li>Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]中的特殊符号。</li>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 救援模式下系统用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 是否强制关机。本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * 实例的关闭模式。取值范围：<br><li>SOFT_FIRST：表示在正常关闭失败后进行强制关闭</li><br><li>HARD：直接强制关闭</li><br><li>SOFT：仅软关机</li><br>默认取值：SOFT。
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get 需要进入救援模式的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
 
     * @return InstanceId 需要进入救援模式的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要进入救援模式的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。

     * @param InstanceId 需要进入救援模式的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 救援模式下系统密码。不同操作系统类型密码复杂度限制不一样，具体如下：<li>Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]中的特殊符号。</li><li>Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]中的特殊符号。</li> 
     * @return Password 救援模式下系统密码。不同操作系统类型密码复杂度限制不一样，具体如下：<li>Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]中的特殊符号。</li><li>Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]中的特殊符号。</li>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 救援模式下系统密码。不同操作系统类型密码复杂度限制不一样，具体如下：<li>Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]中的特殊符号。</li><li>Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]中的特殊符号。</li>
     * @param Password 救援模式下系统密码。不同操作系统类型密码复杂度限制不一样，具体如下：<li>Linux实例密码必须8到30位，至少包括两项[a-z]，[A-Z]、[0-9] 和 [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]中的特殊符号。</li><li>Windows实例密码必须12到30位，至少包括三项[a-z]，[A-Z]，[0-9] 和 [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]中的特殊符号。</li>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 救援模式下系统用户名 
     * @return Username 救援模式下系统用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 救援模式下系统用户名
     * @param Username 救援模式下系统用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 是否强制关机。本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。 
     * @return ForceStop 是否强制关机。本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。
     * @deprecated
     */
    @Deprecated
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否强制关机。本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。
     * @param ForceStop 是否强制关机。本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。
     * @deprecated
     */
    @Deprecated
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get 实例的关闭模式。取值范围：<br><li>SOFT_FIRST：表示在正常关闭失败后进行强制关闭</li><br><li>HARD：直接强制关闭</li><br><li>SOFT：仅软关机</li><br>默认取值：SOFT。 
     * @return StopType 实例的关闭模式。取值范围：<br><li>SOFT_FIRST：表示在正常关闭失败后进行强制关闭</li><br><li>HARD：直接强制关闭</li><br><li>SOFT：仅软关机</li><br>默认取值：SOFT。
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 实例的关闭模式。取值范围：<br><li>SOFT_FIRST：表示在正常关闭失败后进行强制关闭</li><br><li>HARD：直接强制关闭</li><br><li>SOFT：仅软关机</li><br>默认取值：SOFT。
     * @param StopType 实例的关闭模式。取值范围：<br><li>SOFT_FIRST：表示在正常关闭失败后进行强制关闭</li><br><li>HARD：直接强制关闭</li><br><li>SOFT：仅软关机</li><br>默认取值：SOFT。
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public EnterRescueModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnterRescueModeRequest(EnterRescueModeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

