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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceGraphProductIngestTaskRequest extends AbstractModel {

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <p>接入任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>待接入的云产品；支持tke、cdb、mongodb、redis</p>
    */
    @SerializedName("CloudProduct")
    @Expose
    private String CloudProduct;

    /**
    * <p>实例选择方案</p><p>枚举值：</p><ul><li>0： 所有示例</li><li>1： 按标签选择</li><li>2： 手动选择</li></ul>
    */
    @SerializedName("SelectionMode")
    @Expose
    private Long SelectionMode;

    /**
    * <p>实例id。当选择方式使用“指定实例”时，需要填写</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>eBPF 采集规则</p>
    */
    @SerializedName("EBPFCollectRule")
    @Expose
    private EBPFCollectRule EBPFCollectRule;

    /**
    * <p>标签。当实例选择方案使用“按标签选择”时，需要填写</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>资源图谱id</p> 
     * @return ResourceGraphId <p>资源图谱id</p>
     */
    public String getResourceGraphId() {
        return this.ResourceGraphId;
    }

    /**
     * Set <p>资源图谱id</p>
     * @param ResourceGraphId <p>资源图谱id</p>
     */
    public void setResourceGraphId(String ResourceGraphId) {
        this.ResourceGraphId = ResourceGraphId;
    }

    /**
     * Get <p>接入任务名称</p> 
     * @return Name <p>接入任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>接入任务名称</p>
     * @param Name <p>接入任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>待接入的云产品；支持tke、cdb、mongodb、redis</p> 
     * @return CloudProduct <p>待接入的云产品；支持tke、cdb、mongodb、redis</p>
     */
    public String getCloudProduct() {
        return this.CloudProduct;
    }

    /**
     * Set <p>待接入的云产品；支持tke、cdb、mongodb、redis</p>
     * @param CloudProduct <p>待接入的云产品；支持tke、cdb、mongodb、redis</p>
     */
    public void setCloudProduct(String CloudProduct) {
        this.CloudProduct = CloudProduct;
    }

    /**
     * Get <p>实例选择方案</p><p>枚举值：</p><ul><li>0： 所有示例</li><li>1： 按标签选择</li><li>2： 手动选择</li></ul> 
     * @return SelectionMode <p>实例选择方案</p><p>枚举值：</p><ul><li>0： 所有示例</li><li>1： 按标签选择</li><li>2： 手动选择</li></ul>
     */
    public Long getSelectionMode() {
        return this.SelectionMode;
    }

    /**
     * Set <p>实例选择方案</p><p>枚举值：</p><ul><li>0： 所有示例</li><li>1： 按标签选择</li><li>2： 手动选择</li></ul>
     * @param SelectionMode <p>实例选择方案</p><p>枚举值：</p><ul><li>0： 所有示例</li><li>1： 按标签选择</li><li>2： 手动选择</li></ul>
     */
    public void setSelectionMode(Long SelectionMode) {
        this.SelectionMode = SelectionMode;
    }

    /**
     * Get <p>实例id。当选择方式使用“指定实例”时，需要填写</p> 
     * @return InstanceIds <p>实例id。当选择方式使用“指定实例”时，需要填写</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例id。当选择方式使用“指定实例”时，需要填写</p>
     * @param InstanceIds <p>实例id。当选择方式使用“指定实例”时，需要填写</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>eBPF 采集规则</p> 
     * @return EBPFCollectRule <p>eBPF 采集规则</p>
     */
    public EBPFCollectRule getEBPFCollectRule() {
        return this.EBPFCollectRule;
    }

    /**
     * Set <p>eBPF 采集规则</p>
     * @param EBPFCollectRule <p>eBPF 采集规则</p>
     */
    public void setEBPFCollectRule(EBPFCollectRule EBPFCollectRule) {
        this.EBPFCollectRule = EBPFCollectRule;
    }

    /**
     * Get <p>标签。当实例选择方案使用“按标签选择”时，需要填写</p> 
     * @return Tags <p>标签。当实例选择方案使用“按标签选择”时，需要填写</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签。当实例选择方案使用“按标签选择”时，需要填写</p>
     * @param Tags <p>标签。当实例选择方案使用“按标签选择”时，需要填写</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateResourceGraphProductIngestTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceGraphProductIngestTaskRequest(CreateResourceGraphProductIngestTaskRequest source) {
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CloudProduct != null) {
            this.CloudProduct = new String(source.CloudProduct);
        }
        if (source.SelectionMode != null) {
            this.SelectionMode = new Long(source.SelectionMode);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.EBPFCollectRule != null) {
            this.EBPFCollectRule = new EBPFCollectRule(source.EBPFCollectRule);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CloudProduct", this.CloudProduct);
        this.setParamSimple(map, prefix + "SelectionMode", this.SelectionMode);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "EBPFCollectRule.", this.EBPFCollectRule);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

