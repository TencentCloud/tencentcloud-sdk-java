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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceLinkedRoleRequest extends AbstractModel{

    /**
    * 授权服务，附加了此角色的腾讯云服务主体。
    */
    @SerializedName("QCSServiceName")
    @Expose
    private String [] QCSServiceName;

    /**
    * 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
    */
    @SerializedName("CustomSuffix")
    @Expose
    private String CustomSuffix;

    /**
    * 角色说明。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 授权服务，附加了此角色的腾讯云服务主体。 
     * @return QCSServiceName 授权服务，附加了此角色的腾讯云服务主体。
     */
    public String [] getQCSServiceName() {
        return this.QCSServiceName;
    }

    /**
     * Set 授权服务，附加了此角色的腾讯云服务主体。
     * @param QCSServiceName 授权服务，附加了此角色的腾讯云服务主体。
     */
    public void setQCSServiceName(String [] QCSServiceName) {
        this.QCSServiceName = QCSServiceName;
    }

    /**
     * Get 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。 
     * @return CustomSuffix 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
     */
    public String getCustomSuffix() {
        return this.CustomSuffix;
    }

    /**
     * Set 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
     * @param CustomSuffix 自定义后缀，根据您提供的字符串，与服务提供的前缀组合在一起以形成完整的角色名称。
     */
    public void setCustomSuffix(String CustomSuffix) {
        this.CustomSuffix = CustomSuffix;
    }

    /**
     * Get 角色说明。 
     * @return Description 角色说明。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 角色说明。
     * @param Description 角色说明。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QCSServiceName.", this.QCSServiceName);
        this.setParamSimple(map, prefix + "CustomSuffix", this.CustomSuffix);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

