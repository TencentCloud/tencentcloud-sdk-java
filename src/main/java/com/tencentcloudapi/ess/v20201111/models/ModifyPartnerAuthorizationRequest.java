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

public class ModifyPartnerAuthorizationRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。<br/>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 腾讯电子签平台分配的生态集成业务的**业务标识**，**需要联系接入产品经理提供**。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 合作方企业通过集成方创建的应用id, 必须与业务标记（Business）保持对应。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)

    */
    @SerializedName("PartnerApplicationId")
    @Expose
    private String PartnerApplicationId;

    /**
    * 第三方应用的配置信息。其中包括 回调地址，加密KEY等信息。
执行成功后会覆盖掉对应的第三方应用的回调相关配置。
    */
    @SerializedName("ApplicationInfo")
    @Expose
    private CallbackInfo ApplicationInfo;

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
     * Get 腾讯电子签平台分配的生态集成业务的**业务标识**，**需要联系接入产品经理提供**。 
     * @return BusinessId 腾讯电子签平台分配的生态集成业务的**业务标识**，**需要联系接入产品经理提供**。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 腾讯电子签平台分配的生态集成业务的**业务标识**，**需要联系接入产品经理提供**。
     * @param BusinessId 腾讯电子签平台分配的生态集成业务的**业务标识**，**需要联系接入产品经理提供**。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 合作方企业通过集成方创建的应用id, 必须与业务标记（Business）保持对应。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)
 
     * @return PartnerApplicationId 合作方企业通过集成方创建的应用id, 必须与业务标记（Business）保持对应。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)

     */
    public String getPartnerApplicationId() {
        return this.PartnerApplicationId;
    }

    /**
     * Set 合作方企业通过集成方创建的应用id, 必须与业务标记（Business）保持对应。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)

     * @param PartnerApplicationId 合作方企业通过集成方创建的应用id, 必须与业务标记（Business）保持对应。
![image](https://qcloudimg.tencent-cloud.cn/raw/9bc4ee2bd5972035d12033608df157c9.png)

     */
    public void setPartnerApplicationId(String PartnerApplicationId) {
        this.PartnerApplicationId = PartnerApplicationId;
    }

    /**
     * Get 第三方应用的配置信息。其中包括 回调地址，加密KEY等信息。
执行成功后会覆盖掉对应的第三方应用的回调相关配置。 
     * @return ApplicationInfo 第三方应用的配置信息。其中包括 回调地址，加密KEY等信息。
执行成功后会覆盖掉对应的第三方应用的回调相关配置。
     */
    public CallbackInfo getApplicationInfo() {
        return this.ApplicationInfo;
    }

    /**
     * Set 第三方应用的配置信息。其中包括 回调地址，加密KEY等信息。
执行成功后会覆盖掉对应的第三方应用的回调相关配置。
     * @param ApplicationInfo 第三方应用的配置信息。其中包括 回调地址，加密KEY等信息。
执行成功后会覆盖掉对应的第三方应用的回调相关配置。
     */
    public void setApplicationInfo(CallbackInfo ApplicationInfo) {
        this.ApplicationInfo = ApplicationInfo;
    }

    public ModifyPartnerAuthorizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPartnerAuthorizationRequest(ModifyPartnerAuthorizationRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.PartnerApplicationId != null) {
            this.PartnerApplicationId = new String(source.PartnerApplicationId);
        }
        if (source.ApplicationInfo != null) {
            this.ApplicationInfo = new CallbackInfo(source.ApplicationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "PartnerApplicationId", this.PartnerApplicationId);
        this.setParamObj(map, prefix + "ApplicationInfo.", this.ApplicationInfo);

    }
}

