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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerificationConfig extends AbstractModel {

    /**
    * <p>短信验证码发送通道类型。</p><p>枚举值：</p><ul><li>default： 使用默认云开发短信包发送短信</li><li>apis： 使用云开发自定义 APIs 作为短信发送通道，需配合 Name 和 Method 参数使用。不传则不修改当前配置。</li><li>template： 自定义短信模板配置，需要配置TemplateProvider</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>自定义 APIs 数据源唯一标识，当 Type 为 apis 时必填。用于定位微搭 APIs 中对应的数据源。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义 APIs 方法名，当 Type 为 apis 时必填。指定微搭 APIs 中用于发送验证码的方法。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>单个手机号每日短信发送上限。默认值为 30，传 -1 表示不限制，如果设置为不限制，需要注意恶意攻击，导致短信套餐用量计费问题。仅支持正整数或 -1。不传则不修改当前配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmsDayLimit")
    @Expose
    private Long SmsDayLimit;

    /**
    * <p>自定义短信服务商模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateProvider")
    @Expose
    private SMSProviderTemplateConfig TemplateProvider;

    /**
     * Get <p>短信验证码发送通道类型。</p><p>枚举值：</p><ul><li>default： 使用默认云开发短信包发送短信</li><li>apis： 使用云开发自定义 APIs 作为短信发送通道，需配合 Name 和 Method 参数使用。不传则不修改当前配置。</li><li>template： 自定义短信模板配置，需要配置TemplateProvider</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>短信验证码发送通道类型。</p><p>枚举值：</p><ul><li>default： 使用默认云开发短信包发送短信</li><li>apis： 使用云开发自定义 APIs 作为短信发送通道，需配合 Name 和 Method 参数使用。不传则不修改当前配置。</li><li>template： 自定义短信模板配置，需要配置TemplateProvider</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>短信验证码发送通道类型。</p><p>枚举值：</p><ul><li>default： 使用默认云开发短信包发送短信</li><li>apis： 使用云开发自定义 APIs 作为短信发送通道，需配合 Name 和 Method 参数使用。不传则不修改当前配置。</li><li>template： 自定义短信模板配置，需要配置TemplateProvider</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>短信验证码发送通道类型。</p><p>枚举值：</p><ul><li>default： 使用默认云开发短信包发送短信</li><li>apis： 使用云开发自定义 APIs 作为短信发送通道，需配合 Name 和 Method 参数使用。不传则不修改当前配置。</li><li>template： 自定义短信模板配置，需要配置TemplateProvider</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>自定义 APIs 数据源唯一标识，当 Type 为 apis 时必填。用于定位微搭 APIs 中对应的数据源。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>自定义 APIs 数据源唯一标识，当 Type 为 apis 时必填。用于定位微搭 APIs 中对应的数据源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义 APIs 数据源唯一标识，当 Type 为 apis 时必填。用于定位微搭 APIs 中对应的数据源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>自定义 APIs 数据源唯一标识，当 Type 为 apis 时必填。用于定位微搭 APIs 中对应的数据源。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义 APIs 方法名，当 Type 为 apis 时必填。指定微搭 APIs 中用于发送验证码的方法。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method <p>自定义 APIs 方法名，当 Type 为 apis 时必填。指定微搭 APIs 中用于发送验证码的方法。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>自定义 APIs 方法名，当 Type 为 apis 时必填。指定微搭 APIs 中用于发送验证码的方法。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method <p>自定义 APIs 方法名，当 Type 为 apis 时必填。指定微搭 APIs 中用于发送验证码的方法。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>单个手机号每日短信发送上限。默认值为 30，传 -1 表示不限制，如果设置为不限制，需要注意恶意攻击，导致短信套餐用量计费问题。仅支持正整数或 -1。不传则不修改当前配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmsDayLimit <p>单个手机号每日短信发送上限。默认值为 30，传 -1 表示不限制，如果设置为不限制，需要注意恶意攻击，导致短信套餐用量计费问题。仅支持正整数或 -1。不传则不修改当前配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSmsDayLimit() {
        return this.SmsDayLimit;
    }

    /**
     * Set <p>单个手机号每日短信发送上限。默认值为 30，传 -1 表示不限制，如果设置为不限制，需要注意恶意攻击，导致短信套餐用量计费问题。仅支持正整数或 -1。不传则不修改当前配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmsDayLimit <p>单个手机号每日短信发送上限。默认值为 30，传 -1 表示不限制，如果设置为不限制，需要注意恶意攻击，导致短信套餐用量计费问题。仅支持正整数或 -1。不传则不修改当前配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmsDayLimit(Long SmsDayLimit) {
        this.SmsDayLimit = SmsDayLimit;
    }

    /**
     * Get <p>自定义短信服务商模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateProvider <p>自定义短信服务商模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SMSProviderTemplateConfig getTemplateProvider() {
        return this.TemplateProvider;
    }

    /**
     * Set <p>自定义短信服务商模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateProvider <p>自定义短信服务商模板配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateProvider(SMSProviderTemplateConfig TemplateProvider) {
        this.TemplateProvider = TemplateProvider;
    }

    public VerificationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerificationConfig(VerificationConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.SmsDayLimit != null) {
            this.SmsDayLimit = new Long(source.SmsDayLimit);
        }
        if (source.TemplateProvider != null) {
            this.TemplateProvider = new SMSProviderTemplateConfig(source.TemplateProvider);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "SmsDayLimit", this.SmsDayLimit);
        this.setParamObj(map, prefix + "TemplateProvider.", this.TemplateProvider);

    }
}

