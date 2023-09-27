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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSchemeUrlRequest extends AbstractModel{

    /**
    * 执行本接口操作的员工信息, userId 必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同流程签署方的组织机构名称。
如果名称中包含英文括号()，请使用中文括号（）代替。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 合同流程里边签署方经办人的姓名。

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 要跳转的链接类型

<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li>
<li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li>
<li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul>
    */
    @SerializedName("EndPoint")
    @Expose
    private String EndPoint;

    /**
    * 合同流程ID 
注: `如果准备跳转到合同流程签署的详情页面(即PathType=1时)必传,   跳转其他页面可不传`
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同流程组的组ID, 在合同流程组场景下，生成合同流程组的签署链接时需要赋值
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 要跳转到的页面类型 

<ul><li> **0** : 腾讯电子签小程序个人首页 (默认)</li>
<li> **1** : 腾讯电子签小程序流程合同的详情页 (即合同签署页面)</li>
<li> **2** : 腾讯电子签小程序合同列表页</li></ul>
    */
    @SerializedName("PathType")
    @Expose
    private Long PathType;

    /**
    * 签署完成后是否自动回跳
<ul><li>**false**：否, 签署完成不会自动跳转回来(默认)</li><li>**true**：是, 签署完成会自动跳转回来</li></ul>
注:  ` 该参数只针对"APP" 类型的签署链接有效`
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
    */
    @SerializedName("Hides")
    @Expose
    private Long [] Hides;

    /**
    * 签署节点ID，用于生成动态签署人链接完成领取
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
     * Get 执行本接口操作的员工信息, userId 必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息, userId 必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息, userId 必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息, userId 必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同流程签署方的组织机构名称。
如果名称中包含英文括号()，请使用中文括号（）代替。 
     * @return OrganizationName 合同流程签署方的组织机构名称。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 合同流程签署方的组织机构名称。
如果名称中包含英文括号()，请使用中文括号（）代替。
     * @param OrganizationName 合同流程签署方的组织机构名称。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 合同流程里边签署方经办人的姓名。
 
     * @return Name 合同流程里边签署方经办人的姓名。

     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合同流程里边签署方经办人的姓名。

     * @param Name 合同流程里边签署方经办人的姓名。

     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。 
     * @return Mobile 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
     * @param Mobile 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 要跳转的链接类型

<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li>
<li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li>
<li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul> 
     * @return EndPoint 要跳转的链接类型

<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li>
<li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li>
<li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul>
     */
    public String getEndPoint() {
        return this.EndPoint;
    }

    /**
     * Set 要跳转的链接类型

<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li>
<li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li>
<li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul>
     * @param EndPoint 要跳转的链接类型

<ul><li> **HTTP**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  ，此时返回长链 (默认类型)</li>
<li>**HTTP_SHORT_URL**：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型，此时返回短链</li>
<li>**APP**： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型</li></ul>
     */
    public void setEndPoint(String EndPoint) {
        this.EndPoint = EndPoint;
    }

    /**
     * Get 合同流程ID 
注: `如果准备跳转到合同流程签署的详情页面(即PathType=1时)必传,   跳转其他页面可不传` 
     * @return FlowId 合同流程ID 
注: `如果准备跳转到合同流程签署的详情页面(即PathType=1时)必传,   跳转其他页面可不传`
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID 
注: `如果准备跳转到合同流程签署的详情页面(即PathType=1时)必传,   跳转其他页面可不传`
     * @param FlowId 合同流程ID 
注: `如果准备跳转到合同流程签署的详情页面(即PathType=1时)必传,   跳转其他页面可不传`
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同流程组的组ID, 在合同流程组场景下，生成合同流程组的签署链接时需要赋值 
     * @return FlowGroupId 合同流程组的组ID, 在合同流程组场景下，生成合同流程组的签署链接时需要赋值
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同流程组的组ID, 在合同流程组场景下，生成合同流程组的签署链接时需要赋值
     * @param FlowGroupId 合同流程组的组ID, 在合同流程组场景下，生成合同流程组的签署链接时需要赋值
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 要跳转到的页面类型 

<ul><li> **0** : 腾讯电子签小程序个人首页 (默认)</li>
<li> **1** : 腾讯电子签小程序流程合同的详情页 (即合同签署页面)</li>
<li> **2** : 腾讯电子签小程序合同列表页</li></ul> 
     * @return PathType 要跳转到的页面类型 

<ul><li> **0** : 腾讯电子签小程序个人首页 (默认)</li>
<li> **1** : 腾讯电子签小程序流程合同的详情页 (即合同签署页面)</li>
<li> **2** : 腾讯电子签小程序合同列表页</li></ul>
     */
    public Long getPathType() {
        return this.PathType;
    }

    /**
     * Set 要跳转到的页面类型 

<ul><li> **0** : 腾讯电子签小程序个人首页 (默认)</li>
<li> **1** : 腾讯电子签小程序流程合同的详情页 (即合同签署页面)</li>
<li> **2** : 腾讯电子签小程序合同列表页</li></ul>
     * @param PathType 要跳转到的页面类型 

<ul><li> **0** : 腾讯电子签小程序个人首页 (默认)</li>
<li> **1** : 腾讯电子签小程序流程合同的详情页 (即合同签署页面)</li>
<li> **2** : 腾讯电子签小程序合同列表页</li></ul>
     */
    public void setPathType(Long PathType) {
        this.PathType = PathType;
    }

    /**
     * Get 签署完成后是否自动回跳
<ul><li>**false**：否, 签署完成不会自动跳转回来(默认)</li><li>**true**：是, 签署完成会自动跳转回来</li></ul>
注:  ` 该参数只针对"APP" 类型的签署链接有效` 
     * @return AutoJumpBack 签署完成后是否自动回跳
<ul><li>**false**：否, 签署完成不会自动跳转回来(默认)</li><li>**true**：是, 签署完成会自动跳转回来</li></ul>
注:  ` 该参数只针对"APP" 类型的签署链接有效`
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set 签署完成后是否自动回跳
<ul><li>**false**：否, 签署完成不会自动跳转回来(默认)</li><li>**true**：是, 签署完成会自动跳转回来</li></ul>
注:  ` 该参数只针对"APP" 类型的签署链接有效`
     * @param AutoJumpBack 签署完成后是否自动回跳
<ul><li>**false**：否, 签署完成不会自动跳转回来(默认)</li><li>**true**：是, 签署完成会自动跳转回来</li></ul>
注:  ` 该参数只针对"APP" 类型的签署链接有效`
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮` 
     * @return Hides 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
     */
    public Long [] getHides() {
        return this.Hides;
    }

    /**
     * Set 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
     * @param Hides 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
     */
    public void setHides(Long [] Hides) {
        this.Hides = Hides;
    }

    /**
     * Get 签署节点ID，用于生成动态签署人链接完成领取 
     * @return RecipientId 签署节点ID，用于生成动态签署人链接完成领取
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署节点ID，用于生成动态签署人链接完成领取
     * @param RecipientId 签署节点ID，用于生成动态签署人链接完成领取
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    public CreateSchemeUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSchemeUrlRequest(CreateSchemeUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.EndPoint != null) {
            this.EndPoint = new String(source.EndPoint);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.PathType != null) {
            this.PathType = new Long(source.PathType);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Hides != null) {
            this.Hides = new Long[source.Hides.length];
            for (int i = 0; i < source.Hides.length; i++) {
                this.Hides[i] = new Long(source.Hides[i]);
            }
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "EndPoint", this.EndPoint);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "PathType", this.PathType);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "Hides.", this.Hides);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);

    }
}

