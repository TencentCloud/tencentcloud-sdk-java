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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Agent extends AbstractModel{

    /**
    * 应用的唯一标识。不同的业务系统可以采用不同的AppId，不同AppId下的数据是隔离的。可以由控制台开发者中心-应用集成自主生成。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 渠道平台自定义，对于渠道子客企业的唯一标识。一个渠道子客企业主体与子客企业ProxyOrganizationOpenId是一一对应的，不可更改，不可重复使用。（例如，可以使用企业名称的hash值，或者社会统一信用代码的hash值，或者随机hash值，需要渠道平台保存），最大64位字符串
    */
    @SerializedName("ProxyOrganizationOpenId")
    @Expose
    private String ProxyOrganizationOpenId;

    /**
    * 渠道子客企业中的员工/经办人，通过渠道平台进入电子签完成实名、且被赋予相关权限后，可以参与到企业资源的管理或签署流程中。
    */
    @SerializedName("ProxyOperator")
    @Expose
    private UserInfo ProxyOperator;

    /**
    * 在子客企业开通电子签后，会生成唯一的子客应用Id（ProxyAppId）用于代理调用时的鉴权，在子客开通的回调中获取。
    */
    @SerializedName("ProxyAppId")
    @Expose
    private String ProxyAppId;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("ProxyOrganizationId")
    @Expose
    private String ProxyOrganizationId;

    /**
     * Get 应用的唯一标识。不同的业务系统可以采用不同的AppId，不同AppId下的数据是隔离的。可以由控制台开发者中心-应用集成自主生成。 
     * @return AppId 应用的唯一标识。不同的业务系统可以采用不同的AppId，不同AppId下的数据是隔离的。可以由控制台开发者中心-应用集成自主生成。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用的唯一标识。不同的业务系统可以采用不同的AppId，不同AppId下的数据是隔离的。可以由控制台开发者中心-应用集成自主生成。
     * @param AppId 应用的唯一标识。不同的业务系统可以采用不同的AppId，不同AppId下的数据是隔离的。可以由控制台开发者中心-应用集成自主生成。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 渠道平台自定义，对于渠道子客企业的唯一标识。一个渠道子客企业主体与子客企业ProxyOrganizationOpenId是一一对应的，不可更改，不可重复使用。（例如，可以使用企业名称的hash值，或者社会统一信用代码的hash值，或者随机hash值，需要渠道平台保存），最大64位字符串 
     * @return ProxyOrganizationOpenId 渠道平台自定义，对于渠道子客企业的唯一标识。一个渠道子客企业主体与子客企业ProxyOrganizationOpenId是一一对应的，不可更改，不可重复使用。（例如，可以使用企业名称的hash值，或者社会统一信用代码的hash值，或者随机hash值，需要渠道平台保存），最大64位字符串
     */
    public String getProxyOrganizationOpenId() {
        return this.ProxyOrganizationOpenId;
    }

    /**
     * Set 渠道平台自定义，对于渠道子客企业的唯一标识。一个渠道子客企业主体与子客企业ProxyOrganizationOpenId是一一对应的，不可更改，不可重复使用。（例如，可以使用企业名称的hash值，或者社会统一信用代码的hash值，或者随机hash值，需要渠道平台保存），最大64位字符串
     * @param ProxyOrganizationOpenId 渠道平台自定义，对于渠道子客企业的唯一标识。一个渠道子客企业主体与子客企业ProxyOrganizationOpenId是一一对应的，不可更改，不可重复使用。（例如，可以使用企业名称的hash值，或者社会统一信用代码的hash值，或者随机hash值，需要渠道平台保存），最大64位字符串
     */
    public void setProxyOrganizationOpenId(String ProxyOrganizationOpenId) {
        this.ProxyOrganizationOpenId = ProxyOrganizationOpenId;
    }

    /**
     * Get 渠道子客企业中的员工/经办人，通过渠道平台进入电子签完成实名、且被赋予相关权限后，可以参与到企业资源的管理或签署流程中。 
     * @return ProxyOperator 渠道子客企业中的员工/经办人，通过渠道平台进入电子签完成实名、且被赋予相关权限后，可以参与到企业资源的管理或签署流程中。
     */
    public UserInfo getProxyOperator() {
        return this.ProxyOperator;
    }

    /**
     * Set 渠道子客企业中的员工/经办人，通过渠道平台进入电子签完成实名、且被赋予相关权限后，可以参与到企业资源的管理或签署流程中。
     * @param ProxyOperator 渠道子客企业中的员工/经办人，通过渠道平台进入电子签完成实名、且被赋予相关权限后，可以参与到企业资源的管理或签署流程中。
     */
    public void setProxyOperator(UserInfo ProxyOperator) {
        this.ProxyOperator = ProxyOperator;
    }

    /**
     * Get 在子客企业开通电子签后，会生成唯一的子客应用Id（ProxyAppId）用于代理调用时的鉴权，在子客开通的回调中获取。 
     * @return ProxyAppId 在子客企业开通电子签后，会生成唯一的子客应用Id（ProxyAppId）用于代理调用时的鉴权，在子客开通的回调中获取。
     */
    public String getProxyAppId() {
        return this.ProxyAppId;
    }

    /**
     * Set 在子客企业开通电子签后，会生成唯一的子客应用Id（ProxyAppId）用于代理调用时的鉴权，在子客开通的回调中获取。
     * @param ProxyAppId 在子客企业开通电子签后，会生成唯一的子客应用Id（ProxyAppId）用于代理调用时的鉴权，在子客开通的回调中获取。
     */
    public void setProxyAppId(String ProxyAppId) {
        this.ProxyAppId = ProxyAppId;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return ProxyOrganizationId 内部参数，暂未开放使用
     */
    public String getProxyOrganizationId() {
        return this.ProxyOrganizationId;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param ProxyOrganizationId 内部参数，暂未开放使用
     */
    public void setProxyOrganizationId(String ProxyOrganizationId) {
        this.ProxyOrganizationId = ProxyOrganizationId;
    }

    public Agent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Agent(Agent source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProxyOrganizationOpenId != null) {
            this.ProxyOrganizationOpenId = new String(source.ProxyOrganizationOpenId);
        }
        if (source.ProxyOperator != null) {
            this.ProxyOperator = new UserInfo(source.ProxyOperator);
        }
        if (source.ProxyAppId != null) {
            this.ProxyAppId = new String(source.ProxyAppId);
        }
        if (source.ProxyOrganizationId != null) {
            this.ProxyOrganizationId = new String(source.ProxyOrganizationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenId", this.ProxyOrganizationOpenId);
        this.setParamObj(map, prefix + "ProxyOperator.", this.ProxyOperator);
        this.setParamSimple(map, prefix + "ProxyAppId", this.ProxyAppId);
        this.setParamSimple(map, prefix + "ProxyOrganizationId", this.ProxyOrganizationId);

    }
}

