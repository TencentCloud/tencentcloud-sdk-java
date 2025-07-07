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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizeDSPAMetaResourcesRequest extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 授权方式，可选：automatic(一键自动授权) 、 account(指定用户名授权)。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 资源类型。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 资源所处地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 用户授权的账户信息，如果是一键自动授权模式，则不需要填写账户名与密码。
    */
    @SerializedName("ResourcesAccount")
    @Expose
    private DspaResourceAccount [] ResourcesAccount;

    /**
    * 创建默认主模板扫描任务
    */
    @SerializedName("CreateDefaultTask")
    @Expose
    private Boolean CreateDefaultTask;

    /**
    * 授权范围（all:授权整个数据源 manual:手动指定数据库）
    */
    @SerializedName("AuthRange")
    @Expose
    private String AuthRange;

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
     * Get 授权方式，可选：automatic(一键自动授权) 、 account(指定用户名授权)。 
     * @return AuthType 授权方式，可选：automatic(一键自动授权) 、 account(指定用户名授权)。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 授权方式，可选：automatic(一键自动授权) 、 account(指定用户名授权)。
     * @param AuthType 授权方式，可选：automatic(一键自动授权) 、 account(指定用户名授权)。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 资源类型。 
     * @return MetaType 资源类型。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 资源类型。
     * @param MetaType 资源类型。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 资源所处地域。 
     * @return ResourceRegion 资源所处地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所处地域。
     * @param ResourceRegion 资源所处地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 用户授权的账户信息，如果是一键自动授权模式，则不需要填写账户名与密码。 
     * @return ResourcesAccount 用户授权的账户信息，如果是一键自动授权模式，则不需要填写账户名与密码。
     */
    public DspaResourceAccount [] getResourcesAccount() {
        return this.ResourcesAccount;
    }

    /**
     * Set 用户授权的账户信息，如果是一键自动授权模式，则不需要填写账户名与密码。
     * @param ResourcesAccount 用户授权的账户信息，如果是一键自动授权模式，则不需要填写账户名与密码。
     */
    public void setResourcesAccount(DspaResourceAccount [] ResourcesAccount) {
        this.ResourcesAccount = ResourcesAccount;
    }

    /**
     * Get 创建默认主模板扫描任务 
     * @return CreateDefaultTask 创建默认主模板扫描任务
     */
    public Boolean getCreateDefaultTask() {
        return this.CreateDefaultTask;
    }

    /**
     * Set 创建默认主模板扫描任务
     * @param CreateDefaultTask 创建默认主模板扫描任务
     */
    public void setCreateDefaultTask(Boolean CreateDefaultTask) {
        this.CreateDefaultTask = CreateDefaultTask;
    }

    /**
     * Get 授权范围（all:授权整个数据源 manual:手动指定数据库） 
     * @return AuthRange 授权范围（all:授权整个数据源 manual:手动指定数据库）
     */
    public String getAuthRange() {
        return this.AuthRange;
    }

    /**
     * Set 授权范围（all:授权整个数据源 manual:手动指定数据库）
     * @param AuthRange 授权范围（all:授权整个数据源 manual:手动指定数据库）
     */
    public void setAuthRange(String AuthRange) {
        this.AuthRange = AuthRange;
    }

    public AuthorizeDSPAMetaResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizeDSPAMetaResourcesRequest(AuthorizeDSPAMetaResourcesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourcesAccount != null) {
            this.ResourcesAccount = new DspaResourceAccount[source.ResourcesAccount.length];
            for (int i = 0; i < source.ResourcesAccount.length; i++) {
                this.ResourcesAccount[i] = new DspaResourceAccount(source.ResourcesAccount[i]);
            }
        }
        if (source.CreateDefaultTask != null) {
            this.CreateDefaultTask = new Boolean(source.CreateDefaultTask);
        }
        if (source.AuthRange != null) {
            this.AuthRange = new String(source.AuthRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArrayObj(map, prefix + "ResourcesAccount.", this.ResourcesAccount);
        this.setParamSimple(map, prefix + "CreateDefaultTask", this.CreateDefaultTask);
        this.setParamSimple(map, prefix + "AuthRange", this.AuthRange);

    }
}

