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

public class ModifyFunctionReplicaRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 函数 ID。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 需要修改的边缘函数副本名称。
    */
    @SerializedName("ReplicaName")
    @Expose
    private String ReplicaName;

    /**
    * 边缘函数副本内容，当前仅支持 JavaScript 代码，最大支持 5MB。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 边缘函数副本描述。最大支持 50 个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

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
     * Get 需要修改的边缘函数副本名称。 
     * @return ReplicaName 需要修改的边缘函数副本名称。
     */
    public String getReplicaName() {
        return this.ReplicaName;
    }

    /**
     * Set 需要修改的边缘函数副本名称。
     * @param ReplicaName 需要修改的边缘函数副本名称。
     */
    public void setReplicaName(String ReplicaName) {
        this.ReplicaName = ReplicaName;
    }

    /**
     * Get 边缘函数副本内容，当前仅支持 JavaScript 代码，最大支持 5MB。 
     * @return Content 边缘函数副本内容，当前仅支持 JavaScript 代码，最大支持 5MB。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 边缘函数副本内容，当前仅支持 JavaScript 代码，最大支持 5MB。
     * @param Content 边缘函数副本内容，当前仅支持 JavaScript 代码，最大支持 5MB。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 边缘函数副本描述。最大支持 50 个字符。 
     * @return Remark 边缘函数副本描述。最大支持 50 个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 边缘函数副本描述。最大支持 50 个字符。
     * @param Remark 边缘函数副本描述。最大支持 50 个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyFunctionReplicaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionReplicaRequest(ModifyFunctionReplicaRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ReplicaName", this.ReplicaName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

