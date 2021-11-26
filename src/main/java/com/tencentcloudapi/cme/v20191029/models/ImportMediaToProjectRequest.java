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
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
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
    * 媒体名称，不能超过30个字符。如果不填，则媒体名称为点播媒资文件名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体预处理配置 ID，取值：
<li>10：进行视频编辑预处理。</li>

注意：如果填0或者不填则不进行处理，如果原始视频不可在浏览器直接播放将无法在编辑页面编辑。
    */
    @SerializedName("PreProcessDefinition")
    @Expose
    private Long PreProcessDefinition;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向所有视频编辑项目导入媒体；如果指定操作者，则操作者必须为项目所有者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
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
     * Get 媒体名称，不能超过30个字符。如果不填，则媒体名称为点播媒资文件名称。 
     * @return Name 媒体名称，不能超过30个字符。如果不填，则媒体名称为点播媒资文件名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体名称，不能超过30个字符。如果不填，则媒体名称为点播媒资文件名称。
     * @param Name 媒体名称，不能超过30个字符。如果不填，则媒体名称为点播媒资文件名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体预处理配置 ID，取值：
<li>10：进行视频编辑预处理。</li>

注意：如果填0或者不填则不进行处理，如果原始视频不可在浏览器直接播放将无法在编辑页面编辑。 
     * @return PreProcessDefinition 媒体预处理配置 ID，取值：
<li>10：进行视频编辑预处理。</li>

注意：如果填0或者不填则不进行处理，如果原始视频不可在浏览器直接播放将无法在编辑页面编辑。
     */
    public Long getPreProcessDefinition() {
        return this.PreProcessDefinition;
    }

    /**
     * Set 媒体预处理配置 ID，取值：
<li>10：进行视频编辑预处理。</li>

注意：如果填0或者不填则不进行处理，如果原始视频不可在浏览器直接播放将无法在编辑页面编辑。
     * @param PreProcessDefinition 媒体预处理配置 ID，取值：
<li>10：进行视频编辑预处理。</li>

注意：如果填0或者不填则不进行处理，如果原始视频不可在浏览器直接播放将无法在编辑页面编辑。
     */
    public void setPreProcessDefinition(Long PreProcessDefinition) {
        this.PreProcessDefinition = PreProcessDefinition;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向所有视频编辑项目导入媒体；如果指定操作者，则操作者必须为项目所有者。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向所有视频编辑项目导入媒体；如果指定操作者，则操作者必须为项目所有者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向所有视频编辑项目导入媒体；如果指定操作者，则操作者必须为项目所有者。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向所有视频编辑项目导入媒体；如果指定操作者，则操作者必须为项目所有者。
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

