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

public class ModifyMaterialRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 要修改的媒体 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 媒体归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 媒体名称，不能超过30个字符，不填则不修改。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体分类路径，例如填写"/a/b"，则代表该媒体存储的路径为"/a/b"。若修改分类路径，则 Owner 字段必填。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以修改任意媒体的信息。如果指定操作者，则操作者必须对媒体有写权限。
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
     * Get 要修改的媒体 Id。 
     * @return MaterialId 要修改的媒体 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 要修改的媒体 Id。
     * @param MaterialId 要修改的媒体 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 媒体归属者。 
     * @return Owner 媒体归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 媒体归属者。
     * @param Owner 媒体归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 媒体名称，不能超过30个字符，不填则不修改。 
     * @return Name 媒体名称，不能超过30个字符，不填则不修改。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体名称，不能超过30个字符，不填则不修改。
     * @param Name 媒体名称，不能超过30个字符，不填则不修改。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体分类路径，例如填写"/a/b"，则代表该媒体存储的路径为"/a/b"。若修改分类路径，则 Owner 字段必填。 
     * @return ClassPath 媒体分类路径，例如填写"/a/b"，则代表该媒体存储的路径为"/a/b"。若修改分类路径，则 Owner 字段必填。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体分类路径，例如填写"/a/b"，则代表该媒体存储的路径为"/a/b"。若修改分类路径，则 Owner 字段必填。
     * @param ClassPath 媒体分类路径，例如填写"/a/b"，则代表该媒体存储的路径为"/a/b"。若修改分类路径，则 Owner 字段必填。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以修改任意媒体的信息。如果指定操作者，则操作者必须对媒体有写权限。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以修改任意媒体的信息。如果指定操作者，则操作者必须对媒体有写权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以修改任意媒体的信息。如果指定操作者，则操作者必须对媒体有写权限。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以修改任意媒体的信息。如果指定操作者，则操作者必须对媒体有写权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ModifyMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMaterialRequest(ModifyMaterialRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
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
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

