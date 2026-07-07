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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyRefComplianceInfo extends AbstractModel {

    /**
    * <p>识别模板ID</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * <p>识别模板名称</p>
    */
    @SerializedName("ComplianceName")
    @Expose
    private String ComplianceName;

    /**
    * <p>识别模板类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
    */
    @SerializedName("ComplianceType")
    @Expose
    private Long ComplianceType;

    /**
     * Get <p>识别模板ID</p> 
     * @return ComplianceId <p>识别模板ID</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>识别模板ID</p>
     * @param ComplianceId <p>识别模板ID</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get <p>识别模板名称</p> 
     * @return ComplianceName <p>识别模板名称</p>
     */
    public String getComplianceName() {
        return this.ComplianceName;
    }

    /**
     * Set <p>识别模板名称</p>
     * @param ComplianceName <p>识别模板名称</p>
     */
    public void setComplianceName(String ComplianceName) {
        this.ComplianceName = ComplianceName;
    }

    /**
     * Get <p>识别模板类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul> 
     * @return ComplianceType <p>识别模板类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public Long getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set <p>识别模板类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     * @param ComplianceType <p>识别模板类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public void setComplianceType(Long ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    public DspmIdentifyRefComplianceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyRefComplianceInfo(DspmIdentifyRefComplianceInfo source) {
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.ComplianceName != null) {
            this.ComplianceName = new String(source.ComplianceName);
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new Long(source.ComplianceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "ComplianceName", this.ComplianceName);
        this.setParamSimple(map, prefix + "ComplianceType", this.ComplianceType);

    }
}

