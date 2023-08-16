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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceTags extends AbstractModel{

    /**
    * 集群id 或者 cvm id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源6段式表达式
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 资源前缀
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * ap-beijing
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * emr
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 删除的标签列表
    */
    @SerializedName("DeleteTags")
    @Expose
    private Tag [] DeleteTags;

    /**
    * 添加的标签列表
    */
    @SerializedName("AddTags")
    @Expose
    private Tag [] AddTags;

    /**
    * 修改的标签列表
    */
    @SerializedName("ModifyTags")
    @Expose
    private Tag [] ModifyTags;

    /**
     * Get 集群id 或者 cvm id 
     * @return ResourceId 集群id 或者 cvm id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 集群id 或者 cvm id
     * @param ResourceId 集群id 或者 cvm id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源6段式表达式 
     * @return Resource 资源6段式表达式
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源6段式表达式
     * @param Resource 资源6段式表达式
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 资源前缀 
     * @return ResourcePrefix 资源前缀
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set 资源前缀
     * @param ResourcePrefix 资源前缀
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get ap-beijing 
     * @return ResourceRegion ap-beijing
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set ap-beijing
     * @param ResourceRegion ap-beijing
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get emr 
     * @return ServiceType emr
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set emr
     * @param ServiceType emr
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 删除的标签列表 
     * @return DeleteTags 删除的标签列表
     */
    public Tag [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set 删除的标签列表
     * @param DeleteTags 删除的标签列表
     */
    public void setDeleteTags(Tag [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get 添加的标签列表 
     * @return AddTags 添加的标签列表
     */
    public Tag [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set 添加的标签列表
     * @param AddTags 添加的标签列表
     */
    public void setAddTags(Tag [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get 修改的标签列表 
     * @return ModifyTags 修改的标签列表
     */
    public Tag [] getModifyTags() {
        return this.ModifyTags;
    }

    /**
     * Set 修改的标签列表
     * @param ModifyTags 修改的标签列表
     */
    public void setModifyTags(Tag [] ModifyTags) {
        this.ModifyTags = ModifyTags;
    }

    public ModifyResourceTags() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceTags(ModifyResourceTags source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new Tag[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new Tag(source.DeleteTags[i]);
            }
        }
        if (source.AddTags != null) {
            this.AddTags = new Tag[source.AddTags.length];
            for (int i = 0; i < source.AddTags.length; i++) {
                this.AddTags[i] = new Tag(source.AddTags[i]);
            }
        }
        if (source.ModifyTags != null) {
            this.ModifyTags = new Tag[source.ModifyTags.length];
            for (int i = 0; i < source.ModifyTags.length; i++) {
                this.ModifyTags[i] = new Tag(source.ModifyTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);
        this.setParamArrayObj(map, prefix + "AddTags.", this.AddTags);
        this.setParamArrayObj(map, prefix + "ModifyTags.", this.ModifyTags);

    }
}

