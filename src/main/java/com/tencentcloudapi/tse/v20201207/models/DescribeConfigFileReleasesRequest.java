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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigFileReleasesRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 配置分组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 只保护处于使用状态
    */
    @SerializedName("OnlyUse")
    @Expose
    private Boolean OnlyUse;

    /**
    * 发布名称
    */
    @SerializedName("ReleaseName")
    @Expose
    private String ReleaseName;

    /**
    * 排序字段，mtime/version/name
，默认version
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序，asc/desc，默认 desc
    */
    @SerializedName("OrderDesc")
    @Expose
    private String OrderDesc;

    /**
    * 配置发布ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 条数 
     * @return Limit 条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数
     * @param Limit 条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 配置分组 
     * @return Group 配置分组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 配置分组
     * @param Group 配置分组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 只保护处于使用状态 
     * @return OnlyUse 只保护处于使用状态
     */
    public Boolean getOnlyUse() {
        return this.OnlyUse;
    }

    /**
     * Set 只保护处于使用状态
     * @param OnlyUse 只保护处于使用状态
     */
    public void setOnlyUse(Boolean OnlyUse) {
        this.OnlyUse = OnlyUse;
    }

    /**
     * Get 发布名称 
     * @return ReleaseName 发布名称
     */
    public String getReleaseName() {
        return this.ReleaseName;
    }

    /**
     * Set 发布名称
     * @param ReleaseName 发布名称
     */
    public void setReleaseName(String ReleaseName) {
        this.ReleaseName = ReleaseName;
    }

    /**
     * Get 排序字段，mtime/version/name
，默认version 
     * @return OrderField 排序字段，mtime/version/name
，默认version
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段，mtime/version/name
，默认version
     * @param OrderField 排序字段，mtime/version/name
，默认version
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序，asc/desc，默认 desc 
     * @return OrderDesc 排序，asc/desc，默认 desc
     */
    public String getOrderDesc() {
        return this.OrderDesc;
    }

    /**
     * Set 排序，asc/desc，默认 desc
     * @param OrderDesc 排序，asc/desc，默认 desc
     */
    public void setOrderDesc(String OrderDesc) {
        this.OrderDesc = OrderDesc;
    }

    /**
     * Get 配置发布ID 
     * @return Id 配置发布ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置发布ID
     * @param Id 配置发布ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeConfigFileReleasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigFileReleasesRequest(DescribeConfigFileReleasesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.OnlyUse != null) {
            this.OnlyUse = new Boolean(source.OnlyUse);
        }
        if (source.ReleaseName != null) {
            this.ReleaseName = new String(source.ReleaseName);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDesc != null) {
            this.OrderDesc = new String(source.OrderDesc);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "OnlyUse", this.OnlyUse);
        this.setParamSimple(map, prefix + "ReleaseName", this.ReleaseName);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDesc", this.OrderDesc);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

