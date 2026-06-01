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

public class FunctionReplica extends AbstractModel {

    /**
    * 函数 ID。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 边缘函数副本名称。
    */
    @SerializedName("ReplicaName")
    @Expose
    private String ReplicaName;

    /**
    * 边缘函数副本内容。格式为 JavaScript 代码。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 边缘函数副本描述。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 边缘函数副本创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 边缘函数副本更新时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get 函数 ID。 
     * @return FunctionId 函数 ID。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID。
     * @param FunctionId 函数 ID。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 边缘函数副本名称。 
     * @return ReplicaName 边缘函数副本名称。
     */
    public String getReplicaName() {
        return this.ReplicaName;
    }

    /**
     * Set 边缘函数副本名称。
     * @param ReplicaName 边缘函数副本名称。
     */
    public void setReplicaName(String ReplicaName) {
        this.ReplicaName = ReplicaName;
    }

    /**
     * Get 边缘函数副本内容。格式为 JavaScript 代码。 
     * @return Content 边缘函数副本内容。格式为 JavaScript 代码。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 边缘函数副本内容。格式为 JavaScript 代码。
     * @param Content 边缘函数副本内容。格式为 JavaScript 代码。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 边缘函数副本描述。 
     * @return Remark 边缘函数副本描述。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 边缘函数副本描述。
     * @param Remark 边缘函数副本描述。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 边缘函数副本创建时间。 
     * @return CreatedOn 边缘函数副本创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 边缘函数副本创建时间。
     * @param CreatedOn 边缘函数副本创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 边缘函数副本更新时间。 
     * @return ModifiedOn 边缘函数副本更新时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 边缘函数副本更新时间。
     * @param ModifiedOn 边缘函数副本更新时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public FunctionReplica() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionReplica(FunctionReplica source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ReplicaName != null) {
            this.ReplicaName = new String(source.ReplicaName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ReplicaName", this.ReplicaName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

