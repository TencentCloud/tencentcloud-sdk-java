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

public class ImportMaterialRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 媒体归属者，可支持归属团队或个人。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 媒体名称，不能超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。另外，导入云点播的文件，使用云点播的子应用 Id 必须与创建多媒体创作引擎平台时使用的云点播子应用一致。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 云点播媒资 FileId，仅当 SourceType 为 VOD 时有效。
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
    * 媒体分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 媒体预处理任务参数 ID。可取值有：
<li>10：进行编辑预处理。</li>
    */
    @SerializedName("PreProcessDefinition")
    @Expose
    private Long PreProcessDefinition;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向任意团队或者个人导入媒体。如果指定操作者，如果媒体归属为个人，则操作者必须与归属者一致；如果媒体归属为团队，则必须为团队可导入媒体的团队成员(如果没有特殊设置，所有团队成员可导入媒体)。
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
     * Get 媒体归属者，可支持归属团队或个人。 
     * @return Owner 媒体归属者，可支持归属团队或个人。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 媒体归属者，可支持归属团队或个人。
     * @param Owner 媒体归属者，可支持归属团队或个人。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
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
     * Get 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。另外，导入云点播的文件，使用云点播的子应用 Id 必须与创建多媒体创作引擎平台时使用的云点播子应用一致。 
     * @return SourceType 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。另外，导入云点播的文件，使用云点播的子应用 Id 必须与创建多媒体创作引擎平台时使用的云点播子应用一致。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。另外，导入云点播的文件，使用云点播的子应用 Id 必须与创建多媒体创作引擎平台时使用的云点播子应用一致。
     * @param SourceType 导入媒资类型，取值：
<li>VOD：云点播文件；</li>
<li>EXTERNAL：媒资绑定。</li>

注意：如果不填默认为云点播文件，如果媒体存储在非腾讯云点播中，都需要使用媒资绑定。另外，导入云点播的文件，使用云点播的子应用 Id 必须与创建多媒体创作引擎平台时使用的云点播子应用一致。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 云点播媒资 FileId，仅当 SourceType 为 VOD 时有效。 
     * @return VodFileId 云点播媒资 FileId，仅当 SourceType 为 VOD 时有效。
     */
    public String getVodFileId() {
        return this.VodFileId;
    }

    /**
     * Set 云点播媒资 FileId，仅当 SourceType 为 VOD 时有效。
     * @param VodFileId 云点播媒资 FileId，仅当 SourceType 为 VOD 时有效。
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
     * Get 媒体分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。 
     * @return ClassPath 媒体分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
     * @param ClassPath 媒体分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 媒体预处理任务参数 ID。可取值有：
<li>10：进行编辑预处理。</li> 
     * @return PreProcessDefinition 媒体预处理任务参数 ID。可取值有：
<li>10：进行编辑预处理。</li>
     */
    public Long getPreProcessDefinition() {
        return this.PreProcessDefinition;
    }

    /**
     * Set 媒体预处理任务参数 ID。可取值有：
<li>10：进行编辑预处理。</li>
     * @param PreProcessDefinition 媒体预处理任务参数 ID。可取值有：
<li>10：进行编辑预处理。</li>
     */
    public void setPreProcessDefinition(Long PreProcessDefinition) {
        this.PreProcessDefinition = PreProcessDefinition;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向任意团队或者个人导入媒体。如果指定操作者，如果媒体归属为个人，则操作者必须与归属者一致；如果媒体归属为团队，则必须为团队可导入媒体的团队成员(如果没有特殊设置，所有团队成员可导入媒体)。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向任意团队或者个人导入媒体。如果指定操作者，如果媒体归属为个人，则操作者必须与归属者一致；如果媒体归属为团队，则必须为团队可导入媒体的团队成员(如果没有特殊设置，所有团队成员可导入媒体)。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向任意团队或者个人导入媒体。如果指定操作者，如果媒体归属为个人，则操作者必须与归属者一致；如果媒体归属为团队，则必须为团队可导入媒体的团队成员(如果没有特殊设置，所有团队成员可导入媒体)。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以向任意团队或者个人导入媒体。如果指定操作者，如果媒体归属为个人，则操作者必须与归属者一致；如果媒体归属为团队，则必须为团队可导入媒体的团队成员(如果没有特殊设置，所有团队成员可导入媒体)。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ImportMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMaterialRequest(ImportMaterialRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
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
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "VodFileId", this.VodFileId);
        this.setParamObj(map, prefix + "ExternalMediaInfo.", this.ExternalMediaInfo);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamSimple(map, prefix + "PreProcessDefinition", this.PreProcessDefinition);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

