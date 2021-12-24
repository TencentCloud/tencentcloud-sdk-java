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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecretRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * secret名
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 命名空间（默认:default）
    */
    @SerializedName("SecretNamespace")
    @Expose
    private String SecretNamespace;

    /**
    * secret类型(取值范围:DockerConfigJson,Opaque 默认Opaque)
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
    * DockerConfig的序列化base64编码后的字符串
    */
    @SerializedName("DockerConfigJson")
    @Expose
    private String DockerConfigJson;

    /**
    * Opaque类型的Secret内容
    */
    @SerializedName("CloudData")
    @Expose
    private KeyValueObj [] CloudData;

    /**
    * DockerConfig配置
    */
    @SerializedName("DockerConfig")
    @Expose
    private DockerConfig DockerConfig;

    /**
     * Get 单元ID 
     * @return EdgeUnitID 单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitID 单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get secret名 
     * @return SecretName secret名
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名
     * @param SecretName secret名
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 命名空间（默认:default） 
     * @return SecretNamespace 命名空间（默认:default）
     */
    public String getSecretNamespace() {
        return this.SecretNamespace;
    }

    /**
     * Set 命名空间（默认:default）
     * @param SecretNamespace 命名空间（默认:default）
     */
    public void setSecretNamespace(String SecretNamespace) {
        this.SecretNamespace = SecretNamespace;
    }

    /**
     * Get secret类型(取值范围:DockerConfigJson,Opaque 默认Opaque) 
     * @return SecretType secret类型(取值范围:DockerConfigJson,Opaque 默认Opaque)
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set secret类型(取值范围:DockerConfigJson,Opaque 默认Opaque)
     * @param SecretType secret类型(取值范围:DockerConfigJson,Opaque 默认Opaque)
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get DockerConfig的序列化base64编码后的字符串 
     * @return DockerConfigJson DockerConfig的序列化base64编码后的字符串
     */
    public String getDockerConfigJson() {
        return this.DockerConfigJson;
    }

    /**
     * Set DockerConfig的序列化base64编码后的字符串
     * @param DockerConfigJson DockerConfig的序列化base64编码后的字符串
     */
    public void setDockerConfigJson(String DockerConfigJson) {
        this.DockerConfigJson = DockerConfigJson;
    }

    /**
     * Get Opaque类型的Secret内容 
     * @return CloudData Opaque类型的Secret内容
     */
    public KeyValueObj [] getCloudData() {
        return this.CloudData;
    }

    /**
     * Set Opaque类型的Secret内容
     * @param CloudData Opaque类型的Secret内容
     */
    public void setCloudData(KeyValueObj [] CloudData) {
        this.CloudData = CloudData;
    }

    /**
     * Get DockerConfig配置 
     * @return DockerConfig DockerConfig配置
     */
    public DockerConfig getDockerConfig() {
        return this.DockerConfig;
    }

    /**
     * Set DockerConfig配置
     * @param DockerConfig DockerConfig配置
     */
    public void setDockerConfig(DockerConfig DockerConfig) {
        this.DockerConfig = DockerConfig;
    }

    public CreateSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecretRequest(CreateSecretRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.SecretNamespace != null) {
            this.SecretNamespace = new String(source.SecretNamespace);
        }
        if (source.SecretType != null) {
            this.SecretType = new String(source.SecretType);
        }
        if (source.DockerConfigJson != null) {
            this.DockerConfigJson = new String(source.DockerConfigJson);
        }
        if (source.CloudData != null) {
            this.CloudData = new KeyValueObj[source.CloudData.length];
            for (int i = 0; i < source.CloudData.length; i++) {
                this.CloudData[i] = new KeyValueObj(source.CloudData[i]);
            }
        }
        if (source.DockerConfig != null) {
            this.DockerConfig = new DockerConfig(source.DockerConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "SecretNamespace", this.SecretNamespace);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "DockerConfigJson", this.DockerConfigJson);
        this.setParamArrayObj(map, prefix + "CloudData.", this.CloudData);
        this.setParamObj(map, prefix + "DockerConfig.", this.DockerConfig);

    }
}

