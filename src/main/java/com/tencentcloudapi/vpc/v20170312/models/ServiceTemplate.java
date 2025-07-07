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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceTemplate extends AbstractModel {

    /**
    * 协议端口实例ID，例如：ppm-f5n1f8da。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("ServiceTemplateName")
    @Expose
    private String ServiceTemplateName;

    /**
    * 协议端口信息。
    */
    @SerializedName("ServiceSet")
    @Expose
    private String [] ServiceSet;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 带备注的协议端口信息。
    */
    @SerializedName("ServiceExtraSet")
    @Expose
    private ServicesInfo [] ServiceExtraSet;

    /**
    * 标签键值对。	
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get 协议端口实例ID，例如：ppm-f5n1f8da。 
     * @return ServiceTemplateId 协议端口实例ID，例如：ppm-f5n1f8da。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 协议端口实例ID，例如：ppm-f5n1f8da。
     * @param ServiceTemplateId 协议端口实例ID，例如：ppm-f5n1f8da。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 模板名称。 
     * @return ServiceTemplateName 模板名称。
     */
    public String getServiceTemplateName() {
        return this.ServiceTemplateName;
    }

    /**
     * Set 模板名称。
     * @param ServiceTemplateName 模板名称。
     */
    public void setServiceTemplateName(String ServiceTemplateName) {
        this.ServiceTemplateName = ServiceTemplateName;
    }

    /**
     * Get 协议端口信息。 
     * @return ServiceSet 协议端口信息。
     */
    public String [] getServiceSet() {
        return this.ServiceSet;
    }

    /**
     * Set 协议端口信息。
     * @param ServiceSet 协议端口信息。
     */
    public void setServiceSet(String [] ServiceSet) {
        this.ServiceSet = ServiceSet;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最后更新时间。 
     * @return UpdatedTime 最后更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 最后更新时间。
     * @param UpdatedTime 最后更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 带备注的协议端口信息。 
     * @return ServiceExtraSet 带备注的协议端口信息。
     */
    public ServicesInfo [] getServiceExtraSet() {
        return this.ServiceExtraSet;
    }

    /**
     * Set 带备注的协议端口信息。
     * @param ServiceExtraSet 带备注的协议端口信息。
     */
    public void setServiceExtraSet(ServicesInfo [] ServiceExtraSet) {
        this.ServiceExtraSet = ServiceExtraSet;
    }

    /**
     * Get 标签键值对。	 
     * @return TagSet 标签键值对。	
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。	
     * @param TagSet 标签键值对。	
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public ServiceTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceTemplate(ServiceTemplate source) {
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.ServiceTemplateName != null) {
            this.ServiceTemplateName = new String(source.ServiceTemplateName);
        }
        if (source.ServiceSet != null) {
            this.ServiceSet = new String[source.ServiceSet.length];
            for (int i = 0; i < source.ServiceSet.length; i++) {
                this.ServiceSet[i] = new String(source.ServiceSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.ServiceExtraSet != null) {
            this.ServiceExtraSet = new ServicesInfo[source.ServiceExtraSet.length];
            for (int i = 0; i < source.ServiceExtraSet.length; i++) {
                this.ServiceExtraSet[i] = new ServicesInfo(source.ServiceExtraSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ServiceTemplateName", this.ServiceTemplateName);
        this.setParamArraySimple(map, prefix + "ServiceSet.", this.ServiceSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "ServiceExtraSet.", this.ServiceExtraSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

