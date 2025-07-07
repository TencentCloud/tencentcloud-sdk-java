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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaTaskResult extends AbstractModel {

    /**
    * 任务结果。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 结果描述。
    */
    @SerializedName("ResultDescription")
    @Expose
    private String ResultDescription;

    /**
    * 资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
     * Get 任务结果。 
     * @return Result 任务结果。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 任务结果。
     * @param Result 任务结果。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 结果描述。 
     * @return ResultDescription 结果描述。
     */
    public String getResultDescription() {
        return this.ResultDescription;
    }

    /**
     * Set 结果描述。
     * @param ResultDescription 结果描述。
     */
    public void setResultDescription(String ResultDescription) {
        this.ResultDescription = ResultDescription;
    }

    /**
     * Get 资源ID。 
     * @return ResourceId 资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID。
     * @param ResourceId 资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型。 
     * @return MetaType 资源类型。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 资源类型。
     * @param MetaType 资源类型。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    public DspaTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaTaskResult(DspaTaskResult source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ResultDescription != null) {
            this.ResultDescription = new String(source.ResultDescription);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ResultDescription", this.ResultDescription);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);

    }
}

