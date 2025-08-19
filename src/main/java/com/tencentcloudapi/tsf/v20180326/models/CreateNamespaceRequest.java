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

public class CreateNamespaceRequest extends AbstractModel {

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间描述
    */
    @SerializedName("NamespaceDesc")
    @Expose
    private String NamespaceDesc;

    /**
    * 命名空间资源类型；DEF：表示默认资源类型；GW：表示网关资源类型
    */
    @SerializedName("NamespaceResourceType")
    @Expose
    private String NamespaceResourceType;

    /**
    * 命名空间类型；DEF 表示默认普通命名空间；GLOBAL 表示全局命名空间
    */
    @SerializedName("NamespaceType")
    @Expose
    private String NamespaceType;

    /**
    * 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 是否开启高可用，1 表示开启，0 表示不开启
    */
    @SerializedName("IsHaEnable")
    @Expose
    private String IsHaEnable;

    /**
    * 需要绑定的数据集ID，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * 需要绑定的数据集ID列表，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

    /**
    * 是否创建k8s命名空间标识
    */
    @SerializedName("CreateK8sNamespaceFlag")
    @Expose
    private Boolean CreateK8sNamespaceFlag;

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
     * Get 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。 
     * @return ClusterId 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
     * @param ClusterId 集群ID，按照【集群ID】进行过滤，可通过调用[DescribeClusters](https://cloud.tencent.com/document/product/649/85857)查询已创建的集群列表或登录控制台进行查看；也可以调用[CreateCluster](https://cloud.tencent.com/document/product/649/36049)创建新的集群。仅在集群下无部署组、命名空间、云主机时可以删除。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间描述 
     * @return NamespaceDesc 命名空间描述
     */
    public String getNamespaceDesc() {
        return this.NamespaceDesc;
    }

    /**
     * Set 命名空间描述
     * @param NamespaceDesc 命名空间描述
     */
    public void setNamespaceDesc(String NamespaceDesc) {
        this.NamespaceDesc = NamespaceDesc;
    }

    /**
     * Get 命名空间资源类型；DEF：表示默认资源类型；GW：表示网关资源类型 
     * @return NamespaceResourceType 命名空间资源类型；DEF：表示默认资源类型；GW：表示网关资源类型
     */
    public String getNamespaceResourceType() {
        return this.NamespaceResourceType;
    }

    /**
     * Set 命名空间资源类型；DEF：表示默认资源类型；GW：表示网关资源类型
     * @param NamespaceResourceType 命名空间资源类型；DEF：表示默认资源类型；GW：表示网关资源类型
     */
    public void setNamespaceResourceType(String NamespaceResourceType) {
        this.NamespaceResourceType = NamespaceResourceType;
    }

    /**
     * Get 命名空间类型；DEF 表示默认普通命名空间；GLOBAL 表示全局命名空间 
     * @return NamespaceType 命名空间类型；DEF 表示默认普通命名空间；GLOBAL 表示全局命名空间
     */
    public String getNamespaceType() {
        return this.NamespaceType;
    }

    /**
     * Set 命名空间类型；DEF 表示默认普通命名空间；GLOBAL 表示全局命名空间
     * @param NamespaceType 命名空间类型；DEF 表示默认普通命名空间；GLOBAL 表示全局命名空间
     */
    public void setNamespaceType(String NamespaceType) {
        this.NamespaceType = NamespaceType;
    }

    /**
     * Get 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。 
     * @return NamespaceId 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
     * @param NamespaceId 命名空间ID，按照【命名空间ID】进行过滤，可通过调用[DescribeNamespaces](https://cloud.tencent.com/document/product/649/36096)查询已创建的命名空间列表或登录控制台进行查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新命名空间。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 是否开启高可用，1 表示开启，0 表示不开启 
     * @return IsHaEnable 是否开启高可用，1 表示开启，0 表示不开启
     */
    public String getIsHaEnable() {
        return this.IsHaEnable;
    }

    /**
     * Set 是否开启高可用，1 表示开启，0 表示不开启
     * @param IsHaEnable 是否开启高可用，1 表示开启，0 表示不开启
     */
    public void setIsHaEnable(String IsHaEnable) {
        this.IsHaEnable = IsHaEnable;
    }

    /**
     * Get 需要绑定的数据集ID，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。 
     * @return ProgramId 需要绑定的数据集ID，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 需要绑定的数据集ID，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
     * @param ProgramId 需要绑定的数据集ID，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get 需要绑定的数据集ID列表，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。 
     * @return ProgramIdList 需要绑定的数据集ID列表，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 需要绑定的数据集ID列表，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
     * @param ProgramIdList 需要绑定的数据集ID列表，可通过调用[DescribePrograms](https://cloud.tencent.com/document/api/649/73477)查询已创建的数据集列表或登录控制台进行查看；也可以调用[CreateProgram](https://cloud.tencent.com/document/api/649/108544)创建新的数据集。
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    /**
     * Get 是否创建k8s命名空间标识 
     * @return CreateK8sNamespaceFlag 是否创建k8s命名空间标识
     */
    public Boolean getCreateK8sNamespaceFlag() {
        return this.CreateK8sNamespaceFlag;
    }

    /**
     * Set 是否创建k8s命名空间标识
     * @param CreateK8sNamespaceFlag 是否创建k8s命名空间标识
     */
    public void setCreateK8sNamespaceFlag(Boolean CreateK8sNamespaceFlag) {
        this.CreateK8sNamespaceFlag = CreateK8sNamespaceFlag;
    }

    public CreateNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNamespaceRequest(CreateNamespaceRequest source) {
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceDesc != null) {
            this.NamespaceDesc = new String(source.NamespaceDesc);
        }
        if (source.NamespaceResourceType != null) {
            this.NamespaceResourceType = new String(source.NamespaceResourceType);
        }
        if (source.NamespaceType != null) {
            this.NamespaceType = new String(source.NamespaceType);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.IsHaEnable != null) {
            this.IsHaEnable = new String(source.IsHaEnable);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
        if (source.CreateK8sNamespaceFlag != null) {
            this.CreateK8sNamespaceFlag = new Boolean(source.CreateK8sNamespaceFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceDesc", this.NamespaceDesc);
        this.setParamSimple(map, prefix + "NamespaceResourceType", this.NamespaceResourceType);
        this.setParamSimple(map, prefix + "NamespaceType", this.NamespaceType);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "IsHaEnable", this.IsHaEnable);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);
        this.setParamSimple(map, prefix + "CreateK8sNamespaceFlag", this.CreateK8sNamespaceFlag);

    }
}

