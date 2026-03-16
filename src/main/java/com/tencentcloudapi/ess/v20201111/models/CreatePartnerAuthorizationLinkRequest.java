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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePartnerAuthorizationLinkRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 腾讯电子签平台给生态集成方分配的**生态集成业务标识**，
<font color="red">**此生态集成业务标识需要提前联系产品经理配置**。</font>
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 合作方企业在腾讯电子签注册企业后生成的企业id，需要合作方企业登录
<a href="https://qian.tencent.com/console/company-settings/company-center" target="_blank">电子签控制台</a>获取

![image](https://qcloudimg.tencent-cloud.cn/raw/20ce774cf8118b9f3742b8519ef935db.png)

    */
    @SerializedName("PartnerOrganizationId")
    @Expose
    private String PartnerOrganizationId;

    /**
    * 第三方应用的配置信息。
其中包括 回调地址，加密KEY等信息。
    */
    @SerializedName("ApplicationInfo")
    @Expose
    private CallbackInfo ApplicationInfo;

    /**
    * 第三方应用下企业用户信息。
其中包括企业的OrganizationOpenId和超管的UserOpenId。
具体含义请参考结构体解释
    */
    @SerializedName("ProxyOrganizationInfo")
    @Expose
    private ProxyOrganizationInfo ProxyOrganizationInfo;

    /**
    * 若未填写，则会创建一个生态集成应用。
若填写， 则必须是生态集成企业给合作方企业通过此接口**CreatePartnerAuthorizationLink**创建的应用号。
应用号可以从下图位置获取。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)
    */
    @SerializedName("PartnerApplicationId")
    @Expose
    private String PartnerApplicationId;

    /**
     * Get 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 腾讯电子签平台给生态集成方分配的**生态集成业务标识**，
<font color="red">**此生态集成业务标识需要提前联系产品经理配置**。</font> 
     * @return BusinessId 腾讯电子签平台给生态集成方分配的**生态集成业务标识**，
<font color="red">**此生态集成业务标识需要提前联系产品经理配置**。</font>
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 腾讯电子签平台给生态集成方分配的**生态集成业务标识**，
<font color="red">**此生态集成业务标识需要提前联系产品经理配置**。</font>
     * @param BusinessId 腾讯电子签平台给生态集成方分配的**生态集成业务标识**，
<font color="red">**此生态集成业务标识需要提前联系产品经理配置**。</font>
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 合作方企业在腾讯电子签注册企业后生成的企业id，需要合作方企业登录
<a href="https://qian.tencent.com/console/company-settings/company-center" target="_blank">电子签控制台</a>获取

![image](https://qcloudimg.tencent-cloud.cn/raw/20ce774cf8118b9f3742b8519ef935db.png)
 
     * @return PartnerOrganizationId 合作方企业在腾讯电子签注册企业后生成的企业id，需要合作方企业登录
<a href="https://qian.tencent.com/console/company-settings/company-center" target="_blank">电子签控制台</a>获取

![image](https://qcloudimg.tencent-cloud.cn/raw/20ce774cf8118b9f3742b8519ef935db.png)

     */
    public String getPartnerOrganizationId() {
        return this.PartnerOrganizationId;
    }

    /**
     * Set 合作方企业在腾讯电子签注册企业后生成的企业id，需要合作方企业登录
<a href="https://qian.tencent.com/console/company-settings/company-center" target="_blank">电子签控制台</a>获取

![image](https://qcloudimg.tencent-cloud.cn/raw/20ce774cf8118b9f3742b8519ef935db.png)

     * @param PartnerOrganizationId 合作方企业在腾讯电子签注册企业后生成的企业id，需要合作方企业登录
<a href="https://qian.tencent.com/console/company-settings/company-center" target="_blank">电子签控制台</a>获取

![image](https://qcloudimg.tencent-cloud.cn/raw/20ce774cf8118b9f3742b8519ef935db.png)

     */
    public void setPartnerOrganizationId(String PartnerOrganizationId) {
        this.PartnerOrganizationId = PartnerOrganizationId;
    }

    /**
     * Get 第三方应用的配置信息。
其中包括 回调地址，加密KEY等信息。 
     * @return ApplicationInfo 第三方应用的配置信息。
其中包括 回调地址，加密KEY等信息。
     */
    public CallbackInfo getApplicationInfo() {
        return this.ApplicationInfo;
    }

    /**
     * Set 第三方应用的配置信息。
其中包括 回调地址，加密KEY等信息。
     * @param ApplicationInfo 第三方应用的配置信息。
其中包括 回调地址，加密KEY等信息。
     */
    public void setApplicationInfo(CallbackInfo ApplicationInfo) {
        this.ApplicationInfo = ApplicationInfo;
    }

    /**
     * Get 第三方应用下企业用户信息。
其中包括企业的OrganizationOpenId和超管的UserOpenId。
具体含义请参考结构体解释 
     * @return ProxyOrganizationInfo 第三方应用下企业用户信息。
其中包括企业的OrganizationOpenId和超管的UserOpenId。
具体含义请参考结构体解释
     */
    public ProxyOrganizationInfo getProxyOrganizationInfo() {
        return this.ProxyOrganizationInfo;
    }

    /**
     * Set 第三方应用下企业用户信息。
其中包括企业的OrganizationOpenId和超管的UserOpenId。
具体含义请参考结构体解释
     * @param ProxyOrganizationInfo 第三方应用下企业用户信息。
其中包括企业的OrganizationOpenId和超管的UserOpenId。
具体含义请参考结构体解释
     */
    public void setProxyOrganizationInfo(ProxyOrganizationInfo ProxyOrganizationInfo) {
        this.ProxyOrganizationInfo = ProxyOrganizationInfo;
    }

    /**
     * Get 若未填写，则会创建一个生态集成应用。
若填写， 则必须是生态集成企业给合作方企业通过此接口**CreatePartnerAuthorizationLink**创建的应用号。
应用号可以从下图位置获取。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png) 
     * @return PartnerApplicationId 若未填写，则会创建一个生态集成应用。
若填写， 则必须是生态集成企业给合作方企业通过此接口**CreatePartnerAuthorizationLink**创建的应用号。
应用号可以从下图位置获取。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)
     */
    public String getPartnerApplicationId() {
        return this.PartnerApplicationId;
    }

    /**
     * Set 若未填写，则会创建一个生态集成应用。
若填写， 则必须是生态集成企业给合作方企业通过此接口**CreatePartnerAuthorizationLink**创建的应用号。
应用号可以从下图位置获取。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)
     * @param PartnerApplicationId 若未填写，则会创建一个生态集成应用。
若填写， 则必须是生态集成企业给合作方企业通过此接口**CreatePartnerAuthorizationLink**创建的应用号。
应用号可以从下图位置获取。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)
     */
    public void setPartnerApplicationId(String PartnerApplicationId) {
        this.PartnerApplicationId = PartnerApplicationId;
    }

    public CreatePartnerAuthorizationLinkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartnerAuthorizationLinkRequest(CreatePartnerAuthorizationLinkRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.PartnerOrganizationId != null) {
            this.PartnerOrganizationId = new String(source.PartnerOrganizationId);
        }
        if (source.ApplicationInfo != null) {
            this.ApplicationInfo = new CallbackInfo(source.ApplicationInfo);
        }
        if (source.ProxyOrganizationInfo != null) {
            this.ProxyOrganizationInfo = new ProxyOrganizationInfo(source.ProxyOrganizationInfo);
        }
        if (source.PartnerApplicationId != null) {
            this.PartnerApplicationId = new String(source.PartnerApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "PartnerOrganizationId", this.PartnerOrganizationId);
        this.setParamObj(map, prefix + "ApplicationInfo.", this.ApplicationInfo);
        this.setParamObj(map, prefix + "ProxyOrganizationInfo.", this.ProxyOrganizationInfo);
        this.setParamSimple(map, prefix + "PartnerApplicationId", this.PartnerApplicationId);

    }
}

