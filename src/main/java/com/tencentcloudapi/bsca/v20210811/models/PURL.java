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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PURL extends AbstractModel{

    /**
    * 组件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组件所属的类型，如：github, gitlab, generic, deb, rpm, maven 等
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 组件名的前缀名，如github和gitlab的用户名，deb的操作系统，maven包的group id等
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 修饰组件的额外属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qualifiers")
    @Expose
    private Qualifier [] Qualifiers;

    /**
    * 相对于组件包根位置的子目录
    */
    @SerializedName("Subpath")
    @Expose
    private String Subpath;

    /**
    * 组件版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 组件名称 
     * @return Name 组件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组件名称
     * @param Name 组件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组件所属的类型，如：github, gitlab, generic, deb, rpm, maven 等 
     * @return Protocol 组件所属的类型，如：github, gitlab, generic, deb, rpm, maven 等
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 组件所属的类型，如：github, gitlab, generic, deb, rpm, maven 等
     * @param Protocol 组件所属的类型，如：github, gitlab, generic, deb, rpm, maven 等
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 组件名的前缀名，如github和gitlab的用户名，deb的操作系统，maven包的group id等 
     * @return Namespace 组件名的前缀名，如github和gitlab的用户名，deb的操作系统，maven包的group id等
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 组件名的前缀名，如github和gitlab的用户名，deb的操作系统，maven包的group id等
     * @param Namespace 组件名的前缀名，如github和gitlab的用户名，deb的操作系统，maven包的group id等
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 修饰组件的额外属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qualifiers 修饰组件的额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Qualifier [] getQualifiers() {
        return this.Qualifiers;
    }

    /**
     * Set 修饰组件的额外属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qualifiers 修饰组件的额外属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualifiers(Qualifier [] Qualifiers) {
        this.Qualifiers = Qualifiers;
    }

    /**
     * Get 相对于组件包根位置的子目录 
     * @return Subpath 相对于组件包根位置的子目录
     */
    public String getSubpath() {
        return this.Subpath;
    }

    /**
     * Set 相对于组件包根位置的子目录
     * @param Subpath 相对于组件包根位置的子目录
     */
    public void setSubpath(String Subpath) {
        this.Subpath = Subpath;
    }

    /**
     * Get 组件版本号 
     * @return Version 组件版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 组件版本号
     * @param Version 组件版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public PURL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PURL(PURL source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifiers != null) {
            this.Qualifiers = new Qualifier[source.Qualifiers.length];
            for (int i = 0; i < source.Qualifiers.length; i++) {
                this.Qualifiers[i] = new Qualifier(source.Qualifiers[i]);
            }
        }
        if (source.Subpath != null) {
            this.Subpath = new String(source.Subpath);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Qualifiers.", this.Qualifiers);
        this.setParamSimple(map, prefix + "Subpath", this.Subpath);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

