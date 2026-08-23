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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRegistryConnectivityTaskRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>镜像仓库名</p>
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * <p>镜像仓库所在region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>镜像仓库类型</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>镜像仓库API版本</p>
    */
    @SerializedName("ApiVersion")
    @Expose
    private String ApiVersion;

    /**
    * <p>账号</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>镜像仓库url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>链接检查参数</p>
    */
    @SerializedName("Params")
    @Expose
    private ImageRegistryDetectionHostParam [] Params;

    /**
    * <p>仓库id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * <p>仓库实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>镜像仓库名</p> 
     * @return RegistryName <p>镜像仓库名</p>
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set <p>镜像仓库名</p>
     * @param RegistryName <p>镜像仓库名</p>
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get <p>镜像仓库所在region</p> 
     * @return RegistryRegion <p>镜像仓库所在region</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>镜像仓库所在region</p>
     * @param RegistryRegion <p>镜像仓库所在region</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>镜像仓库类型</p> 
     * @return RegistryType <p>镜像仓库类型</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>镜像仓库类型</p>
     * @param RegistryType <p>镜像仓库类型</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>镜像仓库API版本</p> 
     * @return ApiVersion <p>镜像仓库API版本</p>
     */
    public String getApiVersion() {
        return this.ApiVersion;
    }

    /**
     * Set <p>镜像仓库API版本</p>
     * @param ApiVersion <p>镜像仓库API版本</p>
     */
    public void setApiVersion(String ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    /**
     * Get <p>账号</p> 
     * @return UserName <p>账号</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>账号</p>
     * @param UserName <p>账号</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>密码</p> 
     * @return Password <p>密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码</p>
     * @param Password <p>密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>镜像仓库url</p> 
     * @return Url <p>镜像仓库url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>镜像仓库url</p>
     * @param Url <p>镜像仓库url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>链接检查参数</p> 
     * @return Params <p>链接检查参数</p>
     */
    public ImageRegistryDetectionHostParam [] getParams() {
        return this.Params;
    }

    /**
     * Set <p>链接检查参数</p>
     * @param Params <p>链接检查参数</p>
     */
    public void setParams(ImageRegistryDetectionHostParam [] Params) {
        this.Params = Params;
    }

    /**
     * Get <p>仓库id</p> 
     * @return RegistryId <p>仓库id</p>
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>仓库id</p>
     * @param RegistryId <p>仓库id</p>
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>仓库实例id</p> 
     * @return InstanceId <p>仓库实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>仓库实例id</p>
     * @param InstanceId <p>仓库实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public CreateImageRegistryConnectivityTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRegistryConnectivityTaskRequest(CreateImageRegistryConnectivityTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ApiVersion != null) {
            this.ApiVersion = new String(source.ApiVersion);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Params != null) {
            this.Params = new ImageRegistryDetectionHostParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ImageRegistryDetectionHostParam(source.Params[i]);
            }
        }
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ApiVersion", this.ApiVersion);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

