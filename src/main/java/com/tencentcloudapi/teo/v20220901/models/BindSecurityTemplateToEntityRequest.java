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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSecurityTemplateToEntityRequest extends AbstractModel {

    /**
    * 需要绑定或解绑的策略模板所属站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 绑定至策略模板（或者从策略模板解绑）的域名列表。
    */
    @SerializedName("Entities")
    @Expose
    private String [] Entities;

    /**
    * 绑定或解绑操作选项，取值有：
<li>bind：绑定域名至策略模板。</li>
<li>unbind-keep-policy：将域名从策略模板解绑，解绑时保留当前策略。</li>
<li>unbind-use-default：将域名从策略模板解绑，并使用默认空白策略。</li>注意：解绑操作当前仅支持单个域名解绑。即：当 Operate 参数取值为 unbind-keep-policy 或 unbind-use-default 时，Entities 参数列表仅支持填写一个域名。
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 指定绑定或解绑的策略模板 ID 或站点全局策略
<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID。</li>
<li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li>

注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板，默认值为 true。支持下列取值：<li>true： 替换域名当前绑定的模板。</li><li>false：不替换域名当前绑定的模板。</li>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。
    */
    @SerializedName("OverWrite")
    @Expose
    private Boolean OverWrite;

    /**
     * Get 需要绑定或解绑的策略模板所属站点 ID。 
     * @return ZoneId 需要绑定或解绑的策略模板所属站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 需要绑定或解绑的策略模板所属站点 ID。
     * @param ZoneId 需要绑定或解绑的策略模板所属站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 绑定至策略模板（或者从策略模板解绑）的域名列表。 
     * @return Entities 绑定至策略模板（或者从策略模板解绑）的域名列表。
     */
    public String [] getEntities() {
        return this.Entities;
    }

    /**
     * Set 绑定至策略模板（或者从策略模板解绑）的域名列表。
     * @param Entities 绑定至策略模板（或者从策略模板解绑）的域名列表。
     */
    public void setEntities(String [] Entities) {
        this.Entities = Entities;
    }

    /**
     * Get 绑定或解绑操作选项，取值有：
<li>bind：绑定域名至策略模板。</li>
<li>unbind-keep-policy：将域名从策略模板解绑，解绑时保留当前策略。</li>
<li>unbind-use-default：将域名从策略模板解绑，并使用默认空白策略。</li>注意：解绑操作当前仅支持单个域名解绑。即：当 Operate 参数取值为 unbind-keep-policy 或 unbind-use-default 时，Entities 参数列表仅支持填写一个域名。 
     * @return Operate 绑定或解绑操作选项，取值有：
<li>bind：绑定域名至策略模板。</li>
<li>unbind-keep-policy：将域名从策略模板解绑，解绑时保留当前策略。</li>
<li>unbind-use-default：将域名从策略模板解绑，并使用默认空白策略。</li>注意：解绑操作当前仅支持单个域名解绑。即：当 Operate 参数取值为 unbind-keep-policy 或 unbind-use-default 时，Entities 参数列表仅支持填写一个域名。
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 绑定或解绑操作选项，取值有：
<li>bind：绑定域名至策略模板。</li>
<li>unbind-keep-policy：将域名从策略模板解绑，解绑时保留当前策略。</li>
<li>unbind-use-default：将域名从策略模板解绑，并使用默认空白策略。</li>注意：解绑操作当前仅支持单个域名解绑。即：当 Operate 参数取值为 unbind-keep-policy 或 unbind-use-default 时，Entities 参数列表仅支持填写一个域名。
     * @param Operate 绑定或解绑操作选项，取值有：
<li>bind：绑定域名至策略模板。</li>
<li>unbind-keep-policy：将域名从策略模板解绑，解绑时保留当前策略。</li>
<li>unbind-use-default：将域名从策略模板解绑，并使用默认空白策略。</li>注意：解绑操作当前仅支持单个域名解绑。即：当 Operate 参数取值为 unbind-keep-policy 或 unbind-use-default 时，Entities 参数列表仅支持填写一个域名。
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 指定绑定或解绑的策略模板 ID 或站点全局策略
<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID。</li>
<li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li>

注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。 
     * @return TemplateId 指定绑定或解绑的策略模板 ID 或站点全局策略
<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID。</li>
<li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li>

注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 指定绑定或解绑的策略模板 ID 或站点全局策略
<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID。</li>
<li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li>

注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。
     * @param TemplateId 指定绑定或解绑的策略模板 ID 或站点全局策略
<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID。</li>
<li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li>

注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板，默认值为 true。支持下列取值：<li>true： 替换域名当前绑定的模板。</li><li>false：不替换域名当前绑定的模板。</li>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。 
     * @return OverWrite 传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板，默认值为 true。支持下列取值：<li>true： 替换域名当前绑定的模板。</li><li>false：不替换域名当前绑定的模板。</li>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。
     */
    public Boolean getOverWrite() {
        return this.OverWrite;
    }

    /**
     * Set 传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板，默认值为 true。支持下列取值：<li>true： 替换域名当前绑定的模板。</li><li>false：不替换域名当前绑定的模板。</li>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。
     * @param OverWrite 传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板，默认值为 true。支持下列取值：<li>true： 替换域名当前绑定的模板。</li><li>false：不替换域名当前绑定的模板。</li>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。
     */
    public void setOverWrite(Boolean OverWrite) {
        this.OverWrite = OverWrite;
    }

    public BindSecurityTemplateToEntityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSecurityTemplateToEntityRequest(BindSecurityTemplateToEntityRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entities != null) {
            this.Entities = new String[source.Entities.length];
            for (int i = 0; i < source.Entities.length; i++) {
                this.Entities[i] = new String(source.Entities[i]);
            }
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.OverWrite != null) {
            this.OverWrite = new Boolean(source.OverWrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Entities.", this.Entities);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "OverWrite", this.OverWrite);

    }
}

