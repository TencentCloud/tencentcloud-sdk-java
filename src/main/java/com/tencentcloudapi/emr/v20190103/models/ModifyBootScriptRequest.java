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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBootScriptRequest extends AbstractModel {

    /**
    * EMR实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 引导脚本类型,resourceAfter,clusterAfter,clusterBefore
    */
    @SerializedName("BootType")
    @Expose
    private String BootType;

    /**
    * 引导脚本的具体变更，如为空表示WhenRun时机无引导脚本
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSetting [] PreExecutedFileSettings;

    /**
     * Get EMR实例Id 
     * @return InstanceId EMR实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR实例Id
     * @param InstanceId EMR实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 引导脚本类型,resourceAfter,clusterAfter,clusterBefore 
     * @return BootType 引导脚本类型,resourceAfter,clusterAfter,clusterBefore
     */
    public String getBootType() {
        return this.BootType;
    }

    /**
     * Set 引导脚本类型,resourceAfter,clusterAfter,clusterBefore
     * @param BootType 引导脚本类型,resourceAfter,clusterAfter,clusterBefore
     */
    public void setBootType(String BootType) {
        this.BootType = BootType;
    }

    /**
     * Get 引导脚本的具体变更，如为空表示WhenRun时机无引导脚本 
     * @return PreExecutedFileSettings 引导脚本的具体变更，如为空表示WhenRun时机无引导脚本
     */
    public PreExecuteFileSetting [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set 引导脚本的具体变更，如为空表示WhenRun时机无引导脚本
     * @param PreExecutedFileSettings 引导脚本的具体变更，如为空表示WhenRun时机无引导脚本
     */
    public void setPreExecutedFileSettings(PreExecuteFileSetting [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    public ModifyBootScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBootScriptRequest(ModifyBootScriptRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BootType != null) {
            this.BootType = new String(source.BootType);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSetting[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSetting(source.PreExecutedFileSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BootType", this.BootType);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);

    }
}

