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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeSchemaMapping extends AbstractModel {

    /**
    * 任务节点的源schema id
    */
    @SerializedName("SourceSchemaId")
    @Expose
    private String SourceSchemaId;

    /**
    * 任务节点目标schema id
    */
    @SerializedName("SinkSchemaId")
    @Expose
    private String SinkSchemaId;

    /**
     * Get 任务节点的源schema id 
     * @return SourceSchemaId 任务节点的源schema id
     */
    public String getSourceSchemaId() {
        return this.SourceSchemaId;
    }

    /**
     * Set 任务节点的源schema id
     * @param SourceSchemaId 任务节点的源schema id
     */
    public void setSourceSchemaId(String SourceSchemaId) {
        this.SourceSchemaId = SourceSchemaId;
    }

    /**
     * Get 任务节点目标schema id 
     * @return SinkSchemaId 任务节点目标schema id
     */
    public String getSinkSchemaId() {
        return this.SinkSchemaId;
    }

    /**
     * Set 任务节点目标schema id
     * @param SinkSchemaId 任务节点目标schema id
     */
    public void setSinkSchemaId(String SinkSchemaId) {
        this.SinkSchemaId = SinkSchemaId;
    }

    public IntegrationNodeSchemaMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeSchemaMapping(IntegrationNodeSchemaMapping source) {
        if (source.SourceSchemaId != null) {
            this.SourceSchemaId = new String(source.SourceSchemaId);
        }
        if (source.SinkSchemaId != null) {
            this.SinkSchemaId = new String(source.SinkSchemaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceSchemaId", this.SourceSchemaId);
        this.setParamSimple(map, prefix + "SinkSchemaId", this.SinkSchemaId);

    }
}

