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
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 企业名称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 姓名,最大长度50个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号，大陆手机号11位
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 要跳转的链接类型

- HTTP：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  (默认)
- APP： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型

    */
    @SerializedName("EndPoint")
    @Expose
    private String EndPoint;

    /**
    * 签署流程编号 (PathType=1时必传)
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同组ID 
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 要跳转到的页面类型 

- 0: 不传, 主页 (默认)
- 1: 小程序合同详情 
- 2: 小程序合同列表页 

    */
    @SerializedName("PathType")
    @Expose
    private Long PathType;

    /**
    * 是否自动回跳
true：是，
false：否。
该参数只针对"APP" 类型的签署链接有效
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 生成的签署链接在签署过程隐藏的按钮列表, 可以设置隐藏的按钮列表如下

- 0:合同签署页面更多操作按钮
- 1:合同签署页面更多操作的拒绝签署按钮
- 2:合同签署页面更多操作的转他人处理按钮
- 3:签署成功页的查看详情按钮
    */
    @SerializedName("Hides")
    @Expose
    private Long [] Hides;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 企业名称 
     * @return OrganizationName 企业名称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业名称
     * @param OrganizationName 企业名称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 姓名,最大长度50个字符 
     * @return Name 姓名,最大长度50个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名,最大长度50个字符
     * @param Name 姓名,最大长度50个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号，大陆手机号11位 
     * @return Mobile 手机号，大陆手机号11位
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号，大陆手机号11位
     * @param Mobile 手机号，大陆手机号11位
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 要跳转的链接类型

- HTTP：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  (默认)
- APP： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型
 
     * @return EndPoint 要跳转的链接类型

- HTTP：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  (默认)
- APP： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型

     */
    public String getEndPoint() {
        return this.EndPoint;
    }

    /**
     * Set 要跳转的链接类型

- HTTP：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  (默认)
- APP： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型

     * @param EndPoint 要跳转的链接类型

- HTTP：跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型  (默认)
- APP： 第三方APP或小程序跳转电子签小程序的path,  APP或者小程序跳转适合此类型

     */
    public void setEndPoint(String EndPoint) {
        this.EndPoint = EndPoint;
    }

    /**
     * Get 签署流程编号 (PathType=1时必传) 
     * @return FlowId 签署流程编号 (PathType=1时必传)
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署流程编号 (PathType=1时必传)
     * @param FlowId 签署流程编号 (PathType=1时必传)
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同组ID  
     * @return FlowGroupId 合同组ID 
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组ID 
     * @param FlowGroupId 合同组ID 
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 要跳转到的页面类型 

- 0: 不传, 主页 (默认)
- 1: 小程序合同详情 
- 2: 小程序合同列表页 
 
     * @return PathType 要跳转到的页面类型 

- 0: 不传, 主页 (默认)
- 1: 小程序合同详情 
- 2: 小程序合同列表页 

     */
    public Long getPathType() {
        return this.PathType;
    }

    /**
     * Set 要跳转到的页面类型 

- 0: 不传, 主页 (默认)
- 1: 小程序合同详情 
- 2: 小程序合同列表页 

     * @param PathType 要跳转到的页面类型 

- 0: 不传, 主页 (默认)
- 1: 小程序合同详情 
- 2: 小程序合同列表页 

     */
    public void setPathType(Long PathType) {
        this.PathType = PathType;
    }

    /**
     * Get 是否自动回跳
true：是，
false：否。
该参数只针对"APP" 类型的签署链接有效 
     * @return AutoJumpBack 是否自动回跳
true：是，
false：否。
该参数只针对"APP" 类型的签署链接有效
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set 是否自动回跳
true：是，
false：否。
该参数只针对"APP" 类型的签署链接有效
     * @param AutoJumpBack 是否自动回跳
true：是，
false：否。
该参数只针对"APP" 类型的签署链接有效
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 生成的签署链接在签署过程隐藏的按钮列表, 可以设置隐藏的按钮列表如下

- 0:合同签署页面更多操作按钮
- 1:合同签署页面更多操作的拒绝签署按钮
- 2:合同签署页面更多操作的转他人处理按钮
- 3:签署成功页的查看详情按钮 
     * @return Hides 生成的签署链接在签署过程隐藏的按钮列表, 可以设置隐藏的按钮列表如下

- 0:合同签署页面更多操作按钮
- 1:合同签署页面更多操作的拒绝签署按钮
- 2:合同签署页面更多操作的转他人处理按钮
- 3:签署成功页的查看详情按钮
     */
    public Long [] getHides() {
        return this.Hides;
    }

    /**
     * Set 生成的签署链接在签署过程隐藏的按钮列表, 可以设置隐藏的按钮列表如下

- 0:合同签署页面更多操作按钮
- 1:合同签署页面更多操作的拒绝签署按钮
- 2:合同签署页面更多操作的转他人处理按钮
- 3:签署成功页的查看详情按钮
     * @param Hides 生成的签署链接在签署过程隐藏的按钮列表, 可以设置隐藏的按钮列表如下

- 0:合同签署页面更多操作按钮
- 1:合同签署页面更多操作的拒绝签署按钮
- 2:合同签署页面更多操作的转他人处理按钮
- 3:签署成功页的查看详情按钮
     */
    public void setHides(Long [] Hides) {
        this.Hides = Hides;
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

    }
}

