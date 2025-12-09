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

public class CreateEmployeeQualificationSealQrCodeRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 提示信息，扫码后此信息会展示给扫描用户，用来提示用户授权操作的目的，会在授权界面下面的位置展示。

![image](https://qcloudimg.tencent-cloud.cn/raw/8436ffd78c20605e6b133ff4bc4d2ac7.png)
    */
    @SerializedName("HintText")
    @Expose
    private String HintText;

    /**
    * 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 2000长度。在执业章授权完成后的回调场景，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_seals#%E4%BA%8C-%E5%91%98%E5%B7%A5%E6%89%A7%E4%B8%9A%E7%AB%A0%E5%9B%9E%E8%B0%83%E9%80%9A%E7%9F%A5">回调通知</a>模块。
示例值:QmFzZTYOIEJhc2U2NCA=
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。 支持填入集团子公司经办人 userId 代发合同。  注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 提示信息，扫码后此信息会展示给扫描用户，用来提示用户授权操作的目的，会在授权界面下面的位置展示。

![image](https://qcloudimg.tencent-cloud.cn/raw/8436ffd78c20605e6b133ff4bc4d2ac7.png) 
     * @return HintText 提示信息，扫码后此信息会展示给扫描用户，用来提示用户授权操作的目的，会在授权界面下面的位置展示。

![image](https://qcloudimg.tencent-cloud.cn/raw/8436ffd78c20605e6b133ff4bc4d2ac7.png)
     */
    public String getHintText() {
        return this.HintText;
    }

    /**
     * Set 提示信息，扫码后此信息会展示给扫描用户，用来提示用户授权操作的目的，会在授权界面下面的位置展示。

![image](https://qcloudimg.tencent-cloud.cn/raw/8436ffd78c20605e6b133ff4bc4d2ac7.png)
     * @param HintText 提示信息，扫码后此信息会展示给扫描用户，用来提示用户授权操作的目的，会在授权界面下面的位置展示。

![image](https://qcloudimg.tencent-cloud.cn/raw/8436ffd78c20605e6b133ff4bc4d2ac7.png)
     */
    public void setHintText(String HintText) {
        this.HintText = HintText;
    }

    /**
     * Get 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 2000长度。在执业章授权完成后的回调场景，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_seals#%E4%BA%8C-%E5%91%98%E5%B7%A5%E6%89%A7%E4%B8%9A%E7%AB%A0%E5%9B%9E%E8%B0%83%E9%80%9A%E7%9F%A5">回调通知</a>模块。
示例值:QmFzZTYOIEJhc2U2NCA= 
     * @return UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 2000长度。在执业章授权完成后的回调场景，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_seals#%E4%BA%8C-%E5%91%98%E5%B7%A5%E6%89%A7%E4%B8%9A%E7%AB%A0%E5%9B%9E%E8%B0%83%E9%80%9A%E7%9F%A5">回调通知</a>模块。
示例值:QmFzZTYOIEJhc2U2NCA=
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 2000长度。在执业章授权完成后的回调场景，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_seals#%E4%BA%8C-%E5%91%98%E5%B7%A5%E6%89%A7%E4%B8%9A%E7%AB%A0%E5%9B%9E%E8%B0%83%E9%80%9A%E7%9F%A5">回调通知</a>模块。
示例值:QmFzZTYOIEJhc2U2NCA=
     * @param UserData 调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 2000长度。在执业章授权完成后的回调场景，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_seals#%E4%BA%8C-%E5%91%98%E5%B7%A5%E6%89%A7%E4%B8%9A%E7%AB%A0%E5%9B%9E%E8%B0%83%E9%80%9A%E7%9F%A5">回调通知</a>模块。
示例值:QmFzZTYOIEJhc2U2NCA=
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    public CreateEmployeeQualificationSealQrCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmployeeQualificationSealQrCodeRequest(CreateEmployeeQualificationSealQrCodeRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.HintText != null) {
            this.HintText = new String(source.HintText);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "HintText", this.HintText);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

