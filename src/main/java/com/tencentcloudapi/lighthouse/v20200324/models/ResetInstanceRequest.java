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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstanceRequest extends AbstractModel {

    /**
    * 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 要创建的容器配置列表。
注意：仅重装的镜像类型为Docker时支持传入该参数。
    */
    @SerializedName("Containers")
    @Expose
    private DockerContainerConfiguration [] Containers;

    /**
    * 实例登录信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码或绑定密钥。
    */
    @SerializedName("LoginConfiguration")
    @Expose
    private LoginConfiguration LoginConfiguration;

    /**
     * Get 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。 
     * @return InstanceId 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     * @param InstanceId 实例 ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。 
     * @return BlueprintId 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
     * @param BlueprintId 镜像 ID。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值中的BlueprintId获取。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 要创建的容器配置列表。
注意：仅重装的镜像类型为Docker时支持传入该参数。 
     * @return Containers 要创建的容器配置列表。
注意：仅重装的镜像类型为Docker时支持传入该参数。
     */
    public DockerContainerConfiguration [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 要创建的容器配置列表。
注意：仅重装的镜像类型为Docker时支持传入该参数。
     * @param Containers 要创建的容器配置列表。
注意：仅重装的镜像类型为Docker时支持传入该参数。
     */
    public void setContainers(DockerContainerConfiguration [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 实例登录信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码或绑定密钥。 
     * @return LoginConfiguration 实例登录信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码或绑定密钥。
     */
    public LoginConfiguration getLoginConfiguration() {
        return this.LoginConfiguration;
    }

    /**
     * Set 实例登录信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码或绑定密钥。
     * @param LoginConfiguration 实例登录信息配置。默认缺失情况下代表用户选择实例创建后设置登录密码或绑定密钥。
     */
    public void setLoginConfiguration(LoginConfiguration LoginConfiguration) {
        this.LoginConfiguration = LoginConfiguration;
    }

    public ResetInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstanceRequest(ResetInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.Containers != null) {
            this.Containers = new DockerContainerConfiguration[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new DockerContainerConfiguration(source.Containers[i]);
            }
        }
        if (source.LoginConfiguration != null) {
            this.LoginConfiguration = new LoginConfiguration(source.LoginConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "LoginConfiguration.", this.LoginConfiguration);

    }
}

