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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthInfo extends AbstractModel{

    /**
    * 主体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 应用场景
    */
    @SerializedName("AppScene")
    @Expose
    private Long AppScene;

    /**
    * 应用地域
    */
    @SerializedName("AppRegion")
    @Expose
    private Long AppRegion;

    /**
    * 授权时间
    */
    @SerializedName("AuthPeriod")
    @Expose
    private Long AuthPeriod;

    /**
    * 是否可商业化
    */
    @SerializedName("Commercialization")
    @Expose
    private Long Commercialization;

    /**
    * 是否可跨平台
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 加密后Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 主体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubjectName 主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set 主体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectName 主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 应用场景 
     * @return AppScene 应用场景
     */
    public Long getAppScene() {
        return this.AppScene;
    }

    /**
     * Set 应用场景
     * @param AppScene 应用场景
     */
    public void setAppScene(Long AppScene) {
        this.AppScene = AppScene;
    }

    /**
     * Get 应用地域 
     * @return AppRegion 应用地域
     */
    public Long getAppRegion() {
        return this.AppRegion;
    }

    /**
     * Set 应用地域
     * @param AppRegion 应用地域
     */
    public void setAppRegion(Long AppRegion) {
        this.AppRegion = AppRegion;
    }

    /**
     * Get 授权时间 
     * @return AuthPeriod 授权时间
     */
    public Long getAuthPeriod() {
        return this.AuthPeriod;
    }

    /**
     * Set 授权时间
     * @param AuthPeriod 授权时间
     */
    public void setAuthPeriod(Long AuthPeriod) {
        this.AuthPeriod = AuthPeriod;
    }

    /**
     * Get 是否可商业化 
     * @return Commercialization 是否可商业化
     */
    public Long getCommercialization() {
        return this.Commercialization;
    }

    /**
     * Set 是否可商业化
     * @param Commercialization 是否可商业化
     */
    public void setCommercialization(Long Commercialization) {
        this.Commercialization = Commercialization;
    }

    /**
     * Get 是否可跨平台 
     * @return Platform 是否可跨平台
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 是否可跨平台
     * @param Platform 是否可跨平台
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 加密后Id 
     * @return Id 加密后Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 加密后Id
     * @param Id 加密后Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public AuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthInfo(AuthInfo source) {
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.AppScene != null) {
            this.AppScene = new Long(source.AppScene);
        }
        if (source.AppRegion != null) {
            this.AppRegion = new Long(source.AppRegion);
        }
        if (source.AuthPeriod != null) {
            this.AuthPeriod = new Long(source.AuthPeriod);
        }
        if (source.Commercialization != null) {
            this.Commercialization = new Long(source.Commercialization);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "AppScene", this.AppScene);
        this.setParamSimple(map, prefix + "AppRegion", this.AppRegion);
        this.setParamSimple(map, prefix + "AuthPeriod", this.AuthPeriod);
        this.setParamSimple(map, prefix + "Commercialization", this.Commercialization);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

