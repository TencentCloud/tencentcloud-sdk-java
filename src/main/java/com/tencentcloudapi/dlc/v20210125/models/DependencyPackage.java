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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependencyPackage extends AbstractModel {

    /**
    * 依赖包类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageSource")
    @Expose
    private String PackageSource;

    /**
    * 依赖包信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MavenPackage")
    @Expose
    private String MavenPackage;

    /**
    * 依赖包仓库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MavenRepository")
    @Expose
    private String MavenRepository;

    /**
    * maven包exclusion信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MavenExclusion")
    @Expose
    private String MavenExclusion;

    /**
    * pypi包信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PypiPackage")
    @Expose
    private String PypiPackage;

    /**
    * pypi索引地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PypiIndexUrl")
    @Expose
    private String PypiIndexUrl;

    /**
    * 文件包的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 文件包的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackagePath")
    @Expose
    private String PackagePath;

    /**
     * Get 依赖包类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageSource 依赖包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageSource() {
        return this.PackageSource;
    }

    /**
     * Set 依赖包类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageSource 依赖包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageSource(String PackageSource) {
        this.PackageSource = PackageSource;
    }

    /**
     * Get 依赖包信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MavenPackage 依赖包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMavenPackage() {
        return this.MavenPackage;
    }

    /**
     * Set 依赖包信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MavenPackage 依赖包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMavenPackage(String MavenPackage) {
        this.MavenPackage = MavenPackage;
    }

    /**
     * Get 依赖包仓库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MavenRepository 依赖包仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMavenRepository() {
        return this.MavenRepository;
    }

    /**
     * Set 依赖包仓库
注意：此字段可能返回 null，表示取不到有效值。
     * @param MavenRepository 依赖包仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMavenRepository(String MavenRepository) {
        this.MavenRepository = MavenRepository;
    }

    /**
     * Get maven包exclusion信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MavenExclusion maven包exclusion信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMavenExclusion() {
        return this.MavenExclusion;
    }

    /**
     * Set maven包exclusion信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MavenExclusion maven包exclusion信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMavenExclusion(String MavenExclusion) {
        this.MavenExclusion = MavenExclusion;
    }

    /**
     * Get pypi包信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PypiPackage pypi包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPypiPackage() {
        return this.PypiPackage;
    }

    /**
     * Set pypi包信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PypiPackage pypi包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPypiPackage(String PypiPackage) {
        this.PypiPackage = PypiPackage;
    }

    /**
     * Get pypi索引地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PypiIndexUrl pypi索引地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPypiIndexUrl() {
        return this.PypiIndexUrl;
    }

    /**
     * Set pypi索引地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PypiIndexUrl pypi索引地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPypiIndexUrl(String PypiIndexUrl) {
        this.PypiIndexUrl = PypiIndexUrl;
    }

    /**
     * Get 文件包的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 文件包的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 文件包的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 文件包的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 文件包的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackagePath 文件包的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackagePath() {
        return this.PackagePath;
    }

    /**
     * Set 文件包的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackagePath 文件包的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackagePath(String PackagePath) {
        this.PackagePath = PackagePath;
    }

    public DependencyPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyPackage(DependencyPackage source) {
        if (source.PackageSource != null) {
            this.PackageSource = new String(source.PackageSource);
        }
        if (source.MavenPackage != null) {
            this.MavenPackage = new String(source.MavenPackage);
        }
        if (source.MavenRepository != null) {
            this.MavenRepository = new String(source.MavenRepository);
        }
        if (source.MavenExclusion != null) {
            this.MavenExclusion = new String(source.MavenExclusion);
        }
        if (source.PypiPackage != null) {
            this.PypiPackage = new String(source.PypiPackage);
        }
        if (source.PypiIndexUrl != null) {
            this.PypiIndexUrl = new String(source.PypiIndexUrl);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackagePath != null) {
            this.PackagePath = new String(source.PackagePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageSource", this.PackageSource);
        this.setParamSimple(map, prefix + "MavenPackage", this.MavenPackage);
        this.setParamSimple(map, prefix + "MavenRepository", this.MavenRepository);
        this.setParamSimple(map, prefix + "MavenExclusion", this.MavenExclusion);
        this.setParamSimple(map, prefix + "PypiPackage", this.PypiPackage);
        this.setParamSimple(map, prefix + "PypiIndexUrl", this.PypiIndexUrl);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackagePath", this.PackagePath);

    }
}

