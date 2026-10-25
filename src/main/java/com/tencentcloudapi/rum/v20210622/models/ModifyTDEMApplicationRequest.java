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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTDEMApplicationRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用名称（可选）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>应用描述（可选）</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>是否排除已忽略错误</p>
    */
    @SerializedName("ExcludeIgnoredErrors")
    @Expose
    private Boolean ExcludeIgnoredErrors;

    /**
    * <p>APM 实例 ID 列表</p>
    */
    @SerializedName("ApmInstanceIds")
    @Expose
    private String [] ApmInstanceIds;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用名称（可选）</p> 
     * @return Name <p>应用名称（可选）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>应用名称（可选）</p>
     * @param Name <p>应用名称（可选）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>应用描述（可选）</p> 
     * @return Desc <p>应用描述（可选）</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>应用描述（可选）</p>
     * @param Desc <p>应用描述（可选）</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>是否排除已忽略错误</p> 
     * @return ExcludeIgnoredErrors <p>是否排除已忽略错误</p>
     */
    public Boolean getExcludeIgnoredErrors() {
        return this.ExcludeIgnoredErrors;
    }

    /**
     * Set <p>是否排除已忽略错误</p>
     * @param ExcludeIgnoredErrors <p>是否排除已忽略错误</p>
     */
    public void setExcludeIgnoredErrors(Boolean ExcludeIgnoredErrors) {
        this.ExcludeIgnoredErrors = ExcludeIgnoredErrors;
    }

    /**
     * Get <p>APM 实例 ID 列表</p> 
     * @return ApmInstanceIds <p>APM 实例 ID 列表</p>
     */
    public String [] getApmInstanceIds() {
        return this.ApmInstanceIds;
    }

    /**
     * Set <p>APM 实例 ID 列表</p>
     * @param ApmInstanceIds <p>APM 实例 ID 列表</p>
     */
    public void setApmInstanceIds(String [] ApmInstanceIds) {
        this.ApmInstanceIds = ApmInstanceIds;
    }

    public ModifyTDEMApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTDEMApplicationRequest(ModifyTDEMApplicationRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ExcludeIgnoredErrors != null) {
            this.ExcludeIgnoredErrors = new Boolean(source.ExcludeIgnoredErrors);
        }
        if (source.ApmInstanceIds != null) {
            this.ApmInstanceIds = new String[source.ApmInstanceIds.length];
            for (int i = 0; i < source.ApmInstanceIds.length; i++) {
                this.ApmInstanceIds[i] = new String(source.ApmInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ExcludeIgnoredErrors", this.ExcludeIgnoredErrors);
        this.setParamArraySimple(map, prefix + "ApmInstanceIds.", this.ApmInstanceIds);

    }
}

