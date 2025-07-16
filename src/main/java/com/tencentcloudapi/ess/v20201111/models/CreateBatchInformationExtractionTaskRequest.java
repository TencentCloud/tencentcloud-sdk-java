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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchInformationExtractionTaskRequest extends AbstractModel {

    /**
    * 执行合同智能提取的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同智能提取的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。  注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下`
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 用户配置的合同智能提取字段模板ID，会基于此模板批量创建合同智能提取任务，为32位字符串。
[点击查看模板Id在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/99008608577532423ea437c7fdbedca1.png)

注:  `此配置优先级最高，设置了模板ID后Fields配置就会无效`
    */
    @SerializedName("FieldTemplateId")
    @Expose
    private String FieldTemplateId;

    /**
    * 用于合同智能提取的字段信息。

注意：`字段模板优先级最高，如果设置了FieldTemplateId值，此配置就无效`
    */
    @SerializedName("Fields")
    @Expose
    private ExtractionField [] Fields;

    /**
     * Get 执行合同智能提取的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行合同智能提取的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行合同智能提取的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行合同智能提取的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同智能提取的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。  注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下` 
     * @return ResourceIds 合同智能提取的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。  注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下`
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 合同智能提取的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。  注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下`
     * @param ResourceIds 合同智能提取的PDF文件资源编号列表，通过[UploadFiles](https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles)接口获取PDF文件资源编号。  注:  `目前，此接口仅支持5个文件发起。每个文件限制在10M以下`
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 用户配置的合同智能提取字段模板ID，会基于此模板批量创建合同智能提取任务，为32位字符串。
[点击查看模板Id在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/99008608577532423ea437c7fdbedca1.png)

注:  `此配置优先级最高，设置了模板ID后Fields配置就会无效` 
     * @return FieldTemplateId 用户配置的合同智能提取字段模板ID，会基于此模板批量创建合同智能提取任务，为32位字符串。
[点击查看模板Id在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/99008608577532423ea437c7fdbedca1.png)

注:  `此配置优先级最高，设置了模板ID后Fields配置就会无效`
     */
    public String getFieldTemplateId() {
        return this.FieldTemplateId;
    }

    /**
     * Set 用户配置的合同智能提取字段模板ID，会基于此模板批量创建合同智能提取任务，为32位字符串。
[点击查看模板Id在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/99008608577532423ea437c7fdbedca1.png)

注:  `此配置优先级最高，设置了模板ID后Fields配置就会无效`
     * @param FieldTemplateId 用户配置的合同智能提取字段模板ID，会基于此模板批量创建合同智能提取任务，为32位字符串。
[点击查看模板Id在控制台上的位置](https://qcloudimg.tencent-cloud.cn/raw/99008608577532423ea437c7fdbedca1.png)

注:  `此配置优先级最高，设置了模板ID后Fields配置就会无效`
     */
    public void setFieldTemplateId(String FieldTemplateId) {
        this.FieldTemplateId = FieldTemplateId;
    }

    /**
     * Get 用于合同智能提取的字段信息。

注意：`字段模板优先级最高，如果设置了FieldTemplateId值，此配置就无效` 
     * @return Fields 用于合同智能提取的字段信息。

注意：`字段模板优先级最高，如果设置了FieldTemplateId值，此配置就无效`
     */
    public ExtractionField [] getFields() {
        return this.Fields;
    }

    /**
     * Set 用于合同智能提取的字段信息。

注意：`字段模板优先级最高，如果设置了FieldTemplateId值，此配置就无效`
     * @param Fields 用于合同智能提取的字段信息。

注意：`字段模板优先级最高，如果设置了FieldTemplateId值，此配置就无效`
     */
    public void setFields(ExtractionField [] Fields) {
        this.Fields = Fields;
    }

    public CreateBatchInformationExtractionTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchInformationExtractionTaskRequest(CreateBatchInformationExtractionTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FieldTemplateId != null) {
            this.FieldTemplateId = new String(source.FieldTemplateId);
        }
        if (source.Fields != null) {
            this.Fields = new ExtractionField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new ExtractionField(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FieldTemplateId", this.FieldTemplateId);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

