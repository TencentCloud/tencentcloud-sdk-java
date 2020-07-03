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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesPasswordRequest extends AbstractModel{

    /**
    * 待重置密码的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 新密码，Linux实例密码必须8到16位，至少包括两项[a-z，A-Z]、[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
Windows实例密码必须12到16位，至少包括三项[a-z]，[A-Z]，[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
如果实例即包含Linux实例又包含Windows实例，则密码复杂度限制按照Windows实例的限制。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否强制关机，默认为false。
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * 待重置密码的实例的用户名，不得超过64个字符。若未指定用户名，则对于Linux而言，默认重置root用户的密码，对于Windows而言，默认重置administrator的密码。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 待重置密码的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。 
     * @return InstanceIdSet 待重置密码的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待重置密码的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     * @param InstanceIdSet 待重置密码的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 新密码，Linux实例密码必须8到16位，至少包括两项[a-z，A-Z]、[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
Windows实例密码必须12到16位，至少包括三项[a-z]，[A-Z]，[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
如果实例即包含Linux实例又包含Windows实例，则密码复杂度限制按照Windows实例的限制。 
     * @return Password 新密码，Linux实例密码必须8到16位，至少包括两项[a-z，A-Z]、[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
Windows实例密码必须12到16位，至少包括三项[a-z]，[A-Z]，[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
如果实例即包含Linux实例又包含Windows实例，则密码复杂度限制按照Windows实例的限制。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 新密码，Linux实例密码必须8到16位，至少包括两项[a-z，A-Z]、[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
Windows实例密码必须12到16位，至少包括三项[a-z]，[A-Z]，[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
如果实例即包含Linux实例又包含Windows实例，则密码复杂度限制按照Windows实例的限制。
     * @param Password 新密码，Linux实例密码必须8到16位，至少包括两项[a-z，A-Z]、[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
Windows实例密码必须12到16位，至少包括三项[a-z]，[A-Z]，[0-9]和[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]中的符号。密码不允许以/符号开头。
如果实例即包含Linux实例又包含Windows实例，则密码复杂度限制按照Windows实例的限制。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否强制关机，默认为false。 
     * @return ForceStop 是否强制关机，默认为false。
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否强制关机，默认为false。
     * @param ForceStop 是否强制关机，默认为false。
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get 待重置密码的实例的用户名，不得超过64个字符。若未指定用户名，则对于Linux而言，默认重置root用户的密码，对于Windows而言，默认重置administrator的密码。 
     * @return UserName 待重置密码的实例的用户名，不得超过64个字符。若未指定用户名，则对于Linux而言，默认重置root用户的密码，对于Windows而言，默认重置administrator的密码。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 待重置密码的实例的用户名，不得超过64个字符。若未指定用户名，则对于Linux而言，默认重置root用户的密码，对于Windows而言，默认重置administrator的密码。
     * @param UserName 待重置密码的实例的用户名，不得超过64个字符。若未指定用户名，则对于Linux而言，默认重置root用户的密码，对于Windows而言，默认重置administrator的密码。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

