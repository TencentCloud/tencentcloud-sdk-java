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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfsFileSystemsRequest extends AbstractModel {

    /**
    * <p>文件系统 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>私有网络（VPC） ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Offset 分页码,默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Limit 页面大小，默认10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>用户自定义名称</p>
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * <p>过滤条件。<br><br><li>Protocol - Array of String - 是否必填：否 -（过滤条件）按协议过滤。(NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - 是否必填：否 -（过滤条件）按存储类型过滤。(SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - 是否必填：否 -（过滤条件）按生命周期过滤。(creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - 是否必填：否 -（过滤条件）按可用区过滤。(例如：ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - 是否必填：否 -（过滤条件）按导出点IP地址过滤。(例如：10.0.0.3) </li><br><br><li>PGroupId - Array of String - 是否必填：否 -（过滤条件）按权限组ID过滤。(例如：pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：默认权限组) </li><br><br><li>Scenario- Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：AgentSandbox) </li></p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>文件系统 ID</p> 
     * @return FileSystemId <p>文件系统 ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID</p>
     * @param FileSystemId <p>文件系统 ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>私有网络（VPC） ID</p> 
     * @return VpcId <p>私有网络（VPC） ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络（VPC） ID</p>
     * @param VpcId <p>私有网络（VPC） ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID</p> 
     * @return SubnetId <p>子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p>
     * @param SubnetId <p>子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Offset 分页码,默认0</p> 
     * @return Offset <p>Offset 分页码,默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset 分页码,默认0</p>
     * @param Offset <p>Offset 分页码,默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Limit 页面大小，默认10</p> 
     * @return Limit <p>Limit 页面大小，默认10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit 页面大小，默认10</p>
     * @param Limit <p>Limit 页面大小，默认10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>用户自定义名称</p> 
     * @return CreationToken <p>用户自定义名称</p>
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set <p>用户自定义名称</p>
     * @param CreationToken <p>用户自定义名称</p>
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get <p>过滤条件。<br><br><li>Protocol - Array of String - 是否必填：否 -（过滤条件）按协议过滤。(NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - 是否必填：否 -（过滤条件）按存储类型过滤。(SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - 是否必填：否 -（过滤条件）按生命周期过滤。(creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - 是否必填：否 -（过滤条件）按可用区过滤。(例如：ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - 是否必填：否 -（过滤条件）按导出点IP地址过滤。(例如：10.0.0.3) </li><br><br><li>PGroupId - Array of String - 是否必填：否 -（过滤条件）按权限组ID过滤。(例如：pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：默认权限组) </li><br><br><li>Scenario- Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：AgentSandbox) </li></p> 
     * @return Filters <p>过滤条件。<br><br><li>Protocol - Array of String - 是否必填：否 -（过滤条件）按协议过滤。(NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - 是否必填：否 -（过滤条件）按存储类型过滤。(SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - 是否必填：否 -（过滤条件）按生命周期过滤。(creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - 是否必填：否 -（过滤条件）按可用区过滤。(例如：ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - 是否必填：否 -（过滤条件）按导出点IP地址过滤。(例如：10.0.0.3) </li><br><br><li>PGroupId - Array of String - 是否必填：否 -（过滤条件）按权限组ID过滤。(例如：pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：默认权限组) </li><br><br><li>Scenario- Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：AgentSandbox) </li></p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。<br><br><li>Protocol - Array of String - 是否必填：否 -（过滤条件）按协议过滤。(NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - 是否必填：否 -（过滤条件）按存储类型过滤。(SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - 是否必填：否 -（过滤条件）按生命周期过滤。(creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - 是否必填：否 -（过滤条件）按可用区过滤。(例如：ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - 是否必填：否 -（过滤条件）按导出点IP地址过滤。(例如：10.0.0.3) </li><br><br><li>PGroupId - Array of String - 是否必填：否 -（过滤条件）按权限组ID过滤。(例如：pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：默认权限组) </li><br><br><li>Scenario- Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：AgentSandbox) </li></p>
     * @param Filters <p>过滤条件。<br><br><li>Protocol - Array of String - 是否必填：否 -（过滤条件）按协议过滤。(NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - 是否必填：否 -（过滤条件）按存储类型过滤。(SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - 是否必填：否 -（过滤条件）按生命周期过滤。(creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - 是否必填：否 -（过滤条件）按可用区过滤。(例如：ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - 是否必填：否 -（过滤条件）按导出点IP地址过滤。(例如：10.0.0.3) </li><br><br><li>PGroupId - Array of String - 是否必填：否 -（过滤条件）按权限组ID过滤。(例如：pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：默认权限组) </li><br><br><li>Scenario- Array of String - 是否必填：否 -（过滤条件）按权限组名称过滤。(例如：AgentSandbox) </li></p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public DescribeCfsFileSystemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfsFileSystemsRequest(DescribeCfsFileSystemsRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

