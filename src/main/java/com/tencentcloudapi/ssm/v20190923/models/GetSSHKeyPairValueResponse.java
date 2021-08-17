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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSSHKeyPairValueResponse extends AbstractModel{

    /**
    * SSH密钥对ID。
    */
    @SerializedName("SSHKeyID")
    @Expose
    private String SSHKeyID;

    /**
    * 公钥明文，使用base64编码。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 私钥明文，使用base64编码
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 此密钥对所属的项目ID。
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * SSH密钥对的描述信息。
用户可以在CVM侧控制台对密钥对的描述信息进行修改。
    */
    @SerializedName("SSHKeyDescription")
    @Expose
    private String SSHKeyDescription;

    /**
    * SSH密钥对的名称。
用户可以在CVM侧控制台对密钥对的名称进行修改。
    */
    @SerializedName("SSHKeyName")
    @Expose
    private String SSHKeyName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SSH密钥对ID。 
     * @return SSHKeyID SSH密钥对ID。
     */
    public String getSSHKeyID() {
        return this.SSHKeyID;
    }

    /**
     * Set SSH密钥对ID。
     * @param SSHKeyID SSH密钥对ID。
     */
    public void setSSHKeyID(String SSHKeyID) {
        this.SSHKeyID = SSHKeyID;
    }

    /**
     * Get 公钥明文，使用base64编码。 
     * @return PublicKey 公钥明文，使用base64编码。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥明文，使用base64编码。
     * @param PublicKey 公钥明文，使用base64编码。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 私钥明文，使用base64编码 
     * @return PrivateKey 私钥明文，使用base64编码
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私钥明文，使用base64编码
     * @param PrivateKey 私钥明文，使用base64编码
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 此密钥对所属的项目ID。 
     * @return ProjectID 此密钥对所属的项目ID。
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 此密钥对所属的项目ID。
     * @param ProjectID 此密钥对所属的项目ID。
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get SSH密钥对的描述信息。
用户可以在CVM侧控制台对密钥对的描述信息进行修改。 
     * @return SSHKeyDescription SSH密钥对的描述信息。
用户可以在CVM侧控制台对密钥对的描述信息进行修改。
     */
    public String getSSHKeyDescription() {
        return this.SSHKeyDescription;
    }

    /**
     * Set SSH密钥对的描述信息。
用户可以在CVM侧控制台对密钥对的描述信息进行修改。
     * @param SSHKeyDescription SSH密钥对的描述信息。
用户可以在CVM侧控制台对密钥对的描述信息进行修改。
     */
    public void setSSHKeyDescription(String SSHKeyDescription) {
        this.SSHKeyDescription = SSHKeyDescription;
    }

    /**
     * Get SSH密钥对的名称。
用户可以在CVM侧控制台对密钥对的名称进行修改。 
     * @return SSHKeyName SSH密钥对的名称。
用户可以在CVM侧控制台对密钥对的名称进行修改。
     */
    public String getSSHKeyName() {
        return this.SSHKeyName;
    }

    /**
     * Set SSH密钥对的名称。
用户可以在CVM侧控制台对密钥对的名称进行修改。
     * @param SSHKeyName SSH密钥对的名称。
用户可以在CVM侧控制台对密钥对的名称进行修改。
     */
    public void setSSHKeyName(String SSHKeyName) {
        this.SSHKeyName = SSHKeyName;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetSSHKeyPairValueResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSSHKeyPairValueResponse(GetSSHKeyPairValueResponse source) {
        if (source.SSHKeyID != null) {
            this.SSHKeyID = new String(source.SSHKeyID);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.SSHKeyDescription != null) {
            this.SSHKeyDescription = new String(source.SSHKeyDescription);
        }
        if (source.SSHKeyName != null) {
            this.SSHKeyName = new String(source.SSHKeyName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSHKeyID", this.SSHKeyID);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "SSHKeyDescription", this.SSHKeyDescription);
        this.setParamSimple(map, prefix + "SSHKeyName", this.SSHKeyName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

