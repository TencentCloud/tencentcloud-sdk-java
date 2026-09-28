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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildArtifactInfo extends AbstractModel {

    /**
    * <p>产物类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>产物名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>产物状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>扩展详情 Json</p>
    */
    @SerializedName("ContentJson")
    @Expose
    private String ContentJson;

    /**
     * Get <p>产物类型</p> 
     * @return Type <p>产物类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>产物类型</p>
     * @param Type <p>产物类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>产物名称</p> 
     * @return Name <p>产物名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>产物名称</p>
     * @param Name <p>产物名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>产物状态</p> 
     * @return Status <p>产物状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>产物状态</p>
     * @param Status <p>产物状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>扩展详情 Json</p> 
     * @return ContentJson <p>扩展详情 Json</p>
     */
    public String getContentJson() {
        return this.ContentJson;
    }

    /**
     * Set <p>扩展详情 Json</p>
     * @param ContentJson <p>扩展详情 Json</p>
     */
    public void setContentJson(String ContentJson) {
        this.ContentJson = ContentJson;
    }

    public BuildArtifactInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildArtifactInfo(BuildArtifactInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ContentJson != null) {
            this.ContentJson = new String(source.ContentJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ContentJson", this.ContentJson);

    }
}

