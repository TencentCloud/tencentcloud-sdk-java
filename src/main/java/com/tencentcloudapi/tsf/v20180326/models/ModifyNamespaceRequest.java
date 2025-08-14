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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNamespaceRequest extends AbstractModel {

    /**
    * 命名空间ID，按照【命名空间ID】进行过滤，可通过调用DescribeNamespaces查询已创建的项目列表或登录控制台进行查看；也可以调用CreateNamespace创建新的项目。命名空间ID例如：namespace-6a79x94v。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 命名空间备注
    */
    @SerializedName("NamespaceDesc")
    @Expose
    private String NamespaceDesc;

    /**
    * 是否开启高可用，0表示不开启，1表示开启
    */
    @SerializedName("IsHaEnable")
    @Expose
    private String IsHaEnable;

    /**
     * Get 命名空间ID，按照【命名空间ID】进行过滤，可通过调用DescribeNamespaces查询已创建的项目列表或登录控制台进行查看；也可以调用CreateNamespace创建新的项目。命名空间ID例如：namespace-6a79x94v。 
     * @return NamespaceId 命名空间ID，按照【命名空间ID】进行过滤，可通过调用DescribeNamespaces查询已创建的项目列表或登录控制台进行查看；也可以调用CreateNamespace创建新的项目。命名空间ID例如：namespace-6a79x94v。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID，按照【命名空间ID】进行过滤，可通过调用DescribeNamespaces查询已创建的项目列表或登录控制台进行查看；也可以调用CreateNamespace创建新的项目。命名空间ID例如：namespace-6a79x94v。
     * @param NamespaceId 命名空间ID，按照【命名空间ID】进行过滤，可通过调用DescribeNamespaces查询已创建的项目列表或登录控制台进行查看；也可以调用CreateNamespace创建新的项目。命名空间ID例如：namespace-6a79x94v。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 命名空间备注 
     * @return NamespaceDesc 命名空间备注
     */
    public String getNamespaceDesc() {
        return this.NamespaceDesc;
    }

    /**
     * Set 命名空间备注
     * @param NamespaceDesc 命名空间备注
     */
    public void setNamespaceDesc(String NamespaceDesc) {
        this.NamespaceDesc = NamespaceDesc;
    }

    /**
     * Get 是否开启高可用，0表示不开启，1表示开启 
     * @return IsHaEnable 是否开启高可用，0表示不开启，1表示开启
     */
    public String getIsHaEnable() {
        return this.IsHaEnable;
    }

    /**
     * Set 是否开启高可用，0表示不开启，1表示开启
     * @param IsHaEnable 是否开启高可用，0表示不开启，1表示开启
     */
    public void setIsHaEnable(String IsHaEnable) {
        this.IsHaEnable = IsHaEnable;
    }

    public ModifyNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNamespaceRequest(ModifyNamespaceRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.NamespaceDesc != null) {
            this.NamespaceDesc = new String(source.NamespaceDesc);
        }
        if (source.IsHaEnable != null) {
            this.IsHaEnable = new String(source.IsHaEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "NamespaceDesc", this.NamespaceDesc);
        this.setParamSimple(map, prefix + "IsHaEnable", this.IsHaEnable);

    }
}

