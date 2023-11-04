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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateUserAutoSignEnableUrlRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 自动签使用的场景值, 可以选择的场景值如下:
<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li></ul>

注: `现在仅支持电子处方场景`
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 自动签开通配置信息, 包括开通的人员的信息等
    */
    @SerializedName("AutoSignConfig")
    @Expose
    private AutoSignConfig AutoSignConfig;

    /**
    * 生成的链接类型：
<ul><li> 不传(即为空值) 则会生成小程序端开通链接(默认)</li>
<li> **H5SIGN** : 生成H5端开通链接</li></ul>
    */
    @SerializedName("UrlType")
    @Expose
    private String UrlType;

    /**
    * 是否通知开通方，通知类型:
<ul><li>默认不设置为不通知开通方</li>
<li>**SMS** :  短信通知 ,如果需要短信通知则NotifyAddress填写对方的手机号</li><ul>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 如果通知类型NotifyType选择为SMS，则此处为手机号, 其他通知类型不需要设置此项
    */
    @SerializedName("NotifyAddress")
    @Expose
    private String NotifyAddress;

    /**
    * 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。`如果不传，默认过期时间为当前时间往后7天。`
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 自动签使用的场景值, 可以选择的场景值如下:
<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li></ul>

注: `现在仅支持电子处方场景` 
     * @return SceneKey 自动签使用的场景值, 可以选择的场景值如下:
<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li></ul>

注: `现在仅支持电子处方场景`
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set 自动签使用的场景值, 可以选择的场景值如下:
<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li></ul>

注: `现在仅支持电子处方场景`
     * @param SceneKey 自动签使用的场景值, 可以选择的场景值如下:
<ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li></ul>

注: `现在仅支持电子处方场景`
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 自动签开通配置信息, 包括开通的人员的信息等 
     * @return AutoSignConfig 自动签开通配置信息, 包括开通的人员的信息等
     */
    public AutoSignConfig getAutoSignConfig() {
        return this.AutoSignConfig;
    }

    /**
     * Set 自动签开通配置信息, 包括开通的人员的信息等
     * @param AutoSignConfig 自动签开通配置信息, 包括开通的人员的信息等
     */
    public void setAutoSignConfig(AutoSignConfig AutoSignConfig) {
        this.AutoSignConfig = AutoSignConfig;
    }

    /**
     * Get 生成的链接类型：
<ul><li> 不传(即为空值) 则会生成小程序端开通链接(默认)</li>
<li> **H5SIGN** : 生成H5端开通链接</li></ul> 
     * @return UrlType 生成的链接类型：
<ul><li> 不传(即为空值) 则会生成小程序端开通链接(默认)</li>
<li> **H5SIGN** : 生成H5端开通链接</li></ul>
     */
    public String getUrlType() {
        return this.UrlType;
    }

    /**
     * Set 生成的链接类型：
<ul><li> 不传(即为空值) 则会生成小程序端开通链接(默认)</li>
<li> **H5SIGN** : 生成H5端开通链接</li></ul>
     * @param UrlType 生成的链接类型：
<ul><li> 不传(即为空值) 则会生成小程序端开通链接(默认)</li>
<li> **H5SIGN** : 生成H5端开通链接</li></ul>
     */
    public void setUrlType(String UrlType) {
        this.UrlType = UrlType;
    }

    /**
     * Get 是否通知开通方，通知类型:
<ul><li>默认不设置为不通知开通方</li>
<li>**SMS** :  短信通知 ,如果需要短信通知则NotifyAddress填写对方的手机号</li><ul> 
     * @return NotifyType 是否通知开通方，通知类型:
<ul><li>默认不设置为不通知开通方</li>
<li>**SMS** :  短信通知 ,如果需要短信通知则NotifyAddress填写对方的手机号</li><ul>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 是否通知开通方，通知类型:
<ul><li>默认不设置为不通知开通方</li>
<li>**SMS** :  短信通知 ,如果需要短信通知则NotifyAddress填写对方的手机号</li><ul>
     * @param NotifyType 是否通知开通方，通知类型:
<ul><li>默认不设置为不通知开通方</li>
<li>**SMS** :  短信通知 ,如果需要短信通知则NotifyAddress填写对方的手机号</li><ul>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 如果通知类型NotifyType选择为SMS，则此处为手机号, 其他通知类型不需要设置此项 
     * @return NotifyAddress 如果通知类型NotifyType选择为SMS，则此处为手机号, 其他通知类型不需要设置此项
     */
    public String getNotifyAddress() {
        return this.NotifyAddress;
    }

    /**
     * Set 如果通知类型NotifyType选择为SMS，则此处为手机号, 其他通知类型不需要设置此项
     * @param NotifyAddress 如果通知类型NotifyType选择为SMS，则此处为手机号, 其他通知类型不需要设置此项
     */
    public void setNotifyAddress(String NotifyAddress) {
        this.NotifyAddress = NotifyAddress;
    }

    /**
     * Get 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。`如果不传，默认过期时间为当前时间往后7天。` 
     * @return ExpiredTime 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。`如果不传，默认过期时间为当前时间往后7天。`
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。`如果不传，默认过期时间为当前时间往后7天。`
     * @param ExpiredTime 链接的过期时间，格式为Unix时间戳，不能早于当前时间，且最大为当前时间往后30天。`如果不传，默认过期时间为当前时间往后7天。`
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public ChannelCreateUserAutoSignEnableUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateUserAutoSignEnableUrlRequest(ChannelCreateUserAutoSignEnableUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AutoSignConfig != null) {
            this.AutoSignConfig = new AutoSignConfig(source.AutoSignConfig);
        }
        if (source.UrlType != null) {
            this.UrlType = new String(source.UrlType);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyAddress != null) {
            this.NotifyAddress = new String(source.NotifyAddress);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "AutoSignConfig.", this.AutoSignConfig);
        this.setParamSimple(map, prefix + "UrlType", this.UrlType);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyAddress", this.NotifyAddress);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

