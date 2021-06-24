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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportMediaToProjectRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 云点播媒资文件 Id，当 SourceType 取值 VOD 或者缺省的时候必填。
    */
    @SerializedName("VodFileId")
    @Expose
    private String VodFileId;

    /**
    * 原始媒资文件信息，当 SourceType 取值 EXTERNAL 的时候必填。
    */
    @SerializedName("ExternalMediaInfo")
    @Expose
    private ExternalMediaInfo ExternalMediaInfo;

    /**
    * 媒体名称，不能超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体预处理任务模板 ID，取值：
<li>10：进行编辑预处理。</li>
注意：如果填0则不进行处理。
    */
    @SerializedName("PreProcessDefinition")
    @Expose
    private Long PreProcessDefinition;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验项目和媒体文件访问权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。 
     * @return SourceType 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。
     * @param SourceType 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 云点播媒资文件 Id，当 SourceType 取值 VOD 或者缺省的时候必填。 
     * @return VodFileId 云点播媒资文件 Id，当 SourceType 取值 VOD 或者缺省的时候必填。
     */
    public String getVodFileId() {
        return this.VodFileId;
    }

    /**
     * Set 云点播媒资文件 Id，当 SourceType 取值 VOD 或者缺省的时候必填。
     * @param VodFileId 云点播媒资文件 Id，当 SourceType 取值 VOD 或者缺省的时候必填。
     */
    public void setVodFileId(String VodFileId) {
        this.VodFileId = VodFileId;
    }

    /**
     * Get 原始媒资文件信息，当 SourceType 取值 EXTERNAL 的时候必填。 
     * @return ExternalMediaInfo 原始媒资文件信息，当 SourceType 取值 EXTERNAL 的时候必填。
     */
    public ExternalMediaInfo getExternalMediaInfo() {
        return this.ExternalMediaInfo;
    }

    /**
     * Set 原始媒资文件信息，当 SourceType 取值 EXTERNAL 的时候必填。
     * @param ExternalMediaInfo 原始媒资文件信息，当 SourceType 取值 EXTERNAL 的时候必填。
     */
    public void setExternalMediaInfo(ExternalMediaInfo ExternalMediaInfo) {
        this.ExternalMediaInfo = ExternalMediaInfo;
    }

    /**
     * Get 媒体名称，不能超过30个字符。 
     * @return Name 媒体名称，不能超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体名称，不能超过30个字符。
     * @param Name 媒体名称，不能超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体预处理任务模板 ID，取值：
<li>10：进行编辑预处理。</li>
注意：如果填0则不进行处理。 
     * @return PreProcessDefinition 媒体预处理任务模板 ID，取值：
<li>10：进行编辑预处理。</li>
注意：如果填0则不进行处理。
     */
    public Long getPreProcessDefinition() {
        return this.PreProcessDefinition;
    }

    /**
     * Set 媒体预处理任务模板 ID，取值：
<li>10：进行编辑预处理。</li>
注意：如果填0则不进行处理。
     * @param PreProcessDefinition 媒体预处理任务模板 ID，取值：
<li>10：进行编辑预处理。</li>
注意：如果填0则不进行处理。
     */
    public void setPreProcessDefinition(Long PreProcessDefinition) {
        this.PreProcessDefinition = PreProcessDefinition;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验项目和媒体文件访问权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验项目和媒体文件访问权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验项目和媒体文件访问权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验项目和媒体文件访问权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ImportMediaToProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMediaToProjectRequest(ImportMediaToProjectRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.VodFileId != null) {
            this.VodFileId = new String(source.VodFileId);
        }
        if (source.ExternalMediaInfo != null) {
            this.ExternalMediaInfo = new ExternalMediaInfo(source.ExternalMediaInfo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PreProcessDefinition != null) {
            this.PreProcessDefinition = new Long(source.PreProcessDefinition);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "VodFileId", this.VodFileId);
        this.setParamObj(map, prefix + "ExternalMediaInfo.", this.ExternalMediaInfo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PreProcessDefinition", this.PreProcessDefinition);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

