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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportCommonApplicationRequest extends AbstractModel {

    /**
    * <p>公共应用ID</p>
    */
    @SerializedName("CommonAppUuid")
    @Expose
    private String CommonAppUuid;

    /**
    * <p>公共应用重命名</p>
    */
    @SerializedName("CommonAppNewName")
    @Expose
    private String CommonAppNewName;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>公共应用类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>NEXTFLOW版本</p>
    */
    @SerializedName("NextflowVersion")
    @Expose
    private String NextflowVersion;

    /**
    * <p>是否内部应用</p>
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
     * Get <p>公共应用ID</p> 
     * @return CommonAppUuid <p>公共应用ID</p>
     */
    public String getCommonAppUuid() {
        return this.CommonAppUuid;
    }

    /**
     * Set <p>公共应用ID</p>
     * @param CommonAppUuid <p>公共应用ID</p>
     */
    public void setCommonAppUuid(String CommonAppUuid) {
        this.CommonAppUuid = CommonAppUuid;
    }

    /**
     * Get <p>公共应用重命名</p> 
     * @return CommonAppNewName <p>公共应用重命名</p>
     */
    public String getCommonAppNewName() {
        return this.CommonAppNewName;
    }

    /**
     * Set <p>公共应用重命名</p>
     * @param CommonAppNewName <p>公共应用重命名</p>
     */
    public void setCommonAppNewName(String CommonAppNewName) {
        this.CommonAppNewName = CommonAppNewName;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>公共应用类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul> 
     * @return Type <p>公共应用类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>公共应用类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
     * @param Type <p>公共应用类型</p><p>枚举值：</p><ul><li>WDL： WDL</li><li>NEXTFLOW： NEXTFLOW</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>NEXTFLOW版本</p> 
     * @return NextflowVersion <p>NEXTFLOW版本</p>
     */
    public String getNextflowVersion() {
        return this.NextflowVersion;
    }

    /**
     * Set <p>NEXTFLOW版本</p>
     * @param NextflowVersion <p>NEXTFLOW版本</p>
     */
    public void setNextflowVersion(String NextflowVersion) {
        this.NextflowVersion = NextflowVersion;
    }

    /**
     * Get <p>是否内部应用</p> 
     * @return Internal <p>是否内部应用</p>
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set <p>是否内部应用</p>
     * @param Internal <p>是否内部应用</p>
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    public ImportCommonApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportCommonApplicationRequest(ImportCommonApplicationRequest source) {
        if (source.CommonAppUuid != null) {
            this.CommonAppUuid = new String(source.CommonAppUuid);
        }
        if (source.CommonAppNewName != null) {
            this.CommonAppNewName = new String(source.CommonAppNewName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NextflowVersion != null) {
            this.NextflowVersion = new String(source.NextflowVersion);
        }
        if (source.Internal != null) {
            this.Internal = new Boolean(source.Internal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommonAppUuid", this.CommonAppUuid);
        this.setParamSimple(map, prefix + "CommonAppNewName", this.CommonAppNewName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NextflowVersion", this.NextflowVersion);
        this.setParamSimple(map, prefix + "Internal", this.Internal);

    }
}

