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

public class CreateConsumerRequest extends AbstractModel {

    /**
    * <p>投递任务绑定的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>是否投递日志的元数据信息，默认为 true。<br>当NeedContent为true时：字段Content有效。<br>当NeedContent为false时：字段Content无效。</p>
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * <p>如果需要投递元数据信息，元数据信息的描述</p>
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * <p>CKafka的描述</p>
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * <p>投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]</p>
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>外部ID</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>高级配置项</p>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AdvancedConsumerConfiguration AdvancedConfig;

    /**
    * <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>投递任务绑定的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul> 
     * @return TopicId <p>投递任务绑定的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>投递任务绑定的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     * @param TopicId <p>投递任务绑定的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>是否投递日志的元数据信息，默认为 true。<br>当NeedContent为true时：字段Content有效。<br>当NeedContent为false时：字段Content无效。</p> 
     * @return NeedContent <p>是否投递日志的元数据信息，默认为 true。<br>当NeedContent为true时：字段Content有效。<br>当NeedContent为false时：字段Content无效。</p>
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set <p>是否投递日志的元数据信息，默认为 true。<br>当NeedContent为true时：字段Content有效。<br>当NeedContent为false时：字段Content无效。</p>
     * @param NeedContent <p>是否投递日志的元数据信息，默认为 true。<br>当NeedContent为true时：字段Content有效。<br>当NeedContent为false时：字段Content无效。</p>
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get <p>如果需要投递元数据信息，元数据信息的描述</p> 
     * @return Content <p>如果需要投递元数据信息，元数据信息的描述</p>
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set <p>如果需要投递元数据信息，元数据信息的描述</p>
     * @param Content <p>如果需要投递元数据信息，元数据信息的描述</p>
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get <p>CKafka的描述</p> 
     * @return Ckafka <p>CKafka的描述</p>
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set <p>CKafka的描述</p>
     * @param Ckafka <p>CKafka的描述</p>
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get <p>投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]</p> 
     * @return Compression <p>投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]</p>
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]</p>
     * @param Compression <p>投递时压缩方式，取值0，2，3。[0：NONE；2：SNAPPY；3：LZ4]</p>
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p> 
     * @return RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     * @param RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>外部ID</p> 
     * @return ExternalId <p>外部ID</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>外部ID</p>
     * @param ExternalId <p>外部ID</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>高级配置项</p> 
     * @return AdvancedConfig <p>高级配置项</p>
     */
    public AdvancedConsumerConfiguration getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>高级配置项</p>
     * @param AdvancedConfig <p>高级配置项</p>
     */
    public void setAdvancedConfig(AdvancedConsumerConfiguration AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p> 
     * @return DSLFilter <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
     * @param DSLFilter <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public CreateConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerRequest(CreateConsumerRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
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
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

