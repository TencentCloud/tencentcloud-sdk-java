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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityDropPageRequest extends AbstractModel{

    /**
    * 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 自定义页面的文件名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义页面的内容，本字段的内容需要将数据经过urlencode后传入。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 上传的类型，取值有：
<li> file：将页面文件内容进行urlencode编码，填入Content字段；</li>
<li> url：将待上传的url地址进行urlencode编码，填入Content字段，即时下载，内容不会自动更新。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 页面所属的模块，取值有：
<li> waf ：托管规则模块；</li>
<li> rate：自定义规则模块。</li>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return ZoneId 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param ZoneId 站点Id。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return Entity 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param Entity 子域名/应用名。当使用ZoneId和Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 自定义页面的文件名。 
     * @return Name 自定义页面的文件名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义页面的文件名。
     * @param Name 自定义页面的文件名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义页面的内容，本字段的内容需要将数据经过urlencode后传入。 
     * @return Content 自定义页面的内容，本字段的内容需要将数据经过urlencode后传入。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 自定义页面的内容，本字段的内容需要将数据经过urlencode后传入。
     * @param Content 自定义页面的内容，本字段的内容需要将数据经过urlencode后传入。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 上传的类型，取值有：
<li> file：将页面文件内容进行urlencode编码，填入Content字段；</li>
<li> url：将待上传的url地址进行urlencode编码，填入Content字段，即时下载，内容不会自动更新。</li> 
     * @return Type 上传的类型，取值有：
<li> file：将页面文件内容进行urlencode编码，填入Content字段；</li>
<li> url：将待上传的url地址进行urlencode编码，填入Content字段，即时下载，内容不会自动更新。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 上传的类型，取值有：
<li> file：将页面文件内容进行urlencode编码，填入Content字段；</li>
<li> url：将待上传的url地址进行urlencode编码，填入Content字段，即时下载，内容不会自动更新。</li>
     * @param Type 上传的类型，取值有：
<li> file：将页面文件内容进行urlencode编码，填入Content字段；</li>
<li> url：将待上传的url地址进行urlencode编码，填入Content字段，即时下载，内容不会自动更新。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 页面所属的模块，取值有：
<li> waf ：托管规则模块；</li>
<li> rate：自定义规则模块。</li> 
     * @return Module 页面所属的模块，取值有：
<li> waf ：托管规则模块；</li>
<li> rate：自定义规则模块。</li>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 页面所属的模块，取值有：
<li> waf ：托管规则模块；</li>
<li> rate：自定义规则模块。</li>
     * @param Module 页面所属的模块，取值有：
<li> waf ：托管规则模块；</li>
<li> rate：自定义规则模块。</li>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。 
     * @return TemplateId 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     * @param TemplateId 模板Id。当使用模板Id时可不填ZoneId和Entity，否则必须填写ZoneId和Entity。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public CreateSecurityDropPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityDropPageRequest(CreateSecurityDropPageRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

