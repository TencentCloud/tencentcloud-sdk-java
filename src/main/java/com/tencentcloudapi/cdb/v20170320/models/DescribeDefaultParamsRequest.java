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

public class DescribeDefaultParamsRequest extends AbstractModel {

    /**
    * 引擎版本，目前支持 ["5.1", "5.5", "5.6", "5.7", "8.0"]。
说明：引擎版本为必填。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。默认值为：HIGH_STABILITY。
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * 参数模板引擎，默认值：InnoDB，可取值：InnoDB、RocksDB。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get 引擎版本，目前支持 ["5.1", "5.5", "5.6", "5.7", "8.0"]。
说明：引擎版本为必填。 
     * @return EngineVersion 引擎版本，目前支持 ["5.1", "5.5", "5.6", "5.7", "8.0"]。
说明：引擎版本为必填。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本，目前支持 ["5.1", "5.5", "5.6", "5.7", "8.0"]。
说明：引擎版本为必填。
     * @param EngineVersion 引擎版本，目前支持 ["5.1", "5.5", "5.6", "5.7", "8.0"]。
说明：引擎版本为必填。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。默认值为：HIGH_STABILITY。 
     * @return TemplateType 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。默认值为：HIGH_STABILITY。
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。默认值为：HIGH_STABILITY。
     * @param TemplateType 默认参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。默认值为：HIGH_STABILITY。
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 参数模板引擎，默认值：InnoDB，可取值：InnoDB、RocksDB。 
     * @return EngineType 参数模板引擎，默认值：InnoDB，可取值：InnoDB、RocksDB。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 参数模板引擎，默认值：InnoDB，可取值：InnoDB、RocksDB。
     * @param EngineType 参数模板引擎，默认值：InnoDB，可取值：InnoDB、RocksDB。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public DescribeDefaultParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefaultParamsRequest(DescribeDefaultParamsRequest source) {
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
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

