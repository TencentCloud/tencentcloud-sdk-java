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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelVersionDetail extends AbstractModel {

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
    */
    @SerializedName("CheckResult")
    @Expose
    private Long CheckResult;

    /**
    * 型号各个配置项的详情
    */
    @SerializedName("OptionSet")
    @Expose
    private TemplateOption [] OptionSet;

    /**
    * 设备型号名称及版本
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准 
     * @return CheckResult 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
     */
    public Long getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
     * @param CheckResult 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
     */
    public void setCheckResult(Long CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get 型号各个配置项的详情 
     * @return OptionSet 型号各个配置项的详情
     */
    public TemplateOption [] getOptionSet() {
        return this.OptionSet;
    }

    /**
     * Set 型号各个配置项的详情
     * @param OptionSet 型号各个配置项的详情
     */
    public void setOptionSet(TemplateOption [] OptionSet) {
        this.OptionSet = OptionSet;
    }

    /**
     * Get 设备型号名称及版本 
     * @return ModelVersion 设备型号名称及版本
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 设备型号名称及版本
     * @param ModelVersion 设备型号名称及版本
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    public ModelVersionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelVersionDetail(ModelVersionDetail source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new Long(source.CheckResult);
        }
        if (source.OptionSet != null) {
            this.OptionSet = new TemplateOption[source.OptionSet.length];
            for (int i = 0; i < source.OptionSet.length; i++) {
                this.OptionSet[i] = new TemplateOption(source.OptionSet[i]);
            }
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamArrayObj(map, prefix + "OptionSet.", this.OptionSet);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);

    }
}

