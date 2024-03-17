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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceInterfaceDescription extends AbstractModel {

    /**
    * 契约接口ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 方法名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 路径/接口名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 创建来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 接口名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 契约接口ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 契约接口ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 契约接口ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 契约接口ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 方法名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 方法名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 方法名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 方法名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 路径/接口名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 路径/接口名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径/接口名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 路径/接口名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 创建来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 创建来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 创建来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 创建来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 信息摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revision 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revision 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 接口名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 接口名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 接口名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 接口名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public GovernanceInterfaceDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceInterfaceDescription(GovernanceInterfaceDescription source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

