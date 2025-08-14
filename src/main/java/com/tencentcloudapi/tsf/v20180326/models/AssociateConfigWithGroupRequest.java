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

public class AssociateConfigWithGroupRequest extends AbstractModel {

    /**
    * 配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 部署组信息
    */
    @SerializedName("Groups")
    @Expose
    private GroupInfo [] Groups;

    /**
    * 是否选择全部投递，1 表示全部，0或不填表示非全部
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
    * 命名空间ID
可通过[DescribeSimpleNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已经创建的命名空间，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=namespace)查看
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 模糊搜索关键词
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看 
     * @return ConfigId 配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     * @param ConfigId 配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 部署组信息 
     * @return Groups 部署组信息
     */
    public GroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 部署组信息
     * @param Groups 部署组信息
     */
    public void setGroups(GroupInfo [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 是否选择全部投递，1 表示全部，0或不填表示非全部 
     * @return SelectAll 是否选择全部投递，1 表示全部，0或不填表示非全部
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set 是否选择全部投递，1 表示全部，0或不填表示非全部
     * @param SelectAll 是否选择全部投递，1 表示全部，0或不填表示非全部
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get 命名空间ID
可通过[DescribeSimpleNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已经创建的命名空间，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=namespace)查看 
     * @return NamespaceId 命名空间ID
可通过[DescribeSimpleNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已经创建的命名空间，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=namespace)查看
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
可通过[DescribeSimpleNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已经创建的命名空间，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=namespace)查看
     * @param NamespaceId 命名空间ID
可通过[DescribeSimpleNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已经创建的命名空间，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=namespace)查看
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看 
     * @return ClusterId 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看
     * @param ClusterId 集群ID
可通过[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已经创建的集群列表，也可以通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1)查看
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 模糊搜索关键词 
     * @return SearchWord 模糊搜索关键词
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 模糊搜索关键词
     * @param SearchWord 模糊搜索关键词
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public AssociateConfigWithGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateConfigWithGroupRequest(AssociateConfigWithGroupRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Groups != null) {
            this.Groups = new GroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GroupInfo(source.Groups[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

