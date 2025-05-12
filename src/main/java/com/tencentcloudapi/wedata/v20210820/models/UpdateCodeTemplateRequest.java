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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCodeTemplateRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模版id
    */
    @SerializedName("CodeTemplateId")
    @Expose
    private String CodeTemplateId;

    /**
    * 模版名	
    */
    @SerializedName("CodeTemplateName")
    @Expose
    private String CodeTemplateName;

    /**
    * 责任人列表
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * 责任人名称
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 扩展属性
    */
    @SerializedName("Ext")
    @Expose
    private TaskExtDsVO Ext;

    /**
    * 执行机ip
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 模版描述	
    */
    @SerializedName("CodeTemplateDesc")
    @Expose
    private String CodeTemplateDesc;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 脚本是否发生变化
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模版id 
     * @return CodeTemplateId 模版id
     */
    public String getCodeTemplateId() {
        return this.CodeTemplateId;
    }

    /**
     * Set 模版id
     * @param CodeTemplateId 模版id
     */
    public void setCodeTemplateId(String CodeTemplateId) {
        this.CodeTemplateId = CodeTemplateId;
    }

    /**
     * Get 模版名	 
     * @return CodeTemplateName 模版名	
     */
    public String getCodeTemplateName() {
        return this.CodeTemplateName;
    }

    /**
     * Set 模版名	
     * @param CodeTemplateName 模版名	
     */
    public void setCodeTemplateName(String CodeTemplateName) {
        this.CodeTemplateName = CodeTemplateName;
    }

    /**
     * Get 责任人列表 
     * @return InChargeId 责任人列表
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set 责任人列表
     * @param InChargeId 责任人列表
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get 责任人名称 
     * @return InCharge 责任人名称
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人名称
     * @param InCharge 责任人名称
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 扩展属性 
     * @return Ext 扩展属性
     */
    public TaskExtDsVO getExt() {
        return this.Ext;
    }

    /**
     * Set 扩展属性
     * @param Ext 扩展属性
     */
    public void setExt(TaskExtDsVO Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 执行机ip 
     * @return BrokerIp 执行机ip
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 执行机ip
     * @param BrokerIp 执行机ip
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 资源组id 
     * @return ResourceGroup 资源组id
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组id
     * @param ResourceGroup 资源组id
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 模版描述	 
     * @return CodeTemplateDesc 模版描述	
     */
    public String getCodeTemplateDesc() {
        return this.CodeTemplateDesc;
    }

    /**
     * Set 模版描述	
     * @param CodeTemplateDesc 模版描述	
     */
    public void setCodeTemplateDesc(String CodeTemplateDesc) {
        this.CodeTemplateDesc = CodeTemplateDesc;
    }

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 脚本是否发生变化 
     * @return ScriptChange 脚本是否发生变化
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set 脚本是否发生变化
     * @param ScriptChange 脚本是否发生变化
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
    }

    public UpdateCodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCodeTemplateRequest(UpdateCodeTemplateRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeTemplateId != null) {
            this.CodeTemplateId = new String(source.CodeTemplateId);
        }
        if (source.CodeTemplateName != null) {
            this.CodeTemplateName = new String(source.CodeTemplateName);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.Ext != null) {
            this.Ext = new TaskExtDsVO(source.Ext);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.CodeTemplateDesc != null) {
            this.CodeTemplateDesc = new String(source.CodeTemplateDesc);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.ScriptChange != null) {
            this.ScriptChange = new Boolean(source.ScriptChange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeTemplateId", this.CodeTemplateId);
        this.setParamSimple(map, prefix + "CodeTemplateName", this.CodeTemplateName);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamObj(map, prefix + "Ext.", this.Ext);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "CodeTemplateDesc", this.CodeTemplateDesc);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "ScriptChange", this.ScriptChange);

    }
}

