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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebhookReceiverRequest extends AbstractModel {

    /**
    * <p>机器人名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>机器人类型<br>枚举值：<br>WEBHOOK：webhook 类型<br>SCF：云函数类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>机器人 ID。大于 0 表示修改已有记录；等于 0 或不传表示新增<br>默认值：0</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Webhook 地址<br>入参限制：Type=WEBHOOK 时必填，长度 1-2048，必须为合法 http(s) URL，且不允许内网地址</p>
    */
    @SerializedName("WebhookAddr")
    @Expose
    private String WebhookAddr;

    /**
    * <p>云函数地域，例如 ap-guangzhou<br>入参限制：Type=SCF 时必填</p>
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * <p>云函数命名空间<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFNamespaceList 接口获取</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>云函数名称<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFFunctionList 接口获取</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>云函数版本<br>入参限制：Type=SCF 时必填，例如 $LATEST<br>取值参考：通过 DescribeSCFFunctionVersionList 接口获取</p>
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * <p>云函数别名<br>入参限制：Type=SCF 时必填，例如 $DEFAULT<br>取值参考：通过 DescribeSCFAliasList 接口获取</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get <p>机器人名称<br>入参限制：长度 1-20 个字符，租户内唯一</p> 
     * @return Name <p>机器人名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>机器人名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
     * @param Name <p>机器人名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>机器人类型<br>枚举值：<br>WEBHOOK：webhook 类型<br>SCF：云函数类型</p> 
     * @return Type <p>机器人类型<br>枚举值：<br>WEBHOOK：webhook 类型<br>SCF：云函数类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>机器人类型<br>枚举值：<br>WEBHOOK：webhook 类型<br>SCF：云函数类型</p>
     * @param Type <p>机器人类型<br>枚举值：<br>WEBHOOK：webhook 类型<br>SCF：云函数类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>机器人 ID。大于 0 表示修改已有记录；等于 0 或不传表示新增<br>默认值：0</p> 
     * @return ID <p>机器人 ID。大于 0 表示修改已有记录；等于 0 或不传表示新增<br>默认值：0</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>机器人 ID。大于 0 表示修改已有记录；等于 0 或不传表示新增<br>默认值：0</p>
     * @param ID <p>机器人 ID。大于 0 表示修改已有记录；等于 0 或不传表示新增<br>默认值：0</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Webhook 地址<br>入参限制：Type=WEBHOOK 时必填，长度 1-2048，必须为合法 http(s) URL，且不允许内网地址</p> 
     * @return WebhookAddr <p>Webhook 地址<br>入参限制：Type=WEBHOOK 时必填，长度 1-2048，必须为合法 http(s) URL，且不允许内网地址</p>
     */
    public String getWebhookAddr() {
        return this.WebhookAddr;
    }

    /**
     * Set <p>Webhook 地址<br>入参限制：Type=WEBHOOK 时必填，长度 1-2048，必须为合法 http(s) URL，且不允许内网地址</p>
     * @param WebhookAddr <p>Webhook 地址<br>入参限制：Type=WEBHOOK 时必填，长度 1-2048，必须为合法 http(s) URL，且不允许内网地址</p>
     */
    public void setWebhookAddr(String WebhookAddr) {
        this.WebhookAddr = WebhookAddr;
    }

    /**
     * Get <p>云函数地域，例如 ap-guangzhou<br>入参限制：Type=SCF 时必填</p> 
     * @return SCFRegion <p>云函数地域，例如 ap-guangzhou<br>入参限制：Type=SCF 时必填</p>
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set <p>云函数地域，例如 ap-guangzhou<br>入参限制：Type=SCF 时必填</p>
     * @param SCFRegion <p>云函数地域，例如 ap-guangzhou<br>入参限制：Type=SCF 时必填</p>
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get <p>云函数命名空间<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFNamespaceList 接口获取</p> 
     * @return Namespace <p>云函数命名空间<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFNamespaceList 接口获取</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>云函数命名空间<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFNamespaceList 接口获取</p>
     * @param Namespace <p>云函数命名空间<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFNamespaceList 接口获取</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>云函数名称<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFFunctionList 接口获取</p> 
     * @return FunctionName <p>云函数名称<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFFunctionList 接口获取</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>云函数名称<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFFunctionList 接口获取</p>
     * @param FunctionName <p>云函数名称<br>入参限制：Type=SCF 时必填<br>取值参考：通过 DescribeSCFFunctionList 接口获取</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>云函数版本<br>入参限制：Type=SCF 时必填，例如 $LATEST<br>取值参考：通过 DescribeSCFFunctionVersionList 接口获取</p> 
     * @return FunctionVersion <p>云函数版本<br>入参限制：Type=SCF 时必填，例如 $LATEST<br>取值参考：通过 DescribeSCFFunctionVersionList 接口获取</p>
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set <p>云函数版本<br>入参限制：Type=SCF 时必填，例如 $LATEST<br>取值参考：通过 DescribeSCFFunctionVersionList 接口获取</p>
     * @param FunctionVersion <p>云函数版本<br>入参限制：Type=SCF 时必填，例如 $LATEST<br>取值参考：通过 DescribeSCFFunctionVersionList 接口获取</p>
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get <p>云函数别名<br>入参限制：Type=SCF 时必填，例如 $DEFAULT<br>取值参考：通过 DescribeSCFAliasList 接口获取</p> 
     * @return Alias <p>云函数别名<br>入参限制：Type=SCF 时必填，例如 $DEFAULT<br>取值参考：通过 DescribeSCFAliasList 接口获取</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>云函数别名<br>入参限制：Type=SCF 时必填，例如 $DEFAULT<br>取值参考：通过 DescribeSCFAliasList 接口获取</p>
     * @param Alias <p>云函数别名<br>入参限制：Type=SCF 时必填，例如 $DEFAULT<br>取值参考：通过 DescribeSCFAliasList 接口获取</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyWebhookReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebhookReceiverRequest(ModifyWebhookReceiverRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.WebhookAddr != null) {
            this.WebhookAddr = new String(source.WebhookAddr);
        }
        if (source.SCFRegion != null) {
            this.SCFRegion = new String(source.SCFRegion);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "WebhookAddr", this.WebhookAddr);
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

