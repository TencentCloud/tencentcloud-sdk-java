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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportZoneConfigRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置内容可通过站点配置导出接口（ExportZoneConfig）获取。您可以单独导入「站点加速-全局加速配置」或「站点加速-规则引擎」，传入对应的字段即可，详情可以参考下方示例。<br>注意：ExportZoneConfig 导出的 AccelerationDomain（加速域名配置）、Origin（源站配置）暂不支持通过本接口导入，若 Content 中包含上述配置内容，将导致导入失败。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置内容可通过站点配置导出接口（ExportZoneConfig）获取。您可以单独导入「站点加速-全局加速配置」或「站点加速-规则引擎」，传入对应的字段即可，详情可以参考下方示例。<br>注意：ExportZoneConfig 导出的 AccelerationDomain（加速域名配置）、Origin（源站配置）暂不支持通过本接口导入，若 Content 中包含上述配置内容，将导致导入失败。</p> 
     * @return Content <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置内容可通过站点配置导出接口（ExportZoneConfig）获取。您可以单独导入「站点加速-全局加速配置」或「站点加速-规则引擎」，传入对应的字段即可，详情可以参考下方示例。<br>注意：ExportZoneConfig 导出的 AccelerationDomain（加速域名配置）、Origin（源站配置）暂不支持通过本接口导入，若 Content 中包含上述配置内容，将导致导入失败。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置内容可通过站点配置导出接口（ExportZoneConfig）获取。您可以单独导入「站点加速-全局加速配置」或「站点加速-规则引擎」，传入对应的字段即可，详情可以参考下方示例。<br>注意：ExportZoneConfig 导出的 AccelerationDomain（加速域名配置）、Origin（源站配置）暂不支持通过本接口导入，若 Content 中包含上述配置内容，将导致导入失败。</p>
     * @param Content <p>待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置内容可通过站点配置导出接口（ExportZoneConfig）获取。您可以单独导入「站点加速-全局加速配置」或「站点加速-规则引擎」，传入对应的字段即可，详情可以参考下方示例。<br>注意：ExportZoneConfig 导出的 AccelerationDomain（加速域名配置）、Origin（源站配置）暂不支持通过本接口导入，若 Content 中包含上述配置内容，将导致导入失败。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ImportZoneConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportZoneConfigRequest(ImportZoneConfigRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

