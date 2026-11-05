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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSecurityTemplateToEntityRequest extends AbstractModel {

    /**
    * <p>需要绑定或解绑的域名所属站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>绑定至策略模板（或者从策略模板解绑）的域名列表。</p>
    */
    @SerializedName("Entities")
    @Expose
    private String [] Entities;

    /**
    * <p>绑定或解绑操作选项。</p><p>枚举值：</p><ul><li>bind： 绑定域名至策略模板。</li><li>unbind-keep-policy： 将域名从策略模板解绑，解绑时保留当前策略。</li><li>unbind-use-default： 将域名从策略模板解绑，并使用默认空白策略。</li></ul>
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * <p>指定绑定或解绑的策略模板 ID 或站点全局策略。<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID；</li><li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li></p><p>注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板。</p><p>枚举值：</p><ul><li>true： 替换域名当前绑定的模板。</li><li>false： 不替换域名当前绑定的模板。</li></ul><p>默认值：true</p><p>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。</p>
    */
    @SerializedName("OverWrite")
    @Expose
    private Boolean OverWrite;

    /**
     * Get <p>需要绑定或解绑的域名所属站点 ID。</p> 
     * @return ZoneId <p>需要绑定或解绑的域名所属站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>需要绑定或解绑的域名所属站点 ID。</p>
     * @param ZoneId <p>需要绑定或解绑的域名所属站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>绑定至策略模板（或者从策略模板解绑）的域名列表。</p> 
     * @return Entities <p>绑定至策略模板（或者从策略模板解绑）的域名列表。</p>
     */
    public String [] getEntities() {
        return this.Entities;
    }

    /**
     * Set <p>绑定至策略模板（或者从策略模板解绑）的域名列表。</p>
     * @param Entities <p>绑定至策略模板（或者从策略模板解绑）的域名列表。</p>
     */
    public void setEntities(String [] Entities) {
        this.Entities = Entities;
    }

    /**
     * Get <p>绑定或解绑操作选项。</p><p>枚举值：</p><ul><li>bind： 绑定域名至策略模板。</li><li>unbind-keep-policy： 将域名从策略模板解绑，解绑时保留当前策略。</li><li>unbind-use-default： 将域名从策略模板解绑，并使用默认空白策略。</li></ul> 
     * @return Operate <p>绑定或解绑操作选项。</p><p>枚举值：</p><ul><li>bind： 绑定域名至策略模板。</li><li>unbind-keep-policy： 将域名从策略模板解绑，解绑时保留当前策略。</li><li>unbind-use-default： 将域名从策略模板解绑，并使用默认空白策略。</li></ul>
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set <p>绑定或解绑操作选项。</p><p>枚举值：</p><ul><li>bind： 绑定域名至策略模板。</li><li>unbind-keep-policy： 将域名从策略模板解绑，解绑时保留当前策略。</li><li>unbind-use-default： 将域名从策略模板解绑，并使用默认空白策略。</li></ul>
     * @param Operate <p>绑定或解绑操作选项。</p><p>枚举值：</p><ul><li>bind： 绑定域名至策略模板。</li><li>unbind-keep-policy： 将域名从策略模板解绑，解绑时保留当前策略。</li><li>unbind-use-default： 将域名从策略模板解绑，并使用默认空白策略。</li></ul>
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get <p>指定绑定或解绑的策略模板 ID 或站点全局策略。<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID；</li><li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li></p><p>注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。</p> 
     * @return TemplateId <p>指定绑定或解绑的策略模板 ID 或站点全局策略。<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID；</li><li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li></p><p>注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>指定绑定或解绑的策略模板 ID 或站点全局策略。<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID；</li><li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li></p><p>注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。</p>
     * @param TemplateId <p>指定绑定或解绑的策略模板 ID 或站点全局策略。<li>如需绑定至策略模板，或从策略模板解绑，请指定策略模板 ID；</li><li>如需绑定至站点全局策略，或从站点全局策略解绑，请使用 @ZoneLevel@domain 参数值。</li></p><p>注意：解绑后，域名将使用独立策略，并单独计算规则配额，请确保解绑前套餐规则配额充足。</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板。</p><p>枚举值：</p><ul><li>true： 替换域名当前绑定的模板。</li><li>false： 不替换域名当前绑定的模板。</li></ul><p>默认值：true</p><p>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。</p> 
     * @return OverWrite <p>传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板。</p><p>枚举值：</p><ul><li>true： 替换域名当前绑定的模板。</li><li>false： 不替换域名当前绑定的模板。</li></ul><p>默认值：true</p><p>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。</p>
     */
    public Boolean getOverWrite() {
        return this.OverWrite;
    }

    /**
     * Set <p>传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板。</p><p>枚举值：</p><ul><li>true： 替换域名当前绑定的模板。</li><li>false： 不替换域名当前绑定的模板。</li></ul><p>默认值：true</p><p>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。</p>
     * @param OverWrite <p>传入域名如果已经绑定了策略模板（含站点级防护策略），通过设置该参数表示是否替换该模板。</p><p>枚举值：</p><ul><li>true： 替换域名当前绑定的模板。</li><li>false： 不替换域名当前绑定的模板。</li></ul><p>默认值：true</p><p>注意：当设置为 false 时，若传入域名已经绑定策略模板，API  将返回错误；站点级防护策略也为一种策略模板。</p>
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

