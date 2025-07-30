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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamTemplateInfo extends AbstractModel {

    /**
    * 参数模板 ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 参数模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数模板描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 实例引擎版本，值为：5.5、5.6、5.7、8.0。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 参数模板类型，值为：HIGH_STABILITY、HIGH_PERFORMANCE。
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * 参数模板引擎，值为：InnoDB、RocksDB。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get 参数模板 ID 
     * @return TemplateId 参数模板 ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 参数模板 ID
     * @param TemplateId 参数模板 ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 参数模板名称 
     * @return Name 参数模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数模板名称
     * @param Name 参数模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数模板描述 
     * @return Description 参数模板描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数模板描述
     * @param Description 参数模板描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 实例引擎版本，值为：5.5、5.6、5.7、8.0。 
     * @return EngineVersion 实例引擎版本，值为：5.5、5.6、5.7、8.0。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 实例引擎版本，值为：5.5、5.6、5.7、8.0。
     * @param EngineVersion 实例引擎版本，值为：5.5、5.6、5.7、8.0。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 参数模板类型，值为：HIGH_STABILITY、HIGH_PERFORMANCE。 
     * @return TemplateType 参数模板类型，值为：HIGH_STABILITY、HIGH_PERFORMANCE。
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 参数模板类型，值为：HIGH_STABILITY、HIGH_PERFORMANCE。
     * @param TemplateType 参数模板类型，值为：HIGH_STABILITY、HIGH_PERFORMANCE。
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 参数模板引擎，值为：InnoDB、RocksDB。 
     * @return EngineType 参数模板引擎，值为：InnoDB、RocksDB。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 参数模板引擎，值为：InnoDB、RocksDB。
     * @param EngineType 参数模板引擎，值为：InnoDB、RocksDB。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public ParamTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamTemplateInfo(ParamTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

