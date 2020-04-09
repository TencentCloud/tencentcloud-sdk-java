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
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 云点播媒资 FileId。
    */
    @SerializedName("VodFileId")
    @Expose
    private String VodFileId;

    /**
    * 素材归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 素材名称，不能超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 素材分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 素材标签，单个标签长度不能超过10，数组长度不能超过10。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 素材预处理任务模板 ID。取值：
<li>10：进行编辑预处理。</li>
    */
    @SerializedName("PreProcessDefinition")
    @Expose
    private Long PreProcessDefinition;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
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
     * Get 云点播媒资 FileId。 
     * @return VodFileId 云点播媒资 FileId。
     */
    public String getVodFileId() {
        return this.VodFileId;
    }

    /**
     * Set 云点播媒资 FileId。
     * @param VodFileId 云点播媒资 FileId。
     */
    public void setVodFileId(String VodFileId) {
        this.VodFileId = VodFileId;
    }

    /**
     * Get 素材归属者。 
     * @return Owner 素材归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 素材归属者。
     * @param Owner 素材归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 素材名称，不能超过30个字符。 
     * @return Name 素材名称，不能超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 素材名称，不能超过30个字符。
     * @param Name 素材名称，不能超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 素材分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。 
     * @return ClassPath 素材分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 素材分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
     * @param ClassPath 素材分类路径，形如："/a/b"，层级数不能超过10，每个层级长度不能超过15字符。若不填则默认为根路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 素材标签，单个标签长度不能超过10，数组长度不能超过10。 
     * @return Tags 素材标签，单个标签长度不能超过10，数组长度不能超过10。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 素材标签，单个标签长度不能超过10，数组长度不能超过10。
     * @param Tags 素材标签，单个标签长度不能超过10，数组长度不能超过10。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 素材预处理任务模板 ID。取值：
<li>10：进行编辑预处理。</li> 
     * @return PreProcessDefinition 素材预处理任务模板 ID。取值：
<li>10：进行编辑预处理。</li>
     */
    public Long getPreProcessDefinition() {
        return this.PreProcessDefinition;
    }

    /**
     * Set 素材预处理任务模板 ID。取值：
<li>10：进行编辑预处理。</li>
     * @param PreProcessDefinition 素材预处理任务模板 ID。取值：
<li>10：进行编辑预处理。</li>
     */
    public void setPreProcessDefinition(Long PreProcessDefinition) {
        this.PreProcessDefinition = PreProcessDefinition;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验操作权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "VodFileId", this.VodFileId);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PreProcessDefinition", this.PreProcessDefinition);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

