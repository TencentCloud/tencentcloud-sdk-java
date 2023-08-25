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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDSPASelfBuildResourceRequest extends AbstractModel{

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 云资源名称，如果是通过CVM访问则填写CVM的资源ID，如果是通过LB访问则填写LB的资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源绑定的端口，为0则表示不更新。
    */
    @SerializedName("ResourceVPort")
    @Expose
    private Long ResourceVPort;

    /**
    * 账户名，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账户密码，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 云资源名称，如果是通过CVM访问则填写CVM的资源ID，如果是通过LB访问则填写LB的资源ID。 
     * @return ResourceId 云资源名称，如果是通过CVM访问则填写CVM的资源ID，如果是通过LB访问则填写LB的资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 云资源名称，如果是通过CVM访问则填写CVM的资源ID，如果是通过LB访问则填写LB的资源ID。
     * @param ResourceId 云资源名称，如果是通过CVM访问则填写CVM的资源ID，如果是通过LB访问则填写LB的资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源绑定的端口，为0则表示不更新。 
     * @return ResourceVPort 资源绑定的端口，为0则表示不更新。
     */
    public Long getResourceVPort() {
        return this.ResourceVPort;
    }

    /**
     * Set 资源绑定的端口，为0则表示不更新。
     * @param ResourceVPort 资源绑定的端口，为0则表示不更新。
     */
    public void setResourceVPort(Long ResourceVPort) {
        this.ResourceVPort = ResourceVPort;
    }

    /**
     * Get 账户名，为空则表示不更新。
UserName和Password必须同时填写或同时为空。 
     * @return UserName 账户名，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账户名，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
     * @param UserName 账户名，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账户密码，为空则表示不更新。
UserName和Password必须同时填写或同时为空。 
     * @return Password 账户密码，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账户密码，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
     * @param Password 账户密码，为空则表示不更新。
UserName和Password必须同时填写或同时为空。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public UpdateDSPASelfBuildResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDSPASelfBuildResourceRequest(UpdateDSPASelfBuildResourceRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceVPort != null) {
            this.ResourceVPort = new Long(source.ResourceVPort);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceVPort", this.ResourceVPort);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

