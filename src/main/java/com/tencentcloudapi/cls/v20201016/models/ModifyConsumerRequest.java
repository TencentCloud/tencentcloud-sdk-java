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

public class ModifyConsumerRequest extends AbstractModel {

    /**
    * 投递任务绑定的日志主题Id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递任务是否生效，默认不生效
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * 是否投递日志的元数据信息，默认为 true。
当NeedContent为true时：字段Content有效。
当NeedContent为false时：字段Content无效。
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * 如果需要投递元数据信息，元数据信息的描述
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * CKafka的描述
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * 投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 外部ID
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * 高级配置
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AdvancedConsumerConfiguration AdvancedConfig;

    /**
     * Get 投递任务绑定的日志主题Id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。 
     * @return TopicId 投递任务绑定的日志主题Id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递任务绑定的日志主题Id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     * @param TopicId 投递任务绑定的日志主题Id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递任务是否生效，默认不生效 
     * @return Effective 投递任务是否生效，默认不生效
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set 投递任务是否生效，默认不生效
     * @param Effective 投递任务是否生效，默认不生效
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get 是否投递日志的元数据信息，默认为 true。
当NeedContent为true时：字段Content有效。
当NeedContent为false时：字段Content无效。 
     * @return NeedContent 是否投递日志的元数据信息，默认为 true。
当NeedContent为true时：字段Content有效。
当NeedContent为false时：字段Content无效。
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set 是否投递日志的元数据信息，默认为 true。
当NeedContent为true时：字段Content有效。
当NeedContent为false时：字段Content无效。
     * @param NeedContent 是否投递日志的元数据信息，默认为 true。
当NeedContent为true时：字段Content有效。
当NeedContent为false时：字段Content无效。
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get 如果需要投递元数据信息，元数据信息的描述 
     * @return Content 如果需要投递元数据信息，元数据信息的描述
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set 如果需要投递元数据信息，元数据信息的描述
     * @param Content 如果需要投递元数据信息，元数据信息的描述
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get CKafka的描述 
     * @return Ckafka CKafka的描述
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set CKafka的描述
     * @param Ckafka CKafka的描述
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get 投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4] 
     * @return Compression 投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set 投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]
     * @param Compression 投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381) 
     * @return RoleArn 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)
     * @param RoleArn 角色访问描述名 [创建角色](https://cloud.tencent.com/document/product/598/19381)
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 外部ID 
     * @return ExternalId 外部ID
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set 外部ID
     * @param ExternalId 外部ID
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get 高级配置 
     * @return AdvancedConfig 高级配置
     */
    public AdvancedConsumerConfiguration getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set 高级配置
     * @param AdvancedConfig 高级配置
     */
    public void setAdvancedConfig(AdvancedConsumerConfiguration AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    public ModifyConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerRequest(ModifyConsumerRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AdvancedConsumerConfiguration(source.AdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);

    }
}

