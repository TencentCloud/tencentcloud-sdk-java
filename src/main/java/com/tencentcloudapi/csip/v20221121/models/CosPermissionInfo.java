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

public class CosPermissionInfo extends AbstractModel {

    /**
    * 权限来源
    */
    @SerializedName("PermissionSource")
    @Expose
    private String PermissionSource;

    /**
    * 权限内容
    */
    @SerializedName("PermissionContent")
    @Expose
    private String PermissionContent;

    /**
    * 授权资源
    */
    @SerializedName("GrantResource")
    @Expose
    private String GrantResource;

    /**
    * 授权动作
    */
    @SerializedName("GrantAction")
    @Expose
    private String GrantAction;

    /**
    * 授权条件
    */
    @SerializedName("GrantCondition")
    @Expose
    private String GrantCondition;

    /**
     * Get 权限来源 
     * @return PermissionSource 权限来源
     */
    public String getPermissionSource() {
        return this.PermissionSource;
    }

    /**
     * Set 权限来源
     * @param PermissionSource 权限来源
     */
    public void setPermissionSource(String PermissionSource) {
        this.PermissionSource = PermissionSource;
    }

    /**
     * Get 权限内容 
     * @return PermissionContent 权限内容
     */
    public String getPermissionContent() {
        return this.PermissionContent;
    }

    /**
     * Set 权限内容
     * @param PermissionContent 权限内容
     */
    public void setPermissionContent(String PermissionContent) {
        this.PermissionContent = PermissionContent;
    }

    /**
     * Get 授权资源 
     * @return GrantResource 授权资源
     */
    public String getGrantResource() {
        return this.GrantResource;
    }

    /**
     * Set 授权资源
     * @param GrantResource 授权资源
     */
    public void setGrantResource(String GrantResource) {
        this.GrantResource = GrantResource;
    }

    /**
     * Get 授权动作 
     * @return GrantAction 授权动作
     */
    public String getGrantAction() {
        return this.GrantAction;
    }

    /**
     * Set 授权动作
     * @param GrantAction 授权动作
     */
    public void setGrantAction(String GrantAction) {
        this.GrantAction = GrantAction;
    }

    /**
     * Get 授权条件 
     * @return GrantCondition 授权条件
     */
    public String getGrantCondition() {
        return this.GrantCondition;
    }

    /**
     * Set 授权条件
     * @param GrantCondition 授权条件
     */
    public void setGrantCondition(String GrantCondition) {
        this.GrantCondition = GrantCondition;
    }

    public CosPermissionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPermissionInfo(CosPermissionInfo source) {
        if (source.PermissionSource != null) {
            this.PermissionSource = new String(source.PermissionSource);
        }
        if (source.PermissionContent != null) {
            this.PermissionContent = new String(source.PermissionContent);
        }
        if (source.GrantResource != null) {
            this.GrantResource = new String(source.GrantResource);
        }
        if (source.GrantAction != null) {
            this.GrantAction = new String(source.GrantAction);
        }
        if (source.GrantCondition != null) {
            this.GrantCondition = new String(source.GrantCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PermissionSource", this.PermissionSource);
        this.setParamSimple(map, prefix + "PermissionContent", this.PermissionContent);
        this.setParamSimple(map, prefix + "GrantResource", this.GrantResource);
        this.setParamSimple(map, prefix + "GrantAction", this.GrantAction);
        this.setParamSimple(map, prefix + "GrantCondition", this.GrantCondition);

    }
}

